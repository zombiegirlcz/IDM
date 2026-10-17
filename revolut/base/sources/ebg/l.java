package ebg;

import ebg.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ p u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, Continuation continuation) {
        super(1, continuation);
        this.u = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.C2(g.a.f124339a);
        return Unit.f186387a;
    }
}
