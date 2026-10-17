package ew2;

import e7l.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class p0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_add_to_googlepay.impl.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.revolut.feature.card_add_to_googlepay.impl.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        efm.d0 d0VarL = prk.o.l(((ik3.c) this.v.f64467y).l(g.b.f123407a, w4l.h.f294642c), null, null, 3, "firstOrError(...)");
        this.u = 1;
        Object objB = nim.a.b(d0VarL, this);
        return objB == aVar ? aVar : objB;
    }
}
