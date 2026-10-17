package d6j;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommodityAssetDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CommodityAssetDetailsScreen commodityAssetDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = commodityAssetDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TrendViewDelegate.a aVar = (TrendViewDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = aVar instanceof mi ? ((mi) aVar).f54485b : -1;
        n0 n0Var = (n0) this.v.R2();
        n0Var.H2(n0Var.R, new a5g.i(i, 11));
        return Unit.f186387a;
    }
}
