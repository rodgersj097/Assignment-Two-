/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.security.SecureRandom;


/**
 *
 * @author LoneStar
 */
public class Assignment2 {
 private static String[][] grade;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        grade = new String[5][6];
        // Set the values for the first row and column 
        //row 1 
        grade[0][0]="Students "; 
        grade[0][1]="Grade 1 "; 
        grade[0][2]="Grade 2 ";  
        grade[0][3]="Grade 3 ";  
        grade[0][4]="Grade 4 ";  
        grade[0][5]="Grade 5 ";
        //Column 1 
        grade[0][0]="Students"; 
        grade[1][0]="Ryan Miller"; 
        grade[2][0]="Timothy LoPapa";  
        grade[3][0]="Hashim Razak";  
        grade[4][0]="Evan Vanderheide";  
        //call methods 
        populateGradesArray();
      displayGrades();
      getAverage();
    }
   //Method to populate grades in a array 
    public static void populateGradesArray(){   
        SecureRandom rng = new SecureRandom();
        
       //populate grades to the board start at row 1 and row 2 to stop the constants from being written over
       for(int row = 1; row< grade.length; row++){
            for(int col=1; col<grade[row].length; col++){
                int rand = rng.nextInt(90)+10   ; // have a inital grade of 0-90 then add 10 to avoid getting grades that are unlikely to below but still creating possiblity of high grades 
                String randi = Integer.toString(rand);
                grade[row][col]=randi;
            }
        }
    }
    //Method to display grades to console
    public static void displayGrades(){
       //print out grades to board
        for(int row =0; row< grade.length; row++){
            for(int col=0; col<grade[row].length; col++){
               grade[row][col] = grade[row][col];
                
               if(col <1)
               System.out.printf("%-18s",grade[row][col]);// Have the first column have enoughspacing for large names 
               else
                System.out.printf("%-10s",grade[row][col]);  //keep everything after first column from having to large of a spacing    
            }
           
            System.out.println(" ");   
        }
    }
    
  //get avrage grade 
    
    public static void getAverage(){
        int col = 0; 
        double sum= 0; 
        double sum2= 0;
        double sum3= 0;
        double sum4= 0;
        double badave4= 0;
        double highestAve =0;   
        String studentName =  null; 
       
             for(int row=1; row<grade[col].length; row++){
             
           // get the Double vaulue of each row 
                 sum+= Double.valueOf(grade[1][row]); 
                 sum2+= Double.valueOf(grade[2][row]); 
                 sum3+= Double.valueOf(grade[3][row]); 
                 sum4+= Double.valueOf(grade[4][row]); 
                 
             }
               //divide the sum of each row by 5 
                double avg1 = sum/5;  
                double avg2 = sum2/5;  
                double avg3 = sum3/5;  
                double avg4 = sum4/5;  
                 //Sort out the highest value of each row 
                  highestAve = Math.max( avg1, Math.max( avg2, Math.max( avg3, avg4 ) ) );
               
                 // Assign names to each row average 
                if(highestAve == avg1)
                     studentName = grade[1][0];    
                else if(highestAve == avg2)
                     studentName = grade[2][0]; 
                else if(highestAve == avg3)
                     studentName = grade[3][0]; 
                else if(highestAve == avg4)
                     studentName = grade[4][0]; 
               // if a student average is below 50 display to the screen  
             if(avg1 < 50)
                   System.out.printf("%n%s is struggling with an average of %.2f",grade[1][0], avg1);
          
             if(avg2 < 50)
                   System.out.printf("%n%s is struggling with an average of %.2f",grade[2][0], avg2);
            
               if(avg3 < 50)
                   System.out.printf("%n%s is struggling with an average of %.2f",grade[3][0], avg3);
              
              if(avg4 < 50)
                   System.out.printf("%n%s is struggling with an average of %.2f",grade[4][0], avg4);

   //Display the highest average to the screen with student name           
   System.out.printf("%nThe student with the highest Average of %.2f is %s", highestAve, studentName);   
  

    }
    
   
   
}    
   
  

