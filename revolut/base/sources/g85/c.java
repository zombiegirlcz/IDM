package g85;

import aii.r;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$RepaymentStrategyType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StrategyPickerContract$RepaymentStrategyType f141286a;

    public c(StrategyPickerContract$RepaymentStrategyType strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f141286a = strategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f141286a, ((c) obj2).f141286a);
    }

    public final int hashCode() {
        return this.f141286a.hashCode();
    }
}
