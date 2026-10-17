package com.revolut.feature.junior_onboarding.impl.ui.onboarding;

import com.revolut.feature.junior_onboarding.impl.ui.onboarding.JuniorOnboardingFlow;
import com.revolut.feature.junior_onboarding.impl.ui.onboarding.JuniorOnboardingFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qh8.j;
import qh8.k;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/onboarding/JuniorOnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorOnboardingFlow extends ViewController<Object> implements f {
    public final JuniorOnboardingFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public JuniorOnboardingFlow(JuniorOnboardingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: di8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorOnboardingFlow f114944b;

            {
                this.f114944b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorOnboardingFlow juniorOnboardingFlow = this.f114944b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorOnboardingFlow, (b) juniorOnboardingFlow.O.getValue());
                    case 1:
                        JuniorOnboardingFlow juniorOnboardingFlow2 = this.f114944b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorOnboardingFlow2.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).f246539n;
                        JuniorOnboardingFlowContract$InputData juniorOnboardingFlowContract$InputData = juniorOnboardingFlow2.K;
                        juniorOnboardingFlowContract$InputData.getClass();
                        return new qh8.j(kVar, juniorOnboardingFlowContract$InputData);
                    default:
                        return (b) ((qh8.j) this.f114944b.N.getValue()).f246530b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: di8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorOnboardingFlow f114944b;

            {
                this.f114944b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorOnboardingFlow juniorOnboardingFlow = this.f114944b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorOnboardingFlow, (b) juniorOnboardingFlow.O.getValue());
                    case 1:
                        JuniorOnboardingFlow juniorOnboardingFlow2 = this.f114944b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorOnboardingFlow2.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).f246539n;
                        JuniorOnboardingFlowContract$InputData juniorOnboardingFlowContract$InputData = juniorOnboardingFlow2.K;
                        juniorOnboardingFlowContract$InputData.getClass();
                        return new qh8.j(kVar, juniorOnboardingFlowContract$InputData);
                    default:
                        return (b) ((qh8.j) this.f114944b.N.getValue()).f246530b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: di8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorOnboardingFlow f114944b;

            {
                this.f114944b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JuniorOnboardingFlow juniorOnboardingFlow = this.f114944b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorOnboardingFlow, (b) juniorOnboardingFlow.O.getValue());
                    case 1:
                        JuniorOnboardingFlow juniorOnboardingFlow2 = this.f114944b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorOnboardingFlow2.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).f246539n;
                        JuniorOnboardingFlowContract$InputData juniorOnboardingFlowContract$InputData = juniorOnboardingFlow2.K;
                        juniorOnboardingFlowContract$InputData.getClass();
                        return new qh8.j(kVar, juniorOnboardingFlowContract$InputData);
                    default:
                        return (b) ((qh8.j) this.f114944b.N.getValue()).f246530b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (di8.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
