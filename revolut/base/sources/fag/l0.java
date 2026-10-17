package fag;

import a9g.r1;
import androidx.room.util.DBUtil;
import com.revolut.feature_travel_hotels_models.booking.details.HotelsPropertyBookingDetailsParams;
import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingRequestStatus;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavorites;
import com.revolut.feature_travel_hotels_models.property.Address;
import com.revolut.feature_travel_hotels_models.property.HotelsInventoryProviderLogos;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestsReviews;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f133343b;

    public /* synthetic */ l0(t0 t0Var, int i) {
        this.f133342a = i;
        this.f133343b = t0Var;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        fgi.a aVar;
        HotelsInventoryProviderLogos hotelsInventoryProviderLogos;
        fgi.c cVar;
        int i = this.f133342a;
        int i2 = 26;
        int i3 = 20;
        t0 t0Var = this.f133343b;
        switch (i) {
            case 0:
                vfi.a pagedSearchParams = (vfi.a) obj2;
                Intrinsics.checkNotNullParameter(pagedSearchParams, "pagedSearchParams");
                t0Var.C.readLock().lock();
                try {
                    return (eag.a) t0Var.f133381m.b(pagedSearchParams);
                } finally {
                }
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                z8g.j jVar = t0Var.f133379j;
                List<a9g.k0> list = (List) DBUtil.performBlocking(jVar.f320103a, true, false, new z2.a(jVar, i3));
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (a9g.k0 k0Var : list) {
                    Intrinsics.checkNotNullParameter(k0Var, "<this>");
                    String str = k0Var.f2521a;
                    fgi.a[] aVarArrValues = fgi.a.values();
                    int length = aVarArrValues.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            aVar = aVarArrValues[i5];
                            if (!kotlin.text.a0.z(aVar.name(), str, true)) {
                                i5++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        aVar = fgi.a.UNKNOWN;
                    }
                    fgi.a aVar2 = aVar;
                    String str2 = k0Var.f2522b;
                    a9g.l0 l0Var = k0Var.f2523c;
                    if (l0Var != null) {
                        Intrinsics.checkNotNullParameter(l0Var, "<this>");
                        hotelsInventoryProviderLogos = new HotelsInventoryProviderLogos(l0Var.getColour(), l0Var.getLight());
                    } else {
                        hotelsInventoryProviderLogos = null;
                    }
                    Address addressA = j9g.h.a(k0Var.d);
                    String str3 = k0Var.e;
                    String str4 = k0Var.f;
                    String str5 = k0Var.f2524g;
                    a9g.i0 i0Var = k0Var.f2525h;
                    if (i0Var != null) {
                        Intrinsics.checkNotNullParameter(i0Var, "<this>");
                        cVar = new fgi.c(i0Var.getPrivateHost(), i0Var.getProfessionalHost());
                    } else {
                        cVar = null;
                    }
                    arrayList.add(new fgi.b(aVar2, str2, hotelsInventoryProviderLogos, addressA, str3, str4, str5, cVar));
                }
                return arrayList;
            case 2:
                yfi.a params = (yfi.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (HotelsProperty) t0Var.f133375b.get("CACHE_KEY_HOTELS_PROPERTY_DETAILS-" + params.hashCode());
            case 3:
                bgi.a pageParams = (bgi.a) obj2;
                Intrinsics.checkNotNullParameter(pageParams, "pageParams");
                t0Var.F.readLock().lock();
                try {
                    return (HotelsPropertyGuestsReviews) t0Var.f133380l.b(pageParams);
                } finally {
                }
            case 4:
                String propertyId = (String) obj2;
                Intrinsics.checkNotNullParameter(propertyId, "propertyId");
                return (List) v7.r("CACHE_KEY_HOTELS_PROPERTY_FACILITIES-", propertyId, t0Var.f133375b);
            case 5:
                String propertyId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(propertyId2, "propertyId");
                return (List) v7.r("CACHE_KEY_HOTELS_PROPERTY_POLICIES-", propertyId2, t0Var.f133375b);
            case 6:
                cgi.c roomOccupancyParams = (cgi.c) obj2;
                Intrinsics.checkNotNullParameter(roomOccupancyParams, "roomOccupancyParams");
                return (List) t0Var.f133375b.get(t0.g(roomOccupancyParams));
            case 7:
                String bookingId = (String) obj2;
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                return (HotelsPropertyBookingRequestStatus) v7.r("CACHE_KEY_HOTELS_BOOKING_STATUS-", bookingId, t0Var.f133375b);
            case 8:
                HotelsPropertyBookingDetailsParams bookingDetailsParams = (HotelsPropertyBookingDetailsParams) obj2;
                Intrinsics.checkNotNullParameter(bookingDetailsParams, "bookingDetailsParams");
                return (rei.g) v7.r("CACHE_KEY_HOTELS_BOOKING_DETAILS-", bookingDetailsParams.f97883a, t0Var.f133375b);
            case 9:
                HotelsPropertyBookingDetailsParams bookingDetailsParams2 = (HotelsPropertyBookingDetailsParams) obj2;
                Intrinsics.checkNotNullParameter(bookingDetailsParams2, "bookingDetailsParams");
                z8g.b bVar = t0Var.d;
                a9g.v0 v0Var = (a9g.v0) DBUtil.performBlocking(bVar.f320085a, true, false, new z1.c(bVar, bookingDetailsParams2.f97883a, 24));
                if (v0Var != null) {
                    return j9g.e.c(v0Var);
                }
                return null;
            case 10:
                xi0.b it8 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) t0Var.f133375b.get("CACHE_KEY_HOTELS_BOOKINGS");
            case 11:
                xi0.b it9 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                z8g.b bVar2 = t0Var.d;
                List list2 = (List) DBUtil.performBlocking(bVar2.f320085a, true, false, new z2.a(bVar2, 18));
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(j9g.e.c((a9g.v0) it10.next()));
                }
                return arrayList2;
            case 12:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (List) t0Var.f133375b.get("CACHE_KEY_CASHBACK_DETAILS");
            case 13:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (List) t0Var.f133375b.get("CACHE_KEY_PROPERTY_TYPE_CATEGORIES");
            case 14:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (HotelsFavorites) t0Var.f133375b.get("CACHE_KEY_HOTELS_FAVORITES");
            case 15:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                List<r1> list3 = (List) DBUtil.performBlocking(t0Var.i.f320119a, true, false, new z55.w(i2));
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                for (r1 r1Var : list3) {
                    Object obj3 = j9g.l.f172338a;
                    Intrinsics.checkNotNullParameter(r1Var, "<this>");
                    arrayList3.add(new egi.b((egi.a) u1.u(r1Var.f2573a, j9g.l.f172338a), r1Var.f2574b, r1Var.f2575c, r1Var.d, r1Var.e));
                }
                return arrayList3;
            case 16:
                t0Var.c(cp5.c.P(((HotelsPropertyBookingRequestStatus) obj2).f97888b));
                return Unit.f186387a;
            case 17:
                t0Var.c(cp5.c.P(((HotelsPropertyBookingRequestStatus) obj2).f97888b));
                return Unit.f186387a;
            case 18:
                ((Integer) obj2).intValue();
                return (List) t0Var.f133375b.get("CACHE_KEY_DROPOFFS");
            case 19:
                ((Integer) obj2).getClass();
                z8g.f fVar = t0Var.f133378h;
                List list4 = (List) DBUtil.performBlocking(fVar.f320095a, true, false, new z2.a(fVar, 19));
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it14 = list4.iterator();
                while (it14.hasNext()) {
                    arrayList4.add(j9g.b.a((a9g.t) it14.next()));
                }
                return arrayList4;
            case 20:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                return (TravelHotelsDropoff) v7.r("CACHE_KEY_DROPOFFS-", id10, t0Var.f133375b);
            case 21:
                String id11 = (String) obj2;
                Intrinsics.checkNotNullParameter(id11, "id");
                z8g.f fVar2 = t0Var.f133378h;
                a9g.t tVar = (a9g.t) DBUtil.performBlocking(fVar2.f320095a, true, false, new z1.c(fVar2, id11, i2));
                if (tVar != null) {
                    return j9g.b.a(tVar);
                }
                return null;
            case 22:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (List) t0Var.f133375b.get("CACHE_KEY_INVENTORY_PROVIDERS");
            case 23:
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (List) t0Var.f133375b.get("CACHE_KEY_CAMPAIGNS");
            case 24:
                Unit it17 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                List<a9g.o> list5 = (List) DBUtil.performBlocking(t0Var.f133377g.f320090a, true, false, new z55.w(i3));
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                for (a9g.o oVar : list5) {
                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                    String str6 = oVar.f2546a;
                    String str7 = oVar.f2547b;
                    DateTime dateTimeWithTimeAtStartOfDay = new DateTime(oVar.f2548c).withTimeAtStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                    arrayList5.add(new TravelHotelsCampaign(str6, str7, dateTimeWithTimeAtStartOfDay, jli.b.k(new DateTime(oVar.d)), oVar.e, oVar.f, oVar.f2549g));
                }
                return arrayList5;
            case 25:
                String campaignId = (String) obj2;
                Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                return (List) v7.r("CACHE_KEY_CAMPAIGN_LOCATIONS-", campaignId, t0Var.f133375b);
            case 26:
                ((Boolean) obj2).booleanValue();
                return (List) t0Var.f133375b.get("CACHE_KEY_POPULAR_HOTELS_LOCATIONS");
            default:
                ((Boolean) obj2).getClass();
                z8g.l lVar = t0Var.f133376c;
                List list6 = (List) DBUtil.performBlocking(lVar.f320108a, true, false, new z2.a(lVar, 21));
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it18 = list6.iterator();
                while (it18.hasNext()) {
                    arrayList6.add(ta6.a.P((a9g.n0) it18.next()));
                }
                return arrayList6;
        }
    }
}
