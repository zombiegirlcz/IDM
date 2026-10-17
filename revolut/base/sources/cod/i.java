package cod;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import he3.j;
import ind.b0;
import ind.z;
import java.util.List;
import knd.o0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import lnd.p0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Interval;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzi.b f25537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f25538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lnd.d f25539c;
    public final p0 d;
    public final l80.e e;

    public i(mzi.b intervalMapper, f performanceMapper, lnd.d barChartMapper, p0 categoryGroupMapper, o0 screenTypeInfoProvider, c chartOptionsStateFactory, jnd.e analyticsBudgetInfoMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(barChartMapper, "barChartMapper");
        Intrinsics.checkNotNullParameter(categoryGroupMapper, "categoryGroupMapper");
        Intrinsics.checkNotNullParameter(screenTypeInfoProvider, "screenTypeInfoProvider");
        Intrinsics.checkNotNullParameter(chartOptionsStateFactory, "chartOptionsStateFactory");
        Intrinsics.checkNotNullParameter(analyticsBudgetInfoMapper, "analyticsBudgetInfoMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f25537a = intervalMapper;
        this.f25538b = performanceMapper;
        this.f25539c = barChartMapper;
        this.d = categoryGroupMapper;
        this.e = dateProvider;
    }

    public static CompositeClause a(ind.c cVar, lnd.a aVar) {
        int i;
        Float fValueOf = Float.valueOf(12.0f);
        if (aVar.f197152b <= 1) {
            return null;
        }
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_bar_chart, new ImageClauseTint.Color(R$attr.uikit_colorBlue), fValueOf, fValueOf, 16);
        lzi.i iVar = cVar.f162793b;
        long j2 = cVar.f162794c;
        int i2 = h.f25536c[iVar.ordinal()];
        if (i2 == 1) {
            i = R$string.analytics_spendings_bar_chart_average_week_title;
        } else if (i2 == 2) {
            i = j2 == 1 ? R$string.analytics_spendings_bar_chart_average_month_title : R$string.analytics_spendings_bar_chart_average_year_title;
        } else if (i2 == 3) {
            i = R$string.analytics_spendings_bar_chart_average_year_title;
        } else {
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            long j3 = j2 + 1;
            i = j3 <= 7 ? R$string.analytics_spendings_bar_chart_average_week_title : j3 <= 31 ? R$string.analytics_spendings_bar_chart_average_month_title : j3 <= 366 ? R$string.analytics_spendings_bar_chart_average_year_title : R$string.analytics_spendings_bar_chart_average_years_title;
        }
        List listK = v.k(imageClause, new TextLocalisedClause(i, u.c(new MoneyClause(otd.f.a(new dj0.d((long) aVar.d, cVar.i.f115083b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(R$attr.uikit_colorBlue), false, false, 254), null, 8)), new Custom(Integer.valueOf(R$attr.uikit_colorBlue), false, null, false, null, 254), 8));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final CompositeClause b(ind.c cVar) {
        List list;
        dj0.d dVarF;
        List list2;
        dj0.d dVarF2;
        Float fValueOf = Float.valueOf(10.0f);
        b0 b0Var = cVar.e;
        dj0.d dVar = cVar.i;
        xi0.b bVar = cVar.d;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = cVar.f162795g;
        z zVar = b0Var instanceof z ? (z) b0Var : null;
        dj0.d dVar2 = (zVar == null || (list2 = zVar.f162835a) == null || (dVarF2 = f(analyticsSpendingPeriod$Interval, list2)) == null) ? new dj0.d(0L, dVar.f115083b) : otd.f.a(otd.f.e(dVarF2, bVar).a());
        dj0.d dVar3 = (zVar == null || (list = zVar.f162836b) == null || (dVarF = f(analyticsSpendingPeriod$Interval, list)) == null) ? new dj0.d(0L, dVar.f115083b) : otd.f.a(otd.f.e(dVarF, bVar).a());
        List listK = v.k(new ImageClause(R$drawable.uikit_icn_16_plus_circle, new ImageClauseTint.Color(R$attr.uikit_colorPerformancePositive), fValueOf, fValueOf, 16), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(R$attr.uikit_colorPerformancePositive), false, false, 254), null, 8));
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        List listK2 = v.k(new ImageClause(R$drawable.uikit_icn_16_minus_circle, new ImageClauseTint.Color(R$attr.uikit_colorPerformanceNegative), fValueOf, fValueOf, 16), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(R$attr.uikit_colorPerformanceNegative), false, false, 254), null, 8));
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        List listK3 = v.k(compositeClause, new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new CompositeClause(listK3, new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final CompositeClause c(ind.e eVar, ind.e eVar2, yld.d dVar) {
        int i;
        int i2;
        int i3;
        switch (h.f25534a[dVar.ordinal()]) {
            case 1:
                i = R$attr.uikit_colorPerformanceNegative;
                i2 = R$attr.uikit_colorPerformancePositive;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                i = R$attr.uikit_colorPerformancePositive;
                i2 = R$attr.uikit_colorPerformanceNegative;
                break;
            case 4:
                throw new UnsupportedOperationException("no performance for cashflow");
            default:
                throw new NoWhenBranchMatchedException();
        }
        dj0.d dVarA = this.f25538b.a(eVar, eVar2, dVar);
        if (dVarA == null) {
            return null;
        }
        long j2 = dVarA.f115082a;
        if (j2 > 0) {
            i3 = R$drawable.uikit_icn_10_stocks_arrow_up;
        } else {
            if (j2 >= 0) {
                return null;
            }
            i3 = R$drawable.uikit_icn_10_stocks_arrow_down;
            i = i2;
        }
        List listK = v.k(new ImageClause(i3, new ImageClauseTint.Color(i), (Float) null, (Float) null, 28), new MoneyClause(otd.f.a(dVarA).a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(i), false, false, 254), null, 8));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final Clause d(Clause clause, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, lzi.i iVar) {
        boolean z;
        Interval intervalD = hx7.a.D(analyticsSpendingPeriod$Interval);
        int i = h.f25536c[iVar.ordinal()];
        if (i == 1) {
            z = false;
        } else if (i == 2 || i == 3) {
            z = true;
        } else {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        Clause clauseA = mzi.b.a(this.f25537a, intervalD, new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), z, null, 56);
        return clause != null ? new CompositeClause(v.k(clause, clauseA), new DotDividerClause((Integer) null), null, null, 12) : clauseA;
    }

    public final Clause e(CompositeClause compositeClause, ind.e eVar) {
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalA;
        ind.c cVar = eVar instanceof ind.c ? (ind.c) eVar : null;
        if (cVar == null || (analyticsSpendingPeriod$IntervalA = cVar.f162795g) == null) {
            analyticsSpendingPeriod$IntervalA = eVar.a();
        }
        return d(compositeClause, analyticsSpendingPeriod$IntervalA, eVar.getType());
    }

    public final dj0.d f(AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, List list) {
        if (analyticsSpendingPeriod$Interval != null) {
            list = p0.e(analyticsSpendingPeriod$Interval, list);
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO = i == 0 ? ((j) obj2).f151564b : pyd.c.O(dVarO, ((j) obj2).f151564b);
            i = i2;
        }
        return dVarO;
    }
}
