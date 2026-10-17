package rhg;

import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightFilters$FilterOption f254471a;

    public v(TravelMilesFlightFilters$FilterOption filterOption) {
        Intrinsics.checkNotNullParameter(filterOption, "filterOption");
        this.f254471a = filterOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f254471a, ((v) obj2).f254471a);
    }

    public final int hashCode() {
        return this.f254471a.hashCode();
    }
}
