package dee;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InboundSwiftTransferStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InboundSwiftTransferStatusScreen inboundSwiftTransferStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inboundSwiftTransferStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.R2();
        Object obj3 = model.u;
        z zVar = (z) qVarE3;
        zVar.getClass();
        if (obj3 instanceof a3) {
            zVar.C2(new p((a3) obj3));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("InboundSwiftTransferStatus: Unexpected parcel in transaction row click: ", obj3 != null ? obj3.getClass().getName() : null));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
