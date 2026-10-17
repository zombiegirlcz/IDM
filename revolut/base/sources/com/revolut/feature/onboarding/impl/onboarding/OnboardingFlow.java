package com.revolut.feature.onboarding.impl.onboarding;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlow;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lq89/d;", "Luki/c;", "Lno/m;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingFlow extends ViewController<q89.d> implements uki.c, no.m {
    public final OnboardingFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final AnalyticsProduct.Retail N;
    public final int O;
    public final Object P;

    public OnboardingFlow(OnboardingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ga9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingFlow f142064b;

            {
                this.f142064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OnboardingFlow onboardingFlow = this.f142064b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingFlow.m2()).a().get(ta9.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ta9.m.class, " is not found"));
                        }
                        ta9.m mVar = ((ta9.m) aVar2.b()).O;
                        OnboardingFlowContract$InputData onboardingFlowContract$InputData = onboardingFlow.K;
                        onboardingFlowContract$InputData.getClass();
                        return new ta9.o(mVar, onboardingFlowContract$InputData);
                    case 1:
                        OnboardingFlow onboardingFlow2 = this.f142064b;
                        return czi.c.a(R$id.container, (d) onboardingFlow2.P.getValue(), onboardingFlow2);
                    default:
                        return (d) ((ta9.o) this.f142064b.L.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ga9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingFlow f142064b;

            {
                this.f142064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OnboardingFlow onboardingFlow = this.f142064b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingFlow.m2()).a().get(ta9.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ta9.m.class, " is not found"));
                        }
                        ta9.m mVar = ((ta9.m) aVar2.b()).O;
                        OnboardingFlowContract$InputData onboardingFlowContract$InputData = onboardingFlow.K;
                        onboardingFlowContract$InputData.getClass();
                        return new ta9.o(mVar, onboardingFlowContract$InputData);
                    case 1:
                        OnboardingFlow onboardingFlow2 = this.f142064b;
                        return czi.c.a(R$id.container, (d) onboardingFlow2.P.getValue(), onboardingFlow2);
                    default:
                        return (d) ((ta9.o) this.f142064b.L.getValue()).d.get();
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.N = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.O = R$layout.base_flow_container;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ga9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingFlow f142064b;

            {
                this.f142064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OnboardingFlow onboardingFlow = this.f142064b;
                        phm.a aVar = (phm.a) ue0.e.j(onboardingFlow.m2()).a().get(ta9.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ta9.m.class, " is not found"));
                        }
                        ta9.m mVar = ((ta9.m) aVar2.b()).O;
                        OnboardingFlowContract$InputData onboardingFlowContract$InputData = onboardingFlow.K;
                        onboardingFlowContract$InputData.getClass();
                        return new ta9.o(mVar, onboardingFlowContract$InputData);
                    case 1:
                        OnboardingFlow onboardingFlow2 = this.f142064b;
                        return czi.c.a(R$id.container, (d) onboardingFlow2.P.getValue(), onboardingFlow2);
                    default:
                        return (d) ((ta9.o) this.f142064b.L.getValue()).d.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ta9.o) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ta9.o) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ga9.d) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.M.getValue();
    }
}
