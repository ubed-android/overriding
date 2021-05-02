public class Parent {
    void show(){
        System.out.println("Parent's show()");
    }
}

class Child extends Parent{
    // this method overrides show() of parent

    @Override
    void show() {
        System.out.println("child's show()");
    }
}
class Main{
    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.show();

        Parent obj2=new Child();
        obj2.show();

        Child ch1=new Child();
        ch1.show();
    }
}
