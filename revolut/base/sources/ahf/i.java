package ahf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ScheduledPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ScheduledPaymentsScreen scheduledPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = scheduledPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        String listId = model.f52373a;
        z zVar = (z) mVarE3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "NO_SUBSCRIPTIONS_ITEM_LIST_ID")) {
            zVar.n2(new r(zVar, null, 1), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
