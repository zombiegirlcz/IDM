package i2l;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelStatusPartnerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TravelStatusPartnerScreen travelStatusPartnerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelStatusPartnerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarE3 = this.v.R2();
        Object obj3 = model.u;
        m0 m0Var = (m0) yVarE3;
        m0Var.getClass();
        if (obj3 instanceof a3) {
            m0Var.C1(new TransactionDetailsDestination(ofm.q.P((a3) obj3), (rhf.d) null, 6));
        }
        return Unit.f186387a;
    }
}
