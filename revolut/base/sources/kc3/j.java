package kc3;

import e7l.g;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
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
            r rVarG = m70.a.g(((ik3.c) kVar.o).l(g.b.f123407a, w4l.h.f294642c), null, null, 3);
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
        e7l.f fVar = (e7l.f) obj2;
        xi0.b bVar = kVar.f182659p.f182654a;
        Long l2 = (Long) fVar.f123394t.get(bVar.f306286a);
        kVar.H2(kVar.f182660q, new k79.b(l2 != null ? new dj0.d(l2.longValue(), bVar) : null, fVar, 8));
        return Unit.f186387a;
    }
}
