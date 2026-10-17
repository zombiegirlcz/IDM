package i6j;

import com.revolut.data.model.Data;
import i6f.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a f159033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f159033w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f159033w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f159033w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f159033w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o(this.f159033w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
            default:
                o oVar5 = new o(this.f159033w, continuation, 4);
                oVar5.v = obj2;
                return oVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        io3.d dVar;
        int i = this.u;
        com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar = this.f159033w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f99798w, new h0(data, 7));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f99798w, new h0(data2, 8));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f99798w, new h0(data3, 9));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data4.getLoading() || (dVar = (io3.d) data4.getContent()) == null || dVar.i != 0) {
                    aVar.H2(aVar.f99798w, new h0(data4, 10));
                } else {
                    aVar.B2();
                }
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f99798w, new h0(data5, 11));
                break;
        }
        return Unit.f186387a;
    }
}
