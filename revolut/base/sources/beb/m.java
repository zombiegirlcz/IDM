package beb;

import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.ConfirmReservationScreenContract$ModalStep;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreen;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a f14745b;

    public /* synthetic */ m(com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar, int i) {
        this.f14744a = i;
        this.f14745b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f14744a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ConfirmReservationScreenContract$ModalStep step = (ConfirmReservationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof ConfirmReservationScreenContract$ModalStep.CustomerDetails;
                com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar = this.f14745b;
                if (z) {
                    CustomerDetailsScreen customerDetailsScreen = new CustomerDetailsScreen(((ConfirmReservationScreenContract$ModalStep.CustomerDetails) step).f82834a);
                    aVar.a(customerDetailsScreen, new m(aVar, 1));
                    return customerDetailsScreen;
                }
                if (!Intrinsics.f(step, ConfirmReservationScreenContract$ModalStep.RevPayPocketSelection.f82835a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cli.y yVar = aVar.f82839s;
                Reservation.Guarantee guaranteeC = ((h) ((j2) yVar.f22677a).getValue()).c();
                Reservation.Guarantee.Order order = guaranteeC != null ? guaranteeC.f82823c : null;
                if (order == null) {
                    throw new IllegalArgumentException("Cannot open Restaurants RevPay selector without a guarantee order");
                }
                dj0.d dVar = order.f82825b;
                if (dVar == null) {
                    throw new IllegalArgumentException("Cannot open Restaurants RevPay selector without a guarantee amount");
                }
                u6c.t tVar = u6c.t.STAYS;
                xdb.y yVar2 = (xdb.y) ((h) ((j2) yVar.f22677a).getValue()).f14736b.getContent();
                ViewController viewControllerE1 = aVar.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(tVar, dVar, yVar2 != null ? yVar2.f304415a : null, order.d, null, new PayWithAnyFundingOptions(CardPaymentAvailability.NotAvailable.f84364a, true, true), w6c.f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 64)));
                b9i.f block = new b9i.f(aVar, 17);
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            default:
                oki.g onResult = (oki.g) obj2;
                deb.i result = (deb.i) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar2 = this.f14745b;
                aVar2.H2(aVar2.f82839s, new b9i.f(result, 18));
                return Unit.f186387a;
        }
    }
}
