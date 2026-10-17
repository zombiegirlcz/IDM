package lnd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static he3.j a(List list, boolean z) {
        List arrayList;
        if (list.isEmpty()) {
            return null;
        }
        he3.l lVar = ((he3.j) zhm.d0.b0(list)).d;
        xi0.b bVar = ((he3.j) zhm.d0.b0(list)).f151564b.f115083b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list2 = list;
        Iterator it8 = list2.iterator();
        long j2 = 0;
        while (it8.hasNext()) {
            for (Map.Entry entry : ((he3.j) it8.next()).f151565c.entrySet()) {
                LocalDate localDate = (LocalDate) entry.getKey();
                he3.i iVar = (he3.i) entry.getValue();
                he3.i iVar2 = (he3.i) linkedHashMap.get(localDate);
                if (iVar2 == null) {
                    linkedHashMap.put(localDate, iVar);
                } else {
                    linkedHashMap.put(localDate, new he3.i(iVar2.f151561a + iVar.f151561a, iVar2.f151562b + iVar.f151562b));
                }
                j2 += iVar.f151561a;
            }
        }
        dj0.d dVar = new dj0.d(j2, bVar);
        if (z) {
            arrayList = new ArrayList();
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                zhm.a0.x(((he3.j) it9.next()).e, arrayList);
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        return new he3.j("AGGREGATED_CATEGORY", dVar, linkedHashMap, lVar, arrayList);
    }

    public static he3.j b(p0 p0Var, List groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter("AGGREGATED_CATEGORY", "id");
        return a(groups, true);
    }

    public static he3.j c(p0 p0Var, List groups) {
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter("AGGREGATED_CATEGORY", "id");
        return a(groups, false);
    }

    public static he3.j d(he3.j group, AnalyticsSpendingPeriod$Interval interval) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(interval, "interval");
        HashMap map = new HashMap();
        long j2 = 0;
        for (Map.Entry entry : group.f151565c.entrySet()) {
            LocalDate localDate = (LocalDate) entry.getKey();
            he3.i iVar = (he3.i) entry.getValue();
            java.time.LocalDate localDateE = jli.b.e(localDate);
            if (localDateE.compareTo((ChronoLocalDate) interval.f99210a) >= 0 && localDateE.compareTo((ChronoLocalDate) interval.f99211b) <= 0) {
                j2 += iVar.f151561a;
                map.put(localDate, iVar);
            }
        }
        List list = group.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            LocalDate localDate2 = ((he3.h) obj2).f151559a.f272593h.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
            java.time.LocalDate localDateE2 = jli.b.e(localDate2);
            if (localDateE2.compareTo((ChronoLocalDate) interval.f99210a) >= 0 && localDateE2.compareTo((ChronoLocalDate) interval.f99211b) <= 0) {
                arrayList.add(obj2);
            }
        }
        return he3.j.a(group, new dj0.d(j2, group.f151564b.f115083b), map, arrayList, 9);
    }

    public static List e(AnalyticsSpendingPeriod$Interval interval, List groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(interval, "interval");
        if (groups.isEmpty()) {
            return zhm.f0.f322471a;
        }
        List list = groups;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(d((he3.j) it8.next(), interval));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((he3.j) obj2).f151564b.k()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
