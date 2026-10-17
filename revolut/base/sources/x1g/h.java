package x1g;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l71.d dVar;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e eVar;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        Intrinsics.h(model);
        c0 c0Var = (c0) mVarE3;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "EXCHANGE_RATE_ITEM_ID")) {
            cli.y yVar = c0Var.I;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            Quote quote = (Quote) ((i) j2Var.getValue()).f302425m.getContent();
            if (quote != null && (dVar = (l71.d) ((i) j2Var2.getValue()).f302426n.getContent()) != null) {
                dj0.d dVarA = p.a((i) j2Var2.getValue());
                PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) ((i) j2Var2.getValue()).f302424l.getContent();
                if (pocket != null && (eVar = pocket.f84379g) != null) {
                    yji.l.j2(c0Var, c0Var.e1(new w6c.k(new PaymentBreakdownControllerDescriptor$InputData(quote, dVarA, w6c.j.PAYMENT, new PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default(eVar, hb9.b.C(dVar.a()))))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                }
            }
        }
        return Unit.f186387a;
    }
}
