package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements iwk.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200467a;

    public f(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200467a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        o7.d dVar = this.f200467a;
        x3h.a aVar = (x3h.a) dVar.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.u uVar = stats.d;
        dj0.d dVar2 = uVar.f4649a;
        Long l2 = uVar.f4650b;
        Long l3 = uVar.f4651c;
        CellDetailsDelegate.Model[] elements = {dVar2 != null ? new CellDetailsDelegate.Model("MARKET_CAPITALISATION_MARKET_CAP_STAT_ID", new TextLocalisedClause(R$string.wealth_details_section_stats_market_cap, null, null, 14), dVar.v(dVar2), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null, l2 != null ? new CellDetailsDelegate.Model("MARKET_CAPITALISATION_SHARES_OUTSTANDING_STAT_ID", new TextLocalisedClause(R$string.wealth_stock_details_stats_price_volume_market_shares_outstanding, null, null, 14), aVar.e(l2.longValue()), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null, l3 != null ? new CellDetailsDelegate.Model("MARKET_CAPITALISATION_FLOAT_STAT_ID", new TextLocalisedClause(R$string.wealth_stock_details_stats_price_volume_market_float, null, null, 14), aVar.e(l3.longValue()), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }

    @Override // iwk.g
    public final List c(afl.q stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.m mVar = stats.f4629c;
        List listL = null;
        if (mVar != null) {
            dj0.d dVar = mVar.f4614a;
            dj0.d dVar2 = mVar.f4615b;
            o7.d dVar3 = this.f200467a;
            CellDetailsDelegate.Model[] elements = {dVar != null ? new CellDetailsDelegate.Model("MARKET_CAPITALISATION_ASSETS_UNDER_MANAGEMENT_STAT_ID", new TextLocalisedClause(R$string.wealth_details_section_stats_glossary_assets_under_management_title, null, null, 14), dVar3.v(dVar), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null, dVar2 != null ? new CellDetailsDelegate.Model("MARKET_CAPITALISATION_NET_ASSETS_VALUE_STAT_ID", new TextLocalisedClause(R$string.wealth_details_section_stats_glossary_eea_net_asset_value_title, null, null, 14), dVar3.v(dVar2), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
            iwk.g.d(listL);
        }
        return listL == null ? zhm.f0.f322471a : listL;
    }
}
