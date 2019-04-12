import java.util.Scanner;

/**
   Walther Alvarez
   CISC 500
   Assignment #3
   This program asks the user to input three string separated by a space, 
   it then organizes the words in lexicographical order
   */
public class LexicographicOrder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter three strings separated by a space: ");
      String namea = in.next();
      String nameb = in.next();
      String namec = in.next();
           
      if (namea.compareToIgnoreCase(nameb) < 0 && (namea.compareToIgnoreCase(namec) < 0) )      
      {
         System.out.println("" + namea);
         
         if (nameb.compareToIgnoreCase(namec) < 0)
         {
            System.out.println("" + nameb);
         }
         else
         {
            System.out.println("" + namec);
         }
         if (namec.compareToIgnoreCase(nameb) > 0)
         {
            System.out.println("" + namec);
         }
         else
         {
            System.out.println("" + nameb);
         }

      }
      else if (nameb.compareToIgnoreCase(namea) < 0 && (nameb.compareToIgnoreCase(namec) < 0) )
      {
         System.out.println("" + nameb);
         
         if (namea.compareToIgnoreCase(namec) < 0)
         {
            System.out.println("" + namea);
         }
         else 
         {
            System.out.println("" + namec);
         }
         if (namec.compareToIgnoreCase(namea) > 0)
         {
            System.out.println("" + namec);
         }
          else 
         {
            System.out.println("" + namea);
         }

      }
      else if (namec.compareToIgnoreCase(namea) < 0 && (namec.compareToIgnoreCase(nameb) < 0) )
      {
         System.out.println("" + namec);
      
         if (nameb.compareToIgnoreCase(namea) < 0 )
         {
         System.out.println("" + nameb);
         }
         else
         {
            System.out.println("" + namea);
         }
         if (namea.compareToIgnoreCase(nameb) > 0)
         {
            System.out.println("" + namea);
         }
         else
         {
            System.out.println("" + nameb);
         }

      }
   }
}