package c8g;

import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.feature.travel.flights.models.domain.payment.PriceWithPoints;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsAirProductPriceBreakdown;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsAirProductTravellerTypePriceBreakdown;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsCarrierPriceBreakdown;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsCarrierPriceBreakdownCharge;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsExtraProductGroupPriceBreakdown;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsExtraProductsPriceBreakdown;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m7g.i;
import m7g.j;
import z7g.a0;
import z7g.d0;
import z7g.f;
import z7g.l;
import z7g.o;
import z7g.r;
import z7g.u;
import z7g.x;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final RevPoints a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        RevPoints.Companion companion = RevPoints.INSTANCE;
        long j2 = fVar.f319977a;
        companion.getClass();
        return RevPoints.Companion.a(j2);
    }

    public static final Payment b(z7g.c cVar) {
        PriceWithPoints priceWithPoints;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        d dVarO = mo3.a.o(cVar.f319968a);
        l lVar = cVar.f319969b;
        if (lVar != null) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            priceWithPoints = new PriceWithPoints(a(lVar.f319985b), mo3.a.o(lVar.f319984a));
        } else {
            priceWithPoints = null;
        }
        RevPoints revPointsA = a(cVar.f319970c);
        jo3.a aVar = cVar.d;
        d dVarO2 = aVar != null ? mo3.a.o(aVar) : null;
        d dVarO3 = mo3.a.o(cVar.e);
        List list = cVar.f;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(d((x) it8.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        o oVar = cVar.f319971g;
        TravelFlightsAirProductPriceBreakdown travelFlightsAirProductPriceBreakdownC = oVar != null ? c(oVar) : null;
        d0 d0Var = cVar.f319972h;
        return new Payment(dVarO, priceWithPoints, revPointsA, dVarO2, dVarO3, arrayList, travelFlightsAirProductPriceBreakdownC, d0Var != null ? e(d0Var) : null);
    }

    public static final TravelFlightsAirProductPriceBreakdown c(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        d dVarO = mo3.a.o(oVar.f319988a);
        List<r> list = oVar.f319989b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (r rVar : list) {
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            i iVar = j.Companion;
            String str = rVar.f319992a;
            iVar.getClass();
            j jVarB = i.b(str);
            int i = rVar.f319993b;
            d dVarO2 = mo3.a.o(rVar.f319994c);
            d dVarO3 = mo3.a.o(rVar.d);
            d dVarO4 = mo3.a.o(rVar.e);
            jo3.a aVar = rVar.f;
            ArrayList arrayList2 = null;
            d dVarO5 = aVar != null ? mo3.a.o(aVar) : null;
            List list2 = rVar.f319995g;
            if (list2 != null) {
                List list3 = list2;
                arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(d((x) it8.next()));
                }
            }
            arrayList.add(new TravelFlightsAirProductTravellerTypePriceBreakdown(jVarB, i, dVarO2, dVarO3, dVarO4, dVarO5, arrayList2));
        }
        return new TravelFlightsAirProductPriceBreakdown(dVarO, arrayList);
    }

    public static final TravelFlightsCarrierPriceBreakdown d(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        String str = xVar.f320001a;
        String str2 = xVar.f320002b;
        d dVarO = mo3.a.o(xVar.f320003c);
        jo3.a aVar = xVar.d;
        LinkedHashMap linkedHashMap = null;
        d dVarO2 = aVar != null ? mo3.a.o(aVar) : null;
        Map map = xVar.e;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(q0.b(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                List<u> list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (u uVar : list) {
                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                    arrayList.add(new TravelFlightsCarrierPriceBreakdownCharge(mo3.a.o(uVar.f319997a), uVar.f319998b, uVar.f319999c));
                }
                linkedHashMap.put(key, arrayList);
            }
        }
        return new TravelFlightsCarrierPriceBreakdown(str, str2, dVarO, dVarO2, linkedHashMap);
    }

    public static final TravelFlightsExtraProductsPriceBreakdown e(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        d dVarO = mo3.a.o(d0Var.f319975a);
        List<a0> list = d0Var.f319976b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (a0 a0Var : list) {
            Intrinsics.checkNotNullParameter(a0Var, "<this>");
            o7g.a aVar = o7g.b.Companion;
            String str = a0Var.f319964a;
            aVar.getClass();
            o7g.b bVarA = o7g.a.a(str);
            o7g.c cVar = o7g.d.Companion;
            String str2 = a0Var.f319965b;
            cVar.getClass();
            o7g.d dVarA = o7g.c.a(str2);
            int i = a0Var.f319966c;
            d dVarO2 = mo3.a.o(a0Var.d);
            jo3.a aVar2 = a0Var.e;
            ArrayList arrayList2 = null;
            d dVarO3 = aVar2 != null ? mo3.a.o(aVar2) : null;
            List list2 = a0Var.f;
            if (list2 != null) {
                List list3 = list2;
                arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(d((x) it8.next()));
                }
            }
            arrayList.add(new TravelFlightsExtraProductGroupPriceBreakdown(bVarA, dVarA, i, dVarO2, dVarO3, arrayList2));
        }
        return new TravelFlightsExtraProductsPriceBreakdown(dVarO, arrayList);
    }
}
