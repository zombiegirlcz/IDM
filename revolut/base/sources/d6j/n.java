package d6j;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.commodity.asset_details.impl.navigation.CommodityPositionDetailsDestination;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommodityAssetDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CommodityAssetDetailsScreen commodityAssetDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = commodityAssetDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarR2 = this.v.R2();
        Intrinsics.h(model);
        n0 n0Var = (n0) rVarR2;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof p) {
            n0Var.C1(new CommodityPositionDetailsDestination(new CommodityPositionDetailsDestination.InputData(((p) obj3).f111596a)));
        }
        return Unit.f186387a;
    }
}
