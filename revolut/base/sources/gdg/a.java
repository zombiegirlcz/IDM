package gdg;

import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentFees;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f143176a;

    public a(fcg.b breakdownItemsFactory, p8g.c featureInteractor) {
        Intrinsics.checkNotNullParameter(breakdownItemsFactory, "breakdownItemsFactory");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.f143176a = featureInteractor;
    }

    public final aim.e a(TravelHotelsBookingAmendmentCost travelHotelsBookingAmendmentCost, dj0.d dVar, dj0.d dVar2) {
        List listB;
        aim.e eVarB = u.b();
        TravelHotelsBookingAmendmentFees f97854a = travelHotelsBookingAmendmentCost.getF97854a();
        if (f97854a != null && (listB = b(f97854a)) != null) {
            eVarB.addAll(listB);
        }
        if (dVar.f(dj0.d.e)) {
            Intrinsics.checkNotNullParameter(travelHotelsBookingAmendmentCost, "<this>");
            eVarB.add(fcg.b.l(v13.d.e0(travelHotelsBookingAmendmentCost, false)));
            if (!Intrinsics.f(dVar.f115083b, dVar2.f115083b)) {
                eVarB.add(fcg.b.g(dVar2));
            }
        }
        return u.a(eVarB);
    }

    public final List b(TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees) {
        ArrayList arrayList = travelHotelsBookingAmendmentFees.f97861b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((PriceFee) obj2).f98065c) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            ufi.b bVar = ((PriceFee) obj3).f98063a;
            Object arrayList3 = linkedHashMap.get(bVar);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(bVar, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ufi.b bVar2 = (ufi.b) entry.getKey();
            String str = ((PriceFee) d0.b0((List) entry.getValue())).f98064b;
            Iterable iterable = (Iterable) entry.getValue();
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            for (Object obj4 : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i == 0 ? ((PriceFee) obj4).d : pyd.c.O(dVarO, ((PriceFee) obj4).d);
                i = i2;
            }
            arrayList4.add(new PriceFee(bVar2, str, false, dVarO));
        }
        ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
        Iterator it8 = arrayList4.iterator();
        while (it8.hasNext()) {
            arrayList5.add(fcg.b.n((PriceFee) it8.next()));
        }
        return d0.d1(arrayList5);
    }
}
