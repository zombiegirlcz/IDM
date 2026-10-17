package tgf;

import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tgf.g;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TransactionsFilterScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransactionsFilterScreen transactionsFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transactionsFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((l) ((j) this.u.Q.getValue())).I2(g.a.f271173a);
        return Unit.f186387a;
    }
}
