package h6j;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.holdings_average_price.CommodityHoldingsAvgPriceController;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommodityHoldingsAvgPriceController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommodityHoldingsAvgPriceController commodityHoldingsAvgPriceController, Continuation continuation) {
        super(2, continuation);
        this.v = commodityHoldingsAvgPriceController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.S.getValue();
        Intrinsics.h(model);
        f fVar = (f) cVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        e eVar = obj3 instanceof e ? (e) obj3 : null;
        if (Intrinsics.f(eVar, e.f149751a)) {
            fVar.H2(fVar.o, new h56.a(fVar, 3));
        } else if (eVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
