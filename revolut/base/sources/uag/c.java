package uag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.p6;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsHomeFlow f278636w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsHomeFlow travelHotelsHomeFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278636w = travelHotelsHomeFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f278636w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f278636w, continuation, 1);
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
        TravelHotelsHomeFlow travelHotelsHomeFlow = this.f278636w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE3 = travelHotelsHomeFlow.e3();
                Intrinsics.h(menuItemId);
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) dVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("NAV_BAR_ACTION_ID_REV_POINTS")) {
                    oki.h.v2(cVar.f93739w, TravelHotelsHomeFlowContract$ModalStep.RevPointsBottomSheet.f93725a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                p6 p6Var = (p6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE32 = travelHotelsHomeFlow.e3();
                String tabId = p6Var.f209928b;
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) dVarE32;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                cVar2.H2(cVar2.v, new te8.a(tabId, 21));
                break;
        }
        return Unit.f186387a;
    }
}
