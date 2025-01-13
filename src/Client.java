/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rudrapadmanabhan
 */

import java.io.*;

public class Client {
    
    Customer customer = new Customer();
    public void saveData()
    {
        try
        {
            FileOutputStream file = new FileOutputStream("Client.txt");
            ObjectOutputStream info = new ObjectOutputStream(file);
            info.writeObject(customer);
            info.close();
            file.close();
    }
        catch(Exception ex)
        {output(ex.toString());}
        
    }
    public void loadData()
    {
      try 
      {
          FileInputStream file = new FileInputStream("Client.dat");
          ObjectInputStream info = new ObjectInputStream(file);
          customer = (Customer)info.readObject();
          info.close();
          file.close();          
      }
      catch(Exception ex)
      {output(ex.toString());}
    
    }

 
     public String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }

    public void output(String message)
    { javax.swing.JOptionPane.showMessageDialog(null,message); }
    
    

}
    class Customer implements Serializable
    {
        String firstname;
        String lastname;
        String email;  
        
        
 
    }
