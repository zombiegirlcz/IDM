package beb;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.ConfirmReservationScreen;
import com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.ConfirmReservationScreenContract$ModalStep;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConfirmReservationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ConfirmReservationScreen confirmReservationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = confirmReservationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String listId = model.f52708a;
        com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar2 = (com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "CONFIRM_RESERVATION_CUSTOMER_DETAILS_HEADER")) {
            h hVar = (h) ((j2) aVar2.f82839s.f22677a).getValue();
            oki.h.v2(aVar2.f82840t, new ConfirmReservationScreenContract$ModalStep.CustomerDetails(new CustomerDetailsScreenContract$InputData(hVar.f14737c, hVar.d)), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
