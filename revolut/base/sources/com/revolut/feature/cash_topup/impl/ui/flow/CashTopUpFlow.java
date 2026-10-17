package com.revolut.feature.cash_topup.impl.ui.flow;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mb3.o;
import wp0.b;
import wrj.m;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$Step;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/CashTopUpFlowContract$InputData;", "Laii/q;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpFlow extends BaseFlow<CashTopUpFlowContract$Step, CashTopUpFlowContract$InputData, q> {
    public final Lazy P;
    public final Lazy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashTopUpFlow(CashTopUpFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = j.b(new m(this, inputData, 23));
        this.Q = j.b(new b(this, 23));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (o) this.P.getValue();
    }

    @Override // qji.c
    public final qji.b R1() {
        return (o) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (xb3.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CashTopUpFlowContract$Step step = (CashTopUpFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
