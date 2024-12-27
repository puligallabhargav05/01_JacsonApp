package in.bhargav;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	
	  public static void main(String[] args) throws Exception {
		  
		  App a = new App();
		  
		//  a.convertJavatoJason();
		  
		  a.convertJasontoJava();
		  
		  
	}
	  
	  public void convertJasontoJava() throws Exception {
		  
		  
		File f = new File("customer.jason");
		
		// deserilization
		ObjectMapper mapper = new ObjectMapper();
		
		    customer customer = mapper.readValue(f, customer.class);
		    
		    System.out.println(customer);
		    
		    
		  
		  
	  }
	
       public void convertJavatoJason() throws Exception {
    	   
    	   // creating a customer object in App class
    	   
            customer c = new customer();
            
            c.setGender("Male");
            
            c.setId(101);
            
            c.setName("Bhargav");
            
            c.setPhno(90107936);
            
            
            
            
              File f = new File("customer.jason");
              
              
             // creating a object for performing Serialization
              
              ObjectMapper mapper = new ObjectMapper();
              
              mapper.writeValue(f, c);
    	   
    	   System.out.println("Serlization Completed...........");
    	   
    	   
       }

}