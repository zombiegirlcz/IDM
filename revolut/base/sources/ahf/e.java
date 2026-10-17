package ahf;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ScheduledPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ScheduledPaymentsScreen scheduledPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = scheduledPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        String listId = model.f52708a;
        z zVar = (z) mVarE3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "BOLETO_HEADER_ID")) {
            zVar.f5105r.getClass();
            zVar.C1(new com.revolut.kompot.common.b(zVar.e1(pm1.c.f237444a), (ModalDestination.Style) null, 6));
        }
        return Unit.f186387a;
    }
}
