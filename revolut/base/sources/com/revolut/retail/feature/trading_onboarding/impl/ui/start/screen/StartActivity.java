package com.revolut.retail.feature.trading_onboarding.impl.ui.start.screen;

import android.os.Bundle;
import b1l.a;
import b1l.b;
import com.bumptech.glide.c;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.trading_onboarding.impl.ui.start.StartContract$Configuration;
import ihm.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import pri.e;
import y0l.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/start/screen/StartActivity;", "Ly0l/d;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "La1l/d;", "Lno/d1;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StartActivity extends BaseDelegatesActivity implements d, d1 {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public a f104282r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final f f104283s0 = v0.a.d("create(...)");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f104284t0 = "TRADING_ONBOARDING_START_FLOW";

    @Override // nri.b
    public final e F0() {
        a aVar = this.f104282r0;
        if (aVar != null) {
            return (a1l.d) aVar.f11824y.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96906t0() {
        return this.f104284t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f104282r0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f104282r0 = new a(((b) c.l(this).b(null, this.f104284t0)).f11829h, rd0.e.g(this, bundle, null), (StartContract$Configuration) G0());
        super.onCreate(bundle);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f104283s0.onNext(Unit.f186387a);
    }
}
