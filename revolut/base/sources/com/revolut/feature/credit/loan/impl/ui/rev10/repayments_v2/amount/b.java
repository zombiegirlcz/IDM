package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount;

import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$RepaymentStrategyType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    private b() {
    }

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StrategyPickerContract$RepaymentStrategyType f70560a;

        public a(StrategyPickerContract$RepaymentStrategyType strategyPickerContract$RepaymentStrategyType) {
            this.f70560a = strategyPickerContract$RepaymentStrategyType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f70560a, ((a) obj2).f70560a);
        }

        public final int hashCode() {
            StrategyPickerContract$RepaymentStrategyType strategyPickerContract$RepaymentStrategyType = this.f70560a;
            if (strategyPickerContract$RepaymentStrategyType == null) {
                return 0;
            }
            return strategyPickerContract$RepaymentStrategyType.hashCode();
        }

        public a() {
            this(null);
        }
    }
}
