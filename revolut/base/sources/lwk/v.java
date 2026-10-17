package lwk;

import afl.t0;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements iwk.g {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200478a;

    public v(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200478a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.w wVar = stats.f4571b;
        dj0.d dVar = wVar.f4655a;
        t0 t0Var = wVar.f4656b;
        t0 t0Var2 = wVar.f4657c;
        t0 t0Var3 = wVar.d;
        Double d = wVar.e;
        o7.d dVar2 = this.f200478a;
        CellDetailsDelegate.Model[] elements = {dVar != null ? new CellDetailsDelegate.Model("STATS_PRICE_1D_OPEN", new TextLocalisedClause(R$string.wealth_details_section_stats_open, null, null, 14), dVar2.p(dVar), 0, null, null, null, null, null, false, 0, 0, 32760) : null, t0Var != null ? new CellDetailsDelegate.Model("STATS_PRICE_1D_RANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_day_range, null, null, 14), dVar2.r(t0Var), 0, null, null, null, null, null, false, 0, 0, 32760) : null, t0Var2 != null ? new CellDetailsDelegate.Model("STATS_PRICE_52W_RANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_fifty_two_week_range, null, null, 14), dVar2.r(t0Var2), 0, null, null, null, null, null, false, 0, 0, 32760) : null, t0Var3 != null ? new CellDetailsDelegate.Model("STATS_PRICE_5Y_RANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_five_year_range, null, null, 14), dVar2.r(t0Var3), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d != null ? new CellDetailsDelegate.Model("STATS_PRICE_BETA", new TextLocalisedClause(R$string.wealth_details_section_stats_beta_five_year_monthly, null, null, 14), ((x3h.a) dVar2.f222642b).c(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }

    @Override // iwk.g
    public final List b(afl.f stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.c cVar = stats.f4594c;
        ej0.b bVar = cVar.f4582c;
        CellDetailsDelegate.Model model = bVar != null ? new CellDetailsDelegate.Model("STATS_PRICE_ACCRUED_INTEREST", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_price_accruedInterest, null, null, 14), new AssetClause(bVar.f126703a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, ScaleMode.TradingPrecise.f51443a, false, false, 5)), bVar.f126704b.f306286a, null, o9.NON_SENSITIVE, 8), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        ej0.b bVar2 = cVar.f4580a;
        o7.d dVar = this.f200478a;
        CellDetailsDelegate.Model model2 = bVar2 != null ? new CellDetailsDelegate.Model("STATS_PRICE_CLEAN_PRICE", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_price_cleanPrice, null, null, 14), dVar.t(bVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
        ej0.b bVar3 = cVar.f4581b;
        CellDetailsDelegate.Model[] elements = {model, model2, bVar3 != null ? new CellDetailsDelegate.Model("STATS_PRICE_DIRTY_PRICE", new TextLocalisedClause(R$string.trading_bonds_stats_dictionary_price_dirtyPrice, null, null, 14), dVar.t(bVar3), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = (List) ue0.e.M(kotlin.collections.d.L(elements));
        if (list == null) {
            return zhm.f0.f322471a;
        }
        iwk.g.d(list);
        return list;
    }

    @Override // iwk.g
    public final List c(afl.q stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.n nVar = stats.f4628b;
        if (nVar == null) {
            return zhm.f0.f322471a;
        }
        dj0.d dVar = nVar.f4617a;
        t0 t0Var = nVar.f4618b;
        t0 t0Var2 = nVar.f4619c;
        t0 t0Var3 = nVar.d;
        Double d = nVar.e;
        o7.d dVar2 = this.f200478a;
        CellDetailsDelegate.Model[] elements = {dVar != null ? new CellDetailsDelegate.Model("STATS_PRICE_DAILYOPENPRICE", new TextLocalisedClause(R$string.wealth_details_section_stats_open, null, null, 14), dVar2.p(dVar), 0, null, null, null, null, null, false, 0, 0, 32760) : null, t0Var != null ? new CellDetailsDelegate.Model("STATS_PRICE_DAYRANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_day_range, null, null, 14), dVar2.r(t0Var), 0, null, null, null, null, null, false, 0, 0, 32760) : null, t0Var2 != null ? new CellDetailsDelegate.Model("STATS_PRICE_FIFTYTWOWEEKRANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_fifty_two_week_range, null, null, 14), dVar2.r(t0Var2), 0, null, null, null, null, null, false, 0, 0, 32760) : null, t0Var3 != null ? new CellDetailsDelegate.Model("STATS_PRICE_FIVEYEARRANGE", new TextLocalisedClause(R$string.wealth_details_section_stats_five_year_range, null, null, 14), dVar2.r(t0Var3), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d != null ? new CellDetailsDelegate.Model("STATS_PRICE_BETA", new TextLocalisedClause(R$string.wealth_details_section_stats_beta_five_year_monthly, null, null, 14), ((x3h.a) dVar2.f222642b).c(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}
