package fee;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InboundTransactionListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InboundTransactionListScreen inboundTransactionListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inboundTransactionListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.v.N.getValue();
        Object obj3 = model.u;
        lVar.getClass();
        if (obj3 instanceof a3) {
            lVar.C2(new f((a3) obj3));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("InboundTransactionList: Unexpected parcel in transaction row click: ", obj3 != null ? obj3.getClass().getName() : null));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
