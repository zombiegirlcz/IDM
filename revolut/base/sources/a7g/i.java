package a7g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.kompot.common.ModalDestination;
import ip0.e8;
import ip0.vj0;
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
    public final /* synthetic */ TravelFlightsSearchScreen f1890w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(TravelFlightsSearchScreen travelFlightsSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1890w = travelFlightsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f1890w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f1890w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f1890w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((e8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((vj0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        TravelFlightsSearchScreen travelFlightsSearchScreen = this.f1890w;
        switch (i) {
            case 0:
                e8 e8Var = (e8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = e8Var.e;
                Payment payment = obj3 instanceof Payment ? (Payment) obj3 : null;
                if (payment != null) {
                    com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.d();
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(payment, "payment");
                    oki.h.v2(bVar.f93428x, new TravelFlightsSearchScreenContract$ModalStep.PriceBreakdown(payment), bottom_dialog);
                }
                break;
            case 1:
                String menuId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE3 = travelFlightsSearchScreen.d();
                Intrinsics.h(menuId);
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) vVarE3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                if (menuId.equals("search_result_sort_menu_item")) {
                    oki.h.v2(bVar2.f93428x, new TravelFlightsSearchScreenContract$ModalStep.SortBy(((r) ((j2) bVar2.f93427w.f22677a).getValue()).f1895g), bottom_dialog);
                }
                break;
            default:
                vj0 model = (vj0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE32 = travelFlightsSearchScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar3 = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) vVarE32;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (model.e == x.OPEN_SELF_TRANSFER_INFO) {
                    oki.h.v2(bVar3.f93428x, TravelFlightsSearchScreenContract$ModalStep.SelfTransfer.f93417a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
