package bof;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f17416w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, q qVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f17416w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f17416w, continuation);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(1, this.f17416w, continuation);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((hof.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((na7.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.f17416w;
        switch (i) {
            case 0:
                hof.a aVar = (hof.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.D, new bhl.g(aVar, 18));
                break;
            default:
                na7.a aVar3 = (na7.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.D, new bhl.g(aVar3, 19));
                break;
        }
        return Unit.f186387a;
    }
}
