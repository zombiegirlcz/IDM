package com.revolut.biometric_verification.impl.ui.step.selfie_search.flow;

import com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.BiometricVerificationSelfieSearchFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mhd.b;
import nq.j0;
import pr.f0;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/selfie_search/flow/BiometricVerificationSelfieSearchFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnq/j0;", "Luki/c;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationSelfieSearchFlow extends ViewController<j0> implements c {
    public final Object K;
    public final Object L;
    public final Object M;

    public BiometricVerificationSelfieSearchFlow(mu.c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: mu.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationSelfieSearchFlow f208940b;

            {
                this.f208940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BiometricVerificationSelfieSearchFlow biometricVerificationSelfieSearchFlow = this.f208940b;
                        return czi.c.a(R$id.screen_transparent_container, (b) biometricVerificationSelfieSearchFlow.M.getValue(), biometricVerificationSelfieSearchFlow);
                    default:
                        return (b) ((f0) this.f208940b.L.getValue()).f238843b.get();
                }
            }
        });
        this.L = w.y0(new b(this, inputData, 18));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: mu.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationSelfieSearchFlow f208940b;

            {
                this.f208940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BiometricVerificationSelfieSearchFlow biometricVerificationSelfieSearchFlow = this.f208940b;
                        return czi.c.a(R$id.screen_transparent_container, (b) biometricVerificationSelfieSearchFlow.M.getValue(), biometricVerificationSelfieSearchFlow);
                    default:
                        return (b) ((f0) this.f208940b.L.getValue()).f238843b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (f0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mu.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getK() {
        return R$layout.screen_transparent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.K.getValue();
    }
}
