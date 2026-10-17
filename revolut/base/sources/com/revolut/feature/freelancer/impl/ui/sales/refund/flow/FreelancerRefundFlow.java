package com.revolut.feature.freelancer.impl.ui.sales.refund.flow;

import a0.d;
import aii.q;
import com.revolut.feature.freelancer.impl.ui.sales.refund.flow.FreelancerRefundFlow;
import com.revolut.feature.freelancer.impl.ui.sales.refund.flow.FreelancerRefundFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import us6.v0;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/refund/flow/FreelancerRefundFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerRefundFlow extends ViewController<q> implements f {
    public final FreelancerRefundFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public FreelancerRefundFlow(FreelancerRefundFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: n27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerRefundFlow f211448b;

            {
                this.f211448b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FreelancerRefundFlow freelancerRefundFlow = this.f211448b;
                        phm.a aVar = (phm.a) e.j(freelancerRefundFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerRefundFlowContract$InputData freelancerRefundFlowContract$InputData = freelancerRefundFlow.K;
                        freelancerRefundFlowContract$InputData.getClass();
                        return new v0(qVar, freelancerRefundFlowContract$InputData);
                    case 1:
                        return (b) ((v0) this.f211448b.L.getValue()).d.get();
                    default:
                        FreelancerRefundFlow freelancerRefundFlow2 = this.f211448b;
                        return c.d(0, 6, null, freelancerRefundFlow2, (b) freelancerRefundFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: n27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerRefundFlow f211448b;

            {
                this.f211448b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FreelancerRefundFlow freelancerRefundFlow = this.f211448b;
                        phm.a aVar = (phm.a) e.j(freelancerRefundFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerRefundFlowContract$InputData freelancerRefundFlowContract$InputData = freelancerRefundFlow.K;
                        freelancerRefundFlowContract$InputData.getClass();
                        return new v0(qVar, freelancerRefundFlowContract$InputData);
                    case 1:
                        return (b) ((v0) this.f211448b.L.getValue()).d.get();
                    default:
                        FreelancerRefundFlow freelancerRefundFlow2 = this.f211448b;
                        return c.d(0, 6, null, freelancerRefundFlow2, (b) freelancerRefundFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: n27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerRefundFlow f211448b;

            {
                this.f211448b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FreelancerRefundFlow freelancerRefundFlow = this.f211448b;
                        phm.a aVar = (phm.a) e.j(freelancerRefundFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerRefundFlowContract$InputData freelancerRefundFlowContract$InputData = freelancerRefundFlow.K;
                        freelancerRefundFlowContract$InputData.getClass();
                        return new v0(qVar, freelancerRefundFlowContract$InputData);
                    case 1:
                        return (b) ((v0) this.f211448b.L.getValue()).d.get();
                    default:
                        FreelancerRefundFlow freelancerRefundFlow2 = this.f211448b;
                        return c.d(0, 6, null, freelancerRefundFlow2, (b) freelancerRefundFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (v0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n27.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
