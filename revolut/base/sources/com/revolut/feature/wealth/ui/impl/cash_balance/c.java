package com.revolut.feature.wealth.ui.impl.cash_balance;

import ard.z;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashHoldingsSelectorFlowFactory;
import cp5.d;
import yki.k;
import zhm.f0;
import zjh.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends k {
    public final yki.a o;

    public c(CashHoldingSelectorInputData cashHoldingSelectorInputData, CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData, o oVar) {
        z zVar = new z(this, cashHoldingSelectorInputData, cashBalanceControllerContract$InputData, oVar, 6);
        this.o = d.a(this, CashHoldingsSelectorFlowFactory.Step.Initial.f95964a, f0.f322471a, zVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
