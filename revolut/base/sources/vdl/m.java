package vdl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.v = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                new m(this.v, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                new m(this.v, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
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
