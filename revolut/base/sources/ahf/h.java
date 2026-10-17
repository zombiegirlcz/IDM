package ahf;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ScheduledPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ScheduledPaymentsScreen scheduledPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = scheduledPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((SwipeToActionDelegate.SwipeAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SwipeToActionDelegate.SwipeAction action = (SwipeToActionDelegate.SwipeAction) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        Intrinsics.h(action);
        z zVar = (z) mVarE3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj3 = action.f;
        ExchangeOrder exchangeOrder = obj3 instanceof ExchangeOrder ? (ExchangeOrder) obj3 : null;
        if (exchangeOrder != null) {
            zVar.n2(new w(zVar, exchangeOrder, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
