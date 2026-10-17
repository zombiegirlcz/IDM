package q5h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.commodity_additional_services.api.navigation.PhysicalDeliveryFlowDestination;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services.CommodityAdditionalServicesController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ CommodityAdditionalServicesController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CommodityAdditionalServicesController commodityAdditionalServicesController, Continuation continuation) {
        super(2, continuation);
        this.u = commodityAdditionalServicesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.u.R2();
        kVar.C1(new PhysicalDeliveryFlowDestination(kVar.f242405p.f95446a));
        return Unit.f186387a;
    }
}
