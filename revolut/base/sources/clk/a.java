package clk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.rev_points.models.RevPointsBenefits;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature_travel_hotels_models.cashback.CashbackDetails;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.FeatureTagData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.PlanFeatureResource;
import dej.c1;
import dej.h1;
import dkk.f;
import do3.n;
import hha.d;
import hha.g;
import hha.s;
import hha.u;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jli.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mha.h;
import mha.j;
import od0.i;
import org.joda.time.Period;
import te0.w;
import yhm.r;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f25043b;

    public /* synthetic */ a(d dVar, int i) {
        this.f25042a = i;
        this.f25043b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.revolut.core.ui_kit.models.PercentageClause$Format, com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r12v24 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        dj0.d dVar;
        dj0.d dVar2;
        mha.a aVar;
        TextLocalisedClause textLocalisedClause;
        Object next3;
        mha.b bVar;
        TextLocalisedClause textLocalisedClause2;
        mha.c cVar;
        Clause textLocalisedClause3;
        Clause clause;
        boolean z;
        int i = this.f25042a;
        int i2 = 6;
        Object obj3 = null;
        Boolean boolValueOf = null;
        Object obj4 = null;
        d dVar3 = this.f25043b;
        switch (i) {
            case 0:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                Iterator it8 = plans.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (s.j((d) next)) {
                        }
                    } else {
                        next = null;
                    }
                }
                d dVar4 = (d) next;
                if (dVar4 == null) {
                    return Boolean.FALSE;
                }
                Period billingPeriod = e.f175842b;
                Intrinsics.checkNotNullParameter(dVar4, "<this>");
                Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
                Iterator it9 = dVar4.f152291h.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((g) next2).f152306a, billingPeriod)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                g gVar = (g) next2;
                fVar = gVar != null ? gVar.e : 0;
                if (fVar == 0 || (dVar = fVar.f152304c) == null) {
                    return Boolean.FALSE;
                }
                Intrinsics.h(dVar3);
                g gVarB = dok.g.b(dVar3);
                if (gVarB == null || (dVar2 = gVarB.f152308c) == null) {
                    return Boolean.FALSE;
                }
                u.Companion.getClass();
                return !s.h(dVar4, u.G) ? Boolean.FALSE : Boolean.valueOf(dVar.equals(dVar2));
            case 1:
                List offers = (List) obj2;
                Intrinsics.checkNotNullParameter(offers, "offers");
                Iterator it10 = offers.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next4 = it10.next();
                        c1 c1Var = (c1) next4;
                        if (Intrinsics.f(c1Var.f113505b, dVar3.f152287a) && (c1Var.f113506c instanceof h1.a)) {
                            obj4 = next4;
                        }
                    }
                }
                return (c1) obj4;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                n nVar = (n) pair.f186386b;
                Intrinsics.checkNotNullParameter(list, "<this>");
                Iterator it11 = list.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        h hVar = (h) it11.next();
                        aVar = hVar instanceof mha.a ? (mha.a) hVar : null;
                        if (aVar != null) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    return null;
                }
                wi0.a aVar2 = wi0.b.Companion;
                aVar2.getClass();
                wi0.b bVar2 = wi0.b.f297770q3;
                TextLocalisedClause textLocalisedClause4 = w.S(nVar, bVar2) ? new TextLocalisedClause(R$string.dashboard_feature_atm_withdrawals_title, null, null, 14) : dVar3.f152296p ? new TextLocalisedClause(R$string.dashboard_feature_free_atm_title, null, null, 14) : new TextLocalisedClause(R$string.dashboard_feature_fee_free_atm_title, null, null, 14);
                MoneyClause moneyClause = new MoneyClause(aVar.f205435c, new MoneyClause.Format.Defaults(null, null, false, false, 15), false ? 1 : 0, o9.NON_SENSITIVE, 4);
                aVar2.getClass();
                if (w.S(nVar, bVar2)) {
                    textLocalisedClause = new TextLocalisedClause(R$string.dashboard_feature_free_atm_subtitle_us, zhm.u.c(moneyClause), null, 12);
                } else {
                    aVar2.getClass();
                    textLocalisedClause = w.S(nVar, wi0.b.X0) ? new TextLocalisedClause(R$string.dashboard_feature_free_atm_subtitle_jp, zhm.u.c(moneyClause), null, 12) : new TextLocalisedClause(R$string.dashboard_restructured_feature_free_atm_limit_subtitle, zhm.u.c(moneyClause), null, 12);
                }
                TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
                u.Companion.getClass();
                return new PlanFeatureResource(u.e, textLocalisedClause4, textLocalisedClause5, R$drawable.uikit_icn_24_cash, (FeatureTagData) null, 34);
            case 3:
                List cashbackDetails = (List) obj2;
                Intrinsics.checkNotNullParameter(cashbackDetails, "cashbackDetails");
                CashbackDetails.INSTANCE.getClass();
                vei.a aVarA = CashbackDetails.Companion.a(dVar3);
                Iterator it12 = cashbackDetails.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next3 = it12.next();
                        if (((CashbackDetails) next3).f97896a == aVarA) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                CashbackDetails cashbackDetails2 = (CashbackDetails) next3;
                if (cashbackDetails2 == null) {
                    return null;
                }
                u.Companion.getClass();
                return new PlanFeatureResource(u.U, new TextLocalisedClause(R$string.dashboard_feature_stays_instant_cashback_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_stays_instant_cashback_subtitle, zhm.u.c(cashbackDetails2.f97897b), null, 12), R$drawable.uikit_icn_24_resort, (FeatureTagData) null, 34);
            case 4:
                List limits = (List) obj2;
                Intrinsics.checkNotNullParameter(limits, "limits");
                Intrinsics.checkNotNullParameter(limits, "<this>");
                Iterator it13 = limits.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        h hVar2 = (h) it13.next();
                        bVar = hVar2 instanceof mha.b ? (mha.b) hVar2 : null;
                        if (bVar != null) {
                        }
                    } else {
                        bVar = null;
                    }
                }
                if (bVar == null) {
                    return null;
                }
                j jVar = bVar.f205438c;
                double d = jVar.f205454a;
                dj0.d dVar5 = jVar.f205455b;
                double d5 = bVar.d.f205454a;
                if (dVar5 == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "CommoditiesFeaturesProvider", "minFee should not be null", null, h0Var);
                    return null;
                }
                MoneyClause moneyClauseB = dok.b.b(dVar5, null, null, null, 7);
                boolean z3 = d < d5;
                PercentageClause.Format.Long r172 = PercentageClause.Format.Long.f57911a;
                if (z3) {
                    Custom custom = null;
                    int i3 = 4;
                    textLocalisedClause2 = new TextLocalisedClause(R$string.dashboard_feature_commodities_reduced_fees_description, v.k(new PercentageClause(d, r172, custom, i3), new PercentageClause(d5, r172, custom, i3), moneyClauseB), null, 12);
                } else {
                    if (z3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause2 = new TextLocalisedClause(R$string.dashboard_feature_commodities_fees_description, v.k(new PercentageClause(d, r172, (Custom) null, 4), moneyClauseB), null, 12);
                }
                TextLocalisedClause textLocalisedClause6 = textLocalisedClause2;
                TextLocalisedClause textLocalisedClause7 = s.p(dVar3) ? new TextLocalisedClause(R$string.dashboard_feature_commodities_reduced_fees_ultra_title, null, null, 14) : d < d5 ? new TextLocalisedClause(R$string.dashboard_feature_commodities_reduced_fees_title, null, null, 14) : new TextLocalisedClause(R$string.dashboard_feature_commodities_title, null, null, 14);
                u.Companion.getClass();
                return new PlanFeatureResource(u.C, textLocalisedClause7, textLocalisedClause6, R$drawable.uikit_icn_24_commodities, (FeatureTagData) null, 34);
            case 5:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list2 = (List) rVar.f314201a;
                i iVar = (i) rVar.f314202b;
                n nVar2 = (n) rVar.f314203c;
                Intrinsics.checkNotNullParameter(list2, "<this>");
                Iterator it14 = list2.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        h hVar3 = (h) it14.next();
                        cVar = hVar3 instanceof mha.c ? (mha.c) hVar3 : null;
                        if (cVar != null) {
                        }
                    } else {
                        cVar = null;
                    }
                }
                if (cVar == null) {
                    return null;
                }
                j jVar2 = cVar.d;
                dj0.d dVar6 = jVar2.f205455b;
                double d6 = jVar2.f205454a;
                Double dValueOf = Double.valueOf(cVar.e.f205454a);
                TextLocalisedClause textLocalisedClause8 = s.p(dVar3) ? new TextLocalisedClause(R$string.dashboard_feature_crypto_lower_fees_ultra_title, null, null, 14) : d6 < dValueOf.doubleValue() ? new TextLocalisedClause(R$string.dashboard_feature_crypto_lower_fees_title, null, null, 14) : new TextLocalisedClause(R$string.dashboard_feature_crypto_title, null, null, 14);
                dj0.d dVar7 = cVar.f205441c;
                lf5.a aVar3 = (lf5.a) iVar.f224257a;
                wi0.b.Companion.getClass();
                boolean zS = w.S(nVar2, wi0.b.f297770q3);
                PercentageClause.Format.Long r173 = PercentageClause.Format.Long.f57911a;
                if (zS) {
                    if (dVar7 != null) {
                        textLocalisedClause3 = new TextLocalisedClause(dVar3.f152296p ? R$string.dashboard_feature_crypto_subtitle_us : R$string.dashboard_feature_crypto_subtitle_reduced_us, v.k(dok.b.b(dVar7, null, null, null, 7), new PercentageClause(d6, r173, (Custom) null, 4)), null, 12);
                        clause = textLocalisedClause3;
                    }
                    clause = null;
                } else {
                    if (aVar3 != null) {
                        Custom custom2 = null;
                        int i5 = 4;
                        TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.dashboard_feature_crypto_lower_fees_tier_subtitle, v.k(new PercentageClause(aVar3.f194634a, r173, custom2, i5), new PercentageClause(aVar3.f194635b, r173, custom2, i5)), null, 12);
                        if (dVar6 == null || dVar6.k()) {
                            clause = textLocalisedClause9;
                        } else {
                            textLocalisedClause3 = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause9, new TextLocalisedClause(R$string.dashboard_feature_crypto_lower_fees_tier_subtitle_minimum, zhm.u.c(dok.b.b(dVar6, null, null, null, 7)), null, 12)));
                        }
                    } else {
                        if (d6 < dValueOf.doubleValue()) {
                            Custom custom3 = null;
                            int i6 = 4;
                            textLocalisedClause3 = new TextLocalisedClause(R$string.dashboard_feature_crypto_lower_fees_subtitle, v.k(new PercentageClause(d6, r173, custom3, i6), new PercentageClause(dValueOf.doubleValue(), r173, custom3, i6)), null, 12);
                        }
                        clause = null;
                    }
                    clause = textLocalisedClause3;
                }
                if (clause == null) {
                    return null;
                }
                u.Companion.getClass();
                return new PlanFeatureResource(u.f152354m, textLocalisedClause8, clause, R$drawable.uikit_icn_24_bitcoin, (FeatureTagData) null, 34);
            case 6:
                ti7.c limit = (ti7.c) obj2;
                Intrinsics.checkNotNullParameter(limit, "limit");
                dj0.d dVar8 = limit.f271429b;
                u.Companion.getClass();
                return new PlanFeatureResource(u.G, new TextLocalisedClause(R$string.dashboard_feature_global_medical_insurance_title, null, null, 14), new TextLocalisedClause(s.n(dVar3) ? R$string.dashboard_feature_global_medical_insurance_premium_subtitle : R$string.dashboard_feature_global_medical_insurance_subtitle, zhm.u.c(dok.b.b(dVar8, new MoneyClause.Format.Shorts(z, 63), null, null, 6)), null, 12), R$drawable.uikit_icn_24_medical_cross, (FeatureTagData) null, 34);
            case 7:
                RevPointsBenefits benefit = (RevPointsBenefits) obj2;
                Intrinsics.checkNotNullParameter(benefit, "benefit");
                String str = benefit.f;
                if (str == null) {
                    return null;
                }
                BigDecimal bigDecimal = new BigDecimal(str);
                String str2 = benefit.k;
                if (str2 == null) {
                    return null;
                }
                BigDecimal bigDecimal2 = new BigDecimal(str2);
                dj0.d dVar9 = benefit.f83967l;
                if (dVar9 == null) {
                    return null;
                }
                dj0.d dVar10 = benefit.f83968m;
                if (dVar10 != null) {
                    u.Companion.getClass();
                    return new PlanFeatureResource(u.f152357o0, new TextLocalisedClause(R$string.plansDashboard_group_rev_points_reward_title, zhm.u.c(new NumberClause(bigDecimal, null, null, null, 14)), null, 12), new TextLocalisedClause(R$string.dashboard_feature_points_upgrade_bonus_threshold_subtitle, v.k(new NumberClause(bigDecimal2, null, null, null, 14), dok.b.b(dVar9, null, null, null, 7), dok.b.b(dVar10, null, null, null, 7)), null, 12), R$drawable.uikit_icn_24_gifts, (FeatureTagData) null, 34);
                }
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("missing planUpgradeSpendThreshold value for pricing plan ", dVar3.f152287a));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                return null;
            case 8:
                FreelancerCashbackRates rates = (FreelancerCashbackRates) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                boolean zP = s.p(dVar3);
                String str3 = dVar3.f152289c;
                BigDecimal bigDecimal3 = (zP || s.j(dVar3)) ? (BigDecimal) rates.f73279a.get(str3) : null;
                if (bigDecimal3 == null) {
                    return null;
                }
                u.Companion.getClass();
                return new PlanFeatureResource(u.m0, new TextLocalisedClause(R$string.dashboard_feature_revolut_pro_title, null, null, 14), new TextLocalisedClause(R$string.dashboard_feature_revolut_pro_subtitle, zhm.u.c(new PercentageClause(bigDecimal3, (PercentageClause.Format) fVar, (Style) fVar, i2)), null, 12), R$drawable.uikit_icn_24_services, (FeatureTagData) null, 34);
            case 9:
                JuniorPlanConfiguration config = (JuniorPlanConfiguration) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                u.Companion.getClass();
                u uVar = u.z;
                int i21 = R$drawable.uikit_icn_24_backpack;
                int i22 = R$plurals.dashboard_feature_rev_u18_wallets_title;
                int i32 = config.e;
                int i33 = config.d;
                int i43 = config.f76899b;
                return new PlanFeatureResource(uVar, new TextLocalisedQuantityClause(i22, Integer.valueOf(i32), (List) null, (Style) null, 28), dVar3.f152296p ? new TextLocalisedQuantityClause(R$plurals.dashboard_feature_rev_u18_wallets_limited_access_subtitle, Integer.valueOf(i32), v.k(Integer.valueOf(i32), Integer.valueOf(i43), Integer.valueOf(i33 - 1)), (Style) null, 24) : new TextLocalisedQuantityClause(R$plurals.dashboard_feature_rev_u18_wallets_full_access_subtitle, Integer.valueOf(i32), v.k(Integer.valueOf(i32), Integer.valueOf(i43), Integer.valueOf(i33 - 1)), (Style) null, 24), i21, (FeatureTagData) null, 34);
            case 10:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List list3 = (List) data.getContent();
                if (list3 != null) {
                    List list4 = list3;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        z = false;
                        boolValueOf = Boolean.valueOf(z);
                    } else {
                        Iterator it15 = list4.iterator();
                        while (it15.hasNext()) {
                            if (Intrinsics.f(((JuniorPlanConfiguration) it15.next()).f76898a, dVar3.f152287a)) {
                                z = true;
                                boolValueOf = Boolean.valueOf(z);
                            }
                        }
                        z = false;
                        boolValueOf = Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(pd.b.j(boolValueOf) || !data.getLoading());
            case 11:
                List productsData = (List) obj2;
                Intrinsics.checkNotNullParameter(productsData, "productsData");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : productsData) {
                    if (Intrinsics.f(((SavingsProductData) obj5).f86683a.i, dVar3.f152287a)) {
                        arrayList.add(obj5);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException(j6.a.q("Product per plan has not found for pricing plan: ", dVar3.f152287a));
                }
                return arrayList;
            case 12:
                d plan = (d) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                return Boolean.valueOf(Intrinsics.f(plan.f152287a, dVar3.f152287a));
            case 13:
                d plan2 = (d) obj2;
                Intrinsics.checkNotNullParameter(plan2, "plan");
                return Boolean.valueOf(plan2.f152294m < dVar3.f152294m);
            case 14:
                d plan3 = (d) obj2;
                Intrinsics.checkNotNullParameter(plan3, "plan");
                return Boolean.valueOf(plan3.f152294m > dVar3.f152294m);
            case 15:
                Intrinsics.h(dVar3);
                Clause planName = dok.g.d(dVar3, null);
                List ineligibilityReasons = ((glk.g) obj2).f144718a;
                Intrinsics.checkNotNullParameter(ineligibilityReasons, "ineligibilityReasons");
                Intrinsics.checkNotNullParameter(planName, "planName");
                return new glk.g(planName, ineligibilityReasons);
            case 16:
                List cashbackDetails3 = (List) obj2;
                Intrinsics.checkNotNullParameter(cashbackDetails3, "cashbackDetails");
                CashbackDetails.INSTANCE.getClass();
                vei.a aVarA2 = CashbackDetails.Companion.a(dVar3);
                CashbackDetails cashbackDetailsK = aVarA2 != null ? ta6.a.k(cashbackDetails3, aVarA2) : null;
                i.Companion.getClass();
                return od0.h.a(cashbackDetailsK);
            case 17:
                List benefits = (List) obj2;
                Intrinsics.checkNotNullParameter(benefits, "benefits");
                Iterator it16 = benefits.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        Object next5 = it16.next();
                        if (a0.z(dVar3.f152289c, ((RevPointsBenefits) next5).f83965h, true)) {
                            obj3 = next5;
                        }
                    }
                }
                return (RevPointsBenefits) obj3;
            case 18:
                RevPointsBenefits revPointsBenefits = (RevPointsBenefits) obj2;
                Intrinsics.checkNotNullParameter(revPointsBenefits, "revPointsBenefits");
                return new eub.g(revPointsBenefits, dVar3);
            default:
                return zf5.g.a((zf5.g) obj2, null, null, null, null, dVar3.f152287a, null, 95);
        }
    }

    public /* synthetic */ a(d dVar, f fVar) {
        this.f25042a = 3;
        this.f25043b = dVar;
    }

    public /* synthetic */ a(Object obj2, d dVar, int i) {
        this.f25042a = i;
        this.f25043b = dVar;
    }
}
