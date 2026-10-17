package com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow;

import a0.d;
import aii.q;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.FreelancerPluginAuthFlow;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.FreelancerPluginAuthFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import us6.i0;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/auth/flow/FreelancerPluginAuthFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPluginAuthFlow extends ViewController<q> implements f {
    public final FreelancerPluginAuthFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public FreelancerPluginAuthFlow(FreelancerPluginAuthFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginAuthFlow f219785b;

            {
                this.f219785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FreelancerPluginAuthFlow freelancerPluginAuthFlow = this.f219785b;
                        phm.a aVar = (phm.a) e.j(freelancerPluginAuthFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerPluginAuthFlowContract$InputData freelancerPluginAuthFlowContract$InputData = freelancerPluginAuthFlow.K;
                        freelancerPluginAuthFlowContract$InputData.getClass();
                        return new i0(qVar, freelancerPluginAuthFlowContract$InputData);
                    case 1:
                        return (b) ((i0) this.f219785b.L.getValue()).d.get();
                    default:
                        FreelancerPluginAuthFlow freelancerPluginAuthFlow2 = this.f219785b;
                        return c.d(0, 6, null, freelancerPluginAuthFlow2, (b) freelancerPluginAuthFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginAuthFlow f219785b;

            {
                this.f219785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FreelancerPluginAuthFlow freelancerPluginAuthFlow = this.f219785b;
                        phm.a aVar = (phm.a) e.j(freelancerPluginAuthFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerPluginAuthFlowContract$InputData freelancerPluginAuthFlowContract$InputData = freelancerPluginAuthFlow.K;
                        freelancerPluginAuthFlowContract$InputData.getClass();
                        return new i0(qVar, freelancerPluginAuthFlowContract$InputData);
                    case 1:
                        return (b) ((i0) this.f219785b.L.getValue()).d.get();
                    default:
                        FreelancerPluginAuthFlow freelancerPluginAuthFlow2 = this.f219785b;
                        return c.d(0, 6, null, freelancerPluginAuthFlow2, (b) freelancerPluginAuthFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: nw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginAuthFlow f219785b;

            {
                this.f219785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FreelancerPluginAuthFlow freelancerPluginAuthFlow = this.f219785b;
                        phm.a aVar = (phm.a) e.j(freelancerPluginAuthFlow.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        FreelancerPluginAuthFlowContract$InputData freelancerPluginAuthFlowContract$InputData = freelancerPluginAuthFlow.K;
                        freelancerPluginAuthFlowContract$InputData.getClass();
                        return new i0(qVar, freelancerPluginAuthFlowContract$InputData);
                    case 1:
                        return (b) ((i0) this.f219785b.L.getValue()).d.get();
                    default:
                        FreelancerPluginAuthFlow freelancerPluginAuthFlow2 = this.f219785b;
                        return c.d(0, 6, null, freelancerPluginAuthFlow2, (b) freelancerPluginAuthFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (i0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (nw6.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
