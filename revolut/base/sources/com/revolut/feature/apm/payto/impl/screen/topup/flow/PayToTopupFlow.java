package com.revolut.feature.apm.payto.impl.screen.topup.flow;

import aii.q;
import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlow;
import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nb2.d;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/topup/flow/PayToTopupFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayToTopupFlow extends ViewController<q> implements f {
    public final PayToTopupFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PayToTopupFlow(PayToTopupFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ub2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupFlow f278727b;

            {
                this.f278727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((d) this.f278727b.M.getValue()).d.get();
                    case 1:
                        PayToTopupFlow payToTopupFlow = this.f278727b;
                        phm.a aVar = (phm.a) e.j(payToTopupFlow.m2()).a().get(nb2.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nb2.b.class, " is not found"));
                        }
                        nb2.b bVar = ((nb2.b) aVar2.b()).f213966m;
                        PayToTopupFlowContract$InputData payToTopupFlowContract$InputData = payToTopupFlow.K;
                        payToTopupFlowContract$InputData.getClass();
                        return new d(bVar, payToTopupFlowContract$InputData);
                    default:
                        PayToTopupFlow payToTopupFlow2 = this.f278727b;
                        return c.d(0, 6, null, payToTopupFlow2, (b) payToTopupFlow2.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ub2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupFlow f278727b;

            {
                this.f278727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((d) this.f278727b.M.getValue()).d.get();
                    case 1:
                        PayToTopupFlow payToTopupFlow = this.f278727b;
                        phm.a aVar = (phm.a) e.j(payToTopupFlow.m2()).a().get(nb2.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nb2.b.class, " is not found"));
                        }
                        nb2.b bVar = ((nb2.b) aVar2.b()).f213966m;
                        PayToTopupFlowContract$InputData payToTopupFlowContract$InputData = payToTopupFlow.K;
                        payToTopupFlowContract$InputData.getClass();
                        return new d(bVar, payToTopupFlowContract$InputData);
                    default:
                        PayToTopupFlow payToTopupFlow2 = this.f278727b;
                        return c.d(0, 6, null, payToTopupFlow2, (b) payToTopupFlow2.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ub2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupFlow f278727b;

            {
                this.f278727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((d) this.f278727b.M.getValue()).d.get();
                    case 1:
                        PayToTopupFlow payToTopupFlow = this.f278727b;
                        phm.a aVar = (phm.a) e.j(payToTopupFlow.m2()).a().get(nb2.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nb2.b.class, " is not found"));
                        }
                        nb2.b bVar = ((nb2.b) aVar2.b()).f213966m;
                        PayToTopupFlowContract$InputData payToTopupFlowContract$InputData = payToTopupFlow.K;
                        payToTopupFlowContract$InputData.getClass();
                        return new d(bVar, payToTopupFlowContract$InputData);
                    default:
                        PayToTopupFlow payToTopupFlow2 = this.f278727b;
                        return c.d(0, 6, null, payToTopupFlow2, (b) payToTopupFlow2.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ub2.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
