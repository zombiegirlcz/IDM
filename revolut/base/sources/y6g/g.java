package y6g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreen;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsSearchFiltersScreen f311272w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311272w = travelFlightsSearchFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f311272w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f311272w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen = this.f311272w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = travelFlightsSearchFiltersScreen.d();
                Intrinsics.h(itemId);
                com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a) mVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("travel_flights_search_filters_clear_all")) {
                    aVar2.H2(aVar2.f93403p, new y66.p(4));
                    aVar2.C2(new l(new FlightSearchRequestFilters(null, null, null, null)));
                }
                break;
            default:
                y clickData = (y) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = travelFlightsSearchFiltersScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a aVar4 = (com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a) mVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f167226b.f58324n;
                a aVar5 = obj3 instanceof a ? (a) obj3 : null;
                if (aVar5 != null) {
                    aVar4.H2(aVar4.f93403p, new y1.a(aVar5, 22));
                }
                break;
        }
        return Unit.f186387a;
    }
}
