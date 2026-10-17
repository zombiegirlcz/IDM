package w3k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o9k.j0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s8k.b f294422w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar, s8k.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f294422w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f294422w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            j0 j0Var = cVar.F;
            s8k.b bVar = this.f294422w;
            PeerToPeerTransferData peerToPeerTransferData = bVar.f261057a;
            PeerToPeerRecipient peerToPeerRecipient = bVar.f261058b;
            this.u = 1;
            if (j0Var.e3(peerToPeerTransferData, peerToPeerRecipient, null, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return cVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((v3a.b) cVar.f102048y).d(new ScheduledPaymentsInputData(com.revolut.feature.subscriptions.models.a.b(cVar.T2().e), new ScheduledPaymentsInputData.InitialAction.ShowSuccessShotDialog(new TextLocalisedClause(R$string.payments_bank_transfer_result_success_scheduled_toast, null, null, 14)), 2)))));
    }
}
