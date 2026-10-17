package sqd;

import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterDestinationInfo f265069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265070b;

    public l(IncomeSorterDestinationInfo destinationInfo, dj0.d displayValue) {
        Intrinsics.checkNotNullParameter(destinationInfo, "destinationInfo");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f265069a = destinationInfo;
        this.f265070b = displayValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f265069a, lVar.f265069a) && Intrinsics.f(this.f265070b, lVar.f265070b);
    }

    public final int hashCode() {
        return this.f265070b.hashCode() + (this.f265069a.hashCode() * 31);
    }
}
