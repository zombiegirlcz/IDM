package com.revolut.feature.onboarding.impl.onboarding.biometric;

import com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlow;
import com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ta9.m;
import ta9.n;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lja9/c;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingBiometricFlow extends ViewController<ja9.c> implements f {
    public final OnboardingBiometricFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public OnboardingBiometricFlow(OnboardingBiometricFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ja9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingBiometricFlow f172466b;

            {
                this.f172466b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OnboardingBiometricFlow onboardingBiometricFlow = this.f172466b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingBiometricFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingBiometricFlowContract$InputData onboardingBiometricFlowContract$InputData = onboardingBiometricFlow.K;
                        onboardingBiometricFlowContract$InputData.getClass();
                        return new n(mVar, onboardingBiometricFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f172466b.L.getValue()).f269258b.get();
                    default:
                        OnboardingBiometricFlow onboardingBiometricFlow2 = this.f172466b;
                        return czi.c.d(0, 6, null, onboardingBiometricFlow2, (b) onboardingBiometricFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ja9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingBiometricFlow f172466b;

            {
                this.f172466b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OnboardingBiometricFlow onboardingBiometricFlow = this.f172466b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingBiometricFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingBiometricFlowContract$InputData onboardingBiometricFlowContract$InputData = onboardingBiometricFlow.K;
                        onboardingBiometricFlowContract$InputData.getClass();
                        return new n(mVar, onboardingBiometricFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f172466b.L.getValue()).f269258b.get();
                    default:
                        OnboardingBiometricFlow onboardingBiometricFlow2 = this.f172466b;
                        return czi.c.d(0, 6, null, onboardingBiometricFlow2, (b) onboardingBiometricFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ja9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingBiometricFlow f172466b;

            {
                this.f172466b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OnboardingBiometricFlow onboardingBiometricFlow = this.f172466b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingBiometricFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingBiometricFlowContract$InputData onboardingBiometricFlowContract$InputData = onboardingBiometricFlow.K;
                        onboardingBiometricFlowContract$InputData.getClass();
                        return new n(mVar, onboardingBiometricFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f172466b.L.getValue()).f269258b.get();
                    default:
                        OnboardingBiometricFlow onboardingBiometricFlow2 = this.f172466b;
                        return czi.c.d(0, 6, null, onboardingBiometricFlow2, (b) onboardingBiometricFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ja9.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
