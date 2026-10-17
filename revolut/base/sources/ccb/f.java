package ccb;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoneyBoxAmountInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MoneyBoxAmountInputScreen moneyBoxAmountInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moneyBoxAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarT2 = this.v.T2();
        bw0.m mVar = model.e;
        c0 c0Var = (c0) pVarT2;
        c0Var.getClass();
        c0Var.l2(new b0(0, c0Var, null), new c8i.c(26));
        return Unit.f186387a;
    }
}
