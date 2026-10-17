package dee;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreenContract$InputData;
import d7j.o0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, Continuation continuation) {
        super(1, continuation);
        this.v = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objX;
        z zVar = this.v;
        InboundSwiftTransferStatusScreenContract$InputData inboundSwiftTransferStatusScreenContract$InputData = zVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Object obj3 = null;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(zVar.f113430q.e(w4l.h.f294642c), null, new o0(29), 1);
            this.u = 1;
            objX = vkm.q.x(bVarG, this);
            if (objX == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objX = obj2;
        }
        Iterator it8 = ((List) ((Pair) objX).f186386b).iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            io3.d dVar = (io3.d) next;
            if (Intrinsics.f(dVar.f163147c, inboundSwiftTransferStatusScreenContract$InputData.f89407b.f89381a.f115083b.f306286a) && dVar.e == io3.l.CURRENT && dVar.f163149h == io3.i.INTERNAL) {
                obj3 = next;
                break;
            }
        }
        if (obj3 != null) {
            return zVar.C1(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData((io3.d) obj3, (AccountId) AccountId.Personal.f51414a, true, false, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4080)));
        }
        throw new IllegalStateException(j6.a.q("Pocket not found for currency: ", inboundSwiftTransferStatusScreenContract$InputData.f89407b.f89381a.f115083b.f306286a).toString());
    }
}
