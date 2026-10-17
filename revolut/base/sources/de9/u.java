package de9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ long u;
    public final /* synthetic */ x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = ((Number) obj2).longValue();
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        long j2 = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.x2(new a82.r(j2 / ((long) 1000), 13));
        return Unit.f186387a;
    }
}
