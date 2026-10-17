package wxh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import yua.q;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        j jVar = this.v;
        ufm.i iVarJ = ((q) jVar.f300994n).j(jVar.f300992l.f96658a);
        this.u = 1;
        Object objB = nim.a.b(iVarJ, this);
        return objB == aVar ? aVar : objB;
    }
}
