package zuj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelItineraryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelItineraryScreen travelItineraryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelItineraryScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelItineraryScreen travelItineraryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) travelItineraryScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) travelItineraryScreen.e3()).f101616y, TravelItineraryScreenContract$ModalStep.AddBooking.f101590a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
