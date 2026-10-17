package i2l;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelStatusPartnerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TravelStatusPartnerScreen travelStatusPartnerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelStatusPartnerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarE3 = this.v.R2();
        String listId = model.f52373a;
        m0 m0Var = (m0) yVarE3;
        m0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            m0Var.n2(new i0(2, m0Var, null), new whi.b(6));
        } else if (Intrinsics.f(listId, "travel_status_partner_transactions_error")) {
            m0Var.f158031x.k(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
