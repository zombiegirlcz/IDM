package rhg;

import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.TravelMilesFlightSearchResultsFiltersScreen;
import ip0.r70;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesFlightSearchResultsFiltersScreen f254451w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254451w = travelMilesFlightSearchResultsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f254451w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f254451w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesFlightSearchResultsFiltersScreen travelMilesFlightSearchResultsFiltersScreen = this.f254451w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r70 r70Var = (r70) pair.f186385a;
                Pair selectionRange = (Pair) pair.f186386b;
                l lVarE3 = travelMilesFlightSearchResultsFiltersScreen.R2();
                Object obj3 = r70Var.f166134j;
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) lVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(selectionRange, "selectionRange");
                aVar2.H2(aVar2.f94344r, new rgf.m(obj3, selectionRange, 4));
                break;
            default:
                String menuItemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = travelMilesFlightSearchResultsFiltersScreen.R2();
                Intrinsics.h(menuItemId);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a aVar4 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) lVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("RESET_MENU_ITEM_ID")) {
                    aVar4.H2(aVar4.f94344r, new rg3.d(15));
                }
                break;
        }
        return Unit.f186387a;
    }
}
