package gzg;

import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsTotalValueScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WidgetisedAnalyticsTotalValueScreen widgetisedAnalyticsTotalValueScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsTotalValueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ai aiVar = (ai) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a) this.v.d()).K2(aiVar.f53688b.f53517a, aiVar.f53687a);
        return Unit.f186387a;
    }
}
