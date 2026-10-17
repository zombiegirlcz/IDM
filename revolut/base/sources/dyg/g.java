package dyg;

import cli.y;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsAllocationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WidgetisedAnalyticsAllocationScreen widgetisedAnalyticsAllocationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsAllocationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        l0 l0Var = aVar2.f95051s;
        Intrinsics.checkNotNullParameter("CURRENT_ALLOCATION_HEADER_ID", "id");
        ListIdTarget listIdTarget = new ListIdTarget("CURRENT_ALLOCATION_HEADER_ID");
        byg.a aVar3 = aVar2.f95050r;
        y yVar = aVar2.v;
        l0.d(l0Var, listIdTarget, aVar3.a(((h) ((j2) yVar.f22677a).getValue()).f121113h, ((h) ((j2) yVar.f22677a).getValue()).d), null, 12);
        return Unit.f186387a;
    }
}
