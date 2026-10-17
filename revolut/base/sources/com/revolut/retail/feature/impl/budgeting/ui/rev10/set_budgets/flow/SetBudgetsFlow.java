package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow;

import aii.q;
import asj.j;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import erj.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$Step;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData;", "Laii/q;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetBudgetsFlow extends BaseFlow<SetBudgetsFlowContract$Step, SetBudgetsFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetBudgetsFlow(SetBudgetsFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new agh.b(this, inputData, 29));
        this.Q = w.y0(new aqe.a(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (k) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (k) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        SetBudgetsFlowContract$Step step = (SetBudgetsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
