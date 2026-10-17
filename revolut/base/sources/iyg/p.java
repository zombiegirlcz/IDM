package iyg;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.models.PnLValues;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsDashboardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(WidgetisedAnalyticsDashboardScreen widgetisedAnalyticsDashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((BaseDraggableWidgetDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BaseDraggableWidgetDelegate.a widgetEvent = (BaseDraggableWidgetDelegate.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarR2 = this.v.R2();
        Intrinsics.h(widgetEvent);
        com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) iVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(widgetEvent, "widgetEvent");
        cli.y yVar = aVar2.P;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        WidgetisedAnalyticsType widgetisedAnalyticsType = ((a) j2Var.getValue()).f169704b;
        if (widgetisedAnalyticsType != null) {
            if (Intrinsics.f(widgetEvent.a(), "PNL_WIDGET_ID") && (widgetEvent instanceof com.revolut.core.ui_kit.delegates.widgets.i)) {
                aVar2.R2(new d(widgetisedAnalyticsType, (PnLValues) ((a) j2Var2.getValue()).i.getContent(), ((a) j2Var2.getValue()).f169705c, ((a) j2Var2.getValue()).f, ((a) j2Var2.getValue()).f169711n));
            } else if (Intrinsics.f(widgetEvent.a(), "TOTAL_VALUE_ID") && (widgetEvent instanceof com.revolut.core.ui_kit.delegates.widgets.i)) {
                vyg.c cVar = ((a) j2Var2.getValue()).f169705c;
                aVar2.R2(new g(widgetisedAnalyticsType, ((a) j2Var2.getValue()).f169711n, ((a) j2Var2.getValue()).f, cVar));
            } else if (Intrinsics.f(widgetEvent.a(), "PERFORMANCE_WIDGET_LIST_ID") && (widgetEvent instanceof com.revolut.core.ui_kit.delegates.widgets.i)) {
                vyg.c cVar2 = ((a) j2Var2.getValue()).f169705c;
                aVar2.R2(new c(widgetisedAnalyticsType, ((a) j2Var2.getValue()).f169711n, ((a) j2Var2.getValue()).f, cVar2));
            } else if (Intrinsics.f(widgetEvent.a(), "ALLOCATIONS_WIDGET_LIST_ID") && (widgetEvent instanceof com.revolut.core.ui_kit.delegates.widgets.i)) {
                aVar2.R2(new b(widgetisedAnalyticsType, ((a) j2Var2.getValue()).f, ((a) j2Var2.getValue()).f169711n));
            } else if (Intrinsics.f(widgetEvent.a(), "ALLOCATIONS_WIDGET_LIST_ID") && (widgetEvent instanceof q0)) {
                aVar2.K2();
            } else if (Intrinsics.f(widgetEvent.a(), "PERFORMANCE_WIDGET_LIST_ID") && (widgetEvent instanceof q0)) {
                aVar2.L2();
            } else if (Intrinsics.f(widgetEvent.a(), "TOTAL_VALUE_ID") && (widgetEvent instanceof q0)) {
                aVar2.O2(((a) j2Var2.getValue()).f169704b, ((a) j2Var2.getValue()).f169705c);
            } else if (Intrinsics.f(widgetEvent.a(), "PNL_WIDGET_ID") && (widgetEvent instanceof q0)) {
                aVar2.N2();
                aVar2.M2();
            } else if (Intrinsics.f(widgetEvent.a(), "PORTFOLIO_INSIGHTS_WIDGET_ERROR_LIST_ID") && (widgetEvent instanceof q0)) {
                aVar2.H.a();
            }
        }
        return Unit.f186387a;
    }
}
