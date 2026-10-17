package t42;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(TransferAmountScreen transferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.v, continuation, 0);
            default:
                return new o(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferAmountScreen transferAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                transferAmountScreen.F2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) transferAmountScreen.R2();
                ApmTransferRecipient apmTransferRecipientT0 = ((b) ((j2) cVar.G.f22677a).getValue()).f267837a.t0();
                if (apmTransferRecipientT0 instanceof ApmTransferRecipient.Contact) {
                    yji.l.j2(cVar, cVar.e1(new c12.w(((ApmTransferRecipient.Contact) apmTransferRecipientT0).f62299a)), null, null, 3);
                } else if (!(apmTransferRecipientT0 instanceof ApmTransferRecipient.OpenRequest)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
