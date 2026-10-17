package j9g;

import a9g.w;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoffSearchParameters;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f172323a = r0.k(new Pair("PROPERTIES_AVAILABILITY", bfi.a.PROPERTIES_AVAILABILITY), new Pair("PROPERTY_DETAILS", bfi.a.PROPERTY_DETAILS), new Pair("ROOMS", bfi.a.ROOMS), new Pair("CHECKOUT", bfi.a.CHECKOUT), new Pair("BOOKED", bfi.a.BOOKED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f172324b = ",";

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final TravelHotelsDropoff a(a9g.t tVar) {
        ArrayList arrayList;
        w wVar;
        ffi.a aVar;
        int i;
        List listN0;
        ffi.a aVar2;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        String str = tVar.f2579a;
        bfi.a aVar3 = (bfi.a) u1.u(tVar.f2580b, f172323a);
        String str2 = tVar.f2581c;
        String str3 = tVar.f;
        String str4 = tVar.f2582g;
        String str5 = tVar.f2583h;
        String str6 = tVar.e;
        String str7 = tVar.d;
        List list = tVar.i;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                a9g.u uVar = (a9g.u) it8.next();
                Intrinsics.checkNotNullParameter(uVar, "<this>");
                arrayList2.add(new TravelHotelsRoomsInformation(uVar.getRoomId(), uVar.getBedOptionId(), uVar.getRateId(), uVar.getOccupancy()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        w wVar2 = tVar.f2584j;
        Intrinsics.checkNotNullParameter(wVar2, "<this>");
        String locationId = wVar2.getLocationId();
        String locationType = wVar2.getLocationType();
        if (locationType != null) {
            ffi.a[] aVarArrValues = ffi.a.values();
            int length = aVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    wVar = wVar2;
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArrValues[i2];
                wVar = wVar2;
                if (a0.z(aVar2.name(), locationType, true)) {
                    break;
                }
                i2++;
                wVar2 = wVar;
            }
            aVar = aVar2;
        } else {
            wVar = wVar2;
            aVar = null;
        }
        LocalDate localDate = LocalDate.parse(wVar.getCheckIn());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        LocalDate localDate2 = LocalDate.parse(wVar.getCheckOut());
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        String roomsOccupancy = wVar.getRoomsOccupancy();
        String starRatings = wVar.getStarRatings();
        String str8 = f172324b;
        if (starRatings != null) {
            i = 0;
            listN0 = d0.n0(starRatings, new String[]{str8}, 0, 6);
        } else {
            i = 0;
            listN0 = null;
        }
        String propertyTypeIds = wVar.getPropertyTypeIds();
        List listN02 = propertyTypeIds != null ? d0.n0(propertyTypeIds, new String[]{str8}, i, 6) : null;
        String amenityIds = wVar.getAmenityIds();
        return new TravelHotelsDropoff(str, aVar3, str2, str7, str6, str3, str4, str5, arrayList, new TravelHotelsDropoffSearchParameters(locationId, aVar, localDate, localDate2, roomsOccupancy, listN0, listN02, amenityIds != null ? d0.n0(amenityIds, new String[]{str8}, i, 6) : null, wVar.getFreeCancellation(), wVar.getOnlyPayNow(), wVar.getOnlyPayLater(), wVar.getShowOnlyAvailable(), wVar.getMinReviewScore(), wVar.getMinReviewScore10Scale(), wVar.getMinPrice(), wVar.getMaxPrice(), wVar.getCurrency(), wVar.getSortBy(), wVar.getSortDirection(), wVar.getOnlyCampaigns()));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final TravelHotelsDropoff b(u9g.a aVar) {
        ArrayList arrayList;
        u9g.d dVar;
        ffi.a aVar2;
        int i;
        List listN0;
        ffi.a aVar3;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        bfi.a aVar4 = (bfi.a) u1.u(aVar.getState(), f172323a);
        String sessionId = aVar.getSessionId();
        String locationId = aVar.getLocationId();
        String locationType = aVar.getLocationType();
        String propertyId = aVar.getPropertyId();
        String imageUrl = aVar.getImageUrl();
        String name = aVar.getName();
        List roomsInformation = aVar.getRoomsInformation();
        if (roomsInformation != null) {
            List<u9g.c> list = roomsInformation;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            for (u9g.c cVar : list) {
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                arrayList2.add(new TravelHotelsRoomsInformation(cVar.getRoomId(), cVar.getBedOptionId(), cVar.getRateId(), cVar.getOccupancy()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        u9g.d searchParameters = aVar.getSearchParameters();
        Intrinsics.checkNotNullParameter(searchParameters, "<this>");
        String locationId2 = searchParameters.getLocationId();
        String locationType2 = searchParameters.getLocationType();
        if (locationType2 != null) {
            ffi.a[] aVarArrValues = ffi.a.values();
            int length = aVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    dVar = searchParameters;
                    aVar3 = null;
                    break;
                }
                aVar3 = aVarArrValues[i2];
                dVar = searchParameters;
                if (a0.z(aVar3.name(), locationType2, true)) {
                    break;
                }
                i2++;
                searchParameters = dVar;
            }
            aVar2 = aVar3;
        } else {
            dVar = searchParameters;
            aVar2 = null;
        }
        LocalDate localDate = LocalDate.parse(dVar.getCheckIn());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        LocalDate localDate2 = LocalDate.parse(dVar.getCheckOut());
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        String roomsOccupancy = dVar.getRoomsOccupancy();
        String starRatings = dVar.getStarRatings();
        String str = f172324b;
        if (starRatings != null) {
            i = 0;
            listN0 = d0.n0(starRatings, new String[]{str}, 0, 6);
        } else {
            i = 0;
            listN0 = null;
        }
        String propertyTypeIds = dVar.getPropertyTypeIds();
        List listN02 = propertyTypeIds != null ? d0.n0(propertyTypeIds, new String[]{str}, i, 6) : null;
        String amenityIds = dVar.getAmenityIds();
        return new TravelHotelsDropoff(id10, aVar4, sessionId, name, imageUrl, locationId, locationType, propertyId, arrayList, new TravelHotelsDropoffSearchParameters(locationId2, aVar2, localDate, localDate2, roomsOccupancy, listN0, listN02, amenityIds != null ? d0.n0(amenityIds, new String[]{str}, i, 6) : null, Boolean.valueOf(Boolean.parseBoolean(dVar.getFreeCancellation())), Boolean.valueOf(Boolean.parseBoolean(dVar.getOnlyPayNow())), Boolean.valueOf(Boolean.parseBoolean(dVar.getOnlyPayLater())), Boolean.valueOf(Boolean.parseBoolean(dVar.getShowOnlyAvailable())), dVar.getMinReviewScore(), dVar.getMinReviewScore10Scale(), dVar.getMinPrice(), dVar.getMaxPrice(), dVar.getCurrency(), dVar.getSortBy(), dVar.getSortDirection(), Boolean.valueOf(Boolean.parseBoolean(dVar.getOnlyCampaigns()))));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final a9g.t c(TravelHotelsDropoff travelHotelsDropoff) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(travelHotelsDropoff, "<this>");
        String str = travelHotelsDropoff.f97914a;
        String strG = u1.g(travelHotelsDropoff.f97915b, f172323a);
        String str2 = travelHotelsDropoff.f97916c;
        String str3 = travelHotelsDropoff.f;
        String str4 = travelHotelsDropoff.f97917g;
        String str5 = travelHotelsDropoff.f97918h;
        String str6 = travelHotelsDropoff.e;
        String str7 = travelHotelsDropoff.d;
        List list = travelHotelsDropoff.i;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                TravelHotelsRoomsInformation travelHotelsRoomsInformation = (TravelHotelsRoomsInformation) it8.next();
                Intrinsics.checkNotNullParameter(travelHotelsRoomsInformation, "<this>");
                arrayList2.add(new a9g.u(travelHotelsRoomsInformation.f97938a, travelHotelsRoomsInformation.f97939b, travelHotelsRoomsInformation.f97940c, travelHotelsRoomsInformation.d));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        TravelHotelsDropoffSearchParameters travelHotelsDropoffSearchParameters = travelHotelsDropoff.f97919j;
        Intrinsics.checkNotNullParameter(travelHotelsDropoffSearchParameters, "<this>");
        String str8 = travelHotelsDropoffSearchParameters.f97924a;
        ffi.a aVar = travelHotelsDropoffSearchParameters.f97925b;
        String strName = aVar != null ? aVar.name() : null;
        String string = travelHotelsDropoffSearchParameters.f97926c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = travelHotelsDropoffSearchParameters.d.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String str9 = travelHotelsDropoffSearchParameters.e;
        List list3 = travelHotelsDropoffSearchParameters.f;
        String strK0 = list3 != null ? zhm.d0.k0(list3, f172324b, null, null, 0, null, 62) : null;
        List list4 = travelHotelsDropoffSearchParameters.f97927g;
        String strK02 = list4 != null ? zhm.d0.k0(list4, f172324b, null, null, 0, null, 62) : null;
        List list5 = travelHotelsDropoffSearchParameters.f97928h;
        return new a9g.t(str, strG, str2, str7, str6, str3, str4, str5, arrayList, new w(str8, strName, string, string2, str9, strK0, strK02, list5 != null ? zhm.d0.k0(list5, f172324b, null, null, 0, null, 62) : null, travelHotelsDropoffSearchParameters.i, travelHotelsDropoffSearchParameters.f97929j, travelHotelsDropoffSearchParameters.k, travelHotelsDropoffSearchParameters.f97930l, travelHotelsDropoffSearchParameters.f97931m, travelHotelsDropoffSearchParameters.f97932n, travelHotelsDropoffSearchParameters.o, travelHotelsDropoffSearchParameters.f97933p, travelHotelsDropoffSearchParameters.f97934q, travelHotelsDropoffSearchParameters.f97935r, travelHotelsDropoffSearchParameters.f97936s, travelHotelsDropoffSearchParameters.f97937t));
    }
}
