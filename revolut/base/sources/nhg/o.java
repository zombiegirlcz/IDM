package nhg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightSearchResultsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.h3();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) vVarE3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "RECOMMENDED_AIRLINES_SEE_ALL_ITEM_ID")) {
            fVar.H2(fVar.u, new nd8.i(24));
        }
        return Unit.f186387a;
    }
}
