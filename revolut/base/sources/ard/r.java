package ard;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectTransactionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SelectTransactionController selectTransactionController, Continuation continuation) {
        super(2, continuation);
        this.v = selectTransactionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(item.f58316a, "date_range_filter")) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.select.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) this.v.d();
            aVar2.H2(aVar2.f87897x, new aqb.s(26));
            aVar2.J2();
        }
        return Unit.f186387a;
    }
}
