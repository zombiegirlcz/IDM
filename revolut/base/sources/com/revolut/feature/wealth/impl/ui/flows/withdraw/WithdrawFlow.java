package com.revolut.feature.wealth.impl.ui.flows.withdraw;

import aii.q;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlow;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlowContract$Input;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uki.c;
import xki.e;
import z9h.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/withdraw/WithdrawFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "Lwii/b;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WithdrawFlow extends ViewController<q> implements c, wii.b {
    public final ModalTransitionAnimation.Style K;
    public final WithdrawFlowContract$Input L;
    public final Object M;
    public final Object N;
    public final Object O;

    public /* synthetic */ WithdrawFlow(WithdrawFlowContract$Input withdrawFlowContract$Input) {
        this(withdrawFlowContract$Input, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vah.c) this.N.getValue();
    }

    @Override // wii.b
    /* JADX INFO: renamed from: d2, reason: from getter */
    public final ModalTransitionAnimation.Style getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    public WithdrawFlow(WithdrawFlowContract$Input input, ModalTransitionAnimation.Style style) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = style;
        this.L = input;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawFlow f287293b;

            {
                this.f287293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class cls;
                switch (i) {
                    case 0:
                        WithdrawFlow withdrawFlow = this.f287293b;
                        hf0.a aVarJ = ue0.e.j(withdrawFlow.m2());
                        WithdrawFlowContract$Input withdrawFlowContract$Input = withdrawFlow.L;
                        int i2 = b.f287294a[withdrawFlowContract$Input.f95566b.ordinal()];
                        if (i2 == 1) {
                            cls = ykc.c.class;
                        } else if (i2 == 2) {
                            cls = w2f.b.class;
                        } else {
                            if (i2 == 3) {
                                throw new IllegalStateException("Margin withdraw flow is not implemented");
                            }
                            if (i2 == 4) {
                                throw new IllegalStateException("Commodities product is not supported");
                            }
                            if (i2 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cls = qhh.a.class;
                        }
                        rzg.a aVar = (rzg.a) ue0.e.h(aVarJ, cls);
                        phm.a aVar2 = (phm.a) aVarJ.a().get(z9h.d.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        Object objB = aVar3.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.flows.withdraw.di.WithdrawFlowInjector");
                        return new k(((z9h.d) ((wah.a) objB)).f320410w, withdrawFlowContract$Input, aVar);
                    case 1:
                        return (c) ((k) this.f287293b.M.getValue()).f320459j.get();
                    default:
                        WithdrawFlow withdrawFlow2 = this.f287293b;
                        return czi.c.a(R$id.container, (c) withdrawFlow2.N.getValue(), withdrawFlow2);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawFlow f287293b;

            {
                this.f287293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class cls;
                switch (i2) {
                    case 0:
                        WithdrawFlow withdrawFlow = this.f287293b;
                        hf0.a aVarJ = ue0.e.j(withdrawFlow.m2());
                        WithdrawFlowContract$Input withdrawFlowContract$Input = withdrawFlow.L;
                        int i22 = b.f287294a[withdrawFlowContract$Input.f95566b.ordinal()];
                        if (i22 == 1) {
                            cls = ykc.c.class;
                        } else if (i22 == 2) {
                            cls = w2f.b.class;
                        } else {
                            if (i22 == 3) {
                                throw new IllegalStateException("Margin withdraw flow is not implemented");
                            }
                            if (i22 == 4) {
                                throw new IllegalStateException("Commodities product is not supported");
                            }
                            if (i22 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cls = qhh.a.class;
                        }
                        rzg.a aVar = (rzg.a) ue0.e.h(aVarJ, cls);
                        phm.a aVar2 = (phm.a) aVarJ.a().get(z9h.d.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        Object objB = aVar3.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.flows.withdraw.di.WithdrawFlowInjector");
                        return new k(((z9h.d) ((wah.a) objB)).f320410w, withdrawFlowContract$Input, aVar);
                    case 1:
                        return (c) ((k) this.f287293b.M.getValue()).f320459j.get();
                    default:
                        WithdrawFlow withdrawFlow2 = this.f287293b;
                        return czi.c.a(R$id.container, (c) withdrawFlow2.N.getValue(), withdrawFlow2);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: vah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawFlow f287293b;

            {
                this.f287293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class cls;
                switch (i3) {
                    case 0:
                        WithdrawFlow withdrawFlow = this.f287293b;
                        hf0.a aVarJ = ue0.e.j(withdrawFlow.m2());
                        WithdrawFlowContract$Input withdrawFlowContract$Input = withdrawFlow.L;
                        int i22 = b.f287294a[withdrawFlowContract$Input.f95566b.ordinal()];
                        if (i22 == 1) {
                            cls = ykc.c.class;
                        } else if (i22 == 2) {
                            cls = w2f.b.class;
                        } else {
                            if (i22 == 3) {
                                throw new IllegalStateException("Margin withdraw flow is not implemented");
                            }
                            if (i22 == 4) {
                                throw new IllegalStateException("Commodities product is not supported");
                            }
                            if (i22 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cls = qhh.a.class;
                        }
                        rzg.a aVar = (rzg.a) ue0.e.h(aVarJ, cls);
                        phm.a aVar2 = (phm.a) aVarJ.a().get(z9h.d.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        Object objB = aVar3.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.flows.withdraw.di.WithdrawFlowInjector");
                        return new k(((z9h.d) ((wah.a) objB)).f320410w, withdrawFlowContract$Input, aVar);
                    case 1:
                        return (c) ((k) this.f287293b.M.getValue()).f320459j.get();
                    default:
                        WithdrawFlow withdrawFlow2 = this.f287293b;
                        return czi.c.a(R$id.container, (c) withdrawFlow2.N.getValue(), withdrawFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}
