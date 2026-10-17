package rvf;

import com.revolut.feature.transport.impl.ui.activation.flow.TransitTicketActivationFlow;
import com.revolut.feature.transport.impl.ui.activation.flow.TransitTicketActivationFlowContract$InputData;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.transport.models.transit.TransitTicketActivationConfig;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PurchasedTransitTicket.ToBeActivated f257775w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, PurchasedTransitTicket.ToBeActivated toBeActivated, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f257775w = toBeActivated;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f257775w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        PurchasedTransitTicket.ToBeActivated toBeActivated = this.f257775w;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            tji.f fVarQ2 = iVar.q2();
            g gVar = new g(iVar, toBeActivated, null);
            this.u = 1;
            obj2 = u0.b0(fVarQ2, "DIALOG_BUTTON_TAG", gVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        j60.a.v(iVar.o, false, null, 3);
        iVar.A2(new com.revolut.kompot.common.b(new TransitTicketActivationFlow(new TransitTicketActivationFlowContract$InputData(toBeActivated, (TransitTicketActivationConfig) obj2)), (ModalDestination.Style) null, 6));
        return Unit.f186387a;
    }
}
