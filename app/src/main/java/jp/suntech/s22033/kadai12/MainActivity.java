package jp.suntech.s22033.kadai12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSend=findViewById(R.id.btSend);
        Button btConfirm=findViewById(R.id.btConfirm);
        Button btClear=findViewById(R.id.btClear);

        btSend.setOnClickListener(new sButtonClickListener());
        btConfirm.setOnClickListener(new cButtonClickListener());
        btClear.setOnClickListener(new clearButtonClickListener());
    }
   private class sButtonClickListener implements View.OnClickListener{

       @Override
       public void onClick(View v) {
           EditText name=findViewById(R.id.etName);
           EditText mail=findViewById(R.id.etMail);
           EditText mtitle=findViewById(R.id.etMtitle);
           EditText comment=findViewById(R.id.etComment);

           String Sname=name.getText().toString();
           String Smail=mail.getText().toString();
           String Stitle=mtitle.getText().toString();
           String Scomment=comment.getText().toString();

           String text=Sname+","+Stitle+","+Smail+"\n"+Scomment;
           Snackbar.make(v,text,Snackbar.LENGTH_LONG).show();
           }
       }
    private class cButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            EditText name=findViewById(R.id.etName);
            EditText mail=findViewById(R.id.etMail);
            EditText mtitle=findViewById(R.id.etMtitle);
            EditText comment=findViewById(R.id.etComment);
            String Sname=name.getText().toString();
            String Smail=mail.getText().toString();
            String Stitle=mtitle.getText().toString();
            String Scomment=comment.getText().toString();
            String text=Sname+","+Stitle+","+Smail+"\n"+Scomment;
            Snackbar.make(v,text,Snackbar.LENGTH_LONG).show();
            Dialog dialog=new Dialog();
            dialog.show(getSupportFragmentManager(),"Dialog");
        }
    }
    private class clearButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText name=findViewById(R.id.etName);
            EditText mail=findViewById(R.id.etMail);
            EditText mtitle=findViewById(R.id.etMtitle);
            EditText comment=findViewById(R.id.etComment);

            name.setText("");
            mail.setText("");
            mtitle.setText("");
            comment.setText("");
        }
    }
}