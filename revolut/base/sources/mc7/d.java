package mc7;

import ahe.y0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.feature.spending_analytics.api.widget.SpendingWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.AnalyticsAccount;
import dsh.j;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m9d.j1;
import ma1.v;
import ma2.s;
import om4.x2;
import pig.y;
import pkf.x;
import prl.k;
import vkm.q;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xld.e f204296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pzi.a f204297c;
    public final dmd.b d;
    public final wif.a e;
    public final xld.a f;

    public d(xld.e spendingAnalyticsTilesInteractor, pzi.a budgetOverviewInteractor, dmd.b analyticsWidgetMapper, wif.a userFeaturesChecker, xld.a analyticsWidgetsInteractor) {
        Intrinsics.checkNotNullParameter(spendingAnalyticsTilesInteractor, "spendingAnalyticsTilesInteractor");
        Intrinsics.checkNotNullParameter(budgetOverviewInteractor, "budgetOverviewInteractor");
        Intrinsics.checkNotNullParameter(analyticsWidgetMapper, "analyticsWidgetMapper");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(analyticsWidgetsInteractor, "analyticsWidgetsInteractor");
        this.f204296b = spendingAnalyticsTilesInteractor;
        this.f204297c = budgetOverviewInteractor;
        this.d = analyticsWidgetMapper;
        this.e = userFeaturesChecker;
        this.f = analyticsWidgetsInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(rd0.e.b(this.e.d(wog.a.ANALYTICS)), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "AnalyticsSmall")) {
            return LineChartLoadingTileWidgetDelegate.Model.Companion.b(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, id10);
        }
        if (Intrinsics.f(widgetType, "AnalyticsMedium")) {
            return LineChartLoadingTileWidgetDelegate.Model.Companion.a(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, id10);
        }
        throw new IllegalArgumentException(j6.a.q("Unknown analytics widget type ", widgetType));
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        SpendingWidgetContext spendingWidgetContext = (SpendingWidgetContext) widgetContext;
        if (Intrinsics.f(str2, "AnalyticsSmall")) {
            return q.x(new b(rd0.e.b(i(str2, spendingWidgetContext)), str, 1), fVar);
        }
        if (Intrinsics.f(str2, "AnalyticsMedium")) {
            return q.x(new b(rd0.e.b(i(str2, spendingWidgetContext)), str, 0), fVar);
        }
        throw new IllegalArgumentException(j6.a.q("Unknown analytics widget type ", str2));
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        SpendingWidgetContext widgetContext2 = (SpendingWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return q.Q(rd0.e.b(this.e.d(wog.a.ANALYTICS)), new y0(15, this, id10, widgetType, widgetContext2, (Continuation) null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((SpendingWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final r i(String str, SpendingWidgetContext widgetContext) {
        Flow flowV;
        ptd.b bVar = (ptd.b) this.f;
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        SpendingWidgetContext.AccountType accountType = widgetContext.getAccountType();
        if (Intrinsics.f(accountType, SpendingWidgetContext.AccountType.Personal.f87500a)) {
            flowV = zi0.c.i(AnalyticsAccount.Personal.All.f99192a);
        } else if (Intrinsics.f(accountType, SpendingWidgetContext.AccountType.Pro.f87501a)) {
            flowV = zi0.c.i(AnalyticsAccount.Pro.All.f99196a);
        } else if (Intrinsics.f(accountType, SpendingWidgetContext.AccountType.Joint.f87496a)) {
            flowV = q.Q(new v1(new k(bVar, null, 3)), new x(null, bVar, 12));
        } else if (accountType instanceof SpendingWidgetContext.AccountType.Linked) {
            flowV = nim.a.v(rd0.e.b(bVar.f239655b.V()), new y(((SpendingWidgetContext.AccountType.Linked) accountType).f87498a, 10));
        } else {
            boolean z = accountType instanceof SpendingWidgetContext.AccountType.Junior;
            w4l.h hVar = w4l.h.f294642c;
            if (z) {
                String str2 = ((SpendingWidgetContext.AccountType.Junior) accountType).f87497a;
                flowV = nim.a.v(hj8.a.a(bVar.f239656c, str2, hVar), new y(str2, 11));
            } else {
                if (!(accountType instanceof SpendingWidgetContext.AccountType.CreditCard)) {
                    throw new NoWhenBranchMatchedException();
                }
                flowV = nim.a.v(((x2) bVar.d).h(((SpendingWidgetContext.AccountType.CreditCard) accountType).f87495a, hVar), new psl.e(16));
            }
        }
        r rVarSwitchMap = m70.a.g(rd0.e.c(flowV, kotlin.coroutines.g.f186406a), null, new j1(12), 1).switchMap(new v(14, new s(this, str, 5)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
