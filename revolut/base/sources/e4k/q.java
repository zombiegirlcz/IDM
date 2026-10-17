package e4k;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u5k.a;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BankTransferAmountScreen bankTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h0 h0VarK3 = this.v.T2();
        Object obj3 = model.i;
        u5k.a aVar2 = obj3 instanceof u5k.a ? (u5k.a) obj3 : null;
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar3 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) h0VarK3;
        aVar3.getClass();
        if (Intrinsics.f(aVar2, a.AbstractC1534a.C1535a.f277458a)) {
            aVar3.D2();
        } else {
            if (aVar2 instanceof u5k.b) {
                throw null;
            }
            aVar3.l2(new v0(aVar3, null), new yi5.b(26));
        }
        j60.a.v(aVar3.E, false, null, 3);
        return Unit.f186387a;
    }
}
