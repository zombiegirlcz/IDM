package a7g;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchContext;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchResultItem;
import com.revolut.feature.travel.flights.models.domain.search.TravelFlightsItinerary;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TravelFlightsSearchScreen travelFlightsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) vVarE3;
        cli.y yVar = bVar.f93427w;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        FlightSearchResultItem flightSearchResultItem = obj3 instanceof FlightSearchResultItem ? (FlightSearchResultItem) obj3 : null;
        if (flightSearchResultItem == null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TravelFlightsSearchScreen", j6.a.q("Unexpected RowDelegate.Model parcel type: ", obj3 != null ? obj3.getClass().getName() : null), null, h0Var);
        } else {
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            FlightSearchContext flightSearchContext = ((r) j2Var.getValue()).f1894c;
            if (flightSearchContext != null) {
                bVar.C2(new u(new TravelFlightsItinerary(flightSearchContext, flightSearchResultItem), ((r) j2Var2.getValue()).f1892a.f, ((r) j2Var2.getValue()).f1892a.e));
            }
        }
        return Unit.f186387a;
    }
}
