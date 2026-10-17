package lnd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmd.a f197209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qpd.s f197210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kgm.c f197211c;
    public final jnd.k d;

    public z(cmd.a groupDetailsMapper, qpd.s groupDetailsTransactionMapper, kgm.c analyticsInlineTransactionsProvider, jnd.k categoryBudgetMapper) {
        Intrinsics.checkNotNullParameter(groupDetailsMapper, "groupDetailsMapper");
        Intrinsics.checkNotNullParameter(groupDetailsTransactionMapper, "groupDetailsTransactionMapper");
        Intrinsics.checkNotNullParameter(analyticsInlineTransactionsProvider, "analyticsInlineTransactionsProvider");
        Intrinsics.checkNotNullParameter(categoryBudgetMapper, "categoryBudgetMapper");
        this.f197209a = groupDetailsMapper;
        this.f197210b = groupDetailsTransactionMapper;
        this.f197211c = analyticsInlineTransactionsProvider;
        this.d = categoryBudgetMapper;
    }

    public static List b(z zVar, he3.j selectedCategory, ind.g analyticsData, yld.c chartStyle, String str, GroupingExtraData groupingExtraData, jnd.d budgetData, lzi.j jVar) throws Throwable {
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        Intrinsics.checkNotNullParameter(analyticsData, "analyticsData");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        Intrinsics.checkNotNullParameter(groupingExtraData, "groupingExtraData");
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        RowDelegate.Model modelA = zVar.a(selectedCategory, analyticsData, chartStyle, new TextLocalisedClause(R$string.analytics_main_no_transactions, null, null, 14), null, budgetData, jVar, str, groupingExtraData);
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(modelA);
    }

    public static ind.e c(ind.e analyticsByPeriod, String str, fnd.a aVar) {
        ind.b0 zVar;
        Intrinsics.checkNotNullParameter(analyticsByPeriod, "analyticsByPeriod");
        if ((analyticsByPeriod instanceof ind.b) || (analyticsByPeriod instanceof ind.d)) {
            return analyticsByPeriod;
        }
        if (!(analyticsByPeriod instanceof ind.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (str == null) {
            return analyticsByPeriod;
        }
        ind.c cVar = (ind.c) analyticsByPeriod;
        ind.b0 b0Var = cVar.e;
        if (!(b0Var instanceof ind.a0)) {
            if (!(b0Var instanceof ind.z)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = aVar == null ? -1 : y.f197208a[aVar.ordinal()];
            if (i == -1) {
                ind.z zVar2 = (ind.z) b0Var;
                List list = zVar2.f162835a;
                ArrayList inflow = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.f(((he3.j) obj2).f151563a, str)) {
                        inflow.add(obj2);
                    }
                }
                List list2 = zVar2.f162836b;
                ArrayList outflow = new ArrayList();
                for (Object obj3 : list2) {
                    if (Intrinsics.f(((he3.j) obj3).f151563a, str)) {
                        outflow.add(obj3);
                    }
                }
                Intrinsics.checkNotNullParameter(inflow, "inflow");
                Intrinsics.checkNotNullParameter(outflow, "outflow");
                zVar = new ind.z(inflow, outflow);
            } else if (i == 1) {
                List list3 = ((ind.z) b0Var).f162835a;
                ArrayList inflow2 = new ArrayList();
                for (Object obj4 : list3) {
                    if (Intrinsics.f(((he3.j) obj4).f151563a, str)) {
                        inflow2.add(obj4);
                    }
                }
                zhm.f0 outflow2 = zhm.f0.f322471a;
                Intrinsics.checkNotNullParameter(inflow2, "inflow");
                Intrinsics.checkNotNullParameter(outflow2, "outflow");
                zVar = new ind.z(inflow2, outflow2);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zhm.f0 inflow3 = zhm.f0.f322471a;
                List list4 = ((ind.z) b0Var).f162836b;
                ArrayList outflow3 = new ArrayList();
                for (Object obj5 : list4) {
                    if (Intrinsics.f(((he3.j) obj5).f151563a, str)) {
                        outflow3.add(obj5);
                    }
                }
                Intrinsics.checkNotNullParameter(inflow3, "inflow");
                Intrinsics.checkNotNullParameter(outflow3, "outflow");
                zVar = new ind.z(inflow3, outflow3);
            }
        } else if (str.equals("excluded_transactions")) {
            zVar = ind.a0.a((ind.a0) b0Var, zhm.f0.f322471a);
        } else {
            ind.a0 a0Var = (ind.a0) b0Var;
            List list5 = a0Var.f162787a;
            ArrayList arrayList = new ArrayList();
            for (Object obj6 : list5) {
                if (Intrinsics.f(((he3.j) obj6).f151563a, str)) {
                    arrayList.add(obj6);
                }
            }
            zVar = ind.a0.a(a0Var, arrayList);
        }
        ind.b0 section = zVar;
        AnalyticsSpendingPeriod$Interval interval = cVar.f162792a;
        lzi.i type = cVar.f162793b;
        long j2 = cVar.f162794c;
        xi0.b currency = cVar.d;
        CategorisationFilter categorisationFilter = cVar.f;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = cVar.f162795g;
        List rates = cVar.f162796h;
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(rates, "rates");
        return new ind.c(interval, type, j2, currency, section, categorisationFilter, analyticsSpendingPeriod$Interval, rates);
    }

    public final RowDelegate.Model a(he3.j jVar, ind.g gVar, yld.c cVar, Clause clause, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, jnd.d dVar, lzi.j jVar2, String str, GroupingExtraData groupingExtraData) throws Throwable {
        yld.i iVarC = ((fnd.d) this.f197209a).c(jVar, gVar.e, cVar == yld.c.PIE_CHART, str, groupingExtraData);
        jnd.i iVarA = this.d.a(jVar, cVar, dVar, jVar2, analyticsSpendingPeriod$Interval);
        return new RowDelegate.Model(jVar.f151563a, new RowDelegate.Model.MainImage.Image40(iVarC.f314700c, null, iVarA != null ? iVarA.f176714b : null, false, null, false, 58), iVarC.f314699b, null, 0, iVarA != null ? iVarA.f176713a : clause, null, null, 0, new pf(new TextLocalisedClause(R.string.common_action_clear, null, null, 14), null, null, false, ind.k.f162814b, null, 478), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }
}
