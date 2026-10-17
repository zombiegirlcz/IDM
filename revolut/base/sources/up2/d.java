package up2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ BankAccountSwitchingReviewOutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bankAccountSwitchingReviewOutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar2 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) this.u.R2();
        aVar2.H2(aVar2.f64058s, new umc.c(16));
        aVar2.l2(new n(aVar2, null, 0), new k(aVar2, 0));
        return Unit.f186387a;
    }
}
