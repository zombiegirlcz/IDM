package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.screen;

import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.screen.TradingOnboardingBackendFlowActivity;
import grl.k9;
import gsi.a;
import hqi.k;
import i0l.c;
import i0l.d;
import i0l.f;
import iqi.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import qc0.b;
import qc0.i;
import te0.r;
import te0.v;
import te0.w;
import zc0.h;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/screen/TradingOnboardingBackendFlowActivity;", "Lqc0/b;", "Lqc0/i;", "Lqc0/l;", "Lno/m;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradingOnboardingBackendFlowActivity extends b {
    public static final /* synthetic */ int K0 = 0;
    public c G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;

    public TradingOnboardingBackendFlowActivity() {
        final int i = 0;
        this.H0 = w.y0(new Function0(this) { // from class: k0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingOnboardingBackendFlowActivity f180063b;

            {
                this.f180063b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradingOnboardingBackendFlowActivity tradingOnboardingBackendFlowActivity = this.f180063b;
                switch (i2) {
                    case 0:
                        int i3 = TradingOnboardingBackendFlowActivity.K0;
                        return (TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.G0();
                    case 1:
                        int i5 = TradingOnboardingBackendFlowActivity.K0;
                        AnalyticsProduct analyticsProduct = ((TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.H0.getValue()).getF104226c().d;
                        if (analyticsProduct != null) {
                            return analyticsProduct;
                        }
                        k9 k9Var = k9.Trading;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
                    default:
                        int i6 = TradingOnboardingBackendFlowActivity.K0;
                        return ((TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.H0.getValue()).getF104226c().f51308a;
                }
            }
        });
        final int i2 = 1;
        this.I0 = w.y0(new Function0(this) { // from class: k0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingOnboardingBackendFlowActivity f180063b;

            {
                this.f180063b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradingOnboardingBackendFlowActivity tradingOnboardingBackendFlowActivity = this.f180063b;
                switch (i22) {
                    case 0:
                        int i3 = TradingOnboardingBackendFlowActivity.K0;
                        return (TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.G0();
                    case 1:
                        int i5 = TradingOnboardingBackendFlowActivity.K0;
                        AnalyticsProduct analyticsProduct = ((TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.H0.getValue()).getF104226c().d;
                        if (analyticsProduct != null) {
                            return analyticsProduct;
                        }
                        k9 k9Var = k9.Trading;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
                    default:
                        int i6 = TradingOnboardingBackendFlowActivity.K0;
                        return ((TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.H0.getValue()).getF104226c().f51308a;
                }
            }
        });
        final int i3 = 2;
        this.J0 = w.y0(new Function0(this) { // from class: k0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingOnboardingBackendFlowActivity f180063b;

            {
                this.f180063b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TradingOnboardingBackendFlowActivity tradingOnboardingBackendFlowActivity = this.f180063b;
                switch (i22) {
                    case 0:
                        int i32 = TradingOnboardingBackendFlowActivity.K0;
                        return (TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.G0();
                    case 1:
                        int i5 = TradingOnboardingBackendFlowActivity.K0;
                        AnalyticsProduct analyticsProduct = ((TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.H0.getValue()).getF104226c().d;
                        if (analyticsProduct != null) {
                            return analyticsProduct;
                        }
                        k9 k9Var = k9.Trading;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
                    default:
                        int i6 = TradingOnboardingBackendFlowActivity.K0;
                        return ((TradingOnboardingBackendFlowContract$Configuration) tradingOnboardingBackendFlowActivity.H0.getValue()).getF104226c().f51308a;
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        c cVar = this.G0;
        if (cVar != null) {
            return (i) cVar.Q.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return (String) this.J0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        c cVar = this.G0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return (AnalyticsProduct) this.I0.getValue();
    }

    @Override // qc0.b
    public final h Z0() {
        c cVar = this.G0;
        if (cVar != null) {
            return (h) cVar.f157443b0.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qc0.b, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        d dVar = ((d) ((f) com.bumptech.glide.c.l(this).b(null, getF82699s0()))).o;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        xpi.f.Companion.getClass();
        ypi.h.Companion.getClass();
        ypi.h hVarA = ypi.h.a(ypi.h.e, null, Integer.valueOf(com.revolut.core.backend_flow.R$id.bottom_note_text), 3);
        hqi.i iVar = new hqi.i(Integer.valueOf(com.revolut.core.backend_flow.R$id.toolbar_progress), k.a.f154719a);
        g gVar = new g(R$id.twinVerticalButton);
        ?? r06 = this.H0;
        TradingOnboardingBackendFlowContract$Configuration tradingOnboardingBackendFlowContract$Configuration = (TradingOnboardingBackendFlowContract$Configuration) r06.getValue();
        tradingOnboardingBackendFlowContract$Configuration.getClass();
        c cVar = new c(dVar, dVarG, hVarA, iVar, gVar, tradingOnboardingBackendFlowContract$Configuration);
        this.G0 = cVar;
        d dVar2 = cVar.f;
        this.f244393r0 = (qc0.k) dVar2.v.get();
        this.f244394s0 = (zd7.b) cVar.f157441a0.get();
        h0l.e eVar = (h0l.e) dVar2.v.get();
        if (eVar == null) {
            Intrinsics.r("state");
            throw null;
        }
        ((h0l.h) eVar).w0().set((TradingOnboardingBackendFlowContract$Configuration) r06.getValue());
        super.onCreate(bundle);
        AnalyticsProduct analyticsProduct = ((TradingOnboardingBackendFlowContract$Configuration) G0()).getF104226c().d;
        if (analyticsProduct != null) {
            qc0.k kVar = this.f244393r0;
            if (kVar == null) {
                Intrinsics.r("backendFlowState");
                throw null;
            }
            v vVarP = kVar.P();
            od0.i.Companion.getClass();
            ((r) vVarP).set(od0.h.a(analyticsProduct));
        }
    }
}
