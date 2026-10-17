package mig;

import aw0.ja;
import aw0.k7;
import aw0.l1;
import aw0.n6;
import aw0.o9;
import aw0.w6;
import aw0.x6;
import aw0.y6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.delegates.w7;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.SpareChangeRefund;
import com.revolut.feature.store.api.model.StorePurchase;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.youTransactor.uCube.rpc.Constants;
import ip0.nb0;
import ip0.pb0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m1c.w1;
import m1c.y;
import m1c.z;
import myg.l;
import n3e.m;
import od0.i;
import ox0.b0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205840a;

    public /* synthetic */ a(int i) {
        this.f205840a = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        TotalValueChart chart = (TotalValueChart) obj2;
        ((Boolean) obj3).getClass();
        l.a aVar = l.Companion;
        Intrinsics.checkNotNullParameter(chart, "chart");
        List list = chart.f95004c;
        if (!list.isEmpty()) {
            List<TotalValueChartPoint> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (!((TotalValueChartPoint) it8.next()).f95006b.k()) {
                        LineChartTileWidgetDelegate.Model.Companion aVar2 = LineChartTileWidgetDelegate.Model.INSTANCE;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (TotalValueChartPoint totalValueChartPoint : list2) {
                            arrayList.add(new y6(totalValueChartPoint.f95005a.getMillis(), totalValueChartPoint.f95006b.f115082a));
                        }
                        l1.c cVar = new l1.c(2.0f);
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_analytics_widgetised_total_value_title, null, null, 14);
                        MoneyClause moneyClause = new MoneyClause(((TotalValueChartPoint) d0.m0(list)).f95006b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                        Float fValueOf = Float.valueOf(10.0f);
                        dj0.d dVarA = l.a(chart);
                        dj0.d dVar = dj0.d.e;
                        int i = dVarA.f(dVar) ? R$attr.uikit_colorPerformancePositive : dVarA.k() ? R$attr.uikit_colorPerformanceStatic : R$attr.uikit_colorPerformanceNegative;
                        Clause[] elements = {new ImageClause((dVarA.f(dVar) || dVarA.k()) ? R$drawable.uikit_icn_10_stocks_arrow_up : R$drawable.uikit_icn_10_stocks_arrow_down, new ImageClauseTint.Color(i), fValueOf, fValueOf, 16), new MoneyClause(dVarA, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), new Custom(Integer.valueOf(i), false, null, false, null, 254), null, 8)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        List listL = kotlin.collections.d.L(elements);
                        m70.a.t(t0.f186434a);
                        ja jaVar = new ja(textLocalisedClause, moneyClause, new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
                        dj0.d dVarA2 = l.a(chart);
                        boolean z = dVarA2.f(dVar) || dVarA2.k();
                        return LineChartTileWidgetDelegate.Model.Companion.a(aVar2, "TOTAL_VALUE_ID", new LineChartResizableTileDelegate.Model("TOTAL_VALUE_ID", arrayList, jaVar, new x6(u.c(new w6(z ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative, z ? R$attr.uikit_colorPerformancePositive_30 : R$attr.uikit_colorPerformanceNegative_30, R$attr.uikit_colorTransparent, chart.f95002a.getMillis(), chart.f95003b.getMillis(), false, 64))), cVar, w7.MEDIUM, null, null, null, null, null, 8128));
                    }
                }
            }
        }
        xi0.b bVar = chart.e.f115083b;
        LineChartTileWidgetDelegate.Model.Companion aVar3 = LineChartTileWidgetDelegate.Model.INSTANCE;
        l.Companion.getClass();
        List list3 = (List) l.f210506a.getValue();
        l1.c cVar2 = new l1.c(2.0f);
        ja jaVar2 = new ja(new TextLocalisedClause(R$string.wealth_analytics_widgetised_total_value_title, null, null, 14), new MoneyClause(new dj0.d(0L, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null);
        int i2 = R$attr.uikit_colorGreyTone50_20;
        int i3 = R$attr.uikit_colorTransparent;
        return LineChartTileWidgetDelegate.Model.Companion.a(aVar3, "TOTAL_VALUE_ID", new LineChartResizableTileDelegate.Model("TOTAL_VALUE_ID", list3, jaVar2, new x6(u.c(new w6(i2, i3, i3, BitmapDescriptorFactory.HUE_RED, ((List) r2.getValue()).size(), false, 64))), cVar2, w7.MEDIUM, null, null, null, null, null, 8128));
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        SpareChangeRefund spareChangeRefund = (SpareChangeRefund) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(spareChangeRefund, "spareChangeRefund");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_title, null, null, 14);
        if (spareChangeRefund.f84091c.f115082a <= 0) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_zero_description, null, null, 14);
        } else {
            int i = n2c.e.f211519a[spareChangeRefund.f84090b.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_pending_description, null, null, 14);
            } else if (i == 2) {
                Long l2 = spareChangeRefund.f84092g;
                long jLongValue = l2 != null ? l2.longValue() : Instant.now().toEpochMilli();
                textLocalisedClause = ebm.a.x(oc.c.I(jLongValue)) ? new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_completed_today_description, null, null, 14) : new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_completed_description, u.c(new TimeClause(jLongValue, new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_not_requested_description, null, null, 14);
            }
        }
        return new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        SpareChangeRefund spareChangeRefund = (SpareChangeRefund) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(spareChangeRefund, "spareChangeRefund");
        dj0.d dVar = spareChangeRefund.f84091c;
        if (dVar.f115082a <= 0) {
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("CELL_DELEGATE_POINTS_ITEM_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_cell_details_spare_change_points, null, null, 14), (Image) null, 0, false, 30), v1.c.g(0, qvb.a.c(dVar), null, null, 5), null, null, null, null, 0, null, false, false, null, null, 32760);
            dj0.d dVar2 = spareChangeRefund.e;
            CellDetailsDelegate.Model[] elements = {model, dVar2 != null ? new CellDetailsDelegate.Model("CELL_DELEGATE_POINTS_BALANCE_ITEM_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_cell_details_points_balance, null, null, 14), (Image) null, 0, false, 30), v1.c.g(0, qvb.a.c(dVar2), null, null, 5), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            return listL;
        }
        int i = n2c.e.f211519a[spareChangeRefund.f84090b.ordinal()];
        if (i == 1) {
            return n2c.f.a(spareChangeRefund);
        }
        if (i != 2) {
            if (i == 3) {
                return n2c.f.a(spareChangeRefund);
            }
            throw new NoWhenBranchMatchedException();
        }
        List listK = v.k(new CellDetailsDelegate.Model("CELL_DELEGATE_POINTS_ITEM_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_cell_details_points_reversed, null, null, 14), (Image) null, 0, false, 30), v1.c.g(0, qvb.a.c(dVar), null, null, 5), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("CELL_DELEGATE_REFUND_ITEM_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_cell_details_refund_received, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(spareChangeRefund.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        SpareChangeRefund spareChangeRefund = (SpareChangeRefund) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(spareChangeRefund, "spareChangeRefund");
        return (spareChangeRefund.f84091c.f115082a <= 0 || spareChangeRefund.f84090b != w1.NOT_REQUESTED) ? new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_cta_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "REFUND_REQUEST_BUTTON_LOADING_ID", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55) : new aw0.e(false, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_disclaimer, null, null, 14), b0.BELOW_BUTTONS, new n6(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_refund_cta_request, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "REFUND_REQUEST_BUTTON_LOADING_ID", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 49);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Throwable th10 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty() && !zBooleanValue && th10 == null) {
            return u.c(m.a());
        }
        aim.e eVarB = u.b();
        List<StorePurchase> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (StorePurchase storePurchase : list) {
            arrayList.add(k3e.b.d(storePurchase, "STORE_ORDERS_SEE_ALL_ROW_" + storePurchase.f88576a));
        }
        eVarB.addAll(arrayList);
        if (zBooleanValue) {
            eVarB.add(nb0.b(pb0.Companion, "STORE_ORDERS_SEE_ALL_LOADING_ID", false, 0, false, 30));
        }
        aim.e eVarA = u.a(eVarB);
        aim.e eVarB2 = u.b();
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB2.addAll(eVarA);
        if (th10 != null) {
            eVarB2.addAll(iii.c.b(null, "STORE_ORDERS_SEE_ALL_ERROR_PAGE_ID", 4, true));
        }
        return u.a(eVarB2);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        wi0.b countryCode = (wi0.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return Intrinsics.f(countryCode, wi0.b.y2) ? new n68.l(new TextLocalisedClause(com.revolut.feature.junior.account_activation.impl.R$string.junior_signup_details_activation_header_title_sub_account, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.account_activation.impl.R$string.junior_signup_details_activation_header_subtitle_prepaid_card, null, null, 14)) : new n68.l(new TextLocalisedClause(com.revolut.feature.junior.account_activation.impl.R$string.junior_signup_details_activation_header_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.account_activation.impl.R$string.rev_u18_signup_details_activation_subtitle, null, null, 14));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        i accountStatusOpt = (i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(accountStatusOpt, "accountStatusOpt");
        z zVar = (z) accountStatusOpt.f224257a;
        if (zVar instanceof y) {
            aim.e eVarB = u.b();
            eVarB.add(new LabelNavBarMenuItem("ID_MENU_REV_POINTS_BALANCE", new ResourceImage(R$drawable.uikit_icn_24_rev_points_mono, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), v1.c.g(0, ((y) zVar).f201475a.f201472c, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4), null, null, 504));
            return u.a(eVarB);
        }
        if ((zVar instanceof z.a) || zVar == null) {
            return f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object i(Object obj2, Object obj3, Object obj4) {
        String juniorFirstName = (String) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_consent.impl.R$string.junior_blank_card_delivery_consent_prompt_title, u.c(juniorFirstName), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior_consent.impl.R$string.junior_blank_card_delivery_consent_prompt_subtitle, u.c(juniorFirstName), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.junior_consent.impl.R$string.junior_blank_card_delivery_consent_prompt_action_claim, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "BLANK_CARD_DELIVERY_PRIMARY_BUTTON_LOADING_TAG", 30);
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        id idVar = null;
        Object obj5 = null;
        return u.c(new PromptMarketingContentDelegate.Model("BLANK_CARD_DELIVERY_CONTENT_STATE_ID", textLocalisedClause, textLocalisedClause2, new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new CdnImage("blank_card_delivery", "mobile/youth/blank_card_delivery", ".jpg", null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION), null, 0 == true ? 1 : 0, 6), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.junior_consent.impl.R$string.junior_blank_card_delivery_consent_prompt_action_decline, null, null, 14), (ResourceImage) objArr, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58727c, z, "BLANK_CARD_DELIVERY_SECONDARY_BUTTON_LOADING_TAG", 22), idVar, null, obj5, null, null, null, null, null, null, null, 2095536));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x035b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r46v1 */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r46v3 */
    /* JADX WARN: Type inference failed for: r46v4 */
    /* JADX WARN: Type inference failed for: r5v1, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r45, java.lang.Object r46, java.lang.Object r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mig.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f205840a = i;
    }

    public /* synthetic */ a(l lVar, vyg.c cVar) {
        this.f205840a = 9;
    }
}
