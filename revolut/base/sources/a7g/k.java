package a7g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelFlightsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(TravelFlightsSearchScreen travelFlightsSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelFlightsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.v, continuation, 0);
            case 1:
                return new k(this.v, continuation, 1);
            case 2:
                return new k(this.v, continuation, 2);
            case 3:
                return new k(this.v, continuation, 3);
            case 4:
                return new k(this.v, continuation, 4);
            case 5:
                return new k(this.v, continuation, 5);
            default:
                return new k(this.v, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        TravelFlightsSearchScreen travelFlightsSearchScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.d();
                cli.y yVar = bVar.f93427w;
                FlightSearchQuery updateSearchQueryAndTriggerSearch = ((r) ((j2) yVar.f22677a).getValue()).f1892a;
                Intrinsics.checkNotNullParameter(updateSearchQueryAndTriggerSearch, "$this$updateSearchQueryAndTriggerSearch");
                FlightSearchQuery flightSearchQueryA = FlightSearchQuery.a(updateSearchQueryAndTriggerSearch, updateSearchQueryAndTriggerSearch.f93578b, updateSearchQueryAndTriggerSearch.f93577a, null, null, null, null, 60);
                bVar.H2(yVar, new a7b.r(flightSearchQueryA, 3));
                bVar.f93424r.a(flightSearchQueryA);
                bVar.l2(new a1a.a(bVar, flightSearchQueryA, null, 20), new yi5.b(26));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.d();
                com.revolut.kompot.navigable.vc.modal.a aVar3 = bVar2.f93428x;
                cli.y yVar2 = bVar2.f93427w;
                oki.h.v2(aVar3, new TravelFlightsSearchScreenContract$ModalStep.DatesSelection(((r) ((j2) yVar2.f22677a).getValue()).f1892a.f93579c, ((r) ((j2) yVar2.f22677a).getValue()).f1892a.d), popup);
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar3 = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.d();
                com.revolut.kompot.navigable.vc.modal.a aVar5 = bVar3.f93428x;
                cli.y yVar3 = bVar3.f93427w;
                oki.h.v2(aVar5, new TravelFlightsSearchScreenContract$ModalStep.TravelersSelection(((r) ((j2) yVar3.f22677a).getValue()).f1892a.e, ((r) ((j2) yVar3.f22677a).getValue()).f1892a.f), popup);
                break;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.d()).B2();
                break;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar4 = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.d();
                bVar4.H2(bVar4.f93427w, new a5g.h(18));
                break;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.d()).f93428x, TravelFlightsSearchScreenContract$ModalStep.OriginSelection.f93415a, popup);
                break;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.d()).f93428x, TravelFlightsSearchScreenContract$ModalStep.DestinationSelection.f93411a, popup);
                break;
        }
        return Unit.f186387a;
    }
}
