/*
 * Michael Botros
 * Oct 18, 2019
 * This program calculates the average of a student using the marks stored in an array
 */

//importing the scanner library
package arrayremix3;
import java.util.Scanner;
/**
 *
 * @author mibot3117
 */
public class ArrayRemix3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creating a new scanner object
        Scanner keyedInput = new Scanner (System.in);
        
        //creating an array of predefined marks with 9 elements along with variables for the average and the total
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
        double total=0;
        double average;
        
        //using a for loop to display all the marks sequentially to the output
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        //using a for loop to add up all the elements of the array to the total variable
        for (int i = 0; i<=8; i= i + 1)
        {
            total = total + marks[i];
        }
        
        //dividing the total by the number of marks to get the average
        average = total/9;
        
        //rouding the answer to one decimal place
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        //printing out the new average
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
