package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow;

import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$NotEnoughFundsException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanChangeRepaymentDayFlowContract$NotEnoughFundsException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f70389a;

    public LoanChangeRepaymentDayFlowContract$NotEnoughFundsException(d requiredAmount) {
        Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
        this.f70389a = requiredAmount;
    }
}
