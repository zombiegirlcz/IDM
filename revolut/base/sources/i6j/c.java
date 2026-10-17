package i6j;

import aw0.n6;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CommodityPositionDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CommodityPositionDetailsController commodityPositionDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = commodityPositionDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CommodityPositionDetailsController commodityPositionDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a) commodityPositionDetailsController.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar3 = (com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a) commodityPositionDetailsController.R2();
                aVar3.v.Z2(wd6.e.BUY, aVar3.o.f99790a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar5 = (com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a) commodityPositionDetailsController.R2();
                aVar5.v.Z2(wd6.e.SELL, aVar5.o.f99790a);
                break;
        }
        return Unit.f186387a;
    }
}
