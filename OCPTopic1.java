package ocptopic1;
import java.util.Random;

private TYPE currentView;

//declaration of enum 
public enum TYPE {
      FIRST, SECOND, THIRD
  };

//handling in switch case
switch (getCurrentView())
      {
      case FIRST:
          break;
      case SECOND:
          break;
      case THIRD:
          break;
      }

//getter and setter of the enum
public void setCurrentView(TYPE currentView) {
      this.currentView = currentView;
  }

  public TYPE getCurrentView() {
      return currentView;
  }

//usage of setting the enum 
setCurrentView(TYPE.FIRST);

class A{
     private int  num1;
     protected int  num2;
     public String name;
     
     public A(){
       num1 = 5;
       num2 = 50;
       name = "";
       System.out.println("1st Constructor");
     }
     //overload constructor
    public A(int a){
      num1 = a;
      System.out.println("2nd Constructor");
    }
    //overload constructor
    public A(int a,int b){
    num1 = a;
    num2 = b;
    name = "Nokubonga";
    System.out.println("3rd Constructor");
   }
   public void display(){
      System.out.println("Value1 === "+num1);
      System.out.println("Value2 === "+num2);
  }
   //overloading the display method
   public void display(int number1, int number2, String naam){
       num1 = number1;
       num2 = number2;
       naam = "Benedicta";
       System.out.println("The sum of the two numbers is: " + (number1 + number2));
       
       //using .equals
       if(name.equals(naam)){
           System.out.println("String name and string naam are equal.");
       }
       else
           System.out.println("string name and string naam are not equal.");
   }
}
/**
 *
 * @author Benedicta
 */
public class OCPTopic1 {
    /**
     * @param args the command line arguments
     */
    static Random random = new Random();
    public static int hashcode(){
        return random.nextInt(500);
    }
    public static void main(String[] args) {
        A d1 = new A();
        A d2 = new A(67);
        A d3 = new A(25,75);
        
        //virtual method invocation
        d1.display();
        d2.display();
        d3.display();
        
        //using display overloaded and .equals
        d3.display(40,60, "Nokubonga");
        
        //using instanseof
        System.out.println(d1 instanceof A);
        System.out.println(d3 instanceof A);
        
        //invoke the hashcode method
        System.out.println(hashcode());
    }
    
}
