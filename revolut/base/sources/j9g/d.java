package j9g;

import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f172325a = r0.k(new Pair("PROPERTY", oei.a.PROPERTY), new Pair("ROOM", oei.a.ROOM), new Pair("RATE", oei.a.RATE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f172326b = r0.k(new Pair("INTERNET", oei.b.INTERNET), new Pair("TRANSPORT", oei.b.TRANSPORT), new Pair("PARKING", oei.b.PARKING), new Pair("FOOD_AND_DRINK", oei.b.FOOD_AND_DRINK), new Pair("THINGS_TO_DO", oei.b.THINGS_TO_DO), new Pair("FAMILY_AND_CHILDREN", oei.b.FAMILY_AND_CHILDREN), new Pair("SERVICES_AND_CONVENIENCES", oei.b.SERVICES_AND_CONVENIENCES), new Pair("LANGUAGES_SPOKEN", oei.b.LANGUAGES_SPOKEN), new Pair("BUSINESS_SERVICES", oei.b.BUSINESS_SERVICES), new Pair("ACCESSIBILITY", oei.b.ACCESSIBILITY), new Pair("BEDROOM", oei.b.BEDROOM), new Pair("BATHROOM", oei.b.BATHROOM), new Pair("ENTERTAINMENT", oei.b.ENTERTAINMENT), new Pair("OUTDOOR_AREAS", oei.b.OUTDOOR_AREAS), new Pair("SAFETY", oei.b.SAFETY), new Pair("CHILDREN_AND_EXTRA_BEDS", oei.b.CHILDREN_AND_EXTRA_BEDS), new Pair("PAYMENT_TYPES", oei.b.PAYMENT_TYPES), new Pair("POOLS_AND_SPA_TREATMENTS", oei.b.POOLS_AND_SPA_TREATMENTS), new Pair("FITNESS", oei.b.FITNESS), new Pair("CLEANING", oei.b.CLEANING), new Pair("PETS", oei.b.PETS), new Pair("MORE", oei.b.MORE), new Pair("SAFETY_AND_CLEANING", oei.b.SAFETY_AND_CLEANING), new Pair("VIEW", oei.b.VIEW), new Pair("UNDEFINED", oei.b.UNDEFINED));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    public static final HotelsCategorisedAmenities a(ofi.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        oei.b bVar = (oei.b) u1.t(eVar.getCategory(), oei.b.UNDEFINED, f172326b);
        List<ofi.a> amenities = eVar.getAmenities();
        ArrayList arrayList = new ArrayList(w.t(amenities, 10));
        for (ofi.a aVar : amenities) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String id10 = aVar.getId();
            oei.a aVar2 = (oei.a) u1.u(aVar.getType(), f172325a);
            String description = aVar.getDescription();
            String value = aVar.getValue();
            Integer rank = aVar.getRank();
            arrayList.add(new HotelsAmenity(id10, aVar2, description, value, rank != null ? rank.intValue() : Integer.MAX_VALUE));
        }
        return new HotelsCategorisedAmenities(bVar, arrayList);
    }
}
