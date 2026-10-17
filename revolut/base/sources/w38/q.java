package w38;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ a89.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sfe.a f294203w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a89.c cVar, sfe.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f294203w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, this.f294203w, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((v38.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        v38.c cVar = (v38.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!(cVar instanceof v38.a)) {
            return zi0.c.i(zhm.f0.f322471a);
        }
        n38.a aVar2 = ((v38.a) cVar).f285854a;
        a89.c cVar2 = this.v;
        return rd0.e.b(nim.a.w(((r38.l) ((r38.b) cVar2.f2140b)).e(l38.a.c(aVar2), c8g.c.C(this.f294203w)), new w29.a(cVar2, 10)));
    }
}
