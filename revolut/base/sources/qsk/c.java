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
import qsk.a;
import qsk.e;
import qsk.l;
import zhm.d0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uqk.l f248869b = uqk.l.BALANCE_SHEET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f248870c = r0.k(new Pair(a.C1361a.f248867a, "BalanceSheetSeries.Assets"), new Pair(a.b.f248868a, "BalanceSheetSeries.Liabilities"));
    public final String d = "BARCHART_BALANCESHEET";

    @Override // qsk.e
    public final CompositeClause a(uqk.d dVar) {
        Double d;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_instrument_financials_balance_sheet_debt_assets, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        uqk.a aVar = dVar.e;
        TextClause textClause = (aVar == null || (d = aVar.f282200c) == null) ? this.f248872a : new TextClause(a0.d.v(new Object[]{Double.valueOf(d.doubleValue() * ((double) 100))}, 1, "%.2f%%", "format(...)"), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        m70.a.t(t0.f186434a);
        return new CompositeClause(v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause), null, null, null, 14);
    }

    @Override // qsk.e
    public final String b() {
        return this.d;
    }

    @Override // qsk.e
    public final l c() {
        return l.a.f248882a;
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
            uqk.a aVar = ((uqk.d) it8.next()).e;
            if (aVar == null || (dVar2 = aVar.f282198a) == null || (bVar = dVar2.f115083b) == null) {
                bVar = (aVar == null || (dVar = aVar.f282199b) == null) ? null : dVar.f115083b;
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
        return "balance-sheet-see-all";
    }

    @Override // qsk.e
    public final TextLocalisedClause f() {
        return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_balance_sheet_title, null, null, 14);
    }

    @Override // qsk.e
    public final Sequence g() {
        a[] elements = {a.C1361a.f248867a, a.b.f248868a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // qsk.e
    public final Map h() {
        return this.f248870c;
    }

    @Override // qsk.e
    public final Map j(Object obj2) {
        dj0.d dVar;
        dj0.d dVar2;
        uqk.a aVar = (uqk.a) obj2;
        z3 z3VarO = null;
        Pair pair = new Pair(a.C1361a.f248867a, (aVar == null || (dVar2 = aVar.f282198a) == null) ? null : e.o(dVar2));
        if (aVar != null && (dVar = aVar.f282199b) != null) {
            z3VarO = e.o(dVar);
        }
        return r0.k(pair, new Pair(a.b.f248868a, z3VarO));
    }

    @Override // qsk.e
    public final uqk.l k() {
        return this.f248869b;
    }

    @Override // qsk.e
    public final Clause m(uqk.d dVar, e.a series) {
        dj0.d dVar2;
        dj0.d dVar3;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(series, "series");
        MoneyClause moneyClauseR = null;
        if (!(series instanceof a)) {
            e.t(series);
            throw null;
        }
        a aVar = (a) series;
        if (aVar.equals(a.C1361a.f248867a)) {
            uqk.a aVar2 = dVar.e;
            if (aVar2 != null && (dVar3 = aVar2.f282198a) != null) {
                moneyClauseR = e.r(dVar3);
            }
        } else {
            if (!aVar.equals(a.b.f248868a)) {
                throw new NoWhenBranchMatchedException();
            }
            uqk.a aVar3 = dVar.e;
            if (aVar3 != null && (dVar2 = aVar3.f282199b) != null) {
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
            arrayList.add(q(dVar.e, dVar.f282208b, dVar.f282209c));
        }
        return arrayList;
    }

    @Override // qsk.e
    public final TextLocalisedClause s(e.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!(aVar instanceof a)) {
            e.t(aVar);
            throw null;
        }
        a aVar2 = (a) aVar;
        if (aVar2.equals(a.C1361a.f248867a)) {
            return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_balance_sheet_total_assets, null, null, 14);
        }
        if (aVar2.equals(a.b.f248868a)) {
            return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_balance_sheet_total_liabilities, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
