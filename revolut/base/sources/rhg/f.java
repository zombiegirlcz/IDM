package rhg;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.TravelMilesFlightSearchResultsFiltersScreen;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightSearchResultsFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightSearchResultsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) this.v.R2();
        aVar2.H2(aVar2.f94344r, new n(model.k, aVar2, model.f53306c == qd0.SELECTED));
        return Unit.f186387a;
    }
}
