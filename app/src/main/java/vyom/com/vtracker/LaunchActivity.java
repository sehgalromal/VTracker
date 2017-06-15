package vyom.com.vtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaunchActivity extends AppCompatActivity {

    private Button already_register,google_login,normal_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        already_register=(Button)findViewById(R.id.tv_alrady_a_user);
        already_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reglogin=new Intent(LaunchActivity.this,AlreadyRegistered.class);
                startActivity(reglogin);
            }
        });
        google_login=(Button)findViewById(R.id.btn_google_login);
        google_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingoogle=new Intent(LaunchActivity.this,MainActivity.class);
                startActivity(ingoogle);
            }
        });
        normal_register=(Button)findViewById(R.id.bt_reg);
        normal_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inregister=new Intent(LaunchActivity.this,Register.class);
                startActivity(inregister);
            }
        });

    }
}
