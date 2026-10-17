package y6g;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsSearchFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsSearchFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        InputSliderDelegate.Model model = (InputSliderDelegate.Model) pair.f186385a;
        cy0.a sliderValue = (cy0.a) pair.f186386b;
        com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a) this.v.d();
        y yVar = aVar2.f93403p;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sliderValue, "sliderValue");
        String str = model.f52560a;
        if (Intrinsics.f(str, "travel_flights_search_filters_price_slider")) {
            aVar2.H2(yVar, new wk4.k(sliderValue.f110014a, 5));
        } else if (Intrinsics.f(str, "travel_flights_search_filters_duration_slider")) {
            aVar2.H2(yVar, new wk4.k(sliderValue.f110014a, 4));
        }
        return Unit.f186387a;
    }
}
