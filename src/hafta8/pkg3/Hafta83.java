
package hafta8.pkg3;

import java.util.Scanner;

public class Hafta83 {

   
    public static void main(String[] args) {
             
    Scanner input = new Scanner(System.in);
        
       
       
        
       
       
          
          
       int n;
       do {
       
        System.out.println("nolarini giriniz  ");
        n = input.nextInt();
       }
       
       
       while(0>n);
      
      int [] fiboc = new int[n];
      fiboc[0] = 1;
      fiboc[1] = 1;
      
      for (int i = 2; i< fiboc.length; i++){
      
          
         int t =  fiboc[i-1] + fiboc[1 -2];
     
         fiboc[i] = t;
         
       
      
      }
      for (int i = 0; i< fiboc.length; i++){
          
          if(i== fiboc.length-1){
      
                 System.out.println( fiboc[i]);
            }
          else{
               System.out.println( fiboc[i] + ",");
          
          }
      }
        
    }
    
}
