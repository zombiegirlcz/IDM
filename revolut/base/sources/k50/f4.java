package k50;

import k50.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class f4 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ j4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.v = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f4 f4Var = new f4(this.v, continuation);
        f4Var.u = obj2;
        return f4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f4) create((n0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n0.a aVar = (n0.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (aVar instanceof m0) {
            j4 j4Var = this.v;
            j4Var.n2(new e4(j4Var, aVar, null), new whi.b(6));
        } else if (!(aVar instanceof n0.a.C1035a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
