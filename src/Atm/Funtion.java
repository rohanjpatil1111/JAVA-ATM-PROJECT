package Atm;

import java.util.Scanner;

public class Funtion {

	float Balance;
	int PIN =1111; //after it will connected to database
   
	
	public void PinCheck(){
		System.out.println("Please Enter Your Pin");
        Scanner sc = new Scanner(System.in);
        
           int enteredpassword = sc.nextInt();
           
           if(enteredpassword==PIN) {
        	   menu();  }
           
           else {
        		   System.out.println("Wrong PIN Please Try Again");
        		   PinCheck();  }   
	}
	
	
	public void menu() {
	    System.out.println("Menu");
	    System.out.println("1. Check A/C Balance");
	    System.out.println("2. Withdraw Cash");
	    System.out.println("3. Deposit Money");
	    System.out.println("4. EXIT");
	    Scanner sc = new Scanner(System.in);
	    
	     int option = sc.nextInt();
	     
	     if(option==1) {
	    	 Balance();
	     }
	     else if(option==2) {
	    	 Withdraw();
	    	 
	     }
	     else if(option==3) {
	    	 Deposite();
	     }
	     else if(option==4) {
	    	 Exit();
	     }
	     else {
	    	 System.out.println("Not valid option");
	    	 menu();
	     }
  
	    }
	
	
	
	 public void Balance() {
		 System.out.println("                                    "+"Your Balance Avilable"+" "+ Balance);
		 menu();
    	 
    	 
    	 
     }
	 
	 
	 
     public void  Withdraw() {
    	 Scanner sc = new Scanner(System.in);	  
    	 System.out.println("Enter Amount");
    	  float Amount = sc.nextFloat();
    	  if(Amount>Balance) {
    		  System.out.println("Insufficient Funds");
    	  }
    	  else {
    		  Balance=Balance-Amount;
    		  Balance();
    		  menu();
    	  }
    	  
    	  }
    	  public void Deposite() {
    		  Scanner sc = new Scanner(System.in);
    		  System.out.println("Enter Deposite Amount"); 
    		  float Amount = sc.nextFloat();
    		  
    		  if(Amount>0) {
    		  Balance= Balance+Amount;
    		  Balance();
    		  menu();
    		  }
    		  else{menu();}
    	  }
    	  
    	 public void Exit() {
    		 
    		 PinCheck();
    	 }
     
	}
	

	
	
	
	
	
	


