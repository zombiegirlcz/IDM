package com.revolut.feature.retail.legacy.login.impl.twofa;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import bbb.c;
import bbb.d;
import bbb.e;
import bbb.m;
import com.revolut.retail.core.R$anim;
import eli.l;
import fsi.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nri.b;
import te0.j;
import tjg.c;
import u2l.a;
import zab.f;
import zab.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/impl/twofa/TwoFactorAuthenticationActivity;", "Lu2l/a;", "Lbbb/c;", "Lbbb/e;", "Lzab/g;", "", "Lin0/g;", "Lfsi/h;", "<init>", "()V", "feature_retail_legacy_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwoFactorAuthenticationActivity extends a implements g, e, h {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f82725s0 = "TWO_FA_FLOW";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public d f82726t0;
    public cbb.a u0;

    @Override // zab.g
    public final f B0() {
        cbb.a aVar = this.u0;
        if (aVar != null) {
            return (f) aVar.z.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // u2l.a, dri.a
    public final boolean D0() {
        return false;
    }

    @Override // nri.b
    public final pri.e F0() {
        cbb.a aVar = this.u0;
        if (aVar != null) {
            return (c) aVar.f22741x.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f82725s0;
    }

    @Override // u2l.a
    public final w2l.a Z0() {
        cbb.a aVar = this.u0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // u2l.a
    public final int c1() {
        return 0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R$anim.fade_in, R$anim.fade_out);
    }

    public final d g1() {
        d dVar = this.f82726t0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("state");
        throw null;
    }

    public final void h1(TwoFaContract$Config twoFaContract$Config) {
        if (twoFaContract$Config != null) {
            String strA = twoFaContract$Config.e;
            if (strA == null) {
                phm.a aVar = (phm.a) ue0.e.j(this).a().get(xmg.a.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", xmg.a.class, " is not found"));
                }
                strA = ((xmg.a) aVar2.b()).a().a();
            }
            if (strA != null) {
                m mVar = (m) g1();
                mVar.d.getValue(mVar, m.f14238l[2]).set(strA);
            }
            m mVar2 = (m) g1();
            j jVar = mVar2.e;
            KProperty[] kPropertyArr = m.f14238l;
            jVar.getValue(mVar2, kPropertyArr[3]).set(twoFaContract$Config.f82721b);
            m mVar3 = (m) g1();
            mVar3.f14241g.getValue(mVar3, kPropertyArr[5]).set(Boolean.valueOf(twoFaContract$Config.f82720a));
            m mVar4 = (m) g1();
            mVar4.f.getValue(mVar4, kPropertyArr[4]).set(Boolean.valueOf(twoFaContract$Config.f82723g));
            List list = twoFaContract$Config.f82724h;
            if (list != null) {
                m mVar5 = (m) g1();
                mVar5.i.getValue(mVar5, kPropertyArr[7]).set(list);
            }
        }
    }

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        c cVar = (c) this.f218652a0;
        if (cVar != null) {
            l lVar = (l) ((bbb.l) cVar).f14235l;
            lVar.f127484a = c.b.f271717a;
            lVar.f.onNext(Unit.f186387a);
        }
        super.onBackPressed();
    }

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        overridePendingTransition(R$anim.fade_in, R$anim.fade_out);
        TwoFaContract$Config twoFaContract$Config = (TwoFaContract$Config) I0();
        cbb.c cVar = ((cbb.c) com.bumptech.glide.c.l(this).b(null, this.f82725s0)).E;
        this.u0 = new cbb.a(cVar, rd0.e.g(this, bundle, Integer.valueOf(R.id.content)));
        d dVar = (d) cVar.Q.get();
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f82726t0 = dVar;
        h1(twoFaContract$Config);
        super.onCreate(bundle);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String string;
        Intrinsics.checkNotNullParameter(intent, "intent");
        m mVar = (m) g1();
        te0.e eVarC = mVar.f14242h.getValue(mVar, m.f14238l[6]);
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("CODE")) == null) {
            string = "";
        }
        eVarC.set(string);
        super.onNewIntent(intent);
        h1((TwoFaContract$Config) b.H0(intent));
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }
}
