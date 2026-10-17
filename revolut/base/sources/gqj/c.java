package gqj;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lzi.i;
import lzi.j;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements kzi.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f145749c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f145750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f145751b;

    static {
        String[] elements = {"GQ", "IN", "TH", "UG"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
        Pair pair = new Pair(setY0, y0.b(dayOfWeek));
        String[] elements2 = {"DJ", "IR"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Set setY02 = kotlin.collections.d.y0(elements2);
        DayOfWeek dayOfWeek2 = DayOfWeek.FRIDAY;
        Pair pair2 = new Pair(setY02, y0.b(dayOfWeek2));
        Set setB = y0.b("BN");
        DayOfWeek[] elements3 = {dayOfWeek2, dayOfWeek};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Pair pair3 = new Pair(setB, kotlin.collections.d.y0(elements3));
        Set setB2 = y0.b("AF");
        DayOfWeek[] elements4 = {DayOfWeek.THURSDAY, dayOfWeek2};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        Pair pair4 = new Pair(setB2, kotlin.collections.d.y0(elements4));
        String[] elements5 = {"AE", "DZ", "BH", "BD", "EG", "IQ", "IL", "JO", "KW", "LY", "MV", "MR", "OM", "PS", "QA", "SA", "SD", "SY", "YE"};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set setY03 = kotlin.collections.d.y0(elements5);
        DayOfWeek[] elements6 = {dayOfWeek2, DayOfWeek.SATURDAY};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        f145749c = r0.k(pair, pair2, pair3, pair4, new Pair(setY03, kotlin.collections.d.y0(elements6)));
    }

    public c(qd0.b languageProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f145750a = languageProvider;
        this.f145751b = dateProvider;
    }

    public static LocalDate f(LocalDate localDate, lzi.f fVar, lzi.d dVar) {
        int i = b.f145748c[dVar.ordinal()];
        if (i == 1) {
            LocalDate localDateWith = localDate.with(TemporalAdjusters.firstInMonth(g(fVar)));
            Intrinsics.checkNotNullExpressionValue(localDateWith, "with(...)");
            return localDateWith;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        LocalDate localDateWith2 = localDate.with(TemporalAdjusters.lastInMonth(g(fVar)));
        Intrinsics.checkNotNullExpressionValue(localDateWith2, "with(...)");
        return localDateWith2;
    }

    public static DayOfWeek g(lzi.f fVar) {
        switch (b.d[fVar.ordinal()]) {
            case 1:
                return DayOfWeek.MONDAY;
            case 2:
                return DayOfWeek.TUESDAY;
            case 3:
                return DayOfWeek.WEDNESDAY;
            case 4:
                return DayOfWeek.THURSDAY;
            case 5:
                return DayOfWeek.FRIDAY;
            case 6:
                return DayOfWeek.SATURDAY;
            case 7:
                return DayOfWeek.SUNDAY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ArrayList a(LocalDate fromDate, lzi.h cycle) {
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        ArrayList arrayList = new ArrayList();
        arrayList.add(d(fromDate, cycle).f200981b);
        LocalDate localDatePlusDays = ((AnalyticsSpendingPeriod$Interval) d0.b0(arrayList)).f99211b;
        while (true) {
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = d(localDatePlusDays, cycle).f200981b;
            if (analyticsSpendingPeriod$Interval.f99210a.compareTo((ChronoLocalDate) ((l80.f) this.f145751b).e()) > 0) {
                return arrayList;
            }
            if (Intrinsics.f(analyticsSpendingPeriod$Interval.f99210a, ((AnalyticsSpendingPeriod$Interval) d0.m0(arrayList)).f99210a)) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            } else {
                arrayList.add(analyticsSpendingPeriod$Interval);
                localDatePlusDays = analyticsSpendingPeriod$Interval.f99211b.plusDays(1L);
            }
            Intrinsics.h(localDatePlusDays);
        }
    }

    public final AnalyticsSpendingPeriod$Interval b(i type, int i, LocalDate withDate) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(withDate, "withDate");
        int i2 = b.f145746a[type.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            LocalDate localDateOf = LocalDate.of(withDate.getYear(), Month.of((((withDate.getMonthValue() - 1) / i) * i) + 1), 1);
            LocalDate localDateMinusDays = localDateOf.plusMonths(i).minusDays(1L);
            Intrinsics.h(localDateMinusDays);
            return new AnalyticsSpendingPeriod$Interval(localDateOf, localDateMinusDays);
        }
        if (i2 == 3 || i2 == 4 || i2 == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List c(LocalDate fromDate, i periodType, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval) {
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalB;
        LocalDate localDatePlusDays;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval2;
        LocalDate localDatePlusDays2;
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        ArrayList arrayList = new ArrayList();
        int i = b.f145746a[periodType.ordinal()];
        l80.e eVar = this.f145751b;
        if (i == 1) {
            arrayList.add(i(lzi.f.MONDAY, fromDate).f200981b);
            LocalDate localDatePlusDays3 = ((AnalyticsSpendingPeriod$Interval) d0.b0(arrayList)).f99211b;
            while (true) {
                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval3 = i(lzi.f.MONDAY, localDatePlusDays3).f200981b;
                if (analyticsSpendingPeriod$Interval3.f99210a.compareTo((ChronoLocalDate) ((l80.f) eVar).e()) > 0) {
                    break;
                }
                if (Intrinsics.f(analyticsSpendingPeriod$Interval3.f99210a, ((AnalyticsSpendingPeriod$Interval) d0.m0(arrayList)).f99210a)) {
                    localDatePlusDays3 = localDatePlusDays3.plusDays(1L);
                } else {
                    arrayList.add(analyticsSpendingPeriod$Interval3);
                    localDatePlusDays3 = analyticsSpendingPeriod$Interval3.f99211b.plusDays(1L);
                }
                Intrinsics.h(localDatePlusDays3);
            }
        } else if (i == 2) {
            long jBetween = analyticsSpendingPeriod$Interval != null ? ChronoUnit.MONTHS.between(analyticsSpendingPeriod$Interval.f99210a, analyticsSpendingPeriod$Interval.f99211b) + 1 : 1L;
            if (analyticsSpendingPeriod$Interval == null || jBetween <= 1) {
                analyticsSpendingPeriod$IntervalB = h(1, lzi.b.EXACT, fromDate, jBetween).f200981b;
            } else {
                analyticsSpendingPeriod$IntervalB = b(i.MONTHLY, (int) jBetween, fromDate);
                if (analyticsSpendingPeriod$IntervalB == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            arrayList.add(analyticsSpendingPeriod$IntervalB);
            LocalDate localDatePlusDays4 = ((AnalyticsSpendingPeriod$Interval) d0.b0(arrayList)).f99211b.plusDays(1L);
            while (true) {
                l80.f fVar = (l80.f) eVar;
                if (localDatePlusDays4.compareTo((ChronoLocalDate) fVar.e()) <= 0) {
                    AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval4 = h(1, lzi.b.EXACT, localDatePlusDays4, jBetween).f200981b;
                    if (analyticsSpendingPeriod$Interval4.f99210a.compareTo((ChronoLocalDate) fVar.e()) > 0) {
                        break;
                    }
                    if (Intrinsics.f(analyticsSpendingPeriod$Interval4.f99210a, ((AnalyticsSpendingPeriod$Interval) d0.m0(arrayList)).f99210a)) {
                        localDatePlusDays = localDatePlusDays4.plusDays(1L);
                    } else {
                        arrayList.add(analyticsSpendingPeriod$Interval4);
                        localDatePlusDays = analyticsSpendingPeriod$Interval4.f99211b.plusDays(1L);
                    }
                    localDatePlusDays4 = localDatePlusDays;
                } else {
                    break;
                }
            }
        } else {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (analyticsSpendingPeriod$Interval != null) {
                    LocalDate localDate = analyticsSpendingPeriod$Interval.f99211b;
                    LocalDate localDate2 = analyticsSpendingPeriod$Interval.f99210a;
                    if (localDate2.compareTo((ChronoLocalDate) localDate) <= 0) {
                        long jBetween2 = ChronoUnit.DAYS.between(localDate2, localDate);
                        LocalDate localDatePlusDays5 = localDate.plusDays(1L);
                        ArrayList arrayList2 = new ArrayList();
                        l80.f fVar2 = (l80.f) eVar;
                        if (localDatePlusDays5.compareTo((ChronoLocalDate) fVar2.e()) <= 0) {
                            while (true) {
                                Intrinsics.h(localDatePlusDays5);
                                LocalDate localDatePlusDays6 = localDatePlusDays5.plusDays(jBetween2);
                                Intrinsics.checkNotNullExpressionValue(localDatePlusDays6, "plusDays(...)");
                                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval5 = new AnalyticsSpendingPeriod$Interval(localDatePlusDays5, localDatePlusDays6);
                                if (localDatePlusDays6.compareTo((ChronoLocalDate) fVar2.e()) > 0) {
                                    break;
                                }
                                arrayList2.add(analyticsSpendingPeriod$Interval5);
                                localDatePlusDays5 = localDatePlusDays6.plusDays(1L);
                            }
                        }
                        long j2 = 1 + jBetween2;
                        LocalDate localDateMinusDays = localDate2.minusDays(j2);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            Intrinsics.h(localDateMinusDays);
                            localDatePlusDays2 = localDateMinusDays.plusDays(jBetween2);
                            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
                            analyticsSpendingPeriod$Interval2 = new AnalyticsSpendingPeriod$Interval(localDateMinusDays, localDatePlusDays2);
                            if (localDateMinusDays.compareTo((ChronoLocalDate) fromDate) < 0) {
                                break;
                            }
                            arrayList3.add(analyticsSpendingPeriod$Interval2);
                            localDateMinusDays = localDateMinusDays.minusDays(j2);
                        }
                        if (jBetween2 != 0 && localDatePlusDays2.compareTo((ChronoLocalDate) fromDate) >= 0) {
                            arrayList3.add(analyticsSpendingPeriod$Interval2);
                        }
                        arrayList.addAll(d0.I0(arrayList3));
                        arrayList.add(analyticsSpendingPeriod$Interval);
                        arrayList.addAll(arrayList2);
                        return arrayList;
                    }
                }
                return f0.f322471a;
            }
            ArrayList arrayList4 = new ArrayList();
            LocalDate localDateWith = fromDate.with(TemporalAdjusters.firstDayOfYear());
            while (true) {
                Intrinsics.h(localDateWith);
                LocalDate localDateWith2 = localDateWith.with(TemporalAdjusters.lastDayOfYear());
                Intrinsics.checkNotNullExpressionValue(localDateWith2, "with(...)");
                arrayList4.add(new AnalyticsSpendingPeriod$Interval(localDateWith, localDateWith2));
                if (localDateWith2.compareTo((ChronoLocalDate) ((l80.f) eVar).e()) > 0) {
                    arrayList.addAll(arrayList4);
                    return arrayList;
                }
                localDateWith = localDateWith2.plusDays(1L);
            }
        }
        return arrayList;
    }

    public final j d(LocalDate localDate, lzi.h cycle) {
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        if (cycle instanceof lzi.g) {
            return i(((lzi.g) cycle).f200979a, localDate);
        }
        if (cycle instanceof lzi.c) {
            lzi.c cVar = (lzi.c) cycle;
            return h(cVar.f200975a, cVar.f200976b, localDate, 1L);
        }
        if (!(cycle instanceof lzi.e)) {
            throw new NoWhenBranchMatchedException();
        }
        lzi.e eVar = (lzi.e) cycle;
        lzi.f fVar = eVar.f200977a;
        lzi.d dVar = eVar.f200978b;
        LocalDate localDateE = localDate == null ? ((l80.f) this.f145751b).e() : localDate;
        LocalDate localDateF = f(localDateE, fVar, dVar);
        if (localDateF.compareTo((ChronoLocalDate) localDateE) > 0) {
            localDateE = localDateE.minusMonths(1L);
            Intrinsics.checkNotNullExpressionValue(localDateE, "minusMonths(...)");
            localDateF = f(localDateE, fVar, dVar);
        }
        LocalDate localDatePlusMonths = localDateE.plusMonths(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        LocalDate localDateMinusDays = f(localDatePlusMonths, fVar, dVar).minusDays(1L);
        i iVar = i.MONTHLY;
        Intrinsics.h(localDateMinusDays);
        return new j(iVar, new AnalyticsSpendingPeriod$Interval(localDateF, localDateMinusDays), null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public final LocalDate e(LocalDate localDate, int i, lzi.b bVar) {
        Set setY0;
        LocalDate localDatePlusDays = localDate.with(TemporalAdjusters.firstDayOfMonth()).plusDays(((long) i) - 1);
        LocalDate localDateWith = LocalDate.of(localDate.getYear(), localDate.getMonth(), 1).with(TemporalAdjusters.lastDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "with(...)");
        LocalDate localDateMinusDays = (LocalDate) kotlin.ranges.f.d(localDatePlusDays, localDateWith);
        String country = ((s80.b) this.f145750a).a().getCountry();
        Iterator it8 = f145749c.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                DayOfWeek[] elements = {DayOfWeek.SATURDAY, DayOfWeek.SUNDAY};
                Intrinsics.checkNotNullParameter(elements, "elements");
                setY0 = kotlin.collections.d.y0(elements);
                break;
            }
            Map.Entry entry = (Map.Entry) it8.next();
            Set set = (Set) entry.getKey();
            setY0 = (Set) entry.getValue();
            if (set.contains(country)) {
                break;
            }
        }
        int i2 = b.f145747b[bVar.ordinal()];
        if (i2 == 1) {
            while (setY0.contains(localDateMinusDays.getDayOfWeek())) {
                localDateMinusDays = localDateMinusDays.minusDays(1L);
            }
        } else if (i2 == 2) {
            while (setY0.contains(localDateMinusDays.getDayOfWeek())) {
                localDateMinusDays = localDateMinusDays.plusDays(1L);
            }
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.h(localDateMinusDays);
        return localDateMinusDays;
    }

    public final j h(int i, lzi.b bVar, LocalDate localDate, long j2) {
        if (localDate == null) {
            localDate = ((l80.f) this.f145751b).e();
        }
        int dayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        if (i <= dayOfMonth) {
            dayOfMonth = i;
        }
        if (dayOfMonth > localDate.getDayOfMonth()) {
            localDate = localDate.minusMonths(1L);
            Intrinsics.checkNotNullExpressionValue(localDate, "minusMonths(...)");
        }
        LocalDate localDateE = e(localDate, i, bVar);
        LocalDate localDatePlusMonths = localDate.plusMonths(j2);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        LocalDate localDateMinusDays = e(localDatePlusMonths, i, bVar).minusDays(1L);
        i iVar = i.MONTHLY;
        Intrinsics.h(localDateMinusDays);
        return new j(iVar, new AnalyticsSpendingPeriod$Interval(localDateE, localDateMinusDays), null);
    }

    public final j i(lzi.f fVar, LocalDate localDate) {
        if (localDate == null) {
            localDate = ((l80.f) this.f145751b).e();
        }
        LocalDate localDateMinusDays = localDate.minusDays(((long) ((localDate.getDayOfWeek().getValue() - g(fVar).getValue()) + 7)) % 7);
        LocalDate localDatePlusDays = localDateMinusDays.plusDays(6L);
        i iVar = i.WEEKLY;
        Intrinsics.h(localDatePlusDays);
        return new j(iVar, new AnalyticsSpendingPeriod$Interval(localDateMinusDays, localDatePlusDays), null);
    }
}
