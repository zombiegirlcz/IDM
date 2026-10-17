package q5h;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services.CommodityAdditionalServicesController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CommodityAdditionalServicesController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CommodityAdditionalServicesController commodityAdditionalServicesController, Continuation continuation) {
        super(2, continuation);
        this.u = commodityAdditionalServicesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) this.u.R2()).f242407r.a();
        return Unit.f186387a;
    }
}
