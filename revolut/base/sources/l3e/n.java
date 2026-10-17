package l3e;

import com.revolut.data.model.Data;
import e4k.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ku1.y;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.store.impl.ui.orders.a f191948w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, com.revolut.feature.store.impl.ui.orders.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f191948w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(0, this.f191948w, continuation);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(1, this.f191948w, continuation);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.store.impl.ui.orders.a aVar = this.f191948w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((l80.f) aVar.f88711r).getClass();
                aVar.H2(aVar.u, new m0(data, System.currentTimeMillis(), 7));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new y(data2, 23));
                break;
        }
        return Unit.f186387a;
    }
}
