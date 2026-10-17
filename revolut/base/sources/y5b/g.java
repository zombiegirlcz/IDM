package y5b;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j jVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w5b.d0 d0Var = (w5b.d0) jVar.f311049b.T2("KEY_CREATE_ACCOUNT", w5b.d0.class);
                if (d0Var != null) {
                    return x5d.b.w(d0Var);
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w5b.d0 d0Var2 = (w5b.d0) jVar.f311049b.T2("KEY_LINK_ACCOUNT", w5b.d0.class);
                if (d0Var2 != null) {
                    return x5d.b.w(d0Var2);
                }
                return null;
        }
    }
}
