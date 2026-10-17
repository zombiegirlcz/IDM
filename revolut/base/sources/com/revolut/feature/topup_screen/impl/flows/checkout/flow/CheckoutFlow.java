package com.revolut.feature.topup_screen.impl.flows.checkout.flow;

import aii.q;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlow;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ove.b0;
import ove.d0;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckoutFlow extends ViewController<q> implements f {
    public final CheckoutFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CheckoutFlow(CheckoutFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutFlow f249886b;

            {
                this.f249886b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CheckoutFlow checkoutFlow = this.f249886b;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).F;
                        CheckoutFlowContract$InputData checkoutFlowContract$InputData = checkoutFlow.K;
                        checkoutFlowContract$InputData.getClass();
                        return new b0(d0Var, new agk.a(), checkoutFlowContract$InputData);
                    case 1:
                        return (b) ((b0) this.f249886b.L.getValue()).f230040q.get();
                    default:
                        CheckoutFlow checkoutFlow2 = this.f249886b;
                        return czi.c.d(0, 6, null, checkoutFlow2, (b) checkoutFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: qwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutFlow f249886b;

            {
                this.f249886b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CheckoutFlow checkoutFlow = this.f249886b;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).F;
                        CheckoutFlowContract$InputData checkoutFlowContract$InputData = checkoutFlow.K;
                        checkoutFlowContract$InputData.getClass();
                        return new b0(d0Var, new agk.a(), checkoutFlowContract$InputData);
                    case 1:
                        return (b) ((b0) this.f249886b.L.getValue()).f230040q.get();
                    default:
                        CheckoutFlow checkoutFlow2 = this.f249886b;
                        return czi.c.d(0, 6, null, checkoutFlow2, (b) checkoutFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: qwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutFlow f249886b;

            {
                this.f249886b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CheckoutFlow checkoutFlow = this.f249886b;
                        phm.a aVar = (phm.a) ue0.e.j(checkoutFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).F;
                        CheckoutFlowContract$InputData checkoutFlowContract$InputData = checkoutFlow.K;
                        checkoutFlowContract$InputData.getClass();
                        return new b0(d0Var, new agk.a(), checkoutFlowContract$InputData);
                    case 1:
                        return (b) ((b0) this.f249886b.L.getValue()).f230040q.get();
                    default:
                        CheckoutFlow checkoutFlow2 = this.f249886b;
                        return czi.c.d(0, 6, null, checkoutFlow2, (b) checkoutFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (qwe.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
