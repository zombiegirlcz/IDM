package pqg;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddMoneyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AddMoneyScreen addMoneyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarT2 = this.v.T2();
        bw0.m mVar = model.f;
        i0 i0Var = (i0) rVarT2;
        i0Var.getClass();
        i0Var.l2(new pnf.f(i0Var, mVar, null, 8), new plc.i(1, i0Var, i0.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 17));
        return Unit.f186387a;
    }
}
