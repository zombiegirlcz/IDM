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
import qsk.f;
import qsk.l;
import zhm.d0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uqk.l f248876b = uqk.l.CASH_FLOWS;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f248877c = r0.k(new Pair(f.c.f248875a, "CashFlowSeries.Operating"), new Pair(f.b.f248874a, "CashFlowSeries.Investing"), new Pair(f.a.f248873a, "CashFlowSeries.Financing"));
    public final String d = "BARCHART_CASHFLOW";

    @Override // qsk.e
    public final CompositeClause a(uqk.d dVar) {
        dj0.d dVar2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_instrument_financials_cash_flow_free_cash_flow, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        uqk.b bVar = dVar.f;
        Clause moneyClause = (bVar == null || (dVar2 = bVar.d) == null) ? this.f248872a : new MoneyClause(dVar2, new MoneyClause.Format.Shorts(false, 63), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE);
        m70.a.t(t0.f186434a);
        return new CompositeClause(v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), moneyClause), null, null, null, 14);
    }

    @Override // qsk.e
    public final String b() {
        return this.d;
    }

    @Override // qsk.e
    public final l c() {
        return l.b.f248883a;
    }

    @Override // qsk.e
    public final xi0.b d(List list) {
        xi0.b bVar;
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d dVar3;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            uqk.b bVar2 = ((uqk.d) it8.next()).f;
            if (bVar2 == null || (dVar3 = bVar2.f282201a) == null || (bVar = dVar3.f115083b) == null) {
                bVar = (bVar2 == null || (dVar2 = bVar2.f282203c) == null) ? (bVar2 == null || (dVar = bVar2.f282202b) == null) ? null : dVar.f115083b : dVar2.f115083b;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        xi0.b bVar3 = (xi0.b) d0.d0(d0.U(arrayList));
        if (bVar3 != null) {
            return bVar3;
        }
        dj0.d.Companion.getClass();
        return dj0.d.f115081c;
    }

    @Override // qsk.e
    public final String e() {
        return "cash-flow-see-all";
    }

    @Override // qsk.e
    public final TextLocalisedClause f() {
        return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_cash_flow_title, null, null, 14);
    }

    @Override // qsk.e
    public final Sequence g() {
        f[] elements = {f.c.f248875a, f.b.f248874a, f.a.f248873a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // qsk.e
    public final Map h() {
        return this.f248877c;
    }

    @Override // qsk.e
    public final Map j(Object obj2) {
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d dVar3;
        uqk.b bVar = (uqk.b) obj2;
        z3 z3VarO = null;
        Pair pair = new Pair(f.a.f248873a, (bVar == null || (dVar3 = bVar.f282203c) == null) ? null : e.o(dVar3));
        Pair pair2 = new Pair(f.b.f248874a, (bVar == null || (dVar2 = bVar.f282202b) == null) ? null : e.o(dVar2));
        if (bVar != null && (dVar = bVar.f282201a) != null) {
            z3VarO = e.o(dVar);
        }
        return r0.k(pair, pair2, new Pair(f.c.f248875a, z3VarO));
    }

    @Override // qsk.e
    public final uqk.l k() {
        return this.f248876b;
    }

    @Override // qsk.e
    public final Clause m(uqk.d dVar, e.a series) {
        dj0.d dVar2;
        dj0.d dVar3;
        dj0.d dVar4;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(series, "series");
        MoneyClause moneyClauseR = null;
        if (!(series instanceof f)) {
            e.t(series);
            throw null;
        }
        f fVar = (f) series;
        if (fVar.equals(f.c.f248875a)) {
            uqk.b bVar = dVar.f;
            if (bVar != null && (dVar4 = bVar.f282201a) != null) {
                moneyClauseR = e.r(dVar4);
            }
        } else if (fVar.equals(f.b.f248874a)) {
            uqk.b bVar2 = dVar.f;
            if (bVar2 != null && (dVar3 = bVar2.f282202b) != null) {
                moneyClauseR = e.r(dVar3);
            }
        } else {
            if (!fVar.equals(f.a.f248873a)) {
                throw new NoWhenBranchMatchedException();
            }
            uqk.b bVar3 = dVar.f;
            if (bVar3 != null && (dVar2 = bVar3.f282203c) != null) {
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
            arrayList.add(q(dVar.f, dVar.f282208b, dVar.f282209c));
        }
        return arrayList;
    }

    @Override // qsk.e
    public final TextLocalisedClause s(e.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!(aVar instanceof f)) {
            e.t(aVar);
            throw null;
        }
        f fVar = (f) aVar;
        if (fVar.equals(f.c.f248875a)) {
            return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_cash_flow_operating, null, null, 14);
        }
        if (fVar.equals(f.b.f248874a)) {
            return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_cash_flow_investing, null, null, 14);
        }
        if (fVar.equals(f.a.f248873a)) {
            return new TextLocalisedClause(R$string.wealth_trading_instrument_financials_cash_flow_financing, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
