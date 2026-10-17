package ghg;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hfg.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightFinderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelMilesFlightFinderScreen travelMilesFlightFinderScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightFinderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) lVarD3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53623w;
        if (obj3 instanceof n0) {
            cVar.I2();
            cVar.H2(cVar.f94293t, new av8.o(cVar, obj3));
            oki.h.v2(cVar.f94292s, TravelMilesFlightFinderScreenContract$ModalStep.DatePicker.f94284a, ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
