package q42;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.transactions_list.mapped.ApmTransactionOnlyListScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ofm.q;
import tof.a3;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmTransactionOnlyListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ApmTransactionOnlyListScreen apmTransactionOnlyListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = apmTransactionOnlyListScreen;
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

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.U.getValue();
        Object obj3 = model.u;
        j jVar = (j) hVar;
        jVar.getClass();
        if (obj3 instanceof a3) {
            jVar.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P((a3) obj3), null, null, null, 126))));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj3, "ApmTransactionList: parcel not supported: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
