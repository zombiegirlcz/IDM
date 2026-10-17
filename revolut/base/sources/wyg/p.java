package wyg;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsPerformanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g6 g6Var = (g6) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) this.v.d()).K2(g6Var.f54200b.f52342a, g6Var.f54199a);
        return Unit.f186387a;
    }
}
