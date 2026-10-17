package yp9;

import ap9.b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public static long a(long j2, long j3, long j5) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j3);
        MathContext mathContext = MathContext.DECIMAL32;
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, mathContext);
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(j5);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
        return bigDecimalDivide.multiply(bigDecimalValueOf3, mathContext).setScale(0, RoundingMode.DOWN).longValue();
    }

    public static ArrayList b(ap9.f fVar, cp9.a aVar, long j2) {
        long j3;
        long j5;
        int i = g.f315803a[aVar.ordinal()];
        if (i == 1) {
            ArrayList arrayList = fVar.f8125a;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(Long.valueOf(((ap9.g) it8.next()).f8128b));
            }
            return arrayList2;
        }
        int i2 = 0;
        int iNextIndex = -1;
        if (i == 2) {
            ArrayList arrayList3 = fVar.f8125a;
            ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (((ap9.g) listIterator.previous()).d) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            ArrayList arrayList4 = fVar.f8125a;
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            long j16 = j2;
            for (Object obj2 : arrayList4) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                ap9.g gVar = (ap9.g) obj2;
                if (!gVar.d) {
                    j3 = j16;
                    j16 = 0;
                } else if (i2 == iNextIndex && (fVar.f8126b instanceof b.a)) {
                    j3 = j16;
                } else {
                    long jA = a(j2, 100L, gVar.f8128b);
                    j3 = j16 - jA;
                    j16 = jA;
                }
                arrayList5.add(Long.valueOf(j16));
                i2 = i3;
                j16 = j3;
            }
            return arrayList5;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<ap9.g> arrayList6 = fVar.f8125a;
        ListIterator listIterator2 = arrayList6.listIterator(arrayList6.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            }
            if (((ap9.g) listIterator2.previous()).d) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
        for (ap9.g gVar2 : arrayList6) {
            arrayList7.add(Long.valueOf(gVar2.d ? gVar2.f8128b : 0L));
        }
        long jU0 = d0.U0(arrayList7);
        ArrayList arrayList8 = new ArrayList(w.t(arrayList6, 10));
        long j22 = j2;
        for (Object obj3 : arrayList6) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            ap9.g gVar3 = (ap9.g) obj3;
            if (jU0 == 0 || !gVar3.d) {
                j5 = j22;
                j22 = 0;
            } else if (i2 != iNextIndex) {
                long jA2 = a(j2, jU0, gVar3.f8128b);
                j5 = j22 - jA2;
                j22 = jA2;
            } else {
                j5 = j22;
            }
            arrayList8.add(Long.valueOf(j22));
            j22 = j5;
            i2 = i5;
        }
        return arrayList8;
    }
}
