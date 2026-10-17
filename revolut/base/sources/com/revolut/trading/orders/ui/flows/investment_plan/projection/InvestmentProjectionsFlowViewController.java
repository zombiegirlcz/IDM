package com.revolut.trading.orders.ui.flows.investment_plan.projection;

import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowViewController;", "Lcom/revolut/trading/orders/ui/flows/investment_plan/projection/InvestmentProjectionsFlowContract$FlowViewController;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestmentProjectionsFlowViewController extends InvestmentProjectionsFlowContract$FlowViewController {
    public final xki.a K;
    public final Object L;
    public final Object M;

    public InvestmentProjectionsFlowViewController(InvestmentProjectionsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = xki.a.f306815a;
        this.L = w.y0(new aqe.a(inputData, 8));
        this.M = w.y0(new aqe.a(this, 9));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.trading.orders.ui.flows.investment_plan.projection.InvestmentProjectionsFlowContract$FlowViewController, oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
