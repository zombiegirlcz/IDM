package kye;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ k3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.v = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l1 l1Var = new l1(this.v, continuation);
        l1Var.u = obj2;
        return l1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l1) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k3 k3Var = this.v;
        k3Var.H2(k3Var.f190763d0, new k37.t(list, 16));
        return Unit.f186387a;
    }
}
