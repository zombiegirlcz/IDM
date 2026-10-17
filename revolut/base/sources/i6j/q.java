package i6j;

import android.os.Parcelable;
import au0.o0;
import au0.u0;
import au0.x0;
import aw0.c7;
import aw0.j0;
import aw0.ka;
import aw0.o9;
import aw0.s8;
import aw0.y4;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ga;
import com.revolut.core.ui_kit.delegates.ha;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus;
import com.revolut.feature.cards_core.R$plurals;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Step;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$Action;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import hfg.z;
import ip0.ak0;
import ip0.dg;
import ip0.gn0;
import ip0.jh0;
import ip0.qe0;
import ip0.t6;
import ip0.v6;
import ip0.we0;
import ip0.xc;
import ip0.yj0;
import ip0.zj;
import iv7.j;
import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l7g.b0;
import mx0.v5;
import org.jmrtd.cbeff.ISO781611;
import tx0.b1;
import tx0.z0;
import wp5.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159035a;

    public /* synthetic */ q(int i) {
        this.f159035a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        Collection collectionG;
        t6 t6Var;
        SavingsProductData content = (SavingsProductData) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        SavingsProduct savingsProduct = content.f86683a;
        SavingsProduct.Protection protection = savingsProduct.f;
        if (protection != null) {
            SavingsDocument savingsDocument = protection.e;
            if (savingsDocument == null) {
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Protection#document is null for product with id ", savingsProduct.f86617a));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
            Object[] elements = {new PlainTextDelegate.Model("PROTECTION_TEXT_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_protection_explanation, null, null, 14), (v5) null, (UrlImage) null, false, pa.NORMAL, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002), savingsDocument != null ? new RowDelegate.Model("INVESTOR_INSURANCE_SCHEME_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_investors_insurance_scheme, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, savingsDocument, null, 0, 0, 0, 0, 532675576) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            collectionG = yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("PROTECTION_TITLE_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_protection_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        } else {
            collectionG = f0.f322471a;
        }
        eVarB.addAll(collectionG);
        ProductGroup.RiskConfig riskConfig = content.f86684b.f86533s;
        if (riskConfig != null) {
            ProductGroup.SafetyInformation safetyInformation = riskConfig.e;
            ProductGroup.RiskIndicator riskIndicator = safetyInformation.f86580b;
            PlainTextDelegate.Model model = new PlainTextDelegate.Model("SAFETY_TEXT_LIST_ID", (Clause) null, (Clause) new HtmlClause(0, 30, (Integer) null, (Object) null, safetyInformation.f86579a), (v5) null, (UrlImage) null, false, pa.NORMAL, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
            if (riskIndicator != null) {
                int i = riskIndicator.f86578c;
                int i2 = riskIndicator.d;
                int i3 = (i * 100) / i2;
                String strI = a0.d.i(i, "/", i2);
                TextClause textClause = new TextClause(riskIndicator.f86576a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i5 = R$drawable.uikit_icn_16_info_outline;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
                Float fValueOf = Float.valueOf(16.0f);
                List listK = v.k(textClause, new ImageClause(i5, numValueOf, fValueOf, fValueOf, 16));
                Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
                t6Var = new t6("RISK_LEVEL_LIST_ID", new CompositeClause(listK, new TextClause("\u2002", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), i3, new TextClause(strI, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ipb.g(riskIndicator.f86576a, riskIndicator.f86577b), new v6(R$attr.uikit_colorGreyTone20_50, R$attr.uikit_colorGreen_80), DefaultFrameSampler.DESIRED_FRAME_WIDTH);
            } else {
                t6Var = null;
            }
            qv0.i[] elements2 = {model, t6Var, new CellDetailsDelegate.Model("MOODYS_RATING_LIST_ID", new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_designed_for_safety_moodys_rating_title, null, null, 14), new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_designed_for_safety_moodys_rating_rating_value, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen_80), false, null, false, null, 254), 10), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("SP_RATING_LIST_ID", new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_designed_for_safety_sp_rating_title, null, null, 14), new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_designed_for_safety_sp_rating_rating_value, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen_80), false, null, false, null, 254), 10), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            eVarB.addAll(yp0.b.g(kotlin.collections.d.L(elements2), new ListSubheaderDelegate.Model("SAFETY_TITLE_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_designed_for_safety_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        aim.e eVarA = u.a(eVarB);
        boolean zIsEmpty = eVarA.isEmpty();
        List listC = eVarA;
        if (zIsEmpty) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Protection and Safety screen doesn't have items to be shown");
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("PROTECTION_AND_SAFETY_ERROR_STATE_LIST_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31716);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model2);
        }
        return listC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x044d  */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0, java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r66v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r65, java.lang.Object r66, java.lang.Object r67) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6j.q.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        nel.n instrument = (nel.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        List listC = u.c(new FullScreenStateDelegate.Model("insights-news-empty-list-id", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_instrument_details_feed_placeholder_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_instrument_details_feed_placeholder_subtitle, v.k(new TextClause(instrument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(instrument.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_newspaper, null, null, 6)), null, null, false, null, null, false, 0, 0, 32752));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        we0 we0Var;
        Upsell upsell = (Upsell) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(upsell, "upsell");
        aim.e eVarB = u.b();
        if (upsell.f81782c.isEmpty()) {
            dg dgVar = new dg("ID_LIST_UPSELL_EMPTY", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14));
            yp0.b.l(dgVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(dgVar);
        } else {
            Upsell.Modal modal = upsell.e;
            String str = modal.f81786b;
            String str2 = modal.f81787c;
            if (str2 != null) {
                we0Var = new we0("ID_LIST_UPSELL_BANNER_IMAGE", new qe0(-2, new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)));
                yp0.b.l(we0Var, 0, 0, 0, 0, null, false, 63);
            } else {
                we0Var = null;
            }
            qv0.i[] elements = {we0Var, new ListSubheaderDelegate.Model("ID_LIST_UPSELL", (Image) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, R$attr.uikit_dp16, 0, 49146)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            eVarB.addAll(kotlin.collections.d.L(elements));
            ArrayList<Step> arrayList = upsell.f81782c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (Step step : arrayList) {
                TextClause textClause = new TextClause(step.f81778c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = step.f81777b;
                arrayList2.add(new RowDelegate.Model("ID_LIST_UPSELL", new RowDelegate.Model.MainImage.Image24(new ResourceImage(ue8.c.a0(step.f81776a), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textClause, null, 0, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            }
            List listD1 = d0.d1(arrayList2);
            yp0.b.k(listD1, 0, 0, 0, 0, 31);
            eVarB.addAll(listD1);
        }
        return u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        List userVouchers = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        long jCurrentTimeMillis = System.currentTimeMillis();
        aim.e eVarB = u.b();
        List list = userVouchers;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            UserVoucher userVoucher = (UserVoucher) obj5;
            if (userVoucher.f83620b == tvb.e.INTERNAL) {
                tvb.d[] elements = {tvb.d.PENDING, tvb.d.COMPLETED};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (kotlin.collections.d.y0(elements).contains(userVoucher.i) && !hx7.b.p(userVoucher, jCurrentTimeMillis)) {
                    arrayList.add(obj5);
                }
            }
        }
        eVarB.addAll(j2f.r.a(arrayList, true));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list) {
            UserVoucher userVoucher2 = (UserVoucher) obj6;
            if (userVoucher2.f83620b == tvb.e.INTERNAL && hx7.b.p(userVoucher2, jCurrentTimeMillis)) {
                arrayList2.add(obj6);
            }
        }
        eVarB.addAll(j2f.r.a(arrayList2, false));
        return u.a(eVarB);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        u2f.d agent = (u2f.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(agent, "agent");
        return new j2f.f(new UrlImage(agent.f276621h, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), 40, 40, false, false, 409598), new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_my_cards_details_title, null, null, 14), new TextClause(agent.f276619c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        List suggestions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        List list = suggestions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            String str = (String) obj5;
            arrayList.add(new SuggestionsBarDelegate.Suggestion(a0.d.n("SUGGESTION_LIST_ID", i), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, str, null, 380));
            i = i2;
        }
        return u.c(new nh("SUGGESTIONS_BAR_LIST_ID", arrayList, jh0.HORIZONTAL_SCROLLER, R$attr.uikit_dp8, 0, 0, 0, 0, 496));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186386b;
        f0 f0Var = f0.f322471a;
        List<e93.f0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (e93.f0 f0Var2 : list2) {
            String strQ = j6.a.q("IMAGES_PAGER_LIST_ID", f0Var2.f123860a);
            we0 we0Var = new we0(f0Var2.f123860a, new qe0(-2, f0Var2.f123861b));
            int i = R$attr.uikit_dp64;
            int i2 = R$attr.uikit_dp96;
            yp0.b.p(we0Var, i, i, i2, i2);
            arrayList.add(new xc(strQ, u.c(we0Var), 0, null, null, 0, 0, 0, 1020));
        }
        return new j53.m(f0Var, arrayList, true, !list.isEmpty(), false);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        h02.c details = (h02.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        aim.e eVarB = u.b();
        eVarB.add(new gn0("TWO_LOGOS_HEADER_LIST_ID", ApmMultibanco.f61815c.j()));
        LocalDateTime localDateTime = details.f148184h;
        LocalDateTime localDateTime2 = details.i;
        eVarB.add(new np0.b("APM_TIMER_ID", Duration.between(localDateTime, localDateTime2).toMillis(), oi0.d.R(localDateTime2), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_pending_payment_title, null, null, 14)));
        RowDelegate.Model model = new RowDelegate.Model("PAYMENT_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_card, R$attr.uikit_colorOnAccent, R$attr.uikit_colorAccent), null, null, false, null, false, 60), new TextClause(details.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TimeClause(oi0.d.R(localDateTime2), new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(details.f148183g, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return new j82.l(u.a(eVarB), true);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        boolean z;
        ActionCardDelegate.Model model;
        int i = 0;
        boolean z3 = true;
        switch (this.f159035a) {
            case 0:
                jt5.b balance = (jt5.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(balance, "balance");
                dj0.d dVar = balance.f178355b;
                if (dVar != null) {
                    return new CellDetailsDelegate.Model("VALUE_LIST_ID", new TextLocalisedClause(com.revolut.retail.feature.commodity.asset_details.impl.R$string.asset_details_investment_value_title, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                }
                return null;
            case 1:
                b0 bookingDetails = (b0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
                l7g.o oVar = bookingDetails.f192592m;
                aim.e eVarB = u.b();
                if (oVar != null) {
                    l7g.n nVar = oVar.f192629a;
                    int i2 = com.revolut.feature.travel.flights.api.R$string.travel_flights_ticket_rules_fare_details_baggage;
                    ArrayList<l7g.i> arrayList = nVar.f192627b;
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    for (l7g.i iVar : arrayList) {
                        arrayList2.add(new k7g.b(iVar.f192610c, iVar.f192608a));
                    }
                    List listA = k7g.a.a(i2, "TICKET_RULES_BAGGAGE_SUBHEADER", "TICKET_RULES_BAGGAGE_RULE_", arrayList2);
                    int i3 = com.revolut.feature.travel.flights.api.R$string.travel_flights_ticket_rules_fare_details_changes_and_refunds;
                    ArrayList<l7g.h> arrayList3 = nVar.f192628c;
                    ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                    for (l7g.h hVar : arrayList3) {
                        arrayList4.add(new k7g.b(hVar.f192607b, hVar.f192606a));
                    }
                    ArrayList arrayListE0 = d0.E0(k7g.a.a(i3, "TICKET_RULES_CHANGES_AND_REFUNDS_SUBHEADER", "TICKET_RULES_CHANGES_AND_REFUNDS_RULE_", arrayList4), listA);
                    eVarB.addAll(arrayListE0.isEmpty() ? f0.f322471a : yp0.b.g(d0.F0(new PlainTextDelegate.Model("TICKET_RULES_FARE_DETAILS_NOTE", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_ticket_rules_fare_details_applies_to_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 61422), arrayListE0), new ListSubheaderDelegate.Model("TICKET_RULES_FARE_DETAILS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_ticket_rules_fare_details_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                    String str = oVar.f192630b;
                    String str2 = !kotlin.text.d0.W(str) ? str : null;
                    List listL = v.l(str2 != null ? new PlainTextDelegate.Model("TICKET_RULES_AIRLINE_RULES_DESCRIPTION", (Clause) null, (Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65006) : null);
                    ArrayList arrayList5 = oVar.f192631c;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj5 : arrayList5) {
                        int i5 = i + 1;
                        if (i < 0) {
                            v.s();
                            throw null;
                        }
                        l7g.f fVar = (l7g.f) obj5;
                        List list = fVar.f192603c;
                        ArrayList arrayList7 = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList7.add(((l7g.d) it8.next()).f192597a);
                        }
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj6 : arrayList7) {
                            if (!kotlin.text.d0.W((String) obj6)) {
                                arrayList8.add(obj6);
                            }
                        }
                        String strK0 = d0.k0(arrayList8, "\n\n", null, null, 0, null, 62);
                        String str3 = !kotlin.text.d0.W(strK0) ? strK0 : null;
                        PlainTextDelegate.Model model2 = str3 != null ? new PlainTextDelegate.Model(a0.d.n("TICKET_RULES_AIRLINE_RULES_BOUND_", i), (Clause) new CompositeClause(v.k(new TextClause(fVar.f192601a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(fVar.f192602b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause(" – ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), (Clause) new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 60906) : null;
                        if (model2 != null) {
                            arrayList6.add(model2);
                        }
                        i = i5;
                    }
                    ArrayList arrayListE02 = d0.E0(arrayList6, listL);
                    eVarB.addAll(arrayListE02.isEmpty() ? f0.f322471a : yp0.b.g(arrayListE02, new ListSubheaderDelegate.Model("TICKET_RULES_AIRLINE_RULES_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_ticket_rules_airline_rules_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                }
                return u.a(eVarB);
            case 2:
                List content = (List) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content, "content");
                return !content.isEmpty() ? content : zBooleanValue ? i9d.a.c() : i9d.a.b();
            case 3:
                File content2 = (File) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                String absolutePath = content2.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                return u.c(new ga("LIST_ID_PDF", new ha(absolutePath)));
            case 4:
                JuniorBankingProfile it9 = (JuniorBankingProfile) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(it9, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it9);
            case 5:
                HotelsProperty hotelsProperty = (HotelsProperty) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
                Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
                TextDelegate.Model model3 = new TextDelegate.Model("ADDITIONAL_INFO_DETAILS_ITEM_ID", fcg.a.a(hotelsProperty), j0.TRANSPARENT, false, new ak0(yj0.START, null, 2), null, null, null, 0, 0, 0, 0, 131048);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                return u.c(model3);
            case 6:
                ApmOnboardingStatus status = (ApmOnboardingStatus) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(status, "status");
                return status;
            case 7:
                PodNominee podNominee = (PodNominee) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(podNominee, "podNominee");
                iek.f fVar2 = new iek.f(new TextClause(podNominee.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UserAvatarImage(new UserNamePlaceholder.Default(podNominee.d, 0), null, null, 6));
                RowDelegate.Model model4 = new RowDelegate.Model("NAME_ROW_ID", null, new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_name, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(podNominee.f102618b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
                RowDelegate.Model model5 = new RowDelegate.Model("LAST_NAME_ROW_ID", null, new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_last_name, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(podNominee.f102619c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
                RowDelegate.Model model6 = new RowDelegate.Model("DOB_ROW_ID", null, new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_dob, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TimeClause(ebm.a.P(podNominee.e), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
                String str4 = podNominee.f;
                RowDelegate.Model model7 = str4 != null ? new RowDelegate.Model("EMAIL_ROW_ID", null, new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_email, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882) : null;
                Address address = podNominee.f102620g;
                Object[] elements = {model4, model5, model6, model7, address != null ? new CellDetailsNoteDelegate.Model("ADDRESS_ROW_ID", new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_address, null, null, 14), null, new TextClause(o51.a.b(address, null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList arrayListG = yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("PERSONAL_DETAILS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_section_header_details_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_section_header_details_edit, null, null, 14), true, (Object) podNominee, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898), null, 0, 0, 126);
                List listC = u.c(new RowDelegate.Model("DELETE_ROW_ID", null, new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_actions_delete, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new iek.j(fVar2, d0.E0(listC, arrayListG));
            case 8:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair.f186385a;
                boolean zBooleanValue2 = ((Boolean) pair.f186386b).booleanValue();
                hel.b bVar = tradingLegalEntityInformation.f105106a;
                switch (bVar == null ? -1 : igh.v.f161221b[bVar.ordinal()]) {
                    case -1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return null;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_header_banner_learn_more, null, new Click(28, (Integer) null, (Object) new FundDetailsScreenContract$Action.ShowHighRiskWarningInfo(zBooleanValue2), "LEARN_MORE_CLICK_ID", false), 10);
                        return zBooleanValue2 ? yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_header_banner_private_banking_high_risk_warning, null, null, 14), textLocalisedClause)) : yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_header_banner_retail_high_risk_warning, null, null, 14), textLocalisedClause));
                }
            case 9:
                jel.b0 fundDetails = (jel.b0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(fundDetails, "fundDetails");
                x xVar = fundDetails.f173416j;
                List list2 = xVar != null ? xVar.f173598b : null;
                if (list2 == null || list2.isEmpty()) {
                    return f0.f322471a;
                }
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i6 = R$drawable.uikit_icn_24_megaphone;
                int i21 = R$attr.uikit_colorAccentNeutral;
                List listC2 = u.c(new RowDelegate.Model("FUND_DETAILS_PORTFOLIO_UPDATE_ITEM", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i21), 0.1f, companion, i6, new Color.Solid(i21)), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_venture_capital_fund_details_portfolio_update_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_venture_capital_fund_details_portfolio_update_subtitle, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, new FundDetailsScreenContract$Action.NavigateToPortfolioUpdates(fundDetails.f173412b), null, 0, 0, 0, 0, 532673496));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return listC2;
            case 10:
                z content3 = (z) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                TextClause textClause = new TextClause(content3.f151905a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_travel, new ImageClauseTint.Color(R$attr.uikit_colorGrey50), (Float) null, (Float) null, 28);
                TextClause textClause2 = new TextClause(content3.f151906b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                return new gig.h(new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_recommended_flights_screen, u.c(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textClause, imageClause, textClause2))), null, 12), u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage(content3.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), new x0(textClause, imageClause, textClause2), new o0(new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_recommended_flights_one_way, null, null, 14)), null)));
            case 11:
                gnh.i content4 = (gnh.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                knh.h hVar2 = content4.f145002a;
                if (hVar2 instanceof knh.g) {
                    return new TextClause(((knh.g) hVar2).f186170a.f105156c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                hx7.e.n(new IllegalStateException("Only Screener remote widgets supported"));
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 12:
                inh.f content5 = (inh.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content5, "content");
                ListSubheaderDelegate.Model model8 = new ListSubheaderDelegate.Model("earnings-calls-widget-header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_earnings_calls, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) inh.d.f162943a, (Parcelable) null, 0, 0, 0, 0, 64426);
                y4 y4Var = new y4(inh.i.f162948a);
                ArrayList arrayList9 = content5.f162944a;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj7 : arrayList9) {
                    if (((kp3.b) obj7).a() instanceof iel.h) {
                        arrayList10.add(obj7);
                    }
                }
                List listV0 = d0.V0(arrayList10, 10);
                ArrayList arrayList11 = new ArrayList();
                int i22 = 0;
                for (Object obj8 : listV0) {
                    int i32 = i22 + 1;
                    if (i22 < 0) {
                        v.s();
                        throw null;
                    }
                    kp3.b bVar2 = (kp3.b) obj8;
                    iel.i iVarA = bVar2.a();
                    iel.h hVar3 = iVarA instanceof iel.h ? (iel.h) iVarA : null;
                    if (hVar3 == null) {
                        z = z3;
                        model = null;
                    } else {
                        z = z3;
                        model = new ActionCardDelegate.Model(a0.d.n("earnings-calls-widget-item-", i22), new TextClause(hVar3.f160785c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new InstrumentImage(hVar3.d, 30, null, null), null, new com.revolut.core.ui_kit.delegates.f(com.revolut.core.ui_kit.models.j.b(c7.Companion, hVar3.f160784b, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT)), com.revolut.core.ui_kit.delegates.e.SMALL), new inh.c(bVar2), null, false, 16088);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    }
                    if (model != null) {
                        arrayList11.add(model);
                    }
                    i22 = i32;
                    z3 = z;
                }
                hg hgVar = new hg("earnings-calls-widget-scroller", arrayList11, 3, y4Var, null, null, false, false, null, null, 0, 0, 0, 0, 32752);
                qv0.i[] iVarArr = new qv0.i[2];
                iVarArr[0] = model8;
                iVarArr[z3 ? 1 : 0] = hgVar;
                return v.k(iVarArr);
            case 13:
                return a(obj2, obj3, obj4);
            case 14:
                iqg.h data = (iqg.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                return new lw0.a(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_spare_change_bottom_sheet_title, null, null, 14), data.f167841b.f234889n == pcd.b.PERSONAL_JOINT ? new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_spare_change_bottom_sheet_subtitle_joint, null, null, 14) : new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_spare_change_bottom_sheet_subtitle, null, null, 14), null, null, false, 28);
            case 15:
                JuniorBankingProfile content6 = (JuniorBankingProfile) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content6, "content");
                od0.h hVar4 = od0.i.Companion;
                String str5 = content6.f77099b;
                hVar4.getClass();
                return od0.h.a(str5);
            case 16:
                itk.c tradeCfdsWidgetData = (itk.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(tradeCfdsWidgetData, "tradeCfdsWidgetData");
                return yp0.b.g(v.k(itk.g.a(bfl.g.BUY, tradeCfdsWidgetData.f168416a), itk.g.a(bfl.g.SELL, tradeCfdsWidgetData.f168416a)), new ListSubheaderDelegate.Model("trade-cfds-header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_widget_trade_cfds_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_widget_trade_cfds_title_cta, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) itk.d.f168417a, (Parcelable) null, 0, 0, 0, 0, 64426), null, 0, 0, 126);
            case 17:
                AsftConfig config = (AsftConfig) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                return config.f98711b ? new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_button_get_pass, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_home_button_buy_pass, null, null, 14);
            case 18:
                d0j.f content7 = (d0j.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content7, "content");
                ArrayList arrayList12 = content7.f110391a;
                ArrayList arrayList13 = new ArrayList(w.t(arrayList12, 10));
                for (Object obj9 : arrayList12) {
                    int i33 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    d0j.b bVar3 = (d0j.b) obj9;
                    arrayList13.add(new z0(String.valueOf(i), new NavBarWithContainerBackground.VideoBackground(new UrlVideo(bVar3.f110374b, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, 114), (Image) null, (VideoShutter) null, (s8) null, 30), new TextClause(bVar3.f110373a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(bVar3.f110375c.f110371a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
                    i = i33;
                }
                return new iuj.p(arrayList13, b1.MEDIUM, content7.f110393c > 0 ? u.c(new IconNavBarMenuItem("CHALLENGE_HISTORY_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_trophy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_earned_rewards_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : f0.f322471a);
            case 19:
                rt5.h earnPocketsData = (rt5.h) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(earnPocketsData, "earnPocketsData");
                return Boolean.valueOf(!earnPocketsData.f257199a.isEmpty());
            case 20:
                return b(obj2, obj3, obj4);
            case 21:
                ti7.f reviewDetails = (ti7.f) obj2;
                ((Boolean) obj3).getClass();
                j.a aVar = iv7.j.Companion;
                Intrinsics.checkNotNullParameter(reviewDetails, "reviewDetails");
                List list3 = reviewDetails.f271433a;
                Collection collectionL = list3 != null ? cp5.c.l(list3) : null;
                if (collectionL == null) {
                    collectionL = f0.f322471a;
                }
                return !collectionL.isEmpty() ? new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_insurance_documents_review_title_with_exclusions, null, null, 14) : new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_insurance_documents_review_title, null, null, 14);
            case 22:
                return c(obj2, obj3, obj4);
            case 23:
                return d(obj2, obj3, obj4);
            case 24:
                return e(obj2, obj3, obj4);
            case 25:
                return g(obj2, obj3, obj4);
            case 26:
                return h(obj2, obj3, obj4);
            case 27:
                return i(obj2, obj3, obj4);
            case 28:
                return j(obj2, obj3, obj4);
            default:
                whf.p transactionsContent = (whf.p) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                return new TextLocalisedQuantityClause(R$plurals.card_reactivate_chargeback_description, Integer.valueOf(d0.V0(transactionsContent.f297646a, 3).size()), (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 12);
        }
    }

    public /* synthetic */ q(Object obj2, int i) {
        this.f159035a = i;
    }
}
