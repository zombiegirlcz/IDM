package com.revolut.feature.wealth.ui.impl.cash_balance;

import aii.q;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashHoldingsSelectorFlowFactory;
import com.revolut.kompot.navigable.vc.flow.SimpleFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yki.k;
import zjh.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashHoldingsSelectorFlow;", "Lcom/revolut/kompot/navigable/vc/flow/SimpleFlow;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashHoldingsSelectorFlowFactory$Step;", "Laii/q;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class CashHoldingsSelectorFlow extends SimpleFlow<CashHoldingsSelectorFlowFactory.Step, q> {
    public final c M;

    public CashHoldingsSelectorFlow(CashHoldingSelectorInputData selectorInputData, CashBalanceControllerContract$InputData inputData, o actionType) {
        Intrinsics.checkNotNullParameter(selectorInputData, "selectorInputData");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = new c(selectorInputData, inputData, actionType);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.flow.SimpleFlow
    public final k d3() {
        return this.M;
    }
}
