package end;

import aw0.a7;
import aw0.ja;
import aw0.o9;
import aw0.t6;
import aw0.w6;
import aw0.x6;
import aw0.y6;
import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import com.revolut.core.ui_kit.delegates.w7;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.api.AnalyticsAccount;
import he3.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements dmd.b {

    @NotNull
    public static final C0737a Companion = new C0737a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause.Format.Shorts f127805a = new MoneyClause.Format.Shorts(false, 63);

    /* JADX INFO: renamed from: end.a$a, reason: collision with other inner class name */
    public static final class C0737a {
        private C0737a() {
        }
    }

    public static int c(LocalDate localDate, LocalDate localDate2) {
        return Days.daysBetween(localDate, localDate2).getDays();
    }

    public static x6 d(yld.a aVar, qzi.g gVar, dmd.a aVar2) {
        int iIntValue;
        int i;
        int iIntValue2;
        int i2;
        List list = aVar.f314691h;
        dj0.d dVar = aVar.f314690g;
        LocalDate localDate = (LocalDate) ((Pair) d0.b0(list)).f186385a;
        ArrayList arrayList = new ArrayList();
        yld.f fVar = aVar.f314687a;
        if (fVar != null) {
            LocalDate localDate2 = fVar.f314694a;
            LocalDate localDate3 = fVar.f314695b;
            int iC = c(localDate, localDate2);
            int iC2 = c(localDate, localDate3);
            Integer numG = g(gVar, R$attr.uikit_colorPerformancePositive, R$attr.uikit_colorPerformanceNegative, R$attr.uikit_colorStatusWarning);
            int[] iArr = b.f127807b;
            int i3 = iArr[aVar2.ordinal()];
            if (i3 == 1) {
                iIntValue = R$attr.uikit_colorPerformancePositive;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iIntValue = R$attr.uikit_colorPerformanceNegative;
            }
            int i5 = iArr[aVar2.ordinal()];
            if (i5 == 1) {
                i = R$attr.uikit_colorPerformanceNegative;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.uikit_colorPerformancePositive;
            }
            int i6 = R$attr.uikit_colorAccentNeutral;
            if (dVar.k()) {
                iIntValue = i6;
            } else if (!dVar.f(dj0.d.e)) {
                iIntValue = i;
            }
            if (numG != null) {
                iIntValue = numG.intValue();
            }
            int i21 = iIntValue;
            Integer numG2 = g(gVar, R$attr.uikit_colorPerformancePositive_30, R$attr.uikit_colorPerformanceNegative_30, R$attr.uikit_colorStatusWarning_30);
            int i22 = iArr[aVar2.ordinal()];
            if (i22 == 1) {
                iIntValue2 = R$attr.uikit_colorPerformancePositive_30;
            } else {
                if (i22 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iIntValue2 = R$attr.uikit_colorPerformanceNegative_30;
            }
            int i32 = iArr[aVar2.ordinal()];
            if (i32 == 1) {
                i2 = R$attr.uikit_colorPerformanceNegative_30;
            } else {
                if (i32 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$attr.uikit_colorPerformancePositive_30;
            }
            int i33 = R$attr.uikit_colorAccentNeutral_30;
            if (dVar.k()) {
                iIntValue2 = i33;
            } else if (!dVar.f(dj0.d.e)) {
                iIntValue2 = i2;
            }
            if (numG2 != null) {
                iIntValue2 = numG2.intValue();
            }
            arrayList.add(new w6(i21, iIntValue2, R$attr.uikit_colorTransparent, iC, iC2, false, 64));
        }
        yld.f fVar2 = aVar.f314688b;
        if (fVar2 != null) {
            LocalDate localDate4 = fVar2.f314694a;
            LocalDate localDate5 = fVar2.f314695b;
            arrayList.add(new w6(R$attr.uikit_colorGreyTone20, R$attr.uikit_colorGreyTone10, R$attr.uikit_colorTransparent, c(localDate, localDate4), c(localDate, localDate5), true, 64));
        }
        return new x6(arrayList);
    }

    public static ArrayList f(yld.a aVar) {
        List list = aVar.f314691h;
        LocalDate localDate = (LocalDate) ((Pair) d0.b0(list)).f186385a;
        List<Pair> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Pair pair : list2) {
            arrayList.add(new y6(c(localDate, (LocalDate) pair.f186385a), ((dj0.d) pair.f186386b).f115082a));
        }
        return arrayList;
    }

    public static Integer g(qzi.g gVar, int i, int i2, int i3) {
        int i5 = gVar == null ? -1 : b.f127808c[gVar.ordinal()];
        if (i5 == -1) {
            return null;
        }
        if (i5 == 1) {
            return Integer.valueOf(i);
        }
        if (i5 == 2) {
            return Integer.valueOf(i3);
        }
        if (i5 == 3) {
            return Integer.valueOf(i2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final LineChartResizableTileDelegate.Model a(yld.a chart, p periodPreferences, qzi.g gVar, AnalyticsAccount analyticsAccount, dmd.a moneyChangePolicy) {
        MoneyClause moneyClause;
        a7 a7Var;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(periodPreferences, "periodPreferences");
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(moneyChangePolicy, "moneyChangePolicy");
        ArrayList arrayListF = f(chart);
        List list = chart.f314691h;
        ja jaVarE = e(chart, periodPreferences, gVar, moneyChangePolicy);
        x6 x6VarD = d(chart, gVar, moneyChangePolicy);
        w7 w7Var = w7.MEDIUM;
        int i = b.f127806a[z92.f.o(periodPreferences).ordinal()];
        if (i == 1) {
            moneyClause = null;
            LocalDate localDate = (LocalDate) ((Pair) d0.b0(list)).f186385a;
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(new t6(c(localDate, r7), new TimeClause(((LocalDate) ((Pair) it8.next()).f186385a).toDateTimeAtStartOfDay().getMillis(), TimeClause.Format.ShortDayOfWeek.f57976b, null, null, 12)));
            }
            a7Var = new a7(arrayList);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("AnalyticsWidgetMapper: types other then WEEK and MONTH aren't supported");
            }
            LocalDate localDate2 = (LocalDate) ((Pair) d0.b0(list)).f186385a;
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                LocalDate localDate3 = (LocalDate) ((Pair) obj2).f186385a;
                int iJ = v.j(list);
                t6 t6Var = (i2 == iJ || (i2 % 5 == 0 && iJ - i2 >= 2)) ? new t6(c(localDate2, localDate3), new TextClause(String.valueOf(localDate3.getDayOfMonth()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : null;
                if (t6Var != null) {
                    arrayList2.add(t6Var);
                }
                i2 = i3;
            }
            moneyClause = null;
            a7Var = new a7(arrayList2);
        }
        return new LineChartResizableTileDelegate.Model("ID_ANALYTICS_TILE", arrayListF, jaVarE, x6VarD, null, w7Var, a7Var, !chart.f314689c.k() ? new MoneyClause((dj0.d) ((Pair) d0.m0(list)).f186386b, this.f127805a, null, null, 12) : moneyClause, null, null, analyticsAccount, 6928);
    }

    public final LineChartResizableTileDelegate.Model b(yld.a chart, p periodPreferences, qzi.g gVar, AnalyticsAccount analyticsAccount, dmd.a moneyChangePolicy) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(periodPreferences, "periodPreferences");
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(moneyChangePolicy, "moneyChangePolicy");
        return new LineChartResizableTileDelegate.Model("ID_ANALYTICS_TILE", f(chart), e(chart, periodPreferences, gVar, moneyChangePolicy), d(chart, gVar, moneyChangePolicy), null, w7.SMALL, null, null, null, null, analyticsAccount, 7120);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aw0.ja e(yld.a r23, he3.p r24, qzi.g r25, dmd.a r26) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: end.a.e(yld.a, he3.p, qzi.g, dmd.a):aw0.ja");
    }
}
