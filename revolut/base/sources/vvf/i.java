package vvf;

import com.revolut.feature.transport.api.navigation.TransportFlowDestination;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PurchasedTransitTicket.ToBeActivated f292536w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, PurchasedTransitTicket.ToBeActivated toBeActivated, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f292536w = toBeActivated;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f292536w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k kVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ivf.e eVar = kVar.o;
            String str = kVar.f292538p.f92517a.f92630a;
            this.u = 1;
            if (eVar.a(str, this.f292536w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return kVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new TransportFlowDestination(new TransportStartType.Hub.Ticket(com.revolut.feature.transport.api.navigation.a.TICKET_EXTENDED))))));
    }
}
