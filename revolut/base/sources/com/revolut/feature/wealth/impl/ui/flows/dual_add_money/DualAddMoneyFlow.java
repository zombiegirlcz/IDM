package com.revolut.feature.wealth.impl.ui.flows.dual_add_money;

import aii.q;
import com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oah.d;
import qji.b;
import te0.w;
import xki.e;
import yhm.j;
import yki.f;
import z9h.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/dual_add_money/DualAddMoneyFlow;", "Lyki/f;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DualAddMoneyFlow extends ViewController<q> implements f {
    public final d K;
    public final Lazy L;
    public final Object M;
    public final Object N;

    public DualAddMoneyFlow(d input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: oah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DualAddMoneyFlow f223634b;

            {
                this.f223634b = this;
            }

            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DualAddMoneyFlow dualAddMoneyFlow = this.f223634b;
                        hf0.a aVarJ = ue0.e.j(dualAddMoneyFlow.m2());
                        d dVar = dualAddMoneyFlow.K;
                        int i2 = b.f223635a[dVar.f223637b.ordinal()];
                        if (i2 == 1) {
                            fpc.a aVar = (fpc.a) ue0.e.h(aVarJ, fpc.a.class);
                            dj0.d dVar2 = dVar.d;
                            o1h.e eVar = new o1h.e(dVar2 != null ? Long.valueOf(dVar2.f115082a) : null);
                            phm.a aVar2 = (phm.a) ue0.e.j(dualAddMoneyFlow.m2()).a().get(z9h.d.class);
                            b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                            if (aVar3 != null) {
                                return new z9h.c(((z9h.d) aVar3.b()).f320410w, dVar, aVar, eVar);
                            }
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException((dVar.f223637b.name() + " is not supported").toString());
                    case 1:
                        return (c) ((z9h.c) this.f223634b.L.getValue()).e.get();
                    default:
                        DualAddMoneyFlow dualAddMoneyFlow2 = this.f223634b;
                        return czi.c.d(0, 6, null, dualAddMoneyFlow2, (c) dualAddMoneyFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: oah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DualAddMoneyFlow f223634b;

            {
                this.f223634b = this;
            }

            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DualAddMoneyFlow dualAddMoneyFlow = this.f223634b;
                        hf0.a aVarJ = ue0.e.j(dualAddMoneyFlow.m2());
                        d dVar = dualAddMoneyFlow.K;
                        int i22 = b.f223635a[dVar.f223637b.ordinal()];
                        if (i22 == 1) {
                            fpc.a aVar = (fpc.a) ue0.e.h(aVarJ, fpc.a.class);
                            dj0.d dVar2 = dVar.d;
                            o1h.e eVar = new o1h.e(dVar2 != null ? Long.valueOf(dVar2.f115082a) : null);
                            phm.a aVar2 = (phm.a) ue0.e.j(dualAddMoneyFlow.m2()).a().get(z9h.d.class);
                            b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                            if (aVar3 != null) {
                                return new z9h.c(((z9h.d) aVar3.b()).f320410w, dVar, aVar, eVar);
                            }
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        if (i22 != 2 && i22 != 3 && i22 != 4 && i22 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException((dVar.f223637b.name() + " is not supported").toString());
                    case 1:
                        return (c) ((z9h.c) this.f223634b.L.getValue()).e.get();
                    default:
                        DualAddMoneyFlow dualAddMoneyFlow2 = this.f223634b;
                        return czi.c.d(0, 6, null, dualAddMoneyFlow2, (c) dualAddMoneyFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: oah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DualAddMoneyFlow f223634b;

            {
                this.f223634b = this;
            }

            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DualAddMoneyFlow dualAddMoneyFlow = this.f223634b;
                        hf0.a aVarJ = ue0.e.j(dualAddMoneyFlow.m2());
                        d dVar = dualAddMoneyFlow.K;
                        int i22 = b.f223635a[dVar.f223637b.ordinal()];
                        if (i22 == 1) {
                            fpc.a aVar = (fpc.a) ue0.e.h(aVarJ, fpc.a.class);
                            dj0.d dVar2 = dVar.d;
                            o1h.e eVar = new o1h.e(dVar2 != null ? Long.valueOf(dVar2.f115082a) : null);
                            phm.a aVar2 = (phm.a) ue0.e.j(dualAddMoneyFlow.m2()).a().get(z9h.d.class);
                            b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                            if (aVar3 != null) {
                                return new z9h.c(((z9h.d) aVar3.b()).f320410w, dVar, aVar, eVar);
                            }
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        if (i22 != 2 && i22 != 3 && i22 != 4 && i22 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException((dVar.f223637b.name() + " is not supported").toString());
                    case 1:
                        return (c) ((z9h.c) this.f223634b.L.getValue()).e.get();
                    default:
                        DualAddMoneyFlow dualAddMoneyFlow2 = this.f223634b;
                        return czi.c.d(0, 6, null, dualAddMoneyFlow2, (c) dualAddMoneyFlow2.M.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (oah.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
