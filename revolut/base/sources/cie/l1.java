package cie;

import android.os.Parcelable;
import aw0.c7;
import aw0.n6;
import aw0.o9;
import aw0.s8;
import aw0.v1;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.licenses.impl.ui.licenses.model.LibraryItem;
import com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem;
import com.revolut.feature.selfserve.sow.impl.ui.stories.SowRemoteStoriesKey;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionsFee;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionsLimits;
import com.revolut.retail.feature.esim.api.model.EsimRandomPhoneNumberOption;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import ip0.yt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.z;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24500a;

    public /* synthetic */ l1(int i) {
        this.f24500a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        Map contentMap = (Map) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(contentMap, "contentMap");
        List<Pair> listP0 = zhm.d0.P0(zhm.t0.C(contentMap), new dnc.w());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        for (Pair pair : listP0) {
            AssetSubclassAllocation assetSubclassAllocation = (AssetSubclassAllocation) pair.f186385a;
            nel.n nVar = (nel.n) pair.f186386b;
            arrayList.add(new RowDelegate.Model(j6.a.q("row.", nVar.e), new RowDelegate.Model.MainImage.Image40(new InstrumentImage(nVar.f214596b, 30, null, null), null, null, false, null, false, 62), new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(nVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.b(new PercentageClause(d9.e1.Z(assetSubclassAllocation.getF95688a()), (PercentageClause.Format) null, (Style) null, 6), null, null, false, 126), false, null, false, null, null, null, null, null, null, nVar, null, 0, 0, 0, 0, 532675544));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        char c2;
        List listE0;
        char c3;
        List list;
        ?? r122;
        List listD;
        TextLocalisedClause textLocalisedClause;
        dj0.d dVar;
        EsimMobilePlanPointsOption esimMobilePlanPointsOption;
        BigDecimal bigDecimal;
        boolean z;
        CellDetailsDelegate.Model modelA;
        dj0.d dVar2;
        TextLocalisedClause textLocalisedClause2;
        int i;
        int i2;
        TextLocalisedClause textLocalisedClause3;
        int i3 = 6;
        CellDetailsDelegate.Model model = null;
        UserAvatarImage userAvatarImage = null;
        switch (this.f24500a) {
            case 0:
                List content = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content, "content");
                return content;
            case 1:
                EsimPhoneNumberSelections phoneNumberSelections = (EsimPhoneNumberSelections) obj2;
                ((Boolean) obj3).getClass();
                if (phoneNumberSelections != null) {
                    EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions = phoneNumberSelections.f100408b;
                    Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
                    EsimRandomPhoneNumberOption esimRandomPhoneNumberOption = esimPhoneNumberSelectionOptions.f100405b;
                    EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee = esimPhoneNumberSelectionOptions.d;
                    if (esimRandomPhoneNumberOption != null) {
                        c3 = 1;
                        List listC = zhm.u.c(new RowDelegate.Model("ID_PHONE_NUMBER_SELECTION_OPTION_RANDOM", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_arrow_shuffle, R$attr.uikit_colorForeground, R$attr.uikit_colorActionBackgroundNeutral), null, null, false, null, false, 62), new TextLocalisedClause(R$string.esim_mobile_plans_add_number_random_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plans_add_number_random_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                        yp0.b.k(listC, 0, 0, 0, 0, 31);
                        list = listC;
                    } else {
                        c3 = 1;
                        list = zhm.f0.f322471a;
                    }
                    List list2 = list;
                    Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
                    EsimPhoneNumberSelectionsLimits esimPhoneNumberSelectionsLimits = esimPhoneNumberSelectionOptions.e;
                    if (esimPhoneNumberSelectionsLimits != null) {
                        Long l2 = esimPhoneNumberSelectionsLimits.f100412a;
                        if (l2 != null) {
                            z = false;
                            modelA = new CellDetailsDelegate.Model("ID_PLAN_FEATURE_INCOMING_CALLS", new aw0.t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_add_number_incoming_calls_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.esim_common_template_mins, zhm.u.c(String.valueOf(l2.longValue() / ((long) 60))), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                        } else {
                            z = false;
                            modelA = ejj.b.a();
                        }
                        Long l3 = esimPhoneNumberSelectionsLimits.f100413b;
                        CellDetailsDelegate.Model model2 = l3 != null ? new CellDetailsDelegate.Model("ID_PLAN_FEATURE_INCOMING_TEXTS", new aw0.t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_add_number_incoming_texts_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.esim_common_template_texts, zhm.u.c(String.valueOf(l3.longValue())), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : ejj.b.b();
                        qv0.i[] iVarArr = new qv0.i[2];
                        iVarArr[z ? 1 : 0] = modelA;
                        iVarArr[c3 == true ? 1 : 0] = model2;
                        List listK = zhm.v.k(iVarArr);
                        yp0.b.k(listK, 0, 0, 0, 0, 31);
                        listD = listK;
                        r122 = z;
                    } else {
                        r122 = 0;
                        CellDetailsDelegate.Model modelA2 = ejj.b.a();
                        CellDetailsDelegate.Model modelB = ejj.b.b();
                        qv0.i[] iVarArr2 = new qv0.i[2];
                        iVarArr2[0] = modelA2;
                        iVarArr2[c3 == true ? 1 : 0] = modelB;
                        List listK2 = zhm.v.k(iVarArr2);
                        yp0.b.k(listK2, 0, 0, 0, 0, 31);
                        listD = listK2;
                    }
                    yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
                    int i5 = R$attr.uikit_dp8;
                    int i6 = R$attr.uikit_dp16;
                    if (!listD.isEmpty()) {
                        listD = yp0.b.d(listD, new ListSubheaderDelegate.Model("ID_PLAN_FEATURES", (Image) null, (Clause) new TextLocalisedClause(R$string.esim_mobile_plans_add_number_plan_features_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i5, i5, i6, i6);
                    }
                    ArrayList arrayListE0 = zhm.d0.E0(listD, list2);
                    Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
                    if (esimPhoneNumberSelectionsFee == null || (esimMobilePlanPointsOption = esimPhoneNumberSelectionsFee.f100411c) == null || (bigDecimal = esimMobilePlanPointsOption.f100304a) == null) {
                        textLocalisedClause = null;
                    } else {
                        int i21 = R$string.esim_common_word_or;
                        int i22 = R$drawable.uikit_icn_24_rev_points;
                        Float fValueOf = Float.valueOf(14.0f);
                        ImageClause imageClause = new ImageClause(i22, (Integer) null, fValueOf, fValueOf, 18);
                        NumberClause numberClause = new NumberClause(bigDecimal, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), r122, r122, 254), null, 10);
                        Clause[] clauseArr = new Clause[2];
                        clauseArr[r122] = imageClause;
                        clauseArr[c3 == true ? 1 : 0] = numberClause;
                        textLocalisedClause = new TextLocalisedClause(i21, zhm.u.c(new CompositeClause(zhm.v.k(clauseArr), null, null, null, 14)), null, 12);
                    }
                    TextLocalisedClause textLocalisedClause4 = (esimPhoneNumberSelectionsFee == null || (dVar = esimPhoneNumberSelectionsFee.f100409a) == null) ? null : new TextLocalisedClause(R$string.esim_mobile_plans_checkout_plan_summary_monthly, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
                    Clause compositeClause = (textLocalisedClause == null || textLocalisedClause4 == null) ? textLocalisedClause4 : new CompositeClause(zhm.v.k(textLocalisedClause4, new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause), null, null, null, 14);
                    if (compositeClause != null) {
                        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ID_PHONE_NUMBER_ADDITIONAL_PRICE", new aw0.t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_add_number_addon_price_title, null, null, 14), (Image) null, 0, false, 30), compositeClause, null, phoneNumberSelections, null, null, 0, null, false, false, null, null, 28600);
                        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                        model = model3;
                    }
                    listE0 = zhm.d0.E0(zhm.v.l(model), arrayListE0);
                    c2 = c3;
                } else {
                    c2 = 1;
                    listE0 = zhm.f0.f322471a;
                }
                return new cjj.h(listE0, c2);
            case 2:
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                return new lw0.a(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_weekend_markups_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_weekend_markups_subtitle, null, null, 14), null, null, false, 28);
            case 3:
                yhm.r rVar = (yhm.r) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                if (((List) rVar.f314202b).isEmpty()) {
                    return null;
                }
                return new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_weekend_markups_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "MARKUP_UPGRADE_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55);
            case 4:
                od0.i optionalSettings = (od0.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(optionalSettings, "optionalSettings");
                nl9.g gVar = (nl9.g) optionalSettings.g();
                if (gVar == null || gVar.f217102a) {
                    return null;
                }
                HeroBannerDelegate.Model model4 = new HeroBannerDelegate.Model("ID_PAY_WITH_SMILE_BANNER", new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_management_home_pay_with_smile_banner_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_management_home_pay_with_smile_banner_description, null, null, 14), new CdnImage("biometric_banner", "mobile/revolut_pay/biometric_payments", null, null, null, null, Constants.TAG_FC_SPEED_MODE), v1.DARK);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                return model4;
            case 5:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                dj0.d dVar3 = (dj0.d) pair.f186385a;
                dj0.d dVar4 = (dj0.d) pair.f186386b;
                boolean z3 = dVar3.compareTo(dVar4) < 0;
                dj0.d dVar5 = z3 ? dVar4 : dVar3;
                return zhm.u.c(new ProductSelectionDelegate.Model("add-money", new dc(new GlyphImage(R$drawable.uikit_icn_24_cash_income, null, null, 6)), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_add_money_title, null, null, 14), new TextLocalisedClause(z3 ? com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_add_money_subtitle_minimal : com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_add_money_subtitle, zhm.u.c(new MoneyClause(dVar5, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, new cnc.g(dVar5), null, false, false, false, 976));
            case 6:
                vf0.h hVar = (vf0.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                od0.i iVar = (od0.i) hVar.f288433a;
                k4l.c0 period = (k4l.c0) hVar.f288434b;
                dj0.d dVar6 = (dj0.d) hVar.f288435c;
                dj0.d dVar7 = (dj0.d) hVar.d;
                if (iVar.d()) {
                    i = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_update_recurring_transfer_title;
                    Intrinsics.checkNotNullParameter(period, "period");
                    int i32 = cnc.m.f25398a[period.ordinal()];
                    if (i32 == 1) {
                        i2 = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_update_recurring_transfer_subtitle_daily;
                    } else if (i32 == 2) {
                        i2 = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_update_recurring_transfer_subtitle_weekly;
                    } else {
                        if (i32 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_update_recurring_transfer_subtitle_monthly;
                    }
                    dVar2 = dVar6;
                    textLocalisedClause2 = new TextLocalisedClause(i2, zhm.u.c(new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                } else {
                    int i33 = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_setup_recurring_transfer_title;
                    if (dVar6.compareTo(dVar7) < 0) {
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_setup_recurring_transfer_subtitle_minimal, zhm.u.c(new MoneyClause(dVar7, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                        i = i33;
                        textLocalisedClause2 = textLocalisedClause5;
                        dVar2 = dVar7;
                    } else {
                        dVar2 = dVar6;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_setup_recurring_transfer_subtitle, zhm.u.c(new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                        i = i33;
                    }
                }
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i, null, null, 14);
                dc dcVar = new dc(new GlyphImage(R$drawable.uikit_icn_24_recurring_payment, null, null, 6));
                PortfolioRecurringOrder portfolioRecurringOrder = (PortfolioRecurringOrder) iVar.f224257a;
                return zhm.u.c(new ProductSelectionDelegate.Model("adjust-recurring-deposit", dcVar, textLocalisedClause6, textLocalisedClause2, null, new cnc.h(period, dVar2, portfolioRecurringOrder != null ? portfolioRecurringOrder.f104649a : null), null, false, false, false, 976));
            case 7:
                PortfolioGoal goal = (PortfolioGoal) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(goal, "goal");
                return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_trophy, new ImageClauseTint.Color(R$attr.uikit_colorForeground), (Float) null, (Float) null, 28), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_manage_goal_description, zhm.v.k(new MoneyClause(goal.f95699a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), com.revolut.core.ui_kit.models.j.b(c7.Companion, goal.a(), new LocalDateClause$DateFormat.MonthAndYear(0))), null, 12)));
            case 8:
                dp8.b task = (dp8.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(task, "task");
                n6 n6Var = new n6(new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_details_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, task, 508);
                int i43 = cq8.o.f108040a[task.e.ordinal()];
                if (i43 == 1) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_details_action_edit, null, null, 14);
                } else {
                    if (i43 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_details_action_pay, zhm.u.c(new MoneyClause(task.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                }
                return new aw0.g(n6Var, new n6(textLocalisedClause3, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, task, 508), (Clause) null, (aw0.f) null, 25);
            case 9:
                my8.o kycDocs = (my8.o) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
                return Boolean.valueOf(!kycDocs.f210393b.f210404a.isEmpty());
            case 10:
                my8.o kycDocs2 = (my8.o) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(kycDocs2, "kycDocs");
                my8.y yVar = (my8.y) zhm.d0.d0(kycDocs2.f210393b.f210404a);
                if (yVar != null) {
                    return yVar.f210402a;
                }
                return null;
            case 11:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return Boolean.valueOf(((List) pair2.f186386b).size() + ((List) pair2.f186385a).size() == 1);
            case 12:
                d0j.r content2 = (d0j.r) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                TextClause textClause = new TextClause(content2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                au0.z0 z0Var = new au0.z0(textClause, false);
                return new cuj.j(z0Var, textClause, zhm.u.c(new au0.u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage(content2.f.f110435b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), z0Var, null, new au0.w0(new TextClause(content2.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)))));
            case 13:
                InstrumentTicker instrumentTicker = (InstrumentTicker) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
                return Boolean.valueOf(nel.x.a(instrumentTicker));
            case 14:
                Pair pair3 = (Pair) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Set set = (Set) pair3.f186385a;
                return new Pair(Boolean.valueOf(set.size() > 1), Boolean.valueOf((set.size() > 3) || (set.size() > ((Set) pair3.f186386b).size())));
            case 15:
                fr2.c content3 = (fr2.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                if (!(content3 instanceof fr2.b)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                List list3 = ((fr2.b) content3).f137377c;
                if (list3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List<fr2.f> list4 = list3;
                ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
                for (fr2.f fVar : list4) {
                    arrayList.add(new ListCellDelegate.Model(j6.a.q("MORE_INFO_ITEM_ID", fVar.f137381a), new j8(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextClause(fVar.f137381a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(fVar.f137382b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, 0, 0, 0, 0, 4064));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new cyc.f(arrayList);
            case 16:
                g0d.a accountStatus = (g0d.a) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(accountStatus, "accountStatus");
                int i59 = d0d.h.f110346a[accountStatus.ordinal()];
                if (i59 == 1) {
                    return SowRemoteStoriesKey.SOW_NON_LOCK;
                }
                if (i59 == 2) {
                    return SowRemoteStoriesKey.SOW_SOFT_LOCK;
                }
                if (i59 == 3) {
                    return SowRemoteStoriesKey.SOW_HARD_LOCK;
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                List libraryItems = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(libraryItems, "libraryItems");
                List<LibraryItem> listP0 = zhm.d0.P0(libraryItems, new d19.h());
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listP0, 10));
                for (LibraryItem libraryItem : listP0) {
                    String str = libraryItem.f78040a;
                    TextClause textClause2 = new TextClause(libraryItem.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    CompositeClause compositeClause2 = new CompositeClause(zhm.v.k(new TextClause(libraryItem.f78041b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(libraryItem.f78042c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(j6.a.q("v", libraryItem.d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(libraryItem.f.f78044b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    LicenseItem licenseItem = libraryItem.f;
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, Float.valueOf(40.0f), null, 32), null, null, false, null, false, 60);
                    yy0.i iVar2 = yy0.l.Companion;
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    iVar2.getClass();
                    arrayList2.add(new RowDelegate.Model(str, image40, textClause2, null, 0, compositeClause2, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, licenseItem, null, 0, 0, 0, 0, 532675544));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 18:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(null, "content");
                throw null;
            case 19:
                Optional content4 = (Optional) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                Optional map = content4.map(new bpd.a(new d27.d0(15), i3));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return (List) gj7.b.l(map, zhm.f0.f322471a);
            case 20:
                od0.i activeJointAccountIdOptional = (od0.i) obj2;
                List juniorAccountWalletIds = (List) obj3;
                List familyCreditCardWalletIds = (List) obj4;
                Intrinsics.checkNotNullParameter(activeJointAccountIdOptional, "activeJointAccountIdOptional");
                Intrinsics.checkNotNullParameter(juniorAccountWalletIds, "juniorAccountWalletIds");
                Intrinsics.checkNotNullParameter(familyCreditCardWalletIds, "familyCreditCardWalletIds");
                List list5 = juniorAccountWalletIds;
                AccountId.Joint joint = (AccountId.Joint) activeJointAccountIdOptional.f224257a;
                return zhm.d0.Z(zhm.d0.E0(familyCreditCardWalletIds, zhm.d0.F0(joint != null ? joint.f51413b : null, list5)));
            case 21:
                Pair pair4 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                ArrayList arrayListE02 = zhm.d0.E0((List) pair4.f186386b, (List) pair4.f186385a);
                int iB = zhm.q0.b(zhm.w.t(arrayListE02, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj5 : arrayListE02) {
                    linkedHashMap.put(((ExchangePocket) obj5).f99900a, obj5);
                }
                return linkedHashMap;
            case 22:
                Pair pair5 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                ta.j jVar = (ta.j) pair5.f186385a;
                do3.n nVar = (do3.n) pair5.f186386b;
                boolean z4 = jVar.f269077c;
                TextClause textClause3 = new TextClause(jVar.f269075a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = jVar.f269076b;
                TextClause textClause4 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                AccentCircleBadge accentCircleBadge = (z4 && Intrinsics.f(nVar.f116421t, Boolean.TRUE)) ? new AccentCircleBadge(dw0.a.Camera) : null;
                if (z4) {
                    String strI = te0.w.I(nVar);
                    if (strI == null) {
                        strI = "";
                    }
                    userAvatarImage = new UserAvatarImage(new UserNamePlaceholder.Animated(strI), null, null, 6);
                }
                return new db.q(textClause3, textClause4, accentCircleBadge, userAvatarImage);
            case 23:
                List items = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(items, "items");
                return items;
            case 24:
                wbf.d portfolioStatus = (wbf.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(portfolioStatus, "portfolioStatus");
                if (portfolioStatus == wbf.d.NONE) {
                    return new rp0.y(zhm.v.k(new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(com.revolut.feature.trading_add_ons.impl.R$string.price_plan_add_ons_activate_application_banner_description, null, null, 14), "ADD_ONS_ACTIVATE_DIALOG_TEXT_ID"), new LargeActionButtonDelegate.Model("ADD_ON_ACTIVATE_DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.trading_add_ons.impl.R$string.price_plan_add_ons_activate_application_banner_button, null, null, 14), false, null, null, null, null, 1000)), new rp0.t(new TextLocalisedClause(com.revolut.feature.trading_add_ons.impl.R$string.price_plan_add_ons_activate_application_banner_title, null, null, 14), null, null, 30), null, null, null, null, 1020);
                }
                return null;
            case 25:
                wbf.d portfolioStatus2 = (wbf.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(portfolioStatus2, "portfolioStatus");
                if (portfolioStatus2 != wbf.d.PENDING) {
                    return null;
                }
                rp0.t tVar = new rp0.t(new TextLocalisedClause(com.revolut.feature.trading_add_ons.impl.R$string.price_plan_add_ons_pending_application_banner_title, null, null, 14), null, null, 30);
                TextDelegate.Model model5 = new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(com.revolut.feature.trading_add_ons.impl.R$string.price_plan_add_ons_pending_application_banner_description, null, null, 14), "ADD_ONS_PENDING_DIALOG_TEXT_ID");
                LargeActionButtonDelegate.Model model6 = new LargeActionButtonDelegate.Model("ADD_ON_PENDING_DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.trading_add_ons.impl.R$string.price_plan_add_ons_add_on_got_it, null, null, 14), false, null, null, null, null, 1000);
                yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                return new rp0.y(zhm.v.k(model5, model6), tVar, null, null, null, null, 1020);
            case 26:
                m1c.z accountStatus2 = (m1c.z) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(accountStatus2, "accountStatus");
                if (accountStatus2 instanceof m1c.y) {
                    return new LabelNavBarMenuItem("ID_REV_POINTS_NAV_BAR_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), v1.c.g(0, ((m1c.y) accountStatus2).f201475a.f201472c, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4), null, null, 504);
                }
                if (accountStatus2 instanceof z.a) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                return a(obj2, obj3, obj4);
            case 28:
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((RemoteLoginInvitation) obj2, "<unused var>");
                return new n6(new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_login_details_action_qr_code_login, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020);
            default:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(profile, "profile");
                return new do8.j(new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_login_details_header_title_manage_access, zhm.u.c(profile.f77099b), null, 12), do8.v.a());
        }
    }

    public /* synthetic */ l1(Object obj2, int i) {
        this.f24500a = i;
    }
}
