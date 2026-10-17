package aig;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.travel.miles.impl.ui.screen.home.TravelMilesHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelMilesHomeScreen travelMilesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.home.e) jVarD3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        int iHashCode = str.hashCode();
        if (iHashCode != -2115518642) {
            if (iHashCode != 1246412532) {
                if (iHashCode == 2097956334 && str.equals("TRANSACTIONS_SEE_ALL_BUTTON_ITEM_ID")) {
                    eVar.F1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(new RevPointsTransactionPageParams(0, null, null, null, f1.MILES, null, null, null, null, 495), new RevPointsFlowDestination.StartType.OpenTransactionList.UiOverrides(null, null, 13))));
                }
            } else if (str.equals("AIRLINE_INFO_CONFIRMATION_BUTTON_ITEM_ID")) {
                eVar.f94353r.Z2(new com.revolut.feature.travel.miles.impl.ui.screen.home.c(model, eVar, null));
            }
        } else if (str.equals("AIRLINES_SEE_ALL_BUTTON_ITEM_ID")) {
            eVar.H2(eVar.z, new agh.h(27));
        }
        return Unit.f186387a;
    }
}
