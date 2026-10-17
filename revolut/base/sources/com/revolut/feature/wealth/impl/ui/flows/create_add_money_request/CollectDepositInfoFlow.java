package com.revolut.feature.wealth.impl.ui.flows.create_add_money_request;

import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlow;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlowContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lah.c;
import qji.b;
import te0.w;
import xki.e;
import yki.f;
import z9h.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/create_add_money_request/CollectDepositInfoFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llah/c;", "Lyki/f;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollectDepositInfoFlow extends ViewController<c> implements f {
    public final CollectDepositInfoFlowContract$Input K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CollectDepositInfoFlow(CollectDepositInfoFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: lah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollectDepositInfoFlow f193395b;

            {
                this.f193395b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class cls;
                switch (i) {
                    case 0:
                        CollectDepositInfoFlow collectDepositInfoFlow = this.f193395b;
                        hf0.a aVarJ = ue0.e.j(collectDepositInfoFlow.m2());
                        CollectDepositInfoFlowContract$Input collectDepositInfoFlowContract$Input = collectDepositInfoFlow.K;
                        int i2 = b.f193396a[collectDepositInfoFlowContract$Input.f95552b.ordinal()];
                        if (i2 == 1) {
                            cls = ykc.a.class;
                        } else if (i2 == 2) {
                            cls = w2f.a.class;
                        } else if (i2 == 3) {
                            cls = z4b.c.class;
                        } else {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("Commodities product is not supported");
                            }
                            cls = ihh.a.class;
                        }
                        ozg.a aVar = (ozg.a) ue0.e.h(aVarJ, cls);
                        phm.a aVar2 = (phm.a) aVarJ.a().get(z9h.d.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        Object objB = aVar3.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.di.CollectDepositInfoFlowComponentInjector");
                        return new z9h.a(((z9h.d) ((mah.a) objB)).f320410w, collectDepositInfoFlowContract$Input, aVar);
                    case 1:
                        return (e) ((z9h.a) this.f193395b.L.getValue()).f.get();
                    default:
                        CollectDepositInfoFlow collectDepositInfoFlow2 = this.f193395b;
                        return czi.c.d(0, 6, null, collectDepositInfoFlow2, (e) collectDepositInfoFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: lah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollectDepositInfoFlow f193395b;

            {
                this.f193395b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class cls;
                switch (i2) {
                    case 0:
                        CollectDepositInfoFlow collectDepositInfoFlow = this.f193395b;
                        hf0.a aVarJ = ue0.e.j(collectDepositInfoFlow.m2());
                        CollectDepositInfoFlowContract$Input collectDepositInfoFlowContract$Input = collectDepositInfoFlow.K;
                        int i22 = b.f193396a[collectDepositInfoFlowContract$Input.f95552b.ordinal()];
                        if (i22 == 1) {
                            cls = ykc.a.class;
                        } else if (i22 == 2) {
                            cls = w2f.a.class;
                        } else if (i22 == 3) {
                            cls = z4b.c.class;
                        } else {
                            if (i22 != 4) {
                                if (i22 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("Commodities product is not supported");
                            }
                            cls = ihh.a.class;
                        }
                        ozg.a aVar = (ozg.a) ue0.e.h(aVarJ, cls);
                        phm.a aVar2 = (phm.a) aVarJ.a().get(z9h.d.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        Object objB = aVar3.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.di.CollectDepositInfoFlowComponentInjector");
                        return new z9h.a(((z9h.d) ((mah.a) objB)).f320410w, collectDepositInfoFlowContract$Input, aVar);
                    case 1:
                        return (e) ((z9h.a) this.f193395b.L.getValue()).f.get();
                    default:
                        CollectDepositInfoFlow collectDepositInfoFlow2 = this.f193395b;
                        return czi.c.d(0, 6, null, collectDepositInfoFlow2, (e) collectDepositInfoFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: lah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollectDepositInfoFlow f193395b;

            {
                this.f193395b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class cls;
                switch (i3) {
                    case 0:
                        CollectDepositInfoFlow collectDepositInfoFlow = this.f193395b;
                        hf0.a aVarJ = ue0.e.j(collectDepositInfoFlow.m2());
                        CollectDepositInfoFlowContract$Input collectDepositInfoFlowContract$Input = collectDepositInfoFlow.K;
                        int i22 = b.f193396a[collectDepositInfoFlowContract$Input.f95552b.ordinal()];
                        if (i22 == 1) {
                            cls = ykc.a.class;
                        } else if (i22 == 2) {
                            cls = w2f.a.class;
                        } else if (i22 == 3) {
                            cls = z4b.c.class;
                        } else {
                            if (i22 != 4) {
                                if (i22 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("Commodities product is not supported");
                            }
                            cls = ihh.a.class;
                        }
                        ozg.a aVar = (ozg.a) ue0.e.h(aVarJ, cls);
                        phm.a aVar2 = (phm.a) aVarJ.a().get(z9h.d.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        Object objB = aVar3.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.di.CollectDepositInfoFlowComponentInjector");
                        return new z9h.a(((z9h.d) ((mah.a) objB)).f320410w, collectDepositInfoFlowContract$Input, aVar);
                    case 1:
                        return (e) ((z9h.a) this.f193395b.L.getValue()).f.get();
                    default:
                        CollectDepositInfoFlow collectDepositInfoFlow2 = this.f193395b;
                        return czi.c.d(0, 6, null, collectDepositInfoFlow2, (e) collectDepositInfoFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (lah.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
