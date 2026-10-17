package gyg;

import aw0.a5;
import aw0.d5;
import aw0.e5;
import aw0.o9;
import aw0.t5;
import aw0.z4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import gvi.p;
import ip0.ui;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxg.b f147858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f147859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f147860c;

    public m(kxg.b chartHelper, hyg.b chartYLabelsProvider, l80.e dateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(chartHelper, "chartHelper");
        Intrinsics.checkNotNullParameter(chartYLabelsProvider, "chartYLabelsProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f147858a = chartHelper;
        this.f147859b = dateProvider;
        this.f147860c = featureToggleInteractor;
    }

    public static c c(DateTime dateTime, DateTime dateTime2, xi0.b bVar) {
        dj0.d dVar = new dj0.d(0L, bVar);
        fzg.d.Companion.getClass();
        return new c(dVar, dateTime, fzg.c.a(bVar, dateTime), fzg.c.a(bVar, dateTime2));
    }

    public static List g(List list, vyg.c cVar) {
        switch (e.f147857a[cVar.ordinal()]) {
            case 1:
                return d0.W0(8, list);
            case 2:
                return d0.W0(7, list);
            case 3:
                return d0.W0(30, list);
            case 4:
                return d0.W0(6, list);
            case 5:
                return d0.W0(12, list);
            case 6:
                return list;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static DateTime h(DateTime dateTime) {
        return dateTime.withZone(DateTimeZone.getDefault());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.ArrayList] */
    public final List a(List list, vyg.c cVar, xi0.b bVar) {
        Integer numValueOf;
        DateTime dateTimeH = h(((l80.f) this.f147859b).g());
        int i = 0;
        switch (e.f147857a[cVar.ordinal()]) {
            case 1:
                DateTime dateTimeWithTimeAtStartOfDay = dateTimeH.withTimeAtStartOfDay();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) list) {
                    if (Intrinsics.f(h(((c) obj2).f147855b).withTimeAtStartOfDay(), dateTimeWithTimeAtStartOfDay)) {
                        arrayList.add(obj2);
                    }
                }
                int iB = q0.b(w.t(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(Integer.valueOf((h(((c) obj3).f147855b).getHourOfDay() / 3) * 3), obj3);
                }
                ArrayList arrayList2 = new ArrayList();
                while (i < 8) {
                    int i2 = i * 3;
                    c cVar2 = (c) linkedHashMap.get(Integer.valueOf(i2));
                    if (cVar2 != null) {
                        DateTime time = dateTimeWithTimeAtStartOfDay.withHourOfDay(i2);
                        Intrinsics.h(time);
                        fzg.e start = cVar2.f147856c.a(time);
                        dj0.d value = cVar2.f147854a;
                        fzg.e end2 = cVar2.d;
                        Intrinsics.checkNotNullParameter(value, "value");
                        Intrinsics.checkNotNullParameter(time, "time");
                        Intrinsics.checkNotNullParameter(start, "start");
                        Intrinsics.checkNotNullParameter(end2, "end");
                        arrayList2.add(new c(value, time, start, end2));
                    } else {
                        DateTime dateTimeWithHourOfDay = dateTimeWithTimeAtStartOfDay.withHourOfDay(i2);
                        DateTime dateTimePlusHours = dateTimeWithHourOfDay.plusHours(3);
                        Intrinsics.h(dateTimePlusHours);
                        arrayList2.add(c(dateTimeWithHourOfDay, dateTimePlusHours, bVar));
                    }
                    i++;
                }
                list = arrayList2;
                break;
            case 2:
                DateTime dateTimeWithTimeAtStartOfDay2 = dateTimeH.withTimeAtStartOfDay();
                Iterable iterable = (Iterable) list;
                int iB2 = q0.b(w.t(iterable, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj4 : iterable) {
                    linkedHashMap2.put(h(((c) obj4).f147855b).toLocalDate(), obj4);
                }
                list = new ArrayList();
                while (i < 7) {
                    DateTime dateTimeMinusDays = dateTimeWithTimeAtStartOfDay2.minusDays(6 - i);
                    c cVar3 = (c) linkedHashMap2.get(dateTimeMinusDays.toLocalDate());
                    if (cVar3 != null) {
                        list.add(cVar3);
                    } else {
                        DateTime dateTimePlusDays = dateTimeMinusDays.plusDays(1);
                        Intrinsics.h(dateTimePlusDays);
                        list.add(c(dateTimeMinusDays, dateTimePlusDays, bVar));
                    }
                    i++;
                }
                break;
            case 3:
                DateTime dateTimeWithTimeAtStartOfDay3 = dateTimeH.withTimeAtStartOfDay();
                Iterable iterable2 = (Iterable) list;
                int iB3 = q0.b(w.t(iterable2, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3 >= 16 ? iB3 : 16);
                for (Object obj5 : iterable2) {
                    linkedHashMap3.put(h(((c) obj5).f147855b).toLocalDate(), obj5);
                }
                list = new ArrayList();
                while (i < 30) {
                    DateTime dateTimeMinusDays2 = dateTimeWithTimeAtStartOfDay3.minusDays(29 - i);
                    c cVar4 = (c) linkedHashMap3.get(dateTimeMinusDays2.toLocalDate());
                    if (cVar4 != null) {
                        list.add(cVar4);
                    } else {
                        DateTime dateTimePlusDays2 = dateTimeMinusDays2.plusDays(1);
                        Intrinsics.h(dateTimePlusDays2);
                        list.add(c(dateTimeMinusDays2, dateTimePlusDays2, bVar));
                    }
                    i++;
                }
                break;
            case 4:
                DateTime dateTimeWithTimeAtStartOfDay4 = dateTimeH.withDayOfMonth(1).withTimeAtStartOfDay();
                Iterable iterable3 = (Iterable) list;
                int iB4 = q0.b(w.t(iterable3, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB4 >= 16 ? iB4 : 16);
                for (Object obj6 : iterable3) {
                    linkedHashMap4.put(h(((c) obj6).f147855b).withDayOfMonth(1).withTimeAtStartOfDay(), obj6);
                }
                list = new ArrayList();
                while (i < 6) {
                    DateTime dateTimeMinusMonths = dateTimeWithTimeAtStartOfDay4.minusMonths(5 - i);
                    c cVar5 = (c) linkedHashMap4.get(dateTimeMinusMonths);
                    if (cVar5 != null) {
                        list.add(cVar5);
                    } else {
                        DateTime dateTimePlusMonths = dateTimeMinusMonths.plusMonths(1);
                        Intrinsics.h(dateTimePlusMonths);
                        list.add(c(dateTimeMinusMonths, dateTimePlusMonths, bVar));
                    }
                    i++;
                }
                break;
            case 5:
                DateTime dateTimeWithTimeAtStartOfDay5 = dateTimeH.withDayOfMonth(1).withTimeAtStartOfDay();
                Iterable iterable4 = (Iterable) list;
                int iB5 = q0.b(w.t(iterable4, 10));
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iB5 >= 16 ? iB5 : 16);
                for (Object obj7 : iterable4) {
                    linkedHashMap5.put(h(((c) obj7).f147855b).withDayOfMonth(1).withTimeAtStartOfDay(), obj7);
                }
                list = new ArrayList();
                while (i < 12) {
                    DateTime dateTimeMinusMonths2 = dateTimeWithTimeAtStartOfDay5.minusMonths(11 - i);
                    c cVar6 = (c) linkedHashMap5.get(dateTimeMinusMonths2);
                    if (cVar6 != null) {
                        list.add(cVar6);
                    } else {
                        DateTime dateTimePlusMonths2 = dateTimeMinusMonths2.plusMonths(1);
                        Intrinsics.h(dateTimePlusMonths2);
                        list.add(c(dateTimeMinusMonths2, dateTimePlusMonths2, bVar));
                    }
                    i++;
                }
                break;
            case 6:
                if (list.size() >= 2) {
                    Iterable iterable5 = (Iterable) list;
                    Iterator it8 = iterable5.iterator();
                    Integer numValueOf2 = null;
                    if (it8.hasNext()) {
                        numValueOf = Integer.valueOf(h(((c) it8.next()).f147855b).getYear());
                        while (it8.hasNext()) {
                            Integer numValueOf3 = Integer.valueOf(h(((c) it8.next()).f147855b).getYear());
                            if (numValueOf.compareTo(numValueOf3) > 0) {
                                numValueOf = numValueOf3;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    Iterator it9 = iterable5.iterator();
                    if (it9.hasNext()) {
                        numValueOf2 = Integer.valueOf(h(((c) it9.next()).f147855b).getYear());
                        while (it9.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(h(((c) it9.next()).f147855b).getYear());
                            if (numValueOf2.compareTo(numValueOf4) < 0) {
                                numValueOf2 = numValueOf4;
                            }
                        }
                    }
                    if (numValueOf != null && numValueOf2 != null && !numValueOf.equals(numValueOf2)) {
                        list = d0.f1((Collection) list);
                        ArrayList arrayList3 = new ArrayList(w.t(iterable5, 10));
                        Iterator it10 = iterable5.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(Integer.valueOf(h(((c) it10.next()).f147855b).getYear()));
                        }
                        Set setI1 = d0.i1(arrayList3);
                        int iIntValue = numValueOf.intValue();
                        int iIntValue2 = numValueOf2.intValue();
                        if (iIntValue <= iIntValue2) {
                            int i3 = iIntValue;
                            while (true) {
                                if (!setI1.contains(Integer.valueOf(i3))) {
                                    DateTime dateTime = new DateTime(i3, 1, 1, 0, 0, DateTimeZone.getDefault());
                                    DateTime dateTimePlusYears = dateTime.plusYears(1);
                                    Intrinsics.h(dateTimePlusYears);
                                    list.add(c(dateTime, dateTimePlusYears, bVar));
                                }
                                if (i3 != iIntValue2) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return d0.P0((Iterable) list, new f());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ip0.ui b(java.util.List r25, vyg.c r26, aw0.e5 r27) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gyg.m.b(java.util.List, vyg.c, aw0.e5):ip0.ui");
    }

    public final ui d() {
        f0 f0Var = f0.f322471a;
        d5 d5VarE = e();
        aim.e eVarB = u.b();
        m70.a.c(t0.f186434a);
        eVarB.add(new a5(BitmapDescriptorFactory.HUE_RED, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z4.DASHED));
        return new ui("PNL_CHART_LIST_ID", f0Var, null, new t5(u.a(eVarB)), false, null, d5VarE, 0, 0, 0, 129004);
    }

    public final d5 e() {
        return ((jte.d) this.f147860c).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c) ? d5.TALL : d5.REGULAR;
    }

    public final List f(Data chartData, vyg.c selectedTimeframe, e5 e5Var, vyg.f selectedPnlType) {
        Intrinsics.checkNotNullParameter("PNL_CHART_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(selectedPnlType, "selectedPnlType");
        List list = (List) iii.c.f(chartData, new p(18), new a(this, 0), new b(this, selectedTimeframe, e5Var, 0));
        yp0.b.q(list, 0, 0, 0, 0, 15);
        return list;
    }
}
