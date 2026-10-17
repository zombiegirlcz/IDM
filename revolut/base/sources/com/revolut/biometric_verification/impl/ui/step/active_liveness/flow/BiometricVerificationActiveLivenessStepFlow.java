package com.revolut.biometric_verification.impl.ui.step.active_liveness.flow;

import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlow;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nq.j0;
import pr.m;
import pr.q;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnq/j0;", "Luki/c;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationActiveLivenessStepFlow extends ViewController<j0> implements uki.c {
    public final BiometricVerificationActiveLivenessStepFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BiometricVerificationActiveLivenessStepFlow(BiometricVerificationActiveLivenessStepFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ks.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessStepFlow f189047b;

            {
                this.f189047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BiometricVerificationActiveLivenessStepFlow biometricVerificationActiveLivenessStepFlow = this.f189047b;
                        return czi.c.a(R$id.screen_transparent_container, (c) biometricVerificationActiveLivenessStepFlow.O.getValue(), biometricVerificationActiveLivenessStepFlow);
                    case 1:
                        BiometricVerificationActiveLivenessStepFlow biometricVerificationActiveLivenessStepFlow2 = this.f189047b;
                        q qVarQ = pu7.a.q(biometricVerificationActiveLivenessStepFlow2.m2());
                        Intrinsics.i(qVarQ, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.di.BiometricVerificationActiveLivenessStepFlowInjector");
                        q qVar = qVarQ.f238875l;
                        BiometricVerificationActiveLivenessStepFlowContract$InputData biometricVerificationActiveLivenessStepFlowContract$InputData = biometricVerificationActiveLivenessStepFlow2.K;
                        biometricVerificationActiveLivenessStepFlowContract$InputData.getClass();
                        return new pr.m(qVar, biometricVerificationActiveLivenessStepFlow2, biometricVerificationActiveLivenessStepFlowContract$InputData);
                    default:
                        return (c) ((pr.m) this.f189047b.N.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ks.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessStepFlow f189047b;

            {
                this.f189047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BiometricVerificationActiveLivenessStepFlow biometricVerificationActiveLivenessStepFlow = this.f189047b;
                        return czi.c.a(R$id.screen_transparent_container, (c) biometricVerificationActiveLivenessStepFlow.O.getValue(), biometricVerificationActiveLivenessStepFlow);
                    case 1:
                        BiometricVerificationActiveLivenessStepFlow biometricVerificationActiveLivenessStepFlow2 = this.f189047b;
                        q qVarQ = pu7.a.q(biometricVerificationActiveLivenessStepFlow2.m2());
                        Intrinsics.i(qVarQ, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.di.BiometricVerificationActiveLivenessStepFlowInjector");
                        q qVar = qVarQ.f238875l;
                        BiometricVerificationActiveLivenessStepFlowContract$InputData biometricVerificationActiveLivenessStepFlowContract$InputData = biometricVerificationActiveLivenessStepFlow2.K;
                        biometricVerificationActiveLivenessStepFlowContract$InputData.getClass();
                        return new pr.m(qVar, biometricVerificationActiveLivenessStepFlow2, biometricVerificationActiveLivenessStepFlowContract$InputData);
                    default:
                        return (c) ((pr.m) this.f189047b.N.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ks.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationActiveLivenessStepFlow f189047b;

            {
                this.f189047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BiometricVerificationActiveLivenessStepFlow biometricVerificationActiveLivenessStepFlow = this.f189047b;
                        return czi.c.a(R$id.screen_transparent_container, (c) biometricVerificationActiveLivenessStepFlow.O.getValue(), biometricVerificationActiveLivenessStepFlow);
                    case 1:
                        BiometricVerificationActiveLivenessStepFlow biometricVerificationActiveLivenessStepFlow2 = this.f189047b;
                        q qVarQ = pu7.a.q(biometricVerificationActiveLivenessStepFlow2.m2());
                        Intrinsics.i(qVarQ, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.di.BiometricVerificationActiveLivenessStepFlowInjector");
                        q qVar = qVarQ.f238875l;
                        BiometricVerificationActiveLivenessStepFlowContract$InputData biometricVerificationActiveLivenessStepFlowContract$InputData = biometricVerificationActiveLivenessStepFlow2.K;
                        biometricVerificationActiveLivenessStepFlowContract$InputData.getClass();
                        return new pr.m(qVar, biometricVerificationActiveLivenessStepFlow2, biometricVerificationActiveLivenessStepFlowContract$InputData);
                    default:
                        return (c) ((pr.m) this.f189047b.N.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (m) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ks.c) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
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
