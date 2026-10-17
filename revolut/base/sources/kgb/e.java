package kgb;

import gim.i;
import igb.g0;
import igb.i0;
import igb.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mgb.l;
import mgb.m;
import qgb.m0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            case 2:
                return new e(this.v, continuation, 2);
            default:
                return new e(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g gVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                igb.i iVar = (igb.i) j6.a.k(igb.i.class, gVar.f183945c, "CACHE_KEY_SALARY_HUB_AVAILABILITY");
                if (iVar != null) {
                    return v13.d.J(iVar);
                }
                return null;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j0 j0Var = (j0) j6.a.k(j0.class, gVar.f183945c, "CACHE_KEY_SALARY_HUB");
                if (j0Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                if (j0Var instanceof g0) {
                    return new l(vc.o.y(((g0) j0Var).f161130a));
                }
                if (j0Var instanceof i0) {
                    return m.f205253a;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                qgb.i iVar2 = (qgb.i) j6.a.k(qgb.i.class, gVar.f183945c, "CACHE_KEY_SALARY_HUB_V3_AVAILABILITY");
                if (iVar2 != null) {
                    return edl.a.D(iVar2);
                }
                return null;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m0 m0Var = (m0) j6.a.k(m0.class, gVar.f183945c, "CACHE_KEY_SALARY_HUB_V3");
                if (m0Var != null) {
                    return foh.i.B(m0Var);
                }
                return null;
        }
    }
}
