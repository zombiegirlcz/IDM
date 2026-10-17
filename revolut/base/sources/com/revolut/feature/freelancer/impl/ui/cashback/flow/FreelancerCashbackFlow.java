package com.revolut.feature.freelancer.impl.ui.cashback.flow;

import aii.q;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlow;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import us6.a2;
import us6.c2;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/cashback/flow/FreelancerCashbackFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerCashbackFlow extends ViewController<q> implements f {
    public final FreelancerCashbackFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public FreelancerCashbackFlow(FreelancerCashbackFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: jv6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackFlow f178787b;

            {
                this.f178787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FreelancerCashbackFlow freelancerCashbackFlow = this.f178787b;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCashbackFlow.m2()).a().get(c2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c2.class, " is not found"));
                        }
                        c2 c2Var = ((c2) aVar2.b()).f;
                        FreelancerCashbackFlowContract$InputData freelancerCashbackFlowContract$InputData = freelancerCashbackFlow.K;
                        freelancerCashbackFlowContract$InputData.getClass();
                        return new a2(c2Var, freelancerCashbackFlowContract$InputData);
                    case 1:
                        return (e) ((a2) this.f178787b.L.getValue()).d.get();
                    default:
                        FreelancerCashbackFlow freelancerCashbackFlow2 = this.f178787b;
                        return czi.c.d(0, 6, null, freelancerCashbackFlow2, (e) freelancerCashbackFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: jv6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackFlow f178787b;

            {
                this.f178787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FreelancerCashbackFlow freelancerCashbackFlow = this.f178787b;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCashbackFlow.m2()).a().get(c2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c2.class, " is not found"));
                        }
                        c2 c2Var = ((c2) aVar2.b()).f;
                        FreelancerCashbackFlowContract$InputData freelancerCashbackFlowContract$InputData = freelancerCashbackFlow.K;
                        freelancerCashbackFlowContract$InputData.getClass();
                        return new a2(c2Var, freelancerCashbackFlowContract$InputData);
                    case 1:
                        return (e) ((a2) this.f178787b.L.getValue()).d.get();
                    default:
                        FreelancerCashbackFlow freelancerCashbackFlow2 = this.f178787b;
                        return czi.c.d(0, 6, null, freelancerCashbackFlow2, (e) freelancerCashbackFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: jv6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackFlow f178787b;

            {
                this.f178787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FreelancerCashbackFlow freelancerCashbackFlow = this.f178787b;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerCashbackFlow.m2()).a().get(c2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c2.class, " is not found"));
                        }
                        c2 c2Var = ((c2) aVar2.b()).f;
                        FreelancerCashbackFlowContract$InputData freelancerCashbackFlowContract$InputData = freelancerCashbackFlow.K;
                        freelancerCashbackFlowContract$InputData.getClass();
                        return new a2(c2Var, freelancerCashbackFlowContract$InputData);
                    case 1:
                        return (e) ((a2) this.f178787b.L.getValue()).d.get();
                    default:
                        FreelancerCashbackFlow freelancerCashbackFlow2 = this.f178787b;
                        return czi.c.d(0, 6, null, freelancerCashbackFlow2, (e) freelancerCashbackFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (a2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jv6.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
