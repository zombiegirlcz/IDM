package g1i;

import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature_exchange.api.models.ExchangePocket;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f139672a;

    public o0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f139672a = featureToggleInteractor;
    }

    public static ExchangeOrderDraft b(ExchangeOrderDraft draft, Double d, Double d5) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        return ExchangeOrderDraft.a(draft, null, null, null, null, null, new TakeProfitStopLoss(true, d, d5), null, null, null, null, null, 0.0d, false, null, null, null, null, false, 33554399);
    }

    public static Long c(Map map, String str, xi0.b bVar) {
        Object next;
        ExchangePocket exchangePocket;
        if (str != null) {
            ExchangePocket exchangePocket2 = (ExchangePocket) map.get(str);
            if (exchangePocket2 != null) {
                return Long.valueOf(exchangePocket2.f96824c);
            }
        } else {
            Iterator it8 = map.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ExchangePocket) ((Map.Entry) next).getValue()).f96823b, bVar.f306286a)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (exchangePocket = (ExchangePocket) entry.getValue()) != null) {
                return Long.valueOf(exchangePocket.f96824c);
            }
        }
        return null;
    }

    public static Long d(wd6.h hVar, n9l.a aVar, r1i.h hVar2, r1i.h hVar3, Long l2, xi0.b bVar, Long l3, xi0.b bVar2) {
        BigDecimal bigDecimalDivide;
        if (hVar2 == hVar3 || i26.l.D(hVar) || hVar == wd6.h.TAKE_PROFIT_STOP_LOSS) {
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

    public static Long e(o0 o0Var, ExchangeOrderDraft exchangeOrderDraft, n9l.a aVar, r1i.h hVar, int i) {
        wd6.h hVar2 = exchangeOrderDraft.e;
        if ((i & 4) != 0) {
            aVar = exchangeOrderDraft.b();
        }
        n9l.a aVar2 = aVar;
        MoneyDetails moneyDetails = exchangeOrderDraft.f96879a;
        Long l2 = moneyDetails.f96898b;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f96880b;
        Long l3 = moneyDetails2.f96898b;
        xi0.b bVar = moneyDetails.f96897a;
        xi0.b bVar2 = moneyDetails2.f96897a;
        if ((i & 128) != 0) {
            hVar = exchangeOrderDraft.f96882g;
        }
        o0Var.getClass();
        return d(hVar2, aVar2, hVar, r1i.h.BOTTOM, l3, bVar2, l2, bVar);
    }

    public static MoneyDetails f(o0 o0Var, ExchangeOrderDraft exchangeOrderDraft, wd6.h hVar, n9l.a aVar, Long l2, Long l3, xi0.b bVar, r1i.h hVar2, wd6.e eVar, Map map, boolean z, String str, int i) {
        wd6.h hVar3 = (i & 2) != 0 ? exchangeOrderDraft.e : hVar;
        n9l.a aVarB = (i & 4) != 0 ? exchangeOrderDraft.b() : aVar;
        Long l4 = (i & 8) != 0 ? exchangeOrderDraft.f96879a.f96898b : l2;
        Long l5 = (i & 16) != 0 ? exchangeOrderDraft.f96880b.f96898b : l3;
        xi0.b bVar2 = (i & 32) != 0 ? exchangeOrderDraft.f96880b.f96897a : bVar;
        r1i.h hVar4 = (i & 64) != 0 ? exchangeOrderDraft.f96882g : hVar2;
        wd6.e eVar2 = (i & 128) != 0 ? exchangeOrderDraft.f96881c : eVar;
        Map map2 = (i & 256) != 0 ? exchangeOrderDraft.k : map;
        boolean z3 = (i & 512) != 0 ? exchangeOrderDraft.f96886m : true;
        boolean z4 = (i & 1024) != 0 ? false : z;
        String str2 = (i & 2048) != 0 ? exchangeOrderDraft.f96880b.f : str;
        o0Var.getClass();
        Long lC = c(map2, str2, bVar2);
        long jLongValue = lC != null ? lC.longValue() : 0L;
        if (l5 == null) {
            l5 = exchangeOrderDraft.f96880b.f96898b;
        }
        if (l4 == null) {
            l4 = exchangeOrderDraft.f96879a.f96898b;
        }
        double d = aVarB.f213663c;
        r1i.h hVar5 = hVar4;
        Long l22 = l5;
        String str3 = str2;
        return new MoneyDetails(bVar2, l22, jLongValue, o0Var.g(exchangeOrderDraft, hVar3, hVar5, d, l22, r1i.h.BOTTOM, jLongValue, l4, r1i.h.TOP, eVar2 == wd6.e.BUY, z3, exchangeOrderDraft.f96889q), z4, str3);
    }

    public static Amount h(f8l.d dVar, xi0.b bVar) {
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

    public static Long i(o0 o0Var, ExchangeOrderDraft exchangeOrderDraft, n9l.a aVar, r1i.h hVar, int i) {
        wd6.h hVar2 = exchangeOrderDraft.e;
        if ((i & 4) != 0) {
            aVar = exchangeOrderDraft.b();
        }
        n9l.a aVar2 = aVar;
        MoneyDetails moneyDetails = exchangeOrderDraft.f96879a;
        Long l2 = moneyDetails.f96898b;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f96880b;
        Long l3 = moneyDetails2.f96898b;
        xi0.b bVar = moneyDetails.f96897a;
        xi0.b bVar2 = moneyDetails2.f96897a;
        if ((i & 128) != 0) {
            hVar = exchangeOrderDraft.f96882g;
        }
        o0Var.getClass();
        return d(hVar2, aVar2, hVar, r1i.h.TOP, l2, bVar, l3, bVar2);
    }

    public static MoneyDetails j(o0 o0Var, ExchangeOrderDraft exchangeOrderDraft, wd6.h hVar, n9l.a aVar, Long l2, Long l3, xi0.b bVar, r1i.h hVar2, wd6.e eVar, Map map, boolean z, String str, int i) {
        wd6.h hVar3 = (i & 2) != 0 ? exchangeOrderDraft.e : hVar;
        n9l.a aVarB = (i & 4) != 0 ? exchangeOrderDraft.b() : aVar;
        Long l4 = (i & 8) != 0 ? exchangeOrderDraft.f96879a.f96898b : l2;
        Long l5 = (i & 16) != 0 ? exchangeOrderDraft.f96880b.f96898b : l3;
        xi0.b bVar2 = (i & 32) != 0 ? exchangeOrderDraft.f96879a.f96897a : bVar;
        r1i.h hVar4 = (i & 64) != 0 ? exchangeOrderDraft.f96882g : hVar2;
        wd6.e eVar2 = (i & 128) != 0 ? exchangeOrderDraft.f96881c : eVar;
        Map map2 = (i & 256) != 0 ? exchangeOrderDraft.k : map;
        boolean z3 = (i & 512) != 0 ? exchangeOrderDraft.f96886m : true;
        boolean z4 = (i & 1024) != 0 ? false : z;
        String str2 = (i & 2048) != 0 ? exchangeOrderDraft.f96879a.f : str;
        o0Var.getClass();
        Long lC = c(map2, str2, bVar2);
        long jLongValue = lC != null ? lC.longValue() : 0L;
        if (l4 == null) {
            l4 = exchangeOrderDraft.f96879a.f96898b;
        }
        if (l5 == null) {
            l5 = exchangeOrderDraft.f96880b.f96898b;
        }
        double d = aVarB.f213663c;
        r1i.h hVar5 = hVar4;
        Long l22 = l4;
        String str3 = str2;
        return new MoneyDetails(bVar2, l22, jLongValue, o0Var.g(exchangeOrderDraft, hVar3, hVar5, d, l22, r1i.h.TOP, jLongValue, l5, r1i.h.BOTTOM, eVar2 == wd6.e.SELL, z3, exchangeOrderDraft.f96889q), z4, str3);
    }

    public static ExchangeOrderDraft k(o0 o0Var, ExchangeOrderDraft exchangeOrderDraft, Long l2, Long l3, boolean z, boolean z3, int i) {
        return ExchangeOrderDraft.a(exchangeOrderDraft, j(o0Var, exchangeOrderDraft, null, null, l2, l3, null, null, null, null, (i & 4) != 0 ? false : z, null, 2534), f(o0Var, exchangeOrderDraft, null, null, l2, l3, null, null, null, null, (i & 8) != 0 ? false : z3, null, 2534), null, null, null, null, null, null, null, null, null, 0.0d, true, null, null, null, null, false, 33288188);
    }

    public final ExchangeOrderDraft a(ExchangeOrderDraft draft, OrderQuote quote, l4i.a amountConverter) {
        Amount amount;
        Map map;
        boolean z;
        r1i.b bVar;
        Amount amount2;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        f8l.b bVar2 = quote.f104753b;
        Amount amount3 = quote.e;
        Amount amount4 = quote.f;
        Amount amount5 = quote.f104754c;
        Amount amount6 = quote.d;
        int[] iArr = n0.f139669a;
        int i = iArr[bVar2.ordinal()];
        if (i == 1) {
            amount = amount4 == null ? amount3 : amount4;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amount = amount6 == null ? amount5 : amount6;
        }
        amountConverter.getClass();
        dj0.d dVarB = l4i.a.b(amount);
        long j2 = dVarB.f115082a;
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
        dj0.d dVarB2 = l4i.a.b(amount3);
        long j3 = dVarB2.f115082a;
        MoneyDetails moneyDetails = draft.f96879a;
        MoneyDetails moneyDetails2 = draft.f96880b;
        Map map2 = draft.k;
        wd6.e eVar = draft.f96881c;
        xi0.b bVar3 = dVarB.f115083b;
        Long lValueOf = Long.valueOf(j2);
        wd6.h hVar = draft.e;
        r1i.h hVar2 = draft.f96882g;
        double d = draft.b().f213663c;
        Long lValueOf2 = Long.valueOf(j2);
        r1i.h hVar3 = r1i.h.TOP;
        MoneyDetails moneyDetails3 = draft.f96879a;
        Long lC = c(map2, moneyDetails3.f, moneyDetails3.f96897a);
        long jLongValue = lC != null ? lC.longValue() : 0L;
        Long lValueOf3 = Long.valueOf(j3);
        r1i.h hVar4 = r1i.h.BOTTOM;
        long j5 = jLongValue;
        if (eVar == wd6.e.SELL) {
            map = map2;
            z = true;
        } else {
            map = map2;
            z = false;
        }
        Map map3 = map;
        MoneyDetails moneyDetailsA = MoneyDetails.a(moneyDetails, bVar3, lValueOf, g(draft, hVar, hVar2, d, lValueOf2, hVar3, j5, lValueOf3, hVar4, z, false, quote.f104756h));
        xi0.b bVar4 = dVarB2.f115083b;
        Long lValueOf4 = Long.valueOf(j3);
        wd6.h hVar5 = draft.e;
        r1i.h hVar6 = draft.f96882g;
        double d5 = draft.b().f213663c;
        Long lValueOf5 = Long.valueOf(j3);
        Long lC2 = c(map3, moneyDetails2.f, moneyDetails2.f96897a);
        MoneyDetails moneyDetailsA2 = MoneyDetails.a(moneyDetails2, bVar4, lValueOf4, g(draft, hVar5, hVar6, d5, lValueOf5, hVar4, lC2 != null ? lC2.longValue() : 0L, Long.valueOf(j2), hVar3, eVar == wd6.e.BUY, false, quote.f104756h));
        OrderRate orderRate = quote.f104757j;
        BigDecimal bigDecimal = orderRate.f104793b;
        BigDecimal bigDecimal2 = orderRate.f104792a;
        ChargeBreakdown chargeBreakdown = quote.f104755g.f104731a;
        dj0.d dVarB3 = null;
        if (chargeBreakdown.f104723b.isEmpty()) {
            chargeBreakdown = null;
        }
        if (chargeBreakdown != null && (amount2 = chargeBreakdown.f104722a) != null) {
            dVarB3 = l4i.a.b(amount2);
        }
        Intrinsics.checkNotNullParameter(quote, "quote");
        int i3 = iArr[quote.f104752a.ordinal()];
        if (i3 == 1) {
            bVar = r1i.b.CREDIT;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = r1i.b.COST;
        }
        return ExchangeOrderDraft.a(draft, moneyDetailsA, moneyDetailsA2, null, null, null, null, null, bigDecimal, bigDecimal2, Long.valueOf(quote.i), null, 0.0d, false, dVarB3, bVar, quote.f104756h, quote, false, 32935036);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r1i.e g(com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft r25, wd6.h r26, r1i.h r27, double r28, java.lang.Long r30, r1i.h r31, long r32, java.lang.Long r34, r1i.h r35, boolean r36, boolean r37, java.util.List r38) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1i.o0.g(com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft, wd6.h, r1i.h, double, java.lang.Long, r1i.h, long, java.lang.Long, r1i.h, boolean, boolean, java.util.List):r1i.e");
    }

    public final ExchangeOrderDraft l(ExchangeOrderDraft draft, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        return k(this, draft, null, Long.valueOf(j2), false, z, 4);
    }

    public final ExchangeOrderDraft m(ExchangeOrderDraft exchangeOrderDraft, xi0.b bVar, xi0.b bVar2, String str, String str2, boolean z, wd6.i iVar) {
        TakeProfitStopLoss takeProfitStopLoss;
        TakeProfitStopLoss takeProfitStopLossA = null;
        Long l2 = (z && exchangeOrderDraft.f96882g == r1i.h.BOTTOM) ? 0L : null;
        Long l3 = (z && exchangeOrderDraft.f96882g == r1i.h.TOP) ? 0L : null;
        MoneyDetails moneyDetailsJ = j(this, exchangeOrderDraft, null, null, l2, l3, bVar, null, null, null, false, str, 1990);
        MoneyDetails moneyDetailsF = f(this, exchangeOrderDraft, null, null, l2, l3, bVar2, null, null, null, false, str2, 1990);
        wd6.i iVar2 = iVar == null ? exchangeOrderDraft.d : iVar;
        TakeProfitStopLoss takeProfitStopLoss2 = exchangeOrderDraft.f;
        if (takeProfitStopLoss2 == null) {
            takeProfitStopLoss = takeProfitStopLossA;
        } else if (Intrinsics.f(moneyDetailsF.f96897a, exchangeOrderDraft.f96880b.f96897a)) {
            takeProfitStopLoss = takeProfitStopLoss2;
        } else {
            takeProfitStopLossA = TakeProfitStopLoss.a(takeProfitStopLoss2, 1);
            takeProfitStopLoss = takeProfitStopLossA;
        }
        return ExchangeOrderDraft.a(exchangeOrderDraft, moneyDetailsJ, moneyDetailsF, null, iVar2, null, takeProfitStopLoss, null, null, null, null, null, 0.0d, false, null, null, null, null, false, 33265492);
    }

    public final ExchangeOrderDraft n(ExchangeOrderDraft draft, r1i.h inputPosition, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Long lI = i(this, draft, null, inputPosition, 126);
        Long lE = e(this, draft, null, inputPosition, 126);
        return ExchangeOrderDraft.a(draft, j(this, draft, null, null, lI, lE, null, inputPosition, null, null, z, null, 2982), f(this, draft, null, null, lI, lE, null, inputPosition, null, null, z, null, 2982), null, null, null, null, inputPosition, null, null, null, null, 0.0d, false, null, null, null, null, false, 33554364);
    }

    public final ExchangeOrderDraft o(ExchangeOrderDraft draft, wd6.h orderType) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        MoneyDetails moneyDetailsJ = j(this, draft, orderType, null, null, null, null, null, null, null, false, null, 4068);
        TakeProfitStopLoss takeProfitStopLossA = draft.f;
        MoneyDetails moneyDetailsF = f(this, draft, orderType, null, null, null, null, null, null, null, false, null, 4068);
        if (orderType == wd6.h.TAKE_PROFIT_STOP_LOSS) {
            takeProfitStopLossA = takeProfitStopLossA != null ? TakeProfitStopLoss.a(takeProfitStopLossA, 6) : new TakeProfitStopLoss();
        } else if (orderType != wd6.h.MARKET || draft.f96881c != wd6.e.BUY) {
            takeProfitStopLossA = null;
        }
        return ExchangeOrderDraft.a(draft, moneyDetailsJ, moneyDetailsF, null, null, orderType, takeProfitStopLossA, null, null, null, null, null, 0.0d, false, null, null, null, null, false, 33265484);
    }

    public final ExchangeOrderDraft p(ExchangeOrderDraft draft, Map pockets) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        return ExchangeOrderDraft.a(draft, j(this, draft, null, null, null, null, null, null, null, pockets, false, null, 3838), f(this, draft, null, null, null, null, null, null, null, pockets, false, null, 3838), null, null, null, null, null, null, null, null, pockets, 0.0d, false, null, null, null, null, false, 33553404);
    }

    public final ExchangeOrderDraft q(ExchangeOrderDraft draft, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        return k(this, draft, Long.valueOf(j2), null, z, false, 8);
    }
}
