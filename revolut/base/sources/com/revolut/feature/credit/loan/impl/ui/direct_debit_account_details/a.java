package com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details;

import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreen;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details.LoanDirectDebitAccountDetailsFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements v55.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LoanDirectDebitAccountDetailsFlowContract$Step.AccountDetails f70330t;
    public final LoanDirectDebitAccountDetailsFlowContract$EmptyState u;

    public a(LoanDirectDebitAccountDetailsFlowContract$InputData flowInputData) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        this.f70330t = new LoanDirectDebitAccountDetailsFlowContract$Step.AccountDetails(flowInputData.f70328a);
        this.u = LoanDirectDebitAccountDetailsFlowContract$EmptyState.f70327a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        LoanDirectDebitAccountDetailsFlowContract$Step step = (LoanDirectDebitAccountDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof LoanDirectDebitAccountDetailsFlowContract$Step.AccountDetails) {
            return new DirectDebitAccountDetailsScreen(new DirectDebitAccountDetailsScreenContract$InputData(((LoanDirectDebitAccountDetailsFlowContract$Step.AccountDetails) step).f70329a, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f70330t;
    }
}
