class Teaching{
    String title="Teaching";
    String collegeName="BeginnersBook";
    void does(){
        System.out.println("Teaching");
    }


}

public class PhysicsTeacher extends Teaching{
String mainSubject = "Physics";

    public static void main(String[] args) {
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);
    }

}
