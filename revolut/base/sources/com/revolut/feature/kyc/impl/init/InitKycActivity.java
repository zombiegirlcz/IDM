package com.revolut.feature.kyc.impl.init;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import frl.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nw8.i;
import pri.e;
import zu8.s0;
import zu8.u0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/init/InitKycActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lnw8/e;", "Lnw8/i;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class InitKycActivity extends BaseDelegatesActivity implements i {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f77818r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f77819s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public s0 f77820t0;

    public InitKycActivity() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137499j;
        this.f77818r0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.f77819s0 = "KYC_FLOW";
    }

    @Override // nri.b
    public final e F0() {
        s0 s0Var = this.f77820t0;
        if (s0Var != null) {
            return (nw8.e) s0Var.f325363q.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF77819s0() {
        return this.f77819s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        s0 s0Var = this.f77820t0;
        if (s0Var != null) {
            return s0Var;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.f77818r0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        s0 s0Var = new s0(((u0) c.l(this).b(null, this.f77819s0)).f325398r, rd0.e.g(this, bundle, null), (InitKycScreenContract$Configuration) G0());
        Intrinsics.checkNotNullParameter(s0Var, "<set-?>");
        this.f77820t0 = s0Var;
        super.onCreate(bundle);
    }
}
