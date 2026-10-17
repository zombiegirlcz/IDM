package otk;

import avk.u;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a f229740w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f229740w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f229740w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(this.f229740w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n(this.f229740w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            default:
                n nVar4 = new n(this.f229740w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a aVar = this.f229740w;
        switch (i) {
            case 0:
                n2h.f fVar = (n2h.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new u(fVar, 4));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new oph.k(data, 12));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new oph.k(data2, 13));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new oph.k(data3, 14));
                break;
        }
        return Unit.f186387a;
    }
}
