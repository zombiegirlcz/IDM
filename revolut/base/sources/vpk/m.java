package vpk;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f291243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f291243w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f291243w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f291243w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            default:
                m mVar3 = new m(this.f291243w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        g gVar = (g) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(gVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f291243w;
        switch (i) {
            case 0:
                g gVar = (g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return d8l.d.E(pVar.d.d(cp5.d.d(gVar.f291229a), io3.h.S(gVar.f291230b).a()));
            case 1:
                g gVar2 = (g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ipk.b bVar = pVar.f291250c;
                Pair pair = gVar2.f291229a;
                ipk.f fVar = (ipk.f) d0.d0(bVar.a(((xi0.b) pair.f186385a).f306286a, ((xi0.b) pair.f186386b).f306286a, io3.h.M(gVar2.f291230b)));
                if (fVar != null) {
                    return io3.h.G(fVar);
                }
                return null;
            default:
                g gVar3 = (g) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ipk.b bVar2 = pVar.f291250c;
                Pair pair2 = gVar3.f291229a;
                ipk.f fVar2 = (ipk.f) d0.d0(bVar2.a(((xi0.b) pair2.f186385a).f306286a, ((xi0.b) pair2.f186386b).f306286a, io3.h.M(gVar3.f291230b)));
                if (fVar2 != null) {
                    return io3.h.G(fVar2);
                }
                return null;
        }
    }
}
