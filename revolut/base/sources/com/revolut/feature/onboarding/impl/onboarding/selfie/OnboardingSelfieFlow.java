package com.revolut.feature.onboarding.impl.onboarding.selfie;

import com.revolut.feature.onboarding.impl.onboarding.selfie.OnboardingSelfieFlow;
import com.revolut.feature.onboarding.impl.onboarding.selfie.OnboardingSelfieFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import ta9.m;
import ta9.r;
import tb9.e;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/selfie/OnboardingSelfieFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltb9/e;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingSelfieFlow extends ViewController<e> implements f {
    public final OnboardingSelfieFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public OnboardingSelfieFlow(OnboardingSelfieFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingSelfieFlow f269507b;

            {
                this.f269507b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OnboardingSelfieFlow onboardingSelfieFlow = this.f269507b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingSelfieFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingSelfieFlowContract$InputData onboardingSelfieFlowContract$InputData = onboardingSelfieFlow.K;
                        onboardingSelfieFlowContract$InputData.getClass();
                        return new r(mVar, onboardingSelfieFlowContract$InputData);
                    case 1:
                        return (b) ((r) this.f269507b.L.getValue()).f269271b.get();
                    default:
                        OnboardingSelfieFlow onboardingSelfieFlow2 = this.f269507b;
                        return czi.c.d(0, 6, null, onboardingSelfieFlow2, (b) onboardingSelfieFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: tb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingSelfieFlow f269507b;

            {
                this.f269507b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OnboardingSelfieFlow onboardingSelfieFlow = this.f269507b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingSelfieFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingSelfieFlowContract$InputData onboardingSelfieFlowContract$InputData = onboardingSelfieFlow.K;
                        onboardingSelfieFlowContract$InputData.getClass();
                        return new r(mVar, onboardingSelfieFlowContract$InputData);
                    case 1:
                        return (b) ((r) this.f269507b.L.getValue()).f269271b.get();
                    default:
                        OnboardingSelfieFlow onboardingSelfieFlow2 = this.f269507b;
                        return czi.c.d(0, 6, null, onboardingSelfieFlow2, (b) onboardingSelfieFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: tb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingSelfieFlow f269507b;

            {
                this.f269507b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OnboardingSelfieFlow onboardingSelfieFlow = this.f269507b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingSelfieFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingSelfieFlowContract$InputData onboardingSelfieFlowContract$InputData = onboardingSelfieFlow.K;
                        onboardingSelfieFlowContract$InputData.getClass();
                        return new r(mVar, onboardingSelfieFlowContract$InputData);
                    case 1:
                        return (b) ((r) this.f269507b.L.getValue()).f269271b.get();
                    default:
                        OnboardingSelfieFlow onboardingSelfieFlow2 = this.f269507b;
                        return czi.c.d(0, 6, null, onboardingSelfieFlow2, (b) onboardingSelfieFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (r) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tb9.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
