package com.revolut.feature.profile.impl.ui.details.emailverification;

import android.os.Bundle;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.common.ui.R$id;
import frl.a;
import grl.k9;
import hpi.h;
import hqi.i;
import ihm.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o3l.q;
import q3l.b;
import w01.k;
import yhm.d;
import yma.a0;
import yma.e;
import yma.g;
import zma.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/emailverification/EmailVerificationActivity;", "Lhpi/h;", "Lyma/a0;", "Lyma/e;", "Lq3l/b;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class EmailVerificationActivity extends h implements e, b {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f81393s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f81394t0;
    public c u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public yma.c f81395v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final f f81396w0;

    public EmailVerificationActivity() {
        AnalyticsProduct.Companion aVar = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.k;
        this.f81393s0 = com.google.android.gms.internal.mlkit_vision_face.a.g(aVar, k9Var, k9Var);
        this.f81394t0 = "EMAIL_VERIFICATION_FLOW";
        this.f81396w0 = v0.a.d("create(...)");
    }

    @Override // q3l.b
    public final q E0() {
        c cVar = this.u0;
        if (cVar != null) {
            return ((zma.a) cVar).E0();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    public final pri.e F0() {
        c cVar = this.u0;
        if (cVar != null) {
            return (a0) ((zma.a) cVar).G.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96906t0() {
        return this.f81394t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        c cVar = this.u0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.f81393s0;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new hpi.e((Object) null));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        hpi.c.b(cVar);
        return cVar;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f81396w0.onNext(Unit.f186387a);
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        ou5.b bVarA = ((zma.d) com.bumptech.glide.c.l(this).b(null, this.f81394t0)).a();
        i.Companion.getClass();
        i iVar = i.d;
        iVar.getClass();
        bVarA.f229821c = iVar;
        xpi.f.Companion.getClass();
        bVarA.d = xpi.f.d;
        ypi.h.Companion.getClass();
        bVarA.e = ypi.h.d;
        bVarA.f229820b = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        c cVar = (c) bVarA.build();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.u0 = cVar;
        zma.b bVar = ((zma.a) cVar).e;
        this.f81395v0 = (yma.c) bVar.f323430t.get();
        EmailVerificationFlowContract$Configuration emailVerificationFlowContract$Configuration = (EmailVerificationFlowContract$Configuration) getIntent().getParcelableExtra("CONFIGURATION_ARG");
        if (emailVerificationFlowContract$Configuration != null && (str = emailVerificationFlowContract$Configuration.f81397a) != null) {
            yma.c cVar2 = this.f81395v0;
            if (cVar2 == null) {
                Intrinsics.r("state");
                throw null;
            }
            ((g) cVar2).w0().set(str);
        }
        super.onCreate(bundle);
        k.e(this.f154555r0.a(), false);
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }
}
