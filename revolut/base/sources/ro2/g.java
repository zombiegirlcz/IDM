package ro2;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rlh.d0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingPaymentScheduleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BankAccountSwitchingPaymentScheduleScreen bankAccountSwitchingPaymentScheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingPaymentScheduleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.R2();
        Object obj3 = model.f;
        kVarE3.getClass();
        qo2.c cVar = obj3 instanceof qo2.c ? (qo2.c) obj3 : null;
        if (cVar != null) {
            j60.a.v(kVarE3.o, false, null, 3);
            kVarE3.H2(kVarE3.f255818q, new d0(cVar, 10));
        }
        return Unit.f186387a;
    }
}
