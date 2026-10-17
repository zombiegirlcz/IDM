package fmf;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, Continuation continuation) {
        super(2, continuation);
        this.v = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l0 l0Var = new l0(this.v, continuation);
        l0Var.u = obj2;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n0 n0Var = this.v;
        n0Var.H2(n0Var.u, new do2.o(list, 27));
        return Unit.f186387a;
    }
}
