package uoh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.CountryOption;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.CurrencyOption;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.retail.wealth.resources.R$string;
import hph.j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import soh.i;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static TextLocalisedClause g(int i) {
        return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
    }

    public static CompositeClause h(List list) {
        List<Pair> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Pair pair : list2) {
            arrayList.add(new TextLocalisedClause(R$string.instrument_metric_info_dialog_format, v.k((Clause) pair.f186385a, (Clause) pair.f186386b), null, 12));
        }
        return yoj.b.m(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList);
    }

    public final soh.d a() {
        zel.g gVar = zel.g.ANNUALIZED_RETURN_5Y;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_annualized_return_5y_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_annualized_return_5y_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-0.3");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("0.3"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.d(new BigDecimal("0.0"), new BigDecimal("0.03"), new BigDecimal("0.06"), new BigDecimal("0.09"), new BigDecimal("0.12"), new BigDecimal("0.2")));
    }

    public final ScreenerFilter$Options b() {
        soh.b bVar = soh.e.Companion;
        zel.g gVar = zel.g.DIVIDEND_FREQUENCY;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_dividend_frequency_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_dividend_frequency_info_dialog_subtitle, null, null, 14), null);
        soh.c cVar = soh.c.CHIPS;
        EnumEntries enumEntriesA = a3f.d.a();
        Map mapK = r0.k(new Pair(a3f.d.MONTHLY, Integer.valueOf(R$string.instrument_metric_dividend_frequency_option_monthly)), new Pair(a3f.d.QUARTERLY, Integer.valueOf(R$string.instrument_metric_dividend_frequency_option_quarterly)), new Pair(a3f.d.SEMI_ANNUALLY, Integer.valueOf(R$string.instrument_metric_dividend_frequency_option_semi_annual)), new Pair(a3f.d.ANNUALLY, Integer.valueOf(R$string.instrument_metric_dividend_frequency_option_annual)), new Pair(a3f.d.OTHER, Integer.valueOf(R$string.instrument_metric_dividend_frequency_option_other)));
        bVar.getClass();
        return soh.b.a(gVar, textLocalisedClauseA, dialog, cVar, enumEntriesA, mapK, null);
    }

    public final soh.d c() {
        zel.g gVar = zel.g.DIVIDEND_YIELD;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_div_yield_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_div_yield_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("0.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("0.15"), gVar2, soh.h.OPEN), new BigDecimal("0.001")), uj3.b.c(new BigDecimal("0.01"), new BigDecimal("0.02"), new BigDecimal("0.03"), new BigDecimal("0.05"), new BigDecimal("0.08"), new BigDecimal("0.1")));
    }

    public final ScreenerFilter$Options d(zel.e config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Iterable iterable = config.d;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        List listD1 = d0.d1(iterable);
        ArrayList arrayList = new ArrayList(w.t(listD1, 10));
        Iterator it8 = listD1.iterator();
        while (it8.hasNext()) {
            arrayList.add(new CountryOption((wi0.b) it8.next()));
        }
        zel.g gVar = zel.g.EXPOSURE_GEO;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_exposure_geo_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_exposure_geo_info_dialog_subtitle, null, null, 14), null);
        soh.c cVar = soh.c.ROWS;
        int iB = q0.b(w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, new CountryClause(((CountryOption) obj2).f96151a, null));
        }
        int iB2 = q0.b(w.t(arrayList, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj3 : arrayList) {
            linkedHashMap2.put(obj3, new CountryImage(((CountryOption) obj3).f96151a.f297794a, (Integer) null, (ez0.e) null, 14));
        }
        return new ScreenerFilter$Options(gVar, textLocalisedClauseA, dialog, cVar, arrayList, linkedHashMap, linkedHashMap2);
    }

    public final ScreenerFilter$Options e(zel.e config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Iterable iterable = config.f321800c;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
        Iterator it8 = iterable2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new CurrencyOption((String) it8.next()));
        }
        zel.g gVar = zel.g.CURRENCY;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_trading_currency_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_trading_currency_info_dialog_subtitle, null, null, 14), null);
        soh.c cVar = soh.c.CHIPS;
        int iB = q0.b(w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : arrayList) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((CurrencyOption) obj2).f96152a;
            aVar.getClass();
            linkedHashMap.put(obj2, new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.Ticker.f57756a, null, 4));
        }
        int iB2 = q0.b(w.t(arrayList, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj3 : arrayList) {
            linkedHashMap2.put(obj3, new CurrencyImage(((CurrencyOption) obj3).f96152a, (ImageTransformations) null, (TextLocalisedClause) null, 14));
        }
        return new ScreenerFilter$Options(gVar, textLocalisedClauseA, dialog, cVar, arrayList, linkedHashMap, linkedHashMap2);
    }

    public final ScreenerFilter$Options f(zel.e config) {
        Pair pair;
        Intrinsics.checkNotNullParameter(config, "config");
        List list = config.f;
        if (ue0.e.n(list)) {
            return null;
        }
        soh.b bVar = soh.e.Companion;
        zel.g gVar = zel.g.UNDERLYING_ASSET_TYPE;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_title_uk, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_subtitle_uk, null, null, 14);
        List list2 = list == null ? f0.f322471a : list;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            switch (d.f281652a[((zel.j) it8.next()).ordinal()]) {
                case 1:
                    pair = new Pair(g(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_header_1_uk), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_description_1_uk, null, null, 14));
                    break;
                case 2:
                    pair = new Pair(g(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_header_2_uk), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_description_2_uk, null, null, 14));
                    break;
                case 3:
                    pair = new Pair(g(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_header_5_uk), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_description_5_uk, null, null, 14));
                    break;
                case 4:
                    pair = new Pair(g(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_header_3_uk), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_description_3_uk, null, null, 14));
                    break;
                case 5:
                    pair = new Pair(g(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_header_4_uk), new TextLocalisedClause(R$string.instrument_metric_underlying_asset_type_info_dialog_breakdown_description_4_uk, null, null, 14));
                    break;
                case 6:
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
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(textLocalisedClause, textLocalisedClause2, h(arrayList));
        soh.c cVar = soh.c.CHIPS;
        if (list == null) {
            list = f0.f322471a;
        }
        List list3 = list;
        Map mapK = r0.k(new Pair(zel.j.STOCK, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_stocks)), new Pair(zel.j.BOND, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_bonds)), new Pair(zel.j.COMMODITY, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_commodities)), new Pair(zel.j.CRYPTO, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_crypto)), new Pair(zel.j.NOTE, Integer.valueOf(R$string.screener_section_underlying_asset_type_option_notes)));
        bVar.getClass();
        return soh.b.a(gVar, textLocalisedClauseA, dialog, cVar, list3, mapK, null);
    }
}
