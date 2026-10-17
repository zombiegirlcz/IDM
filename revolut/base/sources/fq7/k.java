package fq7;

import android.os.Parcelable;
import aw0.j0;
import aw0.k7;
import aw0.o9;
import aw0.p9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.md;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.delegates.te;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.impl.R$plurals;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.feature.insurance_car.impl.data.model.Contact;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import com.revolut.feature.store.api.model.StoreExclusivesHeaderResponse;
import com.revolut.feature.store.api.model.StoreExclusivesHeroTile;
import com.revolut.feature.store.api.model.StoreExclusivesOfferContext;
import com.revolut.feature.store.api.model.StoreExclusivesTile;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$Category;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.trading.managed_portfolios.impl.domain.model.ManagedPortfolioReferenceData;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingButton;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingHyperText;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.b;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import d0j.c0;
import d9.e1;
import gck.x;
import ggk.g1;
import ip0.ck0;
import ip0.ej;
import ip0.m4;
import ip0.m6;
import ip0.nb0;
import ip0.o4;
import ip0.p10;
import ip0.pb0;
import ip0.q6;
import ip0.t10;
import ip0.tt;
import ip0.ut;
import ip0.vj0;
import ip0.yj0;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import jel.e2;
import jel.p1;
import jel.q1;
import jel.r1;
import jel.s1;
import jel.t1;
import jel.u1;
import jel.w2;
import jel.y1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m1c.y;
import m1c.z;
import mx0.c7;
import nel.e0;
import nel.n;
import nel.p0;
import ofm.q;
import org.jmrtd.cbeff.ISO781611;
import qua.p;
import yhm.r;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137209a;

    public /* synthetic */ k(int i) {
        this.f137209a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model modelB;
        CellDetailsDelegate.Model modelB2;
        char c2;
        CellDetailsDelegate.Model modelB3;
        char c3;
        CellDetailsDelegate.Model modelB4;
        e2 e2Var;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        e2 e2Var2;
        BigDecimal bigDecimal5;
        BigDecimal bigDecimal6;
        BigDecimal bigDecimal7;
        e2 e2Var3;
        LocalDate localDate;
        BigDecimal bigDecimal8;
        u1 u1Var;
        BigDecimal bigDecimal9;
        BigDecimal bigDecimal10;
        e2 e2Var4;
        LocalDate localDate2;
        BigDecimal bigDecimal11;
        s1 s1Var;
        int i;
        u1 u1Var2;
        BigDecimal bigDecimal12;
        Integer num;
        ej0.b bVar;
        dj0.d dVar;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        w2 w2Var = (w2) pair.f186385a;
        n nVar = (n) pair.f186386b;
        nel.a aVar = nVar.f214599h;
        e0 e0Var = aVar instanceof e0 ? (e0) aVar : null;
        CellDetailsDelegate.Model modelB5 = (e0Var == null || (dVar = e0Var.e) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_issue_face_value, new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, null, 12), "face_value");
        CellDetailsDelegate.Model modelB6 = (e0Var == null || (bVar = e0Var.f) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_issue_issue_price, new MoneyClause(mif.a.Q(bVar), new MoneyClause.Format.Shorts(false, 63), null, null, 12), "issue_price");
        String str = nVar.f214600j;
        CellDetailsDelegate.Model modelB7 = str != null ? g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_issue_isin, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "isin") : null;
        int i2 = R$string.trading_structured_notes_attributes_dictionary_lifecycle_note_trade_date;
        y1 y1Var = w2Var.e;
        CellDetailsDelegate.Model modelB8 = g5e.h.b(i2, g5e.h.e(y1Var.f173609a), "trade_date");
        CellDetailsDelegate.Model modelB9 = g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_lifecycle_issue_date, g5e.h.e(y1Var.f173610b), "issue_date");
        CellDetailsDelegate.Model modelB10 = g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_lifecycle_final_observation_date, g5e.h.e(y1Var.f173611c), "final_observation_date");
        CellDetailsDelegate.Model modelB11 = g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_lifecycle_maturity_date, g5e.h.e(y1Var.d), "maturity_date");
        if (e0Var == null || (num = e0Var.f214567c) == null) {
            modelB = null;
        } else {
            int iIntValue = num.intValue();
            modelB = g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_notes_term, new PeriodClause(new PeriodClause.PeriodComponents(iIntValue / 12, iIntValue % 12, 0, 0, 0, 0, 60), null), "term");
        }
        CellDetailsDelegate.Model[] elements = {modelB5, modelB6, modelB7, modelB8, modelB9, modelB10, modelB11, modelB};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listI = g5e.h.i(kotlin.collections.d.L(elements), g5e.h.a("notes_issue_subheader", R$string.trading_structured_notes_attributes_dictionary_issue_title, AboutNoteGlossaryScreenContract$Category.ISSUE));
        r1 r1Var = w2Var.f;
        CellDetailsDelegate.Model modelB12 = (r1Var == null || (bigDecimal12 = r1Var.f173557a) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_coupon_coupon_rate, g5e.h.d(bigDecimal12), "coupon_rate");
        CellDetailsDelegate.Model modelB13 = (r1Var == null || (u1Var2 = r1Var.f173558b) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_coupon_frequency, g5e.h.f(u1Var2), "coupon_frequency");
        if (r1Var == null || (s1Var = r1Var.f173559c) == null) {
            modelB2 = null;
        } else {
            int i3 = R$string.trading_structured_notes_attributes_dictionary_coupon_coupon_type;
            int i5 = g5e.g.f140774a[s1Var.ordinal()];
            if (i5 == 1) {
                i = R$string.trading_structured_notes_coupon_type_memory;
            } else if (i5 == 2) {
                i = R$string.trading_structured_notes_coupon_type_guaranteed;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.trading_structured_notes_coupon_type_non_memory;
            }
            modelB2 = g5e.h.b(i3, new TextLocalisedClause(i, null, null, 14), "coupon_type");
        }
        qv0.i[] elements2 = {modelB12, modelB13, modelB2, (r1Var == null || (bigDecimal11 = r1Var.d) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_coupon_coupon_barrier, g5e.h.d(bigDecimal11), "coupon_barrier"), (r1Var == null || (localDate2 = r1Var.e) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_coupon_first_observation_date, g5e.h.e(localDate2), "coupon_first_observation_date"), (r1Var == null || (e2Var4 = r1Var.f) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_coupon_performance_basis, g5e.h.h(e2Var4), "coupon_performance_basis")};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        ArrayList arrayListE0 = d0.E0(g5e.h.i(kotlin.collections.d.L(elements2), g5e.h.a("coupon_subheader", R$string.trading_structured_notes_attributes_dictionary_coupon_title, AboutNoteGlossaryScreenContract$Category.COUPON)), listI);
        p1 p1Var = w2Var.f173588g;
        CellDetailsDelegate.Model modelB14 = (p1Var == null || (bigDecimal10 = p1Var.f173534a) == null) ? null : g5e.h.b(R$string.trading_structured_notes_about_note_call_accumulating_return, g5e.h.d(bigDecimal10), "call_accumulating_return");
        CellDetailsDelegate.Model modelB15 = (p1Var == null || (bigDecimal9 = p1Var.f173535b) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_call_redemption_amount, g5e.h.d(bigDecimal9), "call_redemption");
        CellDetailsDelegate.Model modelB16 = (p1Var == null || (u1Var = p1Var.f173536c) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_call_frequency, g5e.h.f(u1Var), "call_frequency");
        if (p1Var == null || (bigDecimal8 = p1Var.d) == null) {
            c2 = 0;
            modelB3 = null;
        } else {
            c2 = 0;
            modelB3 = g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_call_barrier, g5e.h.d(bigDecimal8), "call_barrier");
        }
        if (p1Var == null || (localDate = p1Var.e) == null) {
            c3 = 3;
            modelB4 = null;
        } else {
            c3 = 3;
            modelB4 = g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_call_first_observation_date, g5e.h.e(localDate), "call_first_observation");
        }
        CellDetailsDelegate.Model modelB17 = (p1Var == null || (e2Var3 = p1Var.f) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_call_performance_basis, g5e.h.h(e2Var3), "call_performance_basis");
        qv0.i[] elements3 = new qv0.i[6];
        elements3[c2] = modelB14;
        elements3[1] = modelB15;
        elements3[2] = modelB16;
        elements3[c3] = modelB3;
        elements3[4] = modelB4;
        elements3[5] = modelB17;
        Intrinsics.checkNotNullParameter(elements3, "elements");
        ArrayList arrayListE02 = d0.E0(g5e.h.i(kotlin.collections.d.L(elements3), g5e.h.a("call_subheader", R$string.trading_structured_notes_attributes_dictionary_call_title, AboutNoteGlossaryScreenContract$Category.CALL)), arrayListE0);
        q1 q1Var = w2Var.f173589h;
        CellDetailsDelegate.Model modelB18 = (q1Var == null || (bigDecimal7 = q1Var.f173545a) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_capital_protection_capital_protected, g5e.h.d(bigDecimal7), "capital_protection_protected");
        CellDetailsDelegate.Model modelB19 = (q1Var == null || (bigDecimal6 = q1Var.f173546b) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_capital_protection_capital_barrier, g5e.h.d(bigDecimal6), "capital_protection_barrier");
        CellDetailsDelegate.Model modelB20 = (q1Var == null || (bigDecimal5 = q1Var.f173547c) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_capital_protection_strike, g5e.h.d(bigDecimal5), "capital_protection_strike");
        CellDetailsDelegate.Model modelB21 = (q1Var == null || (e2Var2 = q1Var.d) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_capital_protection_performance_basis, g5e.h.h(e2Var2), "capital_protection_performance_basis");
        qv0.i[] elements4 = new qv0.i[4];
        elements4[c2] = modelB18;
        elements4[1] = modelB19;
        elements4[2] = modelB20;
        elements4[c3] = modelB21;
        Intrinsics.checkNotNullParameter(elements4, "elements");
        ArrayList arrayListE03 = d0.E0(g5e.h.i(kotlin.collections.d.L(elements4), g5e.h.a("capital_protection_subheader", R$string.trading_structured_notes_attributes_dictionary_capital_protection_title, AboutNoteGlossaryScreenContract$Category.CAPITAL_PROTECTION)), arrayListE02);
        t1 t1Var = w2Var.i;
        CellDetailsDelegate.Model modelB22 = (t1Var == null || (bigDecimal4 = t1Var.f173566a) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_final_payout_profit_multiplier, g5e.h.g(bigDecimal4), "final_payout_profit_multiplier");
        CellDetailsDelegate.Model modelB23 = (t1Var == null || (bigDecimal3 = t1Var.f173567b) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_final_payout_loss_multiplier, g5e.h.g(bigDecimal3), "final_payout_loss_multiplier");
        CellDetailsDelegate.Model modelB24 = (t1Var == null || (bigDecimal2 = t1Var.f173568c) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_final_payout_strike, g5e.h.d(bigDecimal2), "final_payout_strike");
        CellDetailsDelegate.Model modelB25 = (t1Var == null || (bigDecimal = t1Var.d) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_final_payout_cap, g5e.h.d(bigDecimal), "final_payout_cap");
        CellDetailsDelegate.Model modelB26 = (t1Var == null || (e2Var = t1Var.e) == null) ? null : g5e.h.b(R$string.trading_structured_notes_attributes_dictionary_final_payout_performance_basis, g5e.h.h(e2Var), "final_payout_performance_basis");
        qv0.i[] elements5 = new qv0.i[5];
        elements5[c2] = modelB22;
        elements5[1] = modelB23;
        elements5[2] = modelB24;
        elements5[c3] = modelB25;
        elements5[4] = modelB26;
        Intrinsics.checkNotNullParameter(elements5, "elements");
        return d0.E0(g5e.h.i(kotlin.collections.d.L(elements5), g5e.h.a("final_payout_subheader", R$string.trading_structured_notes_attributes_dictionary_final_payout_title, AboutNoteGlossaryScreenContract$Category.FINAL_PAYOUT)), arrayListE03);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        eac.l merchants = (eac.l) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(merchants, "merchants");
        if (merchants instanceof eac.k) {
            return f0.f322471a;
        }
        if (!(merchants instanceof eac.j)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = ((eac.j) merchants).f124168a;
        int size = list.size();
        if (size < 4) {
            return f0.f322471a;
        }
        List listV0 = size < 8 ? d0.V0(list, 4) : d0.V0(list, 8);
        ListSubheaderDelegate.Model modelA = gac.j.a((size == 4 || size == 8) ? false : true);
        aim.e eVarB = u.b();
        List<PromotedMerchant> list2 = listV0;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (PromotedMerchant promotedMerchant : list2) {
            arrayList.add(new RewardDelegate.Model(p.a.p("ID_", promotedMerchant.f84690a, "_GRID_ITEM"), (Image) dcc.a.a(promotedMerchant.f84691b), (Clause) new TextClause(promotedMerchant.f84690a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (CompositeClause) null, (RewardDelegate.a) null, false, (Object) promotedMerchant, (AnalyticsContext) null, 760));
        }
        eVarB.add(new te("ID_MERCHANTS_GRID", arrayList, 124));
        return yp0.b.g(u.a(eVarB), modelA, null, 0, 0, 126);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        ba6.h content = (ba6.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("OVERALL_IMPACT_SUBHEADER_ID", new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_overview_contribution_total_section_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_common_action_see_info, null, null, 14), j0.TRANSPARENT, R$attr.uikit_dp24, 32505402);
        CounterTextDelegate.Model model2 = new CounterTextDelegate.Model("CHARITIES_OVERVIEW_ITEM_ID", new TextLocalisedQuantityClause(R$plurals.donations_overview_contribution_total_subtitle, Integer.valueOf(content.f13935b), u.c(Integer.valueOf(content.f13935b)), (Style) null, 24), new t4(new MoneyClause(content.f13934a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, false, null, null, 0, 0, 0, 0, 2040);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return v.k(model, model2);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        dj0.d content = (dj0.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean zK = content.k();
        if (zK) {
            RowDelegate.Model model = new RowDelegate.Model("MAKE_YOUR_FIRST_DONATION_ITEM_ID", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_heart, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 8.0f, null, null, 48), null, null, new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_overview_contribution_first_donation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_overview_contribution_first_donation_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        if (zK) {
            throw new NoWhenBranchMatchedException();
        }
        return f0.f322471a;
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        Clause textLocalisedClause;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        od0.i iVar = (od0.i) pair.f186385a;
        List<Pair> list = (List) pair.f186386b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Pair pair2 : list) {
            ba6.l lVar = (ba6.l) pair2.f186385a;
            p pVar = (p) pair2.f186386b;
            String strQ = j6.a.q("RECURRING_PAYMENT_ITEM_ID", pVar.f249314a.f160150a);
            UrlImage urlImage = new UrlImage(lVar.f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) bb6.a.f14169a, false, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 515578);
            LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_retry, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 4.0f, null, null, 48);
            TextClause textClause = new TextClause(lVar.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Clause[] clauseArr = new Clause[3];
            clauseArr[0] = new MoneyClause(qua.u.f(pVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            t0 t0Var = t0.f186434a;
            m70.a.t(t0Var);
            clauseArr[1] = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (q.r(pVar)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_recurring_period_daily, null, null, 14);
            } else if (q.I(pVar)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_recurring_period_weekly, null, null, 14);
            } else if (q.F(pVar) || q.x(pVar)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_recurring_period_monthly, null, null, 14);
            } else {
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            clauseArr[2] = textLocalisedClause;
            arrayList.add(new RowDelegate.Model(strQ, urlImage, null, null, textClause, new CompositeClause(v.k(clauseArr), null, null, null, 14), null, null, 0, null, false, false, layeredImageB, null, null, null, null, new gc6.i(lVar, pVar), null, 0, 0, 0, 0, 1056948076));
        }
        if (arrayList.isEmpty() && !iVar.d()) {
            return f0.f322471a;
        }
        if (arrayList.isEmpty() && iVar.d()) {
            ListSubheaderDelegate.Model modelC = gc6.q.c();
            RowDelegate.Model modelD = gc6.q.d((Pair) iVar.c());
            yp0.b.l(modelD, 0, 0, 0, 0, null, false, 63);
            return v.k(modelC, modelD);
        }
        if (!arrayList.isEmpty() && !iVar.d()) {
            ListSubheaderDelegate.Model modelC2 = gc6.q.c();
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            return i2b.a.q(modelC2, arrayList);
        }
        ListSubheaderDelegate.Model modelC3 = gc6.q.c();
        List listQ = i2b.a.q(gc6.q.d((Pair) iVar.c()), arrayList);
        yp0.b.k(listQ, 0, 0, 0, 0, 31);
        return i2b.a.q(modelC3, listQ);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        dj0.d content = (dj0.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("USER_TOTAL_CONTRIBUTION_SUBHEADER_ID", new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_overview_contribution_user_section_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_common_action_see_info, null, null, 14), j0.TRANSPARENT, R$attr.uikit_dp24, 32505402);
        CounterTextDelegate.Model model2 = new CounterTextDelegate.Model("USER_TOTAL_CONTRIBUTION_ITEM_ID", new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_overview_contribution_user_subtitle, null, null, 14), new t4(new MoneyClause(content, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, false, null, null, 0, 0, 0, 0, 2040);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return v.k(model, model2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj2, Object obj3, Object obj4) {
        Media urlVideo;
        PromptMarketingContentDelegate.Model.Button button;
        String str;
        String str2;
        PromptMarketingContentDelegate.Model.Button button2;
        PromptMarketingContentDelegate.Model.Button button3;
        String str3;
        String str4;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        kbk.j intro = (kbk.j) rVar.f314201a;
        kbk.k variant = (kbk.k) rVar.f314202b;
        String str5 = intro.f182627a;
        String str6 = intro.f182630g;
        PlanGiftingButton planGiftingButton = intro.f182631h;
        TextClause textClause = new TextClause(intro.f182629c.f102435a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Clause clauseA = ick.a.a(intro.d, R$attr.uikit_colorForeground, R$attr.uikit_colorAccent);
        PlanGiftingButton planGiftingButton2 = intro.f182632j;
        if (planGiftingButton2 != null && variant != kbk.k.CLAIM_ONLY) {
            String str7 = planGiftingButton2.f102432a;
            TextClause textClause2 = str7 != null ? new TextClause(str7, (Style) new Click(12, Integer.valueOf(R$attr.uikit_colorForeground), (Object) PlanGiftingHyperText.HyperTextAction.BenefitsFullList.f102438a, "CLICK_ID_SEE_ALL_BENEFITS", false), (Integer) null, false, (o9) null, (List) null, 124) : null;
            aim.e eVarB = u.b();
            eVarB.add(clauseA);
            if (textClause2 != null) {
                eVarB.add(textClause2);
            }
            clauseA = yoj.b.m(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.a(eVarB));
        }
        ld ldVar = ld.CAPTION;
        kbk.d dVar = intro.f;
        int i = x.f142527a[dVar.f182621b.ordinal()];
        if (i == 1) {
            urlVideo = new UrlVideo(dVar.f182620a, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, 114);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            urlVideo = new UrlImage(dVar.f182620a, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774);
        }
        PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(urlVideo, null, 0 == true ? 1 : 0, 6);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        Clause clause = clauseA;
        pd pdVar = pd.BLACK;
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(variant, "variant");
        int[] iArr = ick.c.f160295a;
        int i2 = iArr[variant.ordinal()];
        if (i2 == 1) {
            button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextClause((planGiftingButton2 == null || (str = planGiftingButton2.f102432a) == null) ? str6 : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, (LargeActionButton.ButtonStyle) (planGiftingButton2 != null ? LargeActionButton.ButtonStyle.f58726b : LargeActionButton.ButtonStyle.f58725a), false, (String) null, 54);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextClause((planGiftingButton == null || (str4 = planGiftingButton.f102432a) == null) ? str6 : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54);
        }
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(variant, "variant");
        int i3 = iArr[variant.ordinal()];
        if (i3 == 1) {
            if (planGiftingButton != null && (str2 = planGiftingButton.f102432a) != null) {
                button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54);
                button3 = button2;
            }
            button3 = null;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            PlanGiftingButton planGiftingButton3 = intro.i;
            if (planGiftingButton3 != null && (str3 = planGiftingButton3.f102432a) != null) {
                button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, "DECLINE_BUTTON_LOADING_TAG", 22);
                button3 = button2;
            }
            button3 = null;
        }
        return u.c(new PromptMarketingContentDelegate.Model(str5, textClause, clause, fullScreenMediaContent, null, pdVar, resourceImage, ldVar, null, button, button3, null, new PromptMarketingContentDelegate.Model.Footer(ick.a.a(intro.e, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorAccent), md.BELOW_BUTTONS), intro, null, null, null, null, null, null, null, 2083088));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Object next;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        g1 g1Var = (g1) rVar.f314201a;
        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) rVar.f314202b;
        Iterator it8 = ((List) rVar.f314203c).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((hha.d) next).f152287a, g1Var.f143718a)) {
                break;
            }
        }
        hha.d dVar = (hha.d) next;
        if (dVar != null) {
            return dVar.f152294m < pricingPlanSubscription.f81129a.f152294m ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_change_change_plan, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_item_upgrade_title, null, null, 14);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return content;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        ggk.a aVar = (ggk.a) pair.f186385a;
        return cjk.b.a(aVar.f143697a, (InsuranceDocumentsAvailability) pair.f186386b, true, false);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        z content = (z) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content instanceof y) {
            return new LabelNavBarMenuItem("rev_points_menu_item", new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), v1.c.g(0, ((y) content).f201475a.f201472c, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4), null, null, 504);
        }
        if (content instanceof z.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i;
        Clause clauseM;
        int i2;
        Clause textLocalisedClause;
        qv0.i kjVar;
        p0 tradingSession;
        vj0 vj0Var;
        switch (this.f137209a) {
            case 0:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                List<kl7.f> list = (List) pair.f186386b;
                aim.e eVarB = u.b();
                CounterTextDelegate.Model model = new CounterTextDelegate.Model("POLICY_NUMBER_ID", new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_get_help_sections_policy_policy_number, null, null, 14), new t4(kotlin.text.d0.W(str) ? new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_summary_sections_policy_policy_number_in_progress_title, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, false, null, null, 0, 0, 0, 0, 2040);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
                ArrayList arrayList = new ArrayList();
                for (kl7.f fVar : list) {
                    aim.e eVarB2 = u.b();
                    ArrayList<Contact> arrayList2 = fVar.f185315c;
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    for (Contact contact : arrayList2) {
                        String str2 = contact.f75200c;
                        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str3 = contact.d;
                        TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                        int i3 = m.f137210a[contact.f75198a.ordinal()];
                        if (i3 == 1) {
                            i = R$drawable.uikit_icn_24_call;
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$drawable.uikit_icn_24_envelope;
                        }
                        arrayList3.add(new RowDelegate.Model(str2, xl7.n.k(i, false, null, 15), textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, contact, null, 0, 0, 0, 0, 532676568));
                    }
                    a0.x(arrayList3, eVarB2);
                    String str4 = fVar.f185314b;
                    if (str4 != null) {
                        eVarB2.add(new TextDelegate.Model(str4, new TextClause(str4, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
                    }
                    aim.e eVarA = u.a(eVarB2);
                    String str5 = fVar.f185313a;
                    a0.x(xl7.n.l(eVarA, new ListSubheaderDelegate.Model(str5, (Image) null, (Clause) new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), arrayList);
                }
                a0.x(arrayList, eVarB);
                RowDelegate.Model model2 = new RowDelegate.Model("OPEN_FAQ_ID", xl7.n.k(R$drawable.uikit_icn_24_question, false, null, 15), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_get_help_sections_actions_cells_faq_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_get_help_sections_actions_cells_faq_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model2);
                return u.a(eVarB);
            case 1:
                Optional ipoInstrumentOptional = (Optional) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(ipoInstrumentOptional, "ipoInstrumentOptional");
                oel.l lVar = (oel.l) gj7.b.m(ipoInstrumentOptional);
                if (lVar == null) {
                    return null;
                }
                afl.t0 t0Var = lVar.f224647a;
                dj0.d dVar = t0Var.f4648b;
                dj0.d dVar2 = t0Var.f4647a;
                if (dVar2.equals(dVar)) {
                    clauseM = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
                } else {
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_instrument_pre_ipo_price_range, null, null, 14);
                    MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                    o9 o9Var = o9.NON_SENSITIVE;
                    List listK = v.k(new MoneyClause(dVar2, defaults, null, o9Var, 4), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4));
                    Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
                    clauseM = yoj.b.m(new TextClause(": ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause2, yoj.b.m(new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK)));
                }
                return clauseM;
            case 2:
                List history = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                if (history.isEmpty()) {
                    List listC = u.c(new FullScreenStateDelegate.Model("empty-recommendation-history-list-id", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_recommendation_history_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_recommendation_history_no_results_description, null, null, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_document_search, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), null, zj.REGULAR, false, null, null, null, 1984));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    return listC;
                }
                List<mel.v> list2 = history;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                for (mel.v recommendation : list2) {
                    Intrinsics.checkNotNullParameter(recommendation, "recommendation");
                    String strN = a0.d.n("recommendation-", recommendation.hashCode());
                    TimeClause timeClause = new TimeClause(recommendation.f204778a.toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12);
                    mel.j0 j0Var = recommendation.f204779b;
                    TextLocalisedClause textLocalisedClause3 = (j0Var == null ? -1 : fwk.g.f138708a[j0Var.ordinal()]) == -1 ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_recommendation_history_not_available, null, new Custom(Integer.valueOf(fwk.f.a(j0Var)), false, null, false, null, 254), 10) : mra.d.M(j0Var, new Custom(Integer.valueOf(fwk.f.a(j0Var)), false, null, false, null, 254));
                    int i5 = j0Var == null ? -1 : fwk.g.f138708a[j0Var.ordinal()];
                    if (i5 == -1) {
                        i2 = R$attr.uikit_colorGreyTone10;
                    } else if (i5 == 1 || i5 == 2) {
                        i2 = R$attr.uikit_colorPerformancePositive;
                    } else if (i5 == 3) {
                        i2 = R$attr.uikit_colorGreyTone2;
                    } else {
                        if (i5 != 4 && i5 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R$attr.uikit_colorPerformanceNegative;
                    }
                    arrayList4.add(new q6(strN, timeClause, new m6(new TagViewData(null, textLocalisedClause3, new Color.Opaque(i2, 0.1f), R$attr.uikit_colorTransparent, null, 1000), new MoneyClause(mif.a.Q(recommendation.f204780c), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE))));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return arrayList4;
            case 3:
                z0h.c disclaimersData = (z0h.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                return new g2d.a(disclaimersData);
            case 4:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                z0h.t1 t1Var = (z0h.t1) pair2.f186386b;
                List list4 = list3;
                boolean z = false;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it8 = list4.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            WealthAccount wealthAccount = (WealthAccount) it8.next();
                            if ((wealthAccount instanceof WealthAccount.Margin) && wealthAccount.available()) {
                                z = true;
                            }
                        }
                    }
                }
                return new g2d.e(t1Var, z);
            case 5:
                List userVouchers = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
                Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : userVouchers) {
                    if (((UserVoucher) obj5).f83620b == tvb.e.INTERNAL) {
                        arrayList5.add(obj5);
                    }
                }
                List listP0 = d0.P0(arrayList5, new g2f.n());
                if (listP0.isEmpty()) {
                    return f0.f322471a;
                }
                List<UserVoucher> listV0 = d0.V0(listP0, 3);
                ArrayList arrayList6 = new ArrayList(w.t(listV0, 10));
                for (UserVoucher userVoucher : listV0) {
                    dj0.d dVar3 = userVoucher.f83623h;
                    TextLocalisedClause textLocalisedClause4 = (dVar3 == null || dVar3.f115082a <= 0) ? null : new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_agent_details_your_giftcards_available_amount, u.c(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                    String strQ = j6.a.q("YOUR_GIFT_CARDS_USER_VOUCHER_PREFIX_LIST_ID ", userVoucher.f83619a);
                    TextClause textClause3 = new TextClause(userVoucher.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(userVoucher.f83622g, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), textLocalisedClause4, null, false, 124);
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(userVoucher.f, null, null, null, 0L, null, null, null, ez0.h.FitCenter, null, false, new ImageTransformations(null, new RoundedRectTransformation(4.0f), null, null, null, null, null, ISO781611.SMT_TAG), 44, 40, false, false, 409086), null, null, false, null, false, 60);
                    tvb.d dVar4 = userVoucher.i;
                    long j2 = userVoucher.f83621c;
                    int i6 = g2f.m.f140048a[dVar4.ordinal()];
                    if (i6 == 1) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_agent_details_your_giftcards_pending_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                    } else {
                        if (i6 != 2 && i6 != 3 && i6 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TimeClause(j2, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                    }
                    arrayList6.add(new RowDelegate.Model(strQ, image40, textClause3, null, 1, textLocalisedClause, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, userVoucher.f83619a, null, 0, 0, 0, 0, 532675528));
                }
                LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("YOUR_GIFT_CARDS_SEE_ALL_LIST_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_agent_details_your_giftcards_see_all, null, null, 14), false, null, null, null, null, 1000);
                List list5 = arrayList6;
                if (listP0.size() > 3) {
                    List listD1 = d0.d1(d0.j1(arrayList6, u.c(model3)));
                    list5 = listD1;
                    if (listD1 == null) {
                        list5 = f0.f322471a;
                    }
                }
                return yp0.b.g(list5, new ListSubheaderDelegate.Model("YOUR_GIFT_CARDS_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_airline_details_your_giftcards_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            case 6:
                List content = (List) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Throwable th10 = (Throwable) obj4;
                Intrinsics.checkNotNullParameter(content, "content");
                aim.e eVarB3 = u.b();
                List list6 = content;
                ArrayList arrayList7 = new ArrayList(w.t(list6, 10));
                int i21 = 0;
                for (Object obj6 : list6) {
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList7.add(u3e.c.a((StoreExclusivesTile) obj6, i22));
                    i21 = i22;
                }
                eVarB3.addAll(arrayList7);
                if (zBooleanValue) {
                    eVarB3.add(nb0.b(pb0.Companion, "EXCLUSIVES_LOADING_LIST_ID", false, 0, false, 30));
                }
                aim.e eVarA2 = u.a(eVarB3);
                return th10 != null ? d0.E0(iii.c.b(null, "EXCLUSIVES_ERROR_STATE_PAGE_ITEM_ID", 4, true), eVarA2) : eVarA2;
            case 7:
                StoreExclusivesHeaderResponse content2 = (StoreExclusivesHeaderResponse) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                ArrayList arrayList8 = content2.f88506a;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj7 : arrayList8) {
                    if (((StoreExclusivesHeroTile) obj7).f88508b == t1e.n.HERO) {
                        arrayList9.add(obj7);
                    }
                }
                ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                int i32 = 0;
                for (Object obj8 : arrayList9) {
                    int i33 = i32 + 1;
                    AnalyticsContext analyticsContext = null;
                    if (i32 < 0) {
                        v.s();
                        throw null;
                    }
                    StoreExclusivesHeroTile storeExclusivesHeroTile = (StoreExclusivesHeroTile) obj8;
                    StoreExclusivesOfferContext storeExclusivesOfferContext = storeExclusivesHeroTile.f88510g;
                    m2e.a aVarB = storeExclusivesOfferContext != null ? u3e.c.b(storeExclusivesOfferContext, "store_exclusives_hero", i33) : null;
                    String strQ2 = j6.a.q("EXCLUSIVES_HERO_BANNER_LIST_ID_PREFIX_", storeExclusivesHeroTile.f88507a);
                    String str6 = storeExclusivesHeroTile.d;
                    TextClause textClause4 = str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    UrlImage urlImage = new UrlImage(storeExclusivesHeroTile.f88509c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                    String str7 = storeExclusivesHeroTile.e;
                    o4 o4Var = str7 != null ? new o4(new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : null;
                    StoreExclusivesOfferContext storeExclusivesOfferContext2 = storeExclusivesHeroTile.f88510g;
                    boolean z3 = storeExclusivesOfferContext2 != null;
                    m4 m4Var = m4.SQUARE;
                    m2e.b bVar2 = storeExclusivesOfferContext2 != null ? new m2e.b(storeExclusivesOfferContext2, aVarB) : null;
                    if (aVarB != null) {
                        analyticsContext = new AnalyticsContext(c2e.a.a(aVarB, null));
                    }
                    BigTileDelegate.Model model4 = new BigTileDelegate.Model(strQ2, textClause4, null, null, urlImage, null, o4Var, null, null, z3, false, null, bVar2, analyticsContext, m4Var, null, 66190504);
                    yp0.b.l(model4, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                    arrayList10.add(model4);
                    i32 = i33;
                }
                return arrayList10.isEmpty() ? f0.f322471a : u.c(g3e.u.a(arrayList10));
            case 8:
                List terms = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(terms, "terms");
                List list7 = terms;
                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                Iterator it9 = list7.iterator();
                while (it9.hasNext()) {
                    String str8 = ((Terms) it9.next()).f90357c;
                    if (str8 != null) {
                        kjVar = new kj("TERMS_CONTENT_LIST_ID", new mj(str8, null), null, Constants.TAG_FC_SPEED_MODE);
                        yp0.b.l(kjVar, 0, 0, 0, 0, null, false, 63);
                    } else {
                        qv0.i t10Var = new t10("TERMS_CONTENT_LIST_ID", p10.f165755a);
                        yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                        kjVar = t10Var;
                    }
                    arrayList11.add(kjVar);
                }
                aim.e eVarB4 = u.b();
                eVarB4.addAll(arrayList11);
                return u.a(eVarB4);
            case 9:
                nel.a0 instrumentWithTicker = (nel.a0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
                InstrumentTicker instrumentTicker = instrumentWithTicker.f214561b;
                if (instrumentTicker == null || (tradingSession = instrumentTicker.v) == null) {
                    return null;
                }
                n nVar = instrumentWithTicker.f214560a;
                Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
                return new TagViewData(ixk.b.a(tradingSession), ixk.b.c(tradingSession), new Color.Solid(ixk.b.b(tradingSession)), R$attr.uikit_colorWidgetBackground, nVar, 488);
            case 10:
                g4b.k performance = (g4b.k) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(performance, "performance");
                if (performance instanceof g4b.j) {
                    return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_cfd_position_details_close_position, null, null, 14);
                }
                return null;
            case 11:
                TradingOrderExitStrategies exitStrategies = (TradingOrderExitStrategies) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
                return exitStrategies.d;
            case 12:
                return a(obj2, obj3, obj4);
            case 13:
                ManagedPortfolioReferenceData content3 = (ManagedPortfolioReferenceData) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                if (content3 instanceof ManagedPortfolioReferenceData.Benchmark) {
                    TagViewData.Companion companion = TagViewData.INSTANCE;
                    ManagedPortfolioReferenceData.Benchmark benchmark = (ManagedPortfolioReferenceData.Benchmark) content3;
                    CompositeClause compositeClause = new CompositeClause(v.k(new TextClause(benchmark.f91241c, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorDeepGrey), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), new PercentageClause(e1.Z(benchmark.d), new PercentageClause.Format.Custom(2, 10, p9.ALWAYS, null, null), new Custom(new Custom.Color.Solid(R$attr.uikit_colorDeepGrey), false, false, 254))), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    ResourceImage resourceImage = new ResourceImage(benchmark.f91239a ? R$drawable.uikit_icn_24_eye : R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorDeepGrey), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    int i43 = R$attr.uikit_colorDeepGrey_10;
                    TagViewData.CollapseState collapseState = new TagViewData.CollapseState();
                    companion.getClass();
                    TagViewData tagViewDataA = TagViewData.Companion.a(resourceImage, compositeClause, i43, collapseState, null);
                    int i59 = R$attr.uikit_dp0;
                    vj0Var = new vj0("ManagedPortfolioReferenceExtensionMapper_bench", tagViewDataA, false, content3, i59, i59, 0, 0, 396);
                } else {
                    if (!(content3 instanceof ManagedPortfolioReferenceData.Contribution)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TagViewData.Companion companion2 = TagViewData.INSTANCE;
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.managed_portfolios_templates_badge_contributions, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorDeepGrey), false, false, 254), 10);
                    ManagedPortfolioReferenceData.Contribution contribution = (ManagedPortfolioReferenceData.Contribution) content3;
                    dj0.d dVar5 = contribution.f91243b;
                    Object[] elements = {textLocalisedClause5, dVar5 != null ? new MoneyClause(dVar5, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(new Custom.Color.Solid(R$attr.uikit_colorDeepGrey), false, false, 254), null, 8) : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    CompositeClause compositeClause2 = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    ResourceImage resourceImage2 = new ResourceImage(contribution.f91242a ? R$drawable.uikit_icn_24_eye : R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorDeepGrey), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    int i66 = R$attr.uikit_colorDeepGrey_10;
                    TagViewData.CollapseState collapseState2 = new TagViewData.CollapseState();
                    companion2.getClass();
                    TagViewData tagViewDataA2 = TagViewData.Companion.a(resourceImage2, compositeClause2, i66, collapseState2, null);
                    int i74 = R$attr.uikit_dp0;
                    vj0Var = new vj0("ManagedPortfolioReferenceExtensionMapper_contribution", tagViewDataA2, false, content3, i74, i74, 0, 0, 396);
                }
                return u.c(vj0Var);
            case 14:
                InstrumentTicker ticker = (InstrumentTicker) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(ticker, "ticker");
                dj0.d dVar6 = ticker.e;
                xi0.b bVar3 = dVar6.f115083b;
                xi0.b.Companion.getClass();
                return new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, ScaleMode.PrettyFormat.f51440a, Intrinsics.f(bVar3, xi0.b.f306271c), false, 9), null, o9.NON_SENSITIVE, 4);
            case 15:
                e7l.f content4 = (e7l.f) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content4, "content");
                return content4.N1;
            case 16:
                return b(obj2, obj3, obj4);
            case 17:
                return c(obj2, obj3, obj4);
            case 18:
                return d(obj2, obj3, obj4);
            case 19:
                return e(obj2, obj3, obj4);
            case 20:
                return g(obj2, obj3, obj4);
            case 21:
                return h(obj2, obj3, obj4);
            case 22:
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter((r) obj2, "<unused var>");
                return Boolean.FALSE;
            case 23:
                return i(obj2, obj3, obj4);
            case 24:
                g1 planLayout = (g1) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(planLayout, "planLayout");
                PlanPageLayoutTerms planPageLayoutTerms = planLayout.f143724l;
                return planPageLayoutTerms == null ? b.a.f103065a : new ghk.k(com.revolut.retail.feature.pricing_plans.ui.impl.footer.e.a(planLayout.f143718a, planPageLayoutTerms));
            case 25:
                sh1.n content5 = (sh1.n) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content5, "content");
                return content5;
            case 26:
                return j(obj2, obj3, obj4);
            case 27:
                return k(obj2, obj3, obj4);
            case 28:
                return l(obj2, obj3, obj4);
            default:
                c0 criteria = (c0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(criteria, "criteria");
                TextClause textClause5 = new TextClause(criteria.f110380b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                aim.e eVarB5 = u.b();
                ArrayList arrayList12 = criteria.f110381c;
                ArrayList arrayList13 = new ArrayList();
                Iterator it10 = arrayList12.iterator();
                while (true) {
                    int i92 = 0;
                    if (!it10.hasNext()) {
                        eVarB5.addAll(arrayList13);
                        String str9 = criteria.d;
                        ej ejVar = (str9 == null || str9.length() == 0) ? null : new ej("eligibility_criteria_terms_footer", new c7(new HtmlClause(0, 30, (Integer) null, (Object) null, str9), false, null, 6));
                        if (ejVar != null) {
                            eVarB5.add(ejVar);
                        }
                        return new guj.f(textClause5, u.a(eVarB5));
                    }
                    d0j.e0 e0Var = (d0j.e0) it10.next();
                    ListSubheaderDelegate.Model model5 = new ListSubheaderDelegate.Model(j6.a.q("eligibility_criteria_subheader", e0Var.f110389a), (Image) null, (Clause) new TextClause(e0Var.f110389a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                    ArrayList arrayList14 = e0Var.f110390b;
                    ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                    for (Object obj9 : arrayList14) {
                        int i96 = i92 + 1;
                        if (i92 < 0) {
                            v.s();
                            throw null;
                        }
                        arrayList15.add(new ut(v1.c.t(i92, "eligibility_criteria_row_", e0Var.f110389a, "_"), new TextClause(((d0j.d0) obj9).f110385a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i96, false, tt.FILL, null, 1000));
                        i92 = i96;
                    }
                    int i99 = R$attr.uikit_dp8;
                    a0.x(yp0.b.g(arrayList15, model5, null, i99, i99, 114), arrayList13);
                }
                break;
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f137209a = i;
    }
}
