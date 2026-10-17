package k3k;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ RemittanceAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(RemittanceAmountScreen remittanceAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = remittanceAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t0 t0Var = (t0) this.u.T2();
        t0Var.getClass();
        t0Var.l2(new l0(t0Var, null, 1), new yi5.b(26));
        return Unit.f186387a;
    }
}
