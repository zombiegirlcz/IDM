package zjh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashBalanceController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CashBalanceController cashBalanceController, Continuation continuation) {
        super(2, continuation);
        this.v = cashBalanceController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.wealth.ui.impl.cash_balance.b bVar = (com.revolut.feature.wealth.ui.impl.cash_balance.b) pVarK3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        n nVar = obj3 instanceof n ? (n) obj3 : null;
        if (nVar != null) {
            bVar.I2(nVar);
        }
        return Unit.f186387a;
    }
}
