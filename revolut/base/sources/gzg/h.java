package gzg;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsTotalValueScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WidgetisedAnalyticsTotalValueScreen widgetisedAnalyticsTotalValueScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsTotalValueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g6 g6Var = (g6) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a) this.v.d()).K2(g6Var.f54200b.f52342a, g6Var.f54199a);
        return Unit.f186387a;
    }
}
