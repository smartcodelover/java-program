class Student{
    int rollno;
    String  name; 
    float marks;
    // String grade;
    void setRollNo(int rn){
        rollno =rn;
    }
      int getRollNo(){
        return rollno;
      }
      void setName(String nm){
           name= nm;
      }
      String getName(){
        return name;
      }
      void setMarks(float M){
        marks= M;
      }
      float getMarks(){
        return marks;
      }
    
      String getGrade(){
        if(marks>40)
            return "pass";
            return "fail";
    
       
      }
      public static void main(String args[]){
        Student s ;
        s=new Student();
        s.setRollNo(110);
        s.setName("MURARI KUMAR");
        s.setMarks(80);
        System.out.println("Roll no:"+ s.getRollNo());
        System.out.println("NAME:" + s.getName());
        System.out.println("MARKS:" + s.getMarks());
         System.out.println("Grade:" + s.getGrade());

      }


    }