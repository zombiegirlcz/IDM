package com.revolut.biometric_verification.impl.ui.flow.launcher;

import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import oq.e;
import pr.v;
import te0.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loq/e;", "Luki/c;", "Lno/d1;", "Lwii/b;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationLauncherFlow extends ViewController<e> implements uki.c, d1, wii.b {
    public final boolean K;
    public final ModalTransitionAnimation.Style.POPUP L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;

    public BiometricVerificationLauncherFlow(BiometricVerificationFlowProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = !inputData.f50456g;
        this.L = ModalTransitionAnimation.Style.POPUP.f98391a;
        this.M = w.y0(new eq8.b(this, inputData, 2));
        this.N = R$layout.screen_transparent;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: es.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationLauncherFlow f128743b;

            {
                this.f128743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((pr.v) this.f128743b.M.getValue()).f238902g.get();
                    default:
                        BiometricVerificationLauncherFlow biometricVerificationLauncherFlow = this.f128743b;
                        return czi.c.a(R$id.screen_transparent_container, (b) biometricVerificationLauncherFlow.O.getValue(), biometricVerificationLauncherFlow);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: es.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationLauncherFlow f128743b;

            {
                this.f128743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((pr.v) this.f128743b.M.getValue()).f238902g.get();
                    default:
                        BiometricVerificationLauncherFlow biometricVerificationLauncherFlow = this.f128743b;
                        return czi.c.a(R$id.screen_transparent_container, (b) biometricVerificationLauncherFlow.O.getValue(), biometricVerificationLauncherFlow);
                }
            }
        });
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0 */
    public final Boolean getL() {
        return Boolean.valueOf(this.K);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (es.b) this.O.getValue();
    }

    @Override // wii.b
    /* JADX INFO: renamed from: d2 */
    public final ModalTransitionAnimation.Style getK() {
        return this.L;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.P.getValue();
    }
}
