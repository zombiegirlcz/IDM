package com.revolut.feature.retail.legacy.login.impl.signsms;

import a0.d;
import abb.b;
import android.content.Intent;
import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.domain.models.login.ChannelType;
import com.revolut.feature.retail.legacy.login.impl.R$id;
import com.revolut.feature.retail.legacy.login.impl.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import u2l.a;
import zab.f;
import zab.g;
import zab.h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/impl/signsms/SignSmsActivity;", "Lu2l/a;", "", "Lzab/g;", "<init>", "()V", "Companion", "a", "feature_retail_legacy_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignSmsActivity extends a implements g {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f82699s0 = "LOGIN_FLOW";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public h f82700t0;
    public b u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public SignSmsScreenContract$Configuration f82701v0;

    @Override // zab.g
    public final f B0() {
        b bVar = this.u0;
        if (bVar != null) {
            return (f) bVar.f2925y.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // u2l.a, dri.a
    public final boolean D0() {
        return false;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.f82699s0;
    }

    @Override // u2l.a
    public final w2l.a Z0() {
        b bVar = this.u0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // u2l.a
    public final int b1() {
        return R$id.sign_sms_fragment;
    }

    @Override // u2l.a
    public final int c1() {
        return R$layout.activity_sign_sms;
    }

    public final h g1() {
        h hVar = this.f82700t0;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("state");
        throw null;
    }

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strA;
        List list;
        ChannelType channelType;
        this.f82701v0 = (SignSmsScreenContract$Configuration) I0();
        abb.a aVar = ((abb.a) c.l(this).b(null, this.f82699s0)).k;
        this.u0 = new b(aVar, e.g(this, bundle, null));
        this.f82700t0 = (h) aVar.f2907w.get();
        SignSmsScreenContract$Configuration signSmsScreenContract$Configuration = this.f82701v0;
        if (signSmsScreenContract$Configuration == null || (strA = signSmsScreenContract$Configuration.d) == null) {
            phm.a aVar2 = (phm.a) ue0.e.j(this).a().get(xmg.a.class);
            b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
            if (aVar3 == null) {
                throw new IllegalStateException(d.q("Api ", xmg.a.class, " is not found"));
            }
            strA = ((xmg.a) aVar3.b()).a().a();
        }
        if (strA != null) {
            g1().getPhone().set(strA);
        }
        SignSmsScreenContract$Configuration signSmsScreenContract$Configuration2 = this.f82701v0;
        if (signSmsScreenContract$Configuration2 != null && (channelType = signSmsScreenContract$Configuration2.f82702a) != null) {
            g1().j0().set(channelType);
        }
        te0.e eVarF = g1().F();
        SignSmsScreenContract$Configuration signSmsScreenContract$Configuration3 = this.f82701v0;
        boolean z = false;
        if (signSmsScreenContract$Configuration3 != null && signSmsScreenContract$Configuration3.f82705g) {
            z = true;
        }
        eVarF.set(Boolean.valueOf(z));
        SignSmsScreenContract$Configuration signSmsScreenContract$Configuration4 = this.f82701v0;
        if (signSmsScreenContract$Configuration4 != null && (list = signSmsScreenContract$Configuration4.f82706h) != null) {
            g1().z().set(list);
        }
        super.onCreate(bundle);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String string;
        Intrinsics.checkNotNullParameter(intent, "intent");
        te0.e eVarV = g1().v();
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("CODE")) == null) {
            string = "";
        }
        eVarV.set(string);
        super.onNewIntent(intent);
    }
}
