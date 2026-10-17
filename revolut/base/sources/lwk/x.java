package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements iwk.g {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200479a;

    public x(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200479a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        x3h.a aVar = (x3h.a) this.f200479a.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.x xVar = stats.f4574h;
        Double d = xVar.f4658a;
        Double d5 = xVar.f4659b;
        Double d6 = xVar.f4660c;
        CellDetailsDelegate.Model[] elements = {d != null ? new CellDetailsDelegate.Model("STATS_PROFITABILITY_GROSS", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_profitability_ratios_gross, null, null, 14), aVar.a(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d5 != null ? new CellDetailsDelegate.Model("STATS_PROFITABILITY_OPERATING", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_profitability_ratios_operating, null, null, 14), aVar.a(d5.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d6 != null ? new CellDetailsDelegate.Model("STATS_PROFITABILITY_NET_PROFIT", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_profitability_ratios_net_profit, null, null, 14), aVar.a(d6.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}
