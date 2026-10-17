package com.revolut.feature.onboarding.impl.qes.waiting_auth;

import cli.a0;
import cli.l;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.impl.qes.waiting_auth.WaitingAuthScreen;
import com.revolut.feature.onboarding.impl.qes.waiting_auth.WaitingAuthScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import frl.a;
import grl.k9;
import kc9.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes/waiting_auth/WaitingAuthScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkc9/g;", "Lcli/w;", "Lcli/l;", "Lno/m;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingAuthScreen extends ViewController<g> implements w, m {
    public final WaitingAuthScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final AnalyticsProduct.Retail O;
    public final Object P;

    public WaitingAuthScreen(WaitingAuthScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: kc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingAuthScreen f182669b;

            {
                this.f182669b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((qc9.g) this.f182669b.P.getValue()).e.get();
                    case 1:
                        WaitingAuthScreen waitingAuthScreen = this.f182669b;
                        return n14.e.a(waitingAuthScreen, (b) waitingAuthScreen.L.getValue());
                    default:
                        WaitingAuthScreen waitingAuthScreen2 = this.f182669b;
                        qji.b bVarU2 = waitingAuthScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes.waiting_auth.di.WaitingOtpScreenInjector");
                        qc9.d dVar = (qc9.d) bVarU2;
                        qc9.c cVar = dVar.f244633b;
                        qc9.d dVar2 = dVar.f244634c;
                        WaitingAuthScreenContract$InputData waitingAuthScreenContract$InputData = waitingAuthScreen2.K;
                        waitingAuthScreenContract$InputData.getClass();
                        return new qc9.g(cVar, dVar2, waitingAuthScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: kc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingAuthScreen f182669b;

            {
                this.f182669b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((qc9.g) this.f182669b.P.getValue()).e.get();
                    case 1:
                        WaitingAuthScreen waitingAuthScreen = this.f182669b;
                        return n14.e.a(waitingAuthScreen, (b) waitingAuthScreen.L.getValue());
                    default:
                        WaitingAuthScreen waitingAuthScreen2 = this.f182669b;
                        qji.b bVarU2 = waitingAuthScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes.waiting_auth.di.WaitingOtpScreenInjector");
                        qc9.d dVar = (qc9.d) bVarU2;
                        qc9.c cVar = dVar.f244633b;
                        qc9.d dVar2 = dVar.f244634c;
                        WaitingAuthScreenContract$InputData waitingAuthScreenContract$InputData = waitingAuthScreen2.K;
                        waitingAuthScreenContract$InputData.getClass();
                        return new qc9.g(cVar, dVar2, waitingAuthScreenContract$InputData);
                }
            }
        });
        this.N = R$layout.screen_transparent;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.k;
        this.O = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: kc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingAuthScreen f182669b;

            {
                this.f182669b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((qc9.g) this.f182669b.P.getValue()).e.get();
                    case 1:
                        WaitingAuthScreen waitingAuthScreen = this.f182669b;
                        return n14.e.a(waitingAuthScreen, (b) waitingAuthScreen.L.getValue());
                    default:
                        WaitingAuthScreen waitingAuthScreen2 = this.f182669b;
                        qji.b bVarU2 = waitingAuthScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes.waiting_auth.di.WaitingOtpScreenInjector");
                        qc9.d dVar = (qc9.d) bVarU2;
                        qc9.c cVar = dVar.f244633b;
                        qc9.d dVar2 = dVar.f244634c;
                        WaitingAuthScreenContract$InputData waitingAuthScreenContract$InputData = waitingAuthScreen2.K;
                        waitingAuthScreenContract$InputData.getClass();
                        return new qc9.g(cVar, dVar2, waitingAuthScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qc9.g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (kc9.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.M.getValue();
    }
}
