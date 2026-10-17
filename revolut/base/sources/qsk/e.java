package qsk;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.retail.wealth.resources.R$string;
import ip0.g3;
import ip0.h3;
import ip0.i3;
import ip0.v3;
import ip0.w3;
import ip0.y3;
import ip0.z3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.sequences.Sequence;
import zhm.d0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f248872a = new TextClause("--", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    public static class a {
    }

    public static uqk.d i(List list, i3 i3Var) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i3Var != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                uqk.d dVar = (uqk.d) next;
                if (dVar.f282208b == i3Var.f164633a && Intrinsics.f(dVar.f282209c, i3Var.f164634b)) {
                    break;
                }
            }
            uqk.d dVar2 = (uqk.d) next;
            if (dVar2 != null) {
                return dVar2;
            }
        }
        return (uqk.d) d0.m0(list);
    }

    public static List l() {
        AnalyticsContext analyticsContext = null;
        int i = 12;
        return v.k(new FixedTabs.Item("ANNUAL_TAB", new TextLocalisedClause(R$string.wealth_trading_instrument_financials_tabs_annual, null, null, 14), analyticsContext, i), new FixedTabs.Item("QUARTERLY_TAB", new TextLocalisedClause(R$string.wealth_trading_instrument_financials_tabs_quarterly, null, null, 14), analyticsContext, i));
    }

    public static z3 o(dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        z3.Companion.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        return new z3(value.f115082a, w3.DEFAULT, y3.DEFAULT);
    }

    public static MoneyClause r(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, o9.NON_SENSITIVE, 4);
    }

    public static void t(a series) {
        Intrinsics.checkNotNullParameter(series, "series");
        throw new IllegalStateException(("Unexpected series: " + series).toString());
    }

    public abstract CompositeClause a(uqk.d dVar);

    public abstract String b();

    public abstract l c();

    public abstract xi0.b d(List list);

    public abstract String e();

    public abstract TextLocalisedClause f();

    public abstract Sequence g();

    public abstract Map h();

    public abstract Map j(Object obj2);

    public abstract uqk.l k();

    public abstract Clause m(uqk.d dVar, a aVar);

    public final v3 n(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = (String) h().get(aVar);
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        return new v3(str);
    }

    public abstract ArrayList p(List list);

    public final h3 q(Object obj2, int i, Integer num) {
        g3 g3Var = h3.Companion;
        i3 i3Var = new i3(i, num);
        TextClause textClause = num == null ? new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(a0.d.g(num.intValue(), i % 100, "Q", "'"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Map mapJ = j(obj2);
        ArrayList arrayList = new ArrayList(mapJ.size());
        for (Map.Entry entry : mapJ.entrySet()) {
            arrayList.add(new Pair(n((a) entry.getKey()), (z3) entry.getValue()));
        }
        Map mapT = r0.t(arrayList);
        g3Var.getClass();
        return g3.a(i3Var, textClause, mapT);
    }

    public abstract TextLocalisedClause s(a aVar);
}
