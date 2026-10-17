package b7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.RecurringBuySettings;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import i26.l;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static ExchangeOrderDraft a(ExchangeOrderDraft draft, OrderQuote quote, l4i.a amountConverter) {
        Amount amount;
        Map map;
        boolean z;
        dj0.d dVarB;
        i7j.c cVar;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        f8l.b bVar = quote.f104753b;
        Amount amount2 = quote.e;
        Amount amount3 = quote.f;
        Amount amount4 = quote.f104754c;
        Amount amount5 = quote.d;
        int[] iArr = a.f13050a;
        int i = iArr[bVar.ordinal()];
        if (i == 1) {
            amount = amount3 == null ? amount2 : amount3;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amount = amount5 == null ? amount4 : amount5;
        }
        amountConverter.getClass();
        dj0.d dVarB2 = l4i.a.b(amount);
        long j2 = dVarB2.f115082a;
        int i2 = iArr[quote.f104753b.ordinal()];
        if (i2 == 1) {
            amount2 = amount5 == null ? amount4 : amount5;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (amount3 != null) {
                amount2 = amount3;
            }
        }
        dj0.d dVarB3 = l4i.a.b(amount2);
        xi0.b bVar2 = dVarB3.f115083b;
        long j3 = dVarB3.f115082a;
        MoneyDetails moneyDetails = draft.f99885a;
        MoneyDetails moneyDetails2 = draft.f99886b;
        Map map2 = draft.f99890j;
        wd6.e eVar = draft.f99887c;
        xi0.b bVar3 = dVarB2.f115083b;
        Long lValueOf = Long.valueOf(j2);
        wd6.h hVar = draft.e;
        i7j.j jVar = draft.f;
        double d = draft.b().f213663c;
        Long lValueOf2 = Long.valueOf(j2);
        i7j.j jVar2 = i7j.j.TOP;
        MoneyDetails moneyDetails3 = draft.f99885a;
        Long lB = b(map2, moneyDetails3.f, moneyDetails3.f99903a);
        long jLongValue = lB != null ? lB.longValue() : 0L;
        Long lValueOf3 = Long.valueOf(j3);
        i7j.j jVar3 = i7j.j.BOTTOM;
        if (eVar == wd6.e.SELL) {
            map = map2;
            z = true;
        } else {
            map = map2;
            z = false;
        }
        MoneyDetails moneyDetailsA = MoneyDetails.a(moneyDetails, bVar3, lValueOf, f(draft, hVar, jVar, d, lValueOf2, jVar2, jLongValue, lValueOf3, jVar3, z, false, quote.f104756h));
        Long lValueOf4 = Long.valueOf(j3);
        wd6.h hVar2 = draft.e;
        i7j.j jVar4 = draft.f;
        double d5 = draft.b().f213663c;
        Long lValueOf5 = Long.valueOf(j3);
        Long lB2 = b(map, moneyDetails2.f, moneyDetails2.f99903a);
        MoneyDetails moneyDetailsA2 = MoneyDetails.a(moneyDetails2, bVar2, lValueOf4, f(draft, hVar2, jVar4, d5, lValueOf5, jVar3, lB2 != null ? lB2.longValue() : 0L, Long.valueOf(j2), jVar2, eVar == wd6.e.BUY, false, quote.f104756h));
        OrderRate orderRate = quote.f104757j;
        BigDecimal bigDecimal = orderRate.f104793b;
        BigDecimal bigDecimal2 = orderRate.f104792a;
        Charges charges = quote.f104755g;
        ChargeBreakdown chargeBreakdown = charges.f104731a;
        ChargeBreakdown chargeBreakdown2 = charges.f104731a;
        if (chargeBreakdown.f104723b.isEmpty()) {
            dVarB = null;
        } else {
            Amount amount6 = chargeBreakdown2.f104724c;
            dVarB = (amount6 == null || !Intrinsics.f(amount6.f104718b.f104720b, bVar2.f306286a)) ? l4i.a.b(chargeBreakdown2.f104722a) : l4i.a.b(amount6);
        }
        Intrinsics.checkNotNullParameter(quote, "quote");
        int i3 = iArr[quote.f104752a.ordinal()];
        if (i3 == 1) {
            cVar = i7j.c.CREDIT;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = i7j.c.COST;
        }
        return ExchangeOrderDraft.a(draft, moneyDetailsA, moneyDetailsA2, null, null, null, bigDecimal, bigDecimal2, Long.valueOf(quote.i), null, 0.0d, null, null, false, dVarB, cVar, quote.f104756h, quote, 15539772);
    }

    public static Long b(Map map, String str, xi0.b bVar) {
        Object next;
        ExchangePocket exchangePocket;
        if (str != null) {
            ExchangePocket exchangePocket2 = (ExchangePocket) map.get(str);
            if (exchangePocket2 != null) {
                return Long.valueOf(exchangePocket2.f99902c);
            }
        } else {
            Iterator it8 = map.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ExchangePocket) ((Map.Entry) next).getValue()).f99901b, bVar.f306286a)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (exchangePocket = (ExchangePocket) entry.getValue()) != null) {
                return Long.valueOf(exchangePocket.f99902c);
            }
        }
        return null;
    }

    public static Long c(wd6.h hVar, n9l.a aVar, i7j.j jVar, i7j.j jVar2, Long l2, xi0.b bVar, Long l3, xi0.b bVar2) {
        BigDecimal bigDecimalDivide;
        if (jVar == jVar2 || l.D(hVar)) {
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

    public static Long d(b bVar, ExchangeOrderDraft exchangeOrderDraft, n9l.a aVar, i7j.j jVar, int i) {
        wd6.h hVar = exchangeOrderDraft.e;
        if ((i & 4) != 0) {
            aVar = exchangeOrderDraft.b();
        }
        n9l.a aVar2 = aVar;
        MoneyDetails moneyDetails = exchangeOrderDraft.f99885a;
        Long l2 = moneyDetails.f99904b;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f99886b;
        Long l3 = moneyDetails2.f99904b;
        xi0.b bVar2 = moneyDetails.f99903a;
        xi0.b bVar3 = moneyDetails2.f99903a;
        if ((i & 128) != 0) {
            jVar = exchangeOrderDraft.f;
        }
        bVar.getClass();
        return c(hVar, aVar2, jVar, i7j.j.BOTTOM, l3, bVar3, l2, bVar2);
    }

    public static MoneyDetails e(b bVar, ExchangeOrderDraft exchangeOrderDraft, wd6.h hVar, n9l.a aVar, Long l2, Long l3, xi0.b bVar2, i7j.j jVar, Map map, boolean z, String str, int i) {
        wd6.h hVar2 = (i & 2) != 0 ? exchangeOrderDraft.e : hVar;
        n9l.a aVarB = (i & 4) != 0 ? exchangeOrderDraft.b() : aVar;
        Long l4 = (i & 8) != 0 ? exchangeOrderDraft.f99885a.f99904b : l2;
        Long l5 = (i & 16) != 0 ? exchangeOrderDraft.f99886b.f99904b : l3;
        xi0.b bVar3 = (i & 32) != 0 ? exchangeOrderDraft.f99886b.f99903a : bVar2;
        i7j.j jVar2 = (i & 64) != 0 ? exchangeOrderDraft.f : jVar;
        wd6.e eVar = exchangeOrderDraft.f99887c;
        Map map2 = (i & 256) != 0 ? exchangeOrderDraft.f99890j : map;
        boolean z3 = (i & 512) != 0 ? exchangeOrderDraft.f99893n : true;
        boolean z4 = (i & 1024) != 0 ? false : z;
        String str2 = (i & 2048) != 0 ? exchangeOrderDraft.f99886b.f : str;
        bVar.getClass();
        Long lB = b(map2, str2, bVar3);
        long jLongValue = lB != null ? lB.longValue() : 0L;
        if (l5 == null) {
            l5 = exchangeOrderDraft.f99886b.f99904b;
        }
        if (l4 == null) {
            l4 = exchangeOrderDraft.f99885a.f99904b;
        }
        double d = aVarB.f213663c;
        String str3 = str2;
        long j2 = jLongValue;
        return new MoneyDetails(bVar3, l5, j2, f(exchangeOrderDraft, hVar2, jVar2, d, l5, i7j.j.BOTTOM, j2, l4, i7j.j.TOP, eVar == wd6.e.BUY, z3, exchangeOrderDraft.f99896r), z4, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i7j.g f(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r22, wd6.h r23, i7j.j r24, double r25, java.lang.Long r27, i7j.j r28, long r29, java.lang.Long r31, i7j.j r32, boolean r33, boolean r34, java.util.List r35) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7j.b.f(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft, wd6.h, i7j.j, double, java.lang.Long, i7j.j, long, java.lang.Long, i7j.j, boolean, boolean, java.util.List):i7j.g");
    }

    public static Amount g(f8l.d dVar, xi0.b bVar) {
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

    public static Long h(b bVar, ExchangeOrderDraft exchangeOrderDraft, n9l.a aVar, i7j.j jVar, int i) {
        wd6.h hVar = exchangeOrderDraft.e;
        if ((i & 4) != 0) {
            aVar = exchangeOrderDraft.b();
        }
        n9l.a aVar2 = aVar;
        MoneyDetails moneyDetails = exchangeOrderDraft.f99885a;
        Long l2 = moneyDetails.f99904b;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f99886b;
        Long l3 = moneyDetails2.f99904b;
        xi0.b bVar2 = moneyDetails.f99903a;
        xi0.b bVar3 = moneyDetails2.f99903a;
        if ((i & 128) != 0) {
            jVar = exchangeOrderDraft.f;
        }
        bVar.getClass();
        return c(hVar, aVar2, jVar, i7j.j.TOP, l2, bVar2, l3, bVar3);
    }

    public static MoneyDetails i(b bVar, ExchangeOrderDraft exchangeOrderDraft, wd6.h hVar, n9l.a aVar, Long l2, Long l3, xi0.b bVar2, i7j.j jVar, Map map, boolean z, String str, int i) {
        wd6.h hVar2 = (i & 2) != 0 ? exchangeOrderDraft.e : hVar;
        n9l.a aVarB = (i & 4) != 0 ? exchangeOrderDraft.b() : aVar;
        Long l4 = (i & 8) != 0 ? exchangeOrderDraft.f99885a.f99904b : l2;
        Long l5 = (i & 16) != 0 ? exchangeOrderDraft.f99886b.f99904b : l3;
        xi0.b bVar3 = (i & 32) != 0 ? exchangeOrderDraft.f99885a.f99903a : bVar2;
        i7j.j jVar2 = (i & 64) != 0 ? exchangeOrderDraft.f : jVar;
        wd6.e eVar = exchangeOrderDraft.f99887c;
        Map map2 = (i & 256) != 0 ? exchangeOrderDraft.f99890j : map;
        boolean z3 = (i & 512) != 0 ? exchangeOrderDraft.f99893n : true;
        boolean z4 = (i & 1024) != 0 ? false : z;
        String str2 = (i & 2048) != 0 ? exchangeOrderDraft.f99885a.f : str;
        bVar.getClass();
        Long lB = b(map2, str2, bVar3);
        long jLongValue = lB != null ? lB.longValue() : 0L;
        if (l4 == null) {
            l4 = exchangeOrderDraft.f99885a.f99904b;
        }
        if (l5 == null) {
            l5 = exchangeOrderDraft.f99886b.f99904b;
        }
        double d = aVarB.f213663c;
        long j2 = jLongValue;
        Long l22 = l5;
        Long l31 = l4;
        return new MoneyDetails(bVar3, l31, j2, f(exchangeOrderDraft, hVar2, jVar2, d, l31, i7j.j.TOP, j2, l22, i7j.j.BOTTOM, eVar == wd6.e.SELL, z3, exchangeOrderDraft.f99896r), z4, str2);
    }

    public static ExchangeOrderDraft j(b bVar, ExchangeOrderDraft exchangeOrderDraft, Long l2, Long l3, boolean z, boolean z3, int i) {
        return ExchangeOrderDraft.a(exchangeOrderDraft, i(bVar, exchangeOrderDraft, null, null, l2, l3, null, null, null, (i & 4) != 0 ? false : z, null, 2534), e(bVar, exchangeOrderDraft, null, null, l2, l3, null, null, null, (i & 8) != 0 ? false : z3, null, 2534), null, null, null, null, null, null, null, 0.0d, null, null, true, null, null, null, null, 16244732);
    }

    public static ExchangeOrderDraft m(ExchangeOrderDraft draft, RecurringBuySettings recurringBuySettings) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(recurringBuySettings, "recurringBuySettings");
        return ExchangeOrderDraft.a(draft, null, null, null, null, null, null, null, null, null, 0.0d, null, recurringBuySettings, false, null, null, null, null, 16773119);
    }

    public final ExchangeOrderDraft k(ExchangeOrderDraft draft, i7j.j inputPosition, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Long lH = h(this, draft, null, inputPosition, 126);
        Long lD = d(this, draft, null, inputPosition, 126);
        return ExchangeOrderDraft.a(draft, i(this, draft, null, null, lH, lD, null, inputPosition, null, z, null, 2982), e(this, draft, null, null, lH, lD, null, inputPosition, null, z, null, 2982), null, null, inputPosition, null, null, null, null, 0.0d, null, null, false, null, null, null, null, 16777180);
    }

    public final ExchangeOrderDraft l(ExchangeOrderDraft draft, wd6.h orderType) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return ExchangeOrderDraft.a(draft, i(this, draft, orderType, null, null, null, null, null, null, false, null, 4068), e(this, draft, orderType, null, null, null, null, null, null, false, null, 4068), null, orderType, null, null, null, null, null, 0.0d, null, null, false, null, null, null, null, 16198572);
    }

    public final ExchangeOrderDraft n(ExchangeOrderDraft draft, int i) {
        MoneyDetails moneyDetails;
        Intrinsics.checkNotNullParameter(draft, "draft");
        wd6.e eVar = draft.f99887c;
        int[] iArr = a.f13051b;
        int i2 = iArr[eVar.ordinal()];
        if (i2 == 1) {
            moneyDetails = draft.f99886b;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            moneyDetails = draft.f99885a;
        }
        Long lB = b(draft.f99890j, moneyDetails.f, moneyDetails.f99903a);
        if (lB == null) {
            return draft;
        }
        long jLongValue = (lB.longValue() * ((long) i)) / ((long) 100);
        int i3 = iArr[draft.f99887c.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                return p(k(draft, i7j.j.TOP, false), jLongValue, true);
            }
            throw new NoWhenBranchMatchedException();
        }
        ExchangeOrderDraft draft2 = k(draft, i7j.j.BOTTOM, false);
        Intrinsics.checkNotNullParameter(draft2, "draft");
        return j(this, draft2, null, Long.valueOf(jLongValue), false, true, 4);
    }

    public final ExchangeOrderDraft o(ExchangeOrderDraft draft, Amount amount) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(amount, "amount");
        String str = draft.f99886b.f99903a.f306286a;
        Asset asset = amount.f104718b;
        BigDecimal bigDecimal = amount.f104717a;
        if (!Intrinsics.f(str, asset.f104720b)) {
            return Intrinsics.f(draft.f99885a.f99903a.f306286a, amount.f104718b.f104720b) ? p(k(draft, i7j.j.TOP, false), bigDecimal.unscaledValue().longValue(), true) : draft;
        }
        ExchangeOrderDraft draft2 = k(draft, i7j.j.BOTTOM, false);
        long jLongValue = bigDecimal.unscaledValue().longValue();
        Intrinsics.checkNotNullParameter(draft2, "draft");
        return j(this, draft2, null, Long.valueOf(jLongValue), false, true, 4);
    }

    public final ExchangeOrderDraft p(ExchangeOrderDraft draft, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        return j(this, draft, Long.valueOf(j2), null, z, false, 8);
    }
}
