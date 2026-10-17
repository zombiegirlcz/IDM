package com.revolut.feature.onboarding.impl.onboarding.product_lifecycle;

import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlow;
import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pb9.h;
import qji.b;
import ta9.m;
import ta9.q;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/product_lifecycle/OnboardingProductLifecycleFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpb9/h;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingProductLifecycleFlow extends ViewController<h> implements f {
    public final OnboardingProductLifecycleFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public OnboardingProductLifecycleFlow(OnboardingProductLifecycleFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingProductLifecycleFlow f234661b;

            {
                this.f234661b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OnboardingProductLifecycleFlow onboardingProductLifecycleFlow = this.f234661b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingProductLifecycleFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingProductLifecycleFlowContract$InputData onboardingProductLifecycleFlowContract$InputData = onboardingProductLifecycleFlow.K;
                        onboardingProductLifecycleFlowContract$InputData.getClass();
                        return new q(mVar, onboardingProductLifecycleFlowContract$InputData);
                    case 1:
                        return (b) ((q) this.f234661b.M.getValue()).f269268b.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        OnboardingProductLifecycleFlow onboardingProductLifecycleFlow2 = this.f234661b;
                        return czi.c.d(i2, 4, null, onboardingProductLifecycleFlow2, (b) onboardingProductLifecycleFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingProductLifecycleFlow f234661b;

            {
                this.f234661b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OnboardingProductLifecycleFlow onboardingProductLifecycleFlow = this.f234661b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingProductLifecycleFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingProductLifecycleFlowContract$InputData onboardingProductLifecycleFlowContract$InputData = onboardingProductLifecycleFlow.K;
                        onboardingProductLifecycleFlowContract$InputData.getClass();
                        return new q(mVar, onboardingProductLifecycleFlowContract$InputData);
                    case 1:
                        return (b) ((q) this.f234661b.M.getValue()).f269268b.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        OnboardingProductLifecycleFlow onboardingProductLifecycleFlow2 = this.f234661b;
                        return czi.c.d(i22, 4, null, onboardingProductLifecycleFlow2, (b) onboardingProductLifecycleFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: pb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingProductLifecycleFlow f234661b;

            {
                this.f234661b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OnboardingProductLifecycleFlow onboardingProductLifecycleFlow = this.f234661b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingProductLifecycleFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        OnboardingProductLifecycleFlowContract$InputData onboardingProductLifecycleFlowContract$InputData = onboardingProductLifecycleFlow.K;
                        onboardingProductLifecycleFlowContract$InputData.getClass();
                        return new q(mVar, onboardingProductLifecycleFlowContract$InputData);
                    case 1:
                        return (b) ((q) this.f234661b.M.getValue()).f269268b.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        OnboardingProductLifecycleFlow onboardingProductLifecycleFlow2 = this.f234661b;
                        return czi.c.d(i22, 4, null, onboardingProductLifecycleFlow2, (b) onboardingProductLifecycleFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (q) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (pb9.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
