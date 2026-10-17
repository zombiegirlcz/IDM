package q5g;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TravelFlightsCheckoutScreen travelFlightsCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) b0VarE3).C;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53531a;
        if (Intrinsics.f(str, "FLIGHTS_CHECKOUT_PAYMENT_SUMMARY_FOOTER")) {
            Object obj3 = model.f53534g;
            Payment payment = obj3 instanceof Payment ? (Payment) obj3 : null;
            if (payment != null) {
                oki.h.v2(aVar2, new TravelFlightsCheckoutScreenContract$ModalStep.PriceBreakdown(payment), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        } else if (Intrinsics.f(str, "FLIGHTS_CHECKOUT_SELF_TRANSFER_INFO")) {
            oki.h.v2(aVar2, TravelFlightsCheckoutScreenContract$ModalStep.SelfTransfer.f93307a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
        return Unit.f186387a;
    }
}
