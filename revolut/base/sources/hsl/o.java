package hsl;

import aw0.ka;
import aw0.o1;
import aw0.o9;
import aw0.q2;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.trading.orders.R$plurals;
import com.revolut.trading.orders.R$string;
import ip0.mj;
import ip0.nj;
import ip0.qj;
import ip0.sj;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import tx0.k0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements jdf.g {

    @NotNull
    public static final i Companion = new i();
    public static final int d = R$attr.uikit_colorPerformancePositive;
    public static final int e = R$attr.uikit_colorAccent;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f155092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f155093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f155094c;

    public o(k projectionsChartIntervalDatesProvider, l projectionsChartLegendMapper, j projectionsChartDatasetBuilder, n yAxisParamsBuilder, gte.a featureToggleInteractor, m selectedProjectionsProvider) {
        Intrinsics.checkNotNullParameter(projectionsChartIntervalDatesProvider, "projectionsChartIntervalDatesProvider");
        Intrinsics.checkNotNullParameter(projectionsChartLegendMapper, "projectionsChartLegendMapper");
        Intrinsics.checkNotNullParameter(projectionsChartDatasetBuilder, "projectionsChartDatasetBuilder");
        Intrinsics.checkNotNullParameter(yAxisParamsBuilder, "yAxisParamsBuilder");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(selectedProjectionsProvider, "selectedProjectionsProvider");
        this.f155092a = projectionsChartLegendMapper;
        this.f155093b = projectionsChartDatasetBuilder;
        this.f155094c = featureToggleInteractor;
    }

    public static MoneyClause b(dj0.d dVar, Custom custom) {
        long jK = cp5.d.k(dVar.f115083b);
        return new MoneyClause(pyd.c.U(pyd.c.k(dVar, jK), jK), new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.List] */
    public final List a(List list, jdf.f domainState) {
        int i;
        mj mjVar;
        jdf.b bVar;
        HeaderDelegate.Model model;
        int i2;
        ?? arrayList;
        FixedTabsDelegate.Model model2;
        String id10;
        int i3;
        Clause textClause;
        List projections = list;
        Intrinsics.checkNotNullParameter(projections, "projections");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (projections.isEmpty()) {
            return f0.f322471a;
        }
        FeatureTradingApi$Toggles$InvestmentPlanHub featureTradingApi$Toggles$InvestmentPlanHub = FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c;
        gte.a aVar = this.f155094c;
        if (((jte.d) aVar).c(featureTradingApi$Toggles$InvestmentPlanHub)) {
            jdf.b selectedChartPeriod = domainState.f173063b;
            if (selectedChartPeriod == null) {
                selectedChartPeriod = jdf.b.FIVE_YEARS;
            }
            Intrinsics.checkNotNullParameter(projections, "projections");
            Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
            projections = d0.N0(projections, new IntRange(0, Math.min(v.j(projections), selectedChartPeriod.b()), 1));
        }
        LocalDate startDate = ((tel.a) d0.b0(projections)).f270113a;
        LocalDate endDate = ((tel.a) d0.m0(projections)).f270113a;
        int i5 = ((jte.d) aVar).c(featureTradingApi$Toggles$InvestmentPlanHub) ? 2 : 5;
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        long jBetween = ChronoUnit.DAYS.between(startDate, endDate) / ((long) (i5 - 1));
        IntRange intRangeO = kotlin.ranges.f.o(0, i5);
        ArrayList xAxisDates = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            xAxisDates.add(startDate.plusDays(((long) it8.nextInt()) * jBetween));
        }
        Integer num = domainState.f173062a;
        jdf.b bVar2 = domainState.f173063b;
        tel.a projection = (tel.a) projections.get(num != null ? num.intValue() : v.j(projections));
        if (num != null) {
            int iIntValue = num.intValue();
            tel.a projection2 = (tel.a) projections.get(iIntValue);
            Intrinsics.checkNotNullParameter(projection2, "projection");
            i = 1;
            mjVar = new mj(iIntValue, projection2.f270114b, projection2.e, projection2.f, projection2.f270116g, projection2.d, projection2.f270115c);
        } else {
            i = 1;
            mjVar = null;
        }
        aim.e eVarB = u.b();
        FeatureTradingApi$Toggles$InvestmentPlanHub featureTradingApi$Toggles$InvestmentPlanHub2 = FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c;
        if (((jte.d) aVar).c(featureTradingApi$Toggles$InvestmentPlanHub2)) {
            int iIntValue2 = num != null ? num.intValue() : (bVar2 == null ? jdf.b.FIVE_YEARS : bVar2).b();
            bVar = bVar2;
            q2 q2Var = new q2(2, b(projection.e, null), null, false);
            aim.e eVarB2 = u.b();
            eVarB2.add(new TextLocalisedQuantityClause(R$plurals.wealth_trading_invest_order_investment_plan_projections_projection_chart_description_projected_value, Integer.valueOf(iIntValue2), u.c(Integer.valueOf(iIntValue2)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8));
            if (num != null) {
                textClause = yoj.b.w(yoj.b.w(new TextLocalisedClause(R$string.wealth_trading_invest_order_investment_plan_projections_projection_chart_description_contribution, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), sx4.g.e(i)), b(projection.f270114b, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)));
            } else {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            n14.e.b(eVarB2, textClause);
            model = new HeaderDelegate.Model("investment_plan_forecast_header_list_id", null, q2Var, null, new CompositeClause(u.a(eVarB2), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, new HeaderDelegate.a.b(16, false, false, false, false), null, k0.LARGE, HeaderDelegate.Model.b.a.f52415a, 29656);
            model.f52411w = R$attr.uikit_dp16;
        } else {
            bVar = bVar2;
            model = null;
        }
        n14.e.b(eVarB, model);
        TextLocalisedClause textLocalisedClause = ((jte.d) aVar).c(featureTradingApi$Toggles$InvestmentPlanHub2) ? null : new TextLocalisedClause(R$string.wealth_trading_invest_order_investment_plan_projections_projection_chart_description, u.c(new TextClause(String.valueOf(projection.f270113a.getYear()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        Intrinsics.checkNotNullParameter(projection, "projection");
        int i6 = R$string.wealth_trading_invest_order_investment_plan_projections_projection_chart_legend_projected_value;
        dj0.d dVar = projection.e;
        Companion.getClass();
        int i21 = d;
        l lVar = this.f155092a;
        o1 o1Var = new o1(v.k(lVar.a(i6, i21, dVar), lVar.a(R$string.wealth_trading_invest_order_investment_plan_projections_projection_chart_legend_contribution, e, projection.f270114b)));
        Intrinsics.checkNotNullParameter(xAxisDates, "xAxisDates");
        Intrinsics.checkNotNullParameter(projections, "projections");
        if (((jte.d) this.f155093b.f155090a).c(featureTradingApi$Toggles$InvestmentPlanHub2)) {
            TextClause textClause2 = new TextClause(String.valueOf(((LocalDate) d0.b0(xAxisDates)).getYear()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TimeClause timeClause = new TimeClause(oc.c.F((LocalDate) d0.m0(xAxisDates)), new TimeClause.Format.MonthAndYear(ka.FULL, 2), null, null, 12);
            Clause[] clauseArr = new Clause[2];
            i2 = 0;
            clauseArr[0] = textClause2;
            clauseArr[i] = timeClause;
            arrayList = v.k(clauseArr);
        } else {
            i2 = 0;
            arrayList = new ArrayList(w.t(xAxisDates, 10));
            Iterator it9 = xAxisDates.iterator();
            while (it9.hasNext()) {
                arrayList.add(new TextClause(String.valueOf(((LocalDate) it9.next()).getYear()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
        }
        List list2 = projections;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        int i22 = i2;
        for (Object obj2 : list2) {
            int i32 = i22 + 1;
            if (i22 < 0) {
                v.s();
                throw null;
            }
            tel.a projection3 = (tel.a) obj2;
            Intrinsics.checkNotNullParameter(projection3, "projection");
            arrayList2.add(new mj(i22, projection3.f270114b, projection3.e, projection3.f, projection3.f270116g, projection3.d, projection3.f270115c));
            i22 = i32;
        }
        nj njVar = new nj(arrayList2, arrayList);
        Intrinsics.checkNotNullParameter(projections, "projections");
        tel.a aVar2 = (tel.a) d0.m0(projections);
        Iterator it10 = v.k(aVar2.f270114b, aVar2.f270115c, aVar2.d, aVar2.e, aVar2.f, aVar2.f270116g).iterator();
        if (!it10.hasNext()) {
            throw new NoSuchElementException();
        }
        dj0.d dVar2 = (dj0.d) it10.next();
        while (it10.hasNext()) {
            dj0.d dVar3 = (dj0.d) it10.next();
            dVar2.getClass();
            if (dVar2.compareTo(dVar3) < 0) {
                dVar2 = dVar3;
            }
        }
        long j2 = dVar2.f115082a;
        int iLog10 = ((int) Math.log10(j2)) - 1;
        Integer numValueOf = Integer.valueOf(iLog10);
        if (iLog10 < 0) {
            numValueOf = null;
        }
        long jPow = ((long) 6) * ((long) Math.pow(10.0d, numValueOf != null ? numValueOf.intValue() : i2));
        dj0.d dVarC = dj0.d.c(dVar2, ((j2 / jPow) * jPow) + jPow, null, 2);
        dj0.d.Companion.getClass();
        eVarB.add(new qj("investment_plan_forecast_list_id", textLocalisedClause, o1Var, njVar, true, true, mjVar, new sj(dVarC, dj0.d.e), null, e, d, null));
        if (((jte.d) aVar).c(FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c)) {
            EnumEntries<jdf.b> enumEntriesA = jdf.b.a();
            ArrayList arrayList3 = new ArrayList(w.t(enumEntriesA, 10));
            for (jdf.b bVar3 : enumEntriesA) {
                String id11 = bVar3.getId();
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                int i33 = a.f155082a[bVar3.ordinal()];
                int i43 = i;
                if (i33 == i43) {
                    i3 = R$string.wealth_trading_invest_order_investment_plan_projections_range_short_five_years;
                } else if (i33 == 2) {
                    i3 = R$string.wealth_trading_invest_order_investment_plan_projections_range_short_ten_years;
                } else if (i33 == 3) {
                    i3 = R$string.wealth_trading_invest_order_investment_plan_projections_range_short_fifteen_years;
                } else {
                    if (i33 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = R$string.wealth_trading_invest_order_investment_plan_projections_range_short_twenty_years;
                }
                arrayList3.add(new FixedTabs.Item(id11, new TextLocalisedClause(i3, null, null, 14), (AnalyticsContext) null, 12));
                i = i43;
            }
            if (bVar == null || (id10 = bVar.getId()) == null) {
                id10 = jdf.b.FIVE_YEARS.getId();
            }
            model2 = new FixedTabsDelegate.Model("investment_plan_projection_chart_period_tabs_list_id", arrayList3, id10, false, jdf.c.f173061a, 56);
        } else {
            model2 = null;
        }
        n14.e.b(eVarB, model2);
        return u.a(eVarB);
    }
}
