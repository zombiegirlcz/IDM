package edg;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsPriceBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelHotelsPriceBreakdownScreen travelHotelsPriceBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsPriceBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.Q.getValue();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.a) dVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "TAXES_AND_FEES_ITEM_ID")) {
            com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.o;
            Object obj3 = model.o;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_travel_hotels_models.provider.HotelsInventoryProvider.Id");
            h.v2(aVar3, new TravelHotelsPriceBreakdownScreenContract$ModalStep.PartnerTaxesDisclaimer((fgi.a) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
