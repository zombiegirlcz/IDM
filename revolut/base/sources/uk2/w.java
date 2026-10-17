package uk2;

import android.os.Parcelable;
import aw0.c7;
import aw0.e1;
import aw0.h1;
import aw0.j1;
import aw0.ka;
import aw0.n6;
import aw0.o9;
import aw0.s6;
import aw0.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WallpaperPreviewDelegate;
import com.revolut.core.ui_kit.delegates.h2;
import com.revolut.core.ui_kit.delegates.i2;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.CustomContentDescriptionClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.api.model.AtmFees;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ThemeInfo;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuotes;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategory;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPromptErrorModel;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.youTransactor.uCube.rpc.Constants;
import ggc.g0;
import ip0.ak0;
import ip0.b9;
import ip0.dt;
import ip0.iq;
import ip0.qd0;
import ip0.xh0;
import ip0.xn;
import ip0.y10;
import ip0.zj;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.a2;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import mx0.pc;
import org.joda.time.Interval;
import tof.a3;
import tof.i3;
import vch.x0;
import yp0.e0;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class w implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f280671b;

    public /* synthetic */ w(Integer num, unc.t tVar) {
        this.f280670a = 10;
        this.f280671b = num;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        xi0.b bVar;
        Clause compositeClause;
        umd.q qVar;
        int i;
        List listG;
        int i2;
        dj0.d dVar;
        int iG;
        umd.q qVar2 = (umd.q) this.f280671b;
        umd.a content = (umd.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        dj0.d dVar2 = content.f281279a;
        dj0.d dVar3 = content.f281280b;
        dj0.d dVarH = pyd.c.H(dVar2, dVar3);
        wmd.i iVar = content.f281281c;
        dj0.d dVar4 = iVar.f298651a;
        dj0.d dVarH2 = pyd.c.H(dVarH, dVar4);
        long j2 = dVarH2.f115082a;
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        boolean z = i3 < 0;
        long jBetween = ChronoUnit.DAYS.between(((l80.f) qVar2.f281305b).e(), content.d.f99211b) + 1;
        if (jBetween < 1) {
            jBetween = 1;
        }
        if (z) {
            j2 = -j2;
        }
        xi0.b bVar2 = dVarH2.f115083b;
        dj0.d dVar5 = new dj0.d(j2, bVar2);
        aim.e eVarB = zhm.u.b();
        dj0.d dVarA = otd.f.a(dVar5);
        if (z) {
            bVar = bVar2;
            compositeClause = new TextLocalisedQuantityClause(R$plurals.analytics_budget_overview_days_left, Long.valueOf(jBetween), (List) null, (Style) null, 28);
        } else {
            bVar = bVar2;
            compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.analytics_budget_overview_per_day, zhm.u.c(new MoneyClause(otd.f.a(pyd.c.k(dVar5, jBetween)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedQuantityClause(R$plurals.analytics_budget_overview_days_left, Long.valueOf(jBetween), (List) null, (Style) null, 28)), new DotDividerClause((Integer) null), new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), null, 8);
        }
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("BUDGET_OVERVIEW_CENTERED_AMOUNT", z ? new TextLocalisedClause(R$string.analytics_budget_overview_overspent, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10) : new TextLocalisedClause(R$string.analytics_budget_overview_left_to_spend, null, null, 14), new bw0.h(dVarA.k() ? String.valueOf(dVarA.f115082a) : qVar2.f281304a.e(dVarA), cp5.d.J(bVar), null, true, null, null, false, false, null, null, null, bw0.c.DisabledNotDimmed, 16340), null, new bw0.m(compositeClause, bw0.l.INFO, null, false, null, 28), null, b9.WRAP_CONTENT, null, new bw0.a(new Color.Solid(R$attr.uikit_colorForeground)), null, null, null, null, 7848);
        yp0.b.r(model, R$attr.uikit_dp24, R$attr.uikit_dp16, 0, 0, 12);
        eVarB.add(model);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("BUDGET_OVERVIEW_BUDGET_CELL", new t0((Clause) new TextLocalisedClause(R$string.analytics_budget_overview_cell_budget, null, null, 14), (Image) null, 0, false, 30), umd.q.b(content.f281279a, null), null, null, null, null, 0, null, false, false, null, null, 30712);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.analytics_budget_overview_cell_upcoming, null, null, 14), (Image) null, 0, false, 30);
        MoneyClause moneyClauseB = umd.q.b(dVar4, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254));
        ArrayList arrayList = iVar.f298652b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((mae.o) qVar2.d).h((qua.p) it8.next(), r0.g()));
        }
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("BUDGET_OVERVIEW_UPCOMING_CELL", t0Var, moneyClauseB, null, null, null, null, 0, null, true, false, new i2(arrayList2, h2.START), null, 22520);
        CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("BUDGET_OVERVIEW_SPENT_CELL", new t0((Clause) new TextLocalisedClause(gj7.b.A(content.e) ? R$string.analytics_budget_overview_cell_spent_month : R$string.analytics_budget_overview_cell_spent_week, null, null, 14), (Image) null, 0, false, 30), umd.q.b(dVar3, null), null, null, null, null, 0, null, false, false, null, null, 30712);
        List listK = dVar4.k() ? zhm.v.k(model2, model4, model3) : zhm.v.k(model2, model3, model4);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        ArrayList arrayList3 = content.f;
        Float fValueOf = Float.valueOf(16.0f);
        if (arrayList3.isEmpty()) {
            listG = zhm.u.c(new RowDelegate.Model("BUDGET_OVERVIEW_ADD_CATEGORY", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(R$string.analytics_budget_overview_category_add, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
            yp0.b.k(listG, 0, 0, 0, 0, 31);
            qVar = qVar2;
            i = i3;
        } else {
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                umd.b bVar3 = (umd.b) it9.next();
                thf.c cVar = qVar2.f281306c;
                dj0.d dVar6 = bVar3.f281284b;
                i3 i3Var = bVar3.f281283a;
                dj0.d dVarH3 = pyd.c.H(dVar6, bVar3.f281285c);
                boolean z3 = dVarH3.f115082a < 0;
                umd.q qVar3 = qVar2;
                long j3 = dVarH3.f115082a;
                if (j3 < 0) {
                    j3 = 0;
                }
                Iterator it10 = it9;
                dj0.d dVar7 = new dj0.d(j3, dVarH3.f115083b);
                String strQ = j6.a.q("BUDGET_OVERVIEW_CATEGORY_", i3Var.getId());
                wjf.e eVar = (wjf.e) cVar;
                LayeredImage layeredImageI = eVar.i(i3Var, Integer.valueOf(R$attr.uikit_colorAccentNeutral_10), Integer.valueOf(R$attr.uikit_colorAccentNeutral));
                ProgressStyle.Companion companion = ProgressStyle.INSTANCE;
                long j5 = dVar6.f115082a;
                if (j5 <= 0) {
                    i2 = i3;
                    dVar = dVarH3;
                    iG = 0;
                } else {
                    i2 = i3;
                    dVar = dVarH3;
                    iG = kotlin.ranges.f.g((int) ((r3.f115082a / j5) * ((double) 100)), 0, 100);
                }
                arrayList4.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(layeredImageI, null, ProgressStyle.Companion.c(companion, iG, R$attr.uikit_colorForeground), false, null, false, 58), new TextClause(eVar.k(i3Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, umd.q.b(dVar6, null), null, null, 0, new RowDelegate.Model.c.b(new TextLocalisedClause(R$string.analytics_budget_overview_category_amount_left, zhm.u.c(umd.q.b(dVar7, null)), null, 12), z3 ? new TextLocalisedClause(R$string.analytics_budget_overview_category_overspent, zhm.u.c(umd.q.b(dVar.a(), null)), new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 8) : new TextLocalisedClause(R$string.analytics_budget_overview_category_per_day, zhm.u.c(umd.q.b(pyd.c.k(dVar7, jBetween), null)), null, 12), null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
                qVar2 = qVar3;
                it9 = it10;
                i3 = i2;
            }
            qVar = qVar2;
            i = i3;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.analytics_budget_overview_category_section_title, null, null, 14);
            List listK2 = zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_edit, new ImageClauseTint.Color(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.analytics_budget_overview_category_section_action, null, null, 14));
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            listG = yp0.b.g(arrayList4, new ListSubheaderDelegate.Model("BUDGET_OVERVIEW_CATEGORY_SUBHEADER", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450), e0.INSIDE_BOX, 0, 0, 124);
        }
        eVarB.addAll(listG);
        return new umd.d(zhm.u.a(eVarB), i <= 0 ? AnimatedBackgroundType.Base.PERFORMANCE_NEGATIVE : AnimatedBackgroundType.Base.PERFORMANCE_POSITIVE, qVar.a(), zhm.u.c(new TextNavBarMenuItem("BUDGET_OVERVIEW_EDIT", new TextLocalisedClause(R$string.analytics_budget_overview_toolbar_menu_edit, null, null, 14), null, null, 12)));
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        List listC;
        List listA;
        up2.t tVar = (up2.t) this.f280671b;
        SwitchOutReview content = (SwitchOutReview) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        kp2.c cVar = tVar.f281833a;
        aim.e eVarB = zhm.u.b();
        SwitchOutRequestStatus switchOutRequestStatus = content.f64068a;
        eVarB.add(kp2.a.c(switchOutRequestStatus.f64066c, switchOutRequestStatus.d));
        SwitchOutRequestStatus switchOutRequestStatus2 = content.f64068a;
        List list = switchOutRequestStatus2.f64067g;
        LocalDate localDate = switchOutRequestStatus2.f;
        LocalDate localDate2 = switchOutRequestStatus2.e;
        BankInformation bankInformation = switchOutRequestStatus2.d;
        if (list.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("ID_DETAILS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            int i = up2.s.f281831a[switchOutRequestStatus2.f64064a.ordinal()];
            int i2 = 6;
            boolean z = false;
            if (i != 1) {
                if (i == 2) {
                    wn2.d dVar = switchOutRequestStatus2.f64065b;
                    int i3 = dVar == null ? -1 : up2.s.f281832b[dVar.ordinal()];
                    if (i3 == -1) {
                        listA = f0.f322471a;
                    } else if (i3 != 1) {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listC = zhm.u.c(new RowDelegate.Model("ID_CASS_PARTIAL_REQUEST_DETAILS_DESCRIPTION", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_out_cass_partial_title, zhm.u.c(new TextClause(bankInformation.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_out_cass_partial_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                        yp0.b.k(listC, 0, 0, 0, 0, 31);
                        listA = listC;
                    } else if (localDate2 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("Received CASS Full Switch request with no Start Date set");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        listA = f0.f322471a;
                    } else {
                        int i5 = com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_out_cass_details1_title;
                        TextClause textClause = new TextClause(bankInformation.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                        LocalDateClause$DateFormat.INSTANCE.getClass();
                        List listK = zhm.v.k(new RowDelegate.Model("ID_CASS_FULL_REQUEST_DETAILS_DESCRIPTION_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(i5, zhm.v.k(textClause, com.revolut.core.ui_kit.models.j.b(jVar, localDate2, LocalDateClause$DateFormat.Companion.f57815b)), null, 12), null, 0, new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_out_cass_details1_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("ID_CASS_FULL_REQUEST_DETAILS_DESCRIPTION_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i2), new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_out_cass_details2_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_out_cass_details2_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                        yp0.b.k(listK, 0, 0, 0, 0, 31);
                        listA = listK;
                    }
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listA = cVar.a(list);
                }
                eVarB.addAll(listA);
            } else if (localDate2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Received Overstap Switch request with no Start Date set");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                listA = f0.f322471a;
                eVarB.addAll(listA);
            } else {
                if (localDate != null) {
                    int i6 = com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_out_date;
                    com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                    LocalDateClause$DateFormat.INSTANCE.getClass();
                    LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
                    jVar2.getClass();
                    textLocalisedClause = new TextLocalisedClause(i6, zhm.v.k(com.revolut.core.ui_kit.models.j.a(localDate2, dateMedium, null), com.revolut.core.ui_kit.models.j.a(localDate, dateMedium, null)), null, 12);
                } else {
                    textLocalisedClause = null;
                }
                listC = zhm.u.c(new RowDelegate.Model("ID_OVERSTAP_REQUEST_DETAILS_DESCRIPTION", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_details_subtitle_out, null, null, 14), null, 0, textLocalisedClause, !content.f64069b.isEmpty() ? new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_dd_list, null, new Click(26, (Integer) null, (Object) null, "ID_DIRECT_DEBITS_LIST_ACTION", false), 10) : null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                listA = listC;
                eVarB.addAll(listA);
            }
        } else {
            eVarB.addAll(cVar.a(list));
        }
        eVarB.add(new TextDelegate.Model("ID_DISCLAIMER", new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_out_disclaimer, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        return new up2.j(new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_request_review_title, zhm.u.c(new TextClause(bankInformation.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), zhm.u.a(eVarB), true);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        CompositeClause compositeClause;
        boolean z;
        char c2;
        dt dtVarD;
        MoneyClause.Format.Defaults defaults;
        int[] iArr;
        MoneyClause moneyClause;
        TextLocalisedClause textLocalisedClause;
        MoneyClause moneyClause2;
        int iAbs;
        urj.r rVar = (urj.r) this.f280671b;
        urj.d content = (urj.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z3 = content instanceof urj.b;
        urj.b bVar = z3 ? (urj.b) content : null;
        if (bVar != null) {
            urj.o oVarE = urj.r.e(bVar.f282319g);
            int i = oVarE.f282346b;
            int i2 = oVarE.f282347c;
            ImageClauseTint.Color color = new ImageClauseTint.Color(i2);
            Float fValueOf = Float.valueOf(10.0f);
            List listK = zhm.v.k(new ImageClause(i, color, fValueOf, fValueOf, 16), new TextLocalisedClause(oVarE.f282345a, null, new Custom(Integer.valueOf(i2), false, null, false, null, 254), 10));
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            CompositeClause compositeClause2 = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            mzi.b bVar2 = rVar.f282352b;
            qzi.a aVar = bVar.f282322l;
            compositeClause = new CompositeClause(zhm.v.k(compositeClause2, mzi.b.a(bVar2, new Interval(aVar.e.toDateTimeAtStartOfDay(), aVar.f.toDateTimeAtStartOfDay()), null, false, null, 38)), new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            compositeClause = null;
        }
        aim.e eVarB = zhm.u.b();
        if (z3) {
            urj.b bVar3 = (urj.b) content;
            char c3 = 0;
            long j2 = bVar3.f282320h;
            dj0.d dVar = bVar3.d;
            qzi.g gVar = bVar3.f282319g;
            int[] iArr2 = urj.q.f282348a;
            int i3 = iArr2[gVar.ordinal()];
            if (i3 == 1 || i3 == 2) {
                dj0.d dVar2 = bVar3.f282318c;
                long j3 = dVar2.f115082a;
                dj0.d dVar3 = bVar3.e;
                dj0.d dVar4 = bVar3.f282322l.f250648c;
                z = z3;
                h1 h1Var = new h1(new TextLocalisedClause(R$string.analytics_chart_title_left_to_spend, null, null, 14));
                int i5 = iArr2[gVar.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    moneyClause2 = new MoneyClause(dVar2.a(), urj.r.d, null, null, 12);
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moneyClause2 = new MoneyClause(new dj0.d(0L, dVar2.f115083b), urj.r.d, null, null, 12);
                }
                MoneyClause moneyClause3 = moneyClause2;
                int i6 = iArr2[gVar.ordinal()];
                if (i6 == 1 || i6 == 2) {
                    long j5 = dVar4.f115082a;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j3);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    BigDecimal scale = bigDecimalValueOf.setScale(2);
                    Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j5);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    BigDecimal bigDecimalDivide = scale.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                    BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(100);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                    BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(bigDecimalValueOf3);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    iAbs = Math.abs(bigDecimalMultiply.intValue());
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iAbs = 0;
                }
                dtVarD = new dt("main_budget", new j1(h1Var, moneyClause3, new e1(new CompositeClause(zhm.v.k(new PercentageClause(iAbs, (PercentageClause.Format) null, (Custom) null, 6), new TextLocalisedQuantityClause(R$plurals.analytics_budgeting_overview_days_left, Long.valueOf(j2), zhm.u.c(new TextClause(String.valueOf(j2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), (Style) null, 24)), new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12))), new s6(Math.abs(j3), Math.abs(j3) + Math.abs(dVar3.f115082a), Math.abs(dVar.f115082a), urj.r.e(gVar).f282347c, R$attr.uikit_colorGreyTone20, R$attr.uikit_colorRed, true, 320), null, null, null, 1016);
                c2 = c3;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dj0.d.Companion.getClass();
                dtVarD = urj.r.d(dj0.d.c(dj0.d.e, 0L, dVar.f115083b, 1), j2);
                z = z3;
                c2 = c3;
            }
        } else {
            z = z3;
            c2 = 0;
            if (!(content instanceof urj.c)) {
                throw new NoWhenBranchMatchedException();
            }
            dj0.d.Companion.getClass();
            dtVarD = urj.r.d(dj0.d.c(dj0.d.e, 0L, ((urj.c) content).f282325c, 1), 0L);
        }
        int i21 = R$attr.uikit_dp0;
        yp0.b.p(dtVarD, i21, R$attr.uikit_dp24, i21, i21);
        eVarB.add(dtVarD);
        if (z) {
            urj.b bVar4 = (urj.b) content;
            dj0.d dVar5 = bVar4.d;
            int i22 = bVar4.i;
            dj0.d dVar6 = bVar4.f282318c;
            dj0.d dVar7 = bVar4.f282317b;
            int i32 = bVar4.f282321j;
            dj0.d dVar8 = bVar4.e;
            dj0.d dVar9 = bVar4.f;
            qzi.g gVar2 = bVar4.f282319g;
            uzi.c cVar = bVar4.f282316a.f284679a;
            CustomContentDescriptionClause customContentDescriptionClause = new CustomContentDescriptionClause(new TextLocalisedClause(R$string.analytics_budgeting_overview_budget, null, null, 14), new TextLocalisedClause(R$string.analytics_budgeting_overview_budget_description, null, null, 14));
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(urj.r.b(R$drawable.uikit_icn_24_pie_chart), null, null, false, null, false, 60);
            int i33 = R$drawable.uikit_icn_24_pencil;
            ImageClauseTint.Color color2 = new ImageClauseTint.Color(R$attr.uikit_colorAccent);
            Float fValueOf2 = Float.valueOf(16.0f);
            ImageClause imageClause = new ImageClause(i33, color2, fValueOf2, fValueOf2, 16);
            MoneyClause.Format.Defaults defaults2 = urj.r.f282350c;
            MoneyClause moneyClause4 = new MoneyClause(dVar5, defaults2, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8);
            Clause[] clauseArr = new Clause[2];
            clauseArr[c2] = imageClause;
            clauseArr[1] = moneyClause4;
            RowDelegate.Model model = new RowDelegate.Model("BUDGET_VALUE_ID", image40, customContentDescriptionClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new CompositeClause(zhm.v.k(clauseArr), null, null, null, 14), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
            RowDelegate.Model modelA = urj.r.a(cVar, dVar7.l(), Integer.valueOf(i22));
            RowDelegate.Model model2 = i32 > 0 ? new RowDelegate.Model("UPCOMING_SPENDINGS_BANNER_ID", new RowDelegate.Model.MainImage.Image40(urj.r.b(R$drawable.uikit_icn_20_scheduled), false ? 1 : 0, null, false, null, false, 62), new TextLocalisedClause(R$string.analytics_banner_upcoming, null, null, 14), null, 0, new TextLocalisedQuantityClause(R$plurals.analytics_banner_spent_tx, Integer.valueOf(i32), (List) null, (Style) null, 28), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar8.l(), defaults2, null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848) : null;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_chart_title_left_to_spend, null, null, 14);
            RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(urj.r.b(R$drawable.uikit_icn_24_limit), null, null, false, null, false, 60);
            int[] iArr3 = urj.q.f282348a;
            int i43 = iArr3[gVar2.ordinal()];
            if (i43 == 1 || i43 == 2) {
                defaults = defaults2;
                iArr = iArr3;
                moneyClause = new MoneyClause(dVar6.a(), defaults, null, null, 12);
            } else {
                if (i43 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                defaults = defaults2;
                iArr = iArr3;
                moneyClause = new MoneyClause(new dj0.d(0L, dVar6.f115083b), defaults, null, null, 12);
            }
            MoneyClause moneyClause5 = moneyClause;
            int i59 = iArr[gVar2.ordinal()];
            if (i59 == 1 || i59 == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_banner_maxspend, zhm.u.c(new MoneyClause(dVar9, defaults, null, null, 12)), null, 12);
            } else {
                if (i59 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_budgeting_overview_amount_overspent, zhm.u.c(new MoneyClause(pyd.c.H(pyd.c.H(dVar5, dVar7), dVar8).a(), defaults, null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 8);
            }
            RowDelegate.Model model3 = new RowDelegate.Model("LEFT_TO_SPEND_ID", image402, textLocalisedClause2, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(moneyClause5, textLocalisedClause, null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
            qv0.i[] elements = new qv0.i[4];
            elements[c2] = model;
            elements[1] = modelA;
            elements[2] = model2;
            elements[3] = model3;
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            eVarB.addAll(listL);
        } else {
            if (!(content instanceof urj.c)) {
                throw new NoWhenBranchMatchedException();
            }
            urj.c cVar2 = (urj.c) content;
            RowDelegate.Model modelA2 = urj.r.a(cVar2.f282323a.f284679a, new dj0.d(0L, cVar2.f282325c), null);
            yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelA2);
        }
        urj.b bVar5 = z ? (urj.b) content : null;
        List list = bVar5 != null ? bVar5.k : null;
        if (list == null) {
            list = f0.f322471a;
        }
        if (!list.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("LIST_ID_CATEGORY_BUDGETS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.analytics_goals_subheader, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R.string.common_action_manage, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
        }
        List list2 = list;
        srj.b bVar6 = rVar.f282351a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(bVar6.a((trj.a) it8.next()));
        }
        List listC = zhm.u.c(new RowDelegate.Model("LIST_ID_ADD_CATEGORY_BUDGET", urj.r.b(R$drawable.uikit_icn_24_plus), null, null, new TextLocalisedClause(R$string.analytics_banner_addgoal, null, null, 14), null, null, null, 0, null, true, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737708));
        List[] elements2 = new List[2];
        elements2[c2] = arrayList;
        elements2[1] = listC;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        ArrayList arrayListU = zhm.w.u(kotlin.collections.d.L(elements2));
        yp0.b.k(arrayListU, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayListU);
        return new urj.f(compositeClause, zhm.u.a(eVarB));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        uv6.o oVar = (uv6.o) this.f280671b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        ht6.a aVar = (ht6.a) pair.f186385a;
        List list = (List) pair.f186386b;
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((ht6.a) it8.next()).f155327b.f152288b, aVar.f155327b.f152288b)) {
                break;
            }
            i++;
        }
        aim.e eVarB = zhm.u.b();
        List listP0 = d0.P0(list.subList(i + 1, list.size()), new uv6.n());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        Iterator it9 = listP0.iterator();
        while (it9.hasNext()) {
            arrayList.add(oVar.a((ht6.a) it9.next(), false));
        }
        eVarB.addAll(arrayList);
        List listC = zhm.u.c(aVar);
        List listC2 = zhm.u.c(new ListSubheaderDelegate.Model("CURRENTLY_AVAILABLE_CASHBACK_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_upsell_section_your_plan, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        if (listC.isEmpty()) {
            listC2 = null;
        }
        List list2 = listC;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList2.add(oVar.a((ht6.a) it10.next(), true));
        }
        List[] elements = {listC2, arrayList2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.addAll(zhm.w.u(kotlin.collections.d.L(elements)));
        return zhm.u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        uw2.p pVar = (uw2.p) this.f280671b;
        List cardOtpDataList = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cardOtpDataList, "cardOtpDataList");
        aim.e eVarB = zhm.u.b();
        sa saVar = new sa("SCAM_WARNING_LIST_ID", (Clause) new TextLocalisedClause(com.revolut.feature.card_add_to_googlepay.impl.R$string.google_pay_verification_warning_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.card_add_to_googlepay.impl.R$string.x_pay_otp_verification_warning_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        eVarB.add(saVar);
        List<uw2.h> list = cardOtpDataList;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (uw2.h hVar : list) {
            ia3.r rVar = pVar.f283541a;
            h93.f0 f0Var = hVar.f283532a;
            RevolutCardOtp revolutCardOtp = hVar.f283533b;
            Clause clauseB = m93.f.b(rVar, f0Var, null, null, 14);
            h93.f0 f0Var2 = hVar.f283532a;
            String str = f0Var2.f150115j;
            TextClause textClause = str != null ? new TextClause("··".concat(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            arrayList.add(new RowDelegate.Model(f0Var2.f150110a, new RowDelegate.Model.MainImage.Image40(((ia3.t) pVar.f283542b).d(f0Var2, true), null, null, false, null, false, 60), clauseB, null, 0, textClause, null, null, 0, (hVar.f283534c || revolutCardOtp.d == null) ? new pf(new TextClause(revolutCardOtp.f65546c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT, false, null, null, 504) : new pf(new TextLocalisedClause(com.revolut.feature.card_add_to_googlepay.impl.R$string.xpay_confirmation_action_is_it_you, null, null, 14), null, h4.ACCENT, false, null, null, 504), false, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return zhm.u.a(eVarB);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        TextLocalisedClause textLocalisedClause;
        LayeredImage layeredImageI;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        qee.s sVar = (qee.s) this.f280671b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        y19.e savingsDetails = (y19.e) pair.f186385a;
        hha.d pricingPlan = (hha.d) pair.f186386b;
        x0c.d dVar = (x0c.d) sVar.f245144b;
        Intrinsics.checkNotNullParameter(savingsDetails, "savingsDetails");
        ArrayList arrayList = savingsDetails.f310340c;
        y19.i iVar = savingsDetails.f310339b;
        ArrayList arrayListA = dVar.a("USED_PRODUCT_ITEM_ID_", arrayList);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        ArrayList arrayListA2 = dVar.a("UNUSED_PRODUCT_ITEM_ID_", savingsDetails.d);
        e0 e0Var = e0.OUTSIDE_BOX;
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp16;
        if (arrayListA2.isEmpty()) {
            i = 2;
            i2 = 3;
        } else {
            int i6 = x0c.c.f301563a[iVar.ordinal()];
            if (i6 == 1) {
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_trophy_room_details_paid_plan_discover_more_title, null, null, 14);
            } else if (i6 == 2) {
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_trophy_room_details_rev_points_discover_more_title, null, null, 14);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid savings type " + iVar);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                textLocalisedClause3 = null;
                i = 2;
                i2 = 3;
                arrayListA2 = yp0.b.d(arrayListA2, new ListSubheaderDelegate.Model("DISCOVER_MORE_TITLE_ITEM_ID", (Image) null, (Clause) textLocalisedClause3, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i3, i3, i5, i5);
            }
            textLocalisedClause3 = textLocalisedClause2;
            i = 2;
            i2 = 3;
            arrayListA2 = yp0.b.d(arrayListA2, new ListSubheaderDelegate.Model("DISCOVER_MORE_TITLE_ITEM_ID", (Image) null, (Clause) textLocalisedClause3, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i3, i3, i5, i5);
        }
        ArrayList arrayListE0 = d0.E0(arrayListA2, arrayListA);
        Intrinsics.checkNotNullParameter(savingsDetails, "savingsDetails");
        int[] iArr = x0c.f.f301565a;
        int i21 = iArr[iVar.ordinal()];
        if (i21 == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_trophy_room_details_paid_plan_title, null, null, 14);
        } else if (i21 == i) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_trophy_room_details_rev_points_title, null, null, 14);
        } else {
            if (i21 != i2) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Invalid savings type " + iVar);
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
            textLocalisedClause = null;
        }
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_trophy_room_details_saved, zhm.u.c(new MoneyClause(savingsDetails.f310338a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        Float fValueOf = Float.valueOf(40.0f);
        int i22 = iArr[iVar.ordinal()];
        if (i22 == 1) {
            layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_premium, R$attr.uikit_colorWhite, R$attr.uikit_colorPlanMetalDark);
        } else if (i22 == 2) {
            layeredImageI = new LayeredImage(zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_gradient_background, (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_revpoints, Integer.valueOf(R$attr.uikit_colorWhite), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, com.revolut.core.ui_kit_core.displayers.image.models.c.CENTER_INSIDE, 60)), fValueOf, fValueOf, 8);
        } else {
            if (i22 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Invalid savings type " + iVar);
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
            layeredImageI = null;
        }
        v0c.i iVar2 = new v0c.i(textLocalisedClause, textLocalisedClause4, layeredImageI);
        Intrinsics.checkNotNullParameter(savingsDetails, "savingsDetails");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        return new v0c.j(arrayListE0, iVar2, iVar != y19.i.PAID_PLAN ? null : (hha.s.p(pricingPlan) || hha.s.o(pricingPlan)) ? null : new aw0.e(true, null, null, new n6(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_trophy_room_details_paid_plan_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 54));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        v1g.e eVar = (v1g.e) this.f280671b;
        List allCategories = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        List<TravelExperienceCategory> list = allCategories;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (TravelExperienceCategory travelExperienceCategory : list) {
            boolean z = false;
            InputChecklistDelegate.a aVar = null;
            arrayList.add(new InputChecklistDelegate.Model(j6.a.q("CATEGORY_PREFIX_", travelExperienceCategory.f92807a), new TextClause(travelExperienceCategory.f92808b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), eVar.f285309a.contains(travelExperienceCategory.f92807a), z, aVar, iq.CHECK_BUTTON, null, null, travelExperienceCategory, null, 0, 0, 0, 523992));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uk2.w.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r9v53, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r60, java.lang.Object r61, java.lang.Object r62) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uk2.w.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        v8d.o oVar = (v8d.o) this.f280671b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List<FaqNodeBase> list = content;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (FaqNodeBase faqNodeBase : list) {
            String f51434a = faqNodeBase.getF51434a();
            TextClause textClause = new TextClause(faqNodeBase.getF51435b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            boolean z = false;
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(oVar.f286748a.a(faqNodeBase), z, z, 6);
            yy0.i iVar = yy0.l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            arrayList.add(new RowDelegate.Model(f51434a, image24, textClause, null, 0, null, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, faqNodeBase, null, 0, 0, 0, 0, 532675576));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        vb4.t tVar = (vb4.t) this.f280671b;
        vb4.f content = (vb4.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        whf.p pVar = content.f287402a;
        String str = content.f287404c;
        if (pVar.f297646a.isEmpty()) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_transaction_selection_empty_state_title, null, null, 14);
            String str2 = !kotlin.text.d0.W(str) ? str : null;
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("empty-state", textLocalisedClause, str2 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_transaction_selection_empty_state_subtitle, zhm.u.c(str2), null, 12) : null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_search, null, null, 6)), !kotlin.text.d0.W(str) ? new l6(12, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_revolut_transaction_selection_empty_state_clear_search, null, null, 14), null, h4.ACCENT) : null, zj.REGULAR, false, null, null, null, 1984);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        ArrayList<qv0.o> arrayListC = ((anf.w) tVar.f287422b).c(content.f287402a, new whf.k(0), new whf.i(false));
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListC, 10));
        for (qv0.o oVarE : arrayListC) {
            if (oVarE instanceof SelectableDelegate.Model) {
                SelectableDelegate.Model model2 = (SelectableDelegate.Model) oVarE;
                koi.j jVar = model2.f53305b;
                Intrinsics.i(jVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.items.ParcelItem");
                Object f = ((qv0.p) jVar).getF55256g();
                Intrinsics.i(f, "null cannot be cast to non-null type com.revolut.feature.transactions.models.Transaction");
                oVarE = SelectableDelegate.Model.e(model2, null, content.f287403b.contains(((a3) f).f272581b) ? qd0.SELECTED : qd0.UNSELECTED, null, null, 4194299);
            }
            arrayList.add(oVarE);
        }
        return arrayList;
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        vc2.w wVar = (vc2.w) this.f280671b;
        vc2.b content = (vc2.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Map map = content.f287616a;
        List list = content.f287618c;
        List list2 = content.f287617b;
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = collectionValues.iterator();
        while (true) {
            int i = 2;
            RowDelegate.Model model = null;
            if (!it8.hasNext()) {
                char c2 = 0;
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                List list3 = list2;
                if (list3.isEmpty() && list.isEmpty()) {
                    ComplexImage.Regular regular = new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_add_contact, null, null, 6));
                    zj zjVar = zj.REGULAR;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.secondary_id_settings_empty_state_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.secondary_id_settings_empty_state_description, null, null, 14);
                    List listK = zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.secondary_id_settings_empty_state_action, null, null, 14));
                    m70.a.t(kotlin.jvm.internal.t0.f186434a);
                    List listC = zhm.u.c(new FullScreenStateDelegate.Model("EMPTY_LIST_ID", textLocalisedClause, textLocalisedClause2, regular, zjVar, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, null, false, 0, 0, 32704));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    return new vc2.c(d0.E0(listC, arrayList), f0.f322471a);
                }
                ArrayList<Alias> arrayListE0 = d0.E0(list, list3);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListE0, 10));
                for (Alias alias : arrayListE0) {
                    j12.a aVar = (j12.a) wVar.f287644a;
                    TextClause textClauseD = aVar.d(alias);
                    AliasType aliasType = alias.f61878a;
                    TextLocalisedClause textLocalisedClauseC = aVar.c(aliasType);
                    TextLocalisedClause textLocalisedClauseB = aVar.b(alias);
                    int iA = aVar.a(aliasType);
                    Clause[] elements = new Clause[i];
                    elements[c2] = textLocalisedClauseC;
                    elements[1] = textLocalisedClauseB;
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12);
                    AliasStatus aliasStatus = alias.f61880c;
                    pf pfVar = Intrinsics.f(aliasStatus, AliasStatus.AVAILABLE.f61886b) ? new pf(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_available_action_add, null, null, 14), null, null, false, null, "QVIK_ALIAS_REGISTER_TAG", OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED) : null;
                    AliasStatus.PENDING pending = AliasStatus.PENDING.f61890b;
                    arrayList2.add(new RowDelegate.Model(j6.a.q("ITEM_ALIAS_ID", alias.f61879b), new RowDelegate.Model.MainImage.Image40(new GlyphImage(iA, null, null, 6), Intrinsics.f(aliasStatus, pending) ? new AccentCircleBadge(dw0.a.Pending) : null, null, false, null, false, 60), textClauseD, null, 0, compositeClause, null, null, 0, pfVar, Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b) || Intrinsics.f(aliasStatus, pending), null, false, null, null, null, null, null, null, alias, null, 0, 0, 0, 0, 532673496));
                    c2 = 0;
                    i = 2;
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return new vc2.c(d0.E0(arrayList2, arrayList), zhm.u.c(PlusActionNavBarMenuItem.Companion.b(PlusActionNavBarMenuItem.INSTANCE, "ITEM_ALIAS_NEW", new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.secondary_id_new_contact_title, null, null, 14))));
            }
            o02.e settings = (o02.e) it8.next();
            s12.q qVar = (s12.q) wVar.f287645b;
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (((Boolean) qVar.f259054b.getValue()).booleanValue()) {
                int i2 = s12.p.f259052a[settings.f221100a.ordinal()];
                if (i2 == 1) {
                    o02.c cVar = settings.f221101b;
                    o02.a aVar2 = cVar instanceof o02.a ? (o02.a) cVar : null;
                    if ((aVar2 != null ? Boolean.valueOf(aVar2.f221098a) : null) != null) {
                        model = new RowDelegate.Model(settings.f221100a.a(), new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_request, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_settings_toggle_request_to_pay, null, null, 14), null, 0, null, null, null, 0, new vf(!r7.booleanValue(), true), false, null, false, null, null, null, null, null, null, settings, null, 0, 0, 0, 0, 532675544);
                    }
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (model != null) {
                arrayList.add(model);
            }
        }
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        tsb.f fVar = (tsb.f) this.f280671b;
        t1h.g availableToWithdraw = (t1h.g) obj2;
        ((Boolean) obj3).getClass();
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        boolean z = fVar instanceof tsb.c;
        int i = z ? R$attr.uikit_colorRed : R$attr.uikit_colorGrey50;
        int i2 = z ? R$drawable.uikit_icn_24_exclamation_mark_outline : R$drawable.uikit_icn_24_info_outline;
        dj0.d dVar = availableToWithdraw.f267355b;
        return new CompositeClause(zhm.v.k((dVar == null || dVar.equals(availableToWithdraw.f267354a)) ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_withdraw_amount_available, zhm.u.c(new MoneyClause(availableToWithdraw.f267354a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(i), false, null, false, null, 254), 8) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stocks_withdrawal_amount_available_total, zhm.v.k(new MoneyClause(availableToWithdraw.f267354a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(i), false, null, false, null, 254), 8), new ImageClause(i2, Integer.valueOf(i), fValueOf, fValueOf, 16)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        x0 x0Var = (x0) this.f280671b;
        t1h.p state = (t1h.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        x0Var.f287749y.b3(state);
        return Unit.f186387a;
    }

    private final Object p(Object obj2, Object obj3, Object obj4) throws Throwable {
        TextLocalisedClause textLocalisedClause;
        AssetClauseType assetClauseType;
        Clause assetClause;
        Clause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        xfl.a aVar = (xfl.a) this.f280671b;
        List<pel.f> keyboardSuggestions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(keyboardSuggestions, "keyboardSuggestions");
        ArrayList arrayList = new ArrayList();
        for (pel.f fVar : keyboardSuggestions) {
            d01.b bVar = null;
            if (fVar instanceof v6j.c) {
                if (aVar == null) {
                    hx7.e.n(new Exception("Custom mapper is required for ".concat(fVar.getClass().getName())));
                }
                if (aVar != null) {
                    v6j.c suggestion = (v6j.c) fVar;
                    Intrinsics.checkNotNullParameter(suggestion, "suggestion");
                    boolean z = suggestion instanceof v6j.a;
                    CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
                    if (z) {
                        textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.commodity.order_flow.impl.R$string.fx_orders_editor_suggestion_buy_min_format, ehe.n.x(((v6j.a) suggestion).f286406b, ticker, null, 4), null, 12);
                    } else {
                        if (!(suggestion instanceof v6j.b)) {
                            throw new IllegalStateException("Unsupported commodity keyboard suggestion: ".concat(suggestion.getClass().getName()).toString());
                        }
                        textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.commodity.order_flow.impl.R$string.fx_orders_editor_suggestion_sell_min_format, ehe.n.x(((v6j.b) suggestion).f286408b, ticker, null, 4), null, 12);
                    }
                    bVar = new d01.b(suggestion.getId(), textLocalisedClause3, null, false, null, null, 60);
                }
            } else {
                String id10 = fVar.getId();
                if (fVar instanceof pel.e) {
                    BigDecimal bigDecimalA = ((pel.e) fVar).a();
                    textLocalisedClause2 = new TextClause(a0.d.r((bigDecimalA.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalA.stripTrailingZeros()).toPlainString(), "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else {
                    if (fVar instanceof pel.a) {
                        String str = ((pel.a) fVar).f235396a;
                        if (str != null) {
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.shared.feature.wealth.ui.core.R$string.wealth_keyboard_suggestions_sell_all_format, zhm.u.c(str), null, 12);
                        } else {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.shared.feature.wealth.ui.core.R$string.wealth_keyboard_suggestions_sell_all, null, null, 14);
                        }
                    } else if (fVar instanceof pel.b) {
                        Amount amount = ((pel.b) fVar).f235398b;
                        o9 sensitivity = o9.NON_SENSITIVE;
                        agh.h fiatAssetClauseType = new agh.h(3);
                        agh.h commodityAssetClauseType = new agh.h(4);
                        agh.h cryptoAssetClauseType = new agh.h(5);
                        agh.h securityAssetClauseType = new agh.h(6);
                        agl.b undefinedAssetType = new agl.b(amount, 0);
                        Intrinsics.checkNotNullParameter(amount, "<this>");
                        Intrinsics.checkNotNullParameter(fiatAssetClauseType, "fiatAssetClauseType");
                        Intrinsics.checkNotNullParameter(commodityAssetClauseType, "commodityAssetClauseType");
                        Intrinsics.checkNotNullParameter(cryptoAssetClauseType, "cryptoAssetClauseType");
                        Intrinsics.checkNotNullParameter(securityAssetClauseType, "securityAssetClauseType");
                        Intrinsics.checkNotNullParameter(undefinedAssetType, "undefinedAssetType");
                        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
                        int i = agl.a.f4843a[amount.f104718b.f104719a.ordinal()];
                        if (i == 1) {
                            assetClauseType = (AssetClauseType) fiatAssetClauseType.invoke(amount);
                        } else if (i == 2) {
                            assetClauseType = (AssetClauseType) commodityAssetClauseType.invoke(amount);
                        } else if (i == 3) {
                            assetClauseType = (AssetClauseType) cryptoAssetClauseType.invoke(amount);
                        } else {
                            if (i != 4) {
                                if (i != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                undefinedAssetType.invoke(amount);
                                throw null;
                            }
                            assetClauseType = (AssetClauseType) securityAssetClauseType.invoke(amount);
                        }
                        assetClause = new AssetClause(amount.f104717a, assetClauseType, amount.f104718b.f104720b, null, sensitivity, 8);
                        bVar = new d01.b(id10, assetClause, null, false, null, null, 60);
                    } else {
                        if (!(fVar instanceof pel.c)) {
                            if (fVar instanceof v6j.c) {
                                throw new IllegalStateException("Custom suggestions must be mapped by a custom mapper");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(com.revolut.shared.feature.wealth.ui.core.R$string.wealth_keyboard_suggestions_max, null, null, 14);
                    }
                    assetClause = textLocalisedClause;
                    bVar = new d01.b(id10, assetClause, null, false, null, null, 60);
                }
                assetClause = textLocalisedClause2;
                bVar = new d01.b(id10, assetClause, null, false, null, null, 60);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uk2.w.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Boolean bool;
        UUID uuid;
        UUID uuid2;
        ThemesInteractor$Theme themesInteractor$ThemeA;
        GlobalThemeDeclaration globalThemeDeclaration;
        List listC;
        switch (this.f280670a) {
            case 0:
                y yVar = (y) this.f280671b;
                List atms = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(atms, "atms");
                int i = 14;
                if (atms.isEmpty()) {
                    List listC2 = zhm.u.c(new FullScreenStateDelegate.Model("ATM_NOT_FOUND_ITEM_ID", new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.map_atms_error_not_found, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_binoculars, null, null, 6)), new com.revolut.core.ui_kit.delegates.n6(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.map_atms_button_search_larger_area, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, false, 28), zj.REGULAR, false, null, null, null, 1860));
                    yp0.b.q(listC2, 0, 0, 0, 0, 15);
                    return listC2;
                }
                List<Atm> list = atms;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (Atm atm : list) {
                    String strN = a0.d.n("ATM_", atm.f63117a);
                    TextClause textClause = new TextClause(atm.f63118b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause2 = new TextClause(atm.f63119c.f63129a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(atm.o == sj2.f.REVOLUT ? LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, new Color.Solid(R$attr.uikit_colorBlack), new Color.Solid(R$attr.uikit_colorWhite), 8.0f, null, 48) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_atm, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 8.0f, null, null, 48), null, null, false, null, false, 60);
                    AtmFees atmFees = atm.f63127q;
                    List listL = zhm.v.l((atmFees == null || (bool = atmFees.f63135a) == null || bool.booleanValue()) ? null : new pc("FREE_WITHDRAWAL_LIST_ID", new TagViewData(null, new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_tag_free_withdrawal_title, null, null, i), new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorWidgetBackground)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorWidgetBackground), false, null, null, null, 0, null, 2024), null));
                    ui0.i iVarA = yVar.f280672a.a(rim.d.c(atm.d));
                    if (iVarA instanceof ui0.g) {
                        ui0.g gVar = (ui0.g) iVarA;
                        int i2 = gVar.f280285a;
                        if (i2 > 0) {
                            textLocalisedClause2 = new TextLocalisedClause(R.string.common_distance_miles, zhm.u.c(Integer.valueOf(i2)), null, 12);
                        } else {
                            textLocalisedClause = new TextLocalisedClause(R.string.common_distance_feet, zhm.u.c(Integer.valueOf(gVar.f280286b)), null, 12);
                            textLocalisedClause2 = textLocalisedClause;
                        }
                    } else {
                        if (!(iVarA instanceof ui0.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ui0.h hVar = (ui0.h) iVarA;
                        int i3 = hVar.f280287a;
                        if (i3 > 0) {
                            textLocalisedClause2 = new TextLocalisedClause(R.string.common_distance_km, zhm.u.c(Integer.valueOf(i3)), null, 12);
                        } else {
                            textLocalisedClause = new TextLocalisedClause(R.string.common_distance_meters, zhm.u.c(Integer.valueOf(hVar.f280288b)), null, 12);
                            textLocalisedClause2 = textLocalisedClause;
                        }
                    }
                    arrayList.add(new RowDelegate.Model(strN, image40, textClause, null, 0, textClause2, null, null, 0, new RowDelegate.Model.c.b(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.detail_information_atms_label_distance_away, zhm.u.c(textLocalisedClause2), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, null, false, 126), false, null, false, null, listL, null, null, null, null, atm, null, 0, 0, 0, 0, 532642776));
                    i = 14;
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 1:
                uk9.n nVar = (uk9.n) this.f280671b;
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List listP0 = d0.P0(content, new uk9.m());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : listP0) {
                    ZonedDateTime zonedDateTimeAtZone = ((zh9.r0) obj5).f322330h.atZone(ZoneId.systemDefault());
                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeAtZone, "atZone(...)");
                    Intrinsics.checkNotNullParameter(zonedDateTimeAtZone, "<this>");
                    Intrinsics.checkNotNullParameter(zonedDateTimeAtZone, "<this>");
                    ZonedDateTime zonedDateTimeWithDayOfMonth = zonedDateTimeAtZone.withDayOfMonth(1);
                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWithDayOfMonth, "withDayOfMonth(...)");
                    ZonedDateTime zonedDateTimeWith = zonedDateTimeWithDayOfMonth.with((TemporalAdjuster) LocalTime.MIN);
                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                    uk9.l lVar = new uk9.l(zonedDateTimeWith);
                    Object arrayList2 = linkedHashMap.get(lVar);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(lVar, arrayList2);
                    }
                    ((List) arrayList2).add(obj5);
                }
                Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(setEntrySet, 10));
                for (Map.Entry entry : setEntrySet) {
                    uk9.l lVar2 = (uk9.l) entry.getKey();
                    List list2 = (List) entry.getValue();
                    gk9.b bVar = nVar.f280712a;
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList4.add(bVar.e((zh9.r0) it8.next()));
                    }
                    ZonedDateTime zonedDateTime = lVar2.f280711a;
                    arrayList3.add(yp0.b.g(arrayList4, new ListSubheaderDelegate.Model(a0.d.g(zonedDateTime.getMonthValue(), Math.abs(zonedDateTime.getYear()), "id_section_", "_"), (Image) null, (Clause) new TimeClause(pu7.a.I(zonedDateTime), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                }
                return new uk9.f(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_account_purchases, null, null, 14), zhm.w.u(arrayList3));
            case 2:
                kpj.f fVar = ((ukh.q) this.f280671b).f280767a;
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186385a;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair.f186386b;
                List<WealthAccount> listP02 = d0.P0(list3, new ukh.p());
                ArrayList arrayList5 = new ArrayList(zhm.w.t(listP02, 10));
                for (WealthAccount wealthAccount : listP02) {
                    String strP = p.a.p("documents-product-", wealthAccount.getClass().getName(), "-listId");
                    Object eVar = null;
                    TextLocalisedClause textLocalisedClauseH = fVar.h(n2l.l.a(wealthAccount), tradingLegalEntityInformation.f105106a, null);
                    RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(fVar.g(n2l.l.a(wealthAccount)), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
                    tf tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
                    if (wealthAccount instanceof WealthAccount.Securities) {
                        WealthAccount.Securities securities = (WealthAccount.Securities) wealthAccount;
                        TradingAccount.Portfolio portfolio = securities.f95240c;
                        if (portfolio != null && (uuid2 = portfolio.f105210a) != null) {
                            eVar = new ukh.g(uuid2, securities.f95239b);
                        }
                    } else if (wealthAccount instanceof WealthAccount.Commodities) {
                        eVar = ukh.d.f280753a;
                    } else if (wealthAccount instanceof WealthAccount.Robo) {
                        eVar = ukh.f.f280755a;
                    } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount) {
                        WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = (WealthAccount.TaxAdvantageWealthAccount) wealthAccount;
                        TradingAccount.Portfolio d = taxAdvantageWealthAccount.getD();
                        if (d != null && (uuid = d.f105210a) != null) {
                            eVar = new ukh.h(taxAdvantageWealthAccount, uuid);
                        }
                    } else {
                        if (!(wealthAccount instanceof WealthAccount.Margin)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = ((WealthAccount.Margin) wealthAccount).f95234c;
                        if (str != null) {
                            eVar = new ukh.e(str);
                        }
                    }
                    arrayList5.add(new RowDelegate.Model(strP, image402, textLocalisedClauseH, null, 0, null, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532675576));
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                return arrayList5;
            case 3:
                ukk.h hVar2 = (ukk.h) this.f280671b;
                List rewardsPreview = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(rewardsPreview, "rewardsPreview");
                hha.d dVar = (hha.d) hVar2.f280775b.getContent();
                if (dVar == null) {
                    return ukk.q.d("id_partner_grid_all", rewardsPreview);
                }
                List list4 = rewardsPreview;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : list4) {
                    if (((g0) obj6).f143628b) {
                        arrayList6.add(obj6);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : list4) {
                    g0 g0Var = (g0) obj7;
                    if (g0Var.b() && !g0Var.f143628b) {
                        arrayList7.add(obj7);
                    }
                }
                List listB0 = d0.B0(d0.B0(list4, arrayList6), arrayList7);
                aim.e eVarB = zhm.u.b();
                if (!arrayList6.isEmpty()) {
                    eVarB.add(new ListSubheaderDelegate.Model("id_subheader_new", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_partner_offers_subheader_new_to, zhm.u.c(dok.g.d(dVar, null)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338));
                    eVarB.addAll(ukk.q.d("id_partner_grid_new", arrayList6));
                }
                int size = listB0.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        if (!((g0) listB0.get(i5)).a().f) {
                            i5++;
                        }
                    } else if (!arrayList7.isEmpty()) {
                        ukk.q.b(eVarB, arrayList7);
                        ukk.q.a(eVarB, listB0, true);
                    }
                }
                ukk.q.a(eVarB, listB0, !arrayList6.isEmpty());
                ukk.q.b(eVarB, arrayList7);
                return zhm.u.a(eVarB);
            case 4:
                return new soc.f(obj4, 4, (ukm.q) this.f280671b, (flm.i) obj2);
            case 5:
                um2.a aVar = (um2.a) this.f280671b;
                um2.e products = (um2.e) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(products, "products");
                List products2 = products.f281190a;
                ThemedBackgroundKey themedBackgroundKey = aVar.f;
                ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo = (ThemeCustomisationContract$ThemeInfo) aVar.f281178b.getContent();
                int i6 = 0;
                boolean z = ((themeCustomisationContract$ThemeInfo == null || (themesInteractor$ThemeA = themeCustomisationContract$ThemeInfo.a()) == null || (globalThemeDeclaration = themesInteractor$ThemeA.f63800a) == null) ? null : globalThemeDeclaration.T4()) == vjg.i.PARTICLES;
                Intrinsics.checkNotNullParameter(products2, "products");
                int i21 = -1;
                if (themedBackgroundKey != null) {
                    Iterator it9 = products2.iterator();
                    int i22 = 0;
                    while (true) {
                        if (it9.hasNext()) {
                            if (Intrinsics.f(themedBackgroundKey.b(), ((em2.i) it9.next()).f127589b.b())) {
                                i21 = i22;
                            } else {
                                i22++;
                            }
                        }
                    }
                }
                List list5 = products2;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list5, 10));
                for (Object obj8 : list5) {
                    int i32 = i6 + 1;
                    if (i6 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    em2.i iVar = (em2.i) obj8;
                    String strN2 = a0.d.n((themedBackgroundKey == null || i21 == 0) ? "home_screen_preview_item_" : "product_", i6);
                    NavBarWithContainerBackground navBarWithContainerBackground = iVar.f127590c;
                    String strQ = j6.a.q("inner_", strN2);
                    Clause clause = iVar.f127588a;
                    Image image = iVar.d;
                    if (!Intrinsics.f(iVar.f127590c, NavBarWithContainerBackground.TransparentBackground.f57882a)) {
                        image = null;
                    }
                    arrayList8.add(new xn(strN2, navBarWithContainerBackground, new WallpaperPreviewDelegate.Model(strQ, clause, image, iVar), z));
                    i6 = i32;
                }
                return new um2.i(arrayList8, i21);
            case 6:
                um9.l lVar3 = (um9.l) this.f280671b;
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                kq8.f owner = (kq8.f) pair2.f186385a;
                List settings = (List) pair2.f186386b;
                int i33 = 14;
                if (settings.isEmpty()) {
                    listC = zhm.u.c(new RowDelegate.Model("JUNIOR_BLOCKED_SECTION_EMPTY_STATE_LIST_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_phone_book, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_junior_blocked_empty_state, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                } else {
                    km9.d dVar2 = lVar3.f281276a;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    Intrinsics.checkNotNullParameter(settings, "settings");
                    List<kq8.b> list6 = settings;
                    ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                    for (kq8.b bVar2 : list6) {
                        arrayList9.add(new wh(bVar2.f188334a, RowDelegate.Model.x(((xl3.d) dVar2.f185736a).m(hb9.b.D(bVar2)), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2049, 15), zhm.u.c(new SwipeToActionDelegate.SwipeAction(j6.a.q("ACTION_ITEM_ID_PREFIX_", bVar2.f188334a), new ResourceImage(R$drawable.uikit_icn_24_trash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_common_action_remove, null, null, i33), xh0.NEGATIVE, null, new km9.c(owner, bVar2), null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                        i33 = 14;
                    }
                    listC = arrayList9;
                }
                return yp0.b.g(listC, um9.l.a(owner), null, 0, 0, 126);
            case 7:
                return a(obj2, obj3, obj4);
            case 8:
                umk.n nVar2 = (umk.n) this.f280671b;
                PricingPlanOfferPrompt prompt = (PricingPlanOfferPrompt) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                if (prompt instanceof PricingPlanOfferPrompt.Available) {
                    return zhm.u.c(nVar2.a(((PricingPlanOfferPrompt.Available) prompt).f102847a));
                }
                if (!(prompt instanceof PricingPlanOfferPrompt.Unavailable)) {
                    throw new NoWhenBranchMatchedException();
                }
                PricingPlanOfferPromptErrorModel pricingPlanOfferPromptErrorModel = ((PricingPlanOfferPrompt.Unavailable) prompt).f102848a;
                String str2 = null;
                return zhm.u.c(new PromptMarketingContentDelegate.Model("id_plan_offer_prompt", pricingPlanOfferPromptErrorModel.f102850b, pricingPlanOfferPromptErrorModel.f102851c, new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30), null), null, pd.BLACK, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ld.CAPTION, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, str2, 54), null == true ? 1 : 0, null, null, str2, null, null, null, null, null, null, null, 2091280));
            case 9:
                unc.s sVar = (unc.s) this.f280671b;
                RoboPortfolioInfo content2 = (RoboPortfolioInfo) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                return new TextLocalisedClause(((jte.d) sVar.f281411b).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? com.revolut.retail.wealth.resources.R$string.wealth_strategies_spare_change_screen_subtitle : com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_screen_subtitle, zhm.u.c(sVar.f281410a.c(content2)), null, 12);
            case 10:
                Integer num = (Integer) this.f280671b;
                xi0.b content3 = (xi0.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                if (num == null) {
                    return unc.t.a();
                }
                ArrayList arrayListG = yp0.b.g(zhm.v.k(new CellDetailsDelegate.Model("spare-change-you-spend", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_screen_details_you_spend, null, null, 14), new MoneyClause(new dj0.d(190L, content3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("spare-change-round-up", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_screen_details_round_up, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_screen_details_round_up_value_format, zhm.v.k(new MoneyClause(new dj0.d(10L, content3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause(String.valueOf(num.intValue()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760)), new ListSubheaderDelegate.Model("spare-change-how-it-works-subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_screen_details_subheader, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("spare-change-you-invest", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_screen_details_you_invest, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.u.c(new MoneyClause(new dj0.d(((long) num.intValue()) * 10, content3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12))), 0, null, null, null, null, null, false, 0, 0, 32760);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return d0.F0(model, arrayListG);
            case 11:
                return b(obj2, obj3, obj4);
            case 12:
                return c(obj2, obj3, obj4);
            case 13:
                us4.u uVar = (us4.u) this.f280671b;
                us4.g content4 = (us4.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                String str3 = content4.f282423b;
                vt4.d dVar3 = content4.d;
                us4.l lVar4 = new us4.l(str3 == null ? null : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_choose_future_instalments_subtitle, null, null, 14));
                aim.e eVarB2 = zhm.u.b();
                CreditCardFutureInstalmentQuotes creditCardFutureInstalmentQuotes = content4.f282424c;
                int i43 = content4.f282422a;
                List list7 = creditCardFutureInstalmentQuotes.f68773a;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it10 = list7.iterator();
                while (it10.hasNext()) {
                    arrayList10.add(Integer.valueOf(((CreditCardFutureInstalmentQuote) it10.next()).f68769b));
                }
                eVarB2.addAll(cm4.l.a(uVar.f282441a, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_choose_future_instalments_suggested_bar_title, null, null, 14), new TextLocalisedQuantityClause(com.revolut.feature.credit.core.R$plurals.credit_card_instalment_repay_choose_future_instalments_instalments, Integer.valueOf(i43), zhm.u.c(Integer.valueOf(i43)), (Style) null, 24), content4.b().f68769b, arrayList10, zhm.v.k(1, 2, 3, d0.m0(arrayList10)), 32));
                CreditCardFutureInstalmentQuote creditCardFutureInstalmentQuoteB = content4.b();
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("id_credit_card_instalment_repay_choose_instalments_amount_to_repay", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_choose_future_instalments_amount_to_repay, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) null, 0, false, 30), sx4.f.b(3, null, null, creditCardFutureInstalmentQuoteB.d), null, null, null, null, 0, null, false, false, null, null, 32760);
                dj0.d dVar4 = creditCardFutureInstalmentQuoteB.e;
                CellDetailsDelegate.Model[] elements = {model2, dVar4 != null ? new CellDetailsDelegate.Model("id_credit_card_instalment_repay_choose_instalments_interest_saved", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_choose_future_instalments_interest_saved, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 28), sx4.f.b(3, null, null, dVar4), null, null, null, null, 0, null, false, true, null, null, 28664) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL2 = kotlin.collections.d.L(elements);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
                eVarB2.addAll(listL2);
                eVarB2.addAll(yp0.b.i(vt4.e.a(dVar3), new ListSubheaderDelegate.Model("id_credit_card_statement_instalment_repay_from_title", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_choose_future_instalments_repayment_from, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                return new us4.m(lVar4, zhm.u.a(eVarB2), new us4.k(dVar3.f291902b ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_choose_future_instalments_add_money, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_amount_action, null, null, 14), true));
            case 14:
                return d(obj2, obj3, obj4);
            case 15:
                return e(obj2, obj3, obj4);
            case 16:
                return g(obj2, obj3, obj4);
            case 17:
                return h(obj2, obj3, obj4);
            case 18:
                return i(obj2, obj3, obj4);
            case 19:
                return j(obj2, obj3, obj4);
            case 20:
                v5e.g gVar2 = (v5e.g) this.f280671b;
                w2 details = (w2) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(details, "details");
                ArrayList arrayList11 = details.f173593n;
                ArrayList arrayList12 = new ArrayList();
                int i59 = 0;
                for (Object obj9 : arrayList11) {
                    int i66 = i59 + 1;
                    if (i59 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    a0.x(gVar2.f286206b.a(i59, (a2) obj9), arrayList12);
                    i59 = i66;
                }
                return arrayList12;
            case 21:
                return k(obj2, obj3, obj4);
            case 22:
                return l(obj2, obj3, obj4);
            case 23:
                return m(obj2, obj3, obj4);
            case 24:
                tul.b bVar3 = (tul.b) this.f280671b;
                t1h.b disclaimer = (t1h.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
                return ((t1h.d) bVar3.f274637b).a(disclaimer);
            case 25:
                return n(obj2, obj3, obj4);
            case 26:
                return o(obj2, obj3, obj4);
            case 27:
                return p(obj2, obj3, obj4);
            case 28:
                return q(obj2, obj3, obj4);
            default:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a) this.f280671b;
                List flights = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(flights, "flights");
                if (flights.isEmpty()) {
                    if (aVar2.a()) {
                        return vhg.h.a();
                    }
                    return null;
                }
                RowDelegate.Model.MainImage.Image40 image403 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_travel, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_results_search_banner_title, null, null, 14);
                List listK = zhm.v.k(new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_results_search_banner_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_results_learn_more, null, new Click(30, (Integer) null, (Object) null, "BANNER_LEARN_MORE_ID", false), 10));
                m70.a.t(kotlin.jvm.internal.t0.f186434a);
                RowDelegate.Model model3 = new RowDelegate.Model("BANNER_ITEM_ID", image403, textLocalisedClause3, null, 0, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                return model3;
        }
    }

    public /* synthetic */ w(Object obj2, int i) {
        this.f280670a = i;
        this.f280671b = obj2;
    }

    public /* synthetic */ w(Object obj2, Object obj3, int i) {
        this.f280670a = i;
        this.f280671b = obj3;
    }
}
