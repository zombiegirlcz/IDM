package avj;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$ModalStep;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelItineraryAddEventScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TravelItineraryAddEventScreen travelItineraryAddEventScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelItineraryAddEventScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52580a;
        int iHashCode = str.hashCode();
        TravelItineraryAddEventScreen travelItineraryAddEventScreen = this.v;
        if (iHashCode != -1416803886) {
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (iHashCode != -1174366005) {
                if (iHashCode == 775843050 && str.equals("TIME_LIST_ID")) {
                    oki.h.v2(((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) travelItineraryAddEventScreen.d()).f101636r, TravelItineraryAddEventContract$ModalStep.TimePicker.f101623a, bottom_dialog);
                }
            } else if (str.equals("DATE_LIST_ID")) {
                oki.h.v2(((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) travelItineraryAddEventScreen.d()).f101636r, TravelItineraryAddEventContract$ModalStep.DatePicker.f101620a, bottom_dialog);
            }
        } else if (str.equals("LOCATION_LIST_ID")) {
            oki.h.v2(((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) travelItineraryAddEventScreen.d()).f101636r, TravelItineraryAddEventContract$ModalStep.LocationPicker.f101621a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
        }
        return Unit.f186387a;
    }
}
