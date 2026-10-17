package ghg;

import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.vr;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelMilesFlightFinderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelMilesFlightFinderScreen travelMilesFlightFinderScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelMilesFlightFinderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        vr vrVar = (vr) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(vrVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        TravelMilesFlightFinderScreen travelMilesFlightFinderScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) travelMilesFlightFinderScreen.R2();
                cVar.I2();
                oki.h.v2(cVar.f94292s, TravelMilesFlightFinderScreenContract$ModalStep.OriginPicker.f94286a, popup);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) travelMilesFlightFinderScreen.R2();
                cVar2.I2();
                oki.h.v2(cVar2.f94292s, TravelMilesFlightFinderScreenContract$ModalStep.DestinationPicker.f94285a, popup);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar3 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) travelMilesFlightFinderScreen.R2();
                cVar3.I2();
                cVar3.H2(cVar3.f94293t, new gd8.j(21));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar4 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) travelMilesFlightFinderScreen.R2();
                cVar4.I2();
                oki.h.v2(cVar4.f94292s, TravelMilesFlightFinderScreenContract$ModalStep.DatePicker.f94284a, popup);
                break;
        }
        return Unit.f186387a;
    }
}
