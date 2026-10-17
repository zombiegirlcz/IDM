package qc4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qc4.e;
import skm.e0;
import skm.p0;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            xq3.d dVar = jVar.f244559p;
            String str = jVar.o.f67797a;
            this.u = 1;
            xr3.e eVar = dVar.f308066a;
            eVar.getClass();
            xr3.d dVar2 = new xr3.d(eVar, str, null, 0);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, dVar2, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        z1 z1Var = jVar.f244560q.f.f263838a;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        jVar.C2(e.b.f244557a);
        return unit;
    }
}
