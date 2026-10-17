package bbg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsAmendmentConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelHotelsAmendmentConfirmationScreen travelHotelsAmendmentConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsAmendmentConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID")) {
            Object content = ((j) ((j2) aVar2.D.f22677a).getValue()).e.getContent();
            ecg.b bVar = content instanceof ecg.b ? (ecg.b) content : null;
            if (bVar != null && (dVar = bVar.f124728a) != null) {
                oki.h.v2(aVar2.E, new TravelHotelsAmendmentConfirmationScreenContract$ModalStep.RevPayPocketSelection(dVar), ModalDestination.Style.POPUP.f98311a);
            }
        }
        return Unit.f186387a;
    }
}
