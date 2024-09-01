package com.techJavaBase;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class employeeMain {
    public static void main(String[] args) {
        // Get the SessionFactory
        SessionFactory sf = HibernateUtil.getSessionFactory();

        // Open a session
        Session session = sf.openSession();

        // Begin a transaction
        Transaction tx = session.beginTransaction();

        /*Employee e = new Employee();
        e.setEmpId(103);       
        e.setEmpName("Ram");
        e.setSalary(70000.00);

        session.save(e);*/
       // to get data single data
       /*Employee e= session.get(Employee.class, 103);
System.out.println(e.getEmpId());
System.out.println(e.getEmpName());
System.out.println(e.getSalary());*/

//to get multiple data
    /* Query q =  session.createQuery("from Employee");
    List<Employee> list= q.list();
      for(Employee e:list)
      {
    	  System.out.println(e.getEmpId());
    	  System.out.println(e.getEmpName());
          System.out.println(e.getSalary());
System.out.println("-------------------------------");
      }*/
        
     /*set data to update data
      *    Employee e= session.get(Employee.class,102);
        e.setEmpName("Mohini");
        e.setSalary(800000.00);
        
        session.update(e);*/
  //  delete data
            Employee e= session.get(Employee.class,102);
                 session.delete(e);
        //to delete whole data
                 Query q=session.createQuery("delete from employee");
                 q.executeUpdate();
    
         tx.commit();

        session.close();
        sf.close();
        System.out.println("employee added successfully");
    }
}
