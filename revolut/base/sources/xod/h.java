package xod;

import aw0.i4;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileWithHalfPieWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lnd.h0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zod.d0;
import zod.e0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f307805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f307806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f307807c;
    public final gte.a d;

    public h(h0 pieChartMapper, s detailsMapper, n commonMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(pieChartMapper, "pieChartMapper");
        Intrinsics.checkNotNullParameter(detailsMapper, "detailsMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f307805a = pieChartMapper;
        this.f307806b = detailsMapper;
        this.f307807c = commonMapper;
        this.d = featureToggleInteractor;
    }

    public final BaseDraggableWidgetDelegate.Model a(String str, zod.a type, dj0.d spent, Object obj2, zod.r chartData, AnalyticsAccountsSelection accountsSelection, op0.q widgetSize) throws Throwable {
        List list;
        long j2;
        List listL;
        List listA;
        i0 i0VarB;
        i0 i0Var;
        Color.Solid solid;
        String id10 = str;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(spent, "currentValue");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        int i = g.f307804a[widgetSize.ordinal()];
        h0 h0Var = this.f307805a;
        if (i == 1) {
            if (!((jte.d) this.d).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c)) {
                throw new IllegalStateException("Pie chart not supported in small size");
            }
            e0 e0Var = chartData.f324028b;
            d0 d0Var = e0Var instanceof d0 ? (d0) e0Var : null;
            Iterable iterableA = d0Var != null ? h0Var.a(d0Var) : null;
            if (iterableA == null) {
                iterableA = f0.f322471a;
            }
            List listV0 = zhm.d0.V0(iterableA, 3);
            List list2 = listV0;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                list = null;
            } else {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (((i4) it8.next()).f10355c > 0) {
                        list = listV0;
                        break;
                    }
                }
                list = null;
            }
            if (list == null) {
                list = f0.f322471a;
            }
            return new TileWithHalfPieWidgetDelegate.Model(str, n.f(type), n.e(type, spent), list, obj2);
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                throw new UnsupportedOperationException("only small and medium sizes are supported for pie chart");
            }
            throw new NoWhenBranchMatchedException();
        }
        e0 details = chartData.f324028b;
        boolean z = details instanceof d0;
        if (z) {
            listA = h0Var.a((d0) details);
            j2 = 0;
        } else {
            if (!(details instanceof zod.z)) {
                throw new NoWhenBranchMatchedException();
            }
            zod.z details2 = (zod.z) details;
            Intrinsics.checkNotNullParameter(spent, "spent");
            Intrinsics.checkNotNullParameter(details2, "details");
            if (details2.f324042b == zod.y.OVERSPENT) {
                listL = f0.f322471a;
                j2 = 0;
            } else {
                j2 = 0;
                long j3 = details2.f324041a.f115082a;
                Color.Solid solid2 = new Color.Solid(R$attr.uikit_colorPerformancePositive);
                f0 f0Var = f0.f322471a;
                i4 i4Var = new i4("BUDGET_LEFT_TO_SPEND_SEGMENT_ID", null, j3, solid2, f0Var);
                long j5 = spent.a().f115082a;
                i4[] elements = {i4Var, j5 > 0 ? new i4("BUDGET_SPENT_SEGMENT_ID", null, j5, new Color.Solid(R$attr.uikit_colorGreyTone8), f0Var) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL = kotlin.collections.d.L(elements);
            }
            listA = listL;
        }
        List list3 = listA;
        boolean z3 = list3 instanceof Collection;
        s sVar = this.f307806b;
        if (!z3 || !list3.isEmpty()) {
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                if (((i4) it9.next()).f10355c > j2) {
                    TextLocalisedClause textLocalisedClauseF = n.f(type);
                    MoneyClause moneyClauseE = n.e(type, spent);
                    Intrinsics.checkNotNullParameter(details, "details");
                    if (z) {
                        r rVar = sVar.f307824a;
                        d0 details3 = (d0) details;
                        List list4 = details3.f323981a;
                        Intrinsics.checkNotNullParameter(details3, "details");
                        if (list4.isEmpty()) {
                            i0Var = null;
                            return new ChartWithDetailsWidgetDelegate.Model(id10, textLocalisedClauseF, moneyClauseE, null, i0Var, new com.revolut.core.ui_kit.delegates.widgets.z(listA), null, obj2, 320);
                        }
                        List<zod.c0> list5 = list4;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list5, 10));
                        for (zod.c0 c0Var : list5) {
                            lnd.o oVar = rVar.f307823b;
                            q qVarA = rVar.a(c0Var);
                            Clause clause = qVarA.f307820a;
                            MoneyClause moneyClause = qVarA.f307821b;
                            if (c0Var instanceof zod.a0) {
                                zod.a0 a0Var = (zod.a0) c0Var;
                                solid = oVar.a(a0Var.f323974a, zhm.v.l(a0Var.f323975b));
                            } else {
                                if (!(c0Var instanceof zod.b0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                solid = new Color.Solid(R$attr.uikit_colorGreyTone50);
                            }
                            arrayList.add(new com.revolut.core.ui_kit.delegates.widgets.e0(clause, moneyClause, solid));
                        }
                        i0VarB = new com.revolut.core.ui_kit.delegates.widgets.f0((com.revolut.core.ui_kit.delegates.widgets.e0) zhm.d0.b0(arrayList), (com.revolut.core.ui_kit.delegates.widgets.e0) zhm.d0.e0(1, arrayList), (com.revolut.core.ui_kit.delegates.widgets.e0) zhm.d0.e0(2, arrayList));
                    } else {
                        if (!(details instanceof zod.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i0VarB = s.b((zod.z) details);
                    }
                    i0Var = i0VarB;
                    return new ChartWithDetailsWidgetDelegate.Model(id10, textLocalisedClauseF, moneyClauseE, null, i0Var, new com.revolut.core.ui_kit.delegates.widgets.z(listA), null, obj2, 320);
                }
                id10 = str;
            }
        }
        TextLocalisedClause textLocalisedClauseF2 = n.f(type);
        MoneyClause moneyClauseE2 = n.e(type, spent);
        i0 i0VarA = sVar.a(details);
        if (i0VarA == null) {
            TextLocalisedClause textLocalisedClauseC = this.f307807c.c(type, chartData.f324027a, chartData.f324029c, accountsSelection);
            if (textLocalisedClauseC != null) {
                Intrinsics.checkNotNullParameter(textLocalisedClauseC, "<this>");
                i0VarA = new com.revolut.core.ui_kit.delegates.widgets.b0(textLocalisedClauseC);
            } else {
                i0VarA = null;
            }
        }
        return new ChartWithDetailsWidgetDelegate.Model(str, textLocalisedClauseF2, moneyClauseE2, null, i0VarA, new com.revolut.core.ui_kit.delegates.widgets.z(f0.f322471a), null, obj2, 320);
    }
}
