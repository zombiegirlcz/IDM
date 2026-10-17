package aem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(2, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((f) create((hem.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        return null;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hem.c cVar = (hem.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (cVar.a().c().getAttributes().d(g.f3720b) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
