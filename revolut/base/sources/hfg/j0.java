package hfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f151853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f151854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f151855c;
    public final String d;
    public final i0 e;
    public final TravelMilesSearchAppliedFilters f;

    public j0(TravelMilesSearchLocation origin, TravelMilesSearchLocation destination, LocalDate date, String str, i0 i0Var, TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f151853a = origin;
        this.f151854b = destination;
        this.f151855c = date;
        this.d = str;
        this.e = i0Var;
        this.f = travelMilesSearchAppliedFilters;
    }

    @Override // lk0.f
    public final int a() {
        return 20;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f151853a, j0Var.f151853a) && Intrinsics.f(this.f151854b, j0Var.f151854b) && Intrinsics.f(this.f151855c, j0Var.f151855c) && Intrinsics.f(this.d, j0Var.d) && this.e == j0Var.e && Intrinsics.f(this.f, j0Var.f);
    }

    public final int hashCode() {
        int iA = wp5.y.a((this.f151854b.hashCode() + ((this.f151853a.hashCode() + (Integer.hashCode(20) * 31)) * 31)) * 31, 31, this.f151855c);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        i0 i0Var = this.e;
        int iHashCode2 = (iHashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = this.f;
        return iHashCode2 + (travelMilesSearchAppliedFilters != null ? travelMilesSearchAppliedFilters.hashCode() : 0);
    }
}
