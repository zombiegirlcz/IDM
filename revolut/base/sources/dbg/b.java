package dbg;

import android.os.Parcelable;
import android.text.InputFilter;
import aw0.c7;
import aw0.e5;
import aw0.k7;
import aw0.ka;
import aw0.n6;
import aw0.o9;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.R$plurals;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchResponse;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import dkb.j;
import dkb.k;
import dt4.l;
import dt4.m;
import dt4.r;
import dz7.q;
import e94.n;
import h93.f0;
import ip0.ak0;
import ip0.bk0;
import ip0.ck0;
import ip0.cp0;
import ip0.es;
import ip0.re0;
import ip0.ue0;
import ip0.vj0;
import ip0.we0;
import ip0.wi;
import ip0.xh0;
import ip0.xo0;
import ip0.yj0;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mel.e0;
import o97.y;
import ql4.s;
import qv0.o;
import v30.g0;
import whf.p;
import z0d.t;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112744b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f112743a = i;
        this.f112744b = obj2;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        vj0 vj0Var;
        int i;
        dkb.d dVar = (dkb.d) this.f112744b;
        SavingsChallengeOnboarding onboarding = (SavingsChallengeOnboarding) obj2;
        ((Boolean) obj3).getClass();
        j.a aVar = j.Companion;
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        int i2 = dVar.f115495b;
        List list = dVar.f115496c;
        SavingsChallenge savingsChallenge = onboarding.f83099a;
        dj0.d dVar2 = (dj0.d) d0.e0(i2, list);
        if (dVar2 == null) {
            dVar2 = (dj0.d) d0.m0(list);
        }
        dj0.d dVar3 = dVar2;
        s0 s0Var = new s0(6);
        List list2 = j.f115500a;
        String str = (String) d0.e0(i2, list2);
        if (str == null) {
            str = (String) d0.m0(list2);
        }
        String str2 = str;
        List list3 = j.f115501b;
        String str3 = (String) d0.e0(i2, list3);
        if (str3 == null) {
            str3 = (String) d0.m0(list3);
        }
        we0 we0Var = new we0("VIDEO_ITEM_ID", new ue0(new UrlVideo(str2, str3, false, oz0.b.CENTER_CROP, false, oz0.c.ENABLED, 48), new re0(1, 1)));
        int i3 = R$attr.uikit_dp64;
        yp0.b.r(we0Var, 0, 0, i3, i3, 3);
        s0Var.a(we0Var);
        int i5 = R$string.savings_challenge_onboarding_set_up_contribution_weekly;
        MoneyClause moneyClause = new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        long j2 = dVar3.f115082a;
        s0Var.a(new TextDelegate.Model("TITLE_ITEM_ID", new TextLocalisedClause(i5, u.c(moneyClause), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), false, new bk0(0), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908));
        int i6 = R$string.savings_challenge_onboarding_set_up_goal;
        MoneyClause moneyClause2 = new MoneyClause(dj0.d.c(dVar3, ChronoUnit.WEEKS.between(savingsChallenge.d, savingsChallenge.e) * j2, null, 2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        LocalDate localDate = savingsChallenge.e.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        s0Var.a(new TextDelegate.Model("SUBTITLE_ITEM_ID", new TextLocalisedClause(i6, v.k(moneyClause2, com.revolut.core.ui_kit.models.j.b(jVar, localDate, new LocalDateClause$DateFormat.MonthAndYear(ka.SHORT))), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908));
        dj0.d dVar4 = savingsChallenge.f83090g.f83094c;
        if (dVar4 == null) {
            vj0Var = null;
        } else {
            TagViewData tagViewData = new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_voucher, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedQuantityClause(R$plurals.savings_challenge_onboarding_set_up_prize_entries, Integer.valueOf((int) (j2 / dVar4.f115082a)), (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 12), new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorTransparent)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorForeground), false, null, null, null, 0, null, 2024);
            int i21 = R$attr.uikit_dp0;
            vj0Var = new vj0("TAG_ITEM_ID", tagViewData, false, null, i21, i21, 0, 0, 408);
        }
        s0Var.a(vj0Var);
        int size = list.size();
        int i22 = size - 1;
        es esVar = new es("SLIDER_ITEM_ID", new MoneyClause((dj0.d) list.get(i22), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause((dj0.d) list.get(i22 / 2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause((dj0.d) list.get(0), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, i22, i2, d0.d1(kotlin.ranges.f.o(0, size)), 1024);
        int i32 = R$attr.uikit_dp0;
        yp0.b.p(esVar, R$attr.uikit_dp16, R$attr.uikit_dp8, i32, i32);
        s0Var.a(esVar);
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("REWARDS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.savings_challenge_onboarding_set_up_rewards_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        ArrayList arrayList = onboarding.f83100b.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i33 = 0;
        for (Object obj5 : arrayList) {
            int i43 = i33 + 1;
            if (i33 < 0) {
                v.s();
                throw null;
            }
            SavingsChallengeOnboarding.Config.Reward reward = (SavingsChallengeOnboarding.Config.Reward) obj5;
            String strN = a0.d.n("REWARD_ITEM_ID_", i33);
            int i59 = k.f115502a[reward.f83109a.ordinal()];
            if (i59 == 1) {
                i = R$drawable.uikit_icn_24_calendar_recurring;
            } else {
                if (i59 != 2 && i59 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_gifts;
            }
            arrayList2.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextClause(reward.f83110b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(reward.f83111c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i33 = i43;
        }
        s0 s0Var2 = new s0(2);
        s0Var2.a(model);
        s0Var2.b(arrayList2.toArray(new RowDelegate.Model[0]));
        ArrayList arrayList3 = s0Var2.f186433a;
        List listK = v.k(arrayList3.toArray(new Object[arrayList3.size()]));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        s0Var.b(listK.toArray(new koi.j[0]));
        ArrayList arrayList4 = s0Var.f186433a;
        return new dkb.g(v.m(arrayList4.toArray(new koi.j[arrayList4.size()])), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0332  */
    /* JADX WARN: Type inference failed for: r20v10, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v6, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r20v8, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r22v10, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r54v0 */
    /* JADX WARN: Type inference failed for: r54v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r54v2 */
    /* JADX WARN: Type inference failed for: r60v0 */
    /* JADX WARN: Type inference failed for: r60v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r60v2 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r102, java.lang.Object r103, java.lang.Object r104) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dbg.b.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dbg.b.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.b bVar = (com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.b) this.f112744b;
        ru.k content = (ru.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        vu.g gVar = bVar.f64362c;
        CounterTextDelegate.Model model = null;
        if (!content.f257370a.k()) {
            n5j.b bVar2 = (n5j.b) gVar;
            CounterTextDelegate.Model model2 = new CounterTextDelegate.Model("HEADER_LIST_ID", new TextLocalisedClause(bVar2.b(vu.f.business_referrals_invitees_reward_counter_title), null, null, 14), new t4(new MoneyClause(content.f257370a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new TextLocalisedClause(bVar2.b(vu.f.business_referrals_invitees_reward_counter_subtitle), null, null, 14), false, null, null, 0, 0, 0, 0, 2032);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            model = model2;
        }
        if (model != null) {
            eVarB.add(model);
        }
        eVarB.addAll(((ws2.c) bVar.f64361b).e(content.f257371b));
        return u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model model;
        r rVar = (r) this.f112744b;
        dt4.e content = (dt4.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        l lVar = rVar.f117384c;
        aim.e eVarB = u.b();
        p pVar = content.e;
        wi0.b countryCode = content.d;
        List listA = rVar.f117383b.a(pVar);
        yp0.b.k(listA, 0, 0, 0, 0, 31);
        eVarB.addAll(listA);
        s selectedQuote = content.f117365b;
        int i = selectedQuote.f247179a;
        dj0.d dVar = selectedQuote.f247182g.f247176a;
        ql4.c cVar = selectedQuote.i;
        List list = content.f117364a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(((s) it8.next()).f247179a));
        }
        eVarB.addAll(cm4.l.a(rVar.f117382a, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_suggestion_split_in, null, null, 14), new TextLocalisedQuantityClause(com.revolut.feature.credit.core.R$plurals.credit_card_instalment_term_term_in_instalments, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24), i, arrayList, null, 48));
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("id_instalment_term_item_monthly_repayment", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_item_monthly_repayment, null, null, 14), sx4.f.b(3, null, null, dVar), null, null, false, 0, null, null, j2.H3, null, 0, null, false, null, 0, 0, 0, 0, 1047528);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("id_instalment_term_item_principal_amount", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_section_item_principal_amount, null, null, 14), sx4.f.b(3, null, null, content.f117366c), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("id_instalment_term_item_total_interest", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_section_item_total_interest, null, null, 14), sx4.f.b(3, null, null, selectedQuote.d), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("id_instalment_term_item_total_to_repay", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_section_item_total_amount, null, null, 14), sx4.f.b(3, null, null, selectedQuote.e), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.A;
        CellDetailsDelegate.Model model6 = !Intrinsics.f(countryCode, bVar) ? new CellDetailsDelegate.Model("id_instalment_term_item_interest", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_section_item_interest, null, null, 14), new TextClause(selectedQuote.f247180b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520) : null;
        if (cVar != null) {
            model = (Intrinsics.f(countryCode, bVar) || Intrinsics.f(countryCode, wi0.b.Y1)) ? null : new CellDetailsDelegate.Model("id_instalment_term_item_apr", bp4.g.b(countryCode), bp4.g.a(cVar.f247093a, countryCode), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
        } else {
            model = null;
        }
        CellDetailsDelegate.Model[] elements = {model3, model4, model5, model6, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        n14.e.b(eVarB, (cVar != null ? cVar.f247094b : null) == ql4.d.CAT ? new TextDelegate.Model("id_instalment_term_footer_cat", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_footer_vat, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036) : null);
        aim.e eVarA = u.a(eVarB);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_button, null, null, 14);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(selectedQuote, "selectedQuote");
        return new m(lVar, eVarA, new dt4.i(textLocalisedClause, Intrinsics.f(countryCode, wi0.b.f297756l) ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_footer_au, null, null, 14) : Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_footer_interest, u.c(selectedQuote.f247180b), null, 12) : Intrinsics.f(countryCode, wi0.b.Y1) ? null : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_term_footer, u.c(sx4.f.b(3, null, null, dVar)), null, 12)));
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        BigDecimal bigDecimal;
        duk.h hVar = (duk.h) this.f112744b;
        ytk.a aVar = hVar.f117994a;
        final mel.p content = (mel.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        e0 e0Var = content.e;
        List listB = (e0Var == null || (bigDecimal = e0Var.f204742a.f204776a) == null) ? null : ytk.a.b(ytk.b.a(bigDecimal, null), "sharpe-ratio-value", com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_sharpe_ratio_label, com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_sharpe_ratio_description);
        final int i = 0;
        List listC = aVar.c(new Function0() { // from class: duk.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                mel.u uVar;
                switch (i) {
                    case 0:
                        mel.g gVar = content.d;
                        if (gVar == null || (uVar = gVar.f204747a) == null) {
                            return null;
                        }
                        return uVar.f204776a;
                    case 1:
                        mel.g gVar2 = content.d;
                        if (gVar2 != null) {
                            return gVar2.f204750g;
                        }
                        return null;
                    default:
                        mel.g gVar3 = content.d;
                        if (gVar3 != null) {
                            return gVar3.f;
                        }
                        return null;
                }
            }
        }, "expected-annual-return-value", com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_expected_annual_return_label, com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_expected_annual_return_description, null);
        final int i2 = 1;
        List listC2 = aVar.c(new Function0() { // from class: duk.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                mel.u uVar;
                switch (i2) {
                    case 0:
                        mel.g gVar = content.d;
                        if (gVar == null || (uVar = gVar.f204747a) == null) {
                            return null;
                        }
                        return uVar.f204776a;
                    case 1:
                        mel.g gVar2 = content.d;
                        if (gVar2 != null) {
                            return gVar2.f204750g;
                        }
                        return null;
                    default:
                        mel.g gVar3 = content.d;
                        if (gVar3 != null) {
                            return gVar3.f;
                        }
                        return null;
                }
            }
        }, "risk-free-rate", com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_sharpe_ratio_risk_free_return_title, com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_sharpe_ratio_risk_free_return_description, null);
        final int i3 = 2;
        List listC3 = aVar.c(new Function0() { // from class: duk.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                mel.u uVar;
                switch (i3) {
                    case 0:
                        mel.g gVar = content.d;
                        if (gVar == null || (uVar = gVar.f204747a) == null) {
                            return null;
                        }
                        return uVar.f204776a;
                    case 1:
                        mel.g gVar2 = content.d;
                        if (gVar2 != null) {
                            return gVar2.f204750g;
                        }
                        return null;
                    default:
                        mel.g gVar3 = content.d;
                        if (gVar3 != null) {
                            return gVar3.f;
                        }
                        return null;
                }
            }
        }, "volatility", com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_sharpe_ratio_volatility_title, com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_sharpe_ratio_volatility_description, null);
        t1j.b bVar = hVar.f117995b;
        e0 e0Var2 = content.e;
        List[] elements = {listB, listC, listC2, listC3, bVar.g(e0Var2 != null ? e0Var2.f204742a : null, com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_sharpe_ratio_rank_description)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return w.u(kotlin.collections.d.L(elements));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        ac4.g gVar = (ac4.g) this.f112744b;
        List cards = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cards, "cards");
        List list = cards;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ou7.c) gVar.f3032c).a((f0) it8.next()));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        dx5.e eVar = (dx5.e) this.f112744b;
        xzg.k content = (xzg.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        xzg.m mVar = content instanceof xzg.m ? (xzg.m) content : null;
        if (mVar == null) {
            throw new IllegalStateException("Retrieved collection is not a collection with currencies");
        }
        qv0.i[] iVarArr = new qv0.i[5];
        iVarArr[0] = new CellDetailsDelegate.Model("BUY_COLLECTION_CONFIRMATION_AMOUNT_CELL_ID", new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_confirmation_screen_amount_cell_title, null, null, 14), new MoneyClause(eVar.f120871a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        CollectionQuote collectionQuote = eVar.f120872b;
        dj0.d dVar = collectionQuote.f95267c;
        iVarArr[1] = dVar.k() ? new CellDetailsDelegate.Model("BUY_COLLECTION_CONFIRMATION_FEE_CELL_ID", new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_confirmation_screen_fee_cell_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_fee_breakdown_dialog_no_fee_cell_title, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760) : new CellDetailsActionDelegate.Model("BUY_COLLECTION_CONFIRMATION_FEE_CELL_ID", new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_confirmation_screen_fee_cell_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
        iVarArr[2] = new CellDetailsDelegate.Model("BUY_COLLECTION_CONFIRMATION_AMOUNT_AFTER_FEE_CELL_ID", new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_confirmation_screen_amount_after_fee_cell_title, null, null, 14), new MoneyClause(collectionQuote.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_confirmation_screen_invest_cell_title, null, null, 14);
        int i = com.revolut.feature.cryptocommodity_invest.api.R$plurals.cryptocommodity_invest_collections_confirmation_screen_invest_cell_label_subset_plural;
        List list = eVar.d;
        if (list == null) {
            list = mVar.d;
        }
        iVarArr[3] = new CellDetailsDelegate.Model("BUY_COLLECTION_CONFIRMATION_INVEST_IN_CELL_ID", textLocalisedClause, new TextLocalisedQuantityClause(i, Integer.valueOf(list.size()), (List) null, (Style) null, 28), 0, null, null, null, null, null, false, 0, 0, 32760);
        iVarArr[4] = new CellDetailsDelegate.Model("BUY_COLLECTION_CONFIRMATION_AMOUNT_PER_CRYPTO_CELL_ID", new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_confirmation_screen_amount_per_crypto_cell_title, null, null, 14), new MoneyClause(collectionQuote.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        List listK = v.k(iVarArr);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        dj0.d dVar;
        Clause moneyClause;
        e5 e5Var;
        dyg.h hVar = (dyg.h) this.f112744b;
        jzg.a allocation = (jzg.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_title, null, null, 14);
        wi wiVar = hVar.f121112g;
        List list = allocation.f179809a;
        xi0.b bVar = hVar.f;
        WidgetisedAnalyticsType widgetisedAnalyticsType = hVar.f121109a;
        Object obj5 = (wiVar == null || (e5Var = wiVar.f167034b) == null) ? null : e5Var.f10292g;
        fyg.e eVar = obj5 instanceof fyg.e ? (fyg.e) obj5 : null;
        if (eVar != null) {
            moneyClause = new MoneyClause(eVar.f(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        } else {
            if (list.isEmpty()) {
                dVar = new dj0.d(0L, bVar);
            } else {
                dj0.d.Companion.getClass();
                dj0.d value = dj0.d.e;
                int i = 0;
                for (Object obj6 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    value = i == 0 ? ((wxg.m) obj6).getValue() : pyd.c.O(value, ((wxg.m) obj6).getValue());
                    i = i2;
                }
                dVar = value;
            }
            moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        boolean z = widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Cfd;
        if (z) {
            moneyClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(moneyClause, new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorForeground), (Float) null, (Float) null, 28)));
        }
        return new dyg.i(moneyClause, textLocalisedClause, z, false);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        q qVar = (q) this.f112744b;
        dz7.c overduePayments = (dz7.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(overduePayments, "content");
        ez7.b bVar = qVar.o;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(overduePayments, "overduePayments");
        List list = overduePayments.f121268a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dz7.d dVar = (dz7.d) obj5;
            String strN = a0.d.n("PET_PAYMENT_OVERDUE_ITEM_PREFIX_", i);
            zw7.d0 d0Var = dVar.f121270a;
            Image imageB = d0Var != null ? bVar.f130916a.b(d0Var, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505)) : null;
            zw7.d0 d0Var2 = dVar.f121270a;
            String str = d0Var2 != null ? d0Var2.d : null;
            if (str == null) {
                str = "";
            }
            arrayList.add(new RowDelegate.Model(strN, imageB, null, null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar.f121271b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, false, 126), false, false, null, RowDelegate.Model.b.c.f53268a, null, null, null, null, null, 0, 0, 0, 0, 1073694700));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new Pair(overduePayments, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dbg.b.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        e0l.l lVar = (e0l.l) this.f112744b;
        xel.f document = (xel.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(document, "document");
        HashMap map = lVar.f121740q;
        a0l.p pVar = lVar.f121739p;
        xel.c cVar = document.f304713a;
        map.put(cVar.f304706b, cVar.f304708g);
        xpi.c cVar2 = (xpi.c) lVar.f121738n;
        NavBarWithToolbar navBarWithToolbar = cVar2.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar.l0();
        TextClause textClause = new TextClause(cVar.f304707c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        cVar2.n0(textClause);
        cVar2.p0(textClause);
        String str = cVar.e;
        if (str == null) {
            str = "";
        }
        cVar2.f0(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        cVar2.l0(true);
        cVar2.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar2.d0(pVar.b(document));
        ((iqi.b) lVar.f121737m).Z(document.f304714b);
        return pVar.a(document, new InputFilter.AllCaps());
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        int i;
        TextLocalisedClause textLocalisedClause;
        e1d.j jVar = (e1d.j) this.f112744b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        z0d.f fVar = (z0d.f) pair.f186385a;
        t tVar = (t) pair.f186386b;
        e1d.f fVarA = e1d.j.a();
        aw0.e eVar = (fVar == null || !fVar.e) ? null : new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.semi_independent_onboarding.impl.R$string.guardian_invitation_details_footer_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "LIST_ID_CTA_BUTTON", false, null, fVar.f318219a, 492), null, null, 55);
        s0 s0Var = new s0(3);
        String str = fVar.f318219a;
        z0d.e eVar2 = fVar.f318221c;
        String str2 = eVar2.f318216b;
        String strL = str2 != null ? m70.a.l(str2) : null;
        String str3 = eVar2.f318217c;
        String[] elements = {strL, str3 != null ? m70.a.l(str3) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        String strL2 = m70.a.l(d0.k0(kotlin.collections.d.L(elements), " ", null, null, 0, null, 62));
        TextLocalisedClause textLocalisedClause2 = strL2 != null ? new TextLocalisedClause(com.revolut.feature.semi_independent_onboarding.impl.R$string.guardian_invitation_details_item_invitee_title, u.c(strL2), null, 12) : new TextLocalisedClause(com.revolut.feature.semi_independent_onboarding.impl.R$string.guardian_invitation_details_item_invitee_title_generic, null, null, 14);
        String str4 = eVar2.d;
        if (str4 != null) {
            int i2 = com.revolut.feature.semi_independent_onboarding.impl.R$string.guardian_invitation_details_item_invitee_subtitle;
            List listC = u.c(z80.b.b(jVar.f121974c, str4, null, null, 6));
            i = 12;
            textLocalisedClause = new TextLocalisedClause(i2, listC, null, 12);
        } else {
            i = 12;
            textLocalisedClause = null;
        }
        pf pfVar = fVar.d ? new pf(new TextLocalisedClause(com.revolut.feature.semi_independent_onboarding.impl.R$string.guardian_invitation_details_item_invitee_edit, null, null, 14), null, null, false, null, "TAG_VALUE_ACTION_EDIT", OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED) : null;
        int i3 = i;
        RowDelegate.Model model = new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, eVar2.f318215a, (String) null, (String) null, (String) null, (String) null, true, (StylableContactImage$ContactStyle) new StylableContactImage$Style(R$attr.uikit_colorAccentNeutral_10, R$attr.uikit_colorWhite_80), (ImageTransformations) null, (TextLocalisedClause) null, 3323), new AccentCircleBadge(dw0.a.Pending), null, false, null, false, 60), textLocalisedClause2, null, 0, textLocalisedClause, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model);
        s0Var.a(new ListSubheaderDelegate.Model("LIST_ID_ACCOUNT_HIGHLIGHTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.semi_independent_onboarding.impl.R$string.guardian_invitation_details_section_account_highlights_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        List<z0d.w> list = tVar.f318232a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (z0d.w wVar : list) {
            String str5 = wVar.f318234a;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.semi_independent_onboarding.impl.R$string.guardian_invitation_details_item_highlight_title, u.c(str5), null, i3);
            String str6 = wVar.f318235b;
            TextLocalisedClause textLocalisedClause4 = str6 != null ? new TextLocalisedClause(com.revolut.feature.semi_independent_onboarding.impl.R$string.guardian_invitation_details_item_highlight_subtitle, u.c(str6), null, i3) : null;
            String str7 = wVar.f318236c;
            Integer numValueOf = str7 != null ? Integer.valueOf(jVar.f121973b.a(str7)) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            arrayList.add(new RowDelegate.Model(str5, numValueOf != null ? new RowDelegate.Model.MainImage.Image24(new ResourceImage(numValueOf.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6) : null, textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        s0Var.b(arrayList.toArray(new koi.j[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        return new e1d.g(fVarA, eVar, v.m(arrayList2.toArray(new koi.j[arrayList2.size()])));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        Object objK;
        String str;
        TextClause textClause;
        int i;
        e1g.d dVar = (e1g.d) this.f112744b;
        TravelSearchResponse searchResponse = (TravelSearchResponse) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(searchResponse, "searchResponse");
        if (searchResponse.f92900c.isEmpty()) {
            objK = zhm.f0.f322471a;
        } else {
            int i2 = 14;
            o97.f0 f0Var = new o97.f0(new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_global_search_section_title, null, null, 14), "LIST_ID_EXPERIENCES_TITLE");
            List list = searchResponse.f92900c;
            dVar.getClass();
            List<TravelSearchDestination> listV0 = d0.V0(list, 3);
            ArrayList arrayList = new ArrayList(w.t(listV0, 10));
            for (TravelSearchDestination travelSearchDestination : listV0) {
                String str2 = travelSearchDestination.f92888a;
                String str3 = travelSearchDestination.d;
                String strQ = j6.a.q("EXPERIENCES_DESTINATION_ITEM_", LocationId.DestinationId.b(str2));
                CountryImage countryImage = new CountryImage(str3, (Integer) null, (ez0.e) null, i2);
                TextClause textClause2 = new TextClause(travelSearchDestination.f92889b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = travelSearchDestination.e;
                if (str4 != null) {
                    str = str4;
                    textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else {
                    str = str4;
                    textClause = null;
                }
                TextClause[] elements = {textClause, str != null ? new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextClause(((o8b.c) dVar.f121982a).b(str3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i3 = e1g.c.f121981a[travelSearchDestination.f92890c.ordinal()];
                if (i3 == 1) {
                    i = R$drawable.uikit_icn_24_globe;
                } else if (i3 == 2) {
                    i = R$drawable.uikit_icn_24_map;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_hotel;
                }
                arrayList.add(new RowDelegate.Model(strQ, countryImage, null, null, textClause2, compositeClause, null, null, 0, null, false, false, LayeredImage.Companion.b(companion, i, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 8.0f, null, null, 48), null, null, null, null, new y(o97.r.EXPERIENCES, travelSearchDestination, null, 60), null, 0, 0, 0, 0, 1056948076));
                i2 = 14;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            objK = v.k(f0Var, new o97.e0(arrayList));
        }
        return new Data(objK, null, false, 6, null);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        e4b.e eVar = (e4b.e) this.f112744b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List<dfl.u> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (dfl.u uVar : list) {
            long jO = ofm.q.o(eVar.f122518a);
            arrayList.add(new RowDelegate.Model(j6.a.q("ID_BREAKDOWN_ITEM", uVar.f114487a), new RowDelegate.Model.MainImage.Image40(new InstrumentImage(uVar.f114487a, 30, null, null), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_cfd_transactions_overnight_fee_breakdown_title, u.c(new TextClause(uVar.f114488b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TimeClause(jO, new TimeClause.Format.Pretty(q0.ONLY_TIME), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(uVar.f114489c, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model model;
        e50.q qVar = (e50.q) this.f112744b;
        g0 item = (g0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(item, "inboxItems");
        e40.w wVar = qVar.f122693b;
        Intrinsics.checkNotNullParameter(item, "item");
        RowDelegate.Model model2 = null;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_megaphone, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(32.0f), null, 32), null, null, false, null, false, 60);
        if (!(item instanceof v30.e0)) {
            if (!(item instanceof v30.f0)) {
                if (!(item instanceof v30.d0)) {
                    throw new NoWhenBranchMatchedException();
                }
                v30.d0 d0Var = (v30.d0) item;
                int i = d0Var.f285764c;
                TextClause textClause = new TextClause(String.valueOf(i), (Style) null, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), false, (o9) null, (List) null, 122);
                int i2 = R$attr.uikit_colorAccentNeutral;
                TagViewData tagViewData = new TagViewData(null, textClause, new Color.Solid(i2), i2, null, 1000);
                if (i <= 0) {
                    tagViewData = null;
                }
                model = new RowDelegate.Model("NEWSFEED_ITEM_ID", image40, new TextLocalisedClause(com.revolut.chat_core.R$string.chat_inbox_revolut_news_title, null, null, 14), null, 0, new TextClause(d0Var.f285762a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 1, new RowDelegate.Model.c.a(tagViewData, wVar.q(d0Var.f285763b.getMillis()), false, 4), false, null, false, null, null, null, null, null, null, d0Var, null, 0, 0, 0, 0, 532675288);
            }
            return v.l(model2);
        }
        model = new RowDelegate.Model("NEWSFEED_ITEM_ID", image40, new TextLocalisedClause(com.revolut.chat_core.R$string.chat_inbox_revolut_news_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.chat_core.R$string.chat_feed_subtitle_newsfeed_call_to_action, null, null, 14), null, null, 1, null, false, null, false, null, null, null, null, null, null, (v30.e0) item, null, 0, 0, 0, 0, 532676312);
        model2 = model;
        return v.l(model2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ee  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r68, java.lang.Object r69, java.lang.Object r70) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dbg.b.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        o oVarA;
        qu3.e eVar;
        String str;
        List listC;
        e94.m mVar = (e94.m) this.f112744b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = mVar.f123912b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_description, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_button_primary, null, null, 14);
        List<qu3.e> list = content;
        boolean z3 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((qu3.e) it8.next()).a()) {
                    z3 = false;
                    break;
                }
            }
        }
        boolean z4 = z3;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (qu3.e eVar2 : list) {
            if (eVar2.f249205j) {
                String str2 = eVar2.f249200a;
                if (z) {
                    listC = zhm.f0.f322471a;
                    eVar = eVar2;
                    str = str2;
                } else {
                    eVar = eVar2;
                    str = str2;
                    listC = u.c(new SwipeToActionDelegate.SwipeAction("ACTION_ID_SWIPE_DELETE", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_action_delete, null, null, 14), xh0.NEGATIVE, null, eVar, null, 80));
                }
                oVarA = new wh(str, e94.r.a(eVar), listC, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            } else {
                oVarA = e94.r.a(eVar2);
            }
            arrayList.add(oVarA);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        aim.e eVarB = u.b();
        RowDelegate.Model model = new RowDelegate.Model("LIST_ID_ADD_DEBT", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_button_add_debt_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_button_add_debt_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        eVarB.addAll(arrayList);
        return new n(u.a(eVarB), textLocalisedClause, textLocalisedClause2, textLocalisedClause3, z4);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        j7d.a aVar = (j7d.a) this.f112744b;
        List content = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            return zBooleanValue ? e9d.c.d(aVar) : e9d.c.b(aVar);
        }
        aim.e eVarB = u.b();
        eVarB.addAll(d0.V0(content, 3));
        if (content.size() > 3) {
            eVarB.add(new LargeActionButtonDelegate.Model("TRANSACTIONS_ALL_LIST_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_all_items_button, null, null, 14), false, null, null, null, null, 1000));
        }
        return yp0.b.g(u.a(eVarB), e9d.c.c(aVar), yp0.e0.OUTSIDE_BOX, 0, 0, 124);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        ead.q qVar = (ead.q) this.f112744b;
        String url2 = (String) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        return u.c(new kj("PAYMENT_PREVIEW_ID", new mj(url2, null), new cp0(true, j6.a.q("Revolut/", qVar.f124214a.a()), xo0.MATCH_PARENT, null, 76), Constants.TAG_FULL_SVPP_IDENTIFICATION));
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [com.revolut.core.ui_kit.models.MoneyClause$Format, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v17 dk9.s, still in use, count: 2, list:
          (r3v17 dk9.s) from 0x06eb: MOVE (r60v1 dk9.s) = (r3v17 dk9.s)
          (r3v17 dk9.s) from 0x0652: MOVE (r60v3 dk9.s) = (r3v17 dk9.s)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object r58, java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 3606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dbg.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f112743a = i;
        this.f112744b = obj3;
    }
}
