package qxd;

import e7l.g;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k kVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarG = m70.a.g(((ik3.c) kVar.f250082p).l(g.b.f123407a, w4l.h.f294642c), null, new qsk.d(21), 1);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Long l2 = (Long) ((e7l.f) obj2).f123394t.get(kVar.o.f88200a.f306286a);
        kVar.H2(kVar.f250084r, new i(l2 != null ? l2.longValue() : 0L, kVar, 1));
        return Unit.f186387a;
    }
}
