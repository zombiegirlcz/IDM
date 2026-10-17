package xsk;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.stockdetails.impl.ui.utils.charts.ChartInconsistentCurrenciesException;
import com.revolut.retail.wealth.resources.R$string;
import fuk.i0;
import fuk.j0;
import fuk.k0;
import fuk.l0;
import fuk.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f308569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f308570b;

    public m(p0 commonChartMapper, j tabsBuilder, i revenueGrowthItemBuilder) {
        Intrinsics.checkNotNullParameter(commonChartMapper, "commonChartMapper");
        Intrinsics.checkNotNullParameter(tabsBuilder, "tabsBuilder");
        Intrinsics.checkNotNullParameter(revenueGrowthItemBuilder, "revenueGrowthItemBuilder");
        this.f308569a = commonChartMapper;
        this.f308570b = revenueGrowthItemBuilder;
    }

    public static boolean b(Map map, n nVar) throws Throwable {
        List listK;
        boolean z;
        int i = l.f308568a[nVar.ordinal()];
        if (i == 1) {
            listK = v.k(cel.a.SALES_ANN, cel.a.NET_INCOME_ANN, cel.a.PROFIT_MARGIN_ANN, cel.a.SALES_ANN_GROWTH);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listK = v.k(cel.a.SALES_QTR, cel.a.NET_INCOME_QTR, cel.a.PROFIT_MARGIN_QTR, cel.a.SALES_QTR_GROWTH);
        }
        List list = listK;
        Unit unit = null;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                cel.n nVar2 = (cel.n) map.get((cel.a) it8.next());
                List listA = nVar2 != null ? nVar2.a() : null;
                if (listA == null || listA.isEmpty()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            cel.n nVar3 = (cel.n) map.get((cel.a) it9.next());
            if (nVar3 != null) {
                arrayList.add(nVar3);
            }
        }
        ChartInconsistentCurrenciesException chartInconsistentCurrenciesExceptionS = pu7.a.s(y.s(d0.Q(arrayList), new xrl.a(8)));
        if (chartInconsistentCurrenciesExceptionS != null) {
            hx7.e.n(chartInconsistentCurrenciesExceptionS);
            unit = Unit.f186387a;
        }
        return z && unit == null;
    }

    public final List a(n nVar, Map map, Map map2, g gVar) throws Throwable {
        cel.n nVar2;
        cel.n nVar3;
        cel.n nVar4;
        vrk.g gVar2;
        int[] iArr = l.f308568a;
        int i = iArr[nVar.ordinal()];
        if (i == 1) {
            nVar2 = (cel.n) map.get(cel.a.SALES_ANN);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            nVar2 = (cel.n) map2.get(cel.a.SALES_QTR);
        }
        if (nVar2 == null) {
            return f0.f322471a;
        }
        int i2 = iArr[nVar.ordinal()];
        if (i2 == 1) {
            nVar3 = (cel.n) map.get(cel.a.PROFIT_MARGIN_ANN);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            nVar3 = (cel.n) map2.get(cel.a.PROFIT_MARGIN_QTR);
        }
        if (nVar3 == null) {
            return f0.f322471a;
        }
        int i3 = iArr[nVar.ordinal()];
        if (i3 == 1) {
            nVar4 = (cel.n) map.get(cel.a.NET_INCOME_ANN);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            nVar4 = (cel.n) map2.get(cel.a.NET_INCOME_QTR);
        }
        if (nVar4 == null) {
            return f0.f322471a;
        }
        i0 i0Var = j0.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_details_section_financial_performance_revenue, null, null, 14);
        i0Var.getClass();
        j0 j0VarA = i0.a(nVar2, textLocalisedClause, null);
        j0 j0VarA2 = i0.a(nVar3, new TextLocalisedClause(R$string.wealth_details_section_financial_performance_profit_margin, null, null, 14), null);
        int i5 = iArr[nVar.ordinal()];
        if (i5 == 1) {
            gVar2 = gVar.f308564b;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar2 = gVar.f308565c;
        }
        vrk.g gVar3 = gVar2;
        List listA = this.f308569a.a(new l0("asset-details-fundamentals-", j0VarA, j0VarA2, gVar3, e.f308557a, i0.a(nVar4, new TextLocalisedClause(R$string.wealth_details_section_financial_performance_net_income, null, null, 14), null), k0.SHORT, new MoneyClause.Format.Shorts(false, 63)));
        yp0.b.q(listA, 0, 0, 0, 0, 15);
        return listA;
    }
}
