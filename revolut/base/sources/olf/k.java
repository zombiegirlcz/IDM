package olf;

import cmf.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function3 {
    public /* synthetic */ cmf.g u;
    public /* synthetic */ glc.j v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k kVar = new k(3, (Continuation) obj4);
        kVar.u = (cmf.g) obj2;
        kVar.v = (glc.j) obj3;
        return kVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        cmf.g gVar = this.u;
        glc.j jVar = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (gVar instanceof cmf.h) {
            return cmf.h.a((cmf.h) gVar, jVar.f144611a, jVar.f144612b, jVar.f144613c, jVar.d, jVar.f, false, true, null, null, null, 1952);
        }
        if (Intrinsics.f(gVar, g.b.f25230a)) {
            return gVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
