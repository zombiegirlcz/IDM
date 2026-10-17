package xod;

import aw0.e2;
import aw0.l2;
import aw0.n2;
import aw0.y1;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.j0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.List;
import knd.o0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lnd.d0;
import lnd.f0;
import lnd.p0;
import op0.y0;
import op0.z0;
import zod.e0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f307801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f307802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f307803c;
    public final n d;
    public final gte.a e;

    public e(f0 lineChartMapper, p0 categoryGroupMapper, o0 screenTypeInfoProvider, s detailsMapper, n commonMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(lineChartMapper, "lineChartMapper");
        Intrinsics.checkNotNullParameter(categoryGroupMapper, "categoryGroupMapper");
        Intrinsics.checkNotNullParameter(screenTypeInfoProvider, "screenTypeInfoProvider");
        Intrinsics.checkNotNullParameter(detailsMapper, "detailsMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f307801a = lineChartMapper;
        this.f307802b = categoryGroupMapper;
        this.f307803c = detailsMapper;
        this.d = commonMapper;
        this.e = featureToggleInteractor;
    }

    public static boolean a(ind.b0 b0Var) {
        if (b0Var instanceof ind.a0) {
            return !((ind.a0) b0Var).f162787a.isEmpty();
        }
        if (b0Var instanceof ind.z) {
            ind.z zVar = (ind.z) b0Var;
            return (zVar.f162835a.isEmpty() && zVar.f162836b.isEmpty()) ? false : true;
        }
        if (b0Var == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.revolut.core.ui_kit.models.MoneyClause] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.revolut.core.ui_kit.delegates.widgets.i0] */
    public final BaseDraggableWidgetDelegate.Model b(String listId, zod.a type, dj0.d currentValue, dj0.d dVar, Object obj2, zod.q chartData, op0.q widgetSize, AnalyticsAccountsSelection accountsSelection, jnd.d budget) throws Throwable {
        Clause clauseB;
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        Intrinsics.checkNotNullParameter(budget, "budget");
        yld.d dVarI = hx7.a.I(type);
        long j2 = chartData.f324022b;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = chartData.f324023c;
        ind.a0 a0Var = chartData.f;
        e0 e0Var = chartData.i;
        lzi.i iVar = chartData.f324021a;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval2 = chartData.d;
        ind.a0 a0Var2 = chartData.e;
        List list = a0Var2 != null ? a0Var2.f162787a : null;
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        p0 p0Var = this.f307802b;
        he3.j jVarB = p0.b(p0Var, list);
        List list2 = a0Var != null ? a0Var.f162787a : null;
        if (list2 == null) {
            list2 = zhm.f0.f322471a;
        }
        he3.j jVarB2 = p0.b(p0Var, list2);
        boolean z = (e0Var == null && o0.b(dVarI)) ? false : true;
        op0.q qVar = op0.q.MEDIUM;
        d0 d0VarD = f0.d(this.f307801a, dVarI, iVar, j2, analyticsSpendingPeriod$Interval, analyticsSpendingPeriod$Interval2, jVarB, jVarB2, widgetSize == qVar, z, null, chartData.f324024g, chartData.f324025h, (widgetSize != qVar || e0Var == null) ? true : a(a0Var), budget, null, false, 33280);
        y1 lineChartData = d0VarD.f197167a;
        n2 n2Var = d0VarD.f197168b;
        boolean z3 = d0VarD.d;
        s sVar = this.f307803c;
        n nVar = this.d;
        if (z3 && widgetSize == qVar && e0Var != null) {
            TextLocalisedClause textLocalisedClauseF = n.f(type);
            MoneyClause moneyClauseE = n.e(type, currentValue);
            j0 j0VarA = nVar.a(e0Var, dVar, o0.a(hx7.a.I(type)));
            Object objA = sVar.a(e0Var);
            if (objA == null) {
                TextLocalisedClause textLocalisedClauseC = nVar.c(type, analyticsSpendingPeriod$Interval, chartData.d, accountsSelection);
                if (textLocalisedClauseC != null) {
                    Intrinsics.checkNotNullParameter(textLocalisedClauseC, "<this>");
                    objE = new com.revolut.core.ui_kit.delegates.widgets.b0(textLocalisedClauseC);
                }
                objA = objE;
            }
            return new ChartWithDetailsWidgetDelegate.Model(listId, textLocalisedClauseF, moneyClauseE, j0VarA, objA, a(a0Var) ? new com.revolut.core.ui_kit.delegates.widgets.x(lineChartData, n2Var.d(), n2Var.a()) : com.revolut.core.ui_kit.delegates.widgets.y.f55555a, widgetSize, obj2, 256);
        }
        gte.a aVar = this.e;
        if (!z3) {
            if (e0Var != null) {
                return new ChartWithDetailsWidgetDelegate.Model(listId, n.f(type), n.e(type, currentValue), nVar.a(e0Var, dVar, o0.a(hx7.a.I(type))), sVar.a(e0Var), new com.revolut.core.ui_kit.delegates.widgets.x(lineChartData, n2Var.d(), n2Var.a()), widgetSize, obj2, 256);
            }
            return new ComparisonLineChartWidgetDelegate.Model(listId, new z0(n.f(type), y0.SINGLE_LINE), n.e(type, currentValue), n.d(type, dVar), lineChartData, n2Var.d(), n2Var.a(), ((jte.d) aVar).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c) ? e2.MONOCHROMATIC : e2.PERFORMANCE, widgetSize, obj2, n.g(type));
        }
        ComparisonLineChartWidgetDelegate.Model.Companion companion = ComparisonLineChartWidgetDelegate.Model.INSTANCE;
        z0 topLabel = new z0(n.f(type), y0.SINGLE_LINE);
        objE = widgetSize == op0.q.SMALL ? n.e(type, currentValue) : null;
        int i = d.f307800a[widgetSize.ordinal()];
        if (i == 1) {
            clauseB = nVar.b(type, analyticsSpendingPeriod$Interval, accountsSelection);
        } else {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    throw new UnsupportedOperationException("only small and medium sizes are supported for comparison line chart");
                }
                throw new NoWhenBranchMatchedException();
            }
            clauseB = n.d(type, dVar);
        }
        Clause clause = clauseB;
        l2 performanceStyle = n2Var.d();
        e2 colorMode = ((jte.d) aVar).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c) ? e2.MONOCHROMATIC : e2.PERFORMANCE;
        TrackableAction.Custom trackableAction = n.g(type);
        companion.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(topLabel, "topLabel");
        Intrinsics.checkNotNullParameter(performanceStyle, "performanceStyle");
        Intrinsics.checkNotNullParameter(lineChartData, "lineChartData");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        Intrinsics.checkNotNullParameter(colorMode, "colorMode");
        Intrinsics.checkNotNullParameter(trackableAction, "trackableAction");
        return new ComparisonLineChartWidgetDelegate.Model(listId, topLabel, objE, clause, lineChartData, performanceStyle, null, colorMode, null, widgetSize, trackableAction, obj2, 8382528);
    }
}
