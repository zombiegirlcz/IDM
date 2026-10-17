package phg;

import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightFilters$FilterOption f236310a;

    public n(TravelMilesFlightFilters$FilterOption filterOption) {
        Intrinsics.checkNotNullParameter(filterOption, "filterOption");
        this.f236310a = filterOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f236310a, ((n) obj2).f236310a);
    }

    public final int hashCode() {
        return this.f236310a.hashCode();
    }
}
