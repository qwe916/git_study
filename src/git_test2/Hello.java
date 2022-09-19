package git_test2;

public class Hello {
<<<<<<< HEAD
    Hello hello = new Hello();
    System.out.println(hello.say());
=======

    String message;

    public Hello() {
        this("안녕하세요");
    }

    public Hello(String message) {
        this.message = message;
    }

    public void say() {
        return message;
    }
>>>>>>> 81cf6921b88a274608d4683026193745cde1fa03

}
