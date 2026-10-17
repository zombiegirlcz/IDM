package rhg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.TravelMilesFlightSearchResultsFiltersScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightSearchResultsFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightSearchResultsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (obj3 instanceof u) {
            u uVar = (u) obj3;
            oki.h.v2(aVar2.f94343q, new TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep.FilterOptions(uVar.f254468a, uVar.f254469b, uVar.f254470c), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
