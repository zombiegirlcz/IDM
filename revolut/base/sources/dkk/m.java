package dkk;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPointsBenefits;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.FeatureTagData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.PlanFeatureResource;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$DomainState;
import d9.e1;
import dej.c1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115610a;

    public /* synthetic */ m(int i) {
        this.f115610a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVar;
        Object next;
        Object next2;
        mha.e eVar;
        Long l2;
        Object next3;
        Object next4;
        mha.f fVar;
        TextLocalisedClause textLocalisedClause;
        mha.g gVar;
        switch (this.f115610a) {
            case 0:
                c1 offer = (c1) obj2;
                Intrinsics.checkNotNullParameter(offer, "offer");
                return Long.valueOf(offer.f113507g.f);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                mha.d dVar2 = (mha.d) pair.f186385a;
                if (((Number) pair.f186386b).intValue() == 0 || (dVar = dVar2.f205444c) == null) {
                    return null;
                }
                MoneyClause moneyClauseB = dok.b.b(dVar, null, null, null, 7);
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.f152343b, new TextLocalisedClause(R$string.dashboard_feature_free_fx_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_free_fx_subtitle_new, zhm.u.c(moneyClauseB), null, 12), R$drawable.uikit_icn_24_arrow_exchange, (FeatureTagData) null, 34);
            case 2:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                ArrayList arrayList = new ArrayList();
                Iterator it9 = it8.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        Iterator it10 = arrayList.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                Object next5 = it10.next();
                                if (((mha.d) next5).f205444c != null) {
                                    obj = next5;
                                }
                            }
                        }
                        return (mha.d) obj;
                    }
                    mha.h hVar = (mha.h) it9.next();
                    obj = hVar instanceof mha.d ? (mha.d) hVar : null;
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                break;
            case 3:
                e7l.f it11 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                LinkedHashSet linkedHashSet = it11.M;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : linkedHashSet) {
                    if (h30.l.D(xi0.b.Companion, (String) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                return Integer.valueOf(arrayList2.size());
            case 4:
                do3.n user = (do3.n) obj2;
                wi0.b bVar = r.f115615h;
                wi0.b bVar2 = r.i;
                Intrinsics.checkNotNullParameter(user, "user");
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.G, te0.w.T(user, r.e, r.d, r.f, r.f115614g) ? new TextLocalisedClause(R$string.dashboard_INSURANCE_title_global_travel_insurance, null, null, 14) : te0.w.T(user, bVar2, bVar) ? new TextLocalisedClause(R$string.dashboard_feature_travel_insurance_title_anz, null, null, 14) : new TextLocalisedClause(R$string.dashboard_feature_free_insurance_title, null, null, 14), te0.w.T(user, bVar2, bVar) ? new TextLocalisedClause(R$string.dashboard_feature_travel_insurance_subtitle_anz, null, null, 14) : new TextLocalisedClause(R$string.dashboard_feature_global_travel_insurance_premium_subtitle, null, null, 14), R$drawable.uikit_icn_24_medical_cross, (FeatureTagData) null, 34);
            case 5:
                ti7.c limit = (ti7.c) obj2;
                Intrinsics.checkNotNullParameter(limit, "limit");
                dj0.d dVar3 = limit.f271429b;
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.J, new TextLocalisedClause(R$string.dashboard_feature_personal_liability_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_personal_liability_subtitle_new, zhm.u.c(dok.b.b(dVar3, new MoneyClause.Format.Shorts(false, 63), null, null, 6)), null, 12), R$drawable.uikit_icn_24_profile, (FeatureTagData) null, 34);
            case 6:
                do3.n user2 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                wi0.b.Companion.getClass();
                if (te0.w.S(user2, wi0.b.f297770q3)) {
                    return v.b();
                }
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.K, new TextLocalisedClause(R$string.dashboard_feature_purchase_protection_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_purchase_protection_subtitle, null, null, 14), R$drawable.uikit_icn_24_shopping, (FeatureTagData) null, 34);
            case 7:
                dj0.d purchaseProtectionMoney = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(purchaseProtectionMoney, "purchaseProtectionMoney");
                hha.u.Companion.getClass();
                return v.a(hha.u.M, purchaseProtectionMoney);
            case 8:
                dj0.d purchaseProtectionMoney2 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(purchaseProtectionMoney2, "purchaseProtectionMoney");
                hha.u.Companion.getClass();
                return v.a(hha.u.L, purchaseProtectionMoney2);
            case 9:
                dj0.d refundProtectionMoney = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(refundProtectionMoney, "refundProtectionMoney");
                MoneyClause moneyClauseB2 = dok.b.b(refundProtectionMoney, null, null, null, 7);
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.Q, new TextLocalisedClause(R$string.dashboard_feature_refund_protection_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_refund_protection_subtitle, zhm.u.c(moneyClauseB2), null, 12), R$drawable.uikit_icn_24_revert_left, (FeatureTagData) null, 34);
            case 10:
                List insuranceSubtypeLimits = (List) obj2;
                Intrinsics.checkNotNullParameter(insuranceSubtypeLimits, "insuranceSubtypeLimits");
                Iterator it12 = insuranceSubtypeLimits.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next = it12.next();
                        if (((ti7.e) next).f271431a == dl7.a.REFUND_PROTECTION) {
                        }
                    } else {
                        next = null;
                    }
                }
                ti7.e eVar2 = (ti7.e) next;
                if (eVar2 == null) {
                    return null;
                }
                Iterator it13 = eVar2.f271432b.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next2 = it13.next();
                        if (((ti7.c) next2).f271428a == ti7.d.REFUND_PROTECTION_PER_ITEM_REFUND_LIMIT) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                ti7.c cVar = (ti7.c) next2;
                if (cVar != null) {
                    return cVar.f271429b;
                }
                return null;
            case 11:
                RevPointsBenefits benefit = (RevPointsBenefits) obj2;
                Intrinsics.checkNotNullParameter(benefit, "benefit");
                int i = Integer.parseInt(benefit.f83962b);
                dj0.d dVar4 = benefit.f83961a;
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.f152356n0, new TextLocalisedQuantityClause(R$plurals.dashboard_feature_rev_points_card_title, Integer.valueOf(i), zhm.v.k(Integer.valueOf(i), dok.b.b(dVar4, null, null, null, 7)), (Style) null, 24), new TextLocalisedClause(R$string.plansDashboard_group_rev_points_rates_subtitle, null, null, 14), R$drawable.uikit_icn_24_rev_points, (FeatureTagData) null, 34);
            case 12:
                do3.n user3 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user3, "user");
                wi0.b.Companion.getClass();
                TextLocalisedClause textLocalisedClause2 = te0.w.S(user3, wi0.b.X0) ? new TextLocalisedClause(R$string.dashboard_feature_roundclock_support_subtitle_jp, null, null, 14) : new TextLocalisedClause(R$string.dashboard_feature_roundclock_support_subtitle, null, null, 14);
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.f152353l, new TextLocalisedClause(R$string.dashboard_feature_roundclock_support_title, null, null, 14), textLocalisedClause2, R$drawable.uikit_icn_24_chat, (FeatureTagData) null, 34);
            case 13:
                List limits = (List) obj2;
                Intrinsics.checkNotNullParameter(limits, "limits");
                Intrinsics.checkNotNullParameter(limits, "<this>");
                Iterator it14 = limits.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        mha.h hVar2 = (mha.h) it14.next();
                        eVar = hVar2 instanceof mha.e ? (mha.e) hVar2 : null;
                        if (eVar != null) {
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar == null || (l2 = eVar.f205447c) == null) {
                    return null;
                }
                TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.dashboard_restructured_feature_stocks_subtitle3, Integer.valueOf((int) l2.longValue()), (List) null, (Style) null, 28);
                PercentageClause percentageClause = new PercentageClause(eVar.d.f205454a, PercentageClause.Format.Long.f57911a, (Custom) null, 4);
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.o, new TextLocalisedClause(R$string.dashboard_feature_stocks_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_stocks_subtitle_with_fees, zhm.v.k(textLocalisedQuantityClause, percentageClause), null, 12), R$drawable.uikit_icn_24_wealth, (FeatureTagData) null, 34);
            case 14:
                dj0.d refundLimit = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(refundLimit, "refundLimit");
                MoneyClause moneyClauseB3 = dok.b.b(refundLimit, null, null, null, 7);
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.R, new TextLocalisedClause(R$string.dashboard_feature_ticket_cancellation_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_ticket_cancellation_subtitle, zhm.u.c(moneyClauseB3), null, 12), R$drawable.uikit_icn_24_voucher, (FeatureTagData) null, 34);
            case 15:
                List insuranceSubtypeLimits2 = (List) obj2;
                Intrinsics.checkNotNullParameter(insuranceSubtypeLimits2, "insuranceSubtypeLimits");
                Iterator it15 = insuranceSubtypeLimits2.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next3 = it15.next();
                        if (((ti7.e) next3).f271431a == dl7.a.TICKET_CANCELLATION) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                ti7.e eVar3 = (ti7.e) next3;
                if (eVar3 == null) {
                    return null;
                }
                Iterator it16 = eVar3.f271432b.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next4 = it16.next();
                        if (((ti7.c) next4).f271428a == ti7.d.TICKET_PROTECTION_ANNUAL_REFUND_LIMIT) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                ti7.c cVar2 = (ti7.c) next4;
                if (cVar2 != null) {
                    return cVar2.f271429b;
                }
                return null;
            case 16:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Intrinsics.checkNotNullParameter(it17, "<this>");
                Iterator it18 = it17.iterator();
                do {
                    fVar = null;
                    if (it18.hasNext()) {
                        mha.h hVar3 = (mha.h) it18.next();
                        if (hVar3 instanceof mha.f) {
                            fVar = (mha.f) hVar3;
                        }
                    }
                    return fVar;
                } while (fVar == null);
                return fVar;
            case 17:
                mha.f transfersLimit = (mha.f) obj2;
                Intrinsics.checkNotNullParameter(transfersLimit, "transfersLimit");
                BigDecimal bigDecimal = transfersLimit.f205449b;
                if (!e1.G(bigDecimal)) {
                    return null;
                }
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.P, new TextLocalisedClause(R$string.dashboard_feature_international_transfers_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_international_transfers_discounted_fee_subtitle, zhm.u.c(new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6)), null, 12), R$drawable.uikit_icn_24_arrow_right_left, (FeatureTagData) null, 34);
            case 18:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                do3.n nVar = (do3.n) rVar.f314201a;
                e7l.f fVar2 = (e7l.f) rVar.f314202b;
                mha.g gVar2 = (mha.g) rVar.f314203c;
                wi0.b.Companion.getClass();
                TextLocalisedClause textLocalisedClause3 = te0.w.S(nVar, wi0.b.X0) ? new TextLocalisedClause(R$string.dashboard_feature_free_unlimited_fx_title_jp, null, null, 14) : new TextLocalisedClause(R$string.dashboard_feature_free_unlimited_fx_title_no_weekend_markups, null, null, 14);
                LinkedHashSet linkedHashSet2 = fVar2.M;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : linkedHashSet2) {
                    if (h30.l.D(xi0.b.Companion, (String) obj4)) {
                        arrayList3.add(obj4);
                    }
                }
                int size = arrayList3.size();
                if (gVar2 != null) {
                    mha.j jVar = gVar2.f205452c;
                    textLocalisedClause = (jVar != null ? jVar.f205454a : 0.0d) > 0.0d ? new TextLocalisedClause(R$string.dashboard_feature_free_unlimited_fx_subtitle_new, zhm.u.c(Integer.valueOf(size)), null, 12) : new TextLocalisedClause(R$string.dashboard_feature_free_unlimited_fx_subtitle_no_weekend_markups, null, null, 14);
                } else {
                    textLocalisedClause = null;
                }
                if (textLocalisedClause == null) {
                    return null;
                }
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.f, textLocalisedClause3, textLocalisedClause, R$drawable.uikit_icn_24_arrow_exchange, (FeatureTagData) null, 34);
            case 19:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Intrinsics.checkNotNullParameter(it19, "<this>");
                Iterator it20 = it19.iterator();
                do {
                    gVar = null;
                    if (it20.hasNext()) {
                        mha.h hVar4 = (mha.h) it20.next();
                        if (hVar4 instanceof mha.g) {
                            gVar = (mha.g) hVar4;
                        }
                    }
                    return gVar;
                } while (gVar == null);
                return gVar;
            case 20:
                xi0.b insuranceCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(insuranceCurrency, "insuranceCurrency");
                MoneyClause moneyClauseB4 = dok.b.b(new dj0.d(1000000000L, insuranceCurrency), null, null, null, 7);
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.H, new TextLocalisedClause(R$string.dashboard_feature_winter_sports_cover_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_restructured_feature_winter_sports_cover_subtitle1, zhm.u.c(new TextLocalisedClause(R$string.dashboard_restructured_feature_winter_sports_cover_subtitle2, zhm.u.c(moneyClauseB4), null, 12)), null, 12), R$drawable.uikit_icn_24_snowflake, (FeatureTagData) null, 34);
            case 21:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return Boolean.valueOf(config.f123400w0.f123415a);
            case 22:
                if (((Boolean) obj2).booleanValue()) {
                    xi0.b.Companion.getClass();
                    return xi0.b.f306273h;
                }
                xi0.b.Companion.getClass();
                return xi0.b.f306272g;
            case 23:
                do3.n it21 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f116408a;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return dlh.a.a();
            case 25:
                PlanCancelFlowContract$DomainState update = (PlanCancelFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return PlanCancelFlowContract$DomainState.a(update, null, null, 2);
            case 26:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return getDefaultLoadingItems.invoke();
            case 27:
                Data data = new Data(null, new IllegalStateException("Product is absent in current plan"), false, 5, null);
                ((dmb.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                return new dmb.g(data);
            case 28:
                Intrinsics.checkNotNullParameter((MatchResult) obj2, "it");
                return "";
            default:
                Intrinsics.checkNotNullParameter((MatchResult) obj2, "it");
                return "%s";
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f115610a = i;
    }
}
