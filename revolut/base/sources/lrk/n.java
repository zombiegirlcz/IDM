package lrk;

import java.util.List;
import jrk.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import m2l.i0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f199541w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f199541w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f199541w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(this.f199541w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n(this.f199541w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            default:
                n nVar4 = new n(this.f199541w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = this.f199541w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jrk.r rVar = (jrk.r) j6.a.k(jrk.r.class, oVar.d, o.a(str));
                if (rVar != null) {
                    return hx7.l.C(rVar);
                }
                return null;
            case 1:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m2l.r rVar2 = (m2l.r) j6.a.k(m2l.r.class, oVar.d, o.b(str2));
                if (rVar2 != null) {
                    return hx7.i.T(rVar2);
                }
                return null;
            case 2:
                String str3 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(u.class, KTypeProjection.INSTANCE, List.class, oVar.d, o.c(str3));
                if (list != null) {
                    return hx7.q.e0(list);
                }
                return null;
            default:
                String str4 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var = (i0) j6.a.k(i0.class, oVar.d, o.d(str4));
                if (i0Var != null) {
                    return i26.l.x(i0Var);
                }
                return null;
        }
    }
}
