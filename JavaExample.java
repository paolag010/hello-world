public class JavaExample{

  public static void main(String[] args){
    System.out.println("Test");
    System.out.println(getValue());
    System.out.println(getValue("Eric"));
  }
  
  public static String getValue() {
    return "test";
  }
  
  public static String getValue(String name) {
    return name + "test";
  }

}
