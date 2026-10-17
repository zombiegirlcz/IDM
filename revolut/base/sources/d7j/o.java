package d7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CommodityOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(CommodityOrderEditScreen commodityOrderEditScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = commodityOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.v, continuation, 0);
            default:
                return new o(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CommodityOrderEditScreen commodityOrderEditScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) commodityOrderEditScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) commodityOrderEditScreen.R2();
                gVar.getClass();
                gVar.n2(new j1(1, gVar, null), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
