package q5h;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services.CommodityAdditionalServicesController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CommodityAdditionalServicesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CommodityAdditionalServicesController commodityAdditionalServicesController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = commodityAdditionalServicesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CommodityAdditionalServicesController commodityAdditionalServicesController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) commodityAdditionalServicesController.d3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) commodityAdditionalServicesController.d3();
                kVar.getClass();
                kVar.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.will-i-be-charged-for-exchanging-foreign-currencies", 2))));
                break;
        }
        return Unit.f186387a;
    }
}
