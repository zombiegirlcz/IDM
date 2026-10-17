package k3k;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u5k.a;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RemittanceAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(RemittanceAmountScreen remittanceAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = remittanceAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarT2 = this.v.T2();
        Object obj3 = model.i;
        Continuation continuation = null;
        u5k.a aVar2 = obj3 instanceof u5k.a ? (u5k.a) obj3 : null;
        t0 t0Var = (t0) b0VarT2;
        t0Var.getClass();
        if (Intrinsics.f(aVar2, a.AbstractC1534a.C1535a.f277458a)) {
            t0Var.l2(new l0(t0Var, continuation, 1), new yi5.b(26));
        } else {
            if (aVar2 instanceof u5k.b) {
                throw null;
            }
            t0Var.l2(new h0(t0Var, null), new yi5.b(26));
        }
        j60.a.v(t0Var.E, false, null, 3);
        return Unit.f186387a;
    }
}
