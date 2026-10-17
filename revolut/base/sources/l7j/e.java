package l7j;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ CommodityOrderReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CommodityOrderReviewScreen commodityOrderReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = commodityOrderReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = (z) this.u.d();
        zVar.getClass();
        zVar.n2(new x(zVar, null, 0), new whi.b(6));
        return Unit.f186387a;
    }
}
