package oo2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import om4.l3;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ BankAccountSwitchingPaymentsReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bankAccountSwitchingPaymentsReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.u.d();
        pVar.H2(pVar.f227004p, new l3(25));
        pVar.l2(new omg.e(pVar, null, 3), new yi5.b(26));
        return Unit.f186387a;
    }
}
