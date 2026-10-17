package vgf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f289135w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f289135w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t0(this.v, this.f289135w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
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
        Object obj3 = this.f289135w;
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = this.v;
        s0 s0Var = new s0(aVar2, obj3, null);
        this.u = 1;
        Object objP2 = aVar2.p2(this, s0Var);
        return objP2 == aVar ? aVar : objP2;
    }
}
