package fhf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import tof.a3;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SimpleTransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SimpleTransactionsScreen simpleTransactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = simpleTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        a3 transaction = obj3 instanceof a3 ? (a3) obj3 : null;
        if (transaction != null) {
            j jVar = (j) ((f) this.v.P.getValue());
            jVar.getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            jVar.C1(u0.c(new TransactionsFeatureConfig.Details(q.P(transaction), null, null, null, 126)));
        }
        return Unit.f186387a;
    }
}
