package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import com.revolut.feature.travel.flights.models.domain.search.LocationPoint;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f12336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f12337c;

    public i0(TravelFlightsApi api2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f12335a = api2;
        this.f12336b = memoryCache;
        Continuation continuation = null;
        this.f12337c = new x4l.c(new a72.k(this, continuation, 29), new b4b.z(this, 9), new av8.n(this, 21), new akl.o(2, 13, continuation), new a19.e(3, 15, continuation));
    }

    public static String a(h0 h0Var) throws IOException {
        String str;
        String strName;
        List list;
        Integer num;
        dj0.d dVar;
        r7g.i iVar;
        c cVar = h0Var.f12333a;
        if (cVar instanceof a) {
            a aVar = (a) cVar;
            FlightSearchQuery flightSearchQuery = aVar.f12312a;
            String str2 = h0Var.f12334b;
            String strK0 = zhm.d0.k0(flightSearchQuery.e.f93596b, ",", null, null, 0, new f0(0), 30);
            LocationPoint locationPoint = flightSearchQuery.f93577a;
            String str3 = locationPoint.f93592a;
            String strName2 = locationPoint.f93593b.name();
            LocationPoint locationPoint2 = flightSearchQuery.f93578b;
            String str4 = locationPoint2.f93592a;
            String strName3 = locationPoint2.f93593b.name();
            String string = flightSearchQuery.f93579c.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            LocalDate localDate = flightSearchQuery.d;
            String string2 = localDate != null ? localDate.toString() : null;
            String str5 = string2 == null ? "" : string2;
            String strName4 = flightSearchQuery.f.name();
            String strValueOf = String.valueOf(flightSearchQuery.e.f93595a);
            r7g.g gVar = aVar.f12313b;
            strName = gVar != null ? gVar.name() : null;
            return zhm.d0.k0(zhm.v.k("flights_search", str2, str3, strName2, str4, strName3, string, str5, strName4, strValueOf, strK0, "", strName == null ? "" : strName), "|", null, null, 0, null, 62);
        }
        if (!(cVar instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        b bVar = (b) cVar;
        String str6 = h0Var.f12334b;
        FlightSearchRequestFilters flightSearchRequestFilters = bVar.f12319c;
        String strName5 = (flightSearchRequestFilters == null || (iVar = flightSearchRequestFilters.f93583a) == null) ? null : iVar.name();
        if (strName5 == null) {
            strName5 = "";
        }
        if (flightSearchRequestFilters == null || (dVar = flightSearchRequestFilters.f93584b) == null) {
            str = null;
        } else {
            str = dVar.f115082a + "_" + dVar.f115083b;
        }
        if (str == null) {
            str = "";
        }
        String strValueOf2 = (flightSearchRequestFilters == null || (num = flightSearchRequestFilters.f93585c) == null) ? null : String.valueOf(num.intValue());
        if (strValueOf2 == null) {
            strValueOf2 = "";
        }
        String strK02 = (flightSearchRequestFilters == null || (list = flightSearchRequestFilters.d) == null) ? null : zhm.d0.k0(list, ",", null, null, 0, null, 62);
        if (strK02 == null) {
            strK02 = "";
        }
        String strK03 = zhm.d0.k0(zhm.v.k(strName5, str, strValueOf2, strK02), ",", null, null, 0, null, 62);
        String str7 = bVar.f12317a;
        String str8 = bVar.f12318b;
        String str9 = str8 == null ? "" : str8;
        r7g.g gVar2 = bVar.d;
        strName = gVar2 != null ? gVar2.name() : null;
        return zhm.d0.k0(zhm.v.k("flights_search", str6, str7, str9, strName == null ? "" : strName, strK03), "|", null, null, 0, null, 62);
    }
}
