package s0l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import s0l.g;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ s u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, Continuation continuation) {
        super(1, continuation);
        this.u = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.v2(g.a.f258982a);
        return Unit.f186387a;
    }
}
