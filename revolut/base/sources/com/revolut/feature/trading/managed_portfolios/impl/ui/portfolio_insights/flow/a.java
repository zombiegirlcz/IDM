package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow;

import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s6d.r;
import s7f.b;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(PortfolioInsightsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        r rVar = new r(11);
        this.o = d.a(this, PortfolioInsightsFlowContract$Step.PortfolioInsights.f91378a, f0.f322471a, rVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
