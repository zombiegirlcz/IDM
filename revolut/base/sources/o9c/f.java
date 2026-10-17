package o9c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.shared.R$string;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ RevolutPaySummaryScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevolutPaySummaryScreen revolutPaySummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revolutPaySummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ShippingContact shippingContact;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.u.R2();
        pec.o oVar = fVar.f84578y;
        cli.y yVar = fVar.M;
        pec.e eVar = (pec.e) ((s) ((j2) yVar.f22677a).getValue()).f223228g.getContent();
        do3.n nVar = (do3.n) ((s) ((j2) yVar.f22677a).getValue()).d.getContent();
        String str = null;
        Address address = nVar != null ? nVar.k : null;
        uec.e eVar2 = (uec.e) oVar;
        eVar2.getClass();
        boolean z = eVar instanceof pec.c;
        if (z && ((pec.c) eVar).f235361a == null) {
            eVar2.N2(eVar2.o2(new th1.a(new AddressFlowContract$InputData(address, new TextLocalisedClause(R$string.revolut_pay_order_summary_add_address, null, null, 14), null, false, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_save, null, null, 14), null, null, null, false, null, 2097076), null, null, 6)), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new ud3.n(eVar2, 5));
        } else {
            if (eVar instanceof pec.d) {
                str = ((pec.d) eVar).f235362a.f84740a;
            } else if (z && (shippingContact = ((pec.c) eVar).f235361a) != null) {
                str = shippingContact.f84740a;
            }
            eVar2.d3(str);
        }
        return Unit.f186387a;
    }
}
