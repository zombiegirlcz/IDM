package c6f;

import aw0.bb;
import aw0.cb;
import aw0.p9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit_resources.R$attr;
import d9.e1;
import hw0.k;
import hw0.x;
import hw0.z;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p6f.g;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements a {
    public static float f(int i, BigDecimal bigDecimal) {
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        if (bigDecimal.compareTo(bigDecimal2) <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        MathContext DECIMAL128 = MathContext.DECIMAL128;
        Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
        return new BigDecimal(i, DECIMAL128).divide(bigDecimalSubtract, DECIMAL128).floatValue();
    }

    public static hw0.a g(BigDecimal bigDecimal) {
        return new hw0.a(bigDecimal.floatValue(), new PercentageClause(bigDecimal, new PercentageClause.Format.Custom(2, 10, p9.ALWAYS, null, null), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)));
    }

    @Override // c6f.a
    public final cb a(g gVar) {
        BigDecimal bigDecimal;
        p6f.d chart = (p6f.d) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        p6f.a aVar = (p6f.a) d0.o0(chart.f233261a);
        if (aVar == null || (bigDecimal = aVar.f233256b) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) > 0) {
            cb.Companion.getClass();
            return bb.d();
        }
        if (bigDecimal.compareTo(bigDecimal2) < 0) {
            cb.Companion.getClass();
            return bb.b();
        }
        cb.Companion.getClass();
        return bb.c();
    }

    @Override // c6f.a
    public final ArrayList b(g gVar) {
        p6f.d chart = (p6f.d) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        ArrayList arrayList = chart.f233261a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            float fFloatValue = e1.Z(((p6f.a) obj2).f233256b).floatValue();
            int size = chart.f233261a.size();
            MathContext DECIMAL128 = MathContext.DECIMAL128;
            Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
            arrayList2.add(new k((String) null, fFloatValue, f(i, new BigDecimal(size, DECIMAL128)), (iw0.a) null, (Object) null, (Clause) null, 49));
            i = i2;
        }
        return arrayList2;
    }

    @Override // c6f.a
    public final x c(g gVar) {
        p6f.d chart = (p6f.d) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        p6f.a aVar = (p6f.a) d0.d0(chart.f233261a);
        if (aVar == null) {
            return null;
        }
        BigDecimal bigDecimalZ = e1.Z(aVar.f233256b);
        return new x(bigDecimalZ.floatValue(), BitmapDescriptorFactory.HUE_RED, new PercentageClause(bigDecimalZ, (PercentageClause.Format) null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 2), null, null, null, false, false, null, 2042);
    }

    @Override // c6f.a
    public final z d(g gVar, f yAxisBadgeCalculationsStrategy) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimalZ;
        BigDecimal bigDecimalZ2;
        BigDecimal bigDecimal3;
        p6f.d chart = (p6f.d) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(yAxisBadgeCalculationsStrategy, "yAxisBadgeCalculationsStrategy");
        Iterator it8 = chart.f233261a.iterator();
        BigDecimal bigDecimal4 = null;
        if (it8.hasNext()) {
            p6f.a aVar = (p6f.a) it8.next();
            int i = b.f21799a[yAxisBadgeCalculationsStrategy.ordinal()];
            if (i == 1) {
                bigDecimal = aVar.f233256b;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimal5 = aVar.f233256b;
                BigDecimal bigDecimal6 = aVar.d;
                if (bigDecimal6 == null) {
                    bigDecimal6 = bigDecimal5;
                }
                bigDecimal = (BigDecimal) cim.c.k(bigDecimal5, bigDecimal6);
            }
            while (it8.hasNext()) {
                p6f.a aVar2 = (p6f.a) it8.next();
                int i2 = b.f21799a[yAxisBadgeCalculationsStrategy.ordinal()];
                if (i2 == 1) {
                    bigDecimal2 = aVar2.f233256b;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BigDecimal bigDecimal7 = aVar2.f233256b;
                    BigDecimal bigDecimal8 = aVar2.d;
                    if (bigDecimal8 == null) {
                        bigDecimal8 = bigDecimal7;
                    }
                    bigDecimal2 = (BigDecimal) cim.c.k(bigDecimal7, bigDecimal8);
                }
                if (bigDecimal.compareTo(bigDecimal2) < 0) {
                    bigDecimal = bigDecimal2;
                }
            }
        } else {
            bigDecimal = null;
        }
        if (bigDecimal == null || (bigDecimalZ = e1.Z(bigDecimal)) == null) {
            throw new IllegalStateException("Array is empty");
        }
        Iterator it9 = chart.f233261a.iterator();
        if (it9.hasNext()) {
            p6f.a aVar3 = (p6f.a) it9.next();
            int i3 = b.f21799a[yAxisBadgeCalculationsStrategy.ordinal()];
            if (i3 == 1) {
                bigDecimal4 = aVar3.f233256b;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimal9 = aVar3.f233256b;
                BigDecimal bigDecimal10 = aVar3.d;
                if (bigDecimal10 == null) {
                    bigDecimal10 = bigDecimal9;
                }
                bigDecimal4 = (BigDecimal) cim.c.l(bigDecimal9, bigDecimal10);
            }
            while (it9.hasNext()) {
                p6f.a aVar4 = (p6f.a) it9.next();
                int i5 = b.f21799a[yAxisBadgeCalculationsStrategy.ordinal()];
                if (i5 == 1) {
                    bigDecimal3 = aVar4.f233256b;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BigDecimal bigDecimal11 = aVar4.f233256b;
                    BigDecimal bigDecimal12 = aVar4.d;
                    if (bigDecimal12 == null) {
                        bigDecimal12 = bigDecimal11;
                    }
                    bigDecimal3 = (BigDecimal) cim.c.l(bigDecimal11, bigDecimal12);
                }
                if (bigDecimal4.compareTo(bigDecimal3) > 0) {
                    bigDecimal4 = bigDecimal3;
                }
            }
        }
        if (bigDecimal4 == null || (bigDecimalZ2 = e1.Z(bigDecimal4)) == null) {
            throw new IllegalStateException("Array is empty");
        }
        return new z(ms0.v.WhiteTransparentBackground, false, true, v.k(g(bigDecimalZ), g(bigDecimalZ2)));
    }

    @Override // c6f.a
    public final List e(g gVar) {
        p6f.d chart = (p6f.d) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        if (chart.f233261a.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayList = chart.f233261a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            BigDecimal bigDecimal = ((p6f.a) it8.next()).d;
            if (bigDecimal != null) {
                arrayList2.add(bigDecimal);
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(arrayList2.size());
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        int i = 0;
        for (Object obj2 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList3.add(new k((String) null, e1.Z((BigDecimal) obj2).floatValue(), f(i, bigDecimalValueOf), (iw0.a) null, (Object) null, (Clause) null, 49));
            i = i2;
        }
        return arrayList3.size() >= 2 ? u.c(new hw0.d((List) arrayList3, false, R$attr.uikit_colorDeepGrey, 12)) : f0.f322471a;
    }
}
