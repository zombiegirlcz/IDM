package zjh;

import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedBuyingPowerConverted.MarginBorrowingLimit f322843a;

    public m(CombinedBuyingPowerConverted.MarginBorrowingLimit marginBorrowingLimit) {
        Intrinsics.checkNotNullParameter(marginBorrowingLimit, "marginBorrowingLimit");
        this.f322843a = marginBorrowingLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f322843a, ((m) obj2).f322843a);
    }

    public final int hashCode() {
        return this.f322843a.hashCode();
    }
}
