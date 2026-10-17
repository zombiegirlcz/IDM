package axi;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c f10969w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f10969w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f10969w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f10969w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            default:
                r rVar3 = new r(this.f10969w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((vf0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar = this.f10969w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.D, new ap7.j(data, 18));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.D, new ap7.j(data2, 19));
                break;
            default:
                vf0.k kVar = (vf0.k) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data3 = (Data) kVar.f288454a;
                Data data4 = (Data) kVar.f288455b;
                Data data5 = (Data) kVar.f288456c;
                Data data6 = (Data) kVar.d;
                wi0.b bVar = (wi0.b) kVar.e;
                com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar2 = this.f10969w;
                cVar2.H2(cVar2.D, new v(data6, cVar2, data4, data5, bVar, data3));
                break;
        }
        return Unit.f186387a;
    }
}
