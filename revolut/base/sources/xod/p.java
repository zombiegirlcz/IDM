package xod;

import aw0.k7;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonBarsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalBarsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g2;
import com.revolut.core.ui_kit.delegates.widgets.h2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements wod.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f307817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f307818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f307819c;
    public final h d;
    public final c e;

    public p(b barChartWidgetMapper, e comparisonLineChartWidgetMapper, i segmentedLineChartWidgetMapper, h pieChartWidgetMapper, c cashflowChartWidgetMapper) {
        Intrinsics.checkNotNullParameter(barChartWidgetMapper, "barChartWidgetMapper");
        Intrinsics.checkNotNullParameter(comparisonLineChartWidgetMapper, "comparisonLineChartWidgetMapper");
        Intrinsics.checkNotNullParameter(segmentedLineChartWidgetMapper, "segmentedLineChartWidgetMapper");
        Intrinsics.checkNotNullParameter(pieChartWidgetMapper, "pieChartWidgetMapper");
        Intrinsics.checkNotNullParameter(cashflowChartWidgetMapper, "cashflowChartWidgetMapper");
        this.f307817a = barChartWidgetMapper;
        this.f307818b = comparisonLineChartWidgetMapper;
        this.f307819c = segmentedLineChartWidgetMapper;
        this.d = pieChartWidgetMapper;
        this.e = cashflowChartWidgetMapper;
    }

    @Override // wod.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final BaseDraggableWidgetDelegate.Model a(String id10, zod.v widgetData, AnalyticsAccountsSelection accountsSelection) {
        Clause compositeClause;
        char c2;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetData, "widgetData");
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        zod.a type = widgetData.f324035a;
        zod.u uVar = widgetData.d;
        int i = o.f307816a[type.ordinal()];
        h hVar = this.d;
        b bVar = this.f307817a;
        e eVar = this.f307818b;
        i iVar = this.f307819c;
        switch (i) {
            case 1:
            case 2:
            case 3:
                if (uVar instanceof zod.q) {
                    return eVar.b(id10, widgetData.f324035a, widgetData.f324036b, widgetData.f324037c, widgetData.f, (zod.q) uVar, op0.q.MEDIUM, accountsSelection, widgetData.e);
                }
                if (uVar instanceof zod.t) {
                    return iVar.a(id10, widgetData.f324035a, widgetData.f324036b, widgetData.f, (zod.t) uVar, false, accountsSelection);
                }
                if (uVar instanceof zod.p) {
                    throw new IllegalStateException("Cashflow not supported in medium size");
                }
                if (uVar instanceof zod.o) {
                    return bVar.a(id10, widgetData.f324035a, widgetData.f324036b, widgetData.f324037c, widgetData.f, (zod.o) uVar, op0.q.MEDIUM, accountsSelection);
                }
                if (uVar instanceof zod.r) {
                    return hVar.a(id10, widgetData.f324035a, widgetData.f324036b, widgetData.f, (zod.r) uVar, accountsSelection, op0.q.MEDIUM);
                }
                throw new NoWhenBranchMatchedException();
            case 4:
            case 5:
            case 6:
                if (uVar instanceof zod.t) {
                    return iVar.a(id10, widgetData.f324035a, widgetData.f324036b, widgetData.f, (zod.t) uVar, true, accountsSelection);
                }
                if (uVar instanceof zod.q) {
                    return eVar.b(id10, widgetData.f324035a, widgetData.f324036b, widgetData.f324037c, widgetData.f, (zod.q) uVar, op0.q.SMALL, accountsSelection, widgetData.e);
                }
                if (!(uVar instanceof zod.p)) {
                    if (uVar instanceof zod.o) {
                        return bVar.a(id10, widgetData.f324035a, widgetData.f324036b, widgetData.f324037c, widgetData.f, (zod.o) uVar, op0.q.SMALL, accountsSelection);
                    }
                    if (uVar instanceof zod.r) {
                        return hVar.a(id10, widgetData.f324035a, widgetData.f324036b, widgetData.f, (zod.r) uVar, accountsSelection, op0.q.SMALL);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                dj0.d currentValue = widgetData.f324036b;
                dj0.d dVar = widgetData.f324037c;
                zod.p chartData = (zod.p) uVar;
                dj0.d dVar2 = chartData.f324019b;
                long j2 = dVar2.f115082a;
                dj0.d dVar3 = chartData.f324018a;
                long j3 = dVar3.f115082a;
                Object obj2 = widgetData.f;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(currentValue, "currentValue");
                Intrinsics.checkNotNullParameter(chartData, "chartData");
                if (!((jte.d) this.e.f307798a).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c)) {
                    return new HorizontalBarsTileWidgetDelegate.Model(id10, n.e(type, currentValue), n.f(type), n.d(type, dVar), zhm.v.k(new h2(Math.abs(j3), g2.PERFORMANCE_POSITIVE), new h2(Math.abs(j2), g2.PERFORMANCE_NEGATIVE)), Math.max(Math.abs(j3), Math.abs(j2)), n.g(type), obj2);
                }
                TextLocalisedClause textLocalisedClauseF = n.f(type);
                dj0.d dVarA = otd.f.a(currentValue);
                MoneyClause moneyClause = new MoneyClause(dVarA.a(), new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12);
                long j5 = dVarA.f115082a;
                if (j5 > 0) {
                    c2 = '+';
                } else {
                    if (j5 >= 0) {
                        compositeClause = moneyClause;
                        return new ComparisonBarsTileWidgetDelegate.Model(id10, textLocalisedClauseF, compositeClause, otd.f.a(dVar3), otd.f.a(dVar2), obj2);
                    }
                    c2 = CoreConstants.DASH_CHAR;
                }
                compositeClause = new CompositeClause(zhm.v.k(new TextClause(String.valueOf(c2), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), moneyClause), null, null, new MoneyClause(dVarA, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), 6);
                return new ComparisonBarsTileWidgetDelegate.Model(id10, textLocalisedClauseF, compositeClause, otd.f.a(dVar3), otd.f.a(dVar2), obj2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
