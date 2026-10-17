package com.revolut.feature.stock_lending.impl.ui.onboarding;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.common.ui.R$id;
import frl.a;
import g1e.f;
import grl.k9;
import h1e.d;
import h1e.g;
import hqi.i;
import hqi.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import qc0.b;
import te0.w;
import zc0.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/ui/onboarding/StockLendingOnboardingActivity;", "Lqc0/b;", "Lg1e/f;", "", "<init>", "()V", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockLendingOnboardingActivity extends b {
    public static final /* synthetic */ int K0 = 0;
    public final AnalyticsProduct.Retail G0;
    public d H0;
    public final Object I0;
    public final String J0;

    public StockLendingOnboardingActivity() {
        AnalyticsProduct.Companion aVar = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.k;
        this.G0 = com.google.android.gms.internal.mlkit_vision_face.a.g(aVar, k9Var, k9Var);
        this.I0 = w.y0(new fp3.a(this, 15));
        this.J0 = "STOCK_LENDING_ONBOARDING";
    }

    @Override // nri.b
    public final e F0() {
        d dVar = this.H0;
        if (dVar != null) {
            return (f) ((h1e.b) dVar).Q.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96913t0() {
        return this.J0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        d dVar = this.H0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.G0;
    }

    @Override // qc0.b
    public final h Z0() {
        d dVar = this.H0;
        if (dVar != null) {
            return (h) ((h1e.b) dVar).Z.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qc0.b, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b9k.f fVarA = ((g) c.l(this).b(null, this.J0)).a();
        fVarA.f13816a = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        xpi.f.Companion.getClass();
        fVarA.f13818c = xpi.f.d;
        ypi.h.Companion.getClass();
        fVarA.d = ypi.h.a(ypi.h.e, null, Integer.valueOf(com.revolut.core.backend_flow.R$id.bottom_note_text), 3);
        fVarA.e = new i(Integer.valueOf(com.revolut.core.backend_flow.R$id.toolbar_progress), k.a.f154719a);
        ?? r2 = this.I0;
        StockLendingOnboardingContract$Configuration stockLendingOnboardingContract$Configuration = (StockLendingOnboardingContract$Configuration) r2.getValue();
        stockLendingOnboardingContract$Configuration.getClass();
        fVarA.f13819g = stockLendingOnboardingContract$Configuration;
        fVarA.f = new iqi.g(R$id.twinVerticalButton);
        d dVar = (d) fVarA.build();
        h1e.b bVar = (h1e.b) dVar;
        h1e.c cVar = bVar.f;
        this.f244393r0 = (qc0.k) cVar.f148540r.get();
        this.f244394s0 = (zd7.b) bVar.Y.get();
        g1e.b bVar2 = (g1e.b) cVar.f148540r.get();
        this.H0 = dVar;
        if (bVar2 == null) {
            Intrinsics.r("state");
            throw null;
        }
        ((g1e.h) bVar2).w0().set((StockLendingOnboardingContract$Configuration) r2.getValue());
        super.onCreate(bundle);
    }
}
