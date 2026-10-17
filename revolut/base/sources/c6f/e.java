package c6f;

import aw0.bb;
import aw0.cb;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import hw0.k;
import hw0.x;
import hw0.z;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p6f.g;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements a {
    @Override // c6f.a
    public final cb a(g gVar) {
        cb cbVarC;
        p6f.f chart = (p6f.f) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Object objD0 = d0.d0(chart.e);
        Object objO0 = d0.o0(chart.e);
        if (objD0 == null || objO0 == null) {
            cbVarC = null;
        } else {
            dj0.d dVar = ((p6f.b) objO0).f233259b;
            dj0.d dVar2 = ((p6f.b) objD0).f233259b;
            if (dVar.compareTo(dVar2) > 0) {
                cb.Companion.getClass();
                cbVarC = bb.d();
            } else if (dVar.compareTo(dVar2) < 0) {
                cb.Companion.getClass();
                cbVarC = bb.b();
            } else {
                cb.Companion.getClass();
                cbVarC = bb.c();
            }
        }
        if (cbVarC != null) {
            return cbVarC;
        }
        cb.Companion.getClass();
        return bb.c();
    }

    @Override // c6f.a
    public final ArrayList b(g gVar) {
        p6f.f chart = (p6f.f) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        int size = chart.e.size();
        MathContext DECIMAL128 = MathContext.DECIMAL128;
        Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
        BigDecimal bigDecimal = new BigDecimal(size, DECIMAL128);
        ArrayList arrayList = chart.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            float fFloatValue = pyd.c.x(((p6f.b) obj2).f233259b).floatValue();
            MathContext DECIMAL1282 = MathContext.DECIMAL128;
            Intrinsics.checkNotNullExpressionValue(DECIMAL1282, "DECIMAL128");
            arrayList2.add(new k((String) null, fFloatValue, new BigDecimal(i, DECIMAL1282).divide(bigDecimal, DECIMAL1282).floatValue(), (iw0.a) null, (Object) null, (Clause) null, 49));
            i = i2;
        }
        return arrayList2;
    }

    @Override // c6f.a
    public final x c(g gVar) {
        p6f.f chart = (p6f.f) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        p6f.b bVar = (p6f.b) d0.d0(chart.e);
        if (bVar != null) {
            return new x(pyd.c.x(bVar.f233259b).floatValue(), BitmapDescriptorFactory.HUE_RED, new MoneyClause(bVar.f233259b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, false, false, null, 2042);
        }
        return null;
    }

    @Override // c6f.a
    public final z d(g gVar, f yAxisBadgeCalculationsStrategy) {
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d dVar3;
        p6f.f chart = (p6f.f) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(yAxisBadgeCalculationsStrategy, "yAxisBadgeCalculationsStrategy");
        Iterator it8 = chart.e.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        p6f.b bVar = (p6f.b) it8.next();
        int i = d.f21800a[yAxisBadgeCalculationsStrategy.ordinal()];
        if (i == 1) {
            dVar = bVar.f233259b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = (dj0.d) cim.c.l(bVar.f233259b, bVar.f233260c);
        }
        while (true) {
            dj0.d dVar4 = dVar;
            while (it8.hasNext()) {
                p6f.b bVar2 = (p6f.b) it8.next();
                int i2 = d.f21800a[yAxisBadgeCalculationsStrategy.ordinal()];
                if (i2 == 1) {
                    dVar = bVar2.f233259b;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = (dj0.d) cim.c.l(bVar2.f233259b, bVar2.f233260c);
                }
                dVar4.getClass();
                if (dVar4.compareTo(dVar) > 0) {
                    break;
                }
            }
            Iterator it9 = chart.e.iterator();
            if (!it9.hasNext()) {
                throw new NoSuchElementException();
            }
            p6f.b bVar3 = (p6f.b) it9.next();
            int i3 = d.f21800a[yAxisBadgeCalculationsStrategy.ordinal()];
            if (i3 == 1) {
                dVar2 = bVar3.f233259b;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar2 = (dj0.d) cim.c.k(bVar3.f233259b, bVar3.f233260c);
            }
            while (it9.hasNext()) {
                p6f.b bVar4 = (p6f.b) it9.next();
                int i5 = d.f21800a[yAxisBadgeCalculationsStrategy.ordinal()];
                if (i5 == 1) {
                    dVar3 = bVar4.f233259b;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar3 = (dj0.d) cim.c.k(bVar4.f233259b, bVar4.f233260c);
                }
                dVar2.getClass();
                if (dVar2.compareTo(dVar3) < 0) {
                    dVar2 = dVar3;
                }
            }
            dj0.d dVar5 = dVar2;
            return new z(ms0.v.WhiteTransparentBackground, false, true, v.k(new hw0.a(pyd.c.x(dVar4).floatValue(), new MoneyClause(dVar4, new MoneyClause.Format.Shorts(false, 63), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8)), new hw0.a(pyd.c.x(dVar5).floatValue(), new MoneyClause(dVar5, new MoneyClause.Format.Shorts(false, 63), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8))));
        }
    }

    @Override // c6f.a
    public final List e(g gVar) {
        p6f.f chart = (p6f.f) gVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        ArrayList arrayList = chart.e;
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        int size = arrayList.size();
        MathContext DECIMAL128 = MathContext.DECIMAL128;
        Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
        BigDecimal bigDecimal = new BigDecimal(size, DECIMAL128);
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            float fFloatValue = pyd.c.x(((p6f.b) obj2).f233260c).floatValue();
            MathContext DECIMAL1282 = MathContext.DECIMAL128;
            Intrinsics.checkNotNullExpressionValue(DECIMAL1282, "DECIMAL128");
            arrayList2.add(new k((String) null, fFloatValue, new BigDecimal(i, DECIMAL1282).divide(bigDecimal, DECIMAL1282).floatValue(), (iw0.a) null, (Object) null, (Clause) null, 49));
            i = i2;
        }
        return u.c(new hw0.d((List) arrayList2, false, R$attr.uikit_colorDeepGrey, 12));
    }
}
