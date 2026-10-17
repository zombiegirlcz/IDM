package lk6;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment.OpenBankingBrPaymentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ljl.n1;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ OpenBankingBrPaymentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(OpenBankingBrPaymentScreen openBankingBrPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = openBankingBrPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0Var = (b0) this.u.d();
        b0Var.H2(b0Var.u, new n1(4));
        return Unit.f186387a;
    }
}
