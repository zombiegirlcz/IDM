package ghg;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f143908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f143909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f143910c;
    public final TravelMilesSearchLocation d;
    public final TravelMilesSearchLocation e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f143911g;

    public g(j flightDate, Data topDestinations, Data airline, TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(flightDate, "flightDate");
        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
        Intrinsics.checkNotNullParameter(airline, "airline");
        this.f143908a = flightDate;
        this.f143909b = topDestinations;
        this.f143910c = airline;
        this.d = travelMilesSearchLocation;
        this.e = travelMilesSearchLocation2;
        this.f = z;
        this.f143911g = z3;
    }

    public static g a(g gVar, i iVar, Data data, Data data2, TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2, boolean z, boolean z3, int i) {
        j jVar = iVar;
        if ((i & 1) != 0) {
            jVar = gVar.f143908a;
        }
        j flightDate = jVar;
        if ((i & 2) != 0) {
            data = gVar.f143909b;
        }
        Data topDestinations = data;
        if ((i & 4) != 0) {
            data2 = gVar.f143910c;
        }
        Data airline = data2;
        if ((i & 8) != 0) {
            travelMilesSearchLocation = gVar.d;
        }
        TravelMilesSearchLocation travelMilesSearchLocation3 = travelMilesSearchLocation;
        if ((i & 16) != 0) {
            travelMilesSearchLocation2 = gVar.e;
        }
        TravelMilesSearchLocation travelMilesSearchLocation4 = travelMilesSearchLocation2;
        if ((i & 32) != 0) {
            z = gVar.f;
        }
        boolean z4 = z;
        if ((i & 64) != 0) {
            z3 = gVar.f143911g;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(flightDate, "flightDate");
        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
        Intrinsics.checkNotNullParameter(airline, "airline");
        return new g(flightDate, topDestinations, airline, travelMilesSearchLocation3, travelMilesSearchLocation4, z4, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f143908a, gVar.f143908a) && Intrinsics.f(this.f143909b, gVar.f143909b) && Intrinsics.f(this.f143910c, gVar.f143910c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && this.f143911g == gVar.f143911g;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f143910c, kii.e.c(this.f143909b, this.f143908a.hashCode() * 31, 31), 31);
        TravelMilesSearchLocation travelMilesSearchLocation = this.d;
        int iHashCode = (iC + (travelMilesSearchLocation == null ? 0 : travelMilesSearchLocation.hashCode())) * 31;
        TravelMilesSearchLocation travelMilesSearchLocation2 = this.e;
        return Boolean.hashCode(this.f143911g) + j6.a.c((iHashCode + (travelMilesSearchLocation2 != null ? travelMilesSearchLocation2.hashCode() : 0)) * 31, 31, this.f);
    }
}
