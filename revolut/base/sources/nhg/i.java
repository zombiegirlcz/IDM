package nhg;

import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesFlightSearchResultsScreen f215481w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f215481w = travelMilesFlightSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f215481w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f215481w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f215481w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen = this.f215481w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE3 = travelMilesFlightSearchResultsScreen.e3();
                Intrinsics.h(aVar);
                ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) vVarE3).L2(aVar);
                break;
            case 1:
                String menuId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE32 = travelMilesFlightSearchResultsScreen.e3();
                Intrinsics.h(menuId);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) vVarE32;
                cli.y yVar = fVar.u;
                com.revolut.kompot.navigable.vc.modal.a aVar4 = fVar.v;
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                if (menuId.equals("MENU_ITEM_SORT_ID")) {
                    oki.h.v2(aVar4, new TravelMilesFlightSearchResultsScreenContract$ModalStep.SortBy(((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (menuId.equals("MENU_ITEM_FILTERS_ID")) {
                    oki.h.v2(aVar4, new TravelMilesFlightSearchResultsScreenContract$ModalStep.Filters(((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).f), ModalDestination.Style.POPUP.f98311a);
                }
                break;
            default:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE33 = travelMilesFlightSearchResultsScreen.e3();
                Intrinsics.h(aVar5);
                ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) vVarE33).L2(aVar5);
                break;
        }
        return Unit.f186387a;
    }
}
