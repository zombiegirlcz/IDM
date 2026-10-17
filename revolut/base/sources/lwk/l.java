package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements iwk.g {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200473a;

    public l(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200473a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        x3h.a aVar = (x3h.a) this.f200473a.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.t tVar = stats.i;
        Double d = tVar.f4644a;
        Double d5 = tVar.f4645b;
        Double d6 = tVar.f4646c;
        CellDetailsDelegate.Model[] elements = {d != null ? new CellDetailsDelegate.Model("STATS_MANAGEMENT_ROE", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_management_effectiveness_return_equity, null, null, 14), aVar.a(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d5 != null ? new CellDetailsDelegate.Model("STATS_MANAGEMENT_ROA", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_management_effectiveness_return_assets, null, null, 14), aVar.a(d5.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d6 != null ? new CellDetailsDelegate.Model("STATS_MANAGEMENT_ROI", new TextLocalisedClause(R$string.wealth_stock_details_stats_ratios_management_effectiveness_return_investment, null, null, 14), aVar.a(d6.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}
