package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection;

import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kr9.i;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$Step;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$InputData;", "Ljt9/b;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentsGroupsBillsSelectionFlow extends BaseFlow<PaymentsGroupsBillsSelectionFlowContract$Step, PaymentsGroupsBillsSelectionFlowContract$InputData, jt9.b> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsGroupsBillsSelectionFlow(PaymentsGroupsBillsSelectionFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new jnf.a(this, inputData, 6));
        this.Q = w.y0(new jj2.a(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (jt9.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PaymentsGroupsBillsSelectionFlowContract$Step step = (PaymentsGroupsBillsSelectionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
