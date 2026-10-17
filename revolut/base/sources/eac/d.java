package eac;

import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeController;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutPayManagementHomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevolutPayManagementHomeController revolutPayManagementHomeController, Continuation continuation) {
        super(2, continuation);
        this.v = revolutPayManagementHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RewardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RewardDelegate.Model model = (RewardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        Object obj3 = model.f53195h;
        com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar2 = (com.revolut.feature.revolutpay.management.impl.ui.management.home.a) iVarE3;
        if (obj3 instanceof PromotedMerchant) {
            ((occ.m) aVar2.o).Z2((PromotedMerchant) obj3);
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
