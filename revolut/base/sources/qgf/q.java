package qgf;

import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar = this.v;
        cli.y yVar = aVar.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            mjf.f fVar = aVar.f91915p;
            TransactionsListFilterType.ConfigurableFilter configurableFilter = ((h) ((j2) yVar.f22677a).getValue()).d;
            TransactionsListFilterType transactionsListFilterType = aVar.o.e;
            this.u = 1;
            obj2 = Boolean.valueOf(fVar.d(configurableFilter, transactionsListFilterType));
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar.H2(yVar, new p(aVar, ((Boolean) obj2).booleanValue(), 0));
        return Unit.f186387a;
    }
}
