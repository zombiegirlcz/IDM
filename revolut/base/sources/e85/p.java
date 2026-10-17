package e85;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar2 = this.u;
        return yji.l.a1(aVar2, rd0.e.n(nim.a.v(u0.m(rd0.e.b(aVar2.f70553q.b(aVar2.o.f70546a, w4l.h.f294642c)), aVar2.f70554r.c3(aVar2.o.f70546a, null)), new e4k.f(23)), h0.f322473a), null, null, new e0b.c(aVar2, null, 22), 3);
    }
}
