package qcf;

import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import f8l.c;
import hx7.e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.t0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final Amount a(FiatExchangeOrderQuote fiatExchangeOrderQuote) {
        Object obj2;
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuote, "<this>");
        List list = fiatExchangeOrderQuote.f91686a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(e1.v((OrderQuote) it8.next()));
        }
        Iterator it9 = arrayList.iterator();
        if (it9.hasNext()) {
            Object next = it9.next();
            while (it9.hasNext()) {
                next = a.a.x((Amount) next, (Amount) it9.next());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        return (Amount) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.revolut.shared.feature.market_data.models.domain.models.Amount] */
    public static final Amount b(FiatExchangeOrderQuote fiatExchangeOrderQuote) throws Throwable {
        Object next;
        Asset asset;
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuote, "<this>");
        List list = fiatExchangeOrderQuote.f91686a;
        Amount amount = fiatExchangeOrderQuote.f91687b;
        ArrayList arrayListE0 = d0.E0(fiatExchangeOrderQuote.f91688c, list);
        ArrayList arrayList = new ArrayList(w.t(arrayListE0, 10));
        Iterator it8 = arrayListE0.iterator();
        while (it8.hasNext()) {
            arrayList.add(e1.m((OrderQuote) it8.next()));
        }
        Iterator it9 = arrayList.iterator();
        b bVar = null;
        if (it9.hasNext()) {
            next = it9.next();
            while (it9.hasNext()) {
                Amount amount2 = (Amount) it9.next();
                next = (Amount) next;
                if (Intrinsics.f(next.f104718b.f104721c, amount2.f104718b.f104721c)) {
                    next = a.a.x(next, amount2);
                }
            }
        } else {
            next = 0;
        }
        Amount amount3 = (Amount) next;
        if (amount3 != null) {
            b bVar2 = amount3.f104718b.f104721c;
            if (amount != null && (asset = amount.f104718b) != null) {
                bVar = asset.f104721c;
            }
            return Intrinsics.f(bVar2, bVar) ? a.a.x(amount3, amount) : amount3;
        }
        if (amount != null) {
            return amount;
        }
        e.n(new IllegalArgumentException("No remaining uncovered amount and no quotes."));
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        c cVar = c.FIAT;
        b.Companion.getClass();
        b bVar3 = b.i;
        return new Amount(ZERO, new Asset(cVar, bVar3.f306286a, bVar3));
    }

    public static final ArrayList c(FiatExchangeOrderQuote fiatExchangeOrderQuote) {
        boolean z;
        Object next;
        Amount amountX;
        Amount amountX2;
        Object objA;
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuote, "<this>");
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuote, "<this>");
        ArrayList arrayListE0 = d0.E0(fiatExchangeOrderQuote.f91688c, fiatExchangeOrderQuote.f91686a);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListE0) {
            if (e1.z((OrderQuote) obj2)) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            OrderQuote orderQuote = (OrderQuote) obj3;
            Pair pair = new Pair(e1.k(orderQuote).f104721c, e1.t(orderQuote).f104721c);
            Object arrayList2 = linkedHashMap.get(pair);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(pair, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        List listC = t0.C(linkedHashMap);
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            List list = (List) ((Pair) it8.next()).f186386b;
            boolean z3 = list instanceof Collection;
            boolean z4 = false;
            if (z3 && list.isEmpty()) {
                z = true;
            } else {
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    if (((OrderQuote) it9.next()).d != null) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            if (z3 && list.isEmpty()) {
                z4 = true;
            } else {
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    if (((OrderQuote) it10.next()).f != null) {
                        break;
                    }
                }
                z4 = true;
            }
            Iterator it11 = list.iterator();
            if (it11.hasNext()) {
                next = it11.next();
                while (it11.hasNext()) {
                    OrderQuote orderQuote2 = (OrderQuote) it11.next();
                    OrderQuote orderQuote3 = (OrderQuote) next;
                    Amount amount = orderQuote3.f104754c;
                    Charges charges = orderQuote3.f104755g;
                    Amount amount2 = orderQuote3.e;
                    Amount amount3 = orderQuote2.f104754c;
                    Amount amount4 = orderQuote2.e;
                    Amount amountX3 = a.a.x(amount, amount3);
                    Charges charges2 = charges;
                    Amount amountX4 = a.a.x(amount2, amount4);
                    if (z) {
                        amountX = null;
                    } else {
                        Amount amount5 = orderQuote3.d;
                        if (amount5 == null) {
                            amount5 = orderQuote3.f104754c;
                        }
                        Amount amount6 = orderQuote2.d;
                        if (amount6 == null) {
                            amount6 = orderQuote2.f104754c;
                        }
                        amountX = a.a.x(amount5, amount6);
                    }
                    if (z4) {
                        amountX2 = null;
                    } else {
                        Amount amount7 = orderQuote3.f;
                        if (amount7 != null) {
                            amount2 = amount7;
                        }
                        Amount amount8 = orderQuote2.f;
                        if (amount8 != null) {
                            amount4 = amount8;
                        }
                        amountX2 = a.a.x(amount2, amount4);
                    }
                    try {
                        m.Companion companion = m.INSTANCE;
                        objA = e(charges2, orderQuote2.f104755g);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        objA = o.a(th10);
                    }
                    Throwable thA = m.a(objA);
                    if (thA != null) {
                        e.n(thA);
                    }
                    if (objA instanceof n) {
                        objA = null;
                    }
                    Charges charges3 = (Charges) objA;
                    if (charges3 != null) {
                        charges2 = charges3;
                    }
                    next = OrderQuote.a(orderQuote3, amountX3, amountX, amountX4, amountX2, charges2, 33554307);
                }
            } else {
                next = null;
            }
            OrderQuote orderQuote4 = (OrderQuote) next;
            OrderQuote orderQuote5 = orderQuote4 != null ? orderQuote4 : null;
            if (orderQuote5 != null) {
                arrayList3.add(orderQuote5);
            }
        }
        return arrayList3;
    }

    public static final ChargeBreakdown d(ChargeBreakdown chargeBreakdown, ChargeBreakdown chargeBreakdown2) {
        Intrinsics.checkNotNullParameter(chargeBreakdown, "<this>");
        Amount amountX = chargeBreakdown.f104724c;
        Amount amount = chargeBreakdown2.f104724c;
        Amount amountX2 = chargeBreakdown.f104722a;
        Asset asset = amountX2.f104718b;
        Amount amount2 = chargeBreakdown2.f104722a;
        if (Intrinsics.f(asset, amount2.f104718b)) {
            amountX2 = a.a.x(amountX2, amount2);
        }
        ArrayList arrayListE0 = d0.E0(chargeBreakdown2.f104723b, chargeBreakdown.f104723b);
        if (amountX != null && amount != null) {
            amountX = a.a.x(amountX, amount);
        } else if (amountX == null) {
            amountX = amount;
        }
        return ChargeBreakdown.a(chargeBreakdown, amountX2, arrayListE0, amountX, 8);
    }

    public static final Charges e(Charges charges, Charges charges2) {
        Intrinsics.checkNotNullParameter(charges, "<this>");
        ChargeBreakdown chargeBreakdownD = d(charges.f104731a, charges2.f104731a);
        ChargeBreakdown chargeBreakdownD2 = d(charges.f104732b, charges2.f104732b);
        ChargeBreakdown chargeBreakdownD3 = charges.f104733c;
        ChargeBreakdown chargeBreakdown = charges2.f104733c;
        if (chargeBreakdownD3 != null && chargeBreakdown != null) {
            chargeBreakdownD3 = d(chargeBreakdownD3, chargeBreakdown);
        } else if (chargeBreakdownD3 == null) {
            chargeBreakdownD3 = chargeBreakdown;
        }
        return new Charges(chargeBreakdownD, chargeBreakdownD2, chargeBreakdownD3);
    }
}
