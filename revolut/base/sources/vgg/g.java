package vgg;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesAirlineDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesAirlineDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ActionCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionCardDelegate.Model model = (ActionCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar = (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) tVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        TravelMilesRedeemOption travelMilesRedeemOption = obj3 instanceof TravelMilesRedeemOption ? (TravelMilesRedeemOption) obj3 : null;
        if (travelMilesRedeemOption != null && !travelMilesRedeemOption.e.isEmpty()) {
            oki.h.v2(bVar.f94278x, new TravelMilesAirlineDetailsScreenContract$ModalStep.RedeemOptionBottomSheet(travelMilesRedeemOption), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
