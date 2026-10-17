package fu6;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a f138104w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f138104w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f138104w, continuation);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(1, this.f138104w, continuation);
                rVar2.v = obj2;
                return rVar2;
            case 2:
                r rVar3 = new r(2, this.f138104w, continuation);
                rVar3.v = obj2;
                return rVar3;
            default:
                r rVar4 = new r(3, this.f138104w, continuation);
                rVar4.v = obj2;
                return rVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar = this.f138104w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f73680y, new fk4.o(data, 24));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f73680y, new fk4.o(data2, 25));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f73680y, new fk4.o(data3, 26));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f73680y, new fk4.o(data4, 27));
                break;
        }
        return Unit.f186387a;
    }
}
