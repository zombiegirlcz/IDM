package qsk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import ip0.z3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.sequences.Sequence;
import qsk.e;
import qsk.i;
import qsk.l;
import zhm.d0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uqk.l f248880b = uqk.l.INCOME_STATEMENT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f248881c = r0.k(new Pair(i.b.f248879a, "IncomeStatementSeries.Revenue"), new Pair(i.a.f248878a, "IncomeStatementSeries.NetIncome"));
    public final String d = "BARCHART_INCOMESTATEMENT";

    @Override // qsk.e
    public final CompositeClause a(uqk.d dVar) {
        Double d;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_instrument_financials_income_profit_margin, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        uqk.c cVar = dVar.d;
        TextClause textClause = (cVar == null || (d = cVar.f282206c) == null) ? this.f248872a : new TextClause(a0.d.v(new Object[]{Double.valueOf(d.doubleValue() * ((double) 100))}, 1, "%.2f%%", "format(...)"), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        m70.a.t(t0.f186434a);
        return new CompositeClause(v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause), null, null, null, 14);
    }

    @Override // qsk.e
    public final String b() {
        return this.d;
    }

    @Override // qsk.e
    public final l c() {
        return l.c.f248884a;
    }

    @Override // qsk.e
    public final xi0.b d(List list) {
        xi0.b bVar;
        dj0.d dVar;
        dj0.d dVar2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            uqk.c cVar = ((uqk.d) it8.next()).d;
            if (cVar == null || (dVar2 = cVar.f282204a) == null || (bVar = dVar2.f115083b) == null) {
                bVar = (cVar == null || (dVar = cVar.f282205b) == null) ? null : dVar.f115083b;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        xi0.b bVar2 = (xi0.b) d0.d0(d0.U(arrayList));
        if (bVar2 != null) {
            return bVar2;
        }
        dj0.d.Companion.getClass();
        return dj0.d.f115081c;
    }

    @Override // qsk.e
    public final String e() {
        return "income-statement-see-all";
    }

    @Override // qsk.e
    public final TextLocalisedClause f() {
        return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_income_title, null, null, 14);
    }

    @Override // qsk.e
    public final Sequence g() {
        i[] elements = {i.b.f248879a, i.a.f248878a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // qsk.e
    public final Map h() {
        return this.f248881c;
    }

    @Override // qsk.e
    public final Map j(Object obj2) {
        dj0.d dVar;
        dj0.d dVar2;
        uqk.c cVar = (uqk.c) obj2;
        z3 z3VarO = null;
        Pair pair = new Pair(i.b.f248879a, (cVar == null || (dVar2 = cVar.f282204a) == null) ? null : e.o(dVar2));
        if (cVar != null && (dVar = cVar.f282205b) != null) {
            z3VarO = e.o(dVar);
        }
        return r0.k(pair, new Pair(i.a.f248878a, z3VarO));
    }

    @Override // qsk.e
    public final uqk.l k() {
        return this.f248880b;
    }

    @Override // qsk.e
    public final Clause m(uqk.d dVar, e.a series) {
        dj0.d dVar2;
        dj0.d dVar3;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(series, "series");
        MoneyClause moneyClauseR = null;
        if (!(series instanceof i)) {
            e.t(series);
            throw null;
        }
        i iVar = (i) series;
        if (iVar.equals(i.b.f248879a)) {
            uqk.c cVar = dVar.d;
            if (cVar != null && (dVar3 = cVar.f282204a) != null) {
                moneyClauseR = e.r(dVar3);
            }
        } else {
            if (!iVar.equals(i.a.f248878a)) {
                throw new NoWhenBranchMatchedException();
            }
            uqk.c cVar2 = dVar.d;
            if (cVar2 != null && (dVar2 = cVar2.f282205b) != null) {
                moneyClauseR = e.r(dVar2);
            }
        }
        return moneyClauseR == null ? this.f248872a : moneyClauseR;
    }

    @Override // qsk.e
    public final ArrayList p(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<uqk.d> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (uqk.d dVar : list2) {
            arrayList.add(q(dVar.d, dVar.f282208b, dVar.f282209c));
        }
        return arrayList;
    }

    @Override // qsk.e
    public final TextLocalisedClause s(e.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!(aVar instanceof i)) {
            e.t(aVar);
            throw null;
        }
        i iVar = (i) aVar;
        if (iVar.equals(i.b.f248879a)) {
            return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_income_revenue, null, null, 14);
        }
        if (iVar.equals(i.a.f248878a)) {
            return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_income_net_income, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
