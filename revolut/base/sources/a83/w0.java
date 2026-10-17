package a83;

import android.os.Parcelable;
import aw0.k7;
import aw0.o9;
import aw0.x4;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.Cashback;
import com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.feature.wealth.analytics.ui.widgetised.models.PnLValues;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ip0.ek0;
import ip0.om;
import ip0.r40;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m9d.l1;
import m9d.n1;
import m9d.o1;
import mx0.v5;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class w0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2094b;

    public /* synthetic */ w0(Object obj2, boolean z, int i) {
        this.f2093a = i;
        this.f2094b = z;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean zIsEmpty = content.isEmpty();
        boolean z = this.f2094b;
        if (zIsEmpty && !z) {
            return zhm.f0.f322471a;
        }
        boolean z3 = content.size() > 3;
        aim.e eVarB = zhm.u.b();
        List<UserVoucher> listV0 = zhm.d0.V0(content, 3);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        for (UserVoucher userVoucher : listV0) {
            arrayList.add(k3e.b.c(userVoucher, "STORE_ORDERS_GIFT_CARDS_ROW_" + userVoucher.f83619a));
        }
        eVarB.addAll(arrayList);
        if (z3) {
            eVarB.add(new LargeActionButtonDelegate.Model("STORE_ORDERS_GIFT_CARDS_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.store_orders_gift_cards_see_all, null, null, 14), false, null, null, null, null, 1000));
        }
        if (content.isEmpty() && z) {
            eVarB.add(l3e.o.d());
        }
        aim.e eVarA = zhm.u.a(eVarB);
        aim.e eVarB2 = zhm.u.b();
        eVarB2.addAll(yp0.b.g(eVarA, l3e.o.a(), null, 0, 0, 126));
        if (z && !content.isEmpty()) {
            List listC = zhm.u.c(l3e.o.d());
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            eVarB2.addAll(listC);
        }
        return zhm.u.a(eVarB2);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        List listG;
        List listC;
        List callRequestsContent = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(callRequestsContent, "callRequestsContent");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : callRequestsContent) {
            if (((f7d.a) obj5).f132591c) {
                arrayList.add(obj5);
            } else {
                arrayList2.add(obj5);
            }
        }
        if (arrayList2.isEmpty()) {
            listG = zhm.f0.f322471a;
        } else {
            int size = arrayList2.size();
            boolean z = this.f2094b;
            int i = z ? 3 : Integer.MAX_VALUE;
            boolean z3 = size > 3;
            aim.e eVarB = zhm.u.b();
            List listV0 = zhm.d0.V0(zhm.d0.P0(o1.d(arrayList2), new n1()), i);
            ArrayList arrayList3 = new ArrayList(zhm.w.t(listV0, 10));
            Iterator it8 = listV0.iterator();
            while (it8.hasNext()) {
                arrayList3.add(((l1) it8.next()).f203723a);
            }
            eVarB.addAll(arrayList3);
            if (z3) {
                eVarB.add(new LargeActionButtonDelegate.Model("ACTIVE_REQUESTS_SEE_MORE", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(z ? com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_active_requests_expand : com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_active_requests_collapse, null, null, 14), false, null, null, null, null, 1000));
            }
            listG = yp0.b.g(zhm.u.a(eVarB), new ListSubheaderDelegate.Model("ACTION_REQUESTS_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_active_requests_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), yp0.e0.INSIDE_BOX, 0, 0, 124);
        }
        if (arrayList.isEmpty()) {
            listC = zhm.f0.f322471a;
        } else {
            ArrayList arrayListD = o1.d(arrayList);
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayListD, 10));
            Iterator it9 = arrayListD.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((l1) it9.next()).f203723a);
            }
            yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
            gg.b bVar = new gg.b(arrayList4.size() > 1, 2);
            int i2 = R$attr.uikit_dp8;
            listC = zhm.u.c(new hg("IN_APP_CALL_ACTIONS_ITEM_ID", arrayList4, 1, x4.c.f10604a, null, bVar, false, false, null, null, i2, i2, 0, 0, 26560));
        }
        return i2b.a.o(listC, listG);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        od0.i cashbackOpt = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cashbackOpt, "cashbackOpt");
        aim.e eVarB = zhm.u.b();
        if (cashbackOpt.d()) {
            dj0.d cashbackAmount = ((Cashback) cashbackOpt.c()).f84349b;
            om omVar = om.f165678a;
            if (cashbackAmount != null) {
                Cashback cashback = (Cashback) cashbackOpt.c();
                Intrinsics.checkNotNullParameter(cashback, "cashback");
                Intrinsics.checkNotNullParameter(cashbackAmount, "cashbackAmount");
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cashback, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorPlanPremiumMid), (List) null, (ImageTransformations) null, (Clause) null, 246);
                HighlightTileDelegate.Model model = new HighlightTileDelegate.Model("ID_CELL_CASHBACK", new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_cashback_earning_you_will_earn, zhm.u.c(new MoneyClause(cashbackAmount, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4)), null, 12), resourceImage, true, new o9c.r(cashback), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, omVar, 840);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
            } else {
                Cashback cashback2 = (Cashback) cashbackOpt.c();
                Intrinsics.checkNotNullParameter(cashback2, "cashback");
                HighlightTileDelegate.Model model2 = new HighlightTileDelegate.Model("ID_CELL_CASHBACK_NOT_AVAILABLE", new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_cashback_earning_not_available, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cashback, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorPlanPremiumMid), (List) null, (ImageTransformations) null, (Clause) null, 246), true, new o9c.r(cashback2), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, omVar, 840);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model2);
            }
        }
        if (this.f2094b) {
            eVarB.add(new TextDelegate.Model("ID_TEXT_PAY_FROM_PERSONAL_ACCOUNT", new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_text_pay_from_to_earn_points, zhm.u.c(new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_text_personal_account, null, new Click(28, (Integer) null, (Object) o9c.t.f223238a, "ID_PAY_BY_PERSONAL_ACCOUNT", false), 10)), null, 12), false, new ek0(0), null, null, R$attr.uikit_dp4, 0, 0, 0, 1908));
        }
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r0 = r20
            java.util.List r0 = (java.util.List) r0
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            r1 = r22
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r1 = "cashbackBoxes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.Object r0 = zhm.d0.d0(r0)
            r7 = r0
            uc3.a r7 = (uc3.a) r7
            if (r7 == 0) goto L33
            io3.d r0 = r7.f278974b
            dj0.d r0 = io3.h.e(r0)
            dj0.c r1 = dj0.d.Companion
            r1.getClass()
            dj0.d r1 = dj0.d.e
            boolean r0 = r0.f(r1)
            if (r0 == 0) goto L33
            r0 = 1
        L31:
            r4 = r0
            goto L35
        L33:
            r0 = 0
            goto L31
        L35:
            r0 = 0
            r9 = r19
            boolean r1 = r9.f2094b
            if (r1 == 0) goto L62
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.cashback.impl.R$string.cashback_box_action_withdraw
            r2 = 14
            r5.<init>(r1, r0, r0, r2)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r6 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r11 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_arrow_down
            r17 = 0
            r18 = 254(0xfe, float:3.56E-43)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            com.revolut.core.ui_kit.views.ActionsView$Item r1 = new com.revolut.core.ui_kit.views.ActionsView$Item
            r3 = 0
            r8 = 966(0x3c6, float:1.354E-42)
            java.lang.String r2 = "ID_ACTION_WITHDRAW"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a83.w0.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r0 = r20
            java.util.List r0 = (java.util.List) r0
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            r1 = r22
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r1 = "cashbackBoxes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.Object r0 = zhm.d0.d0(r0)
            r7 = r0
            uc3.a r7 = (uc3.a) r7
            if (r7 == 0) goto L33
            io3.d r0 = r7.f278974b
            dj0.d r0 = io3.h.e(r0)
            dj0.c r1 = dj0.d.Companion
            r1.getClass()
            dj0.d r1 = dj0.d.e
            boolean r0 = r0.f(r1)
            if (r0 == 0) goto L33
            r0 = 1
        L31:
            r4 = r0
            goto L35
        L33:
            r0 = 0
            goto L31
        L35:
            r0 = 0
            r9 = r19
            boolean r1 = r9.f2094b
            if (r1 == 0) goto L62
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.cashback.impl.R$string.cashback_box_action_withdraw
            r2 = 14
            r5.<init>(r1, r0, r0, r2)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r6 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r11 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_arrow_down
            r17 = 0
            r18 = 254(0xfe, float:3.56E-43)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            com.revolut.core.ui_kit.views.ActionsView$Item r1 = new com.revolut.core.ui_kit.views.ActionsView$Item
            r3 = 0
            r8 = 966(0x3c6, float:1.354E-42)
            java.lang.String r2 = "ID_ACTION_WITHDRAW"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a83.w0.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        List userVouchers = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        if (userVouchers.isEmpty()) {
            return zhm.f0.f322471a;
        }
        aim.e eVarB = zhm.u.b();
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(R$string.store_mega_offer_details_gift_cards_your_gift_cards_subheader_label, null, null, 14), (Image) null, 0, false, 30);
        boolean z = this.f2094b;
        eVarB.add(new CellDetailsDelegate.Model("STORE_BRAND_DETAIL_YOUR_GIFT_CARDS_EXPANSION_CONTROL_ID", t0Var, null, null, null, null, null, 0, new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, true, null, null, 27640));
        if (z) {
            eVarB.addAll(v2e.m0.e(userVouchers));
        }
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k7 k7Var;
        Iterable iterableC;
        BigDecimal bigDecimalN;
        dj0.d dVar;
        List list;
        Iterator it8;
        String str;
        TextLocalisedClause textLocalisedClause;
        int i;
        int i2;
        TextLocalisedClause textLocalisedClause2;
        int i3;
        Clause clauseB;
        ?? arrayList;
        switch (this.f2093a) {
            case 0:
                m1c.r0 state = (m1c.r0) obj2;
                ((Boolean) obj3).getClass();
                Float fValueOf = Float.valueOf(40.0f);
                Intrinsics.checkNotNullParameter(state, "state");
                ActionWidgetDelegate.Model model = null;
                if (!this.f2094b && state.f201447a == m1c.x0.OPTED_OUT) {
                    ActionWidgetDelegate.Model model2 = new ActionWidgetDelegate.Model("REV_POINTS_UNLOCK_BANNER_ITEM_ID", new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_home_widget_action_rev_points_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_home_widget_action_rev_points_subtitle, null, null, 14), new com.revolut.core.ui_kit.delegates.m(new LayeredImage(zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_gradient_background, (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_revpoints, Integer.valueOf(R$attr.uikit_colorWhite), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, com.revolut.core.ui_kit_core.displayers.image.models.c.CENTER_INSIDE, 60)), fValueOf, fValueOf, 8), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_home_widget_action_rev_points_cta, null, null, 14), null, false), null, null, null, true, 4544);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    model = model2;
                }
                return zhm.v.l(model);
            case 1:
                PnLValues content = (PnLValues) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                dj0.d dVar2 = content.d;
                dj0.d dVar3 = content.f95097b;
                if (dVar2 == null) {
                    dVar2 = new dj0.d(0L, dVar3.f115083b);
                }
                dj0.d dVar4 = dVar2;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_breakdown_realised, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                boolean z = this.f2094b;
                aw0.t0 t0Var = new aw0.t0((Clause) textLocalisedClause3, (Image) new ResourceImage(z ? R$drawable.uikit_icn_16_chevron_up : R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 28);
                dj0.d dVar5 = content.f95097b;
                k7 k7Var2 = k7.ALWAYS;
                CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("TOTAL_PNL_REALISED_BREAKDOWN_ID", t0Var, new MoneyClause(dVar5, new MoneyClause.Format.Defaults(k7Var2, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, null, null, 0, null, false, true, null, null, 28664);
                aim.e eVarB = zhm.u.b();
                eVarB.add(model3);
                if (z) {
                    eVarB.add(new CellDetailsDelegate.Model("TOTAL_PNL_REALISED_CAPITAL_GAINS_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_breakdown_capital_gains_losses, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new MoneyClause(pyd.c.H(dVar3, dVar4), new MoneyClause.Format.Defaults(k7Var2, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), null, null, null, null, 0, null, false, false, null, null, 32760));
                    k7Var = k7Var2;
                    eVarB.add(new CellDetailsDelegate.Model("TOTAL_PNL_REALISED_DIVIDENDS_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_breakdown_dividends_coupons, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new MoneyClause(dVar4, new MoneyClause.Format.Defaults(k7Var2, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), null, null, null, null, 0, null, false, false, null, null, 32760));
                } else {
                    k7Var = k7Var2;
                }
                eVarB.add(new CellDetailsDelegate.Model("TOTAL_PNL_UNREALISED_BREAKDOWN_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_breakdown_unrealised, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new MoneyClause(content.f95098c, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, null, null, 0, null, false, false, null, null, 32760));
                aim.e eVarA = zhm.u.a(eVarB);
                yp0.b.k(eVarA, R$attr.uikit_dp0, 0, 0, 0, 14);
                return eVarA;
            case 2:
                od0.i optionalSettings = (od0.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(optionalSettings, "optionalSettings");
                nl9.g gVar = (nl9.g) optionalSettings.g();
                if (gVar == null) {
                    return null;
                }
                return new RowDelegate.Model("ID_PAY_WITH_SMILE_SETTINGS_ROW", this.f2094b ? new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6) : new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_face_id, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 10.0f, null, null, 48), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_management_home_pay_with_smile_title, null, null, 14), null, 0, gVar.f217102a ? new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_management_home_pay_with_smile_subtitle_enabled, null, null, 14) : new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_management_home_pay_with_smile_subtitle_disabled, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
            case 3:
                xzg.h0 content2 = (xzg.h0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                boolean zIsEmpty = content2.f309997b.isEmpty();
                boolean z3 = this.f2094b;
                boolean z4 = z3 && !zIsEmpty;
                Collection collectionC = zIsEmpty ? zhm.f0.f322471a : zhm.u.c(new FixedTabsDelegate.Model("POPULAR_FIRST_BUY_TABS_ID", zhm.v.k(new FixedTabs.Item("POPULAR_FIRST_BUY_STOCKS_TAB_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_home_widget_popular_first_buy_stocks, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("POPULAR_FIRST_BUY_ETFS_TAB_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_home_widget_popular_first_buy_etfs, null, null, 14), (AnalyticsContext) null, 12)), z3 ? "POPULAR_FIRST_BUY_ETFS_TAB_ID" : "POPULAR_FIRST_BUY_STOCKS_TAB_ID", false, null, SyslogConstants.LOG_CLOCK));
                if (z4) {
                    PlainTextDelegate.Model model4 = new PlainTextDelegate.Model("ETF_DESCRIPTION_TEXT_ID", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_popular_first_buy_etf_description, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                    yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                    iterableC = zhm.u.c(model4);
                } else {
                    iterableC = zhm.f0.f322471a;
                }
                List list2 = content2.f309997b;
                if (!z4) {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = content2.f309996a;
                }
                List<vel.e> list3 = list2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                for (vel.e asset : list3) {
                    String strA = asset.a();
                    nel.a0 a0Var = asset.f288355a;
                    nel.n nVar = a0Var.f214560a;
                    InstrumentTicker instrumentTicker = a0Var.f214561b;
                    TextClause textClause = new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause2 = new TextClause(nVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str2 = nVar.o;
                    TextClause[] elements = {textClause2, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    CompositeClause compositeClauseM = yoj.b.m(new DotDividerClause((Integer) null), kotlin.collections.d.L(elements));
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    arrayList2.add(new RowDelegate.Model(strA, new InstrumentImage(asset.a(), 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGreyTone20)), null, null, textClause, compositeClauseM, null, null, 1, new RowDelegate.Model.c.b((instrumentTicker == null || (dVar = instrumentTicker.e) == null) ? null : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), (instrumentTicker == null || (bigDecimalN = jb3.l.N(instrumentTicker)) == null) ? null : l9.l.N(bigDecimalN), null, false, 124), false, false, null, null, null, null, null, asset, null, 0, 0, 0, 0, 1056961388));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return zhm.d0.E0(arrayList2, zhm.d0.E0(iterableC, collectionC));
            case 4:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ggk.a aVar = (ggk.a) pair.f186385a;
                InsuranceDocumentsAvailability insuranceDocumentsAvailability = (InsuranceDocumentsAvailability) pair.f186386b;
                PricingPlanCancelScreenConfig.Footer footer = aVar.d.f;
                return (footer == null || (list = footer.f81172a) == null) ? cjk.b.a(aVar.f143697a, insuranceDocumentsAvailability, this.f2094b, false) : dok.b.a(list);
            case 5:
                List events = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(events, "events");
                aim.e eVarB2 = zhm.u.b();
                if (!events.isEmpty()) {
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_title, null, null, 14);
                    boolean z6 = this.f2094b;
                    int i5 = 0;
                    eVarB2.add(new ListSubheaderDelegate.Model("LIST_ID_TIMELINE_HEADER", (Image) null, (Clause) textLocalisedClause4, (Image) null, (Clause) new ImageClause(z6 ? R$drawable.uikit_icn_16_chevron_up : R$drawable.uikit_icn_16_chevron_down, Integer.valueOf(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, true, true, 1), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450));
                    if (z6) {
                        List list4 = events;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it9 = list4.iterator();
                        int i6 = 0;
                        while (it9.hasNext()) {
                            Object next = it9.next();
                            int i21 = i6 + 1;
                            if (i6 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            qr6.c cVar = (qr6.c) next;
                            qr6.b eventType = cVar.f248654a;
                            dj0.d dVar6 = cVar.f248656c;
                            qr6.b bVar = qr6.b.REFUNDED_AMOUNT_CHANGED;
                            int i22 = (eventType != bVar || dVar6 == null) ? i5 : 1;
                            String str3 = cVar.d;
                            ?? r312 = (i22 == 0 || str3 == null) ? i5 : 1;
                            String strT = v1.c.t(i6, "LIST_ID_TIMELINE_ENTRY_", eventType.name(), "_");
                            TimeClause timeClause = new TimeClause(oi0.d.R(cVar.f248655b), new TimeClause.Format.Pretty(i5), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
                            if (cVar.f248654a != bVar || dVar6 == null) {
                                it8 = it9;
                                str = str3;
                                Intrinsics.checkNotNullParameter(eventType, "eventType");
                                switch (wu6.c.f300073a[eventType.ordinal()]) {
                                    case 1:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_failed;
                                        break;
                                    case 2:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_created;
                                        break;
                                    case 3:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_authorised;
                                        break;
                                    case 4:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_captured;
                                        break;
                                    case 5:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_declined;
                                        break;
                                    case 6:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_cancelled;
                                        break;
                                    case 7:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_finished;
                                        break;
                                    case 8:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_refunded_amount_changed;
                                        break;
                                    case 9:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_refund_started;
                                        break;
                                    case 10:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_refunded;
                                        break;
                                    case 11:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_authentication_verified;
                                        break;
                                    case 12:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_authentication_failed;
                                        break;
                                    case 13:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_authentication_challenge;
                                        break;
                                    case 14:
                                        i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_authorisation_passed;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                i2 = 14;
                                textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                            } else {
                                int i32 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_timeline_event_refunded_amount;
                                if (dVar6 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                it8 = it9;
                                str = str3;
                                textLocalisedClause = new TextLocalisedClause(i32, zhm.u.c(new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                                i2 = 14;
                            }
                            TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
                            lr6.h0 reason = cVar.e;
                            if (reason != null) {
                                Intrinsics.checkNotNullParameter(reason, "reason");
                                switch (wu6.c.f300074b[reason.ordinal()]) {
                                    case 1:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_authentication_required;
                                        break;
                                    case 2:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_cardholder_name_missing;
                                        break;
                                    case 3:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_currency_not_supported;
                                        break;
                                    case 4:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_customer_challenge_abandoned;
                                        break;
                                    case 5:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_customer_challenge_failed;
                                        break;
                                    case 6:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_customer_verification_failed;
                                        break;
                                    case 7:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_do_not_honour;
                                        break;
                                    case 8:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_expired_card;
                                        break;
                                    case 9:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_high_risk;
                                        break;
                                    case 10:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_insufficient_funds;
                                        break;
                                    case 11:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_account;
                                        break;
                                    case 12:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_address;
                                        break;
                                    case 13:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_amount;
                                        break;
                                    case 14:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_card;
                                        break;
                                    case 15:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_country;
                                        break;
                                    case 16:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_cvv;
                                        break;
                                    case 17:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_email;
                                        break;
                                    case 18:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_expiry;
                                        break;
                                    case 19:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_merchant;
                                        break;
                                    case 20:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_phone;
                                        break;
                                    case 21:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_pin;
                                        break;
                                    case 22:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_invalid_transaction;
                                        break;
                                    case 23:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_issuer_decline;
                                        break;
                                    case 24:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_issuer_not_available;
                                        break;
                                    case 25:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_law_violation;
                                        break;
                                    case 26:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_new_card_not_unblocked;
                                        break;
                                    case 27:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_no_such_issuer;
                                        break;
                                    case 28:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_pick_up_card;
                                        break;
                                    case 29:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_pin_required;
                                        break;
                                    case 30:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_pin_tries_exceeded;
                                        break;
                                    case 31:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_rejected_by_customer;
                                        break;
                                    case 32:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_restricted_card;
                                        break;
                                    case 33:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_security_violation;
                                        break;
                                    case 34:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_stolen_card;
                                        break;
                                    case 35:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_suspected_fraud;
                                        break;
                                    case 36:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_technical_error;
                                        break;
                                    case 37:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_three_ds_challenge_abandoned;
                                        break;
                                    case 38:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_three_ds_challenge_failed;
                                        break;
                                    case 39:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_three_ds_challenge_failed_manually;
                                        break;
                                    case 40:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_transaction_not_allowed;
                                        break;
                                    case 41:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_transaction_not_allowed_for_cardholder;
                                        break;
                                    case 42:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_unknown_card;
                                        break;
                                    case 43:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_withdrawal_frequency_exceeded;
                                        break;
                                    case 44:
                                        i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_transaction_failure_reason_withdrawal_limit_exceeded;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                textLocalisedClause2 = new TextLocalisedClause(i3, null, null, i2);
                            } else {
                                textLocalisedClause2 = null;
                            }
                            arrayList3.add(new r40(strT, timeClause, textLocalisedClause5, textLocalisedClause2, null, zhm.v.l(r312 != 0 ? new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246) : null), eventType != qr6.b.FAILED ? R$attr.uikit_colorBlue : R$attr.uikit_colorRed, r312, null, i6 == 0 ? R$attr.uikit_dp16 : R$attr.uikit_dp4, i6 == zhm.v.j(events) ? R$attr.uikit_dp16 : R$attr.uikit_dp4, 0, r312 != 0 ? str != null ? new iv6.n(str) : null : null, 6416));
                            it9 = it8;
                            i6 = i21;
                            i5 = 0;
                        }
                        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                        zhm.a0.x(arrayList3, eVarB2);
                    }
                }
                return zhm.u.a(eVarB2);
            case 6:
                List items = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                List<DisplayableFaqItem> list5 = items;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                for (DisplayableFaqItem displayableFaqItem : list5) {
                    String f86140b = displayableFaqItem.getF86140b();
                    Intrinsics.checkNotNullParameter(displayableFaqItem, "<this>");
                    if (displayableFaqItem instanceof DisplayableFaqItem.DeepLink) {
                        clauseB = ((DisplayableFaqItem.DeepLink) displayableFaqItem).f86136a;
                    } else {
                        if (!(displayableFaqItem instanceof DisplayableFaqItem.Node)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FaqNodeBase faqNodeBase = ((DisplayableFaqItem.Node) displayableFaqItem).f86139a;
                        if (faqNodeBase instanceof PigeonNode) {
                            clauseB = p9d.i.c((PigeonNode) faqNodeBase);
                        } else {
                            if (!(faqNodeBase instanceof FaqNode)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            clauseB = p9d.i.b((FaqNode) faqNodeBase);
                        }
                    }
                    arrayList4.add(new CellDetailsChevronDelegate.Model(f86140b, clauseB, f2.INTERNAL, 0, displayableFaqItem, l7d.a.b(displayableFaqItem.getF86140b()), 1992));
                }
                return k8d.u.b(arrayList4, this.f2094b);
            case 7:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list6 = (List) pair2.f186385a;
                List<u2f.d> list7 = (List) pair2.f186386b;
                aim.o oVar = new aim.o();
                Iterator it10 = list6.iterator();
                while (it10.hasNext()) {
                    oVar.addAll(((TradeRevPointsAccount) it10.next()).e);
                }
                aim.o oVarA = zhm.y0.a(oVar);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (u2f.d dVar7 : list7) {
                    if (oVarA.f5338a.containsKey(dVar7.f276617a)) {
                        arrayList5.add(dVar7);
                    } else {
                        arrayList6.add(dVar7);
                    }
                }
                if (!arrayList5.isEmpty() || list6.isEmpty()) {
                    arrayList = new ArrayList(zhm.w.t(arrayList5, 10));
                    Iterator it11 = arrayList5.iterator();
                    while (it11.hasNext()) {
                        arrayList.add(k8g.a.a((u2f.d) it11.next(), true));
                    }
                } else {
                    arrayList = zhm.u.c(new RowDelegate.Model("ACCOUNTS_EMPTY_PLACEHOLDER_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_travel, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_home_section_accounts_empty_state_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_home_section_accounts_empty_state_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                }
                ?? r72 = arrayList;
                yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
                int i33 = R$attr.uikit_dp8;
                int i43 = R$attr.uikit_dp16;
                boolean zIsEmpty2 = ((Collection) r72).isEmpty();
                ?? D = r72;
                if (!zIsEmpty2) {
                    D = yp0.b.d(r72, new ListSubheaderDelegate.Model("YOUR_AGENTS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.hotel.transfers.api.R$string.trade_rev_points_home_section_your_accounts_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i33, i33, i43, i43);
                }
                List listV0 = this.f2094b ? zhm.d0.V0(arrayList6, 5) : arrayList6;
                LargeActionButtonDelegate.Model model5 = listV0.size() < arrayList6.size() ? new LargeActionButtonDelegate.Model("AGENTS_SEE_ALL_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, null, null, 1000) : null;
                aim.e eVarB3 = zhm.u.b();
                Iterator it12 = listV0.iterator();
                while (it12.hasNext()) {
                    eVarB3.add(k8g.a.a((u2f.d) it12.next(), false));
                }
                if (model5 != null) {
                    eVarB3.add(model5);
                }
                aim.e eVarA2 = zhm.u.a(eVarB3);
                yp0.e0 e0Var2 = yp0.e0.OUTSIDE_BOX;
                int i59 = R$attr.uikit_dp8;
                int i66 = R$attr.uikit_dp16;
                boolean zIsEmpty3 = eVarA2.isEmpty();
                Iterable iterableD = eVarA2;
                if (!zIsEmpty3) {
                    iterableD = yp0.b.d(eVarA2, k8g.u.b(), e0Var2, i59, i59, i66, i66);
                }
                return zhm.d0.E0(iterableD, (Collection) D);
            case 8:
                return a(obj2, obj3, obj4);
            case 9:
                return b(obj2, obj3, obj4);
            case 10:
                List content3 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                boolean zIsEmpty4 = content3.isEmpty();
                boolean z11 = this.f2094b;
                if (zIsEmpty4 && !z11) {
                    return zhm.u.c(n3e.m.a());
                }
                aim.e eVarB4 = zhm.u.b();
                List<UserVoucher> list8 = content3;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list8, 10));
                for (UserVoucher userVoucher : list8) {
                    arrayList7.add(k3e.b.c(userVoucher, "STORE_ORDERS_SEE_ALL_GIFT_CARDS_ROW_" + userVoucher.f83619a));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                eVarB4.addAll(arrayList7);
                if (z11) {
                    CellDetailsChevronDelegate.Model model6 = new CellDetailsChevronDelegate.Model("STORE_ORDERS_SEE_ALL_GIFT_CARDS_USED_EXPIRED_ID", new TextLocalisedClause(R$string.store_orders_gift_cards_used_and_expired, null, null, 14), f2.INTERNAL, 0, null, null, 2040);
                    yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                    eVarB4.add(model6);
                }
                return zhm.u.a(eVarB4);
            case 11:
                return c(obj2, obj3, obj4);
            case 12:
                return d(obj2, obj3, obj4);
            case 13:
                return e(obj2, obj3, obj4);
            case 14:
                return g(obj2, obj3, obj4);
            default:
                List content4 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                aim.e eVarB5 = zhm.u.b();
                boolean z12 = this.f2094b;
                List listV02 = z12 ? content4 : zhm.d0.V0(content4, 3);
                ArrayList arrayList8 = new ArrayList(zhm.w.t(listV02, 10));
                int i74 = 0;
                for (Object obj5 : listV02) {
                    int i92 = i74 + 1;
                    if (i74 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    hfg.s sVar = (hfg.s) obj5;
                    arrayList8.add(new RowDelegate.Model(a0.d.n("RECOMMENDED_AIRLINES_ITEM_ID_PREFIX", i74), new RowDelegate.Model.MainImage.Image40(new UrlImage(sVar.f151888c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 62), new TextClause(sVar.f151886a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(sVar.f151887b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, sVar, null, 0, 0, 0, 0, 532676568));
                    i74 = i92;
                }
                eVarB5.addAll(arrayList8);
                if (!z12 && content4.size() > 3) {
                    eVarB5.add(new LargeActionButtonDelegate.Model("RECOMMENDED_AIRLINES_SEE_ALL_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_results_recommended_airlines_see_all, null, null, 14), false, null, null, null, null, 1000));
                }
                aim.e eVarA3 = zhm.u.a(eVarB5);
                yp0.e0 e0Var3 = yp0.e0.OUTSIDE_BOX;
                int i96 = R$attr.uikit_dp8;
                int i99 = R$attr.uikit_dp16;
                return !eVarA3.isEmpty() ? yp0.b.d(eVarA3, vhg.a.a(true), e0Var3, i96, i96, i99, i99) : eVarA3;
        }
    }

    public /* synthetic */ w0(boolean z, int i) {
        this.f2093a = i;
        this.f2094b = z;
    }

    public /* synthetic */ w0(boolean z, Object obj2, int i) {
        this.f2093a = i;
        this.f2094b = z;
    }
}
