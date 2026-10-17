package z8h;

import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.h;
import yhm.o;
import z8g.q;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f320143w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f320143w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, this.f320143w, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((udh.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowV;
        udh.e eVar = (udh.e) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        dj0.d dVar = eVar.f279205a;
        xi0.b bVar = dVar.f115083b;
        xi0.b bVar2 = this.f320143w;
        if (Intrinsics.f(bVar, bVar2)) {
            od0.i.Companion.getClass();
            flowV = zi0.c.i(h.a(dVar));
        } else {
            flowV = nim.a.v(rd0.e.b(this.v.e.b(u.c(new Pair(bVar, bVar2)), false)), new vtf.b(7, dVar));
        }
        return nim.a.v(flowV, new q(eVar, bVar2, 3));
    }
}
