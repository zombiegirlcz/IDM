package ru5;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = this.v;
        zVar.x2(new rsl.p(zVar, list, 3));
        return Unit.f186387a;
    }
}
