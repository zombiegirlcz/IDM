package financial.atomic.transact.activity;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import cam.t;
import com.revolut.revolut.feature_fourthline_impl.R;
import dam.d;
import dam.g;
import dam.i;
import dam.m;
import dam.s;
import eam.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import uc.a;
import z9m.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfinancial/atomic/transact/activity/TransactActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "transact_release"}, k = 1, mv = {1, 8, 0})
public final class TransactActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public s f135516a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final b f135517b0 = new b(this, 0);

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        super.attachBaseContext(newBase);
        a.a(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(5);
        setContentView(R.layout.activity_transact);
        String environment = getIntent().getStringExtra("environment");
        Intrinsics.h(environment);
        String token = getIntent().getStringExtra("token");
        Intrinsics.h(token);
        boolean booleanExtra = getIntent().getBooleanExtra("clearCookies", false);
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.f135516a0 = new s(this, new i("", g.NONE, d.valueOf(environment), null, booleanExtra, null, token, 2916340));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.TransactLayout);
        s sVar = this.f135516a0;
        if (sVar == null) {
            Intrinsics.r("transact");
            throw null;
        }
        frameLayout.addView((FrameLayout) ((cam.b) sVar.f.getValue()).f22668c.getValue());
        s sVar2 = this.f135516a0;
        if (sVar2 == null) {
            Intrinsics.r("transact");
            throw null;
        }
        sVar2.w(m.CLOSE, new eam.a(this, null, 0));
        s sVar3 = this.f135516a0;
        if (sVar3 == null) {
            Intrinsics.r("transact");
            throw null;
        }
        sVar3.w(m.FINISH, new eam.a(this, null, 1));
        int i = Build.VERSION.SDK_INT;
        b bVar = this.f135517b0;
        if (i >= 33) {
            s.Companion.getClass();
            registerReceiver(bVar, new IntentFilter("financial.atomic.transact.EVENT"), 4);
        } else {
            s.Companion.getClass();
            registerReceiver(bVar, new IntentFilter("financial.atomic.transact.EVENT"));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        try {
            unregisterReceiver(this.f135517b0);
        } catch (IllegalArgumentException unused) {
        }
        s sVar = this.f135516a0;
        if (sVar == null) {
            Intrinsics.r("transact");
            throw null;
        }
        e0.k(((t) sVar.f112591g.getValue()).d, null);
        e0.k(((k) sVar.f112592h.getValue()).a().d, null);
        e0.k(sVar.f112593j, null);
        super.onDestroy();
    }
}
