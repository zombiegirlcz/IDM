package com.revolut.retail.feature.trading_onboarding.impl.ui.helper_next.screen;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.trading_onboarding.impl.ui.helper_next.NextContract$Configuration;
import gzk.b;
import hzk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import pri.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/helper_next/screen/NextActivity;", "Lgzk/b;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lizk/b;", "Lno/d1;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NextActivity extends BaseDelegatesActivity implements b, d1 {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public a f104176r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f104177s0 = "TRADING_ONBOARDING_NEXT_HELPER_FLOW";

    @Override // nri.b
    public final e F0() {
        a aVar = this.f104176r0;
        if (aVar != null) {
            return (izk.b) aVar.f157234y.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96906t0() {
        return this.f104177s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f104176r0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f104176r0 = new a(((hzk.b) c.l(this).b(null, this.f104177s0)).f157239h, rd0.e.g(this, bundle, null), (NextContract$Configuration) G0());
        super.onCreate(bundle);
    }
}
