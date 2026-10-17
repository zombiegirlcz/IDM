package com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import u45.o;
import v0c.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_account_details/LoanDirectDebitAccountDetailsRootFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_account_details/LoanDirectDebitAccountDetailsFlowContract$Step;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_account_details/LoanDirectDebitAccountDetailsFlowContract$InputData;", "Laii/q;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanDirectDebitAccountDetailsRootFlow extends BaseFlow<LoanDirectDebitAccountDetailsFlowContract$Step, LoanDirectDebitAccountDetailsFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanDirectDebitAccountDetailsRootFlow(LoanDirectDebitAccountDetailsFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new b(this, inputData, 15));
        this.Q = w.y0(new ur2.a(this, 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (o) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (o) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (v55.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        LoanDirectDebitAccountDetailsFlowContract$Step step = (LoanDirectDebitAccountDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
