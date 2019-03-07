package sdu.cs.wongsathorn.animalapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    //explicit
    Button btn1,btn2,btn3, btn4;
    ImageView questionImageView;
    ImageButton volumeImageButton;
    MediaPlayer mediaPlayer; //ตัวแปรควบคุมการเร่งเสียง
    int questionCount = 10; //ตัวแปรกำหนดจำนวนข้อ
    ArrayList<Integer> qid = new ArrayList<Integer>();//ตัวแปรrandomโจทย์
    String answer; //ตัวแปรเก็บคำตอบ
    int score = 0;//ตัวแปรเก็บตะแนน



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูกตัวแปลบน java กับ id บน xml
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumeImageButton = findViewById(R.id.imbVolume);

        //กำหนดคำสั่งในการrandomโจทย์
        for (int i = 1; i <= questionCount; i++) {
            qid.add(i); //จองพื้นที่หน่วยความจำบนmemmory
        }//endfor
        Collections.shuffle(qid); //setการrandomโจทย์
        setQuestion(qid.remove(0)); //เมื่อrandomโจทย์แล้วให้popออกจากarray


    }//end oncreate

    private void setQuestion(int qid) { //methodแสดงคำถาม
        if (qid == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.bird); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("นก");
            choice.add("ม้า");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.cat); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("แมว");
            choice.add("ม้า");
            choice.add("ช้าง");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.cow); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("วัว");
            choice.add("สิงโต");
            choice.add("หมา");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.dog); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("หมา");
            choice.add("ม้า");
            choice.add("ช้าง");
            choice.add("สิงโต");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("ช้าง");
            choice.add("ม้า");
            choice.add("สิงโต");
            choice.add("แมว");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.horse); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("ม้า");
            choice.add("สิงโต");
            choice.add("แมว");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.lion); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("สิงโต");
            choice.add("ม้า");
            choice.add("ช้าง");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("ยุง");
            choice.add("ม้า");
            choice.add("สิงโต");
            choice.add("แมว");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.pig); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("หมู");
            choice.add("ม้า");
            choice.add("ยุง");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if

        if (qid == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep); //เรียกภาพ
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep); //เรียกเสียง

            ArrayList<String> choice = new ArrayList<String>(); //array สำหรับ random choice
            choice.add("แกะ");
            choice.add("ม้า");
            choice.add("นก");
            choice.add("ยุง");
            Collections.shuffle(choice);//กำหนดให้random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }//end if
    }//end setQuestion() method

    public void playSound(View view) {//method สำหรับแสดงเสียง
        mediaPlayer.start();
    }//end playSound() method

    public void choiceAns(View view) {//method สำหรับตรวจคำตอบและรวมคะแนน
        Button button = (Button) view;
        String buttonString = button.getText().toString();//เก็บข้อความบนปุ่มที่เลือก
        if (buttonString.equals(answer)) {//ถ้าคำตอบที่เลือกตรงกับanswer
            score++;//เพิ่มทีละ1คะแนน
        }//end if
        if (qid.isEmpty()) {//ถ้าทำครบทุกข้อแล้ว
            Toast.makeText(getApplicationContext(), "คุณได้" + score + "คะแนน", Toast.LENGTH_SHORT).show();
        } else {//ยังแสดงไม่ครบ
            setQuestion(qid.remove(0));
        }

    }//end choiceAms() method
}//end class
