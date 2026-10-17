package d7j;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommodityOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CommodityOrderEditScreen commodityOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = commodityOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f51781a;
        boolean zF = Intrinsics.f(str, "STOP_LIMIT_PRICE");
        int i = 6;
        Continuation continuation = null;
        CommodityOrderEditScreen commodityOrderEditScreen = this.v;
        if (zF) {
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) commodityOrderEditScreen.R2();
            gVar.getClass();
            gVar.n2(new j1(i, gVar, continuation), new whi.b(6));
        } else if (Intrinsics.f(str, "SET_SCHEDULE_SETTINGS_ITEM")) {
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) commodityOrderEditScreen.R2();
            gVar2.getClass();
            gVar2.n2(new j1(3, gVar2, continuation), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
