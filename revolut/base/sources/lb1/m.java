package lb1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.v, continuation, 0);
            default:
                return new m(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = this.v;
                return yji.l.a1(nVar, rd0.e.b(nim.a.w(((mfc.c) nVar.f193583p).f204989b.k(false), new md0.c(16))), null, null, new l(nVar, continuation, 0), 3);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar2 = this.v;
                return yji.l.a1(nVar2, rd0.e.b(xa1.a.a(nVar2.f193583p, null, 3)), null, null, new l(nVar2, continuation, 1), 3);
        }
    }
}
