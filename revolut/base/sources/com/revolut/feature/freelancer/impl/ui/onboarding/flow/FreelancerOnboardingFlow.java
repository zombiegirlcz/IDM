package com.revolut.feature.freelancer.impl.ui.onboarding.flow;

import android.app.Activity;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlow;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nz6.c;
import te0.w;
import us6.d0;
import us6.q;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnz6/c;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerOnboardingFlow extends ViewController<c> implements f {
    public final FreelancerOnboardingFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public FreelancerOnboardingFlow(FreelancerOnboardingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerOnboardingFlow f220955b;

            {
                this.f220955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FreelancerOnboardingFlow freelancerOnboardingFlow = this.f220955b;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerOnboardingFlow.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerOnboardingFlowContract$InputData freelancerOnboardingFlowContract$InputData = freelancerOnboardingFlow.K;
                        freelancerOnboardingFlowContract$InputData.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = freelancerOnboardingFlow.m2();
                        dVar.getClass();
                        return new d0(qVar, freelancerOnboardingFlowContract$InputData, zfe.d.a(activityM2));
                    case 1:
                        return (b) ((d0) this.f220955b.M.getValue()).e.get();
                    default:
                        FreelancerOnboardingFlow freelancerOnboardingFlow2 = this.f220955b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, freelancerOnboardingFlow2, (b) freelancerOnboardingFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerOnboardingFlow f220955b;

            {
                this.f220955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FreelancerOnboardingFlow freelancerOnboardingFlow = this.f220955b;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerOnboardingFlow.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerOnboardingFlowContract$InputData freelancerOnboardingFlowContract$InputData = freelancerOnboardingFlow.K;
                        freelancerOnboardingFlowContract$InputData.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = freelancerOnboardingFlow.m2();
                        dVar.getClass();
                        return new d0(qVar, freelancerOnboardingFlowContract$InputData, zfe.d.a(activityM2));
                    case 1:
                        return (b) ((d0) this.f220955b.M.getValue()).e.get();
                    default:
                        FreelancerOnboardingFlow freelancerOnboardingFlow2 = this.f220955b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, freelancerOnboardingFlow2, (b) freelancerOnboardingFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: nz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerOnboardingFlow f220955b;

            {
                this.f220955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FreelancerOnboardingFlow freelancerOnboardingFlow = this.f220955b;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerOnboardingFlow.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerOnboardingFlowContract$InputData freelancerOnboardingFlowContract$InputData = freelancerOnboardingFlow.K;
                        freelancerOnboardingFlowContract$InputData.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = freelancerOnboardingFlow.m2();
                        dVar.getClass();
                        return new d0(qVar, freelancerOnboardingFlowContract$InputData, zfe.d.a(activityM2));
                    case 1:
                        return (b) ((d0) this.f220955b.M.getValue()).e.get();
                    default:
                        FreelancerOnboardingFlow freelancerOnboardingFlow2 = this.f220955b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, freelancerOnboardingFlow2, (b) freelancerOnboardingFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (nz6.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
