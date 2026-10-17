package y6g;

import aii.r;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchRequestFilters f311276a;

    public l(FlightSearchRequestFilters selectedFilters) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f311276a = selectedFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f311276a, ((l) obj2).f311276a);
    }

    public final int hashCode() {
        return this.f311276a.hashCode();
    }
}
