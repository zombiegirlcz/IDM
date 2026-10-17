package j3i;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChartLimitPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ChartLimitPickerController chartLimitPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = chartLimitPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) iVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        bVar.H2(bVar.v, new ik3.a(listId, 20));
        return Unit.f186387a;
    }
}
