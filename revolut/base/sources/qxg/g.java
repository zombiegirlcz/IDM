package qxg;

import aw0.k7;
import aw0.o9;
import aw0.wa;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import d9.e1;
import ip0.nb0;
import ip0.pb0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import oxg.l;
import rxg.j;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f250094a;

    public g(b complexAnalyticsPerformanceAssetMapper) {
        Intrinsics.checkNotNullParameter(complexAnalyticsPerformanceAssetMapper, "complexAnalyticsPerformanceAssetMapper");
        this.f250094a = complexAnalyticsPerformanceAssetMapper;
    }

    public static ArrayList b() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.n("complex-analytics-performance-contributor-", it8.nextInt()), false, 0, false, 28));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final ArrayList a(List list, boolean z, boolean z3) {
        BigDecimal bigDecimalAbs;
        Clause clauseM;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            j jVar = (j) obj2;
            String strN = a0.d.n("complex-analytics-performance-contributor-", i);
            b bVar = this.f250094a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(bVar.a(jVar), null, null, false, null, false, 60);
            Clause clauseB = bVar.b(jVar);
            Clause clauseC = bVar.c(jVar);
            BigDecimal bigDecimalA = jVar.a();
            PercentageClause.Format.Custom custom = new PercentageClause.Format.Custom(2, 6, null, wa.SHOW_ALL_ZEROES, null);
            if (z3) {
                bigDecimalAbs = bigDecimalA;
            } else {
                bigDecimalAbs = bigDecimalA.abs();
                Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            }
            if (e1.I(bigDecimalA)) {
                clauseM = new PercentageClause(bigDecimalA, custom, (Style) null, 4);
            } else {
                Pair pair = e1.G(bigDecimalA) ? new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_up), Integer.valueOf(R$attr.uikit_colorPerformancePositive)) : new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_down), Integer.valueOf(R$attr.uikit_colorPerformanceNegative));
                int iIntValue = ((Number) pair.f186385a).intValue();
                int iIntValue2 = ((Number) pair.f186386b).intValue();
                List listK = v.k(new ImageClause(iIntValue, Integer.valueOf(iIntValue2), (Float) null, (Float) null, 28), new PercentageClause(bigDecimalAbs, custom, new Custom(Integer.valueOf(iIntValue2), false, null, false, null, 254)));
                m70.a.t(t0.f186434a);
                clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK);
            }
            RowDelegate.Model.c.b bVar2 = new RowDelegate.Model.c.b(clauseM, z ? new MoneyClause(jVar.d(), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 6), null, null, 12) : null, null, false, 124);
            l.Companion.getClass();
            arrayList.add(new RowDelegate.Model(strN, image40, clauseB, null, 0, clauseC, null, null, 0, bVar2, false, null, false, null, null, null, null, null, null, oxg.f.a(jVar), null, 0, 0, 0, 0, 532675544));
            i = i2;
        }
        return arrayList;
    }
}
