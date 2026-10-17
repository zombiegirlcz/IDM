package d6j;

import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.y1;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommodityAssetDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CommodityAssetDetailsScreen commodityAssetDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = commodityAssetDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CandleStickGraphDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CandleStickGraphDelegate.a aVar = (CandleStickGraphDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarR2 = this.v.R2();
        y1 y1Var = aVar instanceof y1 ? (y1) aVar : null;
        n0 n0Var = (n0) rVarR2;
        n0Var.H2(n0Var.R, new d34.b(y1Var != null ? y1Var.f55615b : null, 11));
        return Unit.f186387a;
    }
}
