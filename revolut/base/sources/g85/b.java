package g85;

import cli.j;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$RepaymentStrategyType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f141284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StrategyPickerContract$RepaymentStrategyType f141285b;

    public b(List availableStrategies, StrategyPickerContract$RepaymentStrategyType strategyPickerContract$RepaymentStrategyType) {
        Intrinsics.checkNotNullParameter(availableStrategies, "availableStrategies");
        this.f141284a = availableStrategies;
        this.f141285b = strategyPickerContract$RepaymentStrategyType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f141284a, bVar.f141284a) && Intrinsics.f(this.f141285b, bVar.f141285b);
    }

    public final int hashCode() {
        int iHashCode = this.f141284a.hashCode() * 31;
        StrategyPickerContract$RepaymentStrategyType strategyPickerContract$RepaymentStrategyType = this.f141285b;
        return iHashCode + (strategyPickerContract$RepaymentStrategyType == null ? 0 : strategyPickerContract$RepaymentStrategyType.hashCode());
    }
}
