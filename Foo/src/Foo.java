public class Foo 
{  
    public static void main(String[] args) 
    {
        try 
        { 
            return; 
        } 
        finally 
        {
            System.out.println( "Finally" ); 
            System.out.println("Change done for checking push");
        } 
    } 
// Sample check
}