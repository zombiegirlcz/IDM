package nri;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatActivity;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_add_to_googlepay.impl.AddCardToGooglePayActivity;
import com.revolut.retail.core.mvp.CreateException;
import in0.g;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pri.e;
import rd0.d;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b extends AppCompatActivity implements g, c, rri.a, m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e f218652a0;

    public static Parcelable H0(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Parcelable parcelableExtra = intent.getParcelableExtra("CONFIGURATION_ARG");
        if (parcelableExtra instanceof Parcelable) {
            return parcelableExtra;
        }
        return null;
    }

    public e F0() {
        return null;
    }

    public final Parcelable G0() {
        Set<String> setKeySet;
        try {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("CONFIGURATION_ARG");
            Intrinsics.i(parcelableExtra, "null cannot be cast to non-null type T of com.revolut.retail.core.mvp.BaseMvpActivity.getConfiguration");
            return parcelableExtra;
        } catch (Throwable th10) {
            Intent intent = getIntent();
            Bundle extras = getIntent().getExtras();
            CreateException createException = new CreateException("Error getting configuration from intent " + intent + " and keys " + ((extras == null || (setKeySet = extras.keySet()) == null) ? null : d0.k0(setKeySet, ",", null, null, 0, null, 62)), th10);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, createException, h0Var);
            throw th10;
        }
    }

    public final Parcelable I0() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("CONFIGURATION_ARG");
        if (parcelableExtra instanceof Parcelable) {
            return parcelableExtra;
        }
        return null;
    }

    /* JADX INFO: renamed from: J0 */
    public abstract String getF71630s0();

    /* JADX INFO: renamed from: P */
    public AnalyticsProduct getN() {
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        vw0.d.Companion.getClass();
        super.attachBaseContext(vw0.c.a(newBase));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.windowAnimationStyle, typedValue, false) && typedValue.data == 0) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        e eVar = this.f218652a0;
        if (eVar != null) {
            if (eVar.isAttached()) {
                eVar = null;
            }
            if (eVar != null) {
                eVar.h(this);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f218652a0 == null) {
            if (bundle != null) {
                bundle.getParcelable("CONFIGURATION_ARG");
            } else {
                getIntent().getParcelableExtra("CONFIGURATION_ARG");
            }
            this.f218652a0 = F0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f218652a0 = null;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        e eVar = this.f218652a0;
        if (eVar != null) {
            if (eVar.isAttached()) {
                eVar = null;
            }
            if (eVar != null) {
                eVar.h(this);
            }
        }
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        e eVar = this.f218652a0;
        if (eVar != null) {
            eVar.l();
        }
    }

    public boolean p0() {
        return this instanceof AddCardToGooglePayActivity;
    }
}
