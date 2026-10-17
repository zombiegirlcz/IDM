package wbg;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(TravelHotelsCheckoutScreen travelHotelsCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l71.d dVar;
        dj0.d dVar2;
        PaymentMethod.Pocket pocket;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e eVar;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s0 s0VarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "EXCHANGE_RATE_ITEM_ID")) {
            cli.y yVar = aVar2.O;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            Quote quote = (Quote) ((g0) j2Var.getValue()).i.getContent();
            if (quote != null && (dVar = (l71.d) ((g0) j2Var2.getValue()).f296173j.getContent()) != null && (dVar2 = (dj0.d) ((g0) j2Var2.getValue()).f296170c.getContent()) != null) {
                Object content = ((g0) j2Var2.getValue()).e.getContent();
                ecg.g gVar = content instanceof ecg.g ? (ecg.g) content : null;
                if (gVar != null && (pocket = gVar.f124732a) != null && (eVar = pocket.f84379g) != null) {
                    oki.h.v2(aVar2.P, new TravelHotelsCheckoutScreenContract$ModalStep.BreakdownDisclaimer(quote, dVar.a(), dVar2, eVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
            }
        }
        return Unit.f186387a;
    }
}
