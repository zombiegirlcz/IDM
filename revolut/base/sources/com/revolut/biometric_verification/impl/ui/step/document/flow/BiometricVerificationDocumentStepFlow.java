package com.revolut.biometric_verification.impl.ui.step.document.flow;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlow;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import nq.j0;
import pr.q;
import pr.u;
import te0.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnq/j0;", "Luki/c;", "Lno/m;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationDocumentStepFlow extends ViewController<j0> implements uki.c, m {
    public final BiometricVerificationDocumentStepFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final AnalyticsProduct.Shared.Vision P;

    public BiometricVerificationDocumentStepFlow(BiometricVerificationDocumentStepFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ht.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentStepFlow f155098b;

            {
                this.f155098b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BiometricVerificationDocumentStepFlow biometricVerificationDocumentStepFlow = this.f155098b;
                        return czi.c.a(R$id.screen_transparent_container, (b) biometricVerificationDocumentStepFlow.O.getValue(), biometricVerificationDocumentStepFlow);
                    case 1:
                        BiometricVerificationDocumentStepFlow biometricVerificationDocumentStepFlow2 = this.f155098b;
                        q qVarQ = pu7.a.q(biometricVerificationDocumentStepFlow2.m2());
                        Intrinsics.i(qVarQ, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.flow.di.BiometricVerificationDocumentStepFlowInjector");
                        q qVar = qVarQ.f238875l;
                        BiometricVerificationDocumentStepFlowContract$InputData biometricVerificationDocumentStepFlowContract$InputData = biometricVerificationDocumentStepFlow2.K;
                        biometricVerificationDocumentStepFlowContract$InputData.getClass();
                        biometricVerificationDocumentStepFlow2.m2().getClass();
                        return new u(qVar, biometricVerificationDocumentStepFlow2, biometricVerificationDocumentStepFlowContract$InputData);
                    default:
                        return (b) ((u) this.f155098b.N.getValue()).f238898g.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ht.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentStepFlow f155098b;

            {
                this.f155098b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BiometricVerificationDocumentStepFlow biometricVerificationDocumentStepFlow = this.f155098b;
                        return czi.c.a(R$id.screen_transparent_container, (b) biometricVerificationDocumentStepFlow.O.getValue(), biometricVerificationDocumentStepFlow);
                    case 1:
                        BiometricVerificationDocumentStepFlow biometricVerificationDocumentStepFlow2 = this.f155098b;
                        q qVarQ = pu7.a.q(biometricVerificationDocumentStepFlow2.m2());
                        Intrinsics.i(qVarQ, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.flow.di.BiometricVerificationDocumentStepFlowInjector");
                        q qVar = qVarQ.f238875l;
                        BiometricVerificationDocumentStepFlowContract$InputData biometricVerificationDocumentStepFlowContract$InputData = biometricVerificationDocumentStepFlow2.K;
                        biometricVerificationDocumentStepFlowContract$InputData.getClass();
                        biometricVerificationDocumentStepFlow2.m2().getClass();
                        return new u(qVar, biometricVerificationDocumentStepFlow2, biometricVerificationDocumentStepFlowContract$InputData);
                    default:
                        return (b) ((u) this.f155098b.N.getValue()).f238898g.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ht.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationDocumentStepFlow f155098b;

            {
                this.f155098b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BiometricVerificationDocumentStepFlow biometricVerificationDocumentStepFlow = this.f155098b;
                        return czi.c.a(R$id.screen_transparent_container, (b) biometricVerificationDocumentStepFlow.O.getValue(), biometricVerificationDocumentStepFlow);
                    case 1:
                        BiometricVerificationDocumentStepFlow biometricVerificationDocumentStepFlow2 = this.f155098b;
                        q qVarQ = pu7.a.q(biometricVerificationDocumentStepFlow2.m2());
                        Intrinsics.i(qVarQ, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.flow.di.BiometricVerificationDocumentStepFlowInjector");
                        q qVar = qVarQ.f238875l;
                        BiometricVerificationDocumentStepFlowContract$InputData biometricVerificationDocumentStepFlowContract$InputData = biometricVerificationDocumentStepFlow2.K;
                        biometricVerificationDocumentStepFlowContract$InputData.getClass();
                        biometricVerificationDocumentStepFlow2.m2().getClass();
                        return new u(qVar, biometricVerificationDocumentStepFlow2, biometricVerificationDocumentStepFlowContract$InputData);
                    default:
                        return (b) ((u) this.f155098b.N.getValue()).f238898g.get();
                }
            }
        });
        this.P = AnalyticsProduct.Shared.Vision.f;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF82762b0() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (u) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ht.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getG0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.M.getValue();
    }
}
