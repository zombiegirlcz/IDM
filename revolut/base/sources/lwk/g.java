package lwk;

import afl.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements iwk.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200468a;

    public g(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200468a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        CellDetailsDelegate.Model modelI = i(stats.f4571b.f4655a);
        afl.w wVar = stats.f4571b;
        CellDetailsDelegate.Model[] elements = {modelI, h(wVar.f4656b), e(wVar.f4657c), f(wVar.d), g(wVar.e)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }

    @Override // iwk.g
    public final List c(afl.q stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.n nVar = stats.f4628b;
        List listL = null;
        if (nVar != null) {
            CellDetailsDelegate.Model modelI = i(nVar.f4617a);
            CellDetailsDelegate.Model modelH = h(nVar.f4618b);
            t0 t0Var = nVar.f4619c;
            CellDetailsDelegate.Model modelE = t0Var != null ? e(t0Var) : null;
            t0 t0Var2 = nVar.d;
            CellDetailsDelegate.Model modelF = t0Var2 != null ? f(t0Var2) : null;
            Double d = nVar.e;
            CellDetailsDelegate.Model[] elements = {modelI, modelH, modelE, modelF, d != null ? g(d) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
            iwk.g.d(listL);
        }
        return listL == null ? zhm.f0.f322471a : listL;
    }

    public final CellDetailsDelegate.Model e(t0 t0Var) {
        if (t0Var != null) {
            return new CellDetailsDelegate.Model("PRICE_STATS_52_WEEK_RANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_fifty_two_week_range, null, null, 14), this.f200468a.r(t0Var), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        return null;
    }

    public final CellDetailsDelegate.Model f(t0 t0Var) {
        if (t0Var != null) {
            return new CellDetailsDelegate.Model("PRICE_STATS_5_YEAR_RANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_five_year_range, null, null, 14), this.f200468a.r(t0Var), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        return null;
    }

    public final CellDetailsDelegate.Model g(Double d) {
        if (d == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("PRICE_STATS_BETA_5Y_MONTHLY", new TextLocalisedClause(R$string.wealth_details_section_stats_beta_five_year_monthly, null, null, 14), ((x3h.a) this.f200468a.f222642b).c(d.doubleValue()), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final CellDetailsDelegate.Model h(t0 t0Var) {
        if (t0Var != null) {
            return new CellDetailsDelegate.Model("PRICE_STATS_DAY_RANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_day_range, null, null, 14), this.f200468a.r(t0Var), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        return null;
    }

    public final CellDetailsDelegate.Model i(dj0.d dVar) {
        if (dVar != null) {
            return new CellDetailsDelegate.Model("PRICE_STATS_OPEN", new TextLocalisedClause(R$string.wealth_details_section_stats_open, null, null, 14), this.f200468a.p(dVar), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        return null;
    }
}
