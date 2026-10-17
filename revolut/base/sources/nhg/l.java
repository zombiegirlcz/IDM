package nhg;

import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelMilesFlightSearchResultsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelMilesFlightSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            case 1:
                return new l(this.v, continuation, 1);
            case 2:
                return new l(this.v, continuation, 2);
            case 3:
                return new l(this.v, continuation, 3);
            case 4:
                return new l(this.v, continuation, 4);
            default:
                return new l(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) travelMilesFlightSearchResultsScreen.h3()).v, TravelMilesFlightSearchResultsScreenContract$ModalStep.OriginPicker.f94314a, popup);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) travelMilesFlightSearchResultsScreen.h3()).v, TravelMilesFlightSearchResultsScreenContract$ModalStep.DestinationPicker.f94312a, popup);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) travelMilesFlightSearchResultsScreen.h3();
                fVar.H2(fVar.u, new nd8.i(26));
                fVar.M2(a.b.f94319a);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) travelMilesFlightSearchResultsScreen.h3()).v, TravelMilesFlightSearchResultsScreenContract$ModalStep.DatePicker.f94311a, popup);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                travelMilesFlightSearchResultsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) travelMilesFlightSearchResultsScreen.h3();
                fVar2.H2(fVar2.u, new nd8.i(25));
                break;
        }
        return Unit.f186387a;
    }
}
