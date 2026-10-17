package com.revolut.ui.login.pin;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.WindowCompat;
import aw0.y9;
import hx0.c;
import hx0.e;
import ifm.b;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lp.q1;
import lp.r1;
import lwl.f;
import lwl.h;
import lwl.j;
import lwl.k;
import nii.t0;
import no.d1;
import nwl.g;
import nwl.l;
import od0.i;
import sri.m;
import sri.o;
import u2l.a;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class LoginActivity extends a implements owl.a, d1, wri.a {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f107072x0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public i f107073s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final b f107074t0;
    public t0 u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public w49.a f107075v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public dwl.b f107076w0;

    public LoginActivity() {
        i.Companion.getClass();
        this.f107073s0 = i.f224256b;
        this.f107074t0 = new b();
    }

    public static void g1(LoginActivity loginActivity, sab.b loginMode, l lVar) {
        g gVar;
        Intrinsics.checkNotNullParameter(loginMode, "loginMode");
        switch (nwl.i.f220019a[loginMode.ordinal()]) {
            case 1:
            case 2:
            case 3:
                gVar = g.BACK;
                break;
            case 4:
            case 5:
            case 6:
                gVar = g.FINISH;
                break;
            default:
                gVar = g.NONE;
                break;
        }
        int i = h.f200494a[gVar.ordinal()];
        if (i == 1) {
            super.onBackPressed();
        } else {
            if (i != 2) {
                return;
            }
            loginActivity.finishAffinity();
        }
    }

    @Override // u2l.a, dri.a
    public final boolean D0() {
        return false;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85901s0() {
        return null;
    }

    @Override // u2l.a
    public final w2l.a Z0() {
        return this.f107076w0;
    }

    @Override // u2l.a
    public final int c1() {
        return 0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        sab.b bVar;
        LoginScreenContract$Configuration loginScreenContract$Configuration = (LoginScreenContract$Configuration) I0();
        if (loginScreenContract$Configuration != null) {
            bVar = loginScreenContract$Configuration.f107077a;
        } else {
            int intExtra = getIntent().getIntExtra("argSignMode", -1);
            sab.b bVar2 = sab.b.NONE;
            sab.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(bVar2, "default");
            bVar = (sab.b) d.W(intExtra, sab.b.values());
            if (bVar == null) {
                bVar = bVar2;
            }
        }
        this.f107073s0.e(new kp0.b(this, bVar, 1));
    }

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        LoginScreenContract$Configuration loginScreenContract$Configuration;
        SplashScreen.installSplashScreen(this);
        c cVar = hx0.d.Companion;
        cVar.getClass();
        e eVar = (e) c.b(this);
        cVar.getClass();
        eVar.f156304a.getWindow().requestFeature(13);
        Intrinsics.checkNotNullParameter(this, "activity");
        Window window = getWindow();
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(0);
        dx0.e.c(window, this, dx0.c.TRANSPARENT);
        y9 style = y9.THEME;
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        style.b(this, window);
        dwl.a.a(this);
        q1 q1VarB = ((ip.a) hf0.b.d.g()).b();
        prl.e eVarA = q1VarB.k.f197513b.p().a();
        eVarA.f(this);
        eVarA.i();
        eVarA.t(bundle);
        Integer numValueOf = Integer.valueOf(R.id.content);
        eVarA.j(rd0.e.g(this, bundle, numValueOf));
        this.f107076w0 = (dwl.b) eVarA.h();
        super.onCreate(bundle);
        Intrinsics.checkNotNullParameter(this, "context");
        m mVarC = o.c(this, numValueOf, null, 12);
        this.u0 = new t0(this);
        lwl.l lVarA = new lwl.m(this).a();
        if (lVarA instanceof j) {
            return;
        }
        if (lVarA instanceof k) {
            LoginScreenContract$Configuration loginScreenContract$ConfigurationA = ((k) lVarA).a();
            loginScreenContract$Configuration = loginScreenContract$ConfigurationA;
            str = loginScreenContract$ConfigurationA != null ? loginScreenContract$ConfigurationA.d : null;
        } else {
            str = null;
            loginScreenContract$Configuration = null;
        }
        f fVar = new f(q1VarB, 6);
        f fVar2 = new f(q1VarB, 9);
        f fVar3 = new f(q1VarB, 10);
        f fVar4 = new f(q1VarB, 11);
        tpi.j progressView = ((r41.a) this.f107076w0).getProgressView();
        f fVar5 = new f(q1VarB, 0);
        f fVar6 = new f(q1VarB, 1);
        f fVar7 = new f(q1VarB, 2);
        f fVar8 = new f(q1VarB, 3);
        f fVar9 = new f(q1VarB, 4);
        f fVar10 = new f(q1VarB, 5);
        r1 r1Var = q1VarB.k.f197513b;
        cn0.e eVarE = ((an0.c) q1VarB.A.get()).e();
        ao.h hVarF = r1Var.f();
        jm0.a aVar = (jm0.a) hVarF.f7848c;
        dm0.d dVar = (dm0.d) aVar.o.get();
        mli.e eVar2 = (mli.e) hVarF.f7847b;
        ih0.b bVarF = aVar.e.f();
        s.j(bVarF);
        l lVar = new l(fVar, fVar2, fVar3, str, fVar4, mVarC, progressView, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, eVarE, loginScreenContract$Configuration, new em0.b(dVar, eVar2, bVarF, new i90.b()), r1Var.v().a(), getIntent(), q1VarB.E5().a(), new f(q1VarB, 7), new f(q1VarB, 8), ((m41.c) q1VarB.f197873po.get()).b());
        i.Companion.getClass();
        i iVarA = od0.h.a(lVar);
        iVarA.a(new lwl.g(this, 1));
        this.f107073s0 = iVarA;
        this.u0.getClass();
        postponeEnterTransition();
        if (Build.VERSION.SDK_INT >= 31) {
            getSplashScreen().setSplashScreenTheme(((hcb.a) q1VarB.I.get()).a().c("REVOLUT_BANK_BRANDING_ENABLED", false) ? com.revolut.revolut.feature_fourthline_impl.R.style.AppTheme_Splash_RevolutBank : 0);
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.u0.e();
        this.f107074t0.d();
        this.f107073s0.e(new a5.a(22));
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.u0.c();
        io.c.Companion.getClass();
        io.a.a("loginActivityStartFinishedInner");
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        this.u0.f();
        super.onStop();
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }
}
