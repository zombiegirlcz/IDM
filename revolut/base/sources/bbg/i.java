package bbg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsAmendmentConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelHotelsAmendmentConfirmationScreen travelHotelsAmendmentConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsAmendmentConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "RESERVE_WITH_CARD_SUBHEADER_ITEM_ID")) {
            Object obj3 = model.f52715m;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment.Card");
            oki.h.v2(aVar2.E, new TravelHotelsAmendmentConfirmationScreenContract$ModalStep.CardSelection((PropertyPayment$Card) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
