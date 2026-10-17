package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow;

import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.InvestorUpdateFlowContract$Step;
import cp5.d;
import j2c.n;
import j7f.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final InvestorUpdateFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f91353p;

    public a(InvestorUpdateFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        n nVar = new n(this, 16);
        this.f91353p = d.a(this, InvestorUpdateFlowContract$Step.StrategyReport.f91352a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91353p;
    }
}
