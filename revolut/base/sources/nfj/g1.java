package nfj;

import java.util.List;
import kfj.b3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes11.dex */
public final class g1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ m1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(m1 m1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = m1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g1(this.v, continuation, 0);
            default:
                return new g1(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g1) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m1 m1Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = m1Var.f214989c;
                m1.Companion.getClass();
                List list = (List) cVar.T2("PROFILES_KEY", m1.i);
                if (list != null) {
                    return ofj.m.b(list);
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = (List) p.a.j(b3.class, KTypeProjection.INSTANCE, List.class, m1Var.f214989c, "TROUBLESHOOTING_SCOPES_KEY");
                if (list2 != null) {
                    return io3.h.I(list2);
                }
                return null;
        }
    }
}
