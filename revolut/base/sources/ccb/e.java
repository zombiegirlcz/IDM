package ccb;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ MoneyBoxAmountInputScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MoneyBoxAmountInputScreen moneyBoxAmountInputScreen, Continuation continuation) {
        super(2, continuation);
        this.u = moneyBoxAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0Var = (c0) this.u.T2();
        c0Var.getClass();
        c0Var.l2(new z(c0Var, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
