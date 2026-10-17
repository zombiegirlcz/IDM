package vpd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemainingBalanceDestination.PlaceholderCurrencyDestination f291170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemainingBalanceDestination f291171b;

    public k(RemainingBalanceDestination.PlaceholderCurrencyDestination placeholderCurrencyDestination, RemainingBalanceDestination selectedDestination) {
        Intrinsics.checkNotNullParameter(selectedDestination, "selectedDestination");
        this.f291170a = placeholderCurrencyDestination;
        this.f291171b = selectedDestination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f291170a, kVar.f291170a) && Intrinsics.f(this.f291171b, kVar.f291171b);
    }

    public final int hashCode() {
        RemainingBalanceDestination.PlaceholderCurrencyDestination placeholderCurrencyDestination = this.f291170a;
        return this.f291171b.hashCode() + ((placeholderCurrencyDestination == null ? 0 : placeholderCurrencyDestination.f87837a.hashCode()) * 31);
    }
}
