package uoh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.retail.wealth.resources.R$string;
import hph.j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import soh.i;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static TextLocalisedClause d(int i) {
        return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
    }

    public final soh.d a() {
        zel.g gVar = zel.g.PRICE_CHANGE_52W_HIGH;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_52w_high_distance_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_52w_high_distance_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.c(new BigDecimal("-0.5"), new BigDecimal("-0.2"), new BigDecimal("-0.05"), new BigDecimal("0.0"), new BigDecimal("0.1"), new BigDecimal("0.3")));
    }

    public final soh.d b() {
        zel.g gVar = zel.g.PRICE_CHANGE_52W_LOW;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_52w_low_distance_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_52w_low_distance_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.c(new BigDecimal("0.05"), new BigDecimal("0.1"), new BigDecimal("0.2"), new BigDecimal("0.4"), new BigDecimal("0.6"), new BigDecimal("0.8")));
    }

    public final ScreenerFilter$Options c(zel.e config) {
        Pair pair;
        Intrinsics.checkNotNullParameter(config, "config");
        List list = config.f;
        if (ue0.e.n(list)) {
            return null;
        }
        soh.b bVar = soh.e.Companion;
        zel.g gVar = zel.g.UNDERLYING_ASSET_TYPE;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_subtitle, null, null, 14);
        List list2 = list == null ? f0.f322471a : list;
        ArrayList<Pair> arrayList = new ArrayList();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            switch (b.f281651a[((zel.j) it8.next()).ordinal()]) {
                case 1:
                    pair = new Pair(d(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_header_1), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_description_1, null, null, 14));
                    break;
                case 2:
                    pair = new Pair(d(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_header_5), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_description_5, null, null, 14));
                    break;
                case 3:
                    pair = new Pair(d(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_header_3), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_description_3, null, null, 14));
                    break;
                case 4:
                    pair = new Pair(d(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_header_4), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_description_4, null, null, 14));
                    break;
                case 5:
                    pair = new Pair(d(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_header_6), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_description_6, null, null, 14));
                    break;
                case 6:
                    pair = new Pair(d(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_header_2), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_cfd_breakdown_description_2, null, null, 14));
                    break;
                case 7:
                case 8:
                    pair = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (Pair pair2 : arrayList) {
            arrayList2.add(new TextLocalisedClause(R$string.instrument_metric_info_dialog_format, v.k((Clause) pair2.f186385a, (Clause) pair2.f186386b), null, 12));
        }
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(textLocalisedClause, textLocalisedClause2, yoj.b.m(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList2));
        soh.c cVar = soh.c.CHIPS;
        if (list == null) {
            list = f0.f322471a;
        }
        Map mapK = r0.k(new Pair(zel.j.STOCK, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_stocks)), new Pair(zel.j.COMMODITY, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_commodities)), new Pair(zel.j.INDEX, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_index)), new Pair(zel.j.CRYPTO, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_crypto)), new Pair(zel.j.ETF, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_etf)), new Pair(zel.j.BOND, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_bonds)));
        bVar.getClass();
        return soh.b.a(gVar, textLocalisedClauseA, dialog, cVar, list, mapK, null);
    }
}
