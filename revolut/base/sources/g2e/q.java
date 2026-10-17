package g2e;

import d9.t0;
import f2e.h3;
import f2e.n3;
import f2e.s2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f140020w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140020w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f140020w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(this.f140020w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q(this.f140020w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q(this.f140020w, continuation, 3);
                qVar4.v = obj2;
                return qVar4;
            default:
                q qVar5 = new q(this.f140020w, continuation, 4);
                qVar5.v = obj2;
                return qVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((q) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 1:
                return ((q) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r rVar = this.f140020w;
        switch (i) {
            case 0:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw null;
            case 1:
                h hVar = (h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f2e.x xVar = (f2e.x) rVar.f140023c.T2("STORE_CAMPAIGN_STORAGE_KEY_" + r.b(hVar), f2e.x.class);
                if (xVar != null) {
                    return t0.z(xVar, hVar.f139991b);
                }
                return null;
            case 2:
                i iVar = (i) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h3 h3Var = (h3) rVar.f140023c.T2("STORE_MEGA_OFFER_STORAGE_KEY_" + r.c(iVar), h3.class);
                if (h3Var != null) {
                    return d2e.j.a(h3Var);
                }
                return null;
            case 3:
                k kVar = (k) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!r.a(rVar, kVar)) {
                    return null;
                }
                n3 n3Var = (n3) rVar.f140023c.T2("STORE_MEGA_OFFERS_STORAGE_KEY_" + r.e(kVar), n3.class);
                if (n3Var != null) {
                    return hb9.b.E(n3Var);
                }
                return null;
            default:
                j jVar = (j) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s2 s2Var = (s2) rVar.f140023c.T2("STORE_MEGA_OFFERS_FILTERS_STORAGE_KEY" + r.d(jVar), s2.class);
                if (s2Var != null) {
                    return gc0.c.u(s2Var);
                }
                return null;
        }
    }
}
