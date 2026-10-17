package uyh;

import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderPocketInfo;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f284351a;

    public a1(gte.a featureToggleInteractor, fzh.a revPointsAmountFormatter) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsAmountFormatter, "revPointsAmountFormatter");
        this.f284351a = featureToggleInteractor;
    }

    public static Long b(wd6.h hVar, n9l.a aVar, kyh.g gVar, kyh.g gVar2, Long l2, xi0.b bVar, Long l3, xi0.b bVar2) {
        BigDecimal bigDecimalDivide;
        if (gVar == gVar2 || i26.l.D(hVar) || hVar == wd6.h.TAKE_PROFIT_STOP_LOSS) {
            return l2;
        }
        if (hVar != wd6.h.LIMIT && hVar != wd6.h.STOP) {
            throw new IllegalArgumentException("No amount logic defined for order type = " + hVar);
        }
        double d = aVar.f213663c;
        if (d == 0.0d || l3 == null) {
            return null;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        BigDecimal bigDecimal = new BigDecimal(l3.longValue());
        int iC = bVar2.c();
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = bigDecimal.setScale(iC, roundingMode);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        BigDecimal bigDecimalDivide2 = scale.divide(new BigDecimal(cp5.d.k(bVar2)), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
        if (bVar2.equals(aVar.f213661a)) {
            Intrinsics.h(bigDecimalValueOf);
            BigDecimal bigDecimalMultiply = bigDecimalValueOf.multiply(bigDecimalDivide2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimalDivide = bigDecimalMultiply.setScale(bVar.c(), roundingMode);
        } else {
            bigDecimalDivide = bigDecimalDivide2.divide(bigDecimalValueOf, bVar.c(), roundingMode);
        }
        Intrinsics.h(bigDecimalDivide);
        BigDecimal bigDecimalMultiply2 = bigDecimalDivide.multiply(new BigDecimal(cp5.d.k(bVar)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        return Long.valueOf(bigDecimalMultiply2.longValue());
    }

    public static Long c(a1 a1Var, CryptoOrderDraft cryptoOrderDraft, n9l.a aVar, kyh.g gVar, int i) {
        wd6.h hVar = cryptoOrderDraft.f;
        n9l.a aVar2 = (i & 4) != 0 ? new n9l.a(cryptoOrderDraft.f96689a.f96683a, cryptoOrderDraft.f96690b.f96683a, cryptoOrderDraft.f96700r, null, null, null) : aVar;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = cryptoOrderDraft.f96689a;
        Long l2 = cryptoExchangeContract$MoneyDetails.f96684b;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails2 = cryptoOrderDraft.f96690b;
        Long l3 = cryptoExchangeContract$MoneyDetails2.f96684b;
        xi0.b bVar = cryptoExchangeContract$MoneyDetails.f96683a;
        xi0.b bVar2 = cryptoExchangeContract$MoneyDetails2.f96683a;
        if ((i & 128) != 0) {
            gVar = cryptoOrderDraft.d;
        }
        a1Var.getClass();
        return b(hVar, aVar2, gVar, kyh.g.BOTTOM, l3, bVar2, l2, bVar);
    }

    public static CryptoExchangeContract$MoneyDetails d(a1 a1Var, CryptoOrderDraft cryptoOrderDraft, wd6.h hVar, Long l2, Long l3, xi0.b bVar, kyh.g gVar, boolean z, CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier, int i) {
        wd6.h hVar2 = (i & 2) != 0 ? cryptoOrderDraft.f : hVar;
        xi0.b bVar2 = (i & 16) != 0 ? cryptoOrderDraft.f96690b.f96683a : bVar;
        kyh.g gVar2 = (i & 32) != 0 ? cryptoOrderDraft.d : gVar;
        wd6.e eVar = cryptoOrderDraft.e;
        boolean z3 = (i & 128) != 0 ? cryptoOrderDraft.f96702t : true;
        boolean z4 = (i & 256) != 0 ? false : z;
        CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier2 = (i & 512) != 0 ? cryptoOrderDraft.f96690b.e : balanceIdentifier;
        a1Var.getClass();
        Long l4 = l3 == null ? cryptoOrderDraft.f96690b.f96684b : l3;
        Long l5 = l2 == null ? cryptoOrderDraft.f96689a.f96684b : l2;
        kyh.g gVar3 = kyh.g.BOTTOM;
        CryptoOrderPocketInfo cryptoOrderPocketInfo = cryptoOrderDraft.f96696m;
        long j2 = cryptoOrderPocketInfo != null ? cryptoOrderPocketInfo.d : 0L;
        kyh.g gVar4 = kyh.g.TOP;
        boolean z6 = eVar == wd6.e.BUY;
        Long l22 = l4;
        return new CryptoExchangeContract$MoneyDetails(bVar2, l22, a1Var.e(cryptoOrderDraft, hVar2, gVar2, l22, gVar3, j2, l5, gVar4, z6, z3, cryptoOrderDraft.i), z4, balanceIdentifier2);
    }

    public static Amount f(f8l.d dVar, xi0.b bVar) {
        Amount f104747b;
        Asset asset;
        Amount f104748c;
        Asset asset2;
        if (Intrinsics.f((dVar == null || (f104748c = dVar.getF104748c()) == null || (asset2 = f104748c.f104718b) == null) ? null : asset2.f104720b, bVar.f306286a)) {
            return dVar.getF104748c();
        }
        if (Intrinsics.f((dVar == null || (f104747b = dVar.getF104747b()) == null || (asset = f104747b.f104718b) == null) ? null : asset.f104720b, bVar.f306286a)) {
            return dVar.getF104747b();
        }
        return null;
    }

    public static Long g(a1 a1Var, CryptoOrderDraft cryptoOrderDraft, n9l.a aVar, kyh.g gVar, int i) {
        wd6.h hVar = cryptoOrderDraft.f;
        n9l.a aVar2 = (i & 4) != 0 ? new n9l.a(cryptoOrderDraft.f96689a.f96683a, cryptoOrderDraft.f96690b.f96683a, cryptoOrderDraft.f96700r, null, null, null) : aVar;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = cryptoOrderDraft.f96689a;
        Long l2 = cryptoExchangeContract$MoneyDetails.f96684b;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails2 = cryptoOrderDraft.f96690b;
        Long l3 = cryptoExchangeContract$MoneyDetails2.f96684b;
        xi0.b bVar = cryptoExchangeContract$MoneyDetails.f96683a;
        xi0.b bVar2 = cryptoExchangeContract$MoneyDetails2.f96683a;
        if ((i & 128) != 0) {
            gVar = cryptoOrderDraft.d;
        }
        a1Var.getClass();
        return b(hVar, aVar2, gVar, kyh.g.TOP, l2, bVar, l3, bVar2);
    }

    public static CryptoExchangeContract$MoneyDetails h(a1 a1Var, CryptoOrderDraft cryptoOrderDraft, wd6.h hVar, Long l2, Long l3, kyh.g gVar, boolean z, int i) {
        wd6.h hVar2 = (i & 2) != 0 ? cryptoOrderDraft.f : hVar;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = cryptoOrderDraft.f96689a;
        xi0.b bVar = cryptoExchangeContract$MoneyDetails.f96683a;
        kyh.g gVar2 = (i & 32) != 0 ? cryptoOrderDraft.d : gVar;
        wd6.e eVar = cryptoOrderDraft.e;
        boolean z3 = (i & 128) != 0 ? cryptoOrderDraft.f96702t : true;
        boolean z4 = (i & 256) != 0 ? false : z;
        CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier = cryptoExchangeContract$MoneyDetails.e;
        a1Var.getClass();
        Long l4 = l2 == null ? cryptoOrderDraft.f96689a.f96684b : l2;
        kyh.g gVar3 = gVar2;
        Long l5 = l4;
        return new CryptoExchangeContract$MoneyDetails(bVar, l5, a1Var.e(cryptoOrderDraft, hVar2, gVar3, l5, kyh.g.TOP, cryptoOrderDraft.f96694j, l3 == null ? cryptoOrderDraft.f96690b.f96684b : l3, kyh.g.BOTTOM, eVar == wd6.e.SELL, z3, cryptoOrderDraft.i), z4, balanceIdentifier);
    }

    public static CryptoOrderDraft i(CryptoOrderDraft draft, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        TakeProfitStopLoss takeProfitStopLoss = draft.f96697n;
        return CryptoOrderDraft.a(draft, null, null, null, null, null, null, null, null, 0L, false, 0L, null, new TakeProfitStopLoss(z, takeProfitStopLoss != null ? takeProfitStopLoss.f72160b : null, takeProfitStopLoss != null ? takeProfitStopLoss.f72161c : null), null, null, null, 0.0d, null, false, null, 4186111);
    }

    public static CryptoOrderDraft j(a1 a1Var, CryptoOrderDraft cryptoOrderDraft, Long l2, Long l3, boolean z, boolean z3, int i) {
        return CryptoOrderDraft.a(cryptoOrderDraft, h(a1Var, cryptoOrderDraft, null, l2, l3, null, (i & 4) != 0 ? false : z, 626), d(a1Var, cryptoOrderDraft, null, l2, l3, null, null, (i & 8) != 0 ? false : z3, null, 626), null, null, null, null, null, null, 0L, false, 0L, null, null, null, null, null, 0.0d, null, true, null, 3670012);
    }

    public final CryptoOrderDraft a(CryptoOrderDraft draft, OrderQuote quote, l4i.a amountConverter) {
        Amount amount;
        dj0.d dVar;
        wd6.h hVar;
        boolean z;
        kyh.i iVar;
        Amount amount2;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        f8l.b bVar = quote.f104753b;
        Amount amount3 = quote.e;
        Amount amount4 = quote.f;
        Amount amount5 = quote.f104754c;
        Amount amount6 = quote.d;
        int[] iArr = z0.f284426a;
        int i = iArr[bVar.ordinal()];
        if (i == 1) {
            amount = amount4 == null ? amount3 : amount4;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amount = amount6 == null ? amount5 : amount6;
        }
        dj0.d dVarB = fzh.a.b(amount, amountConverter);
        int i2 = iArr[quote.f104753b.ordinal()];
        if (i2 == 1) {
            amount3 = amount6 == null ? amount5 : amount6;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (amount4 != null) {
                amount3 = amount4;
            }
        }
        dj0.d dVarB2 = fzh.a.b(amount3, amountConverter);
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = draft.f96689a;
        wd6.e eVar = draft.e;
        xi0.b bVar2 = dVarB.f115083b;
        long j2 = dVarB.f115082a;
        Long lValueOf = Long.valueOf(j2);
        wd6.h hVar2 = draft.f;
        kyh.g gVar = draft.d;
        Long lValueOf2 = Long.valueOf(j2);
        kyh.g gVar2 = kyh.g.TOP;
        long j3 = draft.f96694j;
        long j5 = dVarB2.f115082a;
        Long lValueOf3 = Long.valueOf(j5);
        kyh.g gVar3 = kyh.g.BOTTOM;
        if (eVar == wd6.e.SELL) {
            dVar = dVarB2;
            hVar = hVar2;
            z = true;
        } else {
            dVar = dVarB2;
            hVar = hVar2;
            z = false;
        }
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetailsA = CryptoExchangeContract$MoneyDetails.a(cryptoExchangeContract$MoneyDetails, bVar2, lValueOf, e(draft, hVar, gVar, lValueOf2, gVar2, j3, lValueOf3, gVar3, z, false, quote.f104756h));
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails2 = draft.f96690b;
        xi0.b bVar3 = dVar.f115083b;
        Long lValueOf4 = Long.valueOf(j5);
        wd6.h hVar3 = draft.f;
        kyh.g gVar4 = draft.d;
        Long lValueOf5 = Long.valueOf(j5);
        CryptoOrderPocketInfo cryptoOrderPocketInfo = draft.f96696m;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetailsA2 = CryptoExchangeContract$MoneyDetails.a(cryptoExchangeContract$MoneyDetails2, bVar3, lValueOf4, e(draft, hVar3, gVar4, lValueOf5, gVar3, cryptoOrderPocketInfo != null ? cryptoOrderPocketInfo.d : 0L, Long.valueOf(j2), gVar2, eVar == wd6.e.BUY, false, quote.f104756h));
        OrderRate orderRate = quote.f104757j;
        BigDecimal bigDecimal = orderRate.f104793b;
        BigDecimal bigDecimal2 = orderRate.f104792a;
        ChargeBreakdown chargeBreakdown = quote.f104755g.f104731a;
        dj0.d dVarB3 = null;
        if (chargeBreakdown.f104723b.isEmpty()) {
            chargeBreakdown = null;
        }
        if (chargeBreakdown != null && (amount2 = chargeBreakdown.f104722a) != null) {
            dVarB3 = fzh.a.b(amount2, amountConverter);
        }
        int i3 = iArr[quote.f104752a.ordinal()];
        if (i3 == 1) {
            iVar = kyh.i.CREDIT;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = kyh.i.COST;
        }
        return CryptoOrderDraft.a(draft, cryptoExchangeContract$MoneyDetailsA, cryptoExchangeContract$MoneyDetailsA2, null, null, null, bigDecimal2, bigDecimal, quote.f104756h, 0L, false, 0L, null, null, dVarB3, iVar, quote, 0.0d, Long.valueOf(quote.i), false, null, 3292732);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kyh.f e(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r25, wd6.h r26, kyh.g r27, java.lang.Long r28, kyh.g r29, long r30, java.lang.Long r32, kyh.g r33, boolean r34, boolean r35, java.util.List r36) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uyh.a1.e(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, wd6.h, kyh.g, java.lang.Long, kyh.g, long, java.lang.Long, kyh.g, boolean, boolean, java.util.List):kyh.f");
    }

    public final CryptoOrderDraft k(CryptoOrderDraft draft, xi0.b currencyBottom, CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(currencyBottom, "currencyBottom");
        Intrinsics.checkNotNullParameter(balanceIdentifier, "balanceIdentifier");
        kyh.g gVar = draft.d;
        Long l2 = gVar == kyh.g.BOTTOM ? 0L : null;
        Long l3 = gVar == kyh.g.TOP ? 0L : null;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetailsH = h(this, draft, null, l2, l3, null, false, 1010);
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetailsD = d(this, draft, null, l2, l3, currencyBottom, null, false, balanceIdentifier, 482);
        TakeProfitStopLoss takeProfitStopLoss = draft.f96697n;
        return CryptoOrderDraft.a(draft, cryptoExchangeContract$MoneyDetailsH, cryptoExchangeContract$MoneyDetailsD, null, null, null, null, null, null, 0L, false, 0L, null, takeProfitStopLoss != null ? !Intrinsics.f(cryptoExchangeContract$MoneyDetailsD.f96683a, draft.f96690b.f96683a) ? new TakeProfitStopLoss(takeProfitStopLoss.f72159a, null, null) : takeProfitStopLoss : null, null, null, null, 0.0d, null, false, null, 4005756);
    }

    public final CryptoOrderDraft l(CryptoOrderDraft draft, kyh.g inputPosition, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Long lG = g(this, draft, null, inputPosition, 126);
        Long lC = c(this, draft, null, inputPosition, 126);
        return CryptoOrderDraft.a(draft, h(this, draft, null, lG, lC, inputPosition, z, 722), d(this, draft, null, lG, lC, null, inputPosition, z, null, 722), null, inputPosition, null, null, null, null, 0L, false, 0L, null, null, null, null, null, 0.0d, null, false, null, 4194292);
    }

    public final CryptoOrderDraft m(CryptoOrderDraft draft, wd6.h orderType) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = draft.f96689a;
        TakeProfitStopLoss takeProfitStopLossA = draft.f96697n;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetailsH = h(this, draft, orderType, null, null, null, cryptoExchangeContract$MoneyDetails.d, 752);
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetailsD = d(this, draft, orderType, null, null, null, null, false, null, 1008);
        if (orderType == wd6.h.TAKE_PROFIT_STOP_LOSS) {
            takeProfitStopLossA = takeProfitStopLossA != null ? TakeProfitStopLoss.a(takeProfitStopLossA, 6) : new TakeProfitStopLoss();
        } else if (orderType != wd6.h.MARKET || draft.e != wd6.e.BUY) {
            takeProfitStopLossA = null;
        }
        return CryptoOrderDraft.a(draft, cryptoExchangeContract$MoneyDetailsH, cryptoExchangeContract$MoneyDetailsD, null, null, orderType, null, null, null, 0L, false, 0L, null, takeProfitStopLossA, null, null, null, 0.0d, null, false, null, 4005724);
    }

    public final CryptoOrderDraft n(CryptoOrderDraft draft, Amount amount) {
        BigDecimal bigDecimal = amount.f104717a;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(amount, "amount");
        String str = draft.f96690b.f96683a.f306286a;
        Asset asset = amount.f104718b;
        if (Intrinsics.f(str, asset.f104720b)) {
            CryptoOrderDraft draft2 = l(draft, kyh.g.BOTTOM, false);
            Intrinsics.checkNotNullParameter(amount, "amount");
            long jLongValue = Intrinsics.f(asset.f104720b, "PTS") ? qvb.a.e(bigDecimal).f83960a.f115082a : bigDecimal.unscaledValue().longValue();
            Intrinsics.checkNotNullParameter(draft2, "draft");
            return j(this, draft2, null, Long.valueOf(jLongValue), false, true, 4);
        }
        if (!Intrinsics.f(draft.f96689a.f96683a.f306286a, asset.f104720b)) {
            return draft;
        }
        CryptoOrderDraft draft3 = l(draft, kyh.g.TOP, false);
        Intrinsics.checkNotNullParameter(amount, "amount");
        long jLongValue2 = Intrinsics.f(asset.f104720b, "PTS") ? qvb.a.e(bigDecimal).f83960a.f115082a : bigDecimal.unscaledValue().longValue();
        Intrinsics.checkNotNullParameter(draft3, "draft");
        return j(this, draft3, Long.valueOf(jLongValue2), null, true, false, 8);
    }
}
