package kfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import hfg.h;
import hfg.i;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xfg.d0;
import xfg.k;
import xfg.l;
import yfg.c;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final h a(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        List<k.a> availability = kVar.getAvailability();
        ArrayList arrayList = new ArrayList(w.t(availability, 10));
        for (k.a aVar : availability) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new hfg.a(aVar.getAvailableFlights(), aVar.getDate()));
        }
        return new h(arrayList);
    }

    public static final h b(yfg.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List<c.a> availability = cVar.getAvailability();
        ArrayList arrayList = new ArrayList(w.t(availability, 10));
        for (c.a aVar : availability) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new hfg.a(aVar.getAvailableFlights(), aVar.getDate()));
        }
        return new h(arrayList);
    }

    public static final l c(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        d0.b bVarC = d.c(iVar.f151847a);
        d0.b bVarC2 = d.c(iVar.f151848b);
        LocalDate localDate = iVar.f151849c;
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = iVar.d;
        return new l(bVarC, bVarC2, localDate, travelMilesSearchAppliedFilters != null ? d.b(travelMilesSearchAppliedFilters) : null);
    }

    public static final yfg.c d(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        ArrayList<hfg.a> arrayList = hVar.f151844a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (hfg.a aVar : arrayList) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList2.add(new c.a(aVar.f151802b, aVar.f151801a));
        }
        return new yfg.c(arrayList2);
    }
}
