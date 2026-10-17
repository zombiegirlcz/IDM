package lnd;

import aw0.c7;
import aw0.ka;
import aw0.la;
import aw0.n2;
import aw0.o9;
import aw0.r1;
import aw0.x1;
import aw0.y1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import ip0.nb;
import ip0.qb;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MoneyClause.Format.Shorts f197177c = new MoneyClause.Format.Shorts(true, 37);
    public static final List d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f197178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mzi.b f197179b;

    static {
        Float fValueOf = Float.valueOf(29.46f);
        Float fValueOf2 = Float.valueOf(32.97f);
        Float fValueOf3 = Float.valueOf(35.59f);
        Float fValueOf4 = Float.valueOf(32.09f);
        Float fValueOf5 = Float.valueOf(29.96f);
        Float fValueOf6 = Float.valueOf(34.88f);
        d = zhm.v.k(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf4, fValueOf6, Float.valueOf(38.78f), Float.valueOf(38.77f), fValueOf6, Float.valueOf(30.69f), Float.valueOf(26.3f), Float.valueOf(26.93f), Float.valueOf(29.18f), Float.valueOf(23.32f), Float.valueOf(16.3f), Float.valueOf(7.61f), Float.valueOf(0.35f), Float.valueOf(3.11f), Float.valueOf(7.54f), Float.valueOf(16.98f), Float.valueOf(22.48f), Float.valueOf(21.43f), Float.valueOf(25.81f), Float.valueOf(35.64f), Float.valueOf(42.18f), Float.valueOf(46.74f), Float.valueOf(39.72f), Float.valueOf(28.84f), Float.valueOf(37.0f), Float.valueOf(47.88f));
    }

    public f0(l80.e dateProvider, mzi.b intervalMapper, knd.o0 screenTypeInfoProvider, jnd.f budgetLineMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(screenTypeInfoProvider, "screenTypeInfoProvider");
        Intrinsics.checkNotNullParameter(budgetLineMapper, "budgetLineMapper");
        this.f197178a = dateProvider;
        this.f197179b = intervalMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0644  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r37v0, types: [lnd.f0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static lnd.d0 d(lnd.f0 r37, yld.d r38, lzi.i r39, long r40, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r42, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r43, he3.j r44, he3.j r45, boolean r46, boolean r47, xi0.b r48, dj0.d r49, dj0.d r50, boolean r51, jnd.d r52, java.lang.String r53, boolean r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lnd.f0.d(lnd.f0, yld.d, lzi.i, long, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, he3.j, he3.j, boolean, boolean, xi0.b, dj0.d, dj0.d, boolean, jnd.d, java.lang.String, boolean, int):lnd.d0");
    }

    public static ArrayList e(AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval) {
        ArrayList arrayList = new ArrayList();
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        LocalDate localDate = analyticsSpendingPeriod$Interval.f99210a;
        int iBetween = ((int) chronoUnit.between(localDate, analyticsSpendingPeriod$Interval.f99211b)) + 1;
        for (int i = 0; i < iBetween; i++) {
            long j2 = i;
            LocalDate localDatePlusDays = localDate.plusDays(j2);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            LocalDate localDatePlusDays2 = localDate.plusDays(j2);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
            arrayList.add(new AnalyticsSpendingPeriod$Interval(localDatePlusDays, localDatePlusDays2));
        }
        return arrayList;
    }

    public static boolean f(he3.j jVar) {
        Collection collectionValues = jVar.f151565c.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            if (((he3.i) it8.next()).f151562b > 0) {
                return true;
            }
        }
        return false;
    }

    public static qb j(int i, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, x1 heightMode) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        String strValueOf = String.valueOf(i);
        ind.f fVar = analyticsSpendingPeriod$Interval != null ? new ind.f(analyticsSpendingPeriod$Interval, null, i) : null;
        int i2 = R$attr.uikit_dp8;
        return new qb(strValueOf, heightMode, fVar, i2, i2, 24);
    }

    public final c0 a(int i, boolean z, lzi.i iVar, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, long j2, int i2, boolean z3, boolean z4) {
        int i3 = e0.f197174b[iVar.ordinal()];
        mzi.b bVar = this.f197179b;
        if (i3 == 1) {
            Clause clauseA = mzi.b.a(bVar, hx7.a.D(analyticsSpendingPeriod$Interval), null, true, null, 58);
            if (z) {
                String displayName = analyticsSpendingPeriod$Interval.f99210a.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
                Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
                textClause = new TextClause(displayName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            return new c0(clauseA, textClause, i, false, false, 24);
        }
        if (i3 == 2) {
            Interval intervalD = hx7.a.D(analyticsSpendingPeriod$Interval);
            LocalDate localDate = analyticsSpendingPeriod$Interval.f99210a;
            Clause clauseA2 = mzi.b.a(bVar, intervalD, null, true, null, 58);
            if (z) {
                String displayName2 = j2 == 6 ? localDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()) : String.valueOf(localDate.getDayOfMonth());
                Intrinsics.h(displayName2);
                textClause = new TextClause(displayName2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            return new c0(clauseA2, textClause, i, false, false, 24);
        }
        if (i3 == 3) {
            Clause clauseA3 = mzi.b.a(bVar, hx7.a.D(analyticsSpendingPeriod$Interval), null, true, null, 58);
            if (z) {
                String displayName3 = analyticsSpendingPeriod$Interval.f99210a.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault());
                Intrinsics.checkNotNullExpressionValue(displayName3, "getDisplayName(...)");
                textClause = new TextClause(displayName3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            return new c0(clauseA3, textClause, i, false, false, 24);
        }
        if (i3 != 4 && i3 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (i2 <= 31) {
            return new c0(mzi.b.a(bVar, hx7.a.D(analyticsSpendingPeriod$Interval), null, true, null, 58), z ? new NumberClause(analyticsSpendingPeriod$Interval.f99210a.getDayOfMonth(), (NumberClause.Format.Compact) null, (Custom) null, 6) : null, i, false, false, 24);
        }
        if (i2 <= 124) {
            Interval intervalD2 = hx7.a.D(analyticsSpendingPeriod$Interval);
            LocalDate localDate2 = analyticsSpendingPeriod$Interval.f99210a;
            Clause clauseA4 = mzi.b.a(bVar, intervalD2, null, true, null, 58);
            if (z) {
                textClause = z3 ? com.revolut.core.ui_kit.models.j.b(c7.Companion, localDate2, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT)) : new NumberClause(localDate2.getDayOfMonth(), (NumberClause.Format.Compact) null, (Custom) null, 6);
            }
            return new c0(clauseA4, textClause, i, z3, false, 16);
        }
        if (i2 <= 186) {
            return new c0(mzi.b.a(bVar, hx7.a.D(analyticsSpendingPeriod$Interval), null, true, null, 58), z ? com.revolut.core.ui_kit.models.j.b(c7.Companion, analyticsSpendingPeriod$Interval.f99210a, new LocalDateClause$DateFormat.Month(ka.SHORT)) : null, i, false, false, 24);
        }
        if (i2 > 1098) {
            Clause clauseA5 = mzi.b.a(bVar, hx7.a.D(analyticsSpendingPeriod$Interval), null, true, null, 58);
            if (z) {
                LocalDate localDate3 = analyticsSpendingPeriod$Interval.f99210a;
                TimeClause.Format.Year year = new TimeClause.Format.Year(la.SHORT);
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                textClause = new TimeClause(localDate3.atStartOfDay(zoneOffset).toEpochSecond() * ((long) 1000), year, null, zoneOffset);
            }
            return new c0(clauseA5, textClause, i, false, false, 24);
        }
        Interval intervalD3 = hx7.a.D(analyticsSpendingPeriod$Interval);
        LocalDate localDate4 = analyticsSpendingPeriod$Interval.f99210a;
        Clause clauseA6 = mzi.b.a(bVar, intervalD3, null, true, null, 58);
        if (z) {
            if (z4) {
                TimeClause.Format.MonthAndYear monthAndYear = new TimeClause.Format.MonthAndYear(ka.SHORT, la.SHORT);
                ZoneOffset zoneOffset2 = ZoneOffset.UTC;
                textClause = new TimeClause(((long) 1000) * localDate4.atStartOfDay(zoneOffset2).toEpochSecond(), monthAndYear, null, zoneOffset2);
            } else {
                textClause = com.revolut.core.ui_kit.models.j.b(c7.Companion, localDate4, new LocalDateClause$DateFormat.Month(ka.SHORT));
            }
        }
        return new c0(clauseA6, textClause, i, false, z4, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(int r38, java.util.List r39, lzi.i r40, long r41, boolean r43) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lnd.f0.b(int, java.util.List, lzi.i, long, boolean):java.util.List");
    }

    public final List c(List list, he3.j jVar, boolean z, long j2, boolean z3) {
        Float fValueOf;
        if (list.isEmpty()) {
            return zhm.f0.f322471a;
        }
        LocalDate localDateE = ((l80.f) this.f197178a).e();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        long j3 = j2;
        while (it8.hasNext()) {
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = (AnalyticsSpendingPeriod$Interval) it8.next();
            if (analyticsSpendingPeriod$Interval.f99210a.compareTo((ChronoLocalDate) localDateE) > 0) {
                fValueOf = null;
            } else {
                long jAbs = 0;
                if (jVar != null) {
                    he3.i iVar = (he3.i) jVar.f151565c.get(jli.b.i(analyticsSpendingPeriod$Interval.f99210a));
                    if (iVar != null) {
                        jAbs = iVar.f151561a;
                        if (z) {
                            jAbs = Math.abs(jAbs);
                        }
                    }
                }
                j3 += jAbs;
                fValueOf = Float.valueOf(j3);
            }
            if (fValueOf != null) {
                arrayList.add(fValueOf);
            }
        }
        return (j3 != j2 || (jVar != null && f(jVar)) || z3) ? arrayList : zhm.f0.f322471a;
    }

    public final List g(ArrayList arrayList, int i, int i2, List list, lzi.i iVar, long j2, boolean z, boolean z3) {
        Object objPrevious;
        boolean z4;
        if (((c0) zhm.d0.m0(arrayList)).f197161b != null) {
            return arrayList;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((c0) objPrevious).f197161b != null) {
                break;
            }
        }
        c0 c0Var = (c0) objPrevious;
        boolean z6 = true;
        if (c0Var == null) {
            return zhm.d0.F0(a(zhm.v.j(list), true, iVar, (AnalyticsSpendingPeriod$Interval) zhm.d0.m0(list), j2, i2, z, z3), zhm.d0.W(1, arrayList));
        }
        int i3 = c0Var.f197162c;
        boolean z11 = zhm.v.j(arrayList) - i3 <= i / 2;
        boolean z12 = z ? true : z11 ? c0Var.d : false;
        if (z3) {
            z4 = z6;
        } else if (z11) {
            z6 = c0Var.e;
            z4 = z6;
        } else {
            z4 = false;
        }
        ArrayList arrayListF1 = zhm.d0.f1(arrayList);
        if (z11) {
            arrayListF1.set(i3, c0.a(c0Var, 5));
        }
        arrayListF1.set(zhm.v.j(arrayList), a(zhm.v.j(list), true, iVar, (AnalyticsSpendingPeriod$Interval) zhm.d0.m0(list), j2, i2, z12, z4));
        return arrayListF1;
    }

    public final List h(List list, int i, lzi.i iVar, long j2, ArrayList arrayList, int i2) {
        Collection collectionV0;
        c0 c0VarA = a(zhm.v.j(list), true, iVar, (AnalyticsSpendingPeriod$Interval) zhm.d0.m0(list), j2, i, false, false);
        if (!arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((c0) it8.next()).f197161b, c0VarA.f197161b)) {
                    return arrayList;
                }
            }
        }
        if (arrayList.isEmpty()) {
            collectionV0 = zhm.f0.f322471a;
        } else {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                if (c0VarA.f197162c - ((c0) listIterator.previous()).f197162c > i2 / 2) {
                    collectionV0 = zhm.d0.V0(arrayList, listIterator.nextIndex() + 1);
                    break;
                }
            }
            collectionV0 = zhm.f0.f322471a;
        }
        return zhm.d0.F0(c0VarA, collectionV0);
    }

    public final nb i(int i, yld.d screenType, lzi.i periodType, long j2, AnalyticsSpendingPeriod$Interval currentInterval, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, he3.j jVar, he3.j jVar2, xi0.b currency, dj0.d dVar, dj0.d dVar2, x1 heightMode, jnd.d budget, String str) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        Intrinsics.checkNotNullParameter(currentInterval, "currentInterval");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(budget, "budget");
        int i2 = e0.f197174b[periodType.ordinal()];
        boolean z = true;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        d0 d0VarD = d(this, screenType, periodType, j2, currentInterval, analyticsSpendingPeriod$Interval, jVar, jVar2, true, false, currency, dVar, dVar2, z, budget, str, true, 512);
        String strValueOf = String.valueOf(i);
        y1 y1Var = d0VarD.f197167a;
        r1 r1Var = d0VarD.f197169c;
        a0 a0Var = d0VarD.e;
        n2 n2Var = d0VarD.f197168b;
        ind.f fVar = new ind.f(currentInterval, null, i);
        int i3 = R$attr.uikit_dp8;
        return new nb(strValueOf, y1Var, r1Var, n2Var, heightMode, a0Var, fVar, i3, i3, 384);
    }
}
