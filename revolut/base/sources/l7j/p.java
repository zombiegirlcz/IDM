package l7j;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d7j.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f192683w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f192683w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f192683w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f192683w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            case 2:
                p pVar3 = new p(this.f192683w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
            default:
                p pVar4 = new p(this.f192683w, continuation, 3);
                pVar4.v = obj2;
                return pVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((OrderQuote) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        z zVar = this.f192683w;
        switch (i) {
            case 0:
                OrderQuote orderQuote = (OrderQuote) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b7j.b bVar = zVar.f192700t;
                cli.y yVar = zVar.A;
                ExchangeOrderDraft exchangeOrderDraft = ((g) ((j2) yVar.f22677a).getValue()).f192670a;
                l4i.a aVar2 = zVar.o;
                bVar.getClass();
                zVar.H2(yVar, new n0(b7j.b.a(exchangeOrderDraft, orderQuote, aVar2), 3));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zVar.H2(zVar.A, new t(data, 0));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zVar.H2(zVar.A, new t(data2, 1));
                break;
            default:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zVar.H2(zVar.A, new djc.z(10, iVar));
                break;
        }
        return Unit.f186387a;
    }
}
