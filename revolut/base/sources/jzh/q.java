package jzh;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(OrderSummaryScreen orderSummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0VarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar2 = (com.revolut.feature_crypto_order_flow.impl.order_summary.a) f0VarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        cli.y yVar = aVar2.E;
        s sVar = ((r) ((j2) yVar.f22677a).getValue()).f179848b;
        if (Intrinsics.f(model.f51913a, "ID_INVEST_WEEKLY_SWITCHER") && (sVar instanceof u)) {
            aVar2.H2(yVar, new jud.d(sVar, 26));
        }
        return Unit.f186387a;
    }
}
