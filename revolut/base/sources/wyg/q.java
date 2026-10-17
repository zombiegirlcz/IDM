package wyg;

import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsPerformanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ai aiVar = (ai) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) this.v.d()).K2(aiVar.f53688b.f53517a, aiVar.f53687a);
        return Unit.f186387a;
    }
}
