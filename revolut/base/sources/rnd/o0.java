package rnd;

import djb.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ v0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(v0 v0Var, Continuation continuation) {
        super(2, continuation);
        this.v = v0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o0 o0Var = new o0(this.v, continuation);
        o0Var.u = ((Boolean) obj2).booleanValue();
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((o0) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return !z ? zi0.c.i(zhm.f0.f322471a) : this.v.g(k.a.f115281a);
    }
}
