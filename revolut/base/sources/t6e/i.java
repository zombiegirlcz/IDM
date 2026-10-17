package t6e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import qua.u;
import tof.a3;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f268317a;

    public i(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f268317a = dateProvider;
    }

    public static ArrayList a(ArrayList arrayList, b bVar, DateTime dateTime) {
        DateTime.Property propertyMonthOfYear;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            DateTime.Property propertyMonthOfYear2 = ((e) obj2).f268314a.monthOfYear();
            int i = f.f268316a[bVar.ordinal()];
            if (i == 1) {
                propertyMonthOfYear = dateTime.monthOfYear();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                propertyMonthOfYear = dateTime.plusMonths(1).monthOfYear();
            }
            if (Intrinsics.f(propertyMonthOfYear2, propertyMonthOfYear)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static ArrayList b(ArrayList arrayList, b bVar, DateTime dateTime) {
        DateTime.Property propertyMonthOfYear;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            DateTime.Property propertyMonthOfYear2 = ((q) obj2).f268325a.monthOfYear();
            int i = f.f268316a[bVar.ordinal()];
            if (i == 1) {
                propertyMonthOfYear = dateTime.monthOfYear();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                propertyMonthOfYear = dateTime.plusMonths(1).monthOfYear();
            }
            if (Intrinsics.f(propertyMonthOfYear2, propertyMonthOfYear)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static ArrayList c(List list, q qVar, boolean z) {
        ArrayList arrayListN = v.n(new e(qVar.f268326b, qVar.f268325a));
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            e eVar = (e) it8.next();
            DateTime.Property propertyMonthOfYear = ((e) d0.m0(arrayListN)).f268314a.monthOfYear();
            DateTime dateTime = eVar.f268314a;
            dj0.d dVar = eVar.f268315b;
            boolean zF = Intrinsics.f(propertyMonthOfYear, dateTime.monthOfYear());
            dj0.d dVarC = ((e) d0.m0(arrayListN)).f268315b;
            if (dVarC.f115082a < 0 && !zF) {
                dVarC = dj0.d.c(dVarC, 0L, null, 2);
            }
            arrayListN.add(e.a(eVar, dVarC));
            if (z) {
                boolean z3 = dVar.f115082a > 0;
                dj0.d dVarC2 = ((e) d0.m0(arrayListN)).f268315b;
                if (dVarC2.f115082a < 0 && z3) {
                    dVarC2 = dj0.d.c(dVarC2, 0L, null, 2);
                }
                arrayListN.add(e.a(eVar, pyd.c.O(dVarC2, dVar)));
            } else {
                arrayListN.add(e.a(eVar, pyd.c.H(dVarC, dVar)));
            }
        }
        List<e> listV = d0.V(arrayListN, 1);
        ArrayList arrayList = new ArrayList(w.t(listV, 10));
        for (e eVar2 : listV) {
            arrayList.add(new q(eVar2.f268315b, eVar2.f268314a));
        }
        return arrayList;
    }

    public static Period d(qua.p pVar) {
        fva.e eVar = pVar.K;
        Period period = pVar.f249314a.f160151b;
        if (eVar != null && eVar != fva.e.UNKNOWN) {
            return u.N(eVar);
        }
        if (period != null && !period.equals(Period.ZERO)) {
            return period;
        }
        d.Companion.getClass();
        return c.f268313b;
    }

    public static void e(ArrayList arrayList, qua.p pVar, List list, Period period, DateTime dateTime, DateTime dateTime2) {
        Long l2 = pVar.f249323j;
        String str = pVar.i;
        ibd.e eVar = pVar.f249314a;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            LocalDate localDate = eVar.e;
            String str2 = eVar.f160150a;
            Object obj2 = null;
            DateTime dateTimeAtStartOfDay = localDate != null ? localDate.toDateTimeAtStartOfDay() : null;
            LocalDate localDate2 = eVar.f;
            DateTime dateTimeAtStartOfDay2 = localDate2 != null ? localDate2.toDateTimeAtStartOfDay() : null;
            if (dateTimeAtStartOfDay != null && dateTimeAtStartOfDay.compareTo((ReadableInstant) dateTime.withTimeAtStartOfDay()) >= 0) {
                if (Intrinsics.f(dateTimeAtStartOfDay.dayOfMonth(), dateTime.dayOfMonth())) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next = it8.next();
                        if (Intrinsics.f(((a3) next).f272624y.f273143a, str2)) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (obj2 != null && (period == null || dateTimeAtStartOfDay.plus(period) == null)) {
                        return;
                    }
                }
                while (dateTimeAtStartOfDay.compareTo((ReadableInstant) dateTime2) < 0) {
                    xi0.b.Companion.getClass();
                    arrayList.add(new e(new dj0.d(-jLongValue, xi0.a.a(str)), dateTimeAtStartOfDay));
                    if (period == null) {
                        return;
                    }
                    dateTimeAtStartOfDay = dateTimeAtStartOfDay.plus(period);
                    Intrinsics.checkNotNullExpressionValue(dateTimeAtStartOfDay, "plus(...)");
                }
                return;
            }
            if (dateTimeAtStartOfDay2 == null || dateTimeAtStartOfDay2.compareTo((ReadableInstant) dateTime.withTimeAtStartOfDay()) < 0) {
                return;
            }
            if (Intrinsics.f(dateTimeAtStartOfDay2.dayOfMonth(), dateTime.dayOfMonth())) {
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next2 = it9.next();
                    ibd.i iVar = ((a3) next2).C;
                    if (Intrinsics.f(iVar != null ? iVar.getId() : null, str2)) {
                        obj2 = next2;
                        break;
                    }
                }
                if (obj2 != null && (period == null || dateTimeAtStartOfDay2.plus(period) == null)) {
                    return;
                }
            }
            while (dateTimeAtStartOfDay2.compareTo((ReadableInstant) dateTime2) < 0) {
                xi0.b.Companion.getClass();
                arrayList.add(new e(new dj0.d(-jLongValue, xi0.a.a(str)), dateTimeAtStartOfDay2));
                if (period == null) {
                    return;
                }
                dateTimeAtStartOfDay2 = dateTimeAtStartOfDay2.plus(period);
                Intrinsics.checkNotNullExpressionValue(dateTimeAtStartOfDay2, "plus(...)");
            }
        }
    }

    public static ArrayList f(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            DateTime dateTimeWithTimeAtStartOfDay = ((e) obj2).f268314a.withTimeAtStartOfDay();
            Object arrayList2 = linkedHashMap.get(dateTimeWithTimeAtStartOfDay);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(dateTimeWithTimeAtStartOfDay, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            DateTime dateTime = (DateTime) key;
            Iterable iterable = (Iterable) entry.getValue();
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            for (Object obj3 : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i == 0 ? ((e) obj3).f268315b : pyd.c.O(dVarO, ((e) obj3).f268315b);
                i = i2;
            }
            arrayList3.add(new e(dVarO, dateTime));
        }
        return arrayList3;
    }

    public static dj0.d g(dj0.d dVar, xi0.b bVar) {
        dj0.d.Companion.getClass();
        if (Intrinsics.f(dVar, dj0.d.e)) {
            dVar = null;
        }
        return dVar == null ? new dj0.d(0L, bVar) : dVar;
    }
}
