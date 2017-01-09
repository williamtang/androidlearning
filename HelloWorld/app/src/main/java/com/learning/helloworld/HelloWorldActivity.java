package com.learning.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HelloWorldActivity extends AppCompatActivity implements View.OnClickListener {

//    private static final String TAG = "HelloWorldActivity";

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Button button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.edit_text);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(HelloWorldActivity.this, inputText, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
