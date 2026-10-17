package com.revolut.feature.onboarding.impl.qes.waiting_qes_result;

import cli.a0;
import cli.l;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreen;
import com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qc9.f;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/onboarding/impl/qes/waiting_qes_result/a;", "Lcli/w;", "Lcli/l;", "Lno/m;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingForQesResultScreen extends ViewController<a> implements w, m {
    public final WaitingForQesResultScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct.Retail M;
    public final Object N;
    public final Object O;
    public final Object P;

    public WaitingForQesResultScreen(WaitingForQesResultScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: mc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingForQesResultScreen f204309b;

            {
                this.f204309b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WaitingForQesResultScreen waitingForQesResultScreen = this.f204309b;
                        qji.b bVarU2 = waitingForQesResultScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes.waiting_qes_result.di.WaitingForQesResultScreenInjector");
                        qc9.d dVar = (qc9.d) bVarU2;
                        qc9.c cVar = dVar.f244633b;
                        qc9.d dVar2 = dVar.f244634c;
                        WaitingForQesResultScreenContract$InputData waitingForQesResultScreenContract$InputData = waitingForQesResultScreen.K;
                        waitingForQesResultScreenContract$InputData.getClass();
                        return new qc9.f(cVar, dVar2, waitingForQesResultScreenContract$InputData);
                    case 1:
                        return (b) ((qc9.f) this.f204309b.N.getValue()).d.get();
                    default:
                        WaitingForQesResultScreen waitingForQesResultScreen2 = this.f204309b;
                        return n14.e.a(waitingForQesResultScreen2, (b) waitingForQesResultScreen2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: mc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingForQesResultScreen f204309b;

            {
                this.f204309b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WaitingForQesResultScreen waitingForQesResultScreen = this.f204309b;
                        qji.b bVarU2 = waitingForQesResultScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes.waiting_qes_result.di.WaitingForQesResultScreenInjector");
                        qc9.d dVar = (qc9.d) bVarU2;
                        qc9.c cVar = dVar.f244633b;
                        qc9.d dVar2 = dVar.f244634c;
                        WaitingForQesResultScreenContract$InputData waitingForQesResultScreenContract$InputData = waitingForQesResultScreen.K;
                        waitingForQesResultScreenContract$InputData.getClass();
                        return new qc9.f(cVar, dVar2, waitingForQesResultScreenContract$InputData);
                    case 1:
                        return (b) ((qc9.f) this.f204309b.N.getValue()).d.get();
                    default:
                        WaitingForQesResultScreen waitingForQesResultScreen2 = this.f204309b;
                        return n14.e.a(waitingForQesResultScreen2, (b) waitingForQesResultScreen2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: mc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingForQesResultScreen f204309b;

            {
                this.f204309b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        WaitingForQesResultScreen waitingForQesResultScreen = this.f204309b;
                        qji.b bVarU2 = waitingForQesResultScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes.waiting_qes_result.di.WaitingForQesResultScreenInjector");
                        qc9.d dVar = (qc9.d) bVarU2;
                        qc9.c cVar = dVar.f244633b;
                        qc9.d dVar2 = dVar.f244634c;
                        WaitingForQesResultScreenContract$InputData waitingForQesResultScreenContract$InputData = waitingForQesResultScreen.K;
                        waitingForQesResultScreenContract$InputData.getClass();
                        return new qc9.f(cVar, dVar2, waitingForQesResultScreenContract$InputData);
                    case 1:
                        return (b) ((qc9.f) this.f204309b.N.getValue()).d.get();
                    default:
                        WaitingForQesResultScreen waitingForQesResultScreen2 = this.f204309b;
                        return n14.e.a(waitingForQesResultScreen2, (b) waitingForQesResultScreen2.O.getValue());
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
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (mc9.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
