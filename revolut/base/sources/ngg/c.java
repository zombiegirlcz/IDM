package ngg;

import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.p6;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesFlightSearchDashboardPagerFlow f215147w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelMilesFlightSearchDashboardPagerFlow travelMilesFlightSearchDashboardPagerFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f215147w = travelMilesFlightSearchDashboardPagerFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f215147w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f215147w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((p6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesFlightSearchDashboardPagerFlow travelMilesFlightSearchDashboardPagerFlow = this.f215147w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE3 = travelMilesFlightSearchDashboardPagerFlow.e3();
                Intrinsics.h(itemId);
                com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a) iVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("NAV_BAR_ACTION_ID_REV_POINTS")) {
                    oki.h.v2(aVar2.f94255r, TravelMilesFlightSearchDashboardPagerFlowContract$ModalStep.RevPointsBottomSheet.f94248a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                p6 p6Var = (p6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE32 = travelMilesFlightSearchDashboardPagerFlow.e3();
                String tabId = p6Var.f209928b;
                com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a aVar4 = (com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a) iVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                aVar4.H2(aVar4.f94254q, new mll.h(tabId, 26));
                break;
        }
        return Unit.f186387a;
    }
}
