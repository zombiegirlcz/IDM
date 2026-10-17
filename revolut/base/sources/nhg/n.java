package nhg;

import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightSearchResultsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((TripDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set set;
        TripDetailsDelegate.Model model = (TripDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.h3();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) vVarE3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53564b;
        if (obj3 instanceof hfg.d0) {
            hfg.d0 d0Var = (hfg.d0) obj3;
            String str = d0Var.f151815a;
            String str2 = d0Var.f151821l;
            String str3 = d0Var.k;
            TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) fVar.u.f22677a).getValue()).f;
            if (travelMilesSearchAppliedFilters == null || (set = travelMilesSearchAppliedFilters.f94126b) == null) {
                set = zhm.h0.f322473a;
            }
            fVar.C2(new t(str, str2, set, str3));
        }
        return Unit.f186387a;
    }
}
