package rhg;

import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightFilters$FilterOption f254467a;

    public t(TravelMilesFlightFilters$FilterOption filterOption) {
        Intrinsics.checkNotNullParameter(filterOption, "filterOption");
        this.f254467a = filterOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f254467a, ((t) obj2).f254467a);
    }

    public final int hashCode() {
        return this.f254467a.hashCode();
    }
}
