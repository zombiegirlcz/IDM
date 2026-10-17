package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements iwk.g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200462a;

    public b(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200462a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        o7.d dVar = this.f200462a;
        x3h.a aVar = (x3h.a) dVar.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.r rVar = stats.f;
        Double d = rVar.f4633a;
        dj0.d dVar2 = rVar.f4634b;
        Double d5 = rVar.f4635c;
        CellDetailsDelegate.Model[] elements = {d != null ? new CellDetailsDelegate.Model("STATS_DIVIDEND_YIELD", new TextLocalisedClause(R$string.wealth_details_section_stats_dividend_yield, null, null, 14), aVar.a(d.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, dVar2 != null ? new CellDetailsDelegate.Model("STATS_DIVIDEND_PER_SHARE", new TextLocalisedClause(R$string.wealth_stock_details_stats_per_share_dividend_information_info_per_share_title, null, null, 14), dVar.p(dVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null, d5 != null ? new CellDetailsDelegate.Model("STATS_DIVIDEND_PAYOUT_RATIO", new TextLocalisedClause(R$string.wealth_stock_details_stats_per_share_dividend_information_payout_ratio, null, null, 14), aVar.c(d5.doubleValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}
