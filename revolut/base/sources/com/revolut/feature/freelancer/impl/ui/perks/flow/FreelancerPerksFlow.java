package com.revolut.feature.freelancer.impl.ui.perks.flow;

import aii.q;
import com.revolut.feature.freelancer.impl.ui.perks.flow.FreelancerPerksFlow;
import com.revolut.feature.freelancer.impl.ui.perks.flow.FreelancerPerksFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import us6.g0;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/perks/flow/FreelancerPerksFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPerksFlow extends ViewController<q> implements f {
    public final FreelancerPerksFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public FreelancerPerksFlow(FreelancerPerksFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPerksFlow f293400b;

            {
                this.f293400b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FreelancerPerksFlow freelancerPerksFlow = this.f293400b;
                        phm.a aVar = (phm.a) e.j(freelancerPerksFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerPerksFlowContract$InputData freelancerPerksFlowContract$InputData = freelancerPerksFlow.K;
                        freelancerPerksFlowContract$InputData.getClass();
                        return new g0(qVar, freelancerPerksFlowContract$InputData);
                    case 1:
                        return (b) ((g0) this.f293400b.M.getValue()).d.get();
                    default:
                        FreelancerPerksFlow freelancerPerksFlow2 = this.f293400b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, freelancerPerksFlow2, (b) freelancerPerksFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPerksFlow f293400b;

            {
                this.f293400b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FreelancerPerksFlow freelancerPerksFlow = this.f293400b;
                        phm.a aVar = (phm.a) e.j(freelancerPerksFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerPerksFlowContract$InputData freelancerPerksFlowContract$InputData = freelancerPerksFlow.K;
                        freelancerPerksFlowContract$InputData.getClass();
                        return new g0(qVar, freelancerPerksFlowContract$InputData);
                    case 1:
                        return (b) ((g0) this.f293400b.M.getValue()).d.get();
                    default:
                        FreelancerPerksFlow freelancerPerksFlow2 = this.f293400b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, freelancerPerksFlow2, (b) freelancerPerksFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: vz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPerksFlow f293400b;

            {
                this.f293400b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FreelancerPerksFlow freelancerPerksFlow = this.f293400b;
                        phm.a aVar = (phm.a) e.j(freelancerPerksFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerPerksFlowContract$InputData freelancerPerksFlowContract$InputData = freelancerPerksFlow.K;
                        freelancerPerksFlowContract$InputData.getClass();
                        return new g0(qVar, freelancerPerksFlowContract$InputData);
                    case 1:
                        return (b) ((g0) this.f293400b.M.getValue()).d.get();
                    default:
                        FreelancerPerksFlow freelancerPerksFlow2 = this.f293400b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, freelancerPerksFlow2, (b) freelancerPerksFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vz6.b) this.N.getValue();
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
