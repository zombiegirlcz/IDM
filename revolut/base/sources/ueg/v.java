package ueg;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f279422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f279423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f279424c;
    public final zfi.a d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelHotelsSortingOption f279425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f279426h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f279427j;
    public final LocationData k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f279428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f279429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f279430n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f279431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ah0.a f279432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TravelHotelsPromotion f279433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f279434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h0 f279435t;
    public final String u;
    public final AnalyticsContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f279436w;

    public v(lk0.g properties, Data favoritesPropertiesIds, Data visibleInventoryProvidersList, zfi.a appliedFilters, Data availabilityFilters, Data recentAvailabilityFilters, TravelHotelsSortingOption travelHotelsSortingOption, Data availableSortingOptions, LocalDate localDate, LocalDate localDate2, LocationData locationData, List roomsOccupancy, i0 toolbarState, u bottomSheetState, Set viewedPropertyIds, String str, ah0.a aVar, TravelHotelsPromotion travelHotelsPromotion, boolean z, h0 smartSearchState, String str2, AnalyticsContext analyticsContext, List smartSearchSuggestions) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(favoritesPropertiesIds, "favoritesPropertiesIds");
        Intrinsics.checkNotNullParameter(visibleInventoryProvidersList, "visibleInventoryProvidersList");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        Intrinsics.checkNotNullParameter(availabilityFilters, "availabilityFilters");
        Intrinsics.checkNotNullParameter(recentAvailabilityFilters, "recentAvailabilityFilters");
        Intrinsics.checkNotNullParameter(availableSortingOptions, "availableSortingOptions");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(viewedPropertyIds, "viewedPropertyIds");
        Intrinsics.checkNotNullParameter(smartSearchState, "smartSearchState");
        Intrinsics.checkNotNullParameter(smartSearchSuggestions, "smartSearchSuggestions");
        this.f279422a = properties;
        this.f279423b = favoritesPropertiesIds;
        this.f279424c = visibleInventoryProvidersList;
        this.d = appliedFilters;
        this.e = availabilityFilters;
        this.f = recentAvailabilityFilters;
        this.f279425g = travelHotelsSortingOption;
        this.f279426h = availableSortingOptions;
        this.i = localDate;
        this.f279427j = localDate2;
        this.k = locationData;
        this.f279428l = roomsOccupancy;
        this.f279429m = toolbarState;
        this.f279430n = bottomSheetState;
        this.o = viewedPropertyIds;
        this.f279431p = str;
        this.f279432q = aVar;
        this.f279433r = travelHotelsPromotion;
        this.f279434s = z;
        this.f279435t = smartSearchState;
        this.u = str2;
        this.v = analyticsContext;
        this.f279436w = smartSearchSuggestions;
    }

    public static v a(v vVar, lk0.g gVar, Data data, Data data2, zfi.a aVar, Data data3, Data data4, TravelHotelsSortingOption travelHotelsSortingOption, Data data5, LocalDate localDate, LocalDate localDate2, LocationData locationData, List list, i0 i0Var, u uVar, Set set, String str, ah0.a aVar2, TravelHotelsPromotion travelHotelsPromotion, boolean z, h0 h0Var, String str2, AnalyticsContext analyticsContext, List list2, int i) {
        lk0.g properties = (i & 1) != 0 ? vVar.f279422a : gVar;
        Data favoritesPropertiesIds = (i & 2) != 0 ? vVar.f279423b : data;
        Data visibleInventoryProvidersList = (i & 4) != 0 ? vVar.f279424c : data2;
        zfi.a appliedFilters = (i & 8) != 0 ? vVar.d : aVar;
        Data availabilityFilters = (i & 16) != 0 ? vVar.e : data3;
        Data recentAvailabilityFilters = (i & 32) != 0 ? vVar.f : data4;
        TravelHotelsSortingOption travelHotelsSortingOption2 = (i & 64) != 0 ? vVar.f279425g : travelHotelsSortingOption;
        Data availableSortingOptions = (i & 128) != 0 ? vVar.f279426h : data5;
        LocalDate localDate3 = (i & 256) != 0 ? vVar.i : localDate;
        LocalDate localDate4 = (i & 512) != 0 ? vVar.f279427j : localDate2;
        LocationData locationData2 = (i & 1024) != 0 ? vVar.k : locationData;
        List roomsOccupancy = (i & 2048) != 0 ? vVar.f279428l : list;
        i0 toolbarState = (i & 4096) != 0 ? vVar.f279429m : i0Var;
        u bottomSheetState = (i & 8192) != 0 ? vVar.f279430n : uVar;
        TravelHotelsSortingOption travelHotelsSortingOption3 = travelHotelsSortingOption2;
        Set viewedPropertyIds = (i & 16384) != 0 ? vVar.o : set;
        String str3 = (i & 32768) != 0 ? vVar.f279431p : str;
        ah0.a aVar3 = (i & 65536) != 0 ? vVar.f279432q : aVar2;
        TravelHotelsPromotion travelHotelsPromotion2 = (i & 131072) != 0 ? vVar.f279433r : travelHotelsPromotion;
        boolean z3 = (i & 262144) != 0 ? vVar.f279434s : z;
        h0 smartSearchState = (i & 524288) != 0 ? vVar.f279435t : h0Var;
        LocalDate localDate5 = localDate3;
        String str4 = (i & PKIFailureInfo.badCertTemplate) != 0 ? vVar.u : str2;
        AnalyticsContext analyticsContext2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? vVar.v : analyticsContext;
        List smartSearchSuggestions = (i & 4194304) != 0 ? vVar.f279436w : list2;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(favoritesPropertiesIds, "favoritesPropertiesIds");
        Intrinsics.checkNotNullParameter(visibleInventoryProvidersList, "visibleInventoryProvidersList");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        Intrinsics.checkNotNullParameter(availabilityFilters, "availabilityFilters");
        Intrinsics.checkNotNullParameter(recentAvailabilityFilters, "recentAvailabilityFilters");
        Intrinsics.checkNotNullParameter(availableSortingOptions, "availableSortingOptions");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(viewedPropertyIds, "viewedPropertyIds");
        Intrinsics.checkNotNullParameter(smartSearchState, "smartSearchState");
        Intrinsics.checkNotNullParameter(smartSearchSuggestions, "smartSearchSuggestions");
        return new v(properties, favoritesPropertiesIds, visibleInventoryProvidersList, appliedFilters, availabilityFilters, recentAvailabilityFilters, travelHotelsSortingOption3, availableSortingOptions, localDate5, localDate4, locationData2, roomsOccupancy, toolbarState, bottomSheetState, viewedPropertyIds, str3, aVar3, travelHotelsPromotion2, z3, smartSearchState, str4, analyticsContext2, smartSearchSuggestions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f279422a, vVar.f279422a) && Intrinsics.f(this.f279423b, vVar.f279423b) && Intrinsics.f(this.f279424c, vVar.f279424c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f279425g, vVar.f279425g) && Intrinsics.f(this.f279426h, vVar.f279426h) && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f279427j, vVar.f279427j) && Intrinsics.f(this.k, vVar.k) && Intrinsics.f(this.f279428l, vVar.f279428l) && this.f279429m == vVar.f279429m && this.f279430n == vVar.f279430n && Intrinsics.f(this.o, vVar.o) && Intrinsics.f(this.f279431p, vVar.f279431p) && Intrinsics.f(this.f279432q, vVar.f279432q) && Intrinsics.f(this.f279433r, vVar.f279433r) && this.f279434s == vVar.f279434s && this.f279435t == vVar.f279435t && Intrinsics.f(this.u, vVar.u) && Intrinsics.f(this.v, vVar.v) && Intrinsics.f(this.f279436w, vVar.f279436w);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f, kii.e.c(this.e, (this.d.hashCode() + kii.e.c(this.f279424c, kii.e.c(this.f279423b, this.f279422a.f196174a.hashCode() * 31, 31), 31)) * 31, 31), 31);
        TravelHotelsSortingOption travelHotelsSortingOption = this.f279425g;
        int iC2 = kii.e.c(this.f279426h, (iC + (travelHotelsSortingOption == null ? 0 : travelHotelsSortingOption.hashCode())) * 31, 31);
        LocalDate localDate = this.i;
        int iHashCode = (iC2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f279427j;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocationData locationData = this.k;
        int iF = p.a.f((this.f279430n.hashCode() + ((this.f279429m.hashCode() + p.a.d((iHashCode2 + (locationData == null ? 0 : locationData.hashCode())) * 31, 31, this.f279428l)) * 31)) * 31, 31, this.o);
        String str = this.f279431p;
        int iHashCode3 = (iF + (str == null ? 0 : str.hashCode())) * 31;
        ah0.a aVar = this.f279432q;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        TravelHotelsPromotion travelHotelsPromotion = this.f279433r;
        int iHashCode5 = (this.f279435t.hashCode() + j6.a.c((iHashCode4 + (travelHotelsPromotion == null ? 0 : travelHotelsPromotion.hashCode())) * 31, 31, this.f279434s)) * 31;
        String str2 = this.u;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.v;
        return this.f279436w.hashCode() + ((iHashCode6 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
    }
}
