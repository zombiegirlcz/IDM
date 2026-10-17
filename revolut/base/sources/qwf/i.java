package qwf;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransitCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TransitCheckoutScreen transitCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transitCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVarU;
        TransitTicketRevPointOption transitTicketRevPointOption;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarH3 = this.v.T2();
        Object obj3 = model.o;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote");
        Quote parcel = (Quote) obj3;
        z zVar = (z) qVarH3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        o oVar = (o) zVar.t2();
        p pVar = (p) oVar.f249919g.getContent();
        if (pVar == null || (transitTicketRevPointOption = pVar.f249923b) == null || (dVarU = transitTicketRevPointOption.getFiatAmount()) == null) {
            dVarU = pyd.c.U(oVar.f249916a.k, oVar.f249917b);
        }
        yji.l.j2(zVar, zVar.e1(new w6c.k(new PaymentBreakdownControllerDescriptor$InputData(parcel, dVarU, w6c.j.PAYMENT, PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Empty.f84440a))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
