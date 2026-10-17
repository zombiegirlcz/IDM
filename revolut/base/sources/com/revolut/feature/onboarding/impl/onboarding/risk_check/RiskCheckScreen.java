package com.revolut.feature.onboarding.impl.onboarding.risk_check;

import android.view.View;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.risk_check.RiskCheckScreen;
import com.revolut.feature.onboarding.impl.onboarding.risk_check.RiskCheckScreenContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import rb9.c;
import rb9.d;
import rb9.e;
import ta9.o;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/risk_check/RiskCheckScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrb9/c;", "Ldli/a;", "Lrb9/e;", "Lno/m;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RiskCheckScreen extends ViewController<c> implements a, m {
    public final RiskCheckScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final AnalyticsProduct.Retail P;

    public RiskCheckScreen(RiskCheckScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: rb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskCheckScreen f252996b;

            {
                this.f252996b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RiskCheckScreen riskCheckScreen = this.f252996b;
                        qji.b bVarU2 = riskCheckScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.risk_check.di.RiskCheckScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        RiskCheckScreenContract$InputData riskCheckScreenContract$InputData = riskCheckScreen.K;
                        riskCheckScreenContract$InputData.getClass();
                        return new ta9.w(mVar, oVar2, riskCheckScreenContract$InputData);
                    case 1:
                        return (d) ((ta9.w) this.f252996b.M.getValue()).f269283c.get();
                    default:
                        RiskCheckScreen riskCheckScreen2 = this.f252996b;
                        return dli.f.a(riskCheckScreen2, (d) riskCheckScreen2.N.getValue(), u.c(new PromptContentDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: rb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskCheckScreen f252996b;

            {
                this.f252996b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RiskCheckScreen riskCheckScreen = this.f252996b;
                        qji.b bVarU2 = riskCheckScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.risk_check.di.RiskCheckScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        RiskCheckScreenContract$InputData riskCheckScreenContract$InputData = riskCheckScreen.K;
                        riskCheckScreenContract$InputData.getClass();
                        return new ta9.w(mVar, oVar2, riskCheckScreenContract$InputData);
                    case 1:
                        return (d) ((ta9.w) this.f252996b.M.getValue()).f269283c.get();
                    default:
                        RiskCheckScreen riskCheckScreen2 = this.f252996b;
                        return dli.f.a(riskCheckScreen2, (d) riskCheckScreen2.N.getValue(), u.c(new PromptContentDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: rb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskCheckScreen f252996b;

            {
                this.f252996b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RiskCheckScreen riskCheckScreen = this.f252996b;
                        qji.b bVarU2 = riskCheckScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.risk_check.di.RiskCheckScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        RiskCheckScreenContract$InputData riskCheckScreenContract$InputData = riskCheckScreen.K;
                        riskCheckScreenContract$InputData.getClass();
                        return new ta9.w(mVar, oVar2, riskCheckScreenContract$InputData);
                    case 1:
                        return (d) ((ta9.w) this.f252996b.M.getValue()).f269283c.get();
                    default:
                        RiskCheckScreen riskCheckScreen2 = this.f252996b;
                        return dli.f.a(riskCheckScreen2, (d) riskCheckScreen2.N.getValue(), u.c(new PromptContentDelegate()), 0, null, null, null, 60);
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.P = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        a.z0((e) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ta9.w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.z = false;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
