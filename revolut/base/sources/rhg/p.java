package rhg;

import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightFilters$FilterOption f254463a;

    public p(TravelMilesFlightFilters$FilterOption filterOption) {
        Intrinsics.checkNotNullParameter(filterOption, "filterOption");
        this.f254463a = filterOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f254463a, ((p) obj2).f254463a);
    }

    public final int hashCode() {
        return this.f254463a.hashCode();
    }
}
