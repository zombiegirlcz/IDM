package bbg;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsAmendmentConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelHotelsAmendmentConfirmationScreen travelHotelsAmendmentConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsAmendmentConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l71.d dVar;
        ecg.e eVar;
        dj0.d dVar2;
        PaymentMethod.Pocket pocket;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e eVar2;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        if (Intrinsics.f(str, "EXCHANGE_RATE_ITEM_ID")) {
            cli.y yVar = aVar2.D;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            Quote quote = (Quote) ((j) j2Var.getValue()).f.getContent();
            if (quote != null && (dVar = (l71.d) ((j) j2Var2.getValue()).f14287j.getContent()) != null && (eVar = (ecg.e) ((j) j2Var2.getValue()).e.getContent()) != null) {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                ecg.b bVar = eVar instanceof ecg.b ? (ecg.b) eVar : null;
                if (bVar != null && (dVar2 = bVar.f124728a) != null) {
                    Object content = ((j) j2Var2.getValue()).d.getContent();
                    ecg.g gVar = content instanceof ecg.g ? (ecg.g) content : null;
                    if (gVar != null && (pocket = gVar.f124732a) != null && (eVar2 = pocket.f84379g) != null) {
                        oki.h.v2(aVar2.E, new TravelHotelsAmendmentConfirmationScreenContract$ModalStep.BreakdownDisclaimer(quote, dVar.a(), dVar2, eVar2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
            }
        } else if (Intrinsics.f(str, "AMENDMENT_REFUND_ITEM_ID")) {
            aVar2.M2();
        }
        return Unit.f186387a;
    }
}
