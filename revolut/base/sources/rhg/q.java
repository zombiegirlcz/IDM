package rhg;

import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightFilters$FilterOption f254464a;

    public q(TravelMilesFlightFilters$FilterOption filterOption) {
        Intrinsics.checkNotNullParameter(filterOption, "filterOption");
        this.f254464a = filterOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f254464a, ((q) obj2).f254464a);
    }

    public final int hashCode() {
        return this.f254464a.hashCode();
    }
}
