package gzg;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsTotalValueScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(WidgetisedAnalyticsTotalValueScreen widgetisedAnalyticsTotalValueScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsTotalValueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53304a, "TOTAL_VALUE_SHOW_CONTRIBUTIONS_LIST_ID")) {
            aVar2.H2(aVar2.f95137x, new gvi.p(28));
        }
        return Unit.f186387a;
    }
}
