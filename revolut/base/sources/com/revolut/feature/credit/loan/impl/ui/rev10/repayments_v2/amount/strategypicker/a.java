package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker;

import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$RepaymentStrategyType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final g0 a(StrategyPickerContract$RepaymentStrategyType strategyPickerContract$RepaymentStrategyType) {
        Intrinsics.checkNotNullParameter(strategyPickerContract$RepaymentStrategyType, "<this>");
        if (Intrinsics.f(strategyPickerContract$RepaymentStrategyType, StrategyPickerContract$RepaymentStrategyType.AmountReduction.f70562a)) {
            return g0.AMOUNT_REDUCTION;
        }
        if (Intrinsics.f(strategyPickerContract$RepaymentStrategyType, StrategyPickerContract$RepaymentStrategyType.TermReduction.f70563a)) {
            return g0.TERM_REDUCTION;
        }
        throw new NoWhenBranchMatchedException();
    }
}
