package vgf;

import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends gim.i implements Function3 {
    public /* synthetic */ String u;
    public /* synthetic */ TransactionsListFilterType.ConfigurableFilter v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k0 k0Var = new k0(3, (Continuation) obj4);
        k0Var.u = (String) obj2;
        k0Var.v = (TransactionsListFilterType.ConfigurableFilter) obj3;
        return k0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = this.u;
        TransactionsListFilterType.ConfigurableFilter configurableFilter = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new s(str, configurableFilter);
    }
}
