package rhg;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f254452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchAppliedFilters f254453b;

    public j() {
        this((TravelMilesSearchAppliedFilters) null, 3);
    }

    public static j a(j jVar, Data travelMilesFlightFilters, TravelMilesSearchAppliedFilters appliedFilters, int i) {
        if ((i & 1) != 0) {
            travelMilesFlightFilters = jVar.f254452a;
        }
        if ((i & 2) != 0) {
            appliedFilters = jVar.f254453b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(travelMilesFlightFilters, "travelMilesFlightFilters");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        return new j(travelMilesFlightFilters, appliedFilters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f254452a, jVar.f254452a) && Intrinsics.f(this.f254453b, jVar.f254453b);
    }

    public final int hashCode() {
        return this.f254453b.hashCode() + (this.f254452a.hashCode() * 31);
    }

    public j(Data travelMilesFlightFilters, TravelMilesSearchAppliedFilters appliedFilters) {
        Intrinsics.checkNotNullParameter(travelMilesFlightFilters, "travelMilesFlightFilters");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        this.f254452a = travelMilesFlightFilters;
        this.f254453b = appliedFilters;
    }

    public /* synthetic */ j(TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters, int i) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? new TravelMilesSearchAppliedFilters(0) : travelMilesSearchAppliedFilters);
    }
}
