package ghg;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightFinderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelMilesFlightFinderScreen travelMilesFlightFinderScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightFinderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ActionCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionCardDelegate.Model model = (ActionCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) lVarD3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        cVar.I2();
        Object obj3 = model.k;
        TravelMilesRedeemOption travelMilesRedeemOption = obj3 instanceof TravelMilesRedeemOption ? (TravelMilesRedeemOption) obj3 : null;
        if (travelMilesRedeemOption != null && !travelMilesRedeemOption.e.isEmpty()) {
            oki.h.v2(cVar.f94292s, new TravelMilesFlightFinderScreenContract$ModalStep.RedeemOptionBottomSheet(travelMilesRedeemOption), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
