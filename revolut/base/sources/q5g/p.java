package q5g;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.booking.PrimaryContact;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(TravelFlightsCheckoutScreen travelFlightsCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Integer num;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) b0VarE3;
        cli.y yVar = bVar.B;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.C;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (Intrinsics.f(str, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID")) {
            dj0.d dVar = (dj0.d) ((s) ((j2) yVar.f22677a).getValue()).e.getContent();
            if (dVar != null) {
                oki.h.v2(aVar2, new TravelFlightsCheckoutScreenContract$ModalStep.PocketSelection(dVar), ModalDestination.Style.POPUP.f98311a);
            }
        } else {
            if (kotlin.text.a0.H(str, "FLIGHTS_CHECKOUT_BOUND_", false)) {
                num = obj3 instanceof Integer ? (Integer) obj3 : null;
                if (num != null) {
                    bVar.J2(num.intValue());
                }
            } else if (kotlin.text.a0.H(str, "FLIGHTS_CHECKOUT_TRAVELLER_ROW_", false)) {
                if (model.f53234l) {
                    num = obj3 instanceof Integer ? (Integer) obj3 : null;
                    if (num != null) {
                        bVar.H2(yVar, new l2c.l(num.intValue(), 10));
                    }
                }
            } else if (str.equals("FLIGHTS_CHECKOUT_BOOKING_CONTACT")) {
                PrimaryContact primaryContact = ((s) ((j2) yVar.f22677a).getValue()).f242386a.f93450b;
                oki.h.v2(aVar2, new TravelFlightsCheckoutScreenContract$ModalStep.BookingContact(primaryContact.f93466b, primaryContact.f93467c), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
            }
        }
        return Unit.f186387a;
    }
}
