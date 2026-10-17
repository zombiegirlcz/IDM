package gzg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsTotalValueScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WidgetisedAnalyticsTotalValueScreen widgetisedAnalyticsTotalValueScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsTotalValueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        l0 l0Var = aVar2.u;
        Intrinsics.checkNotNullParameter("CURRENT_ALLOCATION_HEADER_ID", "id");
        ListIdTarget listIdTarget = new ListIdTarget("CURRENT_ALLOCATION_HEADER_ID");
        byg.a aVar3 = aVar2.f95135t;
        cli.y yVar = aVar2.f95137x;
        l0.d(l0Var, listIdTarget, aVar3.a(((n) ((j2) yVar.f22677a).getValue()).k, ((n) ((j2) yVar.f22677a).getValue()).f148114l), null, 12);
        return Unit.f186387a;
    }
}
