package com.revolut.feature.kyc.impl;

import android.os.Bundle;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.ui.activity.CustomTheme;
import cu8.h1;
import cu8.j1;
import cu8.l1;
import cu8.n1;
import hpi.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.i;
import te0.j;
import te0.w;
import tx0.j0;
import vc.s;
import zu8.t0;
import zu8.u0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycActivity;", "Lhpi/h;", "Lcu8/h1;", "Lcu8/l1;", "Lrv8/a;", "Lfsi/h;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycActivity extends h implements l1, rv8.a, fsi.h {
    public static final /* synthetic */ int B0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public t0 f77529t0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public j1 f77530v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public qv8.b f77531w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public opi.b f77532x0;
    public fk3.b y0;
    public zd7.b z0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f77528s0 = w.y0(new cu8.b(this, 0));
    public final Object u0 = w.y0(new cu8.b(this, 1));
    public final Object A0 = w.y0(new cpi.b(12));

    @Override // nri.b
    public final pri.e F0() {
        t0 t0Var = this.f77529t0;
        if (t0Var != null) {
            return (h1) t0Var.Q.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF96964t0() {
        return (String) this.f77528s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        t0 t0Var = this.f77529t0;
        if (t0Var != null) {
            return t0Var;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return ((KycScreenContract$Configuration) G0()).f77546j;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new hpi.e((Object) null));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        iqi.g.Companion.getClass();
        iqi.g configuration2 = iqi.g.f167870b;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        cVar.i = configuration2;
        if (jh.d.g(this.f98684b0)) {
            cVar.e = true;
        }
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final KycScreenContract$Configuration c1() {
        return (KycScreenContract$Configuration) this.u0.getValue();
    }

    public final j1 d1() {
        j1 j1Var = this.f77530v0;
        if (j1Var != null) {
            return j1Var;
        }
        Intrinsics.r("kycFlowState");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R$anim.slide_in_end, R$anim.slide_out_start);
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        u0 u0Var = ((u0) com.bumptech.glide.c.l(this).b(null, getF96964t0())).f325398r;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(com.revolut.retail.common.ui.R$id.fragment_container));
        KycScreenContract$Configuration kycScreenContract$ConfigurationC1 = c1();
        kycScreenContract$ConfigurationC1.getClass();
        iqi.g.Companion.getClass();
        xpi.f.Companion.getClass();
        t0 t0Var = new t0(u0Var, dVarG, kycScreenContract$ConfigurationC1);
        this.f77529t0 = t0Var;
        u0 u0Var2 = t0Var.f325369c;
        this.f77530v0 = (j1) u0Var2.u.get();
        this.f77531w0 = (qv8.b) u0Var2.T.get();
        this.f77532x0 = (opi.b) t0Var.f325377q.get();
        fk3.b bVarB = u0Var2.i.b();
        s.j(bVarB);
        this.y0 = bVarB;
        this.z0 = (zd7.b) t0Var.E.get();
        if (bundle == null) {
            KycFinalCommand kycFinalCommand = c1().f77542b;
            if (kycFinalCommand != null) {
                n1 n1Var = (n1) d1();
                n1Var.f108863c.getValue(n1Var, n1.f108861y[1]).set(kycFinalCommand);
            }
            KycScreenContract$Step kycScreenContract$Step = c1().f;
            if (kycScreenContract$Step != null) {
                ((n1) d1()).A0().set(kycScreenContract$Step);
            }
            ((n1) d1()).E0().set(c1().f77545h);
        }
        wi0.b bVar = c1().f77543c;
        if (bVar != null) {
            ((n1) d1()).y0().set(bVar);
        }
        wi0.b bVar2 = c1().d;
        if (bVar2 != null) {
            ((n1) d1()).C0().set(bVar2);
        }
        wi0.b bVar3 = c1().f77543c;
        if (bVar3 != null) {
            ((n1) d1()).B0().set(bVar3);
        }
        ((n1) d1()).x0().set(Boolean.valueOf(c1().f77550p));
        KycContract$Requirement kycContract$Requirement = c1().f77544g;
        n1 n1Var2 = (n1) d1();
        j jVar = n1Var2.u;
        KProperty[] kPropertyArr = n1.f108861y;
        jVar.getValue(n1Var2, kPropertyArr[20]).set(kycContract$Requirement);
        n1 n1Var3 = (n1) d1();
        n1Var3.i.getValue(n1Var3, kPropertyArr[8]).set(Boolean.valueOf(c1().e));
        n1 n1Var4 = (n1) d1();
        n1Var4.f108869n.getValue(n1Var4, kPropertyArr[13]).set(Boolean.valueOf(c1().i));
        n1 n1Var5 = (n1) d1();
        n1Var5.f108870p.getValue(n1Var5, kPropertyArr[15]).set(c1().f77547l);
        yt8.e eVar = c1().f77548m;
        if (eVar != null) {
            n1 n1Var6 = (n1) d1();
            n1Var6.f108872r.getValue(n1Var6, kPropertyArr[17]).set(eVar);
        }
        String str = c1().f77549n;
        if (str != null) {
            te0.e eVarJ0 = ((n1) d1()).J0();
            i.Companion.getClass();
            eVarJ0.set(od0.h.a(str));
        }
        n1 n1Var7 = (n1) d1();
        te0.e eVarC = n1Var7.f108875w.getValue(n1Var7, kPropertyArr[22]);
        od0.h hVar = i.Companion;
        String str2 = c1().o;
        hVar.getClass();
        eVarC.set(od0.h.a(str2));
        ((n1) d1()).w0().set(c1().f77551q);
        fk3.b bVar4 = this.y0;
        if (bVar4 == null) {
            Intrinsics.r("configurationRepository");
            throw null;
        }
        if (((ik3.g) bVar4).f161888g.b().H1) {
            CustomTheme.INSTANCE.getClass();
            T0(CustomTheme.Companion.a(AnimatedBackgroundType.ONBOARDING.f51478a), true);
        }
        super.onCreate(bundle);
        zd7.b bVar5 = this.z0;
        if (bVar5 == null) {
            Intrinsics.r("imagePickerBottomDialog");
            throw null;
        }
        ((ae7.i) bVar5).a(this);
        opi.b bVar6 = this.f77532x0;
        if (bVar6 == null) {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
        bVar6.X(new cu8.b(this, 2));
        this.f154555r0.b().setHeaderTitleMode(j0.MULTILINE);
    }
}
