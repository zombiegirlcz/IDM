package bke;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x xVar, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        x xVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0VarC = ((gi5.d) xVar.u).c(null);
            this.u = 1;
            obj2 = nim.a.b(d0VarC, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        xVar.f16373l.c(new o((sh5.c) obj2, 0));
        return Unit.f186387a;
    }
}
