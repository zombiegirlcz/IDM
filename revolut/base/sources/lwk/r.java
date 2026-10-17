package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements iwk.g {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200476a;

    public r(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200476a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.v vVar = stats.e;
        dj0.d dVar = vVar.f4652a;
        dj0.d dVar2 = vVar.f4653b;
        dj0.d dVar3 = vVar.f4654c;
        dj0.d dVar4 = vVar.d;
        dj0.d dVar5 = vVar.e;
        o7.d dVar6 = this.f200476a;
        CellDetailsDelegate.Model[] elements = {dVar != null ? new CellDetailsDelegate.Model("STATS_PER_SHARE_EARNINGS", new TextLocalisedClause(R$string.wealth_stock_details_stats_per_share_data_earnings_per_share, null, null, 14), dVar6.p(dVar), 0, null, null, null, null, null, false, 0, 0, 32760) : null, dVar2 != null ? new CellDetailsDelegate.Model("STATS_PER_SHARE_SALES", new TextLocalisedClause(R$string.wealth_stock_details_stats_per_share_data_sales_per_share, null, null, 14), dVar6.p(dVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null, dVar3 != null ? new CellDetailsDelegate.Model("STATS_PER_SHARE_BOOK", new TextLocalisedClause(R$string.wealth_stock_details_stats_per_share_data_book_value_per_share, null, null, 14), dVar6.p(dVar3), 0, null, null, null, null, null, false, 0, 0, 32760) : null, dVar4 != null ? new CellDetailsDelegate.Model("STATS_PER_SHARE_CASH_FLOW", new TextLocalisedClause(R$string.wealth_stock_details_stats_per_share_data_cash_flow_per_share, null, null, 14), dVar6.p(dVar4), 0, null, null, null, null, null, false, 0, 0, 32760) : null, dVar5 != null ? new CellDetailsDelegate.Model("STATS_PER_SHARE_CASH", new TextLocalisedClause(R$string.wealth_stock_details_stats_per_share_data_cash_per_share, null, null, 14), dVar6.p(dVar5), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}
