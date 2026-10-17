package d7j;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommodityOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(CommodityOrderEditScreen commodityOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = commodityOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f51981p;
        if (obj3 instanceof ExchangeOrderDraft) {
            ExchangeOrderDraft orderDraftPayload = (ExchangeOrderDraft) obj3;
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.v.R2();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(orderDraftPayload, "orderDraftPayload");
            gVar.n2(new s1(gVar, orderDraftPayload, null, 1), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
