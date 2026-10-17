package bsa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ a3 u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a3 a3Var, i iVar, Continuation continuation) {
        super(1, continuation);
        this.u = a3Var;
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a3 a3Var = this.u;
        if (a3Var != null) {
            return this.v.f18156h.a(a3Var);
        }
        return null;
    }
}
