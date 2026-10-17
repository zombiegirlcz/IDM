package com.revolut.trading.orders.ui.flows.investment_plan.projection;

import anc.b;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$InputData;
import com.revolut.trading.orders.ui.flows.investment_plan.projection.InvestmentProjectionsFlowContract$FlowStep;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreenContract$InputData;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends atl.a {
    public final InvestmentProjectionsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f106821p;

    public a(InvestmentProjectionsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f106821p = d.a(this, new InvestmentProjectionsFlowContract$FlowStep.Projections(new InvestmentProjectionsScreenContract$InputData(inputData.f91737b.f214596b, inputData.f91736a, inputData.d)), f0.f322471a, new b(this, 14));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106821p;
    }
}
