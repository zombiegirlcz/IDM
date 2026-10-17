package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements iwk.g {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200475a;

    public p(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200475a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        o7.d dVar = this.f200475a;
        x3h.a aVar = (x3h.a) dVar.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.u uVar = stats.d;
        dj0.d dVar2 = uVar.f4649a;
        Long l2 = uVar.f4650b;
        Long l3 = uVar.f4651c;
        CellDetailsDelegate.Model[] elements = {dVar2 != null ? new CellDetailsDelegate.Model("STATS_MARKET_CAP", new TextLocalisedClause(R$string.wealth_details_section_stats_market_cap, null, null, 14), dVar.v(dVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null, l2 != null ? new CellDetailsDelegate.Model("STATS_MARKET_OUTSTANDING", new TextLocalisedClause(R$string.wealth_stock_details_stats_price_volume_market_shares_outstanding, null, null, 14), aVar.e(l2.longValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, l3 != null ? new CellDetailsDelegate.Model("STATS_MARKET_FLOAT", new TextLocalisedClause(R$string.wealth_stock_details_stats_price_volume_market_float, null, null, 14), aVar.e(l3.longValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }

    @Override // iwk.g
    public final List c(afl.q stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.m mVar = stats.f4629c;
        if (mVar == null) {
            return zhm.f0.f322471a;
        }
        dj0.d dVar = mVar.f4614a;
        dj0.d dVar2 = mVar.f4615b;
        o7.d dVar3 = this.f200475a;
        CellDetailsDelegate.Model[] elements = {dVar != null ? new CellDetailsDelegate.Model("STATS_MARKET_TOTAL_ASSETS", new TextLocalisedClause(R$string.wealth_details_section_stats_total_assets, null, null, 14), dVar3.v(dVar), 0, null, null, null, null, null, false, 0, 0, 32760) : null, dVar2 != null ? new CellDetailsDelegate.Model("STATS_MARKET_NAV", new TextLocalisedClause(R$string.wealth_details_section_stats_nav, null, null, 14), dVar3.v(dVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}
