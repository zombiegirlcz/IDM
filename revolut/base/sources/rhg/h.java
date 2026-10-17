package rhg;

import cli.y;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.TravelMilesFlightSearchResultsFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightSearchResultsFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightSearchResultsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) lVarE3;
        y yVar = aVar2.f94344r;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "AIRLINES_SECTION_SUBHEADER_ID")) {
            aVar2.H2(yVar, new rg3.d(16));
        } else if (Intrinsics.f(str, "PROGRAMMES_SECTION_SUBHEADER_ID")) {
            aVar2.H2(yVar, new rg3.d(17));
        }
        return Unit.f186387a;
    }
}
