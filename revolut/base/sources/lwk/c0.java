package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements iwk.g {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200464a;

    public c0(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200464a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        x3h.a aVar = (x3h.a) this.f200464a.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.y yVar = stats.f4573g;
        Double d = yVar.f4661a;
        Double d5 = yVar.f4662b;
        Double d6 = yVar.f4663c;
        Double d10 = yVar.d;
        CellDetailsDelegate.Model[] elements = {d != null ? new CellDetailsDelegate.Model("STATS_VALUATION_PTE", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_valuation_price_earnings, null, null, 14), aVar.c(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d5 != null ? new CellDetailsDelegate.Model("STATS_VALUATION_PTS", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_valuation_price_sales, null, null, 14), aVar.c(d5.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d6 != null ? new CellDetailsDelegate.Model("STATS_VALUATION_PTB", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_valuation_price_book, null, null, 14), aVar.c(d6.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d10 != null ? new CellDetailsDelegate.Model("STATS_VALUATION_PTC", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_valuation_price_cash_flow, null, null, 14), aVar.c(d10.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}
