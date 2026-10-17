package com.revolut.trading.orders.ui.invest.placement.flow;

import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.trading.orders.ui.invest.placement.flow.InvestOrderFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import wtl.d;
import xki.e;
import xsl.p;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwtl/d;", "", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrderFlow extends ViewController<d> implements f {
    public final InvestOrderContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public InvestOrderFlow(InvestOrderContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wtl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderFlow f300033b;

            {
                this.f300033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InvestOrderFlow investOrderFlow = this.f300033b;
                        phm.a aVar = (phm.a) ue0.e.j(investOrderFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        InvestOrderContract$InputData investOrderContract$InputData = investOrderFlow.K;
                        investOrderContract$InputData.getClass();
                        return new xsl.f(pVar, investOrderContract$InputData);
                    case 1:
                        return (b) ((xsl.f) this.f300033b.L.getValue()).e.get();
                    default:
                        InvestOrderFlow investOrderFlow2 = this.f300033b;
                        return czi.c.d(0, 6, null, investOrderFlow2, (b) investOrderFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wtl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderFlow f300033b;

            {
                this.f300033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InvestOrderFlow investOrderFlow = this.f300033b;
                        phm.a aVar = (phm.a) ue0.e.j(investOrderFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        InvestOrderContract$InputData investOrderContract$InputData = investOrderFlow.K;
                        investOrderContract$InputData.getClass();
                        return new xsl.f(pVar, investOrderContract$InputData);
                    case 1:
                        return (b) ((xsl.f) this.f300033b.L.getValue()).e.get();
                    default:
                        InvestOrderFlow investOrderFlow2 = this.f300033b;
                        return czi.c.d(0, 6, null, investOrderFlow2, (b) investOrderFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: wtl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderFlow f300033b;

            {
                this.f300033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        InvestOrderFlow investOrderFlow = this.f300033b;
                        phm.a aVar = (phm.a) ue0.e.j(investOrderFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        InvestOrderContract$InputData investOrderContract$InputData = investOrderFlow.K;
                        investOrderContract$InputData.getClass();
                        return new xsl.f(pVar, investOrderContract$InputData);
                    case 1:
                        return (b) ((xsl.f) this.f300033b.L.getValue()).e.get();
                    default:
                        InvestOrderFlow investOrderFlow2 = this.f300033b;
                        return czi.c.d(0, 6, null, investOrderFlow2, (b) investOrderFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (xsl.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (xsl.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wtl.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
