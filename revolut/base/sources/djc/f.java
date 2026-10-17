package djc;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ RentAndBillsManageLinkedPaymentsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = rentAndBillsManageLinkedPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0Var = (b0) this.u.R2();
        b0Var.H2(b0Var.f115296x, new dg3.d(9));
        b0Var.f115295w.a();
        return Unit.f186387a;
    }
}
