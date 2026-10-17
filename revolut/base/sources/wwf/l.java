package wwf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.api.navigation.TransportFlowDestination;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.feature.transport.api.navigation.TransportTicketDetailsDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.c0;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bxf.e f300660w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, bxf.e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f300660w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f300660w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o oVar;
        Object objW;
        StackDestination byId;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            c0 c0Var = new c0(new TextLocalisedClause(R$string.transport_ticket_purchase_loading_title, null, null, 14), new TextLocalisedClause(R$string.transport_ticket_purchase_loading_description, null, null, 14), null, false, null, false, false, null, 2044);
            vkj.l lVar = new vkj.l(oVar2, 3);
            w64.d dVar = new w64.d(oVar2, this.f300660w, null, 18);
            this.u = 1;
            oVar = oVar2;
            objW = n14.k.W(oVar, c0Var, null, lVar, dVar, this, 2);
            if (objW == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            oVar = oVar2;
            objW = obj2;
        }
        nii.h hVar = (nii.h) objW;
        if (hVar instanceof nii.f) {
            byId = new TransportFlowDestination(new TransportStartType.Hub.Ticket(0));
        } else {
            if (!(hVar instanceof nii.g)) {
                throw new NoWhenBranchMatchedException();
            }
            j jVar = (j) ((nii.g) hVar).f216152a;
            if ((jVar instanceof g) || (jVar instanceof h)) {
                byId = new TransportFlowDestination(new TransportStartType.Hub.Ticket(0));
            } else {
                if (!(jVar instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                byId = new TransportTicketDetailsDestination.ById(((i) jVar).f300656a);
            }
        }
        return oVar.A2(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(byId))));
    }
}
