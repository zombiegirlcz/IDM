package lnd;

import aw0.b5;
import aw0.c5;
import aw0.e5;
import aw0.f5;
import aw0.g5;
import aw0.h5;
import aw0.ka;
import aw0.la;
import aw0.o9;
import aw0.w0;
import aw0.x0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DateTimeFormatter f197163g = DateTimeFormatter.ofPattern("EEE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f197164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeClause.Format.ShortDayOfWeek f197165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause.Format.Month f197166c;
    public final TimeClause.Format.Month d;
    public final TimeClause.Format.Year e;
    public final TimeClause.Format.Year f;

    public d(mzi.a intervalFormatter, l80.e dateProvider, kzi.a analyticsPeriodIntervalMapper) {
        Intrinsics.checkNotNullParameter(intervalFormatter, "intervalFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(analyticsPeriodIntervalMapper, "analyticsPeriodIntervalMapper");
        this.f197164a = dateProvider;
        this.f197165b = TimeClause.Format.ShortDayOfWeek.f57976b;
        this.f197166c = new TimeClause.Format.Month(ka.CHAR);
        this.d = new TimeClause.Format.Month(ka.SHORT);
        this.e = new TimeClause.Format.Year(la.FULL);
        this.f = new TimeClause.Format.Year(la.SHORT);
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.NumberClause$Format$Compact] */
    public static a a(d dVar, List aggregatedGroups, AnalyticsSpendingPeriod$Interval interval, lzi.i periodType, LinkedHashMap linkedHashMap, xi0.b currency, boolean z, x0 x0Var, int i) {
        x0 x0Var2;
        LinkedHashMap linkedHashMap2;
        boolean z3;
        List listC;
        Iterable iterableV0;
        Clause timeClause;
        long j2;
        List list;
        f5 f5Var;
        List list2;
        f5 f5Var2;
        TimeClause timeClause2;
        Iterator it8;
        Iterator it9;
        boolean z4;
        int i2;
        boolean z6;
        ArrayList arrayList;
        float f;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        kotlin.ranges.e eVar;
        LinkedHashMap headers = (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap;
        boolean z11 = (i & 32) != 0 ? true : z;
        boolean z12 = (i & 64) == 0;
        x0 x0Var3 = (i & 128) != 0 ? null : x0Var;
        Intrinsics.checkNotNullParameter(aggregatedGroups, "aggregatedGroups");
        String str = "interval";
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(currency, "currency");
        ArrayList arrayList5 = new ArrayList();
        Throwable th10 = null;
        long j3 = 1;
        if (z11) {
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(periodType, "periodType");
            int i5 = gqj.b.f145746a[periodType.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    x0Var2 = x0Var3;
                    linkedHashMap2 = headers;
                    arrayList3 = new ArrayList();
                    if (hb9.b.k(lzi.i.MONTHLY, interval) == 1) {
                        LocalDate localDate = interval.f99211b;
                        LocalDate localDatePlusDays = interval.f99210a;
                        while (localDatePlusDays.compareTo((ChronoLocalDate) localDate) < 0) {
                            LocalDate localDatePlusDays2 = localDatePlusDays.plusDays(6L);
                            Intrinsics.h(localDatePlusDays2);
                            LocalDate localDate2 = (LocalDate) cim.c.l(localDatePlusDays2, localDate);
                            Intrinsics.h(localDate2);
                            arrayList3.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays, localDate2));
                            localDatePlusDays = localDatePlusDays2.plusDays(1L);
                            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
                        }
                    } else {
                        long j5 = 1;
                        LocalDate localDate3 = interval.f99211b;
                        LocalDate localDatePlusDays3 = interval.f99210a;
                        while (localDatePlusDays3.compareTo((ChronoLocalDate) localDate3) < 0) {
                            LocalDate localDateMinusDays = localDatePlusDays3.plusMonths(j5).minusDays(j5);
                            Intrinsics.h(localDateMinusDays);
                            LocalDate localDate4 = (LocalDate) cim.c.l(localDateMinusDays, localDate3);
                            Intrinsics.h(localDate4);
                            arrayList3.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays3, localDate4));
                            localDatePlusDays3 = localDateMinusDays.plusDays(1L);
                            Intrinsics.checkNotNullExpressionValue(localDatePlusDays3, "plusDays(...)");
                            j5 = 1;
                        }
                    }
                } else if (i5 == 3) {
                    x0Var2 = x0Var3;
                    linkedHashMap2 = headers;
                    LocalDate localDate5 = interval.f99210a;
                    arrayList3 = new ArrayList();
                    while (localDate5.compareTo((ChronoLocalDate) interval.f99211b) < 0) {
                        LocalDate localDateWith = localDate5.with(TemporalAdjusters.lastDayOfMonth());
                        LocalDate localDatePlusDays4 = localDateWith.plusDays(1L);
                        arrayList3.add(new AnalyticsSpendingPeriod$Interval(localDate5, localDateWith));
                        Intrinsics.h(localDatePlusDays4);
                        localDate5 = localDatePlusDays4;
                    }
                } else {
                    if (i5 != 4 && i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChronoUnit chronoUnit = ChronoUnit.DAYS;
                    LocalDate localDatePlusDays5 = interval.f99210a;
                    LocalDate localDate6 = interval.f99211b;
                    long jBetween = chronoUnit.between(localDatePlusDays5, localDate6);
                    long j16 = jBetween + 1;
                    if (j16 <= 7) {
                        if (j16 <= Long.MIN_VALUE) {
                            kotlin.ranges.e.INSTANCE.getClass();
                            eVar = kotlin.ranges.e.d;
                            x0Var2 = x0Var3;
                            linkedHashMap2 = headers;
                        } else {
                            x0Var2 = x0Var3;
                            linkedHashMap2 = headers;
                            eVar = new kotlin.ranges.e(0, jBetween);
                        }
                        arrayList3 = new ArrayList(zhm.w.t(eVar, 10));
                        Iterator<Long> it10 = eVar.iterator();
                        while (((vim.g) it10).f289628c) {
                            long jNextLong = ((zhm.m0) it10).nextLong();
                            LocalDate localDatePlusDays6 = localDatePlusDays5.plusDays(jNextLong);
                            Intrinsics.checkNotNullExpressionValue(localDatePlusDays6, "plusDays(...)");
                            LocalDate localDatePlusDays7 = localDatePlusDays5.plusDays(jNextLong);
                            Intrinsics.checkNotNullExpressionValue(localDatePlusDays7, "plusDays(...)");
                            arrayList3.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays6, localDatePlusDays7));
                        }
                    } else {
                        x0Var2 = x0Var3;
                        linkedHashMap2 = headers;
                        if (j16 <= 31) {
                            arrayList3 = new ArrayList();
                            LocalDate localDatePlusDays8 = localDatePlusDays5.plusDays(6L);
                            Intrinsics.checkNotNullExpressionValue(localDatePlusDays8, "plusDays(...)");
                            while (localDatePlusDays8.compareTo((ChronoLocalDate) localDate6) <= 0) {
                                arrayList3.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDatePlusDays8));
                                localDatePlusDays5 = localDatePlusDays8.plusDays(j3);
                                Intrinsics.checkNotNullExpressionValue(localDatePlusDays5, "plusDays(...)");
                                localDatePlusDays8 = localDatePlusDays5.plusDays(6L);
                                Intrinsics.checkNotNullExpressionValue(localDatePlusDays8, "plusDays(...)");
                                j3 = 1;
                            }
                            if (localDatePlusDays5.compareTo((ChronoLocalDate) localDate6) <= 0) {
                                arrayList3.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDate6));
                            }
                        } else {
                            if (j16 <= 366) {
                                arrayList4 = new ArrayList();
                                while (true) {
                                    LocalDate localDateWith2 = localDatePlusDays5.with(TemporalAdjusters.lastDayOfMonth());
                                    Intrinsics.checkNotNullExpressionValue(localDateWith2, "with(...)");
                                    if (localDateWith2.compareTo((ChronoLocalDate) localDate6) > 0) {
                                        break;
                                    }
                                    arrayList4.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDateWith2));
                                    localDatePlusDays5 = localDateWith2.plusDays(1L);
                                    Intrinsics.checkNotNullExpressionValue(localDatePlusDays5, "plusDays(...)");
                                }
                                if (localDatePlusDays5.compareTo((ChronoLocalDate) localDate6) <= 0) {
                                    arrayList4.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDate6));
                                }
                            } else if (j16 <= 3660) {
                                arrayList4 = new ArrayList();
                                while (true) {
                                    LocalDate localDateWith3 = localDatePlusDays5.with(TemporalAdjusters.lastDayOfYear());
                                    Intrinsics.checkNotNullExpressionValue(localDateWith3, "with(...)");
                                    if (localDateWith3.compareTo((ChronoLocalDate) localDate6) > 0) {
                                        break;
                                    }
                                    arrayList4.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDateWith3));
                                    localDatePlusDays5 = localDateWith3.plusDays(1L);
                                    Intrinsics.checkNotNullExpressionValue(localDatePlusDays5, "plusDays(...)");
                                }
                                if (localDatePlusDays5.compareTo((ChronoLocalDate) localDate6) <= 0) {
                                    arrayList4.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDate6));
                                }
                            } else {
                                arrayList4 = new ArrayList();
                                while (true) {
                                    LocalDate localDateWith4 = localDatePlusDays5.plusYears(2L).with(TemporalAdjusters.lastDayOfYear());
                                    Intrinsics.checkNotNullExpressionValue(localDateWith4, "with(...)");
                                    if (localDateWith4.compareTo((ChronoLocalDate) localDate6) > 0) {
                                        break;
                                    }
                                    arrayList4.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDateWith4));
                                    localDatePlusDays5 = localDateWith4.plusDays(1L);
                                    Intrinsics.checkNotNullExpressionValue(localDatePlusDays5, "plusDays(...)");
                                }
                                if (localDatePlusDays5.compareTo((ChronoLocalDate) localDate6) <= 0) {
                                    arrayList4.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDate6));
                                }
                            }
                            arrayList3 = arrayList4;
                        }
                    }
                }
                z3 = z11;
                listC = arrayList3;
            } else {
                x0Var2 = x0Var3;
                linkedHashMap2 = headers;
                ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
                LocalDate localDate7 = interval.f99210a;
                z3 = z11;
                kotlin.ranges.e eVar2 = new kotlin.ranges.e(0L, chronoUnit2.between(localDate7, interval.f99211b));
                ArrayList arrayList6 = new ArrayList(zhm.w.t(eVar2, 10));
                Iterator<Long> it11 = eVar2.iterator();
                while (((vim.g) it11).f289628c) {
                    long jNextLong2 = ((zhm.m0) it11).nextLong();
                    LocalDate localDatePlusDays9 = localDate7.plusDays(jNextLong2);
                    Intrinsics.checkNotNullExpressionValue(localDatePlusDays9, "plusDays(...)");
                    LocalDate localDatePlusDays10 = localDate7.plusDays(jNextLong2);
                    Intrinsics.checkNotNullExpressionValue(localDatePlusDays10, "plusDays(...)");
                    arrayList6.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays9, localDatePlusDays10));
                }
                listC = arrayList6;
            }
        } else {
            x0Var2 = x0Var3;
            linkedHashMap2 = headers;
            z3 = z11;
            listC = zhm.u.c(interval);
        }
        List list3 = listC;
        LocalDate localDateE = ((l80.f) dVar.f197164a).e();
        if (!z12 && zhm.d0.Z(aggregatedGroups).isEmpty()) {
            return new a(zhm.f0.f322471a, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, list3);
        }
        List list4 = list3;
        int i6 = 10;
        ArrayList arrayList7 = new ArrayList(zhm.w.t(list4, 10));
        Iterator it12 = list4.iterator();
        int i21 = 0;
        while (it12.hasNext()) {
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = (AnalyticsSpendingPeriod$Interval) it12.next();
            List list5 = aggregatedGroups;
            ArrayList arrayList8 = new ArrayList(zhm.w.t(list5, i6));
            Iterator it13 = list5.iterator();
            int i22 = 0;
            while (it13.hasNext()) {
                Object next = it13.next();
                int i32 = i22 + 1;
                if (i22 < 0) {
                    zhm.v.s();
                    throw th10;
                }
                he3.j jVar = (he3.j) next;
                if (jVar != null) {
                    it9 = it13;
                    long jAbs = 0;
                    for (Map.Entry entry : jVar.f151565c.entrySet()) {
                        org.joda.time.LocalDate localDate8 = (org.joda.time.LocalDate) entry.getKey();
                        Iterator it14 = it12;
                        he3.i iVar = (he3.i) entry.getValue();
                        boolean z29 = z3;
                        LocalDate localDate9 = analyticsSpendingPeriod$Interval.f99210a;
                        int i33 = i22;
                        LocalDate localDate10 = analyticsSpendingPeriod$Interval.f99211b;
                        boolean z31 = z12;
                        LocalDate localDateE2 = jli.b.e(localDate8);
                        if (localDateE2.compareTo((Object) localDate9) < 0 || localDateE2.compareTo((Object) localDate10) > 0) {
                            arrayList2 = arrayList7;
                        } else {
                            arrayList2 = arrayList7;
                            jAbs += Math.abs(iVar.f151561a);
                        }
                        arrayList7 = arrayList2;
                        z3 = z29;
                        it12 = it14;
                        i22 = i33;
                        z12 = z31;
                    }
                    it8 = it12;
                    z4 = z3;
                    i2 = i22;
                    z6 = z12;
                    arrayList = arrayList7;
                    f = jAbs;
                } else {
                    it8 = it12;
                    it9 = it13;
                    z4 = z3;
                    i2 = i22;
                    z6 = z12;
                    arrayList = arrayList7;
                    f = 0.0f;
                }
                arrayList5.add(Float.valueOf(f));
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    i21++;
                }
                if (i2 != 0) {
                    i3 = R$attr.uikit_colorPerformanceNegative;
                } else if (aggregatedGroups.size() != 1) {
                    i3 = R$attr.uikit_colorPerformancePositive;
                } else if (z6) {
                    i3 = (localDateE.compareTo((Object) analyticsSpendingPeriod$Interval.f99211b) > 0 || localDateE.compareTo((Object) analyticsSpendingPeriod$Interval.f99210a) < 0) ? R$attr.uikit_colorGreyTone10 : R$attr.uikit_colorAccentNeutral;
                } else {
                    i3 = R$attr.uikit_colorAccentNeutral;
                }
                b5 b5Var = c5.Companion;
                List listC2 = zhm.u.c(new f5(f, x0Var2 == null ? new w0(i3) : x0Var2));
                b5Var.getClass();
                arrayList8.add(b5.a(listC2));
                arrayList7 = arrayList;
                it13 = it9;
                i22 = i32;
                z3 = z4;
                it12 = it8;
                z12 = z6;
            }
            Iterator it15 = it12;
            boolean z41 = z3;
            boolean z49 = z12;
            ArrayList arrayList9 = arrayList7;
            LocalDate localDate11 = analyticsSpendingPeriod$Interval.f99210a;
            LocalDate localDate12 = analyticsSpendingPeriod$Interval.f99211b;
            ArrayList arrayList10 = arrayList5;
            String str2 = localDate11.toEpochDay() + "_" + localDate12.toEpochDay();
            long jK = hb9.b.k(periodType, interval);
            int i43 = c.f197159a[periodType.ordinal()];
            if (i43 == 1) {
                timeClause = new TimeClause(hx7.a.D(analyticsSpendingPeriod$Interval).getStartMillis(), dVar.f197165b, null, null, 12);
            } else if (i43 != 2) {
                if (i43 == 3) {
                    timeClause = new TimeClause(hx7.a.D(analyticsSpendingPeriod$Interval).getStartMillis(), dVar.f197166c, null, null, 12);
                } else {
                    if (i43 != 4 && i43 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    long j22 = jK + 1;
                    if (j22 <= 7) {
                        String str3 = f197163g.format(localDate11);
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        timeClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else if (j22 <= 31) {
                        ?? r92 = th10;
                        timeClause = new CompositeClause(zhm.v.k(new NumberClause(localDate11.getDayOfMonth(), (NumberClause.Format.Compact) r92, (Custom) r92, 6), new NumberClause(localDate12.getDayOfMonth(), (NumberClause.Format.Compact) r92, (Custom) r92, 6)), new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    } else if (j22 <= 366) {
                        if (((int) ChronoUnit.MONTHS.between(interval.f99210a.withDayOfMonth(1), interval.f99211b.withDayOfMonth(1))) + 1 <= 8) {
                            timeClause = new TimeClause(hx7.a.D(analyticsSpendingPeriod$Interval).getStartMillis(), dVar.d, null, null, 12);
                        } else {
                            timeClause2 = new TimeClause(hx7.a.D(analyticsSpendingPeriod$Interval).getStartMillis(), dVar.f197166c, null, null, 12);
                            timeClause = timeClause2;
                        }
                    } else if (j22 <= 3660) {
                        if (((int) ChronoUnit.YEARS.between(interval.f99210a.withDayOfYear(1), interval.f99211b.withDayOfYear(1))) + 1 <= 6) {
                            timeClause = new TimeClause(hx7.a.D(analyticsSpendingPeriod$Interval).getStartMillis(), dVar.e, null, null, 12);
                        } else {
                            timeClause2 = new TimeClause(hx7.a.D(analyticsSpendingPeriod$Interval).getStartMillis(), dVar.f, null, null, 12);
                            timeClause = timeClause2;
                        }
                    } else if (localDate11.getYear() != localDate12.getYear()) {
                        Interval intervalD = hx7.a.D(analyticsSpendingPeriod$Interval);
                        timeClause = new CompositeClause(zhm.v.k(new TimeClause(intervalD.getStartMillis(), dVar.f, null, null, 12), new TimeClause(intervalD.getEndMillis(), dVar.f, null, null, 12)), new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    } else {
                        timeClause = new TimeClause(hx7.a.D(analyticsSpendingPeriod$Interval).getStartMillis(), dVar.f, null, null, 12);
                    }
                }
            } else if (jK == 1 && z41) {
                Interval intervalD2 = hx7.a.D(analyticsSpendingPeriod$Interval);
                Intrinsics.checkNotNullParameter(intervalD2, str);
                int dayOfMonth = intervalD2.getStart().getDayOfMonth();
                int dayOfMonth2 = intervalD2.getEnd().getDayOfMonth();
                timeClause = new TextClause(dayOfMonth != dayOfMonth2 ? com.google.android.gms.internal.mlkit_vision_face.a.o(String.valueOf(dayOfMonth), "–", String.valueOf(dayOfMonth2)) : String.valueOf(dayOfMonth), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                timeClause2 = new TimeClause(hx7.a.D(analyticsSpendingPeriod$Interval).getStartMillis(), dVar.d, null, null, 12);
                timeClause = timeClause2;
            }
            c5 c5Var = (c5) zhm.d0.d0(arrayList8);
            if (c5Var == null || (list = c5Var.f10257a) == null || (f5Var = (f5) zhm.d0.d0(list)) == null) {
                j2 = 0;
            } else {
                float f4 = f5Var.f10305a;
                c5 c5Var2 = (c5) zhm.d0.e0(1, arrayList8);
                if (c5Var2 != null && (list2 = c5Var2.f10257a) != null && (f5Var2 = (f5) zhm.d0.d0(list2)) != null) {
                    f4 -= f5Var2.f10305a;
                }
                j2 = (long) f4;
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            linkedHashMap3.put(analyticsSpendingPeriod$Interval, new MoneyClause(new dj0.d(j2, currency), new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12));
            String str4 = str;
            g5 g5Var = h5.Companion;
            Clause clause = !z49 ? timeClause : null;
            g5Var.getClass();
            z12 = z49;
            arrayList9.add(new e5(str2, new h5(clause, null), arrayList8, z12, null, 104));
            arrayList5 = arrayList10;
            linkedHashMap2 = linkedHashMap3;
            th10 = null;
            arrayList7 = arrayList9;
            str = str4;
            z3 = z41;
            it12 = it15;
            i6 = 10;
        }
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList5;
        LocalDate localDate13 = interval.f99210a;
        LocalDate localDate14 = interval.f99210a;
        LocalDate localDate15 = interval.f99211b;
        if (localDateE.compareTo((Object) localDate15) > 0 || localDateE.compareTo((Object) localDate13) < 0) {
            iterableV0 = arrayList12;
        } else if (arrayList12.isEmpty()) {
            iterableV0 = zhm.f0.f322471a;
        } else {
            ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
            while (listIterator.hasPrevious()) {
                if (((Number) listIterator.previous()).floatValue() != BitmapDescriptorFactory.HUE_RED) {
                    iterableV0 = zhm.d0.V0(arrayList12, listIterator.nextIndex() + 1);
                    break;
                }
            }
            iterableV0 = zhm.f0.f322471a;
        }
        float fR = (periodType != lzi.i.CUSTOM || ChronoUnit.DAYS.between(localDate14, localDate15) + 1 <= 3660) ? (float) zhm.d0.R(iterableV0) : zhm.d0.S0(iterableV0) / (((int) ChronoUnit.YEARS.between(localDate14.withDayOfYear(1), localDate15.withDayOfYear(1))) + 1);
        Float fQ0 = zhm.d0.q0(arrayList12);
        return new a(arrayList11, i21, fQ0 != null ? fQ0.floatValue() : 0.0f, fR, list3);
    }
}
