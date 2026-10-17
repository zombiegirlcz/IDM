package ec8;

import a83.p0;
import com.revolut.data.model.Data;
import d27.g0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_allowance.impl.ui.screen.list.a f124471w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f124471w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f124471w, continuation);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(1, this.f124471w, continuation);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar = this.f124471w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) pair.f186385a;
                aVar.H2(aVar.u, new p0((Data) pair.f186386b, data, 14));
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new g0((Data) pair2.f186385a, 28, (Data) pair2.f186386b, aVar));
                break;
        }
        return Unit.f186387a;
    }
}
