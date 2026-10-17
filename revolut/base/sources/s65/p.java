package s65;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import s65.g;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((tji.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.C2(g.a.f260138a);
        return Unit.f186387a;
    }
}
