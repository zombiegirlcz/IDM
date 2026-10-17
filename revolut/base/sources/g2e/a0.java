package g2e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.v = c0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                new a0(this.v, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                new a0(this.v, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
                throw null;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw null;
        }
    }
}
