package vc;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.core.graphics.ColorUtils;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewardItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewards;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.sso.impl.domain.models.Challenge;
import dfl.x;
import dp5.e1;
import grl.r2;
import hha.w0;
import igb.e0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import xga.a0;
import xga.b0;
import xga.y;
import xga.z;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public abstract class o {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public static final oga.j A(b0 b0Var) {
        ?? arrayList;
        oga.h hVar;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        String str = b0Var.f305642a;
        List<a0> list = b0Var.f305643b;
        oga.i iVar = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (a0 a0Var : list) {
                if (a0Var instanceof y) {
                    y yVar = (y) a0Var;
                    Intrinsics.checkNotNullParameter(yVar, "<this>");
                    hVar = new oga.h(mo3.a.o(yVar.f305667a));
                } else {
                    if (!(a0Var instanceof z)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PricingPlanContextualMappers", "Unsupported param type", null, h0Var);
                    hVar = null;
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        String str2 = b0Var.f305644c;
        if (Intrinsics.f(str2, "Warning")) {
            iVar = oga.i.Warning;
        } else if (str2 != null) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PricingPlanContextualMappers", "Unsupported text style: ".concat(str2), null, h0Var2);
        }
        return new oga.j(str, arrayList, iVar);
    }

    public static final yzg.d B(s7h.l lVar) throws Throwable {
        yzg.c cVar;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String str = lVar.f260834a;
        yzg.c[] cVarArrValues = yzg.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i];
            if (kotlin.text.a0.z(cVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (cVar == null) {
            hx7.e.n(new IllegalStateException(j6.a.q("Unsupported free stocks status = ", lVar.f260834a)));
            cVar = yzg.c.NOT_ELIGIBLE;
        }
        yzg.c cVar2 = cVar;
        jo3.a aVar = lVar.f260835b;
        dj0.d dVarO = aVar != null ? mo3.a.o(aVar) : null;
        jo3.a aVar2 = lVar.f260836c;
        dj0.d dVarO2 = aVar2 != null ? mo3.a.o(aVar2) : null;
        List list = lVar.e;
        if (list != null) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            List<s7h.e> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (s7h.e eVar : list2) {
                arrayList2.add(new yzg.a(eVar.f260826a, new x(new BigDecimal(eVar.f260827b.f260832a))));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        s7h.h hVar = lVar.f;
        return new yzg.d(cVar2, dVarO, dVarO2, arrayList, hVar != null ? new yzg.b(mo3.a.o(hVar.f260829a), mo3.a.o(hVar.f260830b)) : null, lVar.d);
    }

    public static final e1 C(ko5.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new e1(mVar.f186243a, mVar.f186244b);
    }

    public static final ArrayList D(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<oq9.k> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (oq9.k kVar : list2) {
            String str = kVar.f227833a;
            long j2 = kVar.f227834b;
            String str2 = kVar.f227835c;
            ArrayList arrayList2 = kVar.d;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(new cr9.n((String) it8.next()));
            }
            arrayList.add(new cr9.m(str, j2, str2, arrayList3));
        }
        return arrayList;
    }

    public static final qta.b E(rpk.d dVar, Pair pair, boolean z, epk.a interval) {
        Period periodMinutes;
        Pair ccPair = pair;
        boolean z3 = z;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(ccPair, "ccPair");
        Intrinsics.checkNotNullParameter(interval, "interval");
        rpk.c cVar = (rpk.c) d0.d0(dVar.getPoints());
        DateTime dateTime = new DateTime(cVar != null ? Long.valueOf(cVar.getStart()) : DateTime.now());
        rpk.c cVar2 = (rpk.c) d0.o0(dVar.getPoints());
        DateTime dateTime2 = new DateTime(cVar2 != null ? Long.valueOf(cVar2.getStart()) : DateTime.now());
        dj0.d dVarD = d(z3, new BigDecimal(String.valueOf(dVar.getPreviousRangeCloseRate())), ccPair);
        rpk.c cVar3 = (rpk.c) d0.o0(dVar.getPoints());
        dj0.d dVarD2 = d(z3, new BigDecimal(String.valueOf(cVar3 != null ? cVar3.getClose() : dVar.getPreviousRangeCloseRate())), ccPair);
        List listA = dVar.getPoints();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            rpk.c cVar4 = (rpk.c) it8.next();
            dj0.d dVarD3 = d(z3, new BigDecimal(String.valueOf(cVar4.getOpen())), ccPair);
            dj0.d dVarD4 = d(z3, new BigDecimal(String.valueOf(cVar4.getClose())), ccPair);
            dj0.d dVarD5 = d(z3, new BigDecimal(String.valueOf(cVar4.getHigh())), ccPair);
            Iterator it9 = it8;
            dj0.d dVarD6 = d(z3, new BigDecimal(String.valueOf(cVar4.getLow())), ccPair);
            DateTime dateTime3 = new DateTime(cVar4.getStart());
            DateTime dateTime4 = new DateTime(cVar4.getStart());
            Intrinsics.checkNotNullParameter(interval, "<this>");
            switch (fpk.g.f137133c[interval.ordinal()]) {
                case 1:
                    periodMinutes = Period.minutes(5);
                    break;
                case 2:
                    periodMinutes = Period.minutes(15);
                    break;
                case 3:
                    periodMinutes = Period.minutes(30);
                    break;
                case 4:
                    periodMinutes = Period.hours(1);
                    break;
                case 5:
                    periodMinutes = Period.minutes(90);
                    break;
                case 6:
                    periodMinutes = Period.hours(4);
                    break;
                case 7:
                    periodMinutes = Period.days(1);
                    break;
                case 8:
                    periodMinutes = Period.days(2);
                    break;
                case 9:
                    periodMinutes = Period.days(4);
                    break;
                case 10:
                    periodMinutes = Period.weeks(1);
                    break;
                case 11:
                    periodMinutes = Period.weeks(4);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            DateTime dateTimePlus = dateTime4.plus(periodMinutes);
            Intrinsics.checkNotNullExpressionValue(dateTimePlus, "plus(...)");
            arrayList.add(new qta.j(dVarD3, dVarD4, dVarD5, dVarD6, dateTime3, dateTimePlus));
            it8 = it9;
            ccPair = pair;
            z3 = z;
        }
        return new qta.b(dVarD, dVarD2, arrayList, dateTime, dateTime2);
    }

    public static final qta.f F(epk.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (vpk.d.f291228a[bVar.ordinal()]) {
            case 1:
                return qta.f.DAY;
            case 2:
                return qta.f.WEEK;
            case 3:
                return qta.f.MONTH;
            case 4:
                return qta.f.THREE_MONTH;
            case 5:
                return qta.f.SIX_MONTH;
            case 6:
                return qta.f.YEAR;
            case 7:
                return qta.f.FIVE_YEARS;
            case 8:
                return qta.f.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final p97.a G(t97.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (t97.f.f268957a[dVar.ordinal()]) {
            case 1:
                return new p97.a(t97.d.ACCOUNT_DETAILS, R$drawable.uikit_icn_24_bank, new TextLocalisedClause(R$string.search_block_discover_account_details_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_wallets, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_currencies, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_account, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_iban, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_swift, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_sort_code, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_transfer, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_ach, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_wire_routing, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_bic, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_receive_money, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_receive_transfer, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_receiving_money, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_receiving_transfer, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_account_number, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_acc_details, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_sortcode, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_accountnumber, null, null, 14)));
            case 2:
                return new p97.a(t97.d.ACCOUNT_MOVE_MONEY, R$drawable.uikit_icn_24_arrow_shuffle, new TextLocalisedClause(R$string.global_search_move_money_title, null, null, 14), null, new TextLocalisedClause(R$string.global_search_move_money_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_move_money_keywords_exchange, null, null, 14), new TextLocalisedClause(R$string.global_search_move_money_keywords_limit_order, null, null, 14), new TextLocalisedClause(R$string.global_search_move_money_keywords_move, null, null, 14), new TextLocalisedClause(R$string.global_search_move_money_keywords_move_money, null, null, 14), new TextLocalisedClause(R$string.global_search_move_money_keywords_stop_order, null, null, 14)));
            case 3:
                return new p97.a(t97.d.ACCOUNT_SWITCH_FR, R$drawable.uikit_icn_24_switch_to_revolut, new TextLocalisedClause(R$string.localisation_search_products_account_switching, null, null, 14), null, new TextLocalisedClause(R$string.localisation_search_products_elcimai_description, null, null, 14), v.k(new TextLocalisedClause(R$string.localisation_search_products_account_switching, null, null, 14), new TextLocalisedClause(R$string.localisation_search_products_account_switching_keywords_account_switch, null, null, 14), new TextLocalisedClause(R$string.localisation_search_products_account_switching_keywords_switch_to_revolut, null, null, 14)));
            case 4:
                return new p97.a(t97.d.ACCOUNT_SWITCH_GB, R$drawable.uikit_icn_24_switch_to_revolut, new TextLocalisedClause(R$string.localisation_search_products_account_switching, null, null, 14), null, new TextLocalisedClause(R$string.localisation_search_products_cass_description, null, null, 14), v.k(new TextLocalisedClause(R$string.localisation_search_products_account_switching, null, null, 14), new TextLocalisedClause(R$string.localisation_search_products_account_switching_keywords_account_switch, null, null, 14), new TextLocalisedClause(R$string.localisation_search_products_account_switching_keywords_switch_to_revolut, null, null, 14), new TextLocalisedClause(R$string.localisation_search_products_account_switching_keywords_cass, null, null, 14)));
            case 5:
                return new p97.a(t97.d.ACCOUNT_SWITCH_NL, R$drawable.uikit_icn_24_switch_to_revolut, new TextLocalisedClause(R$string.localisation_search_products_account_switching, null, null, 14), null, new TextLocalisedClause(R$string.localisation_search_products_account_switching_description, null, null, 14), v.k(new TextLocalisedClause(R$string.localisation_search_products_account_switching, null, null, 14), new TextLocalisedClause(R$string.localisation_search_products_account_switching_keywords_account_switch, null, null, 14), new TextLocalisedClause(R$string.localisation_search_products_account_switching_keywords_switch_to_revolut, null, null, 14), new TextLocalisedClause(R$string.localisation_search_products_account_switching_keywords_overstap, null, null, 14)));
            case 6:
                return new p97.a(t97.d.ADDITIONAL_CREDIT_CARD, R$drawable.uikit_icn_24_add_contact, new TextLocalisedClause(R$string.credit_card_additional_entry_point_global_search_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_card_additional_entry_point_global_search_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_card, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rewards, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_points, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cashback, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_limit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_revpoints, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_balance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14)));
            case 7:
                return new p97.a(t97.d.AIRPORT_SECURITY_FAST_TRACK, R$drawable.uikit_icn_24_turbo_transfer, new TextLocalisedClause(R$string.asft_global_search_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.asft_global_search_keywords_access, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_airline, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_airport, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_arrival, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_badge, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_baggage, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_boarding, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_clearance, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_comfort, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_departure, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_elite, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_entry, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_express, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_fast, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_fasttrack, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_flight, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_lane, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_pass, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_passenger, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_passport, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_premium, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_priority, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_queue, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_quick, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_security, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_skip, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_terminal, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_track, null, null, 14), new TextLocalisedClause(R$string.asft_global_search_keywords_vip, null, null, 14)));
            case 8:
                return new p97.a(t97.d.AIR_MILES, R$drawable.uikit_icn_24_travel, new TextLocalisedClause(R$string.miles_product_title, null, null, 14), null, null, v.h());
            case 9:
                return new p97.a(t97.d.ALERTS, R$drawable.uikit_icn_24_bell_outline, new TextLocalisedClause(R$string.search_block_discover_alerts_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_limit, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_crypto, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_cryptocurrencies, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_commodities, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_stocks, null, null, 14)));
            case 10:
                return new p97.a(t97.d.ALIPAY_PLUS, R$drawable.uikit_icn_24_alipayplus, new TextLocalisedClause(R$string.alipay_plus_global_search_title, null, null, 14), null, new TextLocalisedClause(R$string.alipay_plus_global_search_description, null, null, 14), v.h());
            case 11:
                return new p97.a(t97.d.ANALYTICS, R$drawable.uikit_icn_24_bar_chart, new TextLocalisedClause(R$string.analytics_search_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.analytics_search_keywords_networth, null, null, 14), new TextLocalisedClause(R$string.analytics_search_keywords_value, null, null, 14), new TextLocalisedClause(R$string.analytics_search_keywords_spend, null, null, 14), new TextLocalisedClause(R$string.analytics_search_keywords_spending, null, null, 14), new TextLocalisedClause(R$string.analytics_search_keywords_category, null, null, 14), new TextLocalisedClause(R$string.analytics_search_keywords_categories, null, null, 14), new TextLocalisedClause(R$string.analytics_search_keywords_merchant, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_committed, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_merchants, null, null, 14)));
            case 12:
                return new p97.a(t97.d.APM_BILLS_BPAY, R$drawable.uikit_icn_24_documents_pair, new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_page_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.apm_product_bills_bpay_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_page_title, null, null, 14)));
            case 13:
                return new p97.a(t97.d.APM_BILLS_PAGO_PA, R$drawable.uikit_icn_24_pagopa, new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_title, null, null, 14), null, new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_keyword_one, null, null, 14), new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_keyword_two, null, null, 14), new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_keyword_three, null, null, 14), new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_keyword_four, null, null, 14), new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_keyword_five, null, null, 14), new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_keyword_six, null, null, 14), new TextLocalisedClause(R$string.payments_quick_actions_pago_pa_keyword_seven, null, null, 14)));
            case 14:
                return new p97.a(t97.d.APM_BILLS_TAXES, R$drawable.uikit_icn_24_documents_pair, new TextLocalisedClause(R$string.pay_bills_taxes_title, null, null, 14), null, new TextLocalisedClause(R$string.pay_bills_taxes_search_product_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.pay_bills_taxes_search_product_keyword_boleto, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_search_product_keyword_boletos, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_bills, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_services, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_taxes, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_internet, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_phone, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_mobile, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_water, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_electricity, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_energy, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_school, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_education, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_university, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_naturalgas, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_government, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_city, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_state, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_phonetopup, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_postpaid, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_prepaid, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_mexico, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_cdmx, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_cfe, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_telmex, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_totalplay, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_izzi, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_atandt, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_megacable, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_sadm, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_segiagua, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_naturgy, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_engie, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_sky, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_movistar, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_televia, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_cespt, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_siapa, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_gem, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_cmg, null, null, 14), new TextLocalisedClause(R$string.tapi_global_search_keywords_paguitos, null, null, 14)));
            case 15:
                return new p97.a(t97.d.APM_BIZUM, R$drawable.uikit_icn_24_bizum, new TextLocalisedClause(R$string.apm_product_bizum_title, null, null, 14), null, null, v.h());
            case 16:
                return new p97.a(t97.d.APM_BLIK, R$drawable.uikit_icn_24_blik, new TextLocalisedClause(R$string.apm_product_blik_title, null, null, 14), null, null, v.h());
            case 17:
                return new p97.a(t97.d.APM_BRE_B, R$drawable.uikit_icn_24_bre_b, new TextLocalisedClause(R$string.apm_product_bre_b_title, null, null, 14), null, null, v.h());
            case 18:
                return new p97.a(t97.d.APM_IRIS, R$drawable.uikit_icn_24_iris, new TextLocalisedClause(R$string.apm_product_iris_title, null, null, 14), null, null, v.h());
            case 19:
                return new p97.a(t97.d.APM_MULTIBANCO, R$drawable.uikit_icn_24_mb_way, new TextLocalisedClause(R$string.apm_product_multibanco_title, null, null, 14), null, null, v.h());
            case 20:
                return new p97.a(t97.d.APM_MULTIBANCO_VIA_VERDE, R$drawable.uikit_icn_24_viaverde, new TextLocalisedClause(R$string.apm_product_multibanco_via_verde_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.via_verde_global_search_keyword_parking, null, null, 14), new TextLocalisedClause(R$string.via_verde_global_search_keyword_tolls, null, null, 14), new TextLocalisedClause(R$string.via_verde_global_search_keyword_via_verde, null, null, 14)));
            case 21:
                return new p97.a(t97.d.APM_PAYID, R$drawable.uikit_icn_24_payid, new TextLocalisedClause(R$string.apm_product_payId_title, null, null, 14), null, null, v.h());
            case 22:
                return new p97.a(t97.d.APM_QVIK, R$drawable.uikit_icn_24_bank, new TextLocalisedClause(R$string.apm_product_qvik_title, null, null, 14), null, null, v.h());
            case 23:
                return new p97.a(t97.d.APM_QVIK_SECONDARY_ID, R$drawable.uikit_icn_24_add_contact, new TextLocalisedClause(R$string.apm_product_secondaryId_title, null, null, 14), null, null, v.h());
            case 24:
                return new p97.a(t97.d.APM_SPIN, R$drawable.uikit_icn_24_spin, new TextLocalisedClause(R$string.apm_product_spin_title, null, null, 14), null, null, v.h());
            case 25:
                return new p97.a(t97.d.APM_SWISH, R$drawable.uikit_icn_24_swish, new TextLocalisedClause(R$string.apm_product_swish_title, null, null, 14), null, null, v.h());
            case 26:
                return new p97.a(t97.d.APM_UPI, R$drawable.uikit_icn_24_upi, new TextLocalisedClause(R$string.apm_product_upi_title, null, null, 14), null, null, v.h());
            case 27:
                return new p97.a(t97.d.APM_UPI_MANDATES, R$drawable.uikit_icn_24_calendar, new TextLocalisedClause(R$string.payments_quick_actions_upi_subscription_title, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.apm_upi_search_product_keyword_upi_mandate, null, null, 14)));
            case 28:
                return new p97.a(t97.d.APM_WERO, R$drawable.uikit_icn_24_wero, new TextLocalisedClause(R$string.apm_product_wero_title, null, null, 14), null, null, v.h());
            case 29:
                return new p97.a(t97.d.APP_SETTINGS, R$drawable.uikit_icn_24_gear, new TextLocalisedClause(R$string.search_block_discover_app_settings_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_app_icon, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_theme, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_color, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_background, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_language, null, null, 14)));
            case 30:
                return new p97.a(t97.d.ATMS, R$drawable.uikit_icn_24_cash, new TextLocalisedClause(R$string.atm_search_title, null, null, 14), null, null, v.h());
            case 31:
                return new p97.a(t97.d.BALANCE_TRANSFER_CREDIT_CARD, R$drawable.uikit_icn_24_refinancing_card, new TextLocalisedClause(R$string.credit_card_balance_transfer_entry_point_title, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14)));
            case 32:
                return new p97.a(t97.d.BILLS_AND_TAXES_F24, R$drawable.uikit_icn_24_documents_pair, new TextLocalisedClause(R$string.f24_global_search_products_title, null, null, 14), null, new TextLocalisedClause(R$string.f24_global_search_products_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.f24_global_search_keywords_i24, null, null, 14), new TextLocalisedClause(R$string.f24_global_search_keywords_tassa, null, null, 14), new TextLocalisedClause(R$string.f24_global_search_keywords_tassare, null, null, 14), new TextLocalisedClause(R$string.f24_global_search_keywords_tasse, null, null, 14), new TextLocalisedClause(R$string.f24_global_search_keywords_tax, null, null, 14), new TextLocalisedClause(R$string.f24_global_search_keywords_tax_payment, null, null, 14)));
            case 33:
                return new p97.a(t97.d.BILLS_AND_TAX_PAYMENTS, R$drawable.uikit_icn_24_documents_pair, new TextLocalisedClause(R$string.pay_bills_taxes_title, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.pay_bills_taxes_country_au_service_name, null, null, 14)));
            case 34:
                return new p97.a(t97.d.BONDS, R$drawable.uikit_icn_24_bank, new TextLocalisedClause(R$string.global_search_products_bonds_title, null, null, 14), null, new TextLocalisedClause(R$string.global_search_products_bonds_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_keywords_bond, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_coupon, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_coupon_yield, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_gilt, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_income, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_interest, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_treasury, null, null, 14)));
            case 35:
                return new p97.a(t97.d.BUDGETING, R$drawable.uikit_icn_24_pie_chart, new TextLocalisedClause(R$string.analytics_budgeting_search_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.analytics_search_keywords_budget, null, null, 14), new TextLocalisedClause(R$string.analytics_search_keywords_save, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_allocate, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_cheap, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_economy, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_set_aside, null, null, 14)));
            case 36:
                return new p97.a(t97.d.BUG_REPORT, R$drawable.uikit_icn_24_bug, new TextLocalisedClause(R$string.search_block_discover_bug_report_title, null, null, 14), null, new TextLocalisedClause(R$string.bug_reporting_global_search_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_report, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_report_bug, null, null, 14)));
            case 37:
                return new p97.a(t97.d.BUSINESS, R$drawable.uikit_icn_24_company_filled, new TextLocalisedClause(R$string.business_bridge_revolut_business_product_title, null, null, 14), null, new TextLocalisedClause(R$string.business_bridge_revolut_business_product_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_activate, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_business, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_business_account, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_company, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_freelance, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_get_paid, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_invoice, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_payment_link, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_pos, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_pro, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_revolut_business, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_revolut_pay, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_shopify, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_stripe, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_tap_to_pay, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_team, null, null, 14), new TextLocalisedClause(R$string.business_bridge_revolut_business_product_keywords_work, null, null, 14)));
            case 38:
                return new p97.a(t97.d.CARDS, R$drawable.uikit_icn_24_card, new TextLocalisedClause(R$string.cards_search_products_cards, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.cards_search_products_keywords_cards, null, null, 14)));
            case 39:
                return new p97.a(t97.d.CFD, R$drawable.uikit_icn_24_cfd, new TextLocalisedClause(R$string.wealth_invest_home_portfolio_cfds_header_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.invest_suggestions_products_cfds_cfds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_cfds_contracts_for_difference, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_cfds_leverage_trading, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_cfds_speculation, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_cfds_short, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_cfds_sell, null, null, 14)));
            case 40:
                return new p97.a(t97.d.CHANGE_PASSCODE, R$drawable.uikit_icn_24_change_passcode, new TextLocalisedClause(R$string.search_block_discover_change_passcode_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_password, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_passcode, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_pin, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_pincode, null, null, 14)));
            case 41:
                return new p97.a(t97.d.CHAT, R$drawable.uikit_icn_24_chat, new TextLocalisedClause(R$string.search_products_chat, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_products_support, null, null, 14), new TextLocalisedClause(R$string.search_products_chat, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_help, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_support, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_assist, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_assistance, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_assistant, null, null, 14)));
            case 42:
                return new p97.a(t97.d.CLOSE_ACCOUNT, R$drawable.uikit_icn_24_broken_heart, new TextLocalisedClause(R$string.search_block_discover_close_account_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_close, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_shut, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_terminate, null, null, 14)));
            case 43:
                return new p97.a(t97.d.COMMODITIES, R$drawable.uikit_icn_24_commodities, new TextLocalisedClause(R$string.wealth_commodities_global_search_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.invest_suggestions_products_commodities_commodities, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_commodities_futures, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_commodities_metals, null, null, 14)));
            case 44:
                return new p97.a(t97.d.COMMODITIES_ANALYTICS, R$drawable.uikit_icn_24_bar_chart, new TextLocalisedClause(R$string.wealth_analytics_search_product_commodities_analytics_title, null, null, 14), null, new TextLocalisedClause(R$string.wealth_analytics_search_product_commodities_analytics_description, null, null, 14), v.k(new TextLocalisedClause(R$string.wealth_analytics_search_product_commodities_keyword_commodities_analytics, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_commodities_keyword_commodities, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_commodities_keyword_commodities_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_commodities_keyword_commodities_total_value, null, null, 14)));
            case 45:
                return new p97.a(t97.d.CONVERTER, R$drawable.uikit_icn_24_rates_converter, new TextLocalisedClause(R$string.search_block_discover_converter_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_currency, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_currencies, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_crypto, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_cryptocurrencies, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_commodities, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_stocks, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_convert, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_exchange, null, null, 14)));
            case 46:
                return new p97.a(t97.d.CREDIT_BUILDER_CARD, R$drawable.uikit_icn_24_credit_card, new TextLocalisedClause(R$string.credit_get_credit_credit_builder_card_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_credit_builder_card_description, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_builder, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_card, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rewards, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_points, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cashback, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_limit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_revpoints, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_balance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14)));
            case 47:
                return new p97.a(t97.d.CREDIT_CARD, R$drawable.uikit_icn_24_credit_card, new TextLocalisedClause(R$string.credit_get_credit_credit_card_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_card, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rewards, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_points, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cashback, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_limit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_revpoints, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_balance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14)));
            case 48:
                return new p97.a(t97.d.CREDIT_HEALTH, R$drawable.uikit_icn_24_limit_high, new TextLocalisedClause(R$string.credit_get_credit_credit_health_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_credit_health_description, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_health, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_score, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_balance, null, null, 14)));
            case 49:
                return new p97.a(t97.d.CRYPTO_ANALYTICS, R$drawable.uikit_icn_24_bar_chart, new TextLocalisedClause(R$string.wealth_analytics_search_product_crypto_analytics_title, null, null, 14), null, new TextLocalisedClause(R$string.wealth_analytics_search_product_crypto_analytics_description, null, null, 14), v.k(new TextLocalisedClause(R$string.wealth_analytics_search_product_crypto_keyword_crypto_analytics, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_crypto_keyword_crypto, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_crypto_keyword_crypto_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_crypto_keyword_crypto_total_value, null, null, 14)));
            case 50:
                return new p97.a(t97.d.CRYPTO_CARDS, R$drawable.uikit_icn_24_card, new TextLocalisedClause(R$string.crypto_global_search_crypto_cards_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_crypto_cards_keywords_crypto_card, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_cards_keywords_spend_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_cards_keywords_crypto_payments, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_cards_keywords_bitcoin_card, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_cards_keywords_revolut_crypto_card, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_cards_keywords_pay_with_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_cards_keywords_use_crypto, null, null, 14)));
            case 51:
                return new p97.a(t97.d.CRYPTO_DEPOSITS, R$drawable.uikit_icn_24_arrow_request, new TextLocalisedClause(R$string.crypto_global_search_crypto_deposits_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_crypto_deposits_keywords_crypto_deposit, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_deposits_keywords_receive_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_deposits_keywords_on_chain_transfer, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_deposits_keywords_transfer_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_deposits_keywords_deposit_bitcoin, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_deposits_keywords_deposit, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_deposits_keywords_receive, null, null, 14)));
            case 52:
                return new p97.a(t97.d.CRYPTO_MOST_TRADED, R$drawable.uikit_icn_24_flame, new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_keywords_most_traded, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_keywords_most_popular, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_keywords_highest_volume_crypto, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_keywords_hot_crypto, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_keywords_most_active_crypto, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_keywords_top_crypto, null, null, 14)));
            case 53:
                return new p97.a(t97.d.CRYPTO_RECURRING_BUY, R$drawable.uikit_icn_24_calendar_recurring, new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_buy, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_recurring_buy, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_scheduled_buy, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_scheduled_order, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_standing_order, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_baskets, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_buy_basket, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_buy_collection, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_collection, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_repeat_buy, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_monthly_buy, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_weekly_buy, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_recurring_buy_keywords_daily_buy, null, null, 14)));
            case 54:
                return new p97.a(t97.d.CRYPTO_STRATEGIES, R$drawable.uikit_icn_24_invest, new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_keywords_recurring_buy, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_keywords_auto_invest, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_keywords_spare_change, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_keywords_crypto_spare_change, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_keywords_round_up, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_keywords_passive_investing, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_keywords_crypto_investing, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_strategies_keywords_invest_in_crypto, null, null, 14)));
            case 55:
                return new p97.a(t97.d.CRYPTO_TAB, R$drawable.uikit_icn_24_bitcoin, new TextLocalisedClause(R$string.crypto_global_search_crypto_tab_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_crypto_tab_keywords_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_tab_keywords_revolut_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_tab_keywords_crypto_news, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_tab_keywords_watchlist, null, null, 14)));
            case 56:
                return new p97.a(t97.d.CRYPTO_TOP_MOVERS, R$drawable.uikit_icn_24_arrow_top_down, new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_top_movers, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_top_gainers, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_top_losers, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_best_performing, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_worst_performance, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_token_performance, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_price_change, null, null, 14)));
            case 57:
                return new p97.a(t97.d.CRYPTO_TRADING, R$drawable.uikit_icn_24_arrow_rates, new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_trading, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_buy_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_sell_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_crypto_trading, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_trade_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_bitcoin, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_buy_bitcoin, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_buy_btc, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_ethereum, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_buy_eth, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_altcoins, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_sell_bitcoin, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_sell_btc, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_sell_ethereum, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_sell_etc, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_limit_order, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_market_order, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_stop_order, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_tp_sl, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_take_profit, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_trading_keywords_stop_loss, null, null, 14)));
            case 58:
                return new p97.a(t97.d.CRYPTO_WITHDRAWALS, R$drawable.uikit_icn_24_arrow_send, new TextLocalisedClause(R$string.crypto_global_search_crypto_withdrawals_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_crypto_withdrawals_keywords_crypto_withdrawal, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_withdrawals_keywords_send_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_withdrawals_keywords_withdraw_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_withdrawals_keywords_withdrawal, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_crypto_withdrawals_keywords_send, null, null, 14)));
            case 59:
                return new p97.a(t97.d.DIRECT_DEBITS, R$drawable.uikit_icn_24_calendar_date, new TextLocalisedClause(R$string.lifestyle_search_products_direct_debits, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_direct_debits, null, null, 14)));
            case 60:
                return new p97.a(t97.d.DOCUMENTS, R$drawable.uikit_icn_24_document, new TextLocalisedClause(R$string.search_block_discover_documents_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_documents, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_statements, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_balance, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_account_confirmation, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_card_confirmation, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_statement_of_fees, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_subject_access_request, null, null, 14)));
            case 61:
                return new p97.a(t97.d.DONATIONS, R$drawable.uikit_icn_24_heart, new TextLocalisedClause(R$string.lifestyle_search_products_donations, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_donations, null, null, 14)));
            case 62:
                return new p97.a(t97.d.ESIM, R$drawable.uikit_icn_24_sim_card, new TextLocalisedClause(R$string.lifestyle_search_products_travel_data_plan, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_esim, null, null, 14), null, v.k(new TextLocalisedClause(R$string.esim_global_search_products_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_products_travel_data_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_abroad, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_activate_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_add_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_buy_data, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_buy_internet, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_calls, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_connectivity, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_data, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_data_abroad, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_data_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_esim_setup, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_get_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_holiday, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_international, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_international_data, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_internet, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_line, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_minutes, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_mobile, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_mobile_data, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_mobile_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_network, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_number, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_online, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_package, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_phone, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_roaming, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_signal, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_sim_card, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_sms, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_text, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_travel, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_travel_internet, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_travel_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_trip, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_virtual_sim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_voice, null, null, 14)));
            case 63:
                return new p97.a(t97.d.EXPERIENCE, R$drawable.uikit_icn_24_voucher, new TextLocalisedClause(R$string.lifestyle_search_products_experiences, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_experiences, null, null, 14)));
            case 64:
                return new p97.a(t97.d.GIRO_DIRECT_DEBITS, R$drawable.uikit_icn_24_recurring, new TextLocalisedClause(R$string.giro_search_products_direct_debit, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.giro_search_products_direct_debit, null, null, 14)));
            case 65:
                return new p97.a(t97.d.GROUP_CONTACTS, R$drawable.uikit_icn_24_people, new TextLocalisedClause(R$string.global_search_products_group_title, null, null, 14), null, new TextLocalisedClause(R$string.global_search_products_group_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_keywords_group_split, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_group_expense, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_group_divide, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_group_share, null, null, 14)));
            case 66:
                return new p97.a(t97.d.HELP, R$drawable.uikit_icn_24_question, new TextLocalisedClause(R$string.search_block_help_centre_get_help_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_help_centre_assist, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_assistance, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_assistant, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_call, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_chat, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_customer_support, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_global, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_help, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_issue, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_phone, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_support, null, null, 14), new TextLocalisedClause(R$string.search_block_help_centre_trouble, null, null, 14), new TextLocalisedClause(R$string.help_center_support_subtitle_contact_us, null, null, 14)));
            case 67:
                return new p97.a(t97.d.HOTELS_POINTS, R$drawable.uikit_icn_24_hotel, new TextLocalisedClause(R$string.hotel_points_product_title, null, null, 14), null, null, v.h());
            case 68:
                return new p97.a(t97.d.HU_POSTAL_CHECK, R$drawable.uikit_icn_24_qr, new TextLocalisedClause(R$string.pay_bills_taxes_hu_postal_check, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.pay_bills_taxes_hu_postal_check_keywords_yellow_check, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_hu_postal_check_keywords_white_check, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_hu_postal_check, null, null, 14)));
            case 69:
                return new p97.a(t97.d.IHG_COBRAND, R$drawable.uikit_icn_24_hotel, new TextLocalisedClause(R$string.cobrands_search_products_ihg_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.cobrands_search_products_ihg_keywords_ihg, null, null, 14), new TextLocalisedClause(R$string.cobrands_search_products_ihg_keywords_intercontinental, null, null, 14), new TextLocalisedClause(R$string.cobrands_search_products_ihg_keywords_ihg_one_rewards, null, null, 14), new TextLocalisedClause(R$string.cobrands_search_products_ihg_keywords_cobranded_card, null, null, 14)));
            case 70:
                return new p97.a(t97.d.INCOME_SORTER, R$drawable.uikit_icn_24_arrow_split, new TextLocalisedClause(R$string.analytics_income_sorter_global_search_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.analytics_income_sorter_global_search_keywords_income_sorter, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_global_search_keywords_salary_sorter, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_global_search_keywords_sorter, null, null, 14)));
            case 71:
                return new p97.a(t97.d.INSURANCE, R$drawable.uikit_icn_24_insurance, new TextLocalisedClause(R$string.lifestyle_search_products_insurance, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_cover, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_insurance, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_insure, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_policy, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_purchase_protection, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_travel_insurance, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_premium_insurance, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_metal_insurance, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_ultra_insurance, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_private_insurance, null, null, 14)));
            case 72:
                return new p97.a(t97.d.INSURANCE_CAR, R$drawable.uikit_icn_24_driving_licence, new TextLocalisedClause(R$string.lifestyle_search_products_car_insurance, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_aig, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_auto, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_car, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_comparison, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_cover, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_insure, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_motor, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_policy, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_protection, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_vehicle, null, null, 14)));
            case 73:
                return new p97.a(t97.d.JOINT_ACCOUNT, R$drawable.uikit_icn_24_joint, new TextLocalisedClause(R$string.joint_search_products_joint, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.account_switcher_product_selection_joint_account_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_joint_currency_title_mx, null, null, 14), new TextLocalisedClause(R$string.add_new_product_joint_currency_onboarding_subtitle, null, null, 14), new TextLocalisedClause(R$string.add_new_product_joint_currency_onboarding_subtitle_account_card, null, null, 14), new TextLocalisedClause(R$string.add_new_product_joint_currency_onboarding_subtitle_mx, null, null, 14), new TextLocalisedClause(R$string.joint_home_currency_account_product_name, null, null, 14)));
            case 74:
                return new p97.a(t97.d.JOINT_SAVINGS, R$drawable.uikit_icn_24_savings_vault, new TextLocalisedClause(R$string.vaults_search_product_interest_title, null, null, 14), null, new TextLocalisedClause(R$string.vaults_search_product_savings_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.vaults_search_product_savings_title, null, null, 14), new TextLocalisedClause(R$string.vaults_search_product_interest_title, null, null, 14), new TextLocalisedClause(R$string.savings_account_type_joint, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_vaults_title, null, null, 14)));
            case 75:
                return new p97.a(t97.d.JOINT_SUBACCOUNTS, R$drawable.uikit_icn_24_wallet, new TextLocalisedClause(R$string.subaccounts_search_products_subaccounts_joint_title, null, null, 14), null, new TextLocalisedClause(R$string.subaccounts_search_products_subaccounts_joint_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.savings_account_type_joint, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_vaults_title, null, null, 14), new TextLocalisedClause(R$string.subaccounts_search_category, null, null, 14)));
            case 76:
                return new p97.a(t97.d.JUNIOR_ACCOUNTS, R$drawable.uikit_icn_24_children, new TextLocalisedClause(R$string.junior_search_product_title, null, null, 14), null, new TextLocalisedClause(R$string.junior_search_product_subtitle_generic, null, null, 14), v.k(new TextLocalisedClause(R$string.junior_search_product_title, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_subtitle_generic, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_keyword_18, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_keyword_children, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_keyword_junior, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_keyword_kids, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_keyword_lt18, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_keyword_teens, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_keyword_under, null, null, 14), new TextLocalisedClause(R$string.junior_search_product_keyword_youth, null, null, 14)));
            case 77:
                return new p97.a(t97.d.LEARN, R$drawable.uikit_icn_24_lightbulb, new TextLocalisedClause(R$string.investmentlearncatalogue_learn_search_product_title, null, null, 14), null, null, v.h());
            case 78:
                return new p97.a(t97.d.LIMITS, R$drawable.uikit_icn_24_limit_high, new TextLocalisedClause(R$string.search_block_discover_limits_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_limit, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_fees, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_fee, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_commission, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_withdrawal, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_fx, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_atms, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_cash, null, null, 14)));
            case 79:
                return new p97.a(t97.d.LINKED_ACCOUNTS, R$drawable.uikit_icn_24_link, new TextLocalisedClause(R$string.linked_search_products_linked_accounts_title, null, null, 14), null, new TextLocalisedClause(R$string.linked_search_products_linked_accounts_subtitle, null, null, 14), u.c(new TextLocalisedClause(R$string.linked_search_products_linked_accounts_category, null, null, 14)));
            case 80:
                return new p97.a(t97.d.LOUNGES, R$drawable.uikit_icn_24_lounges, new TextLocalisedClause(R$string.lifestyle_search_products_lounges, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_lounges, null, null, 14)));
            case 81:
                return new p97.a(t97.d.MASAV_DIRECT_DEBITS, R$drawable.uikit_icn_24_recurring, new TextLocalisedClause(R$string.masav_search_products_direct_debit, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.masav_search_products_direct_debit, null, null, 14)));
            case 82:
                return new p97.a(t97.d.MOBILE_PLANS, R$drawable.uikit_icn_24_call, new TextLocalisedClause(R$string.esim_global_search_products_mobile_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_products_mobile_plan_short, null, null, 14), null, v.k(new TextLocalisedClause(R$string.esim_global_search_keywords_abroad, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_activate_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_add_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_buy_data, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_buy_internet, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_calls, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_connectivity, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_data, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_data_abroad, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_data_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_esim_setup, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_get_esim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_holiday, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_international, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_international_data, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_internet, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_line, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_minutes, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_mobile, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_mobile_data, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_mobile_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_network, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_number, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_online, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_package, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_phone, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_roaming, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_signal, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_sim_card, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_sms, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_text, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_travel, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_travel_internet, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_travel_plan, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_trip, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_virtual_sim, null, null, 14), new TextLocalisedClause(R$string.esim_global_search_keywords_voice, null, null, 14)));
            case 83:
                return new p97.a(t97.d.MORTGAGE, R$drawable.uikit_icn_24_utilities, new TextLocalisedClause(R$string.credit_get_credit_mortgage_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_mortgage_description, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_mortgage, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_home, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_house, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_property, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_housing, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_apartment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_buying, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_realty, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_estate, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_land, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_loan, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_equity, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_collateral, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_preapproval, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_secured, null, null, 14)));
            case 84:
                return new p97.a(t97.d.MOST_TRADED, R$drawable.uikit_icn_24_arrow_upgrade, new TextLocalisedClause(R$string.global_search_products_most_traded_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_keywords_most_traded, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_most_traded_keywords_most_popular, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_popular_stocks, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_highest_volume, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_hot_stocks, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_most_active, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_top_stocks, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_trending_stocks, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_trade, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_invest, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_stocks, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_assets, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_etf, null, null, 14)));
            case 85:
                return new p97.a(t97.d.NEW_PAYMENT, R$drawable.uikit_icn_24_arrow_right_left, new TextLocalisedClause(R$string.global_search_products_new_payment_title, null, null, 14), null, new TextLocalisedClause(R$string.global_search_products_new_payment_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_keywords_pay, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_payments, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_transfers, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_bank, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_card, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_bank_transfers, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_card_transfers, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_revolut_transfers, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_send, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_send_money, null, null, 14)));
            case 86:
                return new p97.a(t97.d.NON_EMBEDDED_CREDIT_INSURANCE_CREDIT_CARD, R$drawable.uikit_icn_24_card_shield, new TextLocalisedClause(R$string.credit_credit_card_insurance_additional_entry_point_global_search_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.credit_search_keywords_insurance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_protection, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_coverage, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cpi, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_safeguard, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_shield, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_secure, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_safety, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_disability, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_unemployment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_life, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_redundancy, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_health, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_sickness, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_accident, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_injury, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cover, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_guarantee, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_waiver, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_backup, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_jobless, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_card, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cc, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_balance, null, null, 14)));
            case 87:
                return new p97.a(t97.d.NON_EMBEDDED_CREDIT_INSURANCE_LOAN, R$drawable.uikit_icn_24_coins_shield, new TextLocalisedClause(R$string.credit_insurance_additional_entry_point_global_search_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.credit_search_keywords_insurance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_protection, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_coverage, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cpi, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_safeguard, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_shield, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_secure, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_safety, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_disability, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_unemployment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_life, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_redundancy, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_health, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_sickness, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_accident, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_injury, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cover, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_guarantee, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_waiver, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_backup, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_jobless, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_loan, null, null, 14)));
            case 88:
                return new p97.a(t97.d.ONLINE_SHOPS, R$drawable.uikit_icn_24_shopping, new TextLocalisedClause(R$string.lifestyle_search_products_shops, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_shops, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_online, null, null, 14)));
            case 89:
                return new p97.a(t97.d.OVERDRAFT, R$drawable.uikit_icn_24_credit_overdraft, new TextLocalisedClause(R$string.credit_get_credit_overdraft_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_overdraft_description, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_overdraft, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_negative, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_minus, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_empty, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_emergency, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_insufficient, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_liquidity, null, null, 14)));
            case 90:
                return new p97.a(t97.d.PAYMENT_LINK, R$drawable.uikit_icn_24_share_ios, new TextLocalisedClause(R$string.global_search_products_payment_link_title, null, null, 14), null, new TextLocalisedClause(R$string.global_search_products_payment_link_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_keywords_payment_link_send_money, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_payment_link_request_money, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_payment_link_pay_by_link, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_payment_link_rev_me, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_payment_link_revolut_me, null, null, 14)));
            case 91:
                return new p97.a(t97.d.PAY_LATER, R$drawable.uikit_icn_24_time_and_money, new TextLocalisedClause(R$string.credit_get_credit_pay_later_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_pay_later_description, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_bnpl, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installments, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_split, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_later, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_flexi, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_financing, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_checkout, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_postpone, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_spread, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_shop, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_pay, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_slice, null, null, 14)));
            case 92:
                return new p97.a(t97.d.PERMISSIONS, R$drawable.uikit_icn_24_key, new TextLocalisedClause(R$string.search_block_discover_permissions_title, null, null, 14), null, null, v.h());
            case 93:
                return new p97.a(t97.d.PERSONAL_DETAILS, R$drawable.uikit_icn_24_profile, new TextLocalisedClause(R$string.search_block_discover_personal_details_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_my_details, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_profile, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_revtag, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_date_of_birth, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_address, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_phone_number, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_email, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_country, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_name, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_profile_settings, null, null, 14)));
            case 94:
                return new p97.a(t97.d.PERSONAL_LOAN, R$drawable.uikit_icn_24_credit, new TextLocalisedClause(R$string.credit_get_credit_loan_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_loan_description, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_loan, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cash, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_personal, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_borrow, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_advance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_funds, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_money, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_unsecured, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_debt, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_lending, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_car, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_home, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_improvement, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_renovation, null, null, 14)));
            case 95:
                return new p97.a(t97.d.PIX, R$drawable.uikit_icn_24_logo_pix_outline, new TextLocalisedClause(R$string.pix_global_search_title, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.pix_global_search_keyword_pix, null, null, 14)));
            case 96:
                return new p97.a(t97.d.PLAN_GIFTING, R$drawable.uikit_icn_24_present, new TextLocalisedClause(R$string.premium_search_products_keywords_plan_gifting, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.premium_search_keywords_family, null, null, 14), new TextLocalisedClause(R$string.premium_search_keywords_friend, null, null, 14), new TextLocalisedClause(R$string.premium_search_keywords_membership, null, null, 14), new TextLocalisedClause(R$string.premium_search_keywords_subscription, null, null, 14)));
            case 97:
                return new p97.a(t97.d.PRICING_PLAN, R$drawable.uikit_icn_24_premium, new TextLocalisedClause(R$string.search_block_discover_plan_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_plan_details, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_membership, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_subscription, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_tier, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_upgrade, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_standard, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_plus, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_premium, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_metal, null, null, 14)));
            case 98:
                return new p97.a(t97.d.PRIVACY_POLICY, R$drawable.uikit_icn_24_document, new TextLocalisedClause(R$string.search_block_discover_privacy_policy_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_privacy, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_policy, null, null, 14)));
            case 99:
                return new p97.a(t97.d.PROFILE, R$drawable.uikit_icn_24_profile, new TextLocalisedClause(R$string.search_block_discover_profile_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_settings, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_account_info, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_account_details, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_my_accounts, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_biometric, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_profile, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_profile_settings, null, null, 14)));
            case 100:
                return new p97.a(t97.d.PRO_ACCOUNT, R$drawable.uikit_icn_24_services, new TextLocalisedClause(R$string.freelancer_common_search_product_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.freelancer_common_search_product_default_keyword, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_accept_payments, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_account, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_business, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_card_reader, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_cashback, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_freelance, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_freelancer, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_hustle, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_invoices, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_qr_codes, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_merchant, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_payment_link, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_pro, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_professional, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_receive_payments, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_revolut_pay, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_revolut_reader, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_shopify, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_sole_trader, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_tax_account, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_work, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_gateway, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_online_gateway, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_woocommerce, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_prestashop, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_tap_to_pay, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_gig, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_pockets, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_tax, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_merchants, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_digital_nomad, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_expat, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_service_provider, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_independent_worker, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_micro_entrepreneur, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_partita_iva, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_accepting_payments, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_payment_links, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_woo_commerce, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_presta_shop, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_online_payment, null, null, 14)));
            case 101:
                return new p97.a(t97.d.PRO_CARD_READER, R$drawable.uikit_icn_24_card_reader, new TextLocalisedClause(R$string.freelancer_common_search_product_card_reader_title, null, null, 14), null, new TextLocalisedClause(R$string.freelancer_common_search_product_card_reader_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_card_reader, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_revolut_reader, null, null, 14)));
            case 102:
                return new p97.a(t97.d.PRO_HARDWARE_SHOP, R$drawable.uikit_icn_24_card_terminal, new TextLocalisedClause(R$string.freelancer_common_search_product_hardware_shop_title, null, null, 14), null, new TextLocalisedClause(R$string.freelancer_common_search_product_hardware_shop_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_hardware, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_in_person_payment, null, null, 14)));
            case 103:
                return new p97.a(t97.d.PRO_INVOICES, R$drawable.uikit_icn_24_document, new TextLocalisedClause(R$string.freelancer_common_search_product_invoices_title, null, null, 14), null, new TextLocalisedClause(R$string.freelancer_common_search_product_invoices_subtitle, null, null, 14), u.c(new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_invoices, null, null, 14)));
            case 104:
                return new p97.a(t97.d.PRO_PAYMENT_LINKS, R$drawable.uikit_icn_24_link, new TextLocalisedClause(R$string.freelancer_common_search_product_payment_links_title, null, null, 14), null, new TextLocalisedClause(R$string.freelancer_common_search_product_payment_links_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_payment_link, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_qr_codes, null, null, 14)));
            case 105:
                return new p97.a(t97.d.PRO_PLUGINS, R$drawable.uikit_icn_24_puzzle, new TextLocalisedClause(R$string.freelancer_common_search_product_plugins_title, null, null, 14), null, new TextLocalisedClause(R$string.freelancer_common_search_product_plugins_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_plugins, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_gateway, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_online_gateway, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_shopify, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_woocommerce, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_prestashop, null, null, 14)));
            case 106:
                return new p97.a(t97.d.PRO_TERMINAL, R$drawable.uikit_icn_24_card_terminal, new TextLocalisedClause(R$string.freelancer_common_search_product_revolut_terminal_title, null, null, 14), null, new TextLocalisedClause(R$string.freelancer_common_search_product_revolut_terminal_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_terminal, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_revolut_terminal, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_search_product_keyword_pos, null, null, 14)));
            case 107:
                return new p97.a(t97.d.REFERRALS, R$drawable.uikit_icn_24_add_contact, new TextLocalisedClause(R$string.referrals_product_search_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.referrals_product_search_keyword_reward, null, null, 14), new TextLocalisedClause(R$string.referrals_product_search_keyword_bonus, null, null, 14), new TextLocalisedClause(R$string.referrals_product_search_keyword_earn_money, null, null, 14), new TextLocalisedClause(R$string.referrals_product_search_keyword_get_money, null, null, 14), new TextLocalisedClause(R$string.referrals_product_search_keyword_invite, null, null, 14)));
            case LDSFile.EF_DG12_TAG /* 108 */:
                return new p97.a(t97.d.REFINANCING_LOAN, R$drawable.uikit_icn_24_refinancing, new TextLocalisedClause(R$string.credit_get_credit_refinancing_loan_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_refinancing_loan_description, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_refinance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_consolidation, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_consolidate, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_debt, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_restructuring, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_lending, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_switch, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_lower, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_transfer, null, null, 14)));
            case LDSFile.EF_DG13_TAG /* 109 */:
                return new p97.a(t97.d.REFINANCING_MORTGAGE, R$drawable.uikit_icn_24_refinancing_home, new TextLocalisedClause(R$string.credit_get_credit_refinancing_mortgage_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_refinancing_mortgage_description, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_refinance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_mortgage, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_home, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_house, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_property, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_housing, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_apartment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_buying, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_realty, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_estate, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_land, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_loan, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_equity, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_collateral, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_preapproval, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_secured, null, null, 14)));
            case LDSFile.EF_DG14_TAG /* 110 */:
                return new p97.a(t97.d.REVOLUT_X, R$drawable.uikit_icn_24_candlestick_chart, new TextLocalisedClause(R$string.crypto_global_search_revolutx_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_revolutx_keywords_revolut_x, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_revolutx_keywords_crypto_exchange, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_revolutx_keywords_advanced_trading, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_revolutx_keywords_trading_terminal, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_revolutx_keywords_terminal, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_revolutx_keywords_order_book, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_revolutx_keywords_pro_trading, null, null, 14)));
            case LDSFile.EF_DG15_TAG /* 111 */:
                return new p97.a(t97.d.REV_POINTS, R$drawable.uikit_icn_24_revpoints, new TextLocalisedClause(R$string.lifestyle_search_products_rev_points, null, null, 14), null, null, v.h());
            case 112:
                return new p97.a(t97.d.REV_POINTS_GIFT_CARDS, R$drawable.uikit_icn_24_present, new TextLocalisedClause(R$string.lifestyle_search_products_gift_cards, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_gift, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_cards, null, null, 14)));
            case 113:
                return new p97.a(t97.d.ROBO, R$drawable.uikit_icn_24_pie_chart, new TextLocalisedClause(R$string.wealth_robo_global_search_title, null, null, 14), null, new TextLocalisedClause(R$string.wealth_robo_global_search_description, null, null, 14), v.k(new TextLocalisedClause(R$string.wealth_robo_global_search_keys_automated, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_global_search_keys_robo, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_global_search_keys_robo_advisor, null, null, 14)));
            case 114:
                return new p97.a(t97.d.SAVINGS, R$drawable.uikit_icn_24_savings_vault, new TextLocalisedClause(R$string.vaults_search_product_savings_title, null, null, 14), null, new TextLocalisedClause(R$string.vaults_search_product_savings_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.vaults_search_product_savings_title, null, null, 14), new TextLocalisedClause(R$string.vaults_search_category, null, null, 14), new TextLocalisedClause(R$string.vaults_search_product_interest_title, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_flexible_savings, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_flexible_accounts, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_return, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_daily, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_yield, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_invest, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_spare, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_grow_money, null, null, 14)));
            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                return new p97.a(t97.d.SAVINGS_MMF, R$drawable.uikit_icn_24_savings_vault, new TextLocalisedClause(R$string.savings_umbrella_products_group_name_flexible_cash_funds, null, null, 14), null, new TextLocalisedClause(R$string.savings_account_switcher_new_account_description_mmf_new_v2, null, null, 14), v.k(new TextLocalisedClause(R$string.vaults_search_keywords_flexible_cash_funds, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_fidelity, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_mmf, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_funds, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_money_market_fund, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_return, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_daily, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_yield, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_invest, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_spare, null, null, 14), new TextLocalisedClause(R$string.vaults_search_keywords_grow_money, null, null, 14)));
            case 116:
                return new p97.a(t97.d.SCREENER, R$drawable.uikit_icn_24_controls, new TextLocalisedClause(R$string.search_block_screener_name, null, null, 14), null, new TextLocalisedClause(R$string.search_block_screener_cell_subtitle_results, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_keywords_trade, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_invest, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_stocks, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_assets, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_etf, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_bond, null, null, 14)));
            case LDSFile.EF_DG2_TAG /* 117 */:
                return new p97.a(t97.d.SECURED_CREDIT_CARD, R$drawable.uikit_icn_24_credit_card, new TextLocalisedClause(R$string.credit_get_credit_secured_credit_card_title, null, null, 14), null, new TextLocalisedClause(R$string.credit_get_credit_secured_credit_card_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.credit_search_keywords_secured, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_credit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_card, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rewards, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_points, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_cashback, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_limit, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_revpoints, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_balance, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_installment, null, null, 14), new TextLocalisedClause(R$string.credit_search_keywords_rates, null, null, 14)));
            case LDSFile.EF_DG4_TAG /* 118 */:
                return new p97.a(t97.d.SECURITY_AND_PRIVACY, R$drawable.uikit_icn_24_shield, new TextLocalisedClause(R$string.search_block_discover_security_and_privacy_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_ads, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_adverts, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_marketing, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_promotion, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_security, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_privacy, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_notifications, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_advertising, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_advertisement, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_push, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_payments, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_contacts, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_alerts, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_trusted_merchants, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_devices, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_gambling_block, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_sign_in, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_login, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_biometric, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_face_recognition, null, null, 14)));
            case LDSFile.EF_SOD_TAG /* 119 */:
                return new p97.a(t97.d.STABLECOINS, R$drawable.uikit_icn_24_rates_converter_page, new TextLocalisedClause(R$string.crypto_global_search_stablecoins_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_stablecoin, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_stablecoins, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_one_one_dollar, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_dollar_backed_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_stable_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_revolut_stablecoins, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_convert_stablecoin, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_eurr, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_usdr, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_stablecoins_keywords_gbpr, null, null, 14)));
            case SyslogConstants.LOG_CLOCK /* 120 */:
                return new p97.a(t97.d.STAKING, R$drawable.uikit_icn_24_percent, new TextLocalisedClause(R$string.crypto_global_search_staking_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.crypto_global_search_staking_keywords_staking, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_staking_keywords_earn_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_staking_keywords_passive_income, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_staking_keywords_crypto_rewards, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_staking_keywords_earn_with_crypto, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_staking_keywords_crypto_staking, null, null, 14), new TextLocalisedClause(R$string.crypto_global_search_staking_keywords_revolut_staking, null, null, 14)));
            case 121:
                return new p97.a(t97.d.STAYS, R$drawable.uikit_icn_24_resort, new TextLocalisedClause(R$string.lifestyle_search_products_stays, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_stays, null, null, 14)));
            case 122:
                return new p97.a(t97.d.STOCKS, R$drawable.uikit_icn_24_wealth, new TextLocalisedClause(R$string.invest_search_products_stocks, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.wealth_trading_account_selector_brokerage_account_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_account_selector_gia_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_account_selector_stocks_title, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_trades, null, null, 14), new TextLocalisedClause(R$string.invest_search_suggestions_stocks, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_asset_classes, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_instruments, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_securities, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_assets, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_markets, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_tradeables, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_investments, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_invest, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_wealth, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_trading, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_buy, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_sell, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_etfs, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_funds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_exchange_traded_funds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_indices, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_index_funds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_index_etfs, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_passive_investing, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_bonds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_fixed_income, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_debt, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_treasuries, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_corporate_bonds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_government_bonds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_gilts, null, null, 14)));
            case 123:
                return new p97.a(t97.d.STOCKS_ANALYTICS, R$drawable.uikit_icn_24_bar_chart, new TextLocalisedClause(R$string.wealth_analytics_search_product_stocks_analytics_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.wealth_analytics_search_product_stocks_keyword_advanced_analytics, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_brokerage_account_analytics_title, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_stocks_analytics_title, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_brokerage_account_analytics_description, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_stocks_analytics_description, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_stocks_keyword_stock_analytics, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_stocks_keyword_stocks_analytics, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_search_product_stocks_keyword_portfolio_analytics, null, null, 14)));
            case 124:
                return new p97.a(t97.d.STOCKS_JOINT_GIA, R$drawable.uikit_icn_24_wealth, new TextLocalisedClause(R$string.invest_search_products_stocks_joint_gia_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.invest_suggestions_products_stocks_joint_gia_joint, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_account_selector_brokerage_account_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_account_selector_gia_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_account_selector_stocks_title, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_trades, null, null, 14), new TextLocalisedClause(R$string.invest_search_suggestions_stocks, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_asset_classes, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_instruments, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_securities, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_assets, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_markets, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_tradeables, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_investments, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_invest, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_wealth, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_trading, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_buy, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_sell, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_etfs, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_funds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_exchange_traded_funds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_indices, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_index_funds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_index_etfs, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_passive_investing, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_bonds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_fixed_income, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_debt, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_treasuries, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_corporate_bonds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_government_bonds, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_gilts, null, null, 14)));
            case ISO781611.SMT_TAG /* 125 */:
                return new p97.a(t97.d.STOCKS_TAA_ISA, R$drawable.uikit_icn_24_bar_chart_percent, new TextLocalisedClause(R$string.wealth_invest_trading_account_isa_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_isa, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_individual_savings_account, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_stocks_and_shares_isa, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_tax_free_investing, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_uk_isa, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_stocks_isa, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_investment_isa, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_isa_allowence, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_taa_transfer_isa, null, null, 14)));
            case 126:
                return new p97.a(t97.d.STOCKS_TAA_JISA, R$drawable.uikit_icn_24_children, new TextLocalisedClause(R$string.wealth_invest_trading_account_jisa_generic_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.invest_suggestions_products_stocks_youth_taa_isa, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_youth_taa_jisa, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_youth_taa_kid_investing, null, null, 14), new TextLocalisedClause(R$string.invest_suggestions_products_stocks_youth_taa_junior_stocks_and_shares, null, null, 14)));
            case CertificateBody.profileType /* 127 */:
                return new p97.a(t97.d.STOCK_TRANSFER, R$drawable.uikit_icn_24_send_message, new TextLocalisedClause(R$string.wealth_invest_home_header_action_title_transfer_investments, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.global_search_keywords_transfers, null, null, 14), new TextLocalisedClause(R$string.invest_global_search_keywords_stock_transfer, null, null, 14), new TextLocalisedClause(R$string.invest_global_search_keywords_stocks_transfer, null, null, 14), new TextLocalisedClause(R$string.invest_global_search_keywords_transfer_investment, null, null, 14)));
            case 128:
                return new p97.a(t97.d.STUDENT_PLAN, R$drawable.uikit_icn_24_student, new TextLocalisedClause(R$string.premium_search_products_keywords_student, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.premium_search_keywords_student, null, null, 14), new TextLocalisedClause(R$string.premium_search_keywords_subscription, null, null, 14), new TextLocalisedClause(R$string.premium_search_keywords_membership, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_students, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_university, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_uni, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_college, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_campus, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_education, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_study, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_school, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_graduate, null, null, 14), new TextLocalisedClause(R$string.premium_search_products_keywords_student_undergraduate, null, null, 14)));
            case 129:
                return new p97.a(t97.d.SUBACCOUNTS, R$drawable.uikit_icn_24_wallet, new TextLocalisedClause(R$string.subaccounts_search_products_subaccounts_title, null, null, 14), null, new TextLocalisedClause(R$string.subaccounts_search_products_subaccounts_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.subaccounts_search_category, null, null, 14), new TextLocalisedClause(R$string.vaults_search_category, null, null, 14)));
            case 130:
                return new p97.a(t97.d.TERMS_AND_CONDITIONS, R$drawable.uikit_icn_24_info, new TextLocalisedClause(R$string.search_block_discover_terms_and_conditions_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_terms_and_conditions, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_terms, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_conditions, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_information, null, null, 14)));
            case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
                return new p97.a(t97.d.TOPUP_SALARY_TOPUP, R$drawable.uikit_icn_24_credit_bag, new TextLocalisedClause(R$string.topup_global_search_salary_topup_title, null, null, 14), null, new TextLocalisedClause(R$string.topup_global_search_salary_topup_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_keywords_salary, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_switch_salary, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_topup, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_receive_salary, null, null, 14)));
            case 132:
                return new p97.a(t97.d.TOP_MOVERS, R$drawable.uikit_icn_24_arrow_top_down, new TextLocalisedClause(R$string.global_search_products_top_movers_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_top_movers, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_top_gainers, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_top_losers, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_best_performing, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_worst_performance, null, null, 14), new TextLocalisedClause(R$string.revolutx_global_search_crypto_top_movers_keywords_price_change, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_market_movers, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_trade, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_invest, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_stocks, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_assets, null, null, 14)));
            case 133:
                return new p97.a(t97.d.TOP_UP, R$drawable.uikit_icn_24_plus, new TextLocalisedClause(R$string.topup_global_search_topup_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.global_search_keywords_topup, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_add_money, null, null, 14)));
            case ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA /* 134 */:
                return new p97.a(t97.d.TOP_UP_REGULAR_BANK_TRANSFER, R$drawable.uikit_icn_24_arrow_right_left, new TextLocalisedClause(R$string.topup_global_search_regular_bank_transfer_title, null, null, 14), null, new TextLocalisedClause(R$string.topup_global_search_regular_bank_transfer_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_keywords_topup, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_add_money, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_receive_money, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_regular_bank_transfer, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_bank_transfer, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_receive_transfer, null, null, 14)));
            case 135:
                return new p97.a(t97.d.TRADE, R$drawable.uikit_icn_24_arrow_rates, new TextLocalisedClause(R$string.global_search_products_trade_title, null, null, 14), null, new TextLocalisedClause(R$string.global_search_products_trade_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.global_search_keywords_trade, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_invest, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_stocks, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_shares, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_market, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_etf, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_commodities, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_buy, null, null, 14), new TextLocalisedClause(R$string.global_search_keywords_assets, null, null, 14)));
            case 136:
                return new p97.a(t97.d.TRADING_PRO, R$drawable.uikit_icn_24_wealth, new TextLocalisedClause(R$string.trading_pro_search_product_title, null, null, 14), null, new TextLocalisedClause(R$string.trading_pro_search_product_description, null, null, 14), v.k(new TextLocalisedClause(R$string.trading_pro_search_product_keyword_trading, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_keyword_trading_pro, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_keyword_advanced_trading, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_keyword_commission_discount, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_keyword_higher_order_limits, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_keyword_advanced_analytics, null, null, 14)));
            case 137:
                return new p97.a(t97.d.TRADING_TERMINAL, R$drawable.uikit_icn_24_laptop, new TextLocalisedClause(R$string.trading_pro_search_product_terminal_title, null, null, 14), null, new TextLocalisedClause(R$string.trading_pro_search_product_terminal_description, null, null, 14), v.k(new TextLocalisedClause(R$string.trading_pro_search_product_terminal_keyword_terminal, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_terminal_keyword_trading_terminal, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_terminal_keyword_stocks_terminal, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_terminal_keyword_desktop_terminal, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_terminal_keyword_web_terminal, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_terminal_keyword_crypto_terminal, null, null, 14), new TextLocalisedClause(R$string.trading_pro_search_product_terminal_keyword_invest_terminal, null, null, 14)));
            case 138:
                return new p97.a(t97.d.TRANSFER_LOCATOR, R$drawable.uikit_icn_24_time_and_money, new TextLocalisedClause(R$string.search_block_discover_inbound_transfer_locator_title, null, null, 14), null, null, u.c(new TextLocalisedClause(R$string.search_block_discover_keywords_inbound_transfer_locator, null, null, 14)));
            case 139:
                return new p97.a(t97.d.TRANSPORT, R$drawable.uikit_icn_24_transport, new TextLocalisedClause(R$string.lifestyle_search_products_transport, null, null, 14), null, new TextLocalisedClause(R$string.lifestyle_search_products_transport_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.lifestyle_search_products_keywords_bus, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_metro, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_parking, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_skycash, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_train, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_tram, null, null, 14), new TextLocalisedClause(R$string.lifestyle_search_products_keywords_transport, null, null, 14)));
            case 140:
                return new p97.a(t97.d.TRIPS, R$drawable.uikit_icn_24_globe, new TextLocalisedClause(R$string.trips_global_search_title, null, null, 14), null, new TextLocalisedClause(R$string.trips_global_search_subtitle, null, null, 14), v.k(new TextLocalisedClause(R$string.trips_global_search_keywords_globe, null, null, 14), new TextLocalisedClause(R$string.trips_global_search_keywords_map, null, null, 14), new TextLocalisedClause(R$string.trips_global_search_keywords_trip, null, null, 14), new TextLocalisedClause(R$string.trips_global_search_keywords_holiday, null, null, 14)));
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                return new p97.a(t97.d.WATCHLIST, R$drawable.uikit_icn_24_rates_converter_page, new TextLocalisedClause(R$string.search_block_discover_rates_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.search_block_discover_keywords_currency, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_currencies, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_crypto, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_cryptocurrencies, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_commodities, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_stocks, null, null, 14), new TextLocalisedClause(R$string.search_block_discover_keywords_watchlist, null, null, 14)));
            case 142:
                return new p97.a(t97.d.WEALTH_PROTECTION, R$drawable.uikit_icn_24_face_id, new TextLocalisedClause(R$string.security_hub_home_wealth_protection_title, null, null, 14), null, null, v.k(new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_biometric, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_biometrics, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_check, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_extra, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_limit, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_limits, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_protection, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_secure, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_security, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_transaction, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_transactions, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_transfer, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_transfers, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_verification, null, null, 14), new TextLocalisedClause(R$string.security_hub_wealth_protection_search_keywords_wealth, null, null, 14)));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TravelHotelsRoomsInformation H(cgi.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new TravelHotelsRoomsInformation(kVar.b().d().getF98098a(), kVar.getF98091b().f98087a, kVar.b().a().getF98115a(), v04.b.M(kVar.b().c().getF98112a()));
    }

    public static final int I(float f, int i) {
        return ColorUtils.setAlphaComponent(i, rim.d.c(f * Color.alpha(i)));
    }

    public static final Integer a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!kotlin.text.a0.H(str, "#", false)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            zc.q qVar = (zc.q) it8.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", qVar.f320994a);
            bundle.putLong("event_timestamp", qVar.f320995b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final void c(int i, ArrayList arrayList) {
        arrayList.add(new zc.q(i, System.currentTimeMillis()));
    }

    public static final dj0.d d(boolean z, BigDecimal bigDecimal, Pair pair) {
        return z ? qk.d.G(((xi0.b) pair.f186386b).f306286a, bigDecimal) : mif.a.Q(new ej0.b(bigDecimal, (xi0.b) pair.f186386b));
    }

    public static final String e(w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        switch (im2.h.f162288a[w0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "glow";
            case 6:
                return "premium";
            case 7:
                return "metal";
            case 8:
                return "ultra";
            case 9:
                return "private";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Clause f(hha.z zVar, int i, int i2, int i3, List args) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Period period = zVar.f152375a;
        Intrinsics.checkNotNullParameter(period, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Period period2 = jli.e.f175841a;
        Intrinsics.checkNotNullParameter(period, "<this>");
        if (period.getYears() == 0 && period.getMonths() == 0 && period.getWeeks() == 0 && period.getDays() > 0) {
            return new TextLocalisedQuantityClause(i, Integer.valueOf(period.getDays()), d0.E0(args, u.c(Integer.valueOf(period.getDays()))), (Style) null, 8);
        }
        Intrinsics.checkNotNullParameter(period, "<this>");
        if (period.getYears() == 0 && period.getMonths() == 0 && period.getWeeks() > 0 && period.getDays() == 0) {
            return new TextLocalisedQuantityClause(i2, Integer.valueOf(period.getWeeks()), d0.E0(args, u.c(Integer.valueOf(period.getWeeks()))), (Style) null, 8);
        }
        if (jli.e.j(period)) {
            return new TextLocalisedQuantityClause(i3, Integer.valueOf(period.getMonths()), d0.E0(args, u.c(Integer.valueOf(period.getMonths()))), (Style) null, 8);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final Rect g(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public static final List h(w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        switch (im2.h.f162288a[w0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return f0.f322471a;
            case 6:
                return u.c("premium");
            case 7:
                return v.k("premium", "metal");
            case 8:
                return v.k("premium", "metal", "ultra");
            case 9:
                return v.k("premium", "metal", "ultra", "private");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean i(hha.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List list = dVar.f152291h;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                hha.f fVar = ((hha.g) it8.next()).e;
                if (fVar != null ? j(fVar) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean j(hha.f fVar) {
        if (fVar == null) {
            return false;
        }
        Long l2 = fVar.f152303b;
        return new DateTime(l2 != null ? l2.longValue() : Long.MAX_VALUE).compareTo((ReadableInstant) DateTime.now()) > 0;
    }

    public static final boolean k(hha.z zVar) {
        DateTime dateTime;
        if (zVar == null || (dateTime = zVar.f152376b) == null) {
            return false;
        }
        return dateTime.isAfter(DateTime.now());
    }

    public static final boolean l(zli.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return Intrinsics.f(bVar.f323280c, v.k("kyc", "uae_pass"));
    }

    public static final boolean m(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return ocd.a.d(savingsProductData);
    }

    public static final boolean n(zli.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return Intrinsics.f(bVar.f323280c, v.k("sso", "uae-pass"));
    }

    public static final boolean o(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return ocd.a.d(savingsProductData) && !ocd.c.g(savingsProductData).isEmpty();
    }

    public static final boolean p(cgi.f fVar, TravelHotelsRoomsInformation selectedBed) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(selectedBed, "selectedBed");
        cgi.g gVar = fVar.f23992a;
        cgi.g gVar2 = fVar.f23992a;
        return Intrinsics.f(gVar.f23994a.f24006a, selectedBed.f97938a) && Intrinsics.f(gVar2.f23995b.f24001a, selectedBed.f97940c) && Intrinsics.f(v04.b.M(gVar2.f23996c.f23998a), selectedBed.d) && Intrinsics.f(fVar.f23993b.f98087a, selectedBed.f97939b);
    }

    public static final void q(oki.h hVar, Challenge challenge) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        if (mql.b.f208026a[challenge.f106098a.ordinal()] == 1) {
            hVar.d0(true, false);
        }
    }

    public static final int r(ogd.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        switch (lhd.a.f195252a[mVar.ordinal()]) {
            case 1:
                return com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_sorting_selection_dialog_option_manual;
            case 2:
                return com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_sorting_selection_dialog_option_price_change;
            case 3:
                return com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_sorting_selection_dialog_option_alphabetical;
            case 4:
                return com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_sorting_selection_dialog_option_volume;
            case 5:
                return com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_sorting_selection_dialog_option_change_24h;
            case 6:
                return com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_sorting_selection_dialog_option_price;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final b59.b s(c59.d dVar) {
        a59.a aVar;
        String str = dVar.f21476a;
        a59.a[] aVarArrValues = a59.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (kotlin.text.a0.z(aVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = a59.a.ESSENTIAL;
        }
        return new b59.b(aVar);
    }

    public static final c1b.g t(p0b.a aVar, String symbol) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        List time = aVar.getTime();
        ArrayList arrayList = new ArrayList(w.t(time, 10));
        int i = 0;
        for (Object obj2 : time) {
            int i2 = i + 1;
            Double d = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            long jLongValue = ((Number) obj2).longValue();
            double dDoubleValue = ((Number) aVar.getHigh().get(i)).doubleValue();
            double dDoubleValue2 = ((Number) aVar.getLow().get(i)).doubleValue();
            double dDoubleValue3 = ((Number) aVar.getOpen().get(i)).doubleValue();
            double dDoubleValue4 = ((Number) aVar.getClose().get(i)).doubleValue();
            List volume = aVar.getVolume();
            if (volume != null) {
                d = (Double) d0.e0(i, volume);
            }
            arrayList.add(new d1b.b(jLongValue, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, d));
            i = i2;
        }
        return new c1b.g(symbol, arrayList);
    }

    public static final CobrandedCardsAvailableRewards u(w5b.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f294828a;
        String str2 = fVar.f294829b;
        List<w5b.c> list = fVar.f294830c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (w5b.c cVar : list) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new CobrandedCardsAvailableRewardItem(cVar.f294791a, cVar.f294792b));
        }
        return new CobrandedCardsAvailableRewards(str, str2, arrayList);
    }

    public static final it3.i v(ir3.b bVar, it3.h status) {
        Map mapG;
        r2 r2Var;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(status, "status");
        Boolean secondaryEntryPointsVisibleByDefault = bVar.getSecondaryEntryPointsVisibleByDefault();
        boolean zBooleanValue = secondaryEntryPointsVisibleByDefault != null ? secondaryEntryPointsVisibleByDefault.booleanValue() : true;
        Map secondaryEntryPointsVisibleOverrides = bVar.getSecondaryEntryPointsVisibleOverrides();
        if (secondaryEntryPointsVisibleOverrides != null) {
            mapG = new LinkedHashMap();
            for (Map.Entry entry : secondaryEntryPointsVisibleOverrides.entrySet()) {
                String str = (String) entry.getKey();
                r2[] r2VarArrValues = r2.values();
                int length = r2VarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        r2Var = null;
                        break;
                    }
                    r2Var = r2VarArrValues[i];
                    if (kotlin.text.a0.z(r2Var.name(), str, true)) {
                        break;
                    }
                    i++;
                }
                if (r2Var != null) {
                    mapG.put(r2Var, entry.getValue());
                }
            }
        } else {
            mapG = r0.g();
        }
        return new it3.i(status, zBooleanValue, mapG);
    }

    public static final ArrayList w(bvh.h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        List listA = h0Var.getSuggestions();
        Intrinsics.checkNotNullParameter(listA, "<this>");
        List<bvh.f0> list = listA;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (bvh.f0 f0Var : list) {
            Intrinsics.checkNotNullParameter(f0Var, "<this>");
            arrayList.add(f0Var.getValue());
        }
        return arrayList;
    }

    public static final ArrayList x(List list) {
        List<cr9.m> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (cr9.m mVar : list2) {
            String strC = mVar.getName();
            long jA = mVar.getAmount();
            String strB = mVar.getCurrencyCode();
            List listD = mVar.getPayerIds();
            ArrayList arrayList2 = new ArrayList(w.t(listD, 10));
            Iterator it8 = listD.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((cr9.n) it8.next()).getMemberId());
            }
            arrayList.add(new oq9.k(strC, jA, strB, arrayList2));
        }
        return arrayList;
    }

    public static final mgb.k y(igb.f0 f0Var) {
        mgb.h hVar;
        mgb.j jVar;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        boolean z = f0Var.f161125a;
        igb.v vVar = f0Var.f161126b;
        mgb.e eVar = new mgb.e(vVar.f161152a, vVar.f161153b, vVar.f161154c);
        List list = f0Var.f161127c;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            mgb.o oVar = null;
            if (!it8.hasNext()) {
                break;
            }
            String str = (String) it8.next();
            mgb.o[] oVarArrValues = mgb.o.values();
            int length = oVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                mgb.o oVar2 = oVarArrValues[i];
                if (kotlin.text.a0.z(oVar2.name(), str, true)) {
                    oVar = oVar2;
                    break;
                }
                i++;
            }
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        igb.y yVar = f0Var.d;
        mgb.f fVar = yVar != null ? new mgb.f(mo3.a.o(yVar.f161157b), yVar.f161156a) : null;
        igb.b0 b0Var = f0Var.e;
        if (b0Var != null) {
            String str2 = b0Var.f161115a;
            String str3 = b0Var.f161116b;
            String str4 = b0Var.f161117c;
            igb.r rVar = b0Var.d;
            hVar = new mgb.h(str2, str3, str4, new mgb.g(rVar.f161145a, rVar.f161146b));
        } else {
            hVar = null;
        }
        igb.s sVar = f0Var.f;
        mgb.d dVar = sVar != null ? new mgb.d(Intrinsics.f(sVar.f161147a, Boolean.TRUE), sVar.f161148b, sVar.f161149c) : null;
        e0 e0Var = f0Var.f161128g;
        if (e0Var != null) {
            String str5 = e0Var.f161122a;
            List<igb.n> list2 = e0Var.f161123b;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (igb.n nVar : list2) {
                arrayList2.add(new mgb.i(nVar.f161142a, nVar.f161143b));
            }
            jVar = new mgb.j(str5, arrayList2);
        } else {
            jVar = null;
        }
        return new mgb.k(z, eVar, arrayList, fVar, hVar, dVar, jVar, f0Var.f161129h);
    }

    public static final oga.c z(xga.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String str = oVar.f305655a;
        String str2 = oVar.f305656b;
        if (Intrinsics.f(str, "IMAGE")) {
            return new oga.a(str2);
        }
        if (Intrinsics.f(str, "LOTTIE")) {
            return new oga.b(str2);
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PricingPlanContextualMappers", j6.a.q("Unsupported icon type: ", oVar.f305655a), null, h0Var);
        return null;
    }
}
