package sr8;

import android.os.Parcelable;
import aw0.b9;
import aw0.n0;
import aw0.o0;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_rewards.impl.R$string;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import ggc.g0;
import ggc.h0;
import ggc.y;
import ip0.c4;
import ip0.c50;
import ip0.ej;
import ip0.f50;
import ip0.g50;
import ip0.h50;
import ip0.i50;
import ip0.j50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jlc.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mel.j0;
import mx0.c7;
import org.jmrtd.cbeff.ISO781611;
import tm8.h;
import tre.k;
import tre.l;
import tt4.o;
import tx0.x1;
import u2i.j;
import yhm.r;
import yy0.i;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265137a;

    public /* synthetic */ a(int i) {
        this.f265137a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        String str;
        RowDelegate.Model model;
        TextLocalisedClause textLocalisedClause;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        JuniorBankingProfile juniorProfile = (JuniorBankingProfile) rVar.f314201a;
        List rewardsPreviews = (List) rVar.f314202b;
        hm8.f juniorPartnershipsFeatureState = (hm8.f) rVar.f314203c;
        int i = R$string.junior_rewards_rewards_list_title;
        String str2 = juniorProfile.f77099b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(str2), null, 12);
        aim.e eVarB = u.b();
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(juniorPartnershipsFeatureState, "juniorPartnershipsFeatureState");
        hm8.e eVar = hm8.e.f153541a;
        boolean zF = Intrinsics.f(juniorPartnershipsFeatureState, eVar);
        hm8.d dVar = hm8.d.f153540a;
        hm8.c cVar = hm8.c.f153539a;
        if (zF) {
            str = str2;
            model = new RowDelegate.Model("GRADUATION_BANNER", LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_reverted, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, new TextLocalisedClause(R$string.junior_rewards_rewards_list_expired_benefits_title, null, null, 14), new TextLocalisedClause(R$string.junior_rewards_rewards_list_expired_benefits_subtitle, u.c(str), null, 12), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            str = str2;
            if (!Intrinsics.f(juniorPartnershipsFeatureState, cVar) && !Intrinsics.f(juniorPartnershipsFeatureState, dVar)) {
                throw new NoWhenBranchMatchedException();
            }
            model = null;
        }
        if (model != null) {
            eVarB.add(model);
        }
        Intrinsics.checkNotNullParameter(rewardsPreviews, "rewardsPreviews");
        Intrinsics.checkNotNullParameter(juniorPartnershipsFeatureState, "juniorPartnershipsFeatureState");
        if (Intrinsics.f(juniorPartnershipsFeatureState, dVar)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : rewardsPreviews) {
                if (((g0) obj5).a().f) {
                    arrayList.add(obj5);
                }
            }
            rewardsPreviews = arrayList;
        } else if (!Intrinsics.f(juniorPartnershipsFeatureState, cVar) && !Intrinsics.f(juniorPartnershipsFeatureState, eVar)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = rewardsPreviews;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            g0 rewardPreview = (g0) it8.next();
            Intrinsics.checkNotNullParameter(rewardPreview, "rewardPreview");
            Intrinsics.checkNotNullParameter(juniorPartnershipsFeatureState, "juniorPartnershipsFeatureState");
            h0 h0VarA = rewardPreview.a();
            boolean zF2 = Intrinsics.f(juniorPartnershipsFeatureState, dVar);
            String str3 = h0VarA.f143631a;
            y yVar = rewardPreview.f143629c;
            Iterator it9 = it8;
            String str4 = yVar.f143672a;
            TextClause textClause = new TextClause(str4 == null ? "" : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str5 = yVar.f143673b;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(str5 == null ? "" : str5, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) (0 == true ? 1 : 0), false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 62);
            String str6 = h0VarA.d;
            arrayList2.add(new RowDelegate.Model(str3, image40, textClause, null, 0, str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, zF2, null, false, zF2 ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, rewardPreview, null, 0, 0, 0, 0, 532658136));
            it8 = it9;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        aim.e eVarA = u.a(eVarB);
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(juniorPartnershipsFeatureState, "juniorPartnershipsFeatureState");
        if (Intrinsics.f(juniorPartnershipsFeatureState, dVar)) {
            textLocalisedClause = new TextLocalisedClause(R$string.junior_rewards_reward_details_button, u.c(str), null, 12);
        } else {
            if (!Intrinsics.f(juniorPartnershipsFeatureState, cVar) && !Intrinsics.f(juniorPartnershipsFeatureState, eVar)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = null;
        }
        return new h(textLocalisedClause2, textLocalisedClause, eVarA);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        ProductGroup.RiskConfig riskConfig = (ProductGroup.RiskConfig) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(riskConfig, "riskConfig");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.vaults.R$string.mmf_info_sheets_capital_at_risk_title, null, null, 14), new HtmlClause(0, 30, (Integer) null, (Object) null, riskConfig.d.f86544a), null, null, false, 28);
        aim.e eVarB = u.b();
        ProductGroup.Action action = riskConfig.d.f86545b;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, action != null ? R$attr.uikit_dp8 : R$attr.uikit_dp16, 0, 0, 13);
        eVarB.add(model);
        if (action != null) {
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CAPITAL_AT_RISK_SECONDARY_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextClause(action.f86535a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, new tob.d(action.f86536b), null, 744);
            yp0.b.r(model2, 0, R$attr.uikit_dp16, 0, 0, 13);
            eVarB.add(model2);
        }
        return new tob.g(u.a(eVarB), aVar);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        CircleIconBadge successCircleBadge;
        Clause clauseA;
        v content = (v) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content.f175706a;
        List<ilc.b> list2 = content.f175707b;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        if (list2.isEmpty()) {
            List list3 = content.f175706a;
            String str = content.f175708c;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_recurring_transfer_widget_description_plain, null, null, 14);
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : list3) {
                RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) obj5;
                if (str == null || Intrinsics.f(roboPortfolioInfo.f95703c, str)) {
                    arrayList.add(obj5);
                }
            }
            return tpc.d.a(null, textLocalisedClause, new tpc.f(arrayList));
        }
        ArrayList arrayList2 = new ArrayList();
        for (ilc.b bVar : list2) {
            PortfolioRecurringOrder portfolioRecurringOrder = bVar.f162220a;
            int i = tpc.c.f273335a[portfolioRecurringOrder.d.ordinal()];
            if (i == 1) {
                successCircleBadge = new SuccessCircleBadge(dw0.a.Checked);
                clauseA = tpc.b.a(portfolioRecurringOrder);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                successCircleBadge = new InactiveCircleBadge(dw0.a.Cancelled);
                clauseA = new CompositeClause(zhm.v.k(tpc.b.a(portfolioRecurringOrder), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_recurring_transfer_widget_inactive, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12);
            }
            a0.x(tpc.d.a(successCircleBadge, clauseA, new tpc.e(bVar)), arrayList2);
        }
        return arrayList2;
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        Clause clauseA;
        i50 h50Var;
        Style style;
        cqc.b bVar;
        TextLocalisedClause textLocalisedClause;
        cqc.a aVar;
        int i;
        boolean z;
        int i2;
        Clause compositeClause;
        Integer numValueOf;
        cqc.a content = (cqc.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_step_opened_title, null, null, 14);
        boolean zA = tqc.f.a(content);
        cqc.b bVar2 = content.f108074g;
        long j2 = content.d;
        cqc.d dVar = content.f108072b;
        if (zA) {
            List listK = zhm.v.k(brc.a.a(Long.valueOf(j2)), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_step_opened_description, null, null, 14));
            m70.a.a(t0.f186434a);
            clauseA = new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            clauseA = brc.a.a(Long.valueOf(j2));
        }
        int i3 = tqc.g.f273553a[dVar.ordinal()];
        if (i3 == 1) {
            h50Var = new h50(j50.COMPLETED, c50.FIRST);
        } else if (i3 == 2 || i3 == 3) {
            h50Var = new f50(j50.NORMAL, c50.FIRST, false);
        } else {
            if (i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            h50Var = new h50(j50.FAILED, c50.FIRST);
        }
        ProgressStepVerticalV2Delegate.Model model = new ProgressStepVerticalV2Delegate.Model("DISPUTE_PROGRESS_STEP_ONE", textLocalisedClause2, clauseA, h50Var, false, null, 0, 0, 0, null, false, false, 32752);
        cqc.d dVar2 = cqc.d.COMPLETED;
        if (dVar == dVar2) {
            style = null;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_step_approved_title, null, null, 14);
        } else {
            style = null;
            if (tqc.f.a(content)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_step_outcome_title, null, null, 14);
            } else {
                cqc.d dVar3 = cqc.d.FAILED;
                if (dVar == dVar3) {
                    bVar = bVar2;
                    if (bVar == cqc.b.BACKOFFICE_REJECTED || bVar == cqc.b.COUNTERPARTY_REJECTED) {
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_step_rejected_after_dispute_title, null, null, 14);
                    }
                } else {
                    bVar = bVar2;
                }
                if (dVar == dVar3 && (bVar == null || bVar == cqc.b.INTERNAL_ERROR || bVar == cqc.b.UNKNOWN)) {
                    style = null;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_step_closed_without_response_title, null, null, 14);
                } else {
                    style = null;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_step_dispute_rejected_title, null, null, 14);
                }
            }
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        if (tqc.f.a(content)) {
            aVar = content;
            compositeClause = new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_common_est_format, u.c(brc.a.a(aVar.f108075h)), style, 12);
            i = 2;
            i2 = 1;
            z = false;
        } else {
            aVar = content;
            Long l2 = aVar.e;
            Clause clauseA2 = l2 != null ? brc.a.a(l2) : null;
            String str = aVar.f;
            i = 2;
            z = false;
            i2 = 1;
            Clause[] elements = {clauseA2, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            m70.a.a(t0.f186434a);
            compositeClause = new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        List listK2 = zhm.v.k(model, new ProgressStepVerticalV2Delegate.Model("DISPUTE_PROGRESS_STEP_TWO", textLocalisedClause3, compositeClause, dVar == dVar2 ? new f50(j50.COMPLETED, c50.LAST, z) : tqc.f.a(aVar) ? new g50(c50.LAST) : new f50(j50.FAILED, c50.LAST, z), false, null, 0, 0, 0, null, false, false, 32752));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        int i5 = tqc.g.f273554b[aVar.f108073c.ordinal()];
        if (i5 == i2) {
            numValueOf = Integer.valueOf(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_state_nav_bar_description_salary_wrong_account);
        } else if (i5 == i) {
            numValueOf = Integer.valueOf(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_state_nav_bar_description_salary_not_arrived);
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        return new tqc.d(numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null, listK2);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayListG;
        tre.d content = (tre.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List listP0 = d0.P0(content.f273782a, new k());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (true) {
            arrayListG = null;
            if (!it8.hasNext()) {
                break;
            }
            lre.b bVar = (lre.b) it8.next();
            String str = bVar.f199503a;
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i = R$drawable.uikit_icn_24_document;
            int i2 = R$attr.uikit_colorAccent;
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), null, null, false, null, false, 62), new TextClause(bVar.f199506g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(com.revolut.feature.terms.api.R$string.terms_terms_list_accepted_on, u.c(new TimeClause(bVar.e.getMillis(), TimeClause.Format.DateEditable.f57960b, null, null, 12)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532676568));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        List list = content.f273783b;
        if (!list.isEmpty()) {
            List<lre.d> listP02 = d0.P0(list, new l());
            ArrayList arrayList2 = new ArrayList(w.t(listP02, 10));
            for (lre.d dVar : listP02) {
                String str2 = dVar.f199508a;
                LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                int i3 = R$drawable.uikit_icn_24_document;
                int i5 = R$attr.uikit_colorAccent;
                arrayList2.add(new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i5), 0.1f, companion2, i3, new Color.Solid(i5)), null, null, false, null, false, 62), new TextClause(dVar.f199509b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532676600));
            }
            arrayListG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("OTHER_DOCUMENTS_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.terms.api.R$string.terms_accepted_other_documents_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        List[] elements = {arrayList, arrayListG};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new tre.g(w.u(kotlin.collections.d.L(elements)));
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        tt4.d content = (tt4.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        tt4.e eVar = content.f274209a;
        dj0.d dVar = eVar.f274212a;
        NavBarLargeCentred.Model model = new NavBarLargeCentred.Model(new com.revolut.core.ui_kit.views.navbar.l(sx4.f.b(3, null, null, dVar), x1.LARGE), sx4.f.b(3, null, null, dVar), null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_hub_manage_screen_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 980);
        aim.e eVarB = u.b();
        dj0.d dVar2 = eVar.f274212a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_document_search, null, null, 6), null, null, false, null, false, 62);
        MoneyClause moneyClause = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_hub_manage_screen_item_approved_limit_subtitle, null, null, 14);
        i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        RowDelegate.Model model2 = new RowDelegate.Model("ID_APPROVED_LIMIT_ITEM", image40, moneyClause, null, 0, textLocalisedClause, null, null, 0, new tf(i.a(resourceImage)), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.l(model2, R$attr.uikit_dp40, 0, 0, 0, null, false, 62);
        eVarB.add(model2);
        tt4.f fVar = eVar.f274213b;
        qv0.i[] elements = {fVar == null ? null : new RowDelegate.Model("ID_SPENDING_LIMIT_ITEM", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_limit, null, null, 6), null, ProgressStyle.Companion.c(ProgressStyle.INSTANCE, fVar.f274215b, R$attr.uikit_colorAccent), false, null, false, 58), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_hub_manage_screen_item_spending_limit_title, null, null, 14), null, 0, sx4.f.b(3, null, null, fVar.f274214a), null, null, 0, new tf(i.a(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800), new RowDelegate.Model("ID_MORE_ABOUT_LIMIT_ITEM", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_help_chat, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_hub_manage_screen_item_info_title, null, null, 14), null, 0, null, null, null, 0, new tf(i.a(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        return new o(model, u.a(eVarB));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        b9 b9Var;
        n0 n0Var;
        int i;
        ttk.a content = (ttk.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        j0 j0Var = content.f274435a;
        float fI0 = mra.d.i0(j0Var);
        int[] iArr = ttk.b.f274436a;
        int i2 = iArr[j0Var.ordinal()];
        if (i2 == 1 || i2 == 2) {
            b9Var = b9.POSITIVE;
        } else if (i2 == 3) {
            b9Var = b9.NEUTRAL;
        } else {
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            b9Var = b9.NEGATIVE;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_strong_sell, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_sell, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_hold, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_buy, null, null, 14);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_strong_buy, null, null, 14);
        int i3 = iArr[j0Var.ordinal()];
        if (i3 == 1) {
            n0Var = n0.RIGHT;
        } else if (i3 == 2) {
            n0Var = n0.RIGHT_TOP;
        } else if (i3 == 3) {
            n0Var = n0.TOP;
        } else if (i3 == 4) {
            n0Var = n0.LEFT_TOP;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            n0Var = n0.LEFT;
        }
        o0 o0Var = new o0(fI0, b9Var, textLocalisedClause, textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, textLocalisedClause5, n0Var);
        int i5 = iArr[j0Var.ordinal()];
        if (i5 == 1) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_strong_buy;
        } else if (i5 == 2) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_buy;
        } else if (i5 == 3) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_hold;
        } else if (i5 == 4) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_sell;
        } else {
            if (i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_ratings_recommendation_strong_sell;
        }
        List listC = u.c(new c4("analyst-ratings-big-gauge", o0Var, new TextLocalisedClause(i, null, null, 14)));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        ld6.f context = (ld6.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(context instanceof ld6.c)) {
            return f0.f322471a;
        }
        wi0.b bVar = ((ld6.c) context).f194034a;
        wi0.b.Companion.getClass();
        if (!Intrinsics.f(bVar, wi0.b.f297734c)) {
            return f0.f322471a;
        }
        ej ejVar = new ej("CANCELLATION_DIALOG_DISCLAIMER_ITEM_ID", new c7(new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_refund_breakdown_footer, null, null, 14), false, null, 6));
        yp0.b.r(ejVar, 0, 0, 0, 0, 15);
        return u.c(ejVar);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        j content = (j) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return zBooleanValue ? f0.f322471a : content.f276680a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0753 A[PHI: r16
      0x0753: PHI (r16v19 char) = 
      (r16v10 char)
      (r16v10 char)
      (r16v11 char)
      (r16v11 char)
      (r16v12 char)
      (r16v12 char)
      (r16v13 char)
      (r16v13 char)
      (r16v14 char)
      (r16v14 char)
      (r16v15 char)
      (r16v15 char)
      (r16v16 char)
      (r16v16 char)
      (r16v17 char)
      (r16v17 char)
      (r16v18 char)
      (r16v18 char)
      (r16v21 char)
      (r16v21 char)
     binds: [B:219:0x0831, B:221:0x0835, B:214:0x0815, B:216:0x0819, B:209:0x07f9, B:211:0x07fd, B:204:0x07df, B:206:0x07e3, B:199:0x07c4, B:201:0x07c8, B:194:0x07a9, B:196:0x07ad, B:189:0x078e, B:191:0x0792, B:184:0x0773, B:186:0x0777, B:179:0x0758, B:181:0x075c, B:173:0x0722, B:175:0x0726] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0887 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 3560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr8.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f265137a = i;
    }
}
