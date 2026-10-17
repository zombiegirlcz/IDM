package s9b;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ p u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation continuation) {
        super(1, continuation);
        this.u = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = this.u;
        pfm.h hVarI = pVar.f261164p.i();
        ofm.h hVar = new ofm.h(new oma.r(pVar, 21));
        hVarI.d(hVar);
        return hVar;
    }
}
