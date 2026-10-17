package u3b;

import android.os.Parcelable;
import aw0.a4;
import aw0.b4;
import aw0.k1;
import aw0.ka;
import aw0.la;
import aw0.o9;
import aw0.p3;
import aw0.s8;
import aw0.t0;
import aw0.v3;
import aw0.w3;
import aw0.y3;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.z;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.AvatarByUserIdImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.esim.instructions.R$string;
import com.revolut.feature.insurance_common.data.model.Document;
import com.revolut.feature.insurance_common.data.model.DocumentsGroup;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.trading.core.domain.PocketInfo;
import com.revolut.retail.trading.core.domain.PocketOwnerInfo;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ggc.g0;
import hx7.q;
import ip0.ak0;
import ip0.jj0;
import ip0.qe0;
import ip0.rh;
import ip0.t5;
import ip0.ti0;
import ip0.ue0;
import ip0.ui0;
import ip0.we0;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ko5.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.h3;
import mx0.v5;
import org.joda.time.DateTime;
import rd6.j;
import rd6.k;
import tx0.f3;
import uf7.l;
import uf7.n;
import uf7.x;
import ulk.m;
import yhm.r;
import yp0.e0;
import zhm.a0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276892a;

    public /* synthetic */ h(int i) {
        this.f276892a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        qv0.i t5Var;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        k kVar = (k) pair.f186385a;
        rd6.b bVar = (rd6.b) pair.f186386b;
        if (!(kVar instanceof rd6.i)) {
            if (kVar instanceof j) {
                return ud6.i.a();
            }
            throw new NoWhenBranchMatchedException();
        }
        rd6.i iVar = (rd6.i) kVar;
        ArrayList arrayList = bVar.f253350c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            rd6.d dVar = (rd6.d) obj5;
            jj0 jj0Var = new jj0(a0.d.n("instructionStepHeaderItem_", i2), new TextClause(bVar.f253348a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.esim_ui_instructions_step_pattern, v.k(Integer.valueOf(i2), Integer.valueOf(bVar.f253350c.size())), null, 12), new TextClause(dVar.f253351a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            int i3 = R$attr.uikit_dp0;
            yp0.b.p(jj0Var, i3, R$attr.uikit_dp16, i3, i3);
            String str = dVar.f253352b;
            String strN = a0.d.n("instructionStepDescriptionItem_", i2);
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i5 = R$attr.uikit_dp0;
            PlainTextDelegate.Model model = new PlainTextDelegate.Model(strN, (Clause) null, (Clause) textClause, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, i5, i5, i5, i5, 4078);
            rd6.h hVar = dVar.f253353c;
            if (hVar == null) {
                t5Var = null;
            } else if (hVar instanceof rd6.f) {
                t5Var = new we0(a0.d.n("instructionsStepImageItem_", i2), new qe0(-2, new UrlImage(((rd6.f) hVar).f253355a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)));
                int i6 = R$attr.uikit_dp72;
                int i21 = R$attr.uikit_dp0;
                yp0.b.l(t5Var, i6, i21, i21, i21, null, false, 48);
            } else if (hVar instanceof rd6.g) {
                t5Var = new we0(a0.d.n("instructionsStepVideoItem_", i2), new ue0(new UrlVideo(((rd6.g) hVar).f253356a, (String) null, false, (oz0.b) null, false, (oz0.c) null, 126), 450));
                int i22 = R$attr.uikit_dp72;
                int i32 = R$attr.uikit_dp0;
                yp0.b.l(t5Var, i22, i32, i32, i32, null, false, 48);
            } else {
                if (!(hVar instanceof rd6.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str2 = iVar.f253357a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                if (str3.length() == 0) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing lpa code for eSIM profile, check profile state");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimInstructionsStateMapper", null, illegalStateException, h0Var);
                }
                String strN2 = a0.d.n("ACTIVATION_CODE_ITEM_ID_", i2);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_ui_common_template, u.c(str3), null, 12);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.esim_ui_instructions_installation_esim_download_code, null, null, 14);
                int i33 = R$attr.uikit_dp8;
                t5Var = new t5(strN2, textLocalisedClause, textLocalisedClause2, str3, null, null, i33, i33, 0, R$attr.uikit_dp4, 616);
                int i43 = R$attr.uikit_dp24;
                int i59 = R$attr.uikit_dp0;
                yp0.b.l(t5Var, i43, i59, i59, i59, null, false, 48);
            }
            String strN3 = a0.d.n("instructionStepItem_", i2);
            koi.j[] elements = {jj0Var, model, t5Var};
            Intrinsics.checkNotNullParameter(elements, "elements");
            arrayList2.add(new ui0(strN3, kotlin.collections.d.L(elements), (ti0) null, 12));
            i = i2;
        }
        return arrayList2;
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        BigDecimal bigDecimalB;
        BigDecimal bigDecimalB2;
        BigDecimal bigDecimalB3;
        RevPoints revPoints;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        RevPointsPocketInfo revPointsPocketInfo = (RevPointsPocketInfo) pair.f186385a;
        RevPointsPocketThreshold revPointsPocketThresholdT = q.t(revPointsPocketInfo, (List) pair.f186386b);
        int i = com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_common_points;
        if (revPointsPocketThresholdT == null || (revPoints = revPointsPocketThresholdT.f97794b) == null || (bigDecimalB = revPoints.b()) == null) {
            bigDecimalB = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalB;
        Intrinsics.h(bigDecimal);
        o9 o9Var = o9.SENSITIVE;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("REWARD_ITEM_ID", new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_details_cells_reward, null, null, 14), new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_benefit_breakdown_cells_points_yearly, u.c(new TextLocalisedClause(i, u.c(new NumberClause(bigDecimal, null, null, o9Var, 6)), null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8), 0, null, null, j2.H6, null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, 0, 0, 32184);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_details_cells_earned_this_month, null, null, 14);
        int i2 = com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_common_points;
        RevPoints revPoints2 = revPointsPocketInfo.f97787g;
        if (revPoints2 == null || (bigDecimalB2 = revPoints2.b()) == null) {
            bigDecimalB2 = BigDecimal.ZERO;
        }
        Intrinsics.h(bigDecimalB2);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("THIS_MONTH_ITEM_ID", textLocalisedClause, new TextLocalisedClause(i2, u.c(new NumberClause(bigDecimalB2, null, null, o9Var, 6)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_details_cells_all_time_earnings, null, null, 14);
        int i3 = com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_common_points;
        RevPoints revPoints3 = revPointsPocketInfo.f;
        if (revPoints3 == null || (bigDecimalB3 = revPoints3.b()) == null) {
            bigDecimalB3 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = bigDecimalB3;
        Intrinsics.h(bigDecimal2);
        List listK = v.k(model, model2, new CellDetailsDelegate.Model("ALL_TIME_ITEM_ID", textLocalisedClause2, new TextLocalisedClause(i3, u.c(new NumberClause(bigDecimal2, null, null, o9Var, 6)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        l detailsContent = (l) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(detailsContent, "detailsContent");
        hf7.j jVar = detailsContent.f279610a;
        String str = jVar.f151776a;
        f3 f3Var = str != null ? new f3(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Integer.valueOf(R$drawable.uikit_icn_24_time)) : null;
        List list = jVar.f151777b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            hf7.i iVar = (hf7.i) obj5;
            String strN = a0.d.n("HEADER_ACTION_LIST_ID_", i);
            NavBarWithContainerBackground.ImageBackground imageBackground = new NavBarWithContainerBackground.ImageBackground(new UrlImage(iVar.f151772a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), s8.MULTICOLOR, (Color.SolidRes) null, 12);
            TextClause textClause = new TextClause(iVar.f151773b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = iVar.f151774c;
            arrayList.add(new z(strN, imageBackground, textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, 32));
            i = i2;
        }
        n nVar = new n(f3Var, arrayList);
        List list2 = detailsContent.f279611b;
        TextDelegate.Model model = new TextDelegate.Model("TERMS_ID", new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_details_terms_text_placeholder, u.c(new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_details_terms_link, null, new Click(28, (Integer) null, (Object) new uf7.u(detailsContent.d), "TERMS_AND_CONDITIONS_CLICK_ID", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2032);
        yp0.b.r(model, R$attr.uikit_dp16, 0, 0, 0, 14);
        return new x(w.u(v.k(list2, u.c(model))), nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj2, Object obj3, Object obj4) {
        List recipients = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        if (recipients.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("emptyStateItemId", new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_gifting_recipients_empty_state_eligible_recipients, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        List<EsimGiftRecipient> list = recipients;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (EsimGiftRecipient esimGiftRecipient : list) {
            RetailBadge retailBadge = RetailBadge.f58066a;
            ProgressStyle progressStyle = null;
            boolean z = false;
            Object[] objArr = 0 == true ? 1 : 0;
            arrayList.add(new RowDelegate.Model(j6.a.q("RECIPIENT_ITEM_ID_", esimGiftRecipient.f100268a), new RowDelegate.Model.MainImage.Image40(new AvatarByUserIdImage(esimGiftRecipient.f100268a, do3.q.n(esimGiftRecipient), 40.0f, null, 56), retailBadge, progressStyle, z, objArr, false, 60), new TextClause(esimGiftRecipient.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(j6.a.q("@", esimGiftRecipient.f100270c), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, esimGiftRecipient, null, 0, 0, 0, 0, 532676568));
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("kidsAndTeensSubheaderId", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_gifting_recipients_section_kids_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        Map juniorProfiles = (Map) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        Collection<JuniorBankingProfile> collectionValues = juniorProfiles.values();
        ArrayList arrayList = new ArrayList(w.t(collectionValues, 10));
        for (JuniorBankingProfile juniorBankingProfile : collectionValues) {
            ContactImage contactImage = new ContactImage(juniorBankingProfile.f77103j, (String) null, (String) null, (String) null, (String) null, ta6.a.t(juniorBankingProfile), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550);
            CircleBadgeModel circleBadgeModel = null;
            arrayList.add(new RowDelegate.Model(juniorBankingProfile.f77103j, new RowDelegate.Model.MainImage.Image40(contactImage, circleBadgeModel, null, false, null, false, 60), new TextClause(ta6.a.t(juniorBankingProfile), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, juniorBankingProfile, null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int size = content.size();
        for (int i = 0; i < size; i++) {
            if (!((g0) content.get(i)).a().f) {
                return new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_partner_offers_action_upgrade, null, null, 14);
            }
        }
        return null;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        hha.d dVar = (hha.d) pair.f186385a;
        m mVar = (m) pair.f186386b;
        if ((mVar instanceof ulk.l) || (mVar instanceof ulk.k)) {
            return new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_switching_confirmation_free_action_title, u.c(dok.g.d(dVar, null)), null, 12);
        }
        if (mVar instanceof ulk.j) {
            return new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_switching_confirmation_paid_action_title, u.c(dok.b.b(((ulk.j) mVar).f281038a, null, null, null, 7)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3b.h.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        hha.d selectedPlan = (hha.d) rVar.f314201a;
        PricingPlanSubscription currentSubscription = (PricingPlanSubscription) rVar.f314202b;
        qha.a subscribeInfo = (qha.a) rVar.f314203c;
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(currentSubscription, "currentSubscription");
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        Clause clauseD = dok.g.d(selectedPlan, null);
        Clause clauseD2 = dok.g.d(currentSubscription.f81129a, null);
        DateTime dateTime = subscribeInfo.f;
        TimeClause timeClause = dateTime != null ? new TimeClause(dateTime.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12) : null;
        return timeClause == null ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_switching_confirmation_subtitle_immediately, v.k(clauseD2, clauseD), null, 12) : subscribeInfo.f246568g ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_switching_confirmation_subtitle_charged_until_end_android, v.k(clauseD2, clauseD, timeClause, timeClause, clauseD2, clauseD2), null, 12) : new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_switching_confirmation_subtitle_onTime, v.k(clauseD2, clauseD, timeClause), null, 12);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        lw0.a aVar;
        TextLocalisedClause textLocalisedClause;
        List listK;
        int i;
        uob.f content = (uob.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = content instanceof uob.d;
        if (z) {
            uob.d dVar = (uob.d) content;
            ncd.d dVar2 = dVar.f281593c;
            TextLocalisedClause textLocalisedClauseA = uob.m.a(dVar2);
            dj0.d dVar3 = dVar.f281591a;
            MoneyClause moneyClause = new MoneyClause(new dj0.d(1L, dVar3.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            MoneyClause moneyClause2 = new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            int i2 = uob.l.f281602a[dVar2.ordinal()];
            if (i2 == 1) {
                i = com.revolut.feature.retail.savings.api.R$string.savings_mmf_sheets_next_interest_payment_subtitle_low_balance;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.retail.savings.api.R$string.savings_mmf_sheets_next_return_payment_subtitle_low_balance;
            }
            aVar = new lw0.a(textLocalisedClauseA, new TextLocalisedClause(i, v.k(moneyClause, moneyClause, moneyClause2), null, 12), null, null, false, 28);
        } else {
            if (!(content instanceof uob.e)) {
                throw new NoWhenBranchMatchedException();
            }
            ncd.d dVar4 = ((uob.e) content).f281594a;
            TextLocalisedClause textLocalisedClauseA2 = uob.m.a(dVar4);
            int i3 = uob.l.f281602a[dVar4.ordinal()];
            if (i3 == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_mmf_sheets_next_interest_payment_subtitle_cut_off_time, null, null, 14);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_mmf_sheets_next_return_payment_subtitle_cut_off_time, null, null, 14);
            }
            aVar = new lw0.a(textLocalisedClauseA2, textLocalisedClause, null, null, false, 28);
        }
        if (content instanceof uob.e) {
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            listK = u.c(model);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            uob.d dVar5 = (uob.d) content;
            dj0.d dVar6 = dVar5.f281591a;
            pcd.b bVar = dVar5.f281592b.f234889n;
            MoneyClause moneyClause3 = new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ADD_AMOUNT_ACTION_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_mmf_sheets_next_interest_payment_buttons_add_amount, u.c(moneyClause3), null, 12), false, null, null, null, null, 1000);
            yp0.b.r(model3, 0, 0, 0, 0, 15);
            listK = v.k(model2, model3);
        }
        return new uob.i(listK, aVar);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) throws Throwable {
        TextLocalisedClause textLocalisedClause;
        SuccessCircleBadge successCircleBadge;
        TextLocalisedClause textLocalisedClause2;
        upc.e content = (upc.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content == null) {
            hx7.e.n(new IllegalStateException("Unexpected state: " + content + " in SpareChangeWidgetMapperImpl"));
            return f0.f322471a;
        }
        String str = content.f281954a;
        if (!content.f281956c || str == null) {
            return f0.f322471a;
        }
        yvh.b bVar = content.f281955b;
        if (bVar == null || !bVar.f317177b) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_widget_title, null, null, 14);
            successCircleBadge = null;
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_widget_subtitle, null, null, 14);
        } else {
            int i = com.revolut.retail.wealth.resources.R$string.wealth_robo_spare_change_widget_spare_change_info;
            Float f = bVar.i;
            textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(String.valueOf(f != null ? Integer.valueOf((int) f.floatValue()) : null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            textLocalisedClause2 = null;
            successCircleBadge = new SuccessCircleBadge(dw0.a.Checked);
        }
        return u.c(new RowDelegate.Model("robo-spare-change-widget", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_spare_change, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), successCircleBadge, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, new upc.a(str, bVar, content.d), null, 0, 0, 0, 0, 532673496));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3b.h.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        Long l2;
        CryptoWithdrawLimits content = (CryptoWithdrawLimits) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        content.getClass();
        if (o.POTENTIAL_FRAUD != content.e || (l2 = content.f) == null) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_limits_generic_subtitle, null, null, 14);
        } else {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_limits_risk_limit_subtitle, v.l(l2 != null ? oo5.b.b(l2.longValue()) : null), null, 12);
        }
        List listK = v.k(new CellDetailsDelegate.Model("CryptoSendLimitsDialogController_DailyLimit", new t0((Clause) new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_limits_daily, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(oo5.b.c(content.f71093b, true), oo5.b.c(content.f71092a, true))), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("CryptoSendLimitsDialogController_MonthlyLimit", new t0((Clause) new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_limits_monthly, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(oo5.b.c(content.d, true), oo5.b.c(content.f71094c, true))), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(null, listK, new lw0.a(new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_limits_generic_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "CryptoSendLimitsDialogController_Click_LearnMore", false), 10))), null, null, false, 28));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        int i;
        List<DocumentsGroup> documentGroups = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
        ArrayList arrayList = new ArrayList();
        for (DocumentsGroup documentsGroup : documentGroups) {
            ArrayList<Document> arrayList2 = documentsGroup.f75717b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (Document document : arrayList2) {
                Intrinsics.checkNotNullParameter(document, "<this>");
                String str = document.f75713a;
                int i2 = sr7.d.f265133a[document.e.ordinal()];
                if (i2 == 1) {
                    i = R$drawable.uikit_icn_24_document;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_link_external;
                }
                RowDelegate.Model.MainImage.Image40 image40A = sr7.j.a(i, null, true);
                TextClause textClause = new TextClause(document.f75713a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = document.f75714b;
                arrayList3.add(new RowDelegate.Model(str, image40A, textClause, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, document, null, 0, 0, 0, 0, 532675544));
            }
            String str3 = documentsGroup.f75716a;
            ListSubheaderDelegate.Model subheader = new ListSubheaderDelegate.Model(str3, (Image) null, (Clause) new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            int i3 = R$attr.uikit_dp8;
            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
            Intrinsics.checkNotNullParameter(subheader, "subheader");
            if (!arrayList3.isEmpty()) {
                arrayList3 = yp0.b.g(arrayList3, subheader, e0.OUTSIDE_BOX, i3, i3, 112);
            }
            a0.x(arrayList3, arrayList);
        }
        return arrayList;
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        dj0.d f104478b;
        Clause moneyClause;
        PocketOwnerInfo d;
        wi0.b bVar;
        usb.c currencyPickerModel = (usb.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(currencyPickerModel, "currencyPickerModel");
        Image image = currencyPickerModel.f282864b;
        Clause clause = currencyPickerModel.f282863a;
        if (!(currencyPickerModel instanceof usb.c)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = usb.r.f282884a[currencyPickerModel.f282866g.ordinal()];
        if (i == 1) {
            PocketInfo pocketInfo = currencyPickerModel.e;
            if (pocketInfo == null || (d = pocketInfo.getD()) == null || d.f104482c) {
                if (pocketInfo == null || (f104478b = pocketInfo.getF104478b()) == null) {
                    dj0.d.Companion.getClass();
                    f104478b = dj0.d.e;
                }
                moneyClause = new MoneyClause(f104478b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            } else {
                MoneyClause moneyClause2 = new MoneyClause(pocketInfo.getF104478b(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                PocketOwnerInfo d5 = pocketInfo.getD();
                Object[] elements = {moneyClause2, (d5 == null || (bVar = d5.f104480a) == null) ? null : new TextClause(bVar.f297794a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                moneyClause = v1.c.f(kotlin.collections.d.L(elements), null);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            moneyClause = new CurrencyClause(currencyPickerModel.f, CurrencyClause.Format.Ticker.f57756a, null, 4);
        }
        Clause clause2 = moneyClause;
        boolean z = currencyPickerModel.d;
        return new mx0.f3(image, clause, clause2, z, h3.ACTIVE, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.Throwable] */
    private final Object q(Object obj2, Object obj3, Object obj4) {
        utk.a content = (utk.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int i = com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_target_high;
        dj0.d dVar = content.f283119c.f204734a;
        dj0.d dVar2 = content.f283117a;
        CompositeClause compositeClauseA = utk.e.a(i, dVar, dVar2);
        int i2 = com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_target_average;
        mel.c cVar = content.f283119c;
        dj0.d dVar3 = cVar.f204736c;
        CompositeClause compositeClauseA2 = utk.e.a(i2, dVar3, dVar2);
        int i3 = com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_target_low;
        dj0.d dVar4 = cVar.f204735b;
        CompositeClause compositeClauseA3 = utk.e.a(i3, dVar4, dVar2);
        v3 v3Var = null;
        k1 k1Var = new k1(twk.d.a(1, null, new MoneyClause.Format.Headers(null, null, null, false, false, 23), dVar3), v1.c.f(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_target_period_fixed, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_price_targets_analysts_count, u.c(Integer.valueOf(cVar.d)), null, 12)), null), null, 28);
        eel.e chartData = content.f283118b;
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        List list = chartData.f125227a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i5 = 0;
        for (Object obj5 : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                ?? r262 = v3Var;
                v.s();
                throw r262;
            }
            arrayList.add(new p3(i5, mif.a.Q(((eel.f) ((eel.l) obj5).f125239c).f125230a).f115082a));
            v3Var = v3Var;
            compositeClauseA = compositeClauseA;
            compositeClauseA2 = compositeClauseA2;
            i5 = i6;
        }
        v3 v3Var2 = v3Var;
        w3 w3Var = new w3(cVar.f204734a.f115082a, v3Var2);
        w3 w3Var2 = new w3(dVar3.f115082a, v3Var2);
        w3 w3Var3 = new w3(dVar4.f115082a, v3Var2);
        b4 b4Var = new b4(twk.d.a(2, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, dVar2), compositeClauseA, compositeClauseA2, compositeClauseA3, null);
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(chartData.f125229c);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        LocalDateTime localDateTimeZ = oi0.d.Z(instantOfEpochMilli);
        TimeClause.Format.MonthAndYear monthAndYear = new TimeClause.Format.MonthAndYear(ka.SHORT, la.SHORT);
        TimeClause timeClause = new TimeClause(chartData.f125228b, monthAndYear, null, null, 12);
        TimeClause timeClause2 = new TimeClause(chartData.f125229c, monthAndYear, null, null, 12);
        LocalDateTime localDateTimePlusYears = localDateTimeZ.plusYears(1L);
        Intrinsics.checkNotNullExpressionValue(localDateTimePlusYears, "plusYears(...)");
        List listC = u.c(new rh("priceTarget.fanChart.chart", k1Var, new y3(w3Var, w3Var2, w3Var3, b4Var, arrayList, new a4(timeClause, timeClause2, new TimeClause(oi0.d.R(localDateTimePlusYears), monthAndYear, null, null, 12))), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        String country;
        do3.n user = (do3.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Address address = user.k;
        wi0.b bVarC = (address == null || (country = address.getCountry()) == null) ? null : com.bumptech.glide.d.c(country);
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVarC, wi0.b.y2) ? new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_upsell_card_order_header_debit_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_upsell_card_order_header_title, null, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x063d A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r57, java.lang.Object r58, java.lang.Object r59) {
        /*
            Method dump skipped, instruction units count: 3620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3b.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f276892a = i;
    }
}
