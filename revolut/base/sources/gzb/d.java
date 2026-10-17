package gzb;

import aw0.c7;
import aw0.k7;
import aw0.n6;
import aw0.o9;
import aw0.r2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.c3;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.insurance_car.impl.data.model.BenefitCategory;
import com.revolut.feature.insurance_car.impl.data.model.PaymentAmount;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.travel.experiences.api.R$plurals;
import hkb.g;
import hq7.m;
import i6f.x;
import i6f.y;
import ip0.t9;
import ip0.xk;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kl7.h1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import qib.f;
import qib.h;
import qib.i;
import qib.j;
import xl7.p;
import yhm.r;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147984a;

    public /* synthetic */ d(int i) {
        this.f147984a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        float f;
        ChallengeMediumDelegate.c c3Var;
        ChallengeMediumDelegate.Model model;
        i account = (i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(account, "account");
        int i = 14;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.savings_challenge_tracker_title, null, null, 14), new HtmlClause(0, 30, (Integer) null, (Object) null, account.f246693c.f246686b), null, null, false, 28);
        ArrayList arrayList = account.f246693c.e;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj5 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            h hVar = (h) obj5;
            j jVar = hVar.f246688a;
            int[] iArr = g.f152917a;
            int i5 = iArr[jVar.ordinal()];
            if (i5 == 1 || i5 == 2) {
                String strN = a0.d.n("savings_challenge_tracker_reward_", i2);
                f fVar = hVar.e;
                qib.e eVar = fVar.f246682a;
                int i6 = fVar.f246683b;
                int i21 = g.f152918b[eVar.ordinal()];
                if (i21 == 1) {
                    f = BitmapDescriptorFactory.HUE_RED;
                    c3Var = ChallengeMediumDelegate.c.f.f52012a;
                } else if (i21 == 2) {
                    f = BitmapDescriptorFactory.HUE_RED;
                    c3Var = new c3(new TagViewData(null, new TextLocalisedClause(R$string.savings_challenge_tracker_status_eligible, null, null, i), new Color.Solid(R$attr.uikit_colorStatusSuccess), R$attr.uikit_colorTransparent, null, 1000));
                } else {
                    if (i21 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.savings_challenge_tracker_status_ineligible, null, null, i);
                    f = BitmapDescriptorFactory.HUE_RED;
                    c3Var = new c3(new TagViewData(null, textLocalisedClause, new Color.Solid(R$attr.uikit_colorStatusDanger), R$attr.uikit_colorTransparent, null, 1000));
                }
                ChallengeMediumDelegate.c cVar = c3Var;
                float f4 = (i6 / fVar.f246684c) * 100.0f;
                if (f4 < f) {
                    f4 = f;
                }
                t9 t9Var = new t9(LayeredImage.INSTANCE.i(iArr[hVar.f246688a.ordinal()] == 1 ? R$drawable.uikit_icn_24_present : R$drawable.uikit_icn_24_gifts, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), kotlin.ranges.f.f(f4, f, 100.0f));
                TextClause textClause = new TextClause(hVar.f246689b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i22 = R$string.savings_challenge_tracker_subtitle;
                com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                LocalDate localDate = hVar.d.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                LocalDateClause$DateFormat.INSTANCE.getClass();
                model = new ChallengeMediumDelegate.Model(strN, t9Var, textClause, cVar, new TextLocalisedClause(i22, v.k(com.revolut.core.ui_kit.models.j.b(jVar2, localDate, LocalDateClause$DateFormat.Companion.f57815b), Integer.valueOf(i6), Integer.valueOf(fVar.d)), null, 12), 968);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                model = null;
            }
            if (model != null) {
                arrayList2.add(model);
            }
            i2 = i3;
            i = 14;
        }
        return new cii.b(null, u.c(new xk("savings_challenge_tracker_rewards_grid", arrayList2, Integer.valueOf(kotlin.ranges.f.g(arrayList2.size(), 1, 2)), Float.valueOf(12.0f), Float.valueOf(BitmapDescriptorFactory.HUE_RED), 32)), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gzb.d.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        Policy policy = (Policy) rVar.f314201a;
        h1 h1Var = (h1) rVar.f314202b;
        String str = (String) rVar.f314203c;
        aim.e eVarB = u.b();
        String str2 = policy.e;
        PaymentAmount paymentAmount = policy.f75293m;
        CellDetailsActionDelegate.Model modelD = p.d(str2);
        CellDetailsDelegate.Model model = !d0.W(str) ? new CellDetailsDelegate.Model("POLICY_REGION", new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_plan_detail_sections_policy_region, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
        CellDetailsActionDelegate.Model modelE = p.e(policy.f);
        LocalDate localDate = policy.f75290h;
        CellDetailsDelegate.Model modelC = localDate != null ? p.c(localDate) : null;
        qv0.i iVarB = p.b(policy.f75289g, policy.f75291j);
        int i = m.f154624a[paymentAmount.f75275a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_plan_detail_sections_policy_monthly_cost, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_plan_detail_sections_policy_yearly_cost, null, null, 14);
        }
        qv0.i[] elements = {modelD, model, modelE, modelC, iVarB, new CellDetailsDelegate.Model("POLICY_COST", textLocalisedClause, new MoneyClause(paymentAmount.f75276b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        a0.x(listL, eVarB);
        aim.e eVarA = u.a(eVarB);
        ArrayList<BenefitCategory> arrayList = h1Var.f185332a;
        ArrayList arrayList2 = new ArrayList();
        for (BenefitCategory benefitCategory : arrayList) {
            ArrayList arrayList3 = benefitCategory.f75182a;
            String str3 = benefitCategory.f75183b;
            a0.x(xl7.e.b(arrayList3, str3, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), arrayList2);
        }
        return zhm.d0.E0(arrayList2, eVarA);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        boolean z;
        b02.e content = (b02.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        b02.h hVar = content.f11545a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.bizum.api.R$string.bizum_settings_online_transactions_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.bizum.api.R$string.bizum_settings_online_transactions_description, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(h5k.a.b(R$drawable.uikit_icn_24_globe), null, null, false, null, false, 60);
        xi0.b bVar = gs1.b.f146272a;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i = gs1.a.f146271a[hVar.ordinal()];
        if (i == 1) {
            z = true;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        RowDelegate.Model model = new RowDelegate.Model("ID_ITEM_ONLINE_TRANSACTIONS", image40, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("ID_ITEM_DEREGISTER", new TextLocalisedClause(com.revolut.feature.apm.bizum.api.R$string.bizum_settings_deregister_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), 0, false, null, null, null, 2036);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return v.k(model, model2);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return Boolean.valueOf(content.size() > 3);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        io3.d pocket = (io3.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        aim.e eVarB = u.b();
        List listK = v.k(new CellDetailsDelegate.Model("POCKET_TYPE", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_collateral_account_pocket_type_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_collateral_account_pocket_type_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("CURRENCY", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_collateral_account_currency_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), new TextClause(z92.f.j(pocket).f115083b.f306286a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), 0, null, null, null, null, null, false, 0, 0, 32752));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("report_bug_id", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_report_an_issue, null, null, 14), 0, true, null, null, null, 2036);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("faq_id", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_collateral_account_faq, null, null, 14), 0, true, null, null, null, 2036);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        CellDetailsChevronDelegate.Model model3 = new CellDetailsChevronDelegate.Model("close_id", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_collateral_account_close, null, null, 14), R$attr.uikit_colorRed, false, null, null, null, 2032);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model3);
        return new i35.e(new MoneyClause(z92.f.j(pocket), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_collateral_account_title, null, null, 14), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorIndigo), u.a(eVarB));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        x3g.h ratings = (x3g.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        r2 r2Var = new r2(w3g.f.a(ratings.f302750c), null);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_reviews_title, null, null, 14);
        TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause("(", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$plurals.experiences_common_reviews;
        int i2 = ratings.f302749b;
        Object[] elements = {textLocalisedClause, textClause, textClause2, new TextLocalisedQuantityClause(i, Integer.valueOf(i2), u.c(new NumberClause(i2, (NumberClause.Format.Compact) null, (Custom) null, 6)), (Style) null, 24), new TextClause(")", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        HeaderDelegate.Model model = new HeaderDelegate.Model("OVERALL_RATING_ITEM_ID", null, r2Var, null, null, new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), null, HeaderDelegate.a.c.f52422a, null, null, null, 127736);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        model.f52412x = R$attr.uikit_dp16;
        return u.c(model);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        i4b.m orderData = (i4b.m) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(orderData, "orderData");
        return l4i.a.b(orderData.a().f82110a);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        List actions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(actions, "actions");
        if (actions.isEmpty()) {
            return null;
        }
        alc.d dVar = (alc.d) zhm.d0.b0(actions);
        List listV = zhm.d0.V(actions, 1);
        n6 n6Var = new n6(new TextLocalisedClause(boc.b.a(dVar).f127286b, null, null, 10), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, new x(dVar), 508);
        if (listV.isEmpty()) {
            return new aw0.e(false, null, null, n6Var, null, null, 55);
        }
        return new aw0.g(n6Var, new n6(null, LargeActionButton.ButtonStyle.f, new ResourceImage(R$drawable.uikit_icn_24_more, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, new y(listV), 504), (Clause) null, aw0.f.SMALL_SECONDARY_BUTTON, 9);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        CryptoCommodityPosition commodityPosition = (CryptoCommodityPosition) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(commodityPosition, "commodityPosition");
        return new CellDetailsDelegate.Model("AVERAGE_PRICE_LIST_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_details_stocks_avg_price, null, null, 14), new MoneyClause(mif.a.Q(commodityPosition.d), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, i6j.g.f159021a, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        jt5.b balance = (jt5.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(balance, "balance");
        dj0.d dVar = balance.f178356c;
        MoneyClause moneyClause = dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 6), null, null, 12) : null;
        BigDecimal bigDecimal = balance.d;
        Object[] elements = {moneyClause, bigDecimal != null ? xqi.a.b(bigDecimal, true, 6) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL);
        if (compositeClauseM.f57747a.isEmpty()) {
            return null;
        }
        return new CellDetailsDelegate.Model("UNREALISED_RETURN_LIST_ID", new TextLocalisedClause(com.revolut.retail.feature.commodity.asset_details.impl.R$string.asset_details_investment_unrealised_return_title, null, null, 14), compositeClauseM, null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, i6j.h.f159022a, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x060a  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r70, java.lang.Object r71, java.lang.Object r72) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gzb.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f147984a = i;
    }
}
