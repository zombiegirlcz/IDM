package uoh;

import a3f.k;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.CountryOption;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
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
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static TextLocalisedClause g(int i) {
        return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
    }

    public final ScreenerFilter$Options a(zel.e config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Iterable iterable = config.f321798a;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        List listD1 = d0.d1(iterable);
        ArrayList arrayList = new ArrayList(w.t(listD1, 10));
        Iterator it8 = listD1.iterator();
        while (it8.hasNext()) {
            arrayList.add(new CountryOption((wi0.b) it8.next()));
        }
        zel.g gVar = zel.g.COUNTRY;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_countries_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_countries_info_dialog_description, null, null, 14), null);
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

    public final ScreenerFilter$Options c(soh.a context, Links links) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        soh.b bVar = soh.e.Companion;
        zel.g gVar = zel.g.INVESTMENT_SUGGESTION;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_metric_investment_suggestion_info_dialog_title, null, null, 14);
        int i2 = f.f281653a[context.ordinal()];
        if (i2 == 1) {
            i = R$string.instrument_metric_investment_suggestion_info_dialog_subtitle_eea;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.instrument_metric_investment_suggestion_info_dialog_subtitle_uk;
        }
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(textLocalisedClause, new TextLocalisedClause(i, u.c(woh.b.a(links)), null, 12), null);
        soh.c cVar = soh.c.CHIPS;
        a3f.j jVar = a3f.j.BUY;
        a3f.j jVar2 = a3f.j.HOLD;
        a3f.j jVar3 = a3f.j.SELL;
        List listK = v.k(jVar, jVar2, jVar3);
        Map mapK = r0.k(new Pair(jVar, Integer.valueOf(R$string.instrument_metric_investment_suggestion_option_buy)), new Pair(jVar2, Integer.valueOf(R$string.instrument_metric_investment_suggestion_option_hold)), new Pair(jVar3, Integer.valueOf(R$string.instrument_metric_investment_suggestion_option_sell)));
        bVar.getClass();
        return soh.b.a(gVar, textLocalisedClauseA, dialog, cVar, listK, mapK, null);
    }

    public final ScreenerFilter$Options d() {
        soh.b bVar = soh.e.Companion;
        zel.g gVar = zel.g.MARKET_CAP;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_metric_market_cap_info_dialog_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.instrument_metric_market_cap_info_dialog_subtitle, null, null, 14);
        List<Pair> listK = v.k(new Pair(g(R$string.instrument_metric_market_cap_info_dialog_breakdown_header_1), new TextLocalisedClause(R$string.instrument_metric_market_cap_info_dialog_breakdown_description_1, null, null, 14)), new Pair(g(R$string.instrument_metric_market_cap_info_dialog_breakdown_header_2), new TextLocalisedClause(R$string.instrument_metric_market_cap_info_dialog_breakdown_description_2, null, null, 14)), new Pair(g(R$string.instrument_metric_market_cap_info_dialog_breakdown_header_3), new TextLocalisedClause(R$string.instrument_metric_market_cap_info_dialog_breakdown_description_3, null, null, 14)), new Pair(g(R$string.instrument_metric_market_cap_info_dialog_breakdown_header_4), new TextLocalisedClause(R$string.instrument_metric_market_cap_info_dialog_breakdown_description_4, null, null, 14)));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        for (Pair pair : listK) {
            arrayList.add(new TextLocalisedClause(R$string.instrument_metric_info_dialog_format, v.k((Clause) pair.f186385a, (Clause) pair.f186386b), null, 12));
        }
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(textLocalisedClause, textLocalisedClause2, yoj.b.m(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList));
        soh.c cVar = soh.c.CHIPS;
        a3f.g gVar2 = a3f.g.MEGA_CAP;
        a3f.g gVar3 = a3f.g.LARGE_CAP;
        a3f.g gVar4 = a3f.g.MID_CAP;
        a3f.g gVar5 = a3f.g.SMALL_CAP;
        List listK2 = v.k(gVar2, gVar3, gVar4, gVar5);
        Map mapK = r0.k(new Pair(gVar2, Integer.valueOf(R$string.screener_section_market_cap_option_mega)), new Pair(gVar3, Integer.valueOf(R$string.screener_section_market_cap_option_large)), new Pair(gVar4, Integer.valueOf(R$string.screener_section_market_cap_option_mid)), new Pair(gVar5, Integer.valueOf(R$string.screener_section_market_cap_option_small)));
        bVar.getClass();
        return soh.b.a(gVar, textLocalisedClauseA, dialog, cVar, listK2, mapK, null);
    }

    public final ScreenerFilter$Options e() {
        soh.b bVar = soh.e.Companion;
        zel.g gVar = zel.g.SECTOR;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_sectors_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_sectors_info_dialog_subtitle, null, null, 14), null);
        soh.c cVar = soh.c.ROWS;
        k kVar = k.TECHNOLOGY;
        k kVar2 = k.FINANCIAL;
        k kVar3 = k.CONSUMER_CYCLICAL;
        k kVar4 = k.INDUSTRIALS;
        k kVar5 = k.MATERIALS;
        k kVar6 = k.ENERGY;
        k kVar7 = k.COMMUNICATION_SERVICES;
        k kVar8 = k.REAL_ESTATE;
        k kVar9 = k.HEALTHCARE;
        k kVar10 = k.CONSUMER_DEFENSIVE;
        k kVar11 = k.UTILITIES;
        List listK = v.k(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11);
        Map mapK = r0.k(new Pair(kVar, Integer.valueOf(R$string.screener_section_sector_technology)), new Pair(kVar2, Integer.valueOf(R$string.screener_section_sector_financial)), new Pair(kVar3, Integer.valueOf(R$string.screener_section_sector_consumer_discretionary)), new Pair(kVar4, Integer.valueOf(R$string.screener_section_sector_industrials)), new Pair(kVar5, Integer.valueOf(R$string.screener_section_sector_basic_materials)), new Pair(kVar6, Integer.valueOf(R$string.screener_section_sector_energy)), new Pair(kVar7, Integer.valueOf(R$string.screener_section_sector_communication_services)), new Pair(kVar8, Integer.valueOf(R$string.screener_section_sector_real_estate)), new Pair(kVar9, Integer.valueOf(R$string.screener_section_sector_healthcare)), new Pair(kVar10, Integer.valueOf(R$string.screener_section_sector_consumer_staples)), new Pair(kVar11, Integer.valueOf(R$string.screener_section_sector_utilities)));
        Map mapK2 = r0.k(new Pair(kVar, Integer.valueOf(R$drawable.uikit_icn_24_tech)), new Pair(kVar2, Integer.valueOf(R$drawable.uikit_icn_24_coins)), new Pair(kVar3, Integer.valueOf(R$drawable.uikit_icn_24_fastfood)), new Pair(kVar4, Integer.valueOf(R$drawable.uikit_icn_24_gear)), new Pair(kVar5, Integer.valueOf(R$drawable.uikit_icn_24_materials)), new Pair(kVar6, Integer.valueOf(R$drawable.uikit_icn_24_lightning)), new Pair(kVar7, Integer.valueOf(R$drawable.uikit_icn_24_call)), new Pair(kVar8, Integer.valueOf(R$drawable.uikit_icn_24_utilities)), new Pair(kVar9, Integer.valueOf(R$drawable.uikit_icn_24_heart)), new Pair(kVar10, Integer.valueOf(R$drawable.uikit_icn_24_shopping)), new Pair(kVar11, Integer.valueOf(R$drawable.uikit_icn_24_drop)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapK2.size()));
        for (Map.Entry entry : mapK2.entrySet()) {
            linkedHashMap.put(entry.getKey(), LayeredImage.INSTANCE.i(((Number) entry.getValue()).intValue(), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10));
        }
        bVar.getClass();
        return soh.b.a(gVar, textLocalisedClauseA, dialog, cVar, listK, mapK, linkedHashMap);
    }

    public final soh.d f(soh.a context, Links links) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        zel.g gVar = zel.g.TOTAL_EXPECTED_RETURN;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_metric_total_expected_return_info_dialog_title, null, null, 14);
        int i2 = f.f281653a[context.ordinal()];
        if (i2 == 1) {
            i = R$string.instrument_metric_total_expected_return_info_dialog_subtitle_eea;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.instrument_metric_total_expected_return_info_dialog_subtitle_uk;
        }
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(textLocalisedClause, new TextLocalisedClause(i, u.c(woh.b.a(links)), null, 12), null);
        BigDecimal bigDecimal = new BigDecimal("-0.3");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("0.3"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.c(new BigDecimal("0.0"), new BigDecimal("0.04"), new BigDecimal("0.08"), new BigDecimal("0.12"), new BigDecimal("0.16"), new BigDecimal("0.2")));
    }
}
