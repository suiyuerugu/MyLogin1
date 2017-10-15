package com.example.wxj.myapplication02;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etusemname ,etpassword;
    private Button btnlogin, btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativeout);
        etusemname=(EditText)findViewById(R.id.et_use_name);
        etpassword=(EditText)findViewById(R.id.et_password);
        btnlogin=(Button)findViewById(R.id.btn1);
        btncancel=(Button)findViewById(R.id.btn2);
        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        String strusename=etusemname.getText().toString();
        String strpassword =etpassword.getText().toString();
        if (strusename.equals("abc")&&strpassword.equals("123456")){
            Toast.makeText(this,"登录成功",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"用户名或密码错误",Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onClick(View view) {

    }
}
