package vgf;

import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a f289092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f289092w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.f289092w, continuation);
        f0Var.v = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        s sVar = (s) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = this.f289092w;
        mjf.f fVar = aVar2.F;
        TransactionsListFilterType.ConfigurableFilter configurableFilter = sVar.f289131b;
        TransactionsListFilterType transactionsListFilterType = aVar2.B.f91925a;
        this.v = null;
        this.u = 1;
        Boolean boolValueOf = Boolean.valueOf(fVar.d(configurableFilter, transactionsListFilterType));
        return boolValueOf == aVar ? aVar : boolValueOf;
    }
}
