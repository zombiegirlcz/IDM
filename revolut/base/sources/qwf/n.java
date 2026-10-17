package qwf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreenContract$InputData;
import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransitCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TransitCheckoutScreen transitCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transitCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVarU;
        TransitTicketRevPointOption transitTicketRevPointOption;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarH3 = this.v.T2();
        Intrinsics.h(model);
        z zVar = (z) qVarH3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "PASSENGER_DETAILS_CELL_ID")) {
            yji.l.j2(zVar, new PassengerDetailsScreen(new PassengerDetailsScreenContract$InputData(((o) zVar.t2()).f249916a.f92713m, ((o) zVar.t2()).f249918c.f266203a)), null, new s(zVar, 1), 1);
        } else if (Intrinsics.f(str, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID")) {
            u6c.t tVar = u6c.t.TRANSPORT;
            o oVar = (o) zVar.t2();
            p pVar = (p) oVar.f249919g.getContent();
            if (pVar == null || (transitTicketRevPointOption = pVar.f249923b) == null || (dVarU = transitTicketRevPointOption.getFiatAmount()) == null) {
                dVarU = pyd.c.U(oVar.f249916a.k, oVar.f249917b);
            }
            dj0.d dVar = dVarU;
            Object content = ((o) zVar.t2()).f249920h.getContent();
            ivf.f fVar = content instanceof ivf.f ? (ivf.f) content : null;
            zVar.f2(zVar.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(tVar, dVar, fVar != null ? fVar.f168845a : null, null, null, null, null, null, null, false, 2040))), ModalDestination.Style.POPUP.f98311a, new s(zVar, 0));
        }
        return Unit.f186387a;
    }
}
