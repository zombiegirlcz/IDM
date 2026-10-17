package cs1;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TapiTransferBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TapiTransferBreakdownScreen tapiTransferBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tapiTransferBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.O.getValue();
        String listId = model.f51781a;
        TapiTransferBreakdownScreenContract$InputData tapiTransferBreakdownScreenContract$InputData = jVar.o;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "BREAKDOWN_PREFIX_PAYMENT_BREAKDOWN_EXCHANGE_RATE_ITEM")) {
            jVar.C2(new e(tapiTransferBreakdownScreenContract$InputData.f61552b.f213661a));
        } else if (Intrinsics.f(listId, "BREAKDOWN_PREFIX_PAYMENT_BREAKDOWN_FEES_ITEM")) {
            jVar.C2(new f(tapiTransferBreakdownScreenContract$InputData.d));
        }
        return Unit.f186387a;
    }
}
