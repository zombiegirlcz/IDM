package wt5;

import d9.e1;
import dj0.d;
import ej0.b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pyd.c;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static BigDecimal a(d dVar, d dVar2, ArrayList pnls, ArrayList averagePriceToQuantity) {
        Intrinsics.checkNotNullParameter(pnls, "pnls");
        Intrinsics.checkNotNullParameter(averagePriceToQuantity, "averagePriceToQuantity");
        ArrayList arrayList = new ArrayList(w.t(pnls, 10));
        Iterator it8 = pnls.iterator();
        while (it8.hasNext()) {
            arrayList.add(((b) it8.next()).f126704b);
        }
        Set setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(averagePriceToQuantity, 10));
        Iterator it9 = averagePriceToQuantity.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((b) ((Pair) it9.next()).f186385a).f126704b);
        }
        Set setI12 = d0.i1(arrayList2);
        if (setI1.size() != 1 || setI12.size() != 1 || !Intrinsics.f(d0.a0(setI1), d0.a0(setI12))) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        b.Companion.getClass();
        b bVarU = b.f126702c;
        int i = 0;
        for (Object obj2 : averagePriceToQuantity) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            if (i == 0) {
                Pair pair = (Pair) obj2;
                bVarU = mif.a.x((b) pair.f186385a, ((Number) pair.f186386b).doubleValue());
            } else {
                Pair pair2 = (Pair) obj2;
                bVarU = mif.a.u(bVarU, mif.a.x((b) pair2.f186385a, ((Number) pair2.f186386b).doubleValue()));
            }
            i = i2;
        }
        b bVarC = c(pnls);
        d[] elements = {dVar, dVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList<d> arrayList3 = new ArrayList();
        for (Object obj3 : listL) {
            if (!((d) obj3).k()) {
                arrayList3.add(obj3);
            }
        }
        b other = bVarU;
        for (d dVar3 : arrayList3) {
            if (!Intrinsics.f(bVarU.f126704b, dVar3.f115083b)) {
                BigDecimal ZERO2 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                return ZERO2;
            }
            other = mif.a.u(other, new b(c.Y(dVar3), dVar3.f115083b));
        }
        BigDecimal bigDecimal = other.f126703a;
        if (e1.I(bigDecimal)) {
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            Intrinsics.h(bigDecimal2);
            return bigDecimal2;
        }
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal3) <= 0) {
            Intrinsics.h(bigDecimal3);
            return bigDecimal3;
        }
        Intrinsics.checkNotNullParameter(bVarC, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalDivide = bVarC.f126703a.divide(bigDecimal, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    public static BigDecimal b(b currentPrice, b averagePrice) {
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(averagePrice, "averagePrice");
        xi0.b bVar = currentPrice.f126704b;
        xi0.b bVar2 = averagePrice.f126704b;
        BigDecimal bigDecimal = averagePrice.f126703a;
        if (!Intrinsics.f(bVar, bVar2)) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal ZERO2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(ZERO2) == 0) {
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            return ZERO2;
        }
        BigDecimal bigDecimalDivide = currentPrice.f126703a.divide(bigDecimal, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(1L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalSubtract = bigDecimalDivide.subtract(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public static b c(ArrayList pnls) {
        Intrinsics.checkNotNullParameter(pnls, "pnls");
        ArrayList arrayList = new ArrayList(w.t(pnls, 10));
        Iterator it8 = pnls.iterator();
        while (it8.hasNext()) {
            arrayList.add(((b) it8.next()).f126704b);
        }
        if (d0.i1(arrayList).size() != 1) {
            b.Companion.getClass();
            return b.f126702c;
        }
        b.Companion.getClass();
        b bVarU = b.f126702c;
        int i = 0;
        for (Object obj2 : pnls) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            bVarU = i == 0 ? (b) obj2 : mif.a.u(bVarU, (b) obj2);
            i = i2;
        }
        return bVarU;
    }

    public static b d(b currentPrice, b averagePrice, double d) {
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(averagePrice, "averagePrice");
        if (Intrinsics.f(currentPrice.f126704b, averagePrice.f126704b)) {
            return mif.a.x(mif.a.r(currentPrice, averagePrice), d);
        }
        b.Companion.getClass();
        return b.f126702c;
    }
}
