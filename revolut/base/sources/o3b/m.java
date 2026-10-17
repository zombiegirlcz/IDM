package o3b;

import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import com.revolut.feature.retail.cfd.impl.screens.exitstrategies.CfdExitStrategiesSetUpController;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdExitStrategiesSetUpController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdExitStrategiesSetUpController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((AmountInputActionsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object price;
        Pair pair;
        AmountInputActionsDelegate.Model model = (AmountInputActionsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        Intrinsics.h(model);
        n0 n0Var = (n0) oVarE3;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        w wVar = model.f;
        k4l.n0 n0Var2 = wVar.f221774a;
        s sVar = wVar.f221775b;
        if (sVar.e) {
            pair = new Pair(n0.J2(n0Var, n0Var2), Boolean.TRUE);
        } else {
            TradingOrderExitStrategy tradingOrderExitStrategyL2 = n0Var.L2(n0Var2, sVar.f221761a, sVar.f221762b);
            if (tradingOrderExitStrategyL2 instanceof TradingOrderExitStrategy.Amount) {
                ej0.b bVar = ((TradingOrderExitStrategy.Amount) tradingOrderExitStrategyL2).f104662a;
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                ej0.b targetAmount = mif.a.u(bVar, new ej0.b(ONE, bVar.f126704b));
                Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
                price = new TradingOrderExitStrategy.Amount(targetAmount);
            } else if (tradingOrderExitStrategyL2 instanceof TradingOrderExitStrategy.Distance) {
                BigDecimal distance = ((TradingOrderExitStrategy.Distance) tradingOrderExitStrategyL2).f104663a.add(new BigDecimal("0.001"));
                Intrinsics.checkNotNullExpressionValue(distance, "add(...)");
                Intrinsics.checkNotNullParameter(distance, "distance");
                price = new TradingOrderExitStrategy.Distance(distance);
            } else {
                if (!(tradingOrderExitStrategyL2 instanceof TradingOrderExitStrategy.Price)) {
                    throw new NoWhenBranchMatchedException();
                }
                ej0.b bVar2 = ((TradingOrderExitStrategy.Price) tradingOrderExitStrategyL2).f104664a;
                BigDecimal bigDecimal = (BigDecimal) n0Var.D.getValue();
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "<get-instrumentPriceDecimalDigitsUnit>(...)");
                BigDecimal TEN = BigDecimal.TEN;
                Intrinsics.checkNotNullExpressionValue(TEN, "TEN");
                BigDecimal bigDecimalMultiply = bigDecimal.multiply(TEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                ej0.b targetPrice = mif.a.u(bVar2, new ej0.b(bigDecimalMultiply, bVar2.f126704b));
                Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
                price = new TradingOrderExitStrategy.Price(targetPrice);
            }
            pair = new Pair(price, Boolean.FALSE);
        }
        TradingOrderExitStrategy tradingOrderExitStrategy = (TradingOrderExitStrategy) pair.f186385a;
        Boolean bool = (Boolean) pair.f186386b;
        bool.getClass();
        k4l.n0 n0Var3 = wVar.f221774a;
        Boolean bool2 = Boolean.FALSE;
        n0.N2(n0Var, n0Var3, tradingOrderExitStrategy, null, bool, bool2, bool2, 4);
        n0Var.f221751w.Q();
        return Unit.f186387a;
    }
}
