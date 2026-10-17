package fsd;

import amd.e;
import amd.f;
import amd.j;
import amd.k;
import amd.l0;
import amd.t;
import amd.z;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zsd.g;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static int a(amd.b netWorthGroupType) {
        Intrinsics.checkNotNullParameter(netWorthGroupType, "netWorthGroupType");
        switch (d.f137662a[netWorthGroupType.ordinal()]) {
            case 1:
                return R$attr.uikit_colorBlue;
            case 2:
            case 3:
            case 4:
                return R$attr.uikit_colorCyan;
            case 5:
                return R$attr.uikit_colorTerracotta;
            case 6:
                return R$attr.uikit_colorLightBlue;
            case 7:
                return R$attr.uikit_colorPurple;
            case 8:
                return R$attr.uikit_colorTeal;
            case 9:
                return R$attr.uikit_colorLime;
            case 10:
                return R$attr.uikit_colorLightGreen;
            case 11:
                return R$attr.uikit_colorTeal;
            case 12:
                return R$attr.uikit_colorIndigo;
            case 13:
                return R$attr.uikit_colorBrown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static Clause b(j totalWealthGroup) {
        int i;
        int i2;
        Object next;
        List list;
        Intrinsics.checkNotNullParameter(totalWealthGroup, "totalWealthGroup");
        amd.b bVar = totalWealthGroup.f6332a;
        k kVar = totalWealthGroup.e;
        List list2 = totalWealthGroup.f6333b;
        int size = 0;
        switch (d.f137662a[bVar.ordinal()]) {
            case 1:
                List list3 = list2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (((amd.d) obj2).f6312a != e.POCKETS) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it8 = arrayList.iterator();
                int size2 = 0;
                while (it8.hasNext()) {
                    size2 += ((amd.d) it8.next()).f6313b.size();
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((amd.d) obj3).f6312a == e.POCKETS) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    size += ((amd.d) it9.next()).f6313b.size();
                }
                TextLocalisedQuantityClause[] elements = {size2 > 0 ? new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_cash_description, Integer.valueOf(size2), u.c(Integer.valueOf(size2)), (Style) null, 24) : null, size > 0 ? new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_cash_pockets_description, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return yoj.b.m(new TextClause(" & ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
            case 2:
            case 3:
            case 4:
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    size += ((amd.d) it10.next()).f6313b.size();
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_linked_description, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
            case 5:
                if (kVar instanceof zsd.b) {
                    return null;
                }
                Iterator it11 = list2.iterator();
                while (it11.hasNext()) {
                    size += ((amd.d) it11.next()).f6313b.size();
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_savings_description, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
            case 6:
                if (kVar instanceof ssd.d) {
                    i = ((ssd.d) kVar).f265374a;
                } else if (kVar instanceof rsd.e) {
                    i = ((rsd.e) kVar).f257051a;
                } else {
                    Iterator it12 = list2.iterator();
                    while (it12.hasNext()) {
                        size += ((amd.d) it12.next()).f6313b.size();
                    }
                    i = size;
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_invest_description, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24);
            case 7:
                Iterator it13 = list2.iterator();
                int i3 = 0;
                while (it13.hasNext()) {
                    List list4 = ((amd.d) it13.next()).f6313b;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it14 = list4.iterator();
                        i2 = 0;
                        while (it14.hasNext()) {
                            if (!(((f) it14.next()).f6322g instanceof t) && (i2 = i2 + 1) < 0) {
                                v.r();
                                throw null;
                            }
                        }
                    }
                    i3 += i2;
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_crypto_description, Integer.valueOf(i3), u.c(Integer.valueOf(i3)), (Style) null, 24);
            case 8:
                Iterator it15 = list2.iterator();
                while (it15.hasNext()) {
                    size += ((amd.d) it15.next()).f6313b.size();
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_credit_cards_description, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
            case 9:
                Iterator it16 = list2.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next = it16.next();
                        if (((amd.d) next).f6312a == e.PAY_LATER) {
                        }
                    } else {
                        next = null;
                    }
                }
                amd.d dVar = (amd.d) next;
                if (dVar != null && (list = dVar.f6313b) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it17 = list.iterator();
                    while (it17.hasNext()) {
                        l0 l0Var = ((f) it17.next()).f6322g;
                        z zVar = l0Var instanceof z ? (z) l0Var : null;
                        Integer numValueOf = zVar != null ? Integer.valueOf(zVar.f6356a) : null;
                        if (numValueOf != null) {
                            arrayList3.add(numValueOf);
                        }
                    }
                    size = d0.T0(arrayList3);
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_pay_later_description, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
            case 10:
                Iterator it18 = list2.iterator();
                while (it18.hasNext()) {
                    size += ((amd.d) it18.next()).f6313b.size();
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_loan_description, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
            case 11:
                Iterator it19 = list2.iterator();
                while (it19.hasNext()) {
                    size += ((amd.d) it19.next()).f6313b.size();
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_net_worth_group_credit_combined_description, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
            case 12:
                Iterator it20 = list2.iterator();
                while (it20.hasNext()) {
                    size += ((amd.d) it20.next()).f6313b.size();
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_account_picker_subtitle_accounts, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
            case 13:
                Iterator it21 = list2.iterator();
                while (it21.hasNext()) {
                    size += ((amd.d) it21.next()).f6313b.size();
                }
                return new TextLocalisedQuantityClause(R$plurals.analytics_total_wealth_custom_assets_label_assets_count, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static LayeredImage c(amd.b netWorthGroupType) {
        Intrinsics.checkNotNullParameter(netWorthGroupType, "netWorthGroupType");
        switch (d.f137662a[netWorthGroupType.ordinal()]) {
            case 1:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 2:
            case 3:
            case 4:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_link, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 5:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_vault, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 6:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_invest, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 7:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bitcoin, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 8:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_credit_card, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 9:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_time_and_money, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 10:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_credit, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 11:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_credit_bag, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 12:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_wallet, Integer.valueOf(R$attr.uikit_colorWhite), a(netWorthGroupType), 8.0f, null, null, 48);
            case 13:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_business_basic, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorBrown, 8.0f, null, null, 48);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static Clause d(amd.b netWorthGroupType, k kVar) {
        Intrinsics.checkNotNullParameter(netWorthGroupType, "netWorthGroupType");
        switch (d.f137662a[netWorthGroupType.ordinal()]) {
            case 1:
                if (kVar instanceof isd.b) {
                    return new TextLocalisedClause(R$string.analytics_total_wealth_cash_junior_promo_subtitle, u.c(((isd.b) kVar).f168184a), null, 12);
                }
                return null;
            case 2:
            case 3:
            case 4:
                return new TextLocalisedClause(R$string.analytics_widget_total_wealth_linked_promo, null, null, 14);
            case 5:
                if (kVar instanceof g) {
                    return ((g) kVar).f324893b;
                }
                if (kVar instanceof zsd.b) {
                    return ((zsd.b) kVar).f324885b;
                }
                return null;
            case 6:
                return kVar instanceof ssd.c ? new TextLocalisedClause(R$string.analytics_widget_net_worth_junior_invest_promo, null, null, 14) : kVar instanceof ssd.e ? new TextLocalisedClause(R$string.analytics_widget_net_worth_junior_invest_onboarding_promo, null, null, 14) : new TextLocalisedClause(R$string.analytics_widget_net_worth_invest_manage_promo, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.analytics_widget_net_worth_crypto_manage_promo, null, null, 14);
            case 8:
                Intrinsics.i(kVar, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.providers.credit_card.CreditCardTotalWealthGroupProvider.CreditCardTotalWealthGroupParcel");
                Clause clause = ((osd.b) kVar).f229314a.d;
                if (clause != null) {
                    return clause;
                }
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 9:
                return new TextLocalisedClause(R$string.analytics_net_worth_pay_later_promo, null, null, 14);
            case 10:
                if (kVar instanceof xsd.f) {
                    return ((xsd.f) kVar).f308451a;
                }
                return null;
            case 11:
                return new TextLocalisedClause(R$string.analytics_net_worth_credit_combined_promo, null, null, 14);
            case 12:
                return new TextLocalisedClause(R$string.analytics_total_wealth_pockets_junior_promo_subtitle, null, null, 14);
            case 13:
                return new TextLocalisedClause(R$string.analytics_total_wealth_add_new_other_assets_empty_subtitle, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static Clause e(j totalWealthGroup) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(totalWealthGroup, "totalWealthGroup");
        amd.b bVar = totalWealthGroup.f6332a;
        k kVar = totalWealthGroup.e;
        switch (d.f137662a[bVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.analytics_net_worth_group_cash_title, null, null, 14);
            case 2:
            case 3:
            case 4:
                return new TextLocalisedClause(R$string.analytics_net_worth_group_linked_title, null, null, 14);
            case 5:
                if (kVar instanceof g) {
                    return ((g) kVar).f324892a;
                }
                if (kVar instanceof zsd.b) {
                    return ((zsd.b) kVar).f324884a;
                }
                throw new IllegalStateException(a0.d.l(kVar != null ? kVar.getClass() : null, "Unexpected parcel for savings = "));
            case 6:
                return kVar instanceof ssd.f ? new TextLocalisedClause(R$string.analytics_total_wealth_youth_invest_title, null, null, 14) : new TextLocalisedClause(R$string.analytics_net_worth_group_invest_title, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.analytics_net_worth_group_crypto_title, null, null, 14);
            case 8:
                osd.b bVar2 = kVar instanceof osd.b ? (osd.b) kVar : null;
                return (bVar2 == null || (textLocalisedClause = bVar2.f229314a.f127604c) == null) ? new TextLocalisedClause(R$string.analytics_net_worth_group_credit_cards_title, null, null, 14) : textLocalisedClause;
            case 9:
                return new TextLocalisedClause(R$string.analytics_net_worth_group_pay_later_title, null, null, 14);
            case 10:
                return new TextLocalisedClause(R$string.analytics_net_worth_group_loan_title, null, null, 14);
            case 11:
                return new TextLocalisedClause(R$string.analytics_net_worth_group_credit_combined_title, null, null, 14);
            case 12:
                return new TextLocalisedClause(R$string.analytics_net_worth_group_pockets_title, null, null, 14);
            case 13:
                return new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_category_other_assets, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
