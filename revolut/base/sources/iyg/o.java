package iyg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ WidgetisedAnalyticsDashboardScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(WidgetisedAnalyticsDashboardScreen widgetisedAnalyticsDashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.u = widgetisedAnalyticsDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) this.u.R2()).P2();
        return Unit.f186387a;
    }
}
