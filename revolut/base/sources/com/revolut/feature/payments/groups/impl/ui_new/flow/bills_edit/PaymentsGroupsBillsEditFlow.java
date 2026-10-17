package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import hq1.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kr9.h;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$Step;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$InputData;", "Laii/q;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentsGroupsBillsEditFlow extends BaseFlow<PaymentsGroupsBillsEditFlowContract$Step, PaymentsGroupsBillsEditFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsGroupsBillsEditFlow(PaymentsGroupsBillsEditFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new hl6.b(this, inputData, 16));
        this.Q = w.y0(new f(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (ht9.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PaymentsGroupsBillsEditFlowContract$Step step = (PaymentsGroupsBillsEditFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
