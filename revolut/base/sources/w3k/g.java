package w3k;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o9k.b0;
import o9k.j0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s8k.c f294423w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar, s8k.c cVar2, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f294423w = cVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f294423w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objD3;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            j0 j0Var = cVar.F;
            s8k.c cVar2 = this.f294423w;
            PeerToPeerTransferData peerToPeerTransferData = cVar2.f261059a;
            hrf.f fVar = peerToPeerTransferData.f102248h;
            PeerToPeerRecipient peerToPeerRecipient = cVar2.f261060b;
            this.u = 1;
            j0Var.getClass();
            int i2 = b0.f223292a[fVar.ordinal()];
            if (i2 == 1) {
                objD3 = j0Var.d3(peerToPeerTransferData, peerToPeerRecipient, false, true, this);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                objD3 = j0Var.c3(peerToPeerTransferData, peerToPeerRecipient, this);
            }
            if (objD3 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return cVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), b3a.a.a(cVar.f102048y))));
    }
}
