package y6g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreen;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelFlightsSearchFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelFlightsSearchFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a) travelFlightsSearchFiltersScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a aVar3 = (com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a) travelFlightsSearchFiltersScreen.e3();
                k kVar = (k) ((j2) aVar3.f93403p.f22677a).getValue();
                r7g.i iVar = kVar.f311274b;
                dj0.d dVar = kVar.f311275c;
                int iA = b.a(dVar);
                FlightSearchFilterOptions flightSearchFilterOptions = kVar.f311273a;
                if (iA == b.a(flightSearchFilterOptions.f93573b.f93576b)) {
                    dVar = null;
                }
                int i2 = kVar.d;
                aVar3.C2(new l(new FlightSearchRequestFilters(iVar, dVar, i2 != flightSearchFilterOptions.f93574c.f93571b ? Integer.valueOf(i2) : null, kVar.e)));
                break;
        }
        return Unit.f186387a;
    }
}
