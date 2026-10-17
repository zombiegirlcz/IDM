package dgi;

import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationData f114671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f114672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f114673c;
    public final List d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f114674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f114675h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TravelHotelsSortingOption f114676j;
    public final zfi.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f114677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f114678m;

    public c(LocationData locationData, LocalDate checkIn, LocalDate checkOut, List rooms, String str, String str2, String str3, boolean z, String str4, TravelHotelsSortingOption travelHotelsSortingOption, zfi.a appliedFilters, String str5, List list) {
        Intrinsics.checkNotNullParameter(locationData, "locationData");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        this.f114671a = locationData;
        this.f114672b = checkIn;
        this.f114673c = checkOut;
        this.d = rooms;
        this.e = str;
        this.f = str2;
        this.f114674g = str3;
        this.f114675h = z;
        this.i = str4;
        this.f114676j = travelHotelsSortingOption;
        this.k = appliedFilters;
        this.f114677l = str5;
        this.f114678m = list;
    }

    public static c a(c cVar, LocationData locationData, LocalDate localDate, LocalDate localDate2, List list, String str, String str2, String str3, boolean z, String str4, TravelHotelsSortingOption travelHotelsSortingOption, zfi.a aVar, String str5, List list2, int i) {
        LocationData locationData2 = (i & 1) != 0 ? cVar.f114671a : locationData;
        LocalDate checkIn = (i & 2) != 0 ? cVar.f114672b : localDate;
        LocalDate checkOut = (i & 4) != 0 ? cVar.f114673c : localDate2;
        List rooms = (i & 8) != 0 ? cVar.d : list;
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        String str6 = (i & 128) != 0 ? cVar.e : str;
        String str7 = (i & 256) != 0 ? cVar.f : str2;
        String str8 = (i & 512) != 0 ? cVar.f114674g : str3;
        boolean z3 = (i & 1024) != 0 ? cVar.f114675h : z;
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        String str9 = (131072 & i) != 0 ? cVar.i : str4;
        cVar.getClass();
        cVar.getClass();
        TravelHotelsSortingOption travelHotelsSortingOption2 = (1048576 & i) != 0 ? cVar.f114676j : travelHotelsSortingOption;
        zfi.a appliedFilters = (2097152 & i) != 0 ? cVar.k : aVar;
        String str10 = (4194304 & i) != 0 ? cVar.f114677l : str5;
        List list3 = (i & 8388608) != 0 ? cVar.f114678m : list2;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(locationData2, "locationData");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        return new c(locationData2, checkIn, checkOut, rooms, str6, str7, str8, z3, str9, travelHotelsSortingOption2, appliedFilters, str10, list3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        if (!Intrinsics.f(this.f114671a, cVar.f114671a) || !Intrinsics.f(this.f114672b, cVar.f114672b) || !Intrinsics.f(this.f114673c, cVar.f114673c) || !Intrinsics.f(this.d, cVar.d) || !Intrinsics.f(this.e, cVar.e) || !Intrinsics.f(this.f, cVar.f) || !Intrinsics.f(this.f114674g, cVar.f114674g) || this.f114675h != cVar.f114675h) {
            return false;
        }
        Object obj3 = Boolean.TRUE;
        return obj3.equals(obj3) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f114676j, cVar.f114676j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f114677l, cVar.f114677l) && Intrinsics.f(this.f114678m, cVar.f114678m);
    }

    public final int hashCode() {
        int iD = p.a.d(y.a(y.a(this.f114671a.hashCode() * 31, 31, this.f114672b), 31, this.f114673c), 923521, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f114674g;
        int iHashCode3 = (Boolean.TRUE.hashCode() + j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 961, this.f114675h)) * 28629151;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 29791;
        TravelHotelsSortingOption travelHotelsSortingOption = this.f114676j;
        int iHashCode5 = (this.k.hashCode() + ((iHashCode4 + (travelHotelsSortingOption == null ? 0 : travelHotelsSortingOption.hashCode())) * 31)) * 31;
        String str5 = this.f114677l;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f114678m;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }
}
