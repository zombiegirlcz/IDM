package f4l;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import e4l.c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4l.m0;
import k4l.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f132250a = r0.k(new Pair("SUCCESS", m0.SUCCESS), new Pair("PENDING", m0.PENDING), new Pair("FAILURE", m0.FAILURE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f132251b = r0.k(new Pair("TAKE_PROFIT", n0.TAKE_PROFIT), new Pair("STOP_LOSS", n0.STOP_LOSS));

    public static final TradingOrderExitStrategies a(e4l.b bVar) {
        m0 m0Var;
        ArrayList arrayList;
        List<String> allowed;
        n0 n0Var;
        String requestedChangesState;
        m0 m0Var2;
        c stopLoss;
        c takeProfit;
        TradingOrderExitStrategy tradingOrderExitStrategyB = (bVar == null || (takeProfit = bVar.getTakeProfit()) == null) ? null : b(takeProfit);
        TradingOrderExitStrategy tradingOrderExitStrategyB2 = (bVar == null || (stopLoss = bVar.getStopLoss()) == null) ? null : b(stopLoss);
        String orderId = bVar != null ? bVar.getOrderId() : null;
        if (bVar == null || (requestedChangesState = bVar.getRequestedChangesState()) == null) {
            m0Var = null;
        } else {
            m0[] m0VarArrValues = m0.values();
            int length = m0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    m0Var2 = null;
                    break;
                }
                m0Var2 = m0VarArrValues[i];
                if (a0.z(m0Var2.name(), requestedChangesState, true)) {
                    break;
                }
                i++;
            }
            m0Var = m0Var2;
        }
        if (bVar == null || (allowed = bVar.getAllowed()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str : allowed) {
                n0[] n0VarArrValues = n0.values();
                int length2 = n0VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        n0Var = null;
                        break;
                    }
                    n0Var = n0VarArrValues[i2];
                    if (a0.z(n0Var.name(), str, true)) {
                        break;
                    }
                    i2++;
                }
                if (n0Var != null) {
                    arrayList.add(n0Var);
                }
            }
        }
        return new TradingOrderExitStrategies(tradingOrderExitStrategyB, tradingOrderExitStrategyB2, orderId, m0Var, arrayList);
    }

    public static final TradingOrderExitStrategy b(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (Intrinsics.f(cVar.getType(), "AMOUNT") && cVar.getValue() != null) {
            return new TradingOrderExitStrategy.Amount(cj9.c.Q(cVar.getValue()));
        }
        if (Intrinsics.f(cVar.getType(), "DISTANCE") && cVar.getDistance() != null) {
            return new TradingOrderExitStrategy.Distance(new BigDecimal(cVar.getDistance()));
        }
        if (!Intrinsics.f(cVar.getType(), "PRICE") || cVar.getValue() == null) {
            return null;
        }
        return new TradingOrderExitStrategy.Price(cj9.c.Q(cVar.getValue()));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public static final e4l.b c(TradingOrderExitStrategies tradingOrderExitStrategies) {
        Intrinsics.checkNotNullParameter(tradingOrderExitStrategies, "<this>");
        TradingOrderExitStrategy tradingOrderExitStrategy = tradingOrderExitStrategies.f104659a;
        ArrayList arrayList = null;
        c cVarD = tradingOrderExitStrategy != null ? d(tradingOrderExitStrategy) : null;
        TradingOrderExitStrategy tradingOrderExitStrategy2 = tradingOrderExitStrategies.f104660b;
        c cVarD2 = tradingOrderExitStrategy2 != null ? d(tradingOrderExitStrategy2) : null;
        String str = tradingOrderExitStrategies.f104661c;
        m0 m0Var = tradingOrderExitStrategies.d;
        String strG = m0Var != null ? u1.g(m0Var, f132250a) : null;
        List list = tradingOrderExitStrategies.e;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(u1.g((n0) it8.next(), f132251b));
            }
        }
        return new e4l.b(cVarD, cVarD2, str, strG, arrayList);
    }

    public static final c d(TradingOrderExitStrategy tradingOrderExitStrategy) {
        String str;
        String string;
        Intrinsics.checkNotNullParameter(tradingOrderExitStrategy, "<this>");
        boolean z = tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Amount;
        if (z) {
            str = "AMOUNT";
        } else if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Distance) {
            str = "DISTANCE";
        } else {
            if (!(tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Price)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "PRICE";
        }
        boolean z3 = tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Distance;
        ko3.a aVarW = null;
        if (z3) {
            string = ((TradingOrderExitStrategy.Distance) tradingOrderExitStrategy).f104663a.toString();
        } else {
            if (!z && !(tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Price)) {
                throw new NoWhenBranchMatchedException();
            }
            string = null;
        }
        if (z) {
            aVarW = cj9.c.W(((TradingOrderExitStrategy.Amount) tradingOrderExitStrategy).f104662a);
        } else if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Price) {
            aVarW = cj9.c.W(((TradingOrderExitStrategy.Price) tradingOrderExitStrategy).f104664a);
        } else if (!z3) {
            throw new NoWhenBranchMatchedException();
        }
        return new c(str, string, aVarW);
    }
}
