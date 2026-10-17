package lbc;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.navigation.carousel.WidgetCarouselFlowProvider$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function1 {
    public com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a f193656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f193656w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.f193656w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar3 = this.f193656w;
        if (i == 0) {
            yhm.o.b(obj2);
            lsh.b bVar = aVar3.u;
            HomeFeedWidgetContext.Personal.INSTANCE.getClass();
            WidgetCarouselFlowProvider$InputData widgetCarouselFlowProvider$InputData = new WidgetCarouselFlowProvider$InputData(fc7.b.class, HomeFeedWidgetContext.Personal.Companion.a(), "rev_pay_delivery_tracking");
            this.u = aVar3;
            this.v = 1;
            obj2 = bVar.a(widgetCarouselFlowProvider$InputData, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            yhm.o.b(obj2);
        }
        aVar.f2((ViewController) obj2, ModalDestination.Style.POPUP.f98311a, new laj.b(aVar3, 4));
        return Unit.f186387a;
    }
}
