package o7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CommodityTargetPriceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CommodityTargetPriceScreen commodityTargetPriceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = commodityTargetPriceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CommodityTargetPriceScreen commodityTargetPriceScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b) commodityTargetPriceScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b bVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b) commodityTargetPriceScreen.e3();
                bVar.getClass();
                bVar.n2(new z(bVar, null, 1), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b bVar2 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b) commodityTargetPriceScreen.e3();
                bVar2.getClass();
                bVar2.n2(new z(bVar2, null, 0), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
