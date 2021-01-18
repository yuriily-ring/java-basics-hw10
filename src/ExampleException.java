public class ExampleException {
  public static int rectangleArea(int a, int b) throws IllegalArgumentException {
    // TODO put your code here
    try {
      if (a < 0 || b < 0) throw new IllegalArgumentException();
      return a * b;
    }
    catch (IllegalArgumentException e) {
      System.out.println("input value is below zero!");
    }
    return 0;
  }
}


