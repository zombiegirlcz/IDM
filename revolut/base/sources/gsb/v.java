package gsb;

import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d9.e1;
import java.math.BigDecimal;
import k4l.e0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bsl.c f146369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qy5.a f146370b;

    public v(bsl.c orderLimitsInteractor, zrb.a sourcePocketWrapperBuilder, qy5.a stateDetailsValidator) {
        Intrinsics.checkNotNullParameter(orderLimitsInteractor, "orderLimitsInteractor");
        Intrinsics.checkNotNullParameter(sourcePocketWrapperBuilder, "sourcePocketWrapperBuilder");
        Intrinsics.checkNotNullParameter(stateDetailsValidator, "stateDetailsValidator");
        this.f146369a = orderLimitsInteractor;
        this.f146370b = stateDetailsValidator;
    }

    @Override // gsb.b
    public final t a(bfl.g tradeSide, qrb.b inputType, qrb.k tradeInstrumentData, qrb.e quote) {
        BigDecimal bigDecimal;
        Amount amountV;
        boolean zF;
        dj0.d dVar;
        SourcePocketWrapper sourcePocketWrapper;
        qrb.a aVar;
        Amount amount;
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        Intrinsics.checkNotNullParameter(quote, "quote");
        if (!(tradeInstrumentData instanceof qrb.j)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(quote instanceof qrb.d)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        qrb.d dVar2 = (qrb.d) quote;
        OrderQuote orderQuote = dVar2.f248684a;
        if (!e1.I(e1.m(orderQuote).f104717a)) {
            t tVarR = null;
            qrb.i iVar = tradeInstrumentData instanceof qrb.i ? (qrb.i) tradeInstrumentData : null;
            if (iVar == null || (aVar = iVar.f) == null || (amount = aVar.f248682b) == null || (bigDecimal = amount.f104717a) == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            e0 e0VarB = tradeInstrumentData.b();
            if (e0VarB != null) {
                Intrinsics.h(bigDecimal2);
                qrb.j tradeInstrumentData2 = (qrb.j) tradeInstrumentData;
                int i = u.f146368a[orderQuote.f104753b.ordinal()];
                if (i == 1) {
                    amountV = e1.v(orderQuote);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    amountV = e1.u(orderQuote);
                }
                Amount amountM = e1.m(orderQuote);
                r0 r0Var = r0.MARKET;
                OrderQuote orderQuote2 = dVar2.f248685b;
                Amount amountM2 = orderQuote2 != null ? e1.m(orderQuote2) : null;
                Intrinsics.checkNotNullParameter(tradeInstrumentData2, "tradeInstrumentData");
                if (tradeInstrumentData2 instanceof qrb.h) {
                    qrb.h hVar = (qrb.h) tradeInstrumentData2;
                    TradingAccount tradingAccount = hVar.f248694c;
                    nel.n nVar = hVar.d;
                    SourcePocket sourcePocket = hVar.f248692a;
                    if (sourcePocket instanceof SourcePocket.Holding) {
                        zF = Intrinsics.f(((SourcePocket.Holding) sourcePocket).f91776a.f183148a.f183146b, com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString());
                    } else if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
                        zF = Intrinsics.f(((SourcePocket.InvestAccountCombinedBuyingPower) sourcePocket).f91781b.getF105262a(), tradingAccount.getF105262a());
                    } else {
                        if (!(sourcePocket instanceof SourcePocket.Pocket) && !(sourcePocket instanceof SourcePocket.VaultWrapper) && !(sourcePocket instanceof SourcePocket.Savings)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zF = false;
                    }
                    SourcePocket.Balance e = sourcePocket.getE();
                    if (e instanceof SourcePocket.Balance.MoneyBalance) {
                        dVar = ((SourcePocket.Balance.MoneyBalance) e).f91775a;
                    } else {
                        if (e != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = new dj0.d(0L, nVar.i);
                    }
                    sourcePocketWrapper = new SourcePocketWrapper(sourcePocket, l4i.a.e(dVar), Intrinsics.f(dVar.f115083b, nVar.i), zF);
                } else {
                    sourcePocketWrapper = null;
                }
                k4l.q qVarA = this.f146369a.a(tradeSide, amountV, amountM, bigDecimal2, e0VarB, r0Var, amountM2, null, sourcePocketWrapper);
                if (qVarA.e || qVarA.f) {
                    tVarR = m.f146362a;
                } else if (!qVarA.f180995a) {
                    tVarR = new p(e0VarB.e);
                } else if (!qVarA.f180996b) {
                    tVarR = new n(e0VarB.f);
                } else if (!qVarA.f180997c) {
                    tVarR = new o(e0VarB.f180956g);
                } else if (qVarA.f180998g) {
                    tVarR = r.f146367a;
                }
            } else {
                tVarR = this.f146370b.r(tradeInstrumentData.n().f, tradeInstrumentData.n().f214608t);
            }
            if (tVarR != null) {
                return tVarR;
            }
        }
        return q.f146366a;
    }
}
