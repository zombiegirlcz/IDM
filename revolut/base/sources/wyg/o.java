package wyg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsPerformanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) cVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "ERROR_STATE_ID")) {
            aVar2.I2();
        } else if (Intrinsics.f(str, "complex-analytics-performance-chart")) {
            aVar2.J2();
        }
        return Unit.f186387a;
    }
}
