package ri4;

import android.os.Parcelable;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import aw0.o9;
import aw0.r2;
import aw0.r9;
import aw0.t0;
import aw0.x4;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxRewardInfo;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$InputData;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeAmount;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeDetails;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeRate;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.store.api.model.StoreCampaignBadge;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreInstructionList;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.retail.feature.stockdetails.impl.ui.delegates.call_date.CallDateWidgetContract$WidgetParcel;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.config.Links;
import hha.s;
import ip0.ej;
import ip0.o6;
import ip0.pl;
import ip0.q6;
import ip0.qc;
import ip0.tc;
import ip0.xc;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jel.b0;
import jel.h1;
import jel.m1;
import jel.q;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import m1c.r1;
import mel.i0;
import mx0.v5;
import pcd.e0;
import pcd.g0;
import pvk.y;
import rrj.w;
import rrj.x;
import tof.i3;
import tx0.k0;
import whf.j;
import z0h.c0;
import z0h.m0;
import z0h.q1;
import z0h.t1;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f254554b;

    public /* synthetic */ o(int i, Object obj2, boolean z, Object obj3) {
        this.f254553a = i;
        this.f254554b = obj2;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        rna.k kVar = (rna.k) this.f254554b;
        AppTheme content = (AppTheme) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.profile_appearance_theme_title, null, null, 14);
        vjg.g gVar = kVar.f255546a;
        int i = rna.j.f255545a[content.f94562b.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.profile_appearance_theme_system, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.profile_appearance_theme_night, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.profile_appearance_theme_day, null, null, 14);
        }
        return new RowDelegate.Model("THEME_SWITCHER_ID", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), textLocalisedClause2, null, 0, ((gwl.d) gVar).f().size() > 1 ? new CompositeClause(v.k(textLocalisedClause, new DotDividerClause((Integer) null), content.f94561a.getF94526a()), null, null, null, 14) : new CompositeClause(v.k(gVar.b(content.f94563c), new DotDividerClause((Integer) null), textLocalisedClause), null, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.LinkedHashMap] */
    private final Object b(Object obj2, Object obj3, Object obj4) {
        Map mapG;
        Clause textLocalisedClause;
        RowDelegate.Model model;
        rob.p pVar = (rob.p) this.f254554b;
        rob.d content = (rob.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = content.f255950a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : arrayList) {
            pcd.b bVar = ((SavingsAccountDetails) obj5).f86460a.f234889n;
            Object arrayList2 = linkedHashMap.get(bVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(bVar, arrayList2);
            }
            ((List) arrayList2).add(obj5);
        }
        List list = (List) linkedHashMap.get(pcd.b.PERSONAL);
        Collection collectionA = list != null ? pVar.a(list, content) : f0.f322471a;
        List list2 = (List) linkedHashMap.get(pcd.b.PERSONAL_JOINT);
        Collection collectionA2 = list2 != null ? pVar.a(list2, content) : f0.f322471a;
        List list3 = (List) linkedHashMap.get(pcd.b.PERSONAL_UNDER_18);
        if (list3 != null) {
            mapG = new LinkedHashMap();
            for (Object obj6 : list3) {
                String str = ((SavingsAccountDetails) obj6).f86460a.f;
                Object objO = mapG.get(str);
                if (objO == null) {
                    objO = v0.a.o(mapG, str);
                }
                ((List) objO).add(obj6);
            }
        } else {
            mapG = 0;
        }
        if (mapG == 0) {
            mapG = r0.g();
        }
        Collection collection = collectionA;
        boolean z = true;
        if (collection.isEmpty() && collectionA2.isEmpty() && mapG.size() <= 1) {
            z = false;
        }
        RowDelegate.Model model2 = new RowDelegate.Model("SECTION_TITLE_" + pcd.b.PERSONAL, null, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_sheets_choose_account_section_personal, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        if (collection.isEmpty() || (collectionA2.isEmpty() && mapG.isEmpty())) {
            model2 = null;
        }
        ArrayList arrayListE0 = d0.E0(collectionA, u.c(model2));
        RowDelegate.Model model3 = new RowDelegate.Model("SECTION_TITLE_" + pcd.b.PERSONAL_JOINT, null, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_sheets_choose_account_section_joint, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        if (collectionA2.isEmpty()) {
            model3 = null;
        }
        ArrayList arrayListE02 = d0.E0(collectionA2, u.c(model3));
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : mapG.entrySet()) {
            String str2 = (String) entry.getKey();
            List list4 = (List) entry.getValue();
            String str3 = (String) content.d.get(str2);
            ArrayList arrayListA = pVar.a(list4, content);
            String str4 = "SECTION_TITLE_" + pcd.b.PERSONAL_UNDER_18 + "_" + str2;
            if (str3 != null) {
                textLocalisedClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                model = null;
            } else {
                model = null;
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_sheets_choose_account_section_teen, null, null, 14);
            }
            a0.x(d0.E0(arrayListA, u.c((arrayListA.isEmpty() || !z) ? model : new RowDelegate.Model(str4, null, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906))), arrayList3);
        }
        return d0.Z(d0.E0(arrayList3, d0.E0(arrayListE02, arrayListE0)));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model modelA;
        Clause textClause;
        int i;
        x xVar = (x) this.f254554b;
        thf.c cVar = xVar.f256881b;
        rrj.c content = (rrj.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List listA = xVar.f256880a.a(content.f256851a, true);
        rrj.a aVar = content.f256853c;
        ActionsView.Item item = null;
        if (aVar != null) {
            modelA = xVar.f256882c.a(srj.c.a(aVar.f256845a, aVar.f256846b, aVar.f256847c));
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        } else {
            modelA = null;
        }
        if (modelA != null) {
            listA = i2b.a.q(modelA, listA);
        }
        rrj.b bVar = content.f256852b;
        dj0.d dVar = bVar.f256848a;
        i3 i3Var = bVar.f256850c;
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
        if (i3Var == null) {
            int i2 = w.f256879a[bVar.f256849b.ordinal()];
            if (i2 == 1) {
                i = com.revolut.feature.spending_analytics.api.R$string.analytics_banner_spent;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.spending_analytics.api.R$string.analytics_banner_spent_weekly;
            }
            textClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        } else {
            textClause = new TextClause(((wjf.e) cVar).k(i3Var), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        }
        LayeredImage layeredImageI = i3Var != null ? ((wjf.e) cVar).i(i3Var, null, null) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorGrey50, 14.0f, null, null, 48);
        Clause clause = textClause;
        if (bVar.d) {
            item = new ActionsView.Item("ACTION_ADJUST_ANALYTICS", null, false, null, null, new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_action_adjust_for_analytics, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670);
        }
        return new rrj.j(listA, new rrj.g(moneyClause, clause, layeredImageI, v.l(item)));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        LocalDate localDate;
        dj0.d dVar;
        rsk.k kVar = (rsk.k) this.f254554b;
        jel.c content = (jel.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(content instanceof jel.m)) {
            if ((content instanceof h1) || (content instanceof jel.n) || (content instanceof q) || (content instanceof w2) || (content instanceof b0) || (content instanceof m1)) {
                return f0.f322471a;
            }
            throw new NoWhenBranchMatchedException();
        }
        jel.m mVar = (jel.m) content;
        jel.d dVar2 = mVar.i;
        if (dVar2 != null && (localDate = dVar2.d) != null && (dVar = dVar2.f173429c) != null) {
            LocalDate localDateE = ((l80.f) kVar.f257120a).e();
            boolean z = localDate.isAfter(localDateE) || localDate.isEqual(localDateE);
            if (!dVar2.f173427a || !z) {
                return f0.f322471a;
            }
            int i = com.revolut.retail.wealth.resources.R$string.trading_bonds_callability_widget_title;
            long jP = ebm.a.P(localDate);
            TimeClause.Format.INSTANCE.getClass();
            TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
            List listC = u.c(new ActionWidgetDelegate.Model("CALL_DATE_WIDGET_LIST_ID", new TextLocalisedClause(i, u.c(new TimeClause(jP, dateMedium, null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_callability_widget_subtitle, u.c(new TimeClause(ebm.a.P(localDate), dateMedium, null, null, 12)), null, 12), new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D026", null, null, null, 30), (NewBadgeContent) null, (CircleBadgeModel) null, (ProgressStyle) null), new ActionWidgetDelegate.Model.b.a(null), ActionWidgetDelegate.Model.a.C0393a.f51604a, null, new CallDateWidgetContract$WidgetParcel(mVar.f173499b, localDate, dVar), null, true, 5952));
            yp0.b.k(listC, R$attr.uikit_dp16, 0, 0, 0, 30);
            return listC;
        }
        return f0.f322471a;
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        ruk.w wVar = (ruk.w) this.f254554b;
        t1 disclaimersData = (t1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        q1 q1Var = wVar.f257624b;
        Links links = disclaimersData.f318563a;
        hel.b bVar = disclaimersData.f318564b;
        return ((aah.m) q1Var).c(u.c(new c0(links, bVar)), bVar);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        ruk.a0 a0Var = (ruk.a0) this.f254554b;
        t1 disclaimersData = (t1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        q1 q1Var = a0Var.f257592a;
        Links links = disclaimersData.f318563a;
        hel.b bVar = disclaimersData.f318564b;
        return ((aah.m) q1Var).c(u.c(new z0h.d0(links, bVar)), bVar);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.b bVar = (com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.b) this.f254554b;
        rv6.p planDetails = (rv6.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
        aim.e eVarB = u.b();
        jv6.b bVar2 = bVar.f73758a;
        rr6.j cashbackInfo = planDetails.f257706a;
        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("LIST_ID_CASHBACK_PLAN_NEXT_PAYOUT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_plan_widget_title, null, null, 14), new t4(new MoneyClause(cashbackInfo.f256715b.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_plan_widget_subtitle, u.c(new TimeClause(oi0.d.R(cashbackInfo.f256715b.f256731c), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12), false, null, null, 0, 0, 0, 0, 2032);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        List cashbackPlansToUpgrade = planDetails.f257708c;
        int i = 6;
        if (!cashbackPlansToUpgrade.isEmpty()) {
            Intrinsics.checkNotNullParameter(cashbackPlansToUpgrade, "cashbackPlansToUpgrade");
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_boost_cashback_title, null, null, 14);
            List list = cashbackPlansToUpgrade;
            if ((list instanceof Collection) && list.isEmpty()) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_boost_cashback_subtitle, null, null, 14);
                ActionWidgetDelegate.Model model2 = new ActionWidgetDelegate.Model("LIST_ID_CASHBACK_PLAN_UPGRADE_PLAN", textLocalisedClause2, textLocalisedClause, new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D125", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_boost_cashback_action_upgrade, null, null, 14), null, false), null, null, null, false, 8144);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model2);
            } else {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (s.o(((rr6.n) it8.next()).f256725b)) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_boost_cashback_private_subtitle, null, null, 14);
                        break;
                    }
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_boost_cashback_subtitle, null, null, 14);
                ActionWidgetDelegate.Model model22 = new ActionWidgetDelegate.Model("LIST_ID_CASHBACK_PLAN_UPGRADE_PLAN", textLocalisedClause2, textLocalisedClause, new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D125", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_boost_cashback_action_upgrade, null, null, 14), null, false), null, null, null, false, 8144);
                yp0.b.l(model22, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model22);
            }
        }
        eVarB.addAll(bVar2.b(planDetails.f, 3));
        whf.p transactions = planDetails.e;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        eVarB.addAll(bVar2.a(transactions, 3, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_booster_transactions_header_title, null, null, 14), "LIST_ID_TRANSACTION_HEADER_ITEM"));
        BigDecimal bigDecimal = planDetails.d;
        boolean z = false;
        boolean z3 = false;
        eVarB.addAll(yp0.b.g(v.k(new RowDelegate.Model("LIST_ID_CASHBACK_PLAN_HOW_IT_WORKS_1", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorBackground), null, 8), z, z, i), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_how_it_works_pay_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_how_it_works_pay_subtitle, u.c(bigDecimal != null ? new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LIST_ID_CASHBACK_PLAN_HOW_IT_WORKS_2", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorBackground), null, 8), z3, z3, i), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_how_it_works_receive_cashback_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_how_it_works_receive_cashback_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)), new ListSubheaderDelegate.Model("LIST_ID_CASHBACK_PLAN_HOW_IT_WORKS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_how_it_works_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, R$attr.uikit_dp0, 0, 0, 53242), null, 0, 0, 126));
        TextDelegate.Model model3 = new TextDelegate.Model(R$attr.uikit_dp24, 0, 956, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_terms_and_conditions_footer, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_plan_terms_and_conditions_action_terms, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LIST_ID_CASHBACK_PLAN_TERMS_CONDITIONS_CLAUSE", false), 10)), null, 12), "LIST_ID_CASHBACK_PLAN_TERMS_CONDITIONS");
        yp0.b.r(model3, R$attr.uikit_dp0, 0, 0, 0, 14);
        eVarB.add(model3);
        return u.a(eVarB);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        List list;
        rva.h hVar = (rva.h) this.f254554b;
        tva.a aVar = (tva.a) obj2;
        ((Boolean) obj3).getClass();
        whf.p pVar = aVar != null ? aVar.f274740b : null;
        return yp0.b.g((pVar == null || (list = pVar != null ? pVar.f297646a : null) == null || list.isEmpty()) ? u.c(new RowDelegate.Model("EMPTY_ITEM_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(com.revolut.feature.recurringbuys.api.R$string.wealthcore_recurringbuys_details_transactions_empty_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737708)) : ((anf.w) hVar.f257740a).c(pVar, new whf.l(0), j.a.f297643a), rva.h.a(aVar), null, R$attr.uikit_dp0, R$attr.uikit_dp16, 114);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) throws Throwable {
        rvk.b bVar = (rvk.b) this.f254554b;
        mel.f content = (mel.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        pl plVar = new pl(mra.d.m0(content.f204744a.f204737a, r9.FIVE, 1));
        TextLocalisedClause textLocalisedClauseM = mra.d.M(content.f204744a.f204737a, null);
        y yVar = y.f240308a;
        r2 r2Var = new r2(textLocalisedClauseM, rvk.e.a(yVar));
        k0 k0Var = k0.MEDIUM;
        HeaderDelegate.Model model = new HeaderDelegate.Model("analyst-ratings-header-list-id", plVar, r2Var, null, null, bVar.f257784a.a(content.f204746c), null, HeaderDelegate.a.C0407a.f52418a, new pvk.w(yVar), k0Var, null, 90864);
        model.f52412x = R$attr.uikit_dp16;
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) throws Throwable {
        rvk.d dVar = (rvk.d) this.f254554b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.f186385a;
        mel.m mVar = (mel.m) pair.f186386b;
        pvk.c0 c0Var = new pvk.c0(str);
        pl plVar = new pl(mif.a.W(mVar.f204764a));
        r2 r2Var = new r2(mif.a.Y(mVar.f204764a, null), rvk.e.a(c0Var));
        k0 k0Var = k0.MEDIUM;
        HeaderDelegate.Model model = new HeaderDelegate.Model("index-sentiment-header-list-id", plVar, r2Var, null, null, dVar.f257785a.a(mVar.f204766c), null, HeaderDelegate.a.C0407a.f52418a, new pvk.w(c0Var), k0Var, null, 90864);
        model.f52412x = R$attr.uikit_dp16;
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) throws Throwable {
        rvk.g gVar = (rvk.g) this.f254554b;
        i0 content = (i0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        pl plVar = new pl(mif.a.W(content.f204755a));
        TextLocalisedClause textLocalisedClauseY = mif.a.Y(content.f204755a, null);
        pvk.d0 d0Var = pvk.d0.f240270a;
        r2 r2Var = new r2(textLocalisedClauseY, rvk.e.a(d0Var));
        k0 k0Var = k0.MEDIUM;
        HeaderDelegate.Model model = new HeaderDelegate.Model("technical-insights-header-list-id", plVar, r2Var, null, null, gVar.f257786a.a(content.d), null, HeaderDelegate.a.C0407a.f52418a, new pvk.w(d0Var), k0Var, null, 90864);
        model.f52412x = R$attr.uikit_dp16;
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        ry5.f fVar = (ry5.f) this.f254554b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int i = 14;
        if (content.isEmpty() && fVar.f258228b.length() > 0) {
            List listC = u.c(new FullScreenStateDelegate.Model("SEARCH_EMPTY_ITEM_ID", new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_assets_search_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_assets_search_empty_state_description, u.c(fVar.f258228b), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32672));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        List<Pair> list = content;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Pair pair : list) {
            CurrencyImage currencyImage = new CurrencyImage(((xi0.b) pair.f186385a).f306286a, (ImageTransformations) null, (TextLocalisedClause) null, i);
            xi0.b bVar = (xi0.b) pair.f186386b;
            PairedImage pairedImage = new PairedImage(currencyImage, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, i), R$attr.uikit_colorWidgetBackground, null);
            xi0.b bVar2 = (xi0.b) pair.f186385a;
            arrayList.add(new RowDelegate.Model("ASSET_LIST_ID_" + pair, pairedImage, null, null, new CompositeClause(v.k(ix0.d0.a(bVar2, null), ix0.d0.a(bVar, null)), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.crypto_currency_chooser_entry_subtitle, v.k(new CurrencyClause(bVar2, null, null, 6), new CurrencyClause(bVar, null, null, 6)), null, 12), null, null, 0, null, false, false, null, null, null, null, null, pair, null, 0, 0, 0, 0, 1056964460));
            i = 14;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        rya.a aVar = (rya.a) this.f254554b;
        pwa.g inviteSummary = (pwa.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(inviteSummary, "inviteSummary");
        return tya.c.d(inviteSummary.f240359b, inviteSummary.f240358a, aVar.f258266a.f81888b);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.b bVar = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.b) this.f254554b;
        ActiveOrPastInvitesInfo content = (ActiveOrPastInvitesInfo) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        TextLocalisedClause textLocalisedClauseB = bVar.b();
        ArrayList arrayList = new ArrayList();
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = content.f81707c;
        MaxRewardInfo maxRewardInfo = content.d;
        InvitesListContract$InputData invitesListContract$InputData = bVar.f81902a;
        arrayList.addAll(tya.c.d(activeOrPastInvitesRewardInfo, maxRewardInfo, invitesListContract$InputData.f81888b));
        ArrayList arrayListA = bVar.f81903b.a(bVar.a(), content.f81705a, invitesListContract$InputData.f81888b);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        arrayList.addAll(arrayListA);
        InvitesListContract$InputData.InviteMoreState inviteMoreState = invitesListContract$InputData.f81889c;
        TextLocalisedClause textLocalisedClause = null;
        if (inviteMoreState instanceof InvitesListContract$InputData.InviteMoreState.Enabled) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.shared.referrals.ui.impl.R$string.referrals_invite_list_footer_button, null, null, 14);
        } else if (!Intrinsics.f(inviteMoreState, InvitesListContract$InputData.InviteMoreState.Disabled.f81890a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new rya.i(textLocalisedClauseB, textLocalisedClause, arrayList);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        Object next;
        xi0.b bVar;
        RevPointsTransaction revPointsTransaction;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails;
        RevPointsTransactionExchangeRate revPointsTransactionExchangeRate;
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount;
        dj0.d dVar;
        s0c.c cVar = (s0c.c) this.f254554b;
        List relatedLoyaltyTransactions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(relatedLoyaltyTransactions, "relatedLoyaltyTransactions");
        xi0.b bVar2 = cVar.f258929c;
        if (bVar2 == null) {
            return new lw0.h(lw0.i.TITLE_SUBTITLE);
        }
        Iterator it8 = relatedLoyaltyTransactions.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails2 = ((r1) next).f201449a.f84063p;
            if ((revPointsTransactionExchangeDetails2 != null ? revPointsTransactionExchangeDetails2.f84067a : null) != null) {
                break;
            }
        }
        r1 r1Var = (r1) next;
        if (r1Var == null || (revPointsTransaction = r1Var.f201449a) == null || (revPointsTransactionExchangeDetails = revPointsTransaction.f84063p) == null || (revPointsTransactionExchangeRate = revPointsTransactionExchangeDetails.f84067a) == null || (revPointsTransactionExchangeAmount = revPointsTransactionExchangeRate.f84071b) == null || (dVar = revPointsTransactionExchangeAmount.f84065a) == null || (bVar = dVar.f115083b) == null) {
            xi0.b.Companion.getClass();
            bVar = xi0.b.f306273h;
        }
        return new lw0.a(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_related_transactions_title, null, null, 14), !bVar2.equals(bVar) ? new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_related_transactions_description, u.c(new CurrencyClause(bVar, null, null, 6)), null, 12) : new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_related_transactions_description_short, null, null, 14), null, null, false, 28);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$5((CoreTextFieldSemanticsModifierNode) this.f254554b, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Boolean) obj4).booleanValue()));
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        s1k.k kVar = (s1k.k) this.f254554b;
        List vaults = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        if (vaults.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("VAULT_TITLE", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.payment_options.impl.R$string.payment_options_screen_section_vaults_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List<pcd.s> list = vaults;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (pcd.s sVar : list) {
            String str = sVar.f234881a;
            g0 g0Var = sVar.f234885h;
            String strQ = j6.a.q("VAULT_ITEM_", str);
            LayeredImage layeredImageJ = w0.j(sVar);
            TextClause textClause = new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(g0Var.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4), null, null, false, 126);
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            arrayList.add(new RowDelegate.Model(strQ, layeredImageJ, null, null, textClause, g0Var instanceof e0 ? pbd.a.d(kVar.f259156a, sVar.i().e, null, 6) : null, null, null, 0, bVar, false, false, null, null, null, null, null, sVar, null, 0, 0, 0, 0, 1056962412));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return ue0.e.J(model, arrayList);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        s1k.d dVar = (s1k.d) this.f254554b;
        dj0.d currentBalance = (dj0.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(currentBalance, "currentBalance");
        if (!dVar.f259147a.f(currentBalance)) {
            return f0.f322471a;
        }
        dj0.d dVar2 = dVar.f259147a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.payment_options.impl.R$string.payment_options_screen_section_payment_info_due_payment_title, null, null, 14);
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        List listK = v.k(new CellDetailsDelegate.Model("DUE_AMOUNT", textLocalisedClause, new MoneyClause(dVar2, defaults, null, o9Var, 4), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("CURRENT_BALANCE", new TextLocalisedClause(com.revolut.retail.feature.payment_options.impl.R$string.payment_options_screen_section_payment_info_current_balance_title, null, null, 14), new MoneyClause(currentBalance, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("AMOUNT_TO_ADD", new TextLocalisedClause(com.revolut.retail.feature.payment_options.impl.R$string.payment_options_screen_section_payment_info_amounts_difference_title, null, null, 14), new MoneyClause(pyd.c.H(dVar.f259147a, currentBalance), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        s2e.e eVar = (s2e.e) this.f254554b;
        StoreCampaignOffer discountCampaign = (StoreCampaignOffer) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(discountCampaign, "discountCampaign");
        StoreMegaOffer storeMegaOffer = (StoreMegaOffer) eVar.f259291a.getContent();
        String str = storeMegaOffer != null ? storeMegaOffer.f88552j : null;
        aim.e eVarB = u.b();
        RowDelegate.Model modelA = o2e.b.a("STORE_BRAND_DETAIL_DISCOUNT_PROMO_CODE_BANNER_ID", new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_banner_earn_promo_code_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_banner_earn_promo_code_subtitle, null, null, 14), R$drawable.uikit_icn_24_price_tag, discountCampaign, str);
        int i = R$attr.uikit_dp0;
        yp0.b.l(modelA, i, i, 0, 0, null, false, 60);
        eVarB.add(modelA);
        StoreCampaignBadge storeCampaignBadge = discountCampaign.f88455n;
        TagViewData tagViewDataA = storeCampaignBadge != null ? k3e.d.a(storeCampaignBadge) : null;
        q6 q6Var = tagViewDataA != null ? new q6("STORE_BRAND_DETAIL_DISCOUNT_REWARD_RATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_campaign_info_reward_title, null, null, 14), new o6(tagViewDataA)) : null;
        String str2 = discountCampaign.f88452j;
        Object[] elements = {q6Var, str2 != null ? new PlainTextDelegate.Model("STORE_BRAND_DETAIL_DISCOUNT_DESCRIPTION_LIST_ID", (Clause) null, (Clause) new TextClause(str2, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422) : null, new CellDetailsDelegate.Model("STORE_BRAND_DETAIL_DISCOUNT_AVAILABLE_LIST_ID", new t0((Clause) new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_campaign_info_availability_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_campaign_info_availability_option_online, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        int i2 = R$attr.uikit_dp16;
        yp0.b.k(listL, i2, i2, 0, 0, 28);
        eVarB.addAll(listL);
        StoreInstructionList storeInstructionList = discountCampaign.B;
        eVarB.addAll(o2e.d.a("STORE_BRAND_DETAIL_DISCOUNT_INSTRUCTIONS_SUBHEADER_ID", "STORE_BRAND_DETAIL_DISCOUNT_INSTRUCTION_", storeInstructionList != null ? storeInstructionList.f88528a : null));
        ej ejVarA = o2e.a.a(eVar.f259293c);
        if (ejVarA != null) {
            eVarB.add(ejVarA);
        }
        return new s2e.h(u.a(eVarB));
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        s4f.s sVar = (s4f.s) this.f254554b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        xzg.k kVar = (xzg.k) pair.f186385a;
        m0 m0Var = (m0) pair.f186386b;
        if ((kVar instanceof xzg.l) && m0Var.f318534b == hel.b.EEA) {
            sVar.getClass();
            s4f.s.Companion.getClass();
            return u.c((TextDelegate.Model) s4f.s.f259866b.getValue());
        }
        return ((aah.m) sVar.f259867a).c(u.c(m0Var), m0Var.f318534b);
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        s6b.g gVar = (s6b.g) this.f254554b;
        r5b.e linkAccountInfo = (r5b.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        return w6b.e.a(linkAccountInfo.d, gVar.f260197a, gVar.f260198b, gVar.d);
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        s87.d dVar = (s87.d) this.f254554b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List listK = null;
        if ((!content.isEmpty() ? content : null) != null) {
            ListSubheaderDelegate.Model modelA = s87.d.a();
            gg.b bVar = new gg.b(true, 2);
            List<k77.p> list = content;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (k77.p pVar : list) {
                String strQ = j6.a.q("region_container_", pVar.f181845b);
                tc tcVar = new tc(qc.f165962a);
                String str = pVar.f181845b;
                RowDelegate.Model model = new RowDelegate.Model(j6.a.q("region_header_", str), new RowDelegate.Model.MainImage.Image40(new CountryImage(pVar.f181846c, (Integer) null, (ez0.e) null, 14), null, null, false, null, false, 62), new TextClause(pVar.f181844a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                s87.g gVar = dVar.f260924a;
                List listK2 = v.k(gVar.a(str, s87.e.GDP, pVar.d), gVar.a(str, s87.e.INFLATION_RATE, pVar.f), gVar.a(str, s87.e.INTEREST_RATE, pVar.f181847g), gVar.a(str, s87.e.RETAIL_SALES, pVar.e), gVar.a(str, s87.e.UNEMPLOYMENT, pVar.f181848h), gVar.a(str, s87.e.CONSUMER_CONFIDENCE, pVar.i));
                i26.l.E(listK2);
                ArrayList arrayListJ = ue0.e.J(model, listK2);
                int i = R$attr.uikit_dp0;
                yp0.b.k(arrayListJ, i, i, i, i, 16);
                arrayList.add(new xc(strQ, arrayListJ, 0, tcVar, null, 0, 0, 0, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
            }
            listK = v.k(modelA, new hg("economic_indicators_scroller", arrayList, 1, x4.c.f10604a, null, bVar, false, false, null, null, 0, 0, 0, 0, 32720));
        }
        return listK == null ? f0.f322471a : listK;
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        s8h.m mVar = (s8h.m) this.f254554b;
        InvestTransaction transaction = (InvestTransaction) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        WealthAccountType accountType = transaction.getF85125a().b();
        oc.f fVar = mVar.f261022b;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return fVar.a(accountType).a().b(transaction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07e9  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v38, types: [com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations] */
    /* JADX WARN: Type inference failed for: r7v48 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r70, java.lang.Object r71, java.lang.Object r72) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri4.o.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f254553a = i;
        this.f254554b = obj2;
    }

    public /* synthetic */ o(Object obj2, Object obj3, int i) {
        this.f254553a = i;
        this.f254554b = obj3;
    }
}
