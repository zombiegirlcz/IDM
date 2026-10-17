package yui;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AsftTimeSlotBookingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AsftTimeSlotBookingScreen asftTimeSlotBookingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = asftTimeSlotBookingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a) pVarE3).f98894y;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (iHashCode != -972889194) {
            if (iHashCode != 1405922849) {
                if (iHashCode == 2131968725 && listId.equals("ID_DATE_OF_TRAVEL")) {
                    oki.h.v2(aVar2, AsftTimeSlotBookingScreenContract$ModalStep.FlightDatePicker.f98884a, bottom_dialog);
                }
            } else if (listId.equals("ID_TIME_SLOT_PICKER")) {
                oki.h.v2(aVar2, AsftTimeSlotBookingScreenContract$ModalStep.TimeSlotPicker.f98885a, bottom_dialog);
            }
        } else if (listId.equals("ID_NUMBER_OF_TRAVELERS")) {
            oki.h.v2(aVar2, AsftTimeSlotBookingScreenContract$ModalStep.TravelersNumberPicker.f98886a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
