package mrl;

import com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp;
import h30.l;
import k4l.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import krl.s;
import le.u1;
import orl.o0;
import orl.q0;
import orl.s0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f208155a = r0.k(new Pair("COMBINED_BUYING_POWER", l0.COMBINED_BUYING_POWER), new Pair("HOLDING", l0.HOLDING), new Pair("POCKET", l0.POCKET));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final s a(TradingAutoTopUp tradingAutoTopUp) {
        Intrinsics.checkNotNullParameter(tradingAutoTopUp, "<this>");
        boolean z = tradingAutoTopUp instanceof TradingAutoTopUp.Pocket;
        ?? r110 = f208155a;
        if (z) {
            TradingAutoTopUp.Pocket pocket = (TradingAutoTopUp.Pocket) tradingAutoTopUp;
            return new s(u1.g(l0.POCKET, r110), pocket.f104657a, pocket.f104658b.f306286a);
        }
        if (tradingAutoTopUp instanceof TradingAutoTopUp.Holding) {
            TradingAutoTopUp.Holding holding = (TradingAutoTopUp.Holding) tradingAutoTopUp;
            return new s(u1.g(l0.HOLDING, r110), holding.f104655a, holding.f104656b.f306286a);
        }
        if (Intrinsics.f(tradingAutoTopUp, TradingAutoTopUp.CombinedBuyingPower.f104654a)) {
            return new s(u1.g(tradingAutoTopUp.getType(), r110), null, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TradingAutoTopUp b(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String type = sVar.getType();
        int iHashCode = type.hashCode();
        if (iHashCode != -1929606762) {
            if (iHashCode != 1598727548) {
                if (iHashCode == 1809744547 && type.equals("HOLDING")) {
                    String pocketId = sVar.getPocketId();
                    String currency = sVar.getCurrency();
                    if (currency == null) {
                        throw new IllegalStateException(l.r("Currency is null for type ", sVar.getType()));
                    }
                    xi0.b.Companion.getClass();
                    return new TradingAutoTopUp.Holding(pocketId, xi0.a.a(currency));
                }
            } else if (type.equals("COMBINED_BUYING_POWER")) {
                return TradingAutoTopUp.CombinedBuyingPower.f104654a;
            }
        } else if (type.equals("POCKET")) {
            String pocketId2 = sVar.getPocketId();
            if (pocketId2 == null) {
                throw new IllegalStateException(l.r("Pocket id is null for type ", sVar.getType()));
            }
            String currency2 = sVar.getCurrency();
            if (currency2 == null) {
                throw new IllegalStateException(l.r("Currency is null for type ", sVar.getType()));
            }
            xi0.b.Companion.getClass();
            return new TradingAutoTopUp.Pocket(pocketId2, xi0.a.a(currency2));
        }
        throw new IllegalStateException(l.r("Unknown type ", sVar.getType()));
    }

    public static final TradingAutoTopUp c(s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        if (s0Var instanceof orl.r0) {
            orl.r0 r0Var = (orl.r0) s0Var;
            String pocketId = r0Var.getPocketId();
            xi0.a aVar = xi0.b.Companion;
            String currency = r0Var.getCurrency();
            aVar.getClass();
            return new TradingAutoTopUp.Pocket(pocketId, xi0.a.a(currency));
        }
        if (!(s0Var instanceof q0)) {
            if (s0Var instanceof o0) {
                return TradingAutoTopUp.CombinedBuyingPower.f104654a;
            }
            throw new NoWhenBranchMatchedException();
        }
        q0 q0Var = (q0) s0Var;
        String pocketId2 = q0Var.getPocketId();
        xi0.a aVar2 = xi0.b.Companion;
        String currency2 = q0Var.getCurrency();
        aVar2.getClass();
        return new TradingAutoTopUp.Holding(pocketId2, xi0.a.a(currency2));
    }
}
