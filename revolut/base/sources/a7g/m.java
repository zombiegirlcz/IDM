package a7g;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TravelFlightsSearchScreen travelFlightsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(item);
        com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) vVarE3;
        cli.y yVar = bVar.f93427w;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        if (Intrinsics.f(str, "search_result_filters")) {
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            FlightSearchFilterOptions flightSearchFilterOptions = ((r) j2Var.getValue()).e;
            if (flightSearchFilterOptions != null) {
                com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f93428x;
                FlightSearchRequestFilters flightSearchRequestFilters = ((r) j2Var2.getValue()).f;
                Passengers passengers = ((r) j2Var2.getValue()).f1892a.e;
                oki.h.v2(aVar2, new TravelFlightsSearchScreenContract$ModalStep.Filters(flightSearchFilterOptions, flightSearchRequestFilters, passengers.f93596b.size() + passengers.f93595a), ModalDestination.Style.POPUP.f98311a);
            }
        } else if (Intrinsics.f(str, "search_result_direct_filter") && ((r) ((j2) yVar.f22677a).getValue()).e != null) {
            FlightSearchRequestFilters flightSearchRequestFilters2 = ((r) ((j2) yVar.f22677a).getValue()).f;
            Continuation continuation = null;
            if (flightSearchRequestFilters2 == null) {
                flightSearchRequestFilters2 = new FlightSearchRequestFilters(null, null, null, null);
            }
            r7g.i iVar = flightSearchRequestFilters2.f93583a;
            r7g.i iVar2 = r7g.i.NON_STOP;
            if (iVar == iVar2) {
                iVar2 = null;
            }
            bVar.l2(new a1a.a(bVar, new FlightSearchRequestFilters(iVar2, flightSearchRequestFilters2.f93584b, flightSearchRequestFilters2.f93585c, flightSearchRequestFilters2.d), continuation, 19), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
