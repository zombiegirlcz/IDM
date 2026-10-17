package o3b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cfd.impl.screens.exitstrategies.CfdExitStrategiesSetUpController;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o3b.r;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdExitStrategiesSetUpController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdExitStrategiesSetUpController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        s sVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        Intrinsics.h(model);
        n0 n0Var = (n0) oVarE3;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        v vVar = obj3 instanceof v ? (v) obj3 : null;
        if (vVar != null) {
            k4l.n0 n0Var2 = vVar.f221772a;
            j60.a.v(n0Var.f221746p, false, null, 3);
            if (!model.J()) {
                int i = j0.f221738a[n0Var2.ordinal()];
                if (i == 1) {
                    sVar = ((t) ((j2) n0Var.getState().f22677a).getValue()).i;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVar = ((t) ((j2) n0Var.getState().f22677a).getValue()).f221769j;
                }
                Pair pair = (sVar == null || !Intrinsics.f(sVar.f221763c, r.a.f221760a) || sVar.d) ? new Pair(n0.J2(n0Var, n0Var2), Boolean.TRUE) : new Pair(n0Var.L2(n0Var2, vVar.f221773b, sVar.f221762b), Boolean.FALSE);
                TradingOrderExitStrategy tradingOrderExitStrategy = (TradingOrderExitStrategy) pair.f186385a;
                Boolean bool = (Boolean) pair.f186386b;
                bool.getClass();
                k4l.n0 n0Var3 = vVar.f221772a;
                u uVar = vVar.f221773b;
                Boolean bool2 = Boolean.FALSE;
                n0Var.M2(n0Var3, tradingOrderExitStrategy, uVar, bool, bool2, bool2);
            }
        }
        return Unit.f186387a;
    }
}
