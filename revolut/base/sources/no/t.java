package no;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ z u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, Continuation continuation) {
        super(2, continuation);
        this.u = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVar = z.Companion;
        this.u.d(null, null, null);
        return Unit.f186387a;
    }
}
