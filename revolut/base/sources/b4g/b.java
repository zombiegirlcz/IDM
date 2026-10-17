package b4g;

import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlightSearchRequestFilters f12319c;
    public final r7g.g d;

    public b(String searchToken, String str, FlightSearchRequestFilters flightSearchRequestFilters, r7g.g gVar) {
        Intrinsics.checkNotNullParameter(searchToken, "searchToken");
        this.f12317a = searchToken;
        this.f12318b = str;
        this.f12319c = flightSearchRequestFilters;
        this.d = gVar;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        return 20;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f12317a, bVar.f12317a) && Intrinsics.f(this.f12318b, bVar.f12318b) && Intrinsics.f(this.f12319c, bVar.f12319c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(20) * 31, 31, this.f12317a);
        String str = this.f12318b;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        FlightSearchRequestFilters flightSearchRequestFilters = this.f12319c;
        int iHashCode2 = (iHashCode + (flightSearchRequestFilters == null ? 0 : flightSearchRequestFilters.hashCode())) * 31;
        r7g.g gVar = this.d;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }
}
