package oxb;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vxb.n;
import vxb.p;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
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
        f fVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar = (n) j6.a.k(n.class, fVar.f230762b, "PERSONALISATION_BRANDS_STORAGE_KEY");
                if (nVar != null) {
                    return ksj.b.w(nVar);
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                p pVar = (p) j6.a.k(p.class, fVar.f230762b, "PERSONALISATION_PREFERENCES_STORAGE_KEY");
                if (pVar != null) {
                    return ksj.b.x(pVar);
                }
                return null;
        }
    }
}
