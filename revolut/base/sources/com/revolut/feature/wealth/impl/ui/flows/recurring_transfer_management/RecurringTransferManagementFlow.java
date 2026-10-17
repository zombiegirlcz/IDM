package com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management;

import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qji.a;
import qji.b;
import rtl.y;
import sah.c;
import te0.w;
import z9h.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/recurring_transfer_management/RecurringTransferManagementFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/wealth/impl/ui/flows/recurring_transfer_management/RecurringTransferManagementFlowContract$Step;", "Lcom/revolut/feature/wealth/impl/ui/flows/recurring_transfer_management/RecurringTransferManagementFlowContract$Input;", "", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringTransferManagementFlow extends BaseFlow<RecurringTransferManagementFlowContract$Step, RecurringTransferManagementFlowContract$Input, Object> {
    public final Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringTransferManagementFlow(RecurringTransferManagementFlowContract$Input input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.P = w.y0(new y(this, 24));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final a Q2() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (c) ((j) this.P.getValue()).f.get();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        RecurringTransferManagementFlowContract$Step step = (RecurringTransferManagementFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
