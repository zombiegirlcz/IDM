package ael;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q {
    public static BigDecimal a(ej0.b bVar, ej0.b bVar2) {
        if (bVar == null || bVar2 == null) {
            return null;
        }
        BigDecimal bigDecimal = bVar2.f126703a;
        BigDecimal bigDecimal2 = bVar.f126703a;
        MathContext mathContext = MathContext.DECIMAL128;
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal, mathContext);
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimalSubtract.compareTo(bigDecimal3) == 0) {
            return bigDecimal3;
        }
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimalSubtract, mathContext);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalDivide.multiply(bigDecimalValueOf).setScale(4, RoundingMode.HALF_UP);
    }

    public static del.b c(q qVar, List holdings, List tickers, List currencyRates, xi0.b targetCurrency) {
        ej0.b bVarI;
        Object next;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(tickers, "tickers");
        Intrinsics.checkNotNullParameter(currencyRates, "currencyRates");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        List list = holdings;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof kel.n) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            Object obj3 = null;
            if (!it8.hasNext()) {
                break;
            }
            kel.n nVar = (kel.n) it8.next();
            Iterator it9 = tickers.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (Intrinsics.f(((InstrumentTicker) next2).f105112b, nVar.e)) {
                    obj3 = next2;
                    break;
                }
            }
            InstrumentTicker instrumentTicker = (InstrumentTicker) obj3;
            arrayList2.add(instrumentTicker != null ? qVar.b(nVar, instrumentTicker, currencyRates, targetCurrency) : new del.a(nVar.f, null, null, null, nVar, null, null));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            ej0.b bVar = ((del.a) it10.next()).f113705b;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
        Iterator it11 = arrayList3.iterator();
        while (it11.hasNext()) {
            arrayList4.add(d((ej0.b) it11.next(), currencyRates, targetCurrency));
        }
        ej0.b bVarH = h(arrayList4, targetCurrency);
        ArrayList<kel.g> arrayList5 = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof kel.b) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (kel.g gVar : arrayList5) {
            if (gVar instanceof kel.n) {
                Iterator it12 = tickers.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it12.next();
                    if (Intrinsics.f(((InstrumentTicker) next).f105112b, ((kel.n) gVar).e)) {
                        break;
                    }
                }
                InstrumentTicker instrumentTicker2 = (InstrumentTicker) next;
                if (instrumentTicker2 != null) {
                    ej0.b bVarI2 = instrumentTicker2.f;
                    if (bVarI2 == null) {
                        bVarI2 = i(instrumentTicker2.e);
                    }
                    bVarI = mif.a.y(bVarI2, ((kel.n) gVar).f183174b);
                } else {
                    bVarI = null;
                }
            } else {
                if (!(gVar instanceof kel.b)) {
                    throw new IllegalStateException();
                }
                bVarI = i(((kel.b) gVar).f183149b);
            }
            ej0.b bVarD = bVarI != null ? d(bVarI, currencyRates, targetCurrency) : null;
            if (bVarD != null) {
                arrayList6.add(bVarD);
            }
        }
        ej0.b bVarH2 = h(arrayList6, targetCurrency);
        ej0.b bVarU = mif.a.u(bVarH, bVarH2);
        ArrayList arrayList7 = new ArrayList();
        Iterator it13 = arrayList2.iterator();
        while (it13.hasNext()) {
            ej0.b bVar2 = ((del.a) it13.next()).f113706c;
            if (bVar2 != null) {
                arrayList7.add(bVar2);
            }
        }
        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
        Iterator it14 = arrayList7.iterator();
        while (it14.hasNext()) {
            arrayList8.add(d((ej0.b) it14.next(), currencyRates, targetCurrency));
        }
        ej0.b bVarH3 = h(arrayList8, targetCurrency);
        return new del.b(bVarU, bVarH2, bVarH3, a(bVarU, bVarH3), arrayList2);
    }

    public static ej0.b d(ej0.b bVar, List list, xi0.b bVar2) throws IOException {
        Object next;
        if (Intrinsics.f(bVar.f126704b.f306286a, bVar2.f306286a)) {
            return bVar;
        }
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((n9l.a) next).f213661a.f306286a, bVar.f126704b.f306286a)) {
                break;
            }
        }
        n9l.a aVar = (n9l.a) next;
        if (aVar != null) {
            return mif.a.s(bVar, aVar.f213663c, bVar2);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "PnlInteractorImpl", a0.d.s("convertToTargetCurrency unsuccessful, rate not found, fallback to 0; targetCurrency=", bVar2.f306286a, "; availableRates=", zhm.d0.k0(list2, null, null, null, 0, p.f3645a, 31)), null, null, 16);
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return new ej0.b(ZERO, bVar2);
    }

    public static ej0.b e(kel.n nVar, xi0.b bVar, List list) {
        BigDecimal bigDecimal;
        ej0.b bVarI = nVar.i;
        if (bVarI == null) {
            dj0.d dVar = nVar.f183177h;
            bVarI = dVar != null ? i(dVar) : null;
        }
        if ((bVarI == null || (bigDecimal = bVarI.f126703a) == null || bigDecimal.compareTo(BigDecimal.ZERO) != 0) && bVarI != null) {
            return d(mif.a.y(bVarI, nVar.f183174b), list, bVar);
        }
        return null;
    }

    public static ej0.b f(kel.n nVar, xi0.b bVar, List list, List list2) {
        Object next;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((InstrumentTicker) next).f105112b, nVar.e)) {
                break;
            }
        }
        InstrumentTicker instrumentTicker = (InstrumentTicker) next;
        if (instrumentTicker == null) {
            return null;
        }
        ej0.b bVarI = instrumentTicker.f;
        if (bVarI == null) {
            bVarI = i(instrumentTicker.e);
        }
        return d(mif.a.y(bVarI, nVar.f183174b), list, bVar);
    }

    public static ej0.b g(ej0.b bVar) {
        xi0.a aVar = xi0.b.Companion;
        xi0.b bVar2 = bVar.f126704b;
        String str = bVar2.f306286a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        return Intrinsics.f(bVar2, bVarA) ? bVar : ej0.b.b(bVar, null, bVarA, 1);
    }

    public static ej0.b h(ArrayList arrayList, xi0.b bVar) {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        ej0.b bVar2 = new ej0.b(ZERO, bVar);
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                bVar2 = mif.a.u(bVar2, (ej0.b) listIterator.previous());
            }
        }
        return bVar2;
    }

    public static ej0.b i(dj0.d dVar) {
        return new ej0.b(pyd.c.j(dVar), dVar.f115083b);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final del.a b(kel.n r11, com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker r12, java.util.List r13, xi0.b r14) {
        /*
            r10 = this;
            java.lang.String r0 = "holding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "ticker"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r1 = "currencyRates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "targetCurrency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.util.List r1 = zhm.u.c(r12)
            ej0.b r4 = f(r11, r14, r13, r1)
            java.util.List r1 = zhm.u.c(r12)
            java.math.BigDecimal r2 = r11.f183174b
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
            int r2 = r2.compareTo(r3)
            r5 = 0
            if (r2 != 0) goto L2d
        L2b:
            r1 = r5
            goto L49
        L2d:
            ej0.b r1 = f(r11, r14, r13, r1)
            if (r1 == 0) goto L2b
            ej0.b r1 = g(r1)
            ej0.b r2 = e(r11, r14, r13)
            if (r2 == 0) goto L2b
            ej0.b r2 = g(r2)
            ej0.b r1 = g(r1)
            ej0.b r1 = mif.a.r(r1, r2)
        L49:
            nel.z r2 = r12.d
            int[] r6 = ael.o.f3642a
            int r2 = r2.ordinal()
            r2 = r6[r2]
            r6 = 1
            if (r2 != r6) goto La3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "stockHolding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            ej0.b r0 = r12.f
            if (r0 == 0) goto La0
            java.math.BigDecimal r0 = r0.f126703a
            if (r0 != 0) goto L67
            goto La0
        L67:
            ej0.b r2 = r11.i
            if (r2 == 0) goto La0
            java.math.BigDecimal r2 = r2.f126703a
            if (r2 != 0) goto L70
            goto La0
        L70:
            java.math.BigDecimal r5 = r11.f183174b
            int r5 = r5.compareTo(r3)
            if (r5 == 0) goto La1
            int r5 = r2.compareTo(r3)
            if (r5 == 0) goto La1
            java.math.MathContext r3 = java.math.MathContext.DECIMAL128
            java.math.BigDecimal r0 = r0.subtract(r2, r3)
            java.math.BigDecimal r0 = r0.divide(r2, r3)
            r2 = 100
            long r2 = (long) r2
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r2)
            java.lang.String r3 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.math.BigDecimal r0 = r0.multiply(r2)
            r2 = 4
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r3 = r0.setScale(r2, r3)
            goto La1
        La0:
            r3 = r5
        La1:
            r6 = r3
            goto La8
        La3:
            java.math.BigDecimal r3 = a(r4, r1)
            goto La1
        La8:
            ej0.b r9 = e(r11, r14, r13)
            del.a r2 = new del.a
            java.lang.String r3 = r12.f105113c
            r7 = r11
            r8 = r12
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.q.b(kel.n, com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker, java.util.List, xi0.b):del.a");
    }
}
