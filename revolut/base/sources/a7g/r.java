package a7g;

import com.revolut.feature.travel.flights.models.domain.search.FlightSearchContext;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchQuery f1892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk0.g f1893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlightSearchContext f1894c;
    public final q d;
    public final FlightSearchFilterOptions e;
    public final FlightSearchRequestFilters f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r7g.g f1895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r7g.g f1896h;

    public r(FlightSearchQuery searchQuery, lk0.g results, FlightSearchContext flightSearchContext, q toolbarState, FlightSearchFilterOptions flightSearchFilterOptions, FlightSearchRequestFilters flightSearchRequestFilters, r7g.g selectedSort, r7g.g gVar) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(selectedSort, "selectedSort");
        this.f1892a = searchQuery;
        this.f1893b = results;
        this.f1894c = flightSearchContext;
        this.d = toolbarState;
        this.e = flightSearchFilterOptions;
        this.f = flightSearchRequestFilters;
        this.f1895g = selectedSort;
        this.f1896h = gVar;
    }

    public static r a(r rVar, FlightSearchQuery flightSearchQuery, lk0.g gVar, FlightSearchContext flightSearchContext, q qVar, FlightSearchFilterOptions flightSearchFilterOptions, FlightSearchRequestFilters flightSearchRequestFilters, r7g.g gVar2, r7g.g gVar3, int i) {
        if ((i & 1) != 0) {
            flightSearchQuery = rVar.f1892a;
        }
        FlightSearchQuery searchQuery = flightSearchQuery;
        if ((i & 2) != 0) {
            gVar = rVar.f1893b;
        }
        lk0.g results = gVar;
        if ((i & 4) != 0) {
            flightSearchContext = rVar.f1894c;
        }
        FlightSearchContext flightSearchContext2 = flightSearchContext;
        if ((i & 8) != 0) {
            qVar = rVar.d;
        }
        q toolbarState = qVar;
        if ((i & 16) != 0) {
            flightSearchFilterOptions = rVar.e;
        }
        FlightSearchFilterOptions flightSearchFilterOptions2 = flightSearchFilterOptions;
        if ((i & 32) != 0) {
            flightSearchRequestFilters = rVar.f;
        }
        FlightSearchRequestFilters flightSearchRequestFilters2 = flightSearchRequestFilters;
        r7g.g selectedSort = (i & 64) != 0 ? rVar.f1895g : gVar2;
        r7g.g gVar4 = (i & 128) != 0 ? rVar.f1896h : gVar3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(selectedSort, "selectedSort");
        return new r(searchQuery, results, flightSearchContext2, toolbarState, flightSearchFilterOptions2, flightSearchRequestFilters2, selectedSort, gVar4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f1892a, rVar.f1892a) && Intrinsics.f(this.f1893b, rVar.f1893b) && Intrinsics.f(this.f1894c, rVar.f1894c) && this.d == rVar.d && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && this.f1895g == rVar.f1895g && this.f1896h == rVar.f1896h;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f1892a.hashCode() * 31, 31, this.f1893b.f196174a);
        FlightSearchContext flightSearchContext = this.f1894c;
        int iHashCode = (this.d.hashCode() + ((iD + (flightSearchContext == null ? 0 : flightSearchContext.hashCode())) * 31)) * 31;
        FlightSearchFilterOptions flightSearchFilterOptions = this.e;
        int iHashCode2 = (iHashCode + (flightSearchFilterOptions == null ? 0 : flightSearchFilterOptions.hashCode())) * 31;
        FlightSearchRequestFilters flightSearchRequestFilters = this.f;
        int iHashCode3 = (this.f1895g.hashCode() + ((iHashCode2 + (flightSearchRequestFilters == null ? 0 : flightSearchRequestFilters.hashCode())) * 31)) * 31;
        r7g.g gVar = this.f1896h;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }
}
