package qoc;

import aw0.b6;
import aw0.c6;
import aw0.c7;
import aw0.db;
import aw0.ka;
import aw0.o1;
import aw0.o9;
import aw0.r2;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.mj;
import ip0.nj;
import ip0.oj;
import ip0.qj;
import ip0.sj;
import ip0.tj;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 {
    public n0(r0 legendsBuilder, k0 intervalDatesProvider, q0 datasetBuilder, h0 colorMapper, m0 descriptionMapper) {
        Intrinsics.checkNotNullParameter(legendsBuilder, "legendsBuilder");
        Intrinsics.checkNotNullParameter(intervalDatesProvider, "intervalDatesProvider");
        Intrinsics.checkNotNullParameter(datasetBuilder, "datasetBuilder");
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
    }

    public final List a(jlc.n input, TreeMap projections, mj mjVar, LocalDate startDate, LocalDate endDate, PortfolioGoal goal, roc.a goalStatus, jlc.q qVar, jlc.p pVar) throws Throwable {
        Integer num;
        flc.a aVar;
        LocalDate shownMonth;
        Clause clause;
        String str;
        Clause clause2;
        aw0.l0 o1Var;
        List listK;
        flc.a aVar2;
        boolean z;
        boolean z3;
        char c2;
        oj ojVar;
        HeaderDelegate.Model model;
        char c3;
        aw0.l0 l0Var;
        Clause timeClause;
        Clause timeClause2;
        Integer numValueOf;
        Clause textLocalisedClause;
        CompositeClause compositeClauseM;
        Intrinsics.checkNotNullParameter(startDate, "currentDate");
        if (endDate == null || projections == null || projections.isEmpty()) {
            return zhm.u.c(new tj("projection-chart-listId"));
        }
        Integer numValueOf2 = mjVar != null ? Integer.valueOf(mjVar.f165387a) : null;
        if (numValueOf2 == null || (aVar = (flc.a) projections.get(Integer.valueOf(numValueOf2.intValue()))) == null) {
            Iterator it8 = projections.entrySet().iterator();
            if (it8.hasNext()) {
                num = (Integer) ((Map.Entry) it8.next()).getKey();
                while (it8.hasNext()) {
                    Integer num2 = (Integer) ((Map.Entry) it8.next()).getKey();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
            } else {
                num = null;
            }
            aVar = num != null ? (flc.a) projections.get(Integer.valueOf(num.intValue())) : null;
        }
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        long jH = oc.c.h(startDate, endDate) / ((long) 5);
        IntRange intRangeO = kotlin.ranges.f.o(0, 5);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it9 = intRangeO.iterator();
        while (it9.f289625c) {
            arrayList = arrayList;
            arrayList.add(startDate.plusDays(((long) it9.nextInt()) * jH));
        }
        ArrayList xAxisDates = zhm.d0.F0(endDate, arrayList);
        if (numValueOf2 == null || (shownMonth = startDate.plusMonths(numValueOf2.intValue())) == null) {
            shownMonth = endDate;
        }
        if (input != null) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(shownMonth, "shownMonth");
            boolean z4 = goal != null;
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDateClause$DateFormat monthAndYear = z4 ? new LocalDateClause$DateFormat.MonthAndYear(ka.SHORT) : LocalDateClause$DateFormat.Year.f57813a;
            jVar.getClass();
            TimeClause timeClauseA = com.revolut.core.ui_kit.models.j.a(shownMonth, monthAndYear, null);
            if (input instanceof jlc.l) {
                textLocalisedClause = null;
            } else if (input instanceof jlc.m) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_onboarding_projections_simulated_projected_value_header, zhm.u.c(timeClauseA), null, 12);
            } else if (input instanceof jlc.g) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_onboarding_projections_projected_value_header, zhm.u.c(timeClauseA), null, 12);
            } else {
                if (!(input instanceof jlc.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                jlc.j jVar2 = ((jlc.k) input).f175689c;
                if (jVar2 instanceof jlc.h) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_projections_estimated_average_values, zhm.u.c(timeClauseA), null, 12);
                } else {
                    if (!(jVar2 instanceof jlc.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (goal == null || goalStatus == null) {
                        int i = pVar == null ? -1 : l0.f248128a[pVar.ordinal()];
                        if (i == -1) {
                            numValueOf = null;
                        } else if (i == 1) {
                            numValueOf = Integer.valueOf(R$string.wealth_robo_onboarding_projections_description);
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            numValueOf = Integer.valueOf(R$string.wealth_robo_onboarding_projections_projected_value_header);
                        }
                        textLocalisedClause = numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), zhm.u.c(timeClauseA), null, 12) : null;
                    } else {
                        Float fValueOf = Float.valueOf(16.0f);
                        Intrinsics.checkNotNullParameter(goal, "goal");
                        Intrinsics.checkNotNullParameter(goalStatus, "goalStatus");
                        int i2 = roc.d.f255969a[goalStatus.ordinal()];
                        if (i2 == 1) {
                            compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_check_circle, new ImageClauseTint.Color(R$attr.uikit_colorPerformancePositive), fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.wealth_robo_portfolio_goal_status_on_track, zhm.u.c(com.revolut.core.ui_kit.models.j.a(goal.a(), new LocalDateClause$DateFormat.MonthAndYear(0), null)), new Custom(new Custom.Color.Solid(R$attr.uikit_colorPerformancePositive), false, false, 254), 8)));
                        } else if (i2 == 2) {
                            compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_exclamation_mark, new ImageClauseTint.Color(R$attr.uikit_colorStatusWarning), fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.wealth_robo_portfolio_goal_status_off_track, zhm.u.c(com.revolut.core.ui_kit.models.j.a(goal.a(), new LocalDateClause$DateFormat.MonthAndYear(0), null)), new Custom(new Custom.Color.Solid(R$attr.uikit_colorStatusWarning), false, false, 254), 8)));
                        } else if (i2 != 3 && i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = compositeClauseM;
                    }
                }
            }
            clause = textLocalisedClause;
        } else {
            clause = null;
        }
        boolean z6 = input instanceof jlc.l;
        String str2 = z6 ? "strategies_template_overview_projection_chart" : "projection-chart-listId";
        if (z6) {
            int i3 = R$string.wealth_robo_portfolio_projection_projected_value;
            int i5 = R$attr.uikit_colorForeground;
            str = str2;
            c6 c6Var = new c6(i5, new TextLocalisedClause(i3, null, null, 14), Integer.valueOf(i5));
            int i6 = R$string.wealth_robo_portfolio_projection_your_contribution;
            int i21 = R$attr.uikit_colorGrey50;
            clause2 = clause;
            o1Var = new b6(zhm.v.k(c6Var, new c6(i21, new TextLocalisedClause(i6, null, null, 14), Integer.valueOf(i21))));
        } else {
            str = str2;
            clause2 = clause;
            if (aVar == null || (listK = zhm.v.k(r0.a(R$string.wealth_robo_portfolio_projection_projected_value, h0.a(goalStatus), aVar.f135943c), r0.a(R$string.wealth_robo_portfolio_projection_your_contribution, s0.k, aVar.f135941a))) == null) {
                listK = zhm.f0.f322471a;
            }
            o1Var = new o1(listK);
        }
        aw0.l0 l0Var2 = o1Var;
        boolean z11 = input instanceof jlc.l;
        p0 xAxisLabelType = z11 ? p0.YEAR_ENDPOINTS : goal != null ? p0.FIRST_AND_LAST : p0.YEARLY;
        Intrinsics.checkNotNullParameter(xAxisDates, "xAxisDates");
        Intrinsics.checkNotNullParameter(projections, "projections");
        Intrinsics.checkNotNullParameter(xAxisLabelType, "xAxisLabelType");
        int iBetween = xAxisLabelType == p0.YEAR_ENDPOINTS ? (int) ChronoUnit.YEARS.between((Temporal) zhm.d0.b0(xAxisDates), (Temporal) zhm.d0.m0(xAxisDates)) : 0;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(xAxisDates, 10));
        int i22 = 0;
        for (Object obj2 : xAxisDates) {
            int i32 = i22 + 1;
            if (i22 < 0) {
                zhm.v.s();
                throw null;
            }
            LocalDate localDate = (LocalDate) obj2;
            boolean z12 = i22 == 0;
            p0 p0Var = xAxisLabelType;
            boolean z29 = i22 == xAxisDates.size() + (-1);
            int i33 = o0.f248132a[p0Var.ordinal()];
            boolean z31 = z29;
            if (i33 != 1) {
                if (i33 == 2) {
                    l0Var = l0Var2;
                    if (z12) {
                        timeClause2 = new TimeClause(oc.c.N(localDate), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), null, null, 12);
                    } else {
                        timeClause = z31 ? new TimeClause(oc.c.N(localDate), new TimeClause.Format.MonthAndYear(ka.SHORT, 2), null, null, 12) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                } else {
                    if (i33 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (z12) {
                        timeClause = new TextLocalisedClause(R$string.managed_portfolios_strategy_projections_investment_year_0, null, null, 14);
                    } else if (!z31) {
                        l0Var = l0Var2;
                        timeClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else if (iBetween == 30) {
                        timeClause = new TextLocalisedClause(R$string.managed_portfolios_strategy_projections_investment_year_30, null, null, 14);
                    } else {
                        hx7.e.n(new IllegalStateException(j6.a.l(iBetween, "Unexpected strategies projection horizon: ", " years, expected 30")));
                        l0Var = l0Var2;
                        timeClause = new TextLocalisedClause(R$string.managed_portfolios_strategy_projections_investment_year, zhm.u.c(new TextClause(String.valueOf(iBetween), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                    }
                    l0Var = l0Var2;
                }
                timeClause = timeClause2;
            } else {
                l0Var = l0Var2;
                timeClause = new TimeClause(oc.c.N(localDate), new TimeClause.Format.Year(0), null, null, 12);
            }
            arrayList2.add(timeClause);
            i22 = i32;
            l0Var2 = l0Var;
            xAxisLabelType = p0Var;
        }
        aw0.l0 l0Var3 = l0Var2;
        ArrayList arrayList3 = new ArrayList(projections.size());
        for (Map.Entry entry : projections.entrySet()) {
            Integer num3 = (Integer) entry.getKey();
            flc.a aVar3 = (flc.a) entry.getValue();
            Intrinsics.h(aVar3);
            Intrinsics.h(num3);
            arrayList3.add(soc.b.a(aVar3, num3.intValue(), z11));
        }
        nj njVar = new nj(arrayList3, arrayList2);
        int i43 = z11 ? R$attr.uikit_colorGrey50 : s0.k;
        int iA = z11 ? R$attr.uikit_colorForeground : h0.a(goalStatus);
        if (z11 || goal != null) {
            aVar2 = aVar;
            z = true;
        } else {
            aVar2 = aVar;
            z = false;
        }
        sj sjVar = qVar != null ? new sj(qVar.f175695a, qVar.f175696b) : null;
        if (goal != null) {
            dj0.d dVar = goal.f95699a;
            z3 = z6;
            c2 = '\f';
            ojVar = new oj(new TextLocalisedClause(R$string.wealth_robo_onboarding_projections_goal_level_label, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), dVar);
        } else {
            z3 = z6;
            c2 = '\f';
            ojVar = null;
        }
        flc.a aVar4 = aVar2;
        qj qjVar = new qj(str, clause2, l0Var3, njVar, z11, z, mjVar, sjVar, ojVar, i43, iA, v.f248152a);
        if (!z3) {
            return zhm.u.c(qjVar);
        }
        if (aVar4 != null) {
            int iIntValue = numValueOf2 != null ? numValueOf2.intValue() / 12 : (int) ChronoUnit.YEARS.between(startDate, endDate);
            c3 = 0;
            model = new HeaderDelegate.Model("strategies_template_overview_projection_header", null, new r2(new MoneyClause(aVar4.f135943c, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, null, 12), null), null, new TextLocalisedQuantityClause(R$plurals.managed_portfolios_simulated_value_in_years, Integer.valueOf(iIntValue), zhm.u.c(Integer.valueOf(iIntValue)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, db.BODY2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), 8), null, null, HeaderDelegate.a.c.f52422a, null, null, null, 127960);
        } else {
            model = null;
            c3 = 0;
        }
        qv0.i[] elements = new qv0.i[2];
        elements[c3] = model;
        elements[1] = qjVar;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
