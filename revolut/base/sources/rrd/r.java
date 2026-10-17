package rrd;

import aw0.o9;
import aw0.r1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class r {
    public static r1 a(ArrayList dailyBalances, xi0.b currency, int i, Clause title) {
        int i2;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(dailyBalances, "dailyBalances");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(title, "title");
        if (i == -1 || dailyBalances.isEmpty()) {
            return null;
        }
        nzi.g gVar = (nzi.g) d0.b0(dailyBalances);
        nzi.g gVar2 = (nzi.g) d0.e0(i, dailyBalances);
        if (gVar2 == null) {
            return null;
        }
        long j2 = gVar2.f221072b;
        long jF = oc.c.F(gVar2.f221071a);
        q0 q0Var = q0.ONLY_DATE;
        TimeClause timeClause = new TimeClause(jF, new TimeClause.Format.Pretty(q0Var), null, null, 12);
        LocalDate localDate = gVar.f221071a;
        long j3 = gVar.f221072b;
        List listK = v.k(title, timeClause, new TimeClause(oc.c.F(localDate), new TimeClause.Format.Pretty(q0Var), null, null, 12));
        dj0.d dVar = new dj0.d(j2 - j3, currency);
        if (dVar.k()) {
            i2 = R$attr.uikit_colorForeground;
            numValueOf = null;
        } else if (dVar.f(dj0.d.e)) {
            i2 = R$attr.uikit_colorPerformancePositive;
            numValueOf = Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_up);
        } else {
            i2 = R$attr.uikit_colorPerformanceNegative;
            numValueOf = Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_down);
        }
        Clause[] elements = {numValueOf != null ? new ImageClause(numValueOf.intValue(), new ImageClauseTint.Color(i2), (Float) null, (Float) null, 28) : null, new MoneyClause(otd.f.a(dVar).a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(i2), false, false, 254), null, 8)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        return new r1(listK, v.k(new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new MoneyClause(otd.f.a(new dj0.d(j2, currency)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(otd.f.a(new dj0.d(j3, currency)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)));
    }
}
