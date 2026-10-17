package hfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f151847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f151848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f151849c;
    public final TravelMilesSearchAppliedFilters d;

    public i(TravelMilesSearchLocation origin, TravelMilesSearchLocation destination, LocalDate date, TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f151847a = origin;
        this.f151848b = destination;
        this.f151849c = date;
        this.d = travelMilesSearchAppliedFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f151847a, iVar.f151847a) && Intrinsics.f(this.f151848b, iVar.f151848b) && Intrinsics.f(this.f151849c, iVar.f151849c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iA = wp5.y.a((this.f151848b.hashCode() + (this.f151847a.hashCode() * 31)) * 31, 31, this.f151849c);
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = this.d;
        return iA + (travelMilesSearchAppliedFilters == null ? 0 : travelMilesSearchAppliedFilters.hashCode());
    }
}
