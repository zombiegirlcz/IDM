package ajd;

import ajd.j;
import android.os.Parcelable;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import aw0.bb;
import aw0.c7;
import aw0.cb;
import aw0.l1;
import aw0.o9;
import aw0.y4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.p1;
import com.revolut.core.ui_kit.delegates.te;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.delegates.x8;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.devicemanagement.api.model.ConnectedApp;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.api.model.UserDeviceAddress;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$StoreDealsAndBrands;
import com.revolut.feature.store.api.model.StorePurchase;
import com.revolut.feature.store.api.model.StorePurchasesResponse;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$Action;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewScore;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestsRatings;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import grl.b4;
import hbg.j0;
import hmc.a0;
import hmc.b0;
import hmc.c0;
import hw0.x;
import hw0.z;
import ip0.hm0;
import ip0.ja0;
import ip0.jm0;
import ip0.la0;
import ip0.n4;
import ip0.na0;
import ip0.t6;
import ip0.v6;
import ip0.wy;
import ip0.xy;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jel.h0;
import jel.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mid.y;
import ms0.h4;
import ms0.j4;
import mx0.f3;
import mx0.h3;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.f0;
import zhm.m0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5561c;

    public /* synthetic */ t(dj0.d dVar, jk4.r rVar, boolean z) {
        this.f5559a = 10;
        this.f5561c = dVar;
        this.f5560b = z;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        String str;
        Clause clauseA;
        dj0.d dVar = (dj0.d) this.f5561c;
        RepaymentSource repaymentSource = (RepaymentSource) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
        xi0.b f68557b = repaymentSource.getF68557b();
        if (f68557b == null || (str = f68557b.f306286a) == null) {
            str = dVar.f115083b.f306286a;
        }
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        if ((repaymentSource instanceof RepaymentSource.Pocket) || (repaymentSource instanceof RepaymentSource.RevolutWallet)) {
            clauseA = jk4.r.a(new TextLocalisedClause(R$string.credit_card_auto_pay_source_personal, null, null, 14), repaymentSource.getF68558c());
        } else if (repaymentSource instanceof RepaymentSource.JointAccount) {
            clauseA = jk4.r.a(new TextLocalisedClause(R$string.credit_card_auto_pay_source_joint, null, null, 14), ((RepaymentSource.JointAccount) repaymentSource).f68555c);
        } else {
            if (!(repaymentSource instanceof RepaymentSource.ExternalAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            RepaymentSource.ExternalAccount.Companion companion = RepaymentSource.ExternalAccount.INSTANCE;
            AccountDetails.LinkedAccount linkedAccount = ((RepaymentSource.ExternalAccount) repaymentSource).f68552a;
            companion.getClass();
            clauseA = RepaymentSource.ExternalAccount.Companion.a(linkedAccount);
        }
        Clause clause = clauseA;
        boolean z = this.f5560b;
        return new f3(currencyImage, clause, null, z, z ? h3.ACTIVE : h3.ACTIVE_NOT_CLICKABLE, z);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        BigTileDelegate.Model model;
        kcg.b bVar = (kcg.b) this.f5561c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            return f0.f322471a;
        }
        boolean z = this.f5560b;
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("TRAVEL_HOME_CAMPAINS_TITLE_ID", (Image) null, (Clause) (z ? new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_campaigns_limited_time_offers_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_home_discover_deals, null, null, 14)), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List<TravelHotelsCampaign> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TravelHotelsCampaign travelHotelsCampaign : list) {
            q8g.b bVar2 = bVar.f182729a;
            if (z) {
                BigTileDelegate.Model model3 = new BigTileDelegate.Model(travelHotelsCampaign.f97892a, new TextClause(travelHotelsCampaign.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, new UrlImage(travelHotelsCampaign.f97893b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, new n4(new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_campaigns_discount_stays_title, zhm.u.c(travelHotelsCampaign.f), null, 12), false), null, new aw0.j(new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), ((j9g.s) bVar2).a(travelHotelsCampaign, q8g.a.BLACK_40), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorBlack), 0.8f), R$attr.uikit_colorTransparent, null, 1000)), true, false, null, travelHotelsCampaign, null, null, null, 66976936);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                model = model3;
            } else {
                String str = travelHotelsCampaign.f97892a;
                TextClause textClause = new TextClause(travelHotelsCampaign.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                n4 n4Var = new n4(new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_campaigns_discount_stays_title, zhm.u.c(travelHotelsCampaign.f), null, 12), false);
                UrlImage urlImage = new UrlImage(travelHotelsCampaign.f97893b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                TagViewData.Companion companion = TagViewData.INSTANCE;
                int i = R$drawable.uikit_icn_24_time;
                q8g.a aVar = q8g.a.BLACK_40;
                TextLocalisedClause textLocalisedClauseA = ((j9g.s) bVar2).a(travelHotelsCampaign, aVar);
                int iA = aVar.a();
                int iB = aVar.b();
                Integer numValueOf = Integer.valueOf(i);
                companion.getClass();
                model = new BigTileDelegate.Model(str, textClause, urlImage, null, n4Var, true, null, new BigTileDelegate.b(null, new p1(TagViewData.Companion.b(iA, iB, textLocalisedClauseA, numValueOf)), 1), null, null, travelHotelsCampaign, null, null, null, null, 33486420);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            }
            arrayList.add(model);
        }
        return v.k(model2, new hg("TRAVEL_HOME_CAMPAINS_CAROUSEL_ID", arrayList, 1, new y4(kcg.b.f182728b), null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        l3e.o oVar = (l3e.o) this.f5561c;
        StorePurchasesResponse content = (StorePurchasesResponse) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = content.f88589a;
        if (arrayList.isEmpty()) {
            if (this.f5560b) {
                return f0.f322471a;
            }
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("STORE_ORDERS_EMPTY_ID", new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_orders_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_orders_empty_state_subtitle, null, null, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_purchase_protection, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), ((jte.d) ((gte.a) oVar.f191949a.f148941b)).c(StoreApi$Toggles$StoreDealsAndBrands.f88420c) ? new l6(12, new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_orders_empty_state_action, null, null, 14), null, h4.ACCENT) : null, zj.REGULAR, false, null, null, null, 1984);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        List<StorePurchase> listV0 = d0.V0(arrayList, 3);
        ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
        for (StorePurchase storePurchase : listV0) {
            arrayList2.add(k3e.b.d(storePurchase, "STORE_ORDERS_ROW_" + storePurchase.f88576a));
        }
        return yp0.b.g(d0.E0(arrayList.size() > 3 ? zhm.u.c(new LargeActionButtonDelegate.Model("STORE_ORDERS_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_orders_purchases_see_all, null, null, 14), false, null, null, null, null, 1000)) : f0.f322471a, arrayList2), l3e.o.b(), null, 0, 0, 126);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0351  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r53, java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ajd.t.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        boolean z;
        kxg.b bVar;
        List list;
        Iterable iterable;
        List list2;
        x xVar;
        pxg.b bVar2 = (pxg.b) this.f5561c;
        kxg.b bVar3 = bVar2.f240618a;
        PerformanceChart chart = (PerformanceChart) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(chart, "chart");
        List list3 = chart.f94993c;
        List list4 = chart.f94993c;
        if (list3.isEmpty()) {
            return bVar3.b("complex-analytics-performance-chart");
        }
        List list5 = list4;
        Iterator it8 = list5.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        PerformanceChartPoint performanceChartPoint = (PerformanceChartPoint) it8.next();
        Float f = performanceChartPoint.d;
        float fMin = performanceChartPoint.f94996c;
        boolean z3 = this.f5560b;
        if (z3 && f != null) {
            fMin = Math.min(fMin, f.floatValue());
        }
        while (it8.hasNext()) {
            PerformanceChartPoint performanceChartPoint2 = (PerformanceChartPoint) it8.next();
            Float f4 = performanceChartPoint2.d;
            float fMin2 = performanceChartPoint2.f94996c;
            if (z3 && f4 != null) {
                fMin2 = Math.min(fMin2, f4.floatValue());
            }
            fMin = Math.min(fMin, fMin2);
        }
        Iterator it9 = list5.iterator();
        if (!it9.hasNext()) {
            throw new NoSuchElementException();
        }
        PerformanceChartPoint performanceChartPoint3 = (PerformanceChartPoint) it9.next();
        Float f5 = performanceChartPoint3.d;
        float fMax = performanceChartPoint3.f94996c;
        if (z3 && f5 != null) {
            fMax = Math.max(fMax, f5.floatValue());
        }
        while (it9.hasNext()) {
            PerformanceChartPoint performanceChartPoint4 = (PerformanceChartPoint) it9.next();
            Float f6 = performanceChartPoint4.d;
            float fMax2 = performanceChartPoint4.f94996c;
            if (z3 && f6 != null) {
                fMax2 = Math.max(fMax2, f6.floatValue());
            }
            fMax = Math.max(fMax, fMax2);
        }
        List<Pair> listM1 = d0.m1(list5);
        if ((listM1 instanceof Collection) && listM1.isEmpty()) {
            z = true;
        } else {
            for (Pair pair : listM1) {
                if (((PerformanceChartPoint) pair.f186385a).f94996c != ((PerformanceChartPoint) pair.f186386b).f94996c) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        int i = R$attr.uikit_dp0;
        l1.c cVar = new l1.c(2.0f);
        List listA = z3 ? pxg.b.a(list4, z, fMin, fMax, new px0.a(9)) : f0.f322471a;
        Pair pair2 = new Pair(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(1.0f));
        mxg.b bVar4 = (mxg.b) bVar2.f240619b;
        ms0.v vVar = bVar4.f210258b;
        ((lxg.b) bVar4.f210257a).getClass();
        if (fMin == fMax) {
            iterable = f0.f322471a;
            bVar = bVar3;
            list = list4;
        } else {
            float f32 = (fMax - fMin) / 3;
            bVar = bVar3;
            list = list4;
            kotlin.ranges.e eVar = new kotlin.ranges.e(0L, 3L);
            ArrayList arrayList = new ArrayList(w.t(eVar, 10));
            Iterator<Long> it10 = eVar.iterator();
            while (((vim.g) it10).f289628c) {
                arrayList.add(Float.valueOf((((m0) it10).nextLong() * f32) + fMin));
            }
            iterable = arrayList;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList2 = new ArrayList(w.t(iterable2, 10));
        Iterator it11 = iterable2.iterator();
        while (it11.hasNext()) {
            float fFloatValue = ((Number) it11.next()).floatValue();
            Iterator it12 = it11;
            arrayList2.add(new hw0.a(fMin == fMax ? BitmapDescriptorFactory.HUE_RED : (fFloatValue - fMin) / (fMax - fMin), new PercentageClause(e1.Z(new BigDecimal(String.valueOf(fFloatValue))), (PercentageClause.Format) null, (Style) null, 6)));
            it11 = it12;
        }
        z zVar = new z(vVar, false, true, (List) arrayList2);
        hm0 hm0Var = hm0.Thick;
        cb.Companion.getClass();
        cb cbVarC = bb.c();
        ArrayList arrayListA = ((nxg.b) bVar2.f240620c).a();
        PerformanceChartPoint performanceChartPoint5 = (PerformanceChartPoint) d0.d0(list);
        if (performanceChartPoint5 != null) {
            float f35 = performanceChartPoint5.f94996c;
            float f36 = fMin == fMax ? BitmapDescriptorFactory.HUE_RED : (f35 - fMin) / (fMax - fMin);
            list2 = null;
            xVar = new x(z ? BitmapDescriptorFactory.HUE_RED : f36, BitmapDescriptorFactory.HUE_RED, new PercentageClause(e1.Z(new BigDecimal(String.valueOf(f35))), (PercentageClause.Format) null, (Style) null, 6), null, f36 > 0.5f ? hw0.c.BELOW_LINE : hw0.c.ABOVE_LINE, hw0.b.START, false, false, null, 1994);
        } else {
            list2 = null;
            xVar = null;
        }
        jm0 jm0Var = new jm0("complex-analytics-performance-chart", cbVarC, pxg.b.a(list, z, fMin, fMax, new px0.a(10)), false, xVar, null, 0, false, bVar.a(), pair2, false, false, zVar, listA.size() > 1 ? zhm.u.c(new hw0.d(listA, false, R$attr.uikit_colorDeepGrey, 12)) : list2, cVar, hm0Var, arrayListA, null, null, null, 0, 0, 0, 0, -652248);
        int i2 = R$attr.uikit_dp0;
        yp0.b.p(jm0Var, i2, i2, i, i);
        return zhm.u.c(jm0Var);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        qwd.m mVar = (qwd.m) this.f5561c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        io3.d pocket = (io3.d) pair.f186385a;
        PaymentPocketInfo pocketInfo = (PaymentPocketInfo) pair.f186386b;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        io3.l lVar = pocket.e;
        Clause textLocalisedClause = (lVar == io3.l.CURRENT || lVar == io3.l.REVX_FIAT) ? lVar == io3.l.REVX_FIAT ? new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_exchange_balance_rev_x_fiat, null, null, 14) : cp5.d.A(z92.f.l(pocket)) ? new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_exchange_balance_current, null, null, 14) : null : pocketInfo.f79170b;
        MoneyClause moneyClause = new MoneyClause(z92.f.j(pocket), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        Clause clause = textLocalisedClause == null ? moneyClause : textLocalisedClause;
        MoneyClause moneyClause2 = textLocalisedClause != null ? moneyClause : null;
        Image image = pocketInfo.f79169a;
        h3 h3Var = mVar.i instanceof axd.a ? h3.ERROR : h3.ACTIVE;
        boolean z = this.f5560b;
        return new f3(image, clause, moneyClause2, z, h3Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Style, java.lang.Integer, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8 */
    private final Object h(Object obj2, Object obj3, Object obj4) {
        List listG;
        List list;
        ?? r06;
        String str;
        String str2;
        s86.m mVar;
        r86.d dVar = (r86.d) this.f5561c;
        UserDevice device = (UserDevice) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        w8 w8Var = null;
        if (device.f71926s.isEmpty()) {
            listG = f0.f322471a;
        } else {
            List<ConnectedApp> list2 = device.f71926s;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (ConnectedApp connectedApp : list2) {
                arrayList.add(new RowDelegate.Model(j6.a.q("CONNECTED_APPS_ROW_LIST_ID_", connectedApp.f71912a), new RowDelegate.Model.MainImage.Image40(new UrlImage(connectedApp.f71913b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new RoundedRectTransformation(11.0f, 1.0f, R$attr.uikit_colorBlack_5), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 62), new TextClause(connectedApp.f71912a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
            }
            listG = yp0.b.g(arrayList, new ListSubheaderDelegate.Model("CONNECTED_APPS_TITLE_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_connected_apps, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        Intrinsics.checkNotNullParameter(device, "device");
        s86.m mVar2 = new s86.m(dVar.f252377a.a(device), dVar.a(device), v.l(this.f5560b ? new ActionsView.Item("DEVICE_ACTIONS_LOGOUT_LIST_ID", null, false, null, null, new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_log_out, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_logout_door, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, "DEVICE_ACTIONS_LOGOUT_LIST_ID", null, null, null, 30622) : null), device.f71921m ? new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_this_device, null, null, 14) : new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_last_activity, null, null, 14), new TimeClause(device.o, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)), new DotDividerClause((Integer) null), null, null, 12));
        Intrinsics.checkNotNullParameter(device, "device");
        UserDeviceAddress userDeviceAddress = device.f71924q;
        String str3 = device.f71922n;
        double d = userDeviceAddress.e;
        double d5 = userDeviceAddress.f;
        if (d == 0.0d || d5 == 0.0d) {
            list = listG;
            r06 = 0;
            str = str3;
            str2 = "elements";
            mVar = mVar2;
        } else {
            TextClause[] elements = {!kotlin.text.d0.W(userDeviceAddress.d) ? new TextClause(userDeviceAddress.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, !kotlin.text.d0.W(userDeviceAddress.f71929b) ? new TextClause(userDeviceAddress.f71929b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            list = listG;
            r06 = 0;
            str = str3;
            str2 = "elements";
            mVar = mVar2;
            w8 w8Var2 = new w8("DEVICE_MAP_LIST_ID", new CompositeClause(kotlin.collections.d.L(elements), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, new x8(userDeviceAddress.e, d5), null, null, null, null, device, 0, 0, 63476);
            yp0.b.l(w8Var2, 0, 0, 0, 0, null, false, 63);
            w8Var = w8Var2;
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("DEVICE_LOGIN_LIST_ID", new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_login_date, r06, r06, 14), new CompositeClause(v.k(new TimeClause(device.f71923p, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), new TimeClause(device.f71923p, new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12)), new DotDividerClause((Integer) r06), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_brand, r06, r06, 14);
        String strA = device.f;
        if (kotlin.text.d0.W(strA)) {
            strA = device.f71915b.a();
        }
        String str4 = str;
        CellDetailsDelegate.Model[] modelArr = {model, new CellDetailsDelegate.Model("DEVICE_BRAND_LIST_ID", textLocalisedClause, new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("DEVICE_VERSION_LIST_ID", new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_version, r06, r06, 14), kotlin.text.d0.J(str4, "unknown", true) ? new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_unknown, r06, r06, 14) : new TextClause(kotlin.text.d0.W(str4) ? device.f71919j : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760), device.f71917g.length() > 0 ? new CellDetailsDelegate.Model("DEVICE_APP_VERSION_LIST_ID", new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_app_version, r06, r06, 14), new TextClause(device.f71917g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760) : r06, new CellDetailsDelegate.Model("DEVICE_IP_LIST_ID", new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_ip_address, r06, r06, 14), kotlin.text.d0.J(device.f71918h, "unknown", true) ? new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_unknown, r06, r06, 14) : new TextClause(device.f71918h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760)};
        Intrinsics.checkNotNullParameter(modelArr, str2);
        List listL = kotlin.collections.d.L(modelArr);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new s86.i(mVar, i2b.a.o(i2b.a.q(w8Var, listL), list));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        la0 la0Var;
        t6 t6Var;
        sdg.l lVar = (sdg.l) this.f5561c;
        HotelsPropertyGuestsRatings guestsRatings = (HotelsPropertyGuestsRatings) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(guestsRatings, "ratings");
        sdg.c cVar = lVar.f261886a;
        Intrinsics.checkNotNullParameter(guestsRatings, "guestsRatings");
        s0 s0Var = new s0(2);
        HotelsPropertyGuestReviewScore hotelsPropertyGuestReviewScoreA = sdg.c.a(guestsRatings.f98032b);
        int i = guestsRatings.f98031a;
        if (hotelsPropertyGuestReviewScoreA != null) {
            double d = hotelsPropertyGuestReviewScoreA.f98026b;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_property_reviews_overall_rating_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
            jul.o oVar = cVar.f261874a;
            la0Var = new la0("OVERALL_RATING_ITEM_ID", textLocalisedClause, this.f5560b ? new TextLocalisedQuantityClause(R$plurals.hotels_property_verified_reviews_french_title, Integer.valueOf(i), zhm.u.c(new TextClause(oVar.g(lzl.a.THREE_DIGITS_SEPARATED, Integer.valueOf(i)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8) : new TextLocalisedQuantityClause(R$plurals.hotels_common_reviews_count, Integer.valueOf(i), zhm.u.c(new TextClause(oVar.g(lzl.a.THREE_DIGITS_SEPARATED, Integer.valueOf(i)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), new TextClause(String.valueOf(d), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, null, null, null, null, new ja0(na0.f165478b), null, 32240);
        } else {
            la0Var = null;
        }
        s0Var.a(la0Var);
        List list = guestsRatings.f98032b;
        ArrayList<HotelsPropertyGuestReviewScore> arrayListA0 = d0.A0(list, sdg.c.a(list));
        ArrayList arrayList = new ArrayList(w.t(arrayListA0, 10));
        for (HotelsPropertyGuestReviewScore hotelsPropertyGuestReviewScore : arrayListA0) {
            if (hotelsPropertyGuestReviewScore != null) {
                String strQ = j6.a.q("CATEGORY_RATING_ITEM_ID", hotelsPropertyGuestReviewScore.d);
                TextClause textClause = new TextClause(hotelsPropertyGuestReviewScore.d, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                double d5 = hotelsPropertyGuestReviewScore.f98026b;
                t6Var = new t6(strQ, textClause, (int) (((double) 10) * d5), new TextClause(String.valueOf(d5), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, new v6(R$attr.uikit_colorGreyTone20_50, h9g.e.f(d5)), 496);
            } else {
                t6Var = null;
            }
            arrayList.add(t6Var);
        }
        s0Var.b(arrayList.toArray(new qv0.i[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        List listM = v.m(arrayList2.toArray(new qv0.i[arrayList2.size()]));
        yp0.b.k(listM, 0, 0, 0, 0, 31);
        return listM;
    }

    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        j jVar;
        Iterator it8;
        List list;
        int i;
        char c2;
        List listO;
        List list2;
        List listK;
        List listQ;
        NotificationCentreItemDelegate.Model model;
        List list3;
        ArrayList arrayListU;
        char c3;
        List listB;
        List listA;
        RowDelegate.Model modelA;
        List listL;
        List listL2;
        RowDelegate.Model modelA2;
        List listP0;
        FundDetailsScreenContract$Action.NavigateToHoldingDetails navigateToHoldingDetails;
        FundDetailsScreenContract$Action.NavigateToHoldingDetails navigateToHoldingDetails2;
        List list4;
        List list5;
        ArrayList arrayListF0;
        List listP02;
        Object showHoldingInfo;
        int i2 = this.f5559a;
        int i3 = 10;
        Object objG = null;
        int i5 = 4;
        boolean z = this.f5560b;
        Object obj5 = this.f5561c;
        switch (i2) {
            case 0:
                int i6 = 2;
                Pair pair = (Pair) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                n nVar = (n) pair.f186385a;
                j revPointsState = (j) pair.f186386b;
                List recentSearches = ((h) obj5).f5542a;
                if (!(nVar instanceof m)) {
                    throw new NoWhenBranchMatchedException();
                }
                List results = ((m) nVar).f5549a;
                Intrinsics.checkNotNullParameter(results, "results");
                Intrinsics.checkNotNullParameter(recentSearches, "recentSearches");
                Intrinsics.checkNotNullParameter(revPointsState, "revPointsState");
                if (zBooleanValue) {
                    return bjd.c.a(z);
                }
                boolean z3 = !Intrinsics.f(revPointsState, j.a.f5546a);
                List list6 = results;
                ArrayList arrayList = new ArrayList(w.t(list6, 10));
                Iterator it9 = list6.iterator();
                int i21 = 0;
                while (it9.hasNext()) {
                    Object next = it9.next();
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        v.s();
                        throw null;
                    }
                    mid.w wVar = (mid.w) next;
                    if (wVar instanceof mid.r) {
                        if (revPointsState instanceof k) {
                            model = new NotificationCentreItemDelegate.Model("SHOPS_SEARCH_LAYOUT_EMPTY_NOTIFICATION", new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_search_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_search_empty_subtitle_with_revpoints, null, null, 14), null, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, null, 259440);
                        } else if (revPointsState instanceof j.b) {
                            model = new NotificationCentreItemDelegate.Model("SHOPS_SEARCH_LAYOUT_EMPTY_NOTIFICATION", new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_search_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_search_empty_subtitle_without_revpoints, null, null, 14), new wy(new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_search_empty_button, null, null, 14), xy.SECONDARY_ACTIVE, null), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, null, 261472);
                        } else {
                            if (!(revPointsState instanceof j.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            model = new NotificationCentreItemDelegate.Model("SHOPS_SEARCH_LAYOUT_EMPTY_NOTIFICATION", new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_search_empty_cashback_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_search_empty_cashback_subtitle, null, null, 14), null, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, null, 259440);
                            List listC = zhm.u.c(model);
                            yp0.b.k(listC, 0, 0, 0, 0, 31);
                            jVar = revPointsState;
                            it8 = it9;
                            list = recentSearches;
                            i = i3;
                            list2 = listC;
                        }
                        List listC2 = zhm.u.c(model);
                        yp0.b.k(listC2, 0, 0, 0, 0, 31);
                        jVar = revPointsState;
                        it8 = it9;
                        list = recentSearches;
                        i = i3;
                        list2 = listC2;
                    } else if (wVar instanceof mid.s) {
                        String str = ((mid.s) wVar).f205756a;
                        if (recentSearches.isEmpty()) {
                            listQ = f0.f322471a;
                        } else {
                            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            ListSubheaderDelegate.Model.a.b bVar = new ListSubheaderDelegate.Model.a.b(false, false, false, 3);
                            int i32 = R$attr.uikit_dp16;
                            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("SHOPS_SEARCH_LAYOUT_RECENT_SEARCH_HEADER", (Image) null, (Clause) textClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) bVar, false, false, (Object) null, (Parcelable) null, 0, 0, i32, i32, 16314);
                            List<mid.j> listV0 = d0.V0(recentSearches, 3);
                            ArrayList arrayList2 = new ArrayList(w.t(listV0, i3));
                            for (mid.j jVar2 : listV0) {
                                arrayList2.add(new RowDelegate.Model(p.a.m(jVar2.f205716b, "SHOPS_SEARCH_LAYOUT_RECENT_SEARCH_ITEM_"), new RowDelegate.Model.MainImage.Image24(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_search, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), false, false, 6), new TextClause(jVar2.f205715a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite_10), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, null, false, null, null, null, null, null, null, jVar2, null, 0, 0, 0, 0, 532675576));
                            }
                            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                            listQ = i2b.a.q(model2, arrayList2);
                        }
                        jVar = revPointsState;
                        it8 = it9;
                        list = recentSearches;
                        list2 = listQ;
                        i = 10;
                    } else {
                        if (wVar instanceof mid.u) {
                            mid.u uVar = (mid.u) wVar;
                            String str2 = uVar.f205762a;
                            ArrayList arrayList3 = uVar.f205763b;
                            if (arrayList3.isEmpty()) {
                                jVar = revPointsState;
                                it8 = it9;
                                list = recentSearches;
                                listK = f0.f322471a;
                            } else {
                                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                int i33 = 0;
                                for (Object obj6 : arrayList3) {
                                    int i43 = i33 + 1;
                                    if (i33 < 0) {
                                        v.s();
                                        throw null;
                                    }
                                    y yVar = (y) obj6;
                                    String str3 = yVar.d;
                                    ShopsCampaignOffer shopsCampaignOffer = yVar.f;
                                    List list7 = recentSearches;
                                    mid.h hVar = new mid.h(shopsCampaignOffer.z, str3, shopsCampaignOffer.u, shopsCampaignOffer.f87036t);
                                    arrayList4.add(new RewardDelegate.Model(a0.d.g(i21, i33, "SHOPS_SEARCH_LAYOUT_GRID_ITEM_ID_", ":"), (Image) new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, hjd.d.f152705a, null, null, false, false, 507902), (Clause) new TextClause(yVar.f205780b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (CompositeClause) null, (RewardDelegate.a) null, false, (Object) new mid.k(shopsCampaignOffer, hVar), new AnalyticsContext(zid.a.b(hVar)), Constants.TAG_FULL_SVPP_IDENTIFICATION));
                                    revPointsState = revPointsState;
                                    it9 = it9;
                                    i33 = i43;
                                    recentSearches = list7;
                                }
                                jVar = revPointsState;
                                it8 = it9;
                                list = recentSearches;
                                String strN = a0.d.n("SHOPS_SEARCH_LAYOUT_GRID_HEADER_", i21);
                                TextClause textClause2 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                ListSubheaderDelegate.Model.a.b bVar2 = new ListSubheaderDelegate.Model.a.b(false, false, false, 3);
                                int i59 = R$attr.uikit_dp16;
                                ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model(strN, (Image) null, (Clause) textClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) bVar2, false, false, (Object) null, (Parcelable) null, 0, 0, i59, i59, 16314);
                                te teVar = new te(a0.d.n("SHOPS_SEARCH_LAYOUT_GRID_ID_", i21), arrayList4, 124);
                                yp0.b.l(teVar, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
                                qv0.i[] iVarArr = new qv0.i[i6];
                                iVarArr[0] = model3;
                                iVarArr[1] = teVar;
                                listK = v.k(iVarArr);
                            }
                            list2 = listK;
                            i = 10;
                            c2 = 6;
                        } else {
                            jVar = revPointsState;
                            it8 = it9;
                            list = recentSearches;
                            if (wVar instanceof mid.v) {
                                mid.v vVar = (mid.v) wVar;
                                String str4 = vVar.f205766a;
                                ArrayList<y> arrayList5 = vVar.f205767b;
                                if (arrayList5.isEmpty()) {
                                    listO = f0.f322471a;
                                    i = 10;
                                    c2 = 6;
                                } else {
                                    i = 10;
                                    ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                    for (y yVar2 : arrayList5) {
                                        EarningBadge earningBadge = yVar2.e;
                                        ShopsCampaignOffer shopsCampaignOffer2 = yVar2.f;
                                        TagViewData tagViewDataA = hjd.z.a(earningBadge, z3);
                                        String str5 = yVar2.d;
                                        mid.h hVar2 = new mid.h(shopsCampaignOffer2.z, str5, shopsCampaignOffer2.u, shopsCampaignOffer2.f87036t);
                                        arrayList6.add(new RowDelegate.Model(a0.d.n("SHOPS_SEARCH_LAYOUT_ROW_ITEM_ID_", i21), new RowDelegate.Model.MainImage.Image40(new UrlImage(str5, null, null, null, 0L, null, null, null, null, null, false, hjd.d.f152705a, null, null, false, false, 507902), null, null, false, null, false, 60), new TextClause(yVar2.f205780b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(yVar2.f205781c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.a(tagViewDataA, null, false, 6), false, null, false, null, null, null, null, null, null, new mid.k(shopsCampaignOffer2, hVar2), new AnalyticsContext(zid.a.b(hVar2)), 0, 0, 0, 0, 524286936));
                                    }
                                    c2 = 6;
                                    yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                                    TextClause textClause3 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                                    ListSubheaderDelegate.Model.a.b bVar3 = new ListSubheaderDelegate.Model.a.b(false, false, false, 3);
                                    int i66 = R$attr.uikit_dp16;
                                    listO = i2b.a.o(zhm.u.c(new ListSubheaderDelegate.Model("SHOPS_SEARCH_LAYOUT_ROW_HEADER_", (Image) null, (Clause) textClause3, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) bVar3, false, false, (Object) null, (Parcelable) null, 0, 0, i66, i66, 16314)), arrayList6);
                                }
                            } else {
                                i = 10;
                                c2 = 6;
                                if (!(wVar instanceof mid.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                listO = f0.f322471a;
                            }
                            list2 = listO;
                        }
                        arrayList.add(list2);
                        revPointsState = jVar;
                        it9 = it8;
                        i3 = i;
                        i21 = i22;
                        recentSearches = list;
                        i6 = 2;
                    }
                    c2 = 6;
                    arrayList.add(list2);
                    revPointsState = jVar;
                    it9 = it8;
                    i3 = i;
                    i21 = i22;
                    recentSearches = list;
                    i6 = 2;
                }
                return w.u(arrayList);
            case 1:
                fnc.s sVar = (fnc.s) obj5;
                RoboPortfolioInfo content = (RoboPortfolioInfo) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                if (content.i) {
                    String portfolioId = content.f95703c;
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    return yp0.b.g(zhm.u.c(new RowDelegate.Model("strategy-information-listId", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_services, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_about_strategy_information_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_about_strategy_information_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, new fnc.n(portfolioId), null, 0, 0, 0, 0, 532676568)), new ListSubheaderDelegate.Model("about-portfolio-title-listId-header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_about_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                }
                f4h.a aVar = (f4h.a) sVar.f136657b;
                Template template = content.f95701a;
                Data dataP = template != null ? zi0.c.P(template, false, null, 3) : null;
                return (dataP == null || (list3 = (List) iii.c.f(dataP, new hmc.a(i3), new hkb.e(9), new t(aVar, z, i5))) == null) ? f0.f322471a : list3;
            case 2:
                List experiences = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(experiences, "experiences");
                hag.f fVar = ((j0) obj5).f150701a;
                Intrinsics.checkNotNullParameter(experiences, "experiences");
                return fVar.e.a(experiences, z);
            case 3:
                hmc.o oVar = (hmc.o) obj5;
                c0 state = (c0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(state, "content");
                if (state == null) {
                    hx7.e.n(new IllegalArgumentException(a0.d.l(state.getClass(), "Invalid state. RoboSettingsWidgetMapper received ")));
                    return f0.f322471a;
                }
                b0 state2 = state.f153631b;
                ilc.a aVar2 = state.f153630a;
                if (state2 != null) {
                    String str6 = state2.f153626a;
                    a0 templateChangeState = state2.d;
                    List listC3 = z ? zhm.u.c(oVar.a()) : null;
                    hmc.n nVar2 = oVar.f153653a;
                    gte.a aVar3 = nVar2.f153652b;
                    Intrinsics.checkNotNullParameter(templateChangeState, "templateChangeState");
                    boolean z4 = templateChangeState instanceof hmc.y;
                    if (z4) {
                        c3 = 2;
                        jte.d dVar = (jte.d) aVar3;
                        listB = (dVar.c(RoboApi$Toggles.RoboPortfolioDetailsScreenRevamp.f85023c) && dVar.c(RoboApi$Toggles.RoboOnboardingReassessment.f85022c)) ? hmc.n.b(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_change_requested_v2_eea_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_change_requested_v2_eea_text, null, null, 14)) : hmc.n.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_change_requested_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_change_requested_text, zhm.u.c(nVar2.f153651a.g(((hmc.y) templateChangeState).f153670a)), null, 12));
                    } else {
                        c3 = 2;
                        if (templateChangeState instanceof hmc.z) {
                            LocalDate localDate = ((hmc.z) templateChangeState).f153671a;
                            if (localDate != null) {
                                jte.d dVar2 = (jte.d) aVar3;
                                if (dVar2.c(RoboApi$Toggles.RoboPortfolioDetailsScreenRevamp.f85023c) && dVar2.c(RoboApi$Toggles.RoboOnboardingReassessment.f85022c)) {
                                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_portfolio_recently_changed_v2_eea_title, null, null, 14);
                                    int i74 = com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_portfolio_recently_changed_v2_eea_description;
                                    com.revolut.core.ui_kit.models.j jVar3 = c7.Companion;
                                    LocalDateClause$DateFormat.DateMedium dateMedium = new LocalDateClause$DateFormat.DateMedium(n0.HIDE_CURRENT_YEAR);
                                    jVar3.getClass();
                                    listA = hmc.n.b(textLocalisedClause, new TextLocalisedClause(i74, zhm.u.c(com.revolut.core.ui_kit.models.j.a(localDate, dateMedium, null)), null, 12));
                                } else {
                                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_portfolio_recently_changed_title, null, null, 14);
                                    int i92 = com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_portfolio_recently_changed_description;
                                    com.revolut.core.ui_kit.models.j jVar4 = c7.Companion;
                                    LocalDateClause$DateFormat.DateMedium dateMedium2 = new LocalDateClause$DateFormat.DateMedium(n0.HIDE_CURRENT_YEAR);
                                    jVar4.getClass();
                                    listA = hmc.n.a(textLocalisedClause2, new TextLocalisedClause(i92, zhm.u.c(com.revolut.core.ui_kit.models.j.a(localDate, dateMedium2, null)), null, 12));
                                }
                                listB = listA;
                            } else {
                                listB = null;
                            }
                            if (listB == null) {
                                listB = f0.f322471a;
                            }
                        } else {
                            if (!templateChangeState.equals(hmc.x.f153669a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            listB = f0.f322471a;
                        }
                    }
                    List list8 = listB;
                    yp0.b.k(list8, 0, 0, 0, 0, 31);
                    hmc.j jVar5 = oVar.f153654b;
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(state2, "settings");
                    gte.a aVar4 = jVar5.f153647a;
                    WealthUiApi$Toggles.RoboStrategies roboStrategies = WealthUiApi$Toggles.RoboStrategies.f95863c;
                    if (((jte.d) aVar4).c(roboStrategies)) {
                        listL = f0.f322471a;
                    } else {
                        Template template2 = state2.f153628c;
                        if (templateChangeState instanceof hmc.x) {
                            modelA = hmc.j.a(aVar2, str6, template2, true);
                        } else if (z4) {
                            modelA = hmc.j.a(aVar2, str6, template2, false);
                        } else {
                            if (!(templateChangeState instanceof hmc.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modelA = ((hmc.z) templateChangeState).f153671a != null ? hmc.j.a(aVar2, str6, template2, false) : null;
                        }
                        listL = v.l(modelA);
                    }
                    List list9 = listL;
                    yp0.b.k(list9, 0, 0, 0, 0, 31);
                    hmc.m mVar = oVar.f153655c;
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(state2, "settings");
                    if (((Boolean) mVar.f153650b.getValue()).booleanValue() && state2.e && (aVar2 == ilc.a.EEA || aVar2 == ilc.a.GB)) {
                        if (templateChangeState instanceof hmc.x) {
                            modelA2 = mVar.a(str6, true);
                        } else if (z4) {
                            modelA2 = mVar.a(str6, false);
                        } else {
                            if (!(templateChangeState instanceof hmc.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modelA2 = ((hmc.z) templateChangeState).f153671a != null ? mVar.a(str6, false) : null;
                        }
                        listL2 = v.l(modelA2);
                    } else {
                        listL2 = f0.f322471a;
                    }
                    List list10 = listL2;
                    yp0.b.k(list10, 0, 0, 0, 0, 31);
                    hmc.k kVar = oVar.d;
                    Intrinsics.checkNotNullParameter(state2, "state");
                    List listC4 = zhm.u.c(new CellDetailsChevronDelegate.Model("close-account-cell", new TextLocalisedClause(((jte.d) kVar.f153648a).c(roboStrategies) ? com.revolut.retail.wealth.resources.R$string.wealth_strategies_settings_action_close_account : com.revolut.retail.wealth.resources.R$string.wealth_robo_settings_action_close_account, null, null, 14), R$attr.uikit_colorRed, false, new hmc.r(str6), null, null, YearClass.CLASS_2016));
                    yp0.b.k(listC4, 0, 0, 0, 0, 31);
                    List[] elements = new List[5];
                    elements[0] = listC3;
                    elements[1] = list8;
                    elements[c3] = list9;
                    elements[3] = list10;
                    elements[4] = listC4;
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    arrayListU = w.u(kotlin.collections.d.L(elements));
                } else {
                    arrayListU = null;
                }
                return arrayListU == null ? f0.f322471a : arrayListU;
            case 4:
                Template template3 = (Template) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(template3, "template");
                return ((ooc.b) ((f4h.a) obj5).f132229b).a(template3, z);
            case 5:
                igh.c cVar = (igh.c) obj5;
                jel.b0 fundDetails = (jel.b0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(fundDetails, "fundDetails");
                jel.x xVar = fundDetails.f173416j;
                List list11 = xVar != null ? xVar.f173597a : null;
                if (list11 != null && (listP0 = d0.P0(list11, new igh.b())) != null) {
                    List<i0> listV02 = (z || listP0.size() <= 5) ? listP0 : d0.V0(listP0, 5);
                    ArrayList arrayList7 = new ArrayList(w.t(listV02, 10));
                    for (i0 i0Var : listV02) {
                        xi0.b bVar4 = i0Var.e;
                        String str7 = i0Var.f173472a;
                        if (bVar4 != null) {
                            if (cp5.d.C(bVar4)) {
                                navigateToHoldingDetails2 = new FundDetailsScreenContract$Action.NavigateToHoldingDetails(bVar4.f306286a);
                            } else {
                                cp5.d.A(bVar4);
                                navigateToHoldingDetails2 = null;
                            }
                            navigateToHoldingDetails = navigateToHoldingDetails2;
                        } else {
                            navigateToHoldingDetails = null;
                        }
                        arrayList7.add(new RowDelegate.Model(j6.a.q("FUND_DETAILS_ALL_HOLDINGS_ITEM", str7), new RowDelegate.Model.MainImage.Image24(cVar.f161205a.a(R$attr.uikit_colorIndigo, i0Var.f173474c, str7), false, false, 6), new TextClause(i0Var.f173472a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new PercentageClause(e1.Z(i0Var.f173473b), (PercentageClause.Format) null, (Style) null, 6), null, null, false, LDSFile.EF_DG14_TAG), navigateToHoldingDetails != null, null, false, null, null, null, null, null, null, navigateToHoldingDetails, null, 0, 0, 0, 0, 532673528));
                    }
                    if (listP0.size() > 5) {
                        arrayList7 = d0.F0(new LargeActionButtonDelegate.Model("FUND_DETAILS_ALL_HOLDINGS_BUTTON", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(z ? com.revolut.feature.wealth.private_equity.impl.R$string.wealth_venture_capital_fund_details_holdings_see_fewer_button : com.revolut.feature.wealth.private_equity.impl.R$string.wealth_venture_capital_fund_details_holdings_see_all_button, null, null, 14), false, null, null, FundDetailsScreenContract$Action.ToggleAllHoldings.f95758a, null, 744), arrayList7);
                    }
                    ArrayList arrayList8 = arrayList7;
                    yp0.b.k(arrayList8, 0, 0, 0, 0, 31);
                    objG = arrayList8;
                }
                return objG == null ? f0.f322471a : objG;
            case 6:
                igh.j jVar6 = (igh.j) obj5;
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                jel.b0 b0Var = (jel.b0) pair2.f186385a;
                nel.n nVar3 = (nel.n) pair2.f186386b;
                h0 h0Var = b0Var.d;
                if (h0Var != null && (list4 = h0Var.e) != null && (list5 = (List) ue0.e.M(list4)) != null) {
                    jel.w wVarI = ifk.b.i(nVar3);
                    if ((wVarI == null ? -1 : igh.i.f161210a[wVarI.ordinal()]) == 1) {
                        arrayListF0 = jVar6.a(list5);
                    } else {
                        ArrayList arrayListA = jVar6.a(list5);
                        String str8 = b0Var.f173412b;
                        h4 h4Var = h4.SEMIACCENT;
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_about_highlights_aboutTheFund, null, null, 14);
                        int i96 = R$attr.uikit_dp16;
                        arrayListF0 = d0.F0(new SmallActionButtonDelegate.Model("FUND_DETAILS_HIGHLIGHTS_ABOUT_THE_FUND", h4Var, null, null, textLocalisedClause3, null, j4.f208300a, new FundDetailsScreenContract$Action.NavigateToFundHighlights(str8), null, i96, i96, i96, i96, 1368), arrayListA);
                    }
                    ArrayList arrayList9 = arrayListF0;
                    if (z) {
                        objG = yp0.b.g(arrayList9, new ListSubheaderDelegate.Model("FUND_DETAILS_HIGHLIGHTS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_fund_highlights_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                    } else {
                        yp0.b.k(arrayList9, 0, 0, 0, 0, 31);
                        objG = arrayList9;
                    }
                }
                return objG == null ? f0.f322471a : objG;
            case 7:
                igh.n nVar4 = (igh.n) obj5;
                jel.b0 fundDetails2 = (jel.b0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(fundDetails2, "fundDetails");
                jel.x xVar2 = fundDetails2.f173416j;
                List list12 = xVar2 != null ? xVar2.f173597a : null;
                if (list12 != null && (listP02 = d0.P0(list12, new igh.m())) != null) {
                    List<i0> list13 = listP02;
                    ArrayList arrayList10 = new ArrayList(w.t(list13, 10));
                    for (i0 i0Var2 : list13) {
                        vfh.a aVar5 = nVar4.f161213a;
                        String str9 = i0Var2.f173474c;
                        BigDecimal bigDecimal = i0Var2.f173473b;
                        String str10 = i0Var2.f173472a;
                        Image imageA = aVar5.a(R$attr.uikit_colorIndigo, str9, str10);
                        if (z) {
                            xi0.b bVar5 = i0Var2.e;
                            if (bVar5 == null) {
                                showHoldingInfo = null;
                            } else if (cp5.d.C(bVar5)) {
                                showHoldingInfo = new FundDetailsScreenContract$Action.NavigateToHoldingDetails(bVar5.f306286a);
                            } else {
                                cp5.d.A(bVar5);
                                showHoldingInfo = null;
                            }
                        } else {
                            showHoldingInfo = new FundDetailsScreenContract$Action.ShowHoldingInfo(str10, bigDecimal, imageA, i0Var2.d);
                        }
                        Object obj7 = showHoldingInfo;
                        arrayList10.add(new ReferralContactDelegate.Model("FUND_DETAILS_HOLDINGS_ITEM".concat(str10), imageA, new TextClause(i0Var2.f173472a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new PercentageClause(e1.Z(bigDecimal), (PercentageClause.Format) null, (Style) null, 6), null, null, obj7 != null, null, obj7, 387024));
                    }
                    List list14 = (List) ue0.e.M(arrayList10);
                    if (list14 != null) {
                        objG = yp0.b.i(new eg("FUND_DETAILS_HOLDINGS_SCROLLER_BOX", list14, null, 4.0f, 0, 0, 1012), new ListSubheaderDelegate.Model("FUND_DETAILS_HOLDINGS_HEADER", (Image) null, (Clause) (z ? new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_holdings_header, null, null, 14) : new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_featured_holdings_header, null, null, 14)), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                    }
                }
                return objG == null ? f0.f322471a : objG;
            case 8:
                yik.h hVar3 = ((ik7.e) obj5).f161904a;
                ik7.d reasonNotListedInfo = (ik7.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(reasonNotListedInfo, "reasonNotListedInfo");
                boolean z6 = reasonNotListedInfo.f161901a;
                hha.d dVar3 = reasonNotListedInfo.f161903c;
                TextClause textClause4 = reasonNotListedInfo.d;
                if (!z6) {
                    return null;
                }
                if (z) {
                    ActionWidgetDelegate.Model model4 = new ActionWidgetDelegate.Model("ID_REASON_NOT_LISTED_ITEM", new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_cancellation_reason_not_listed_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_cancellation_reason_not_listed_description, v.k(fgk.b.a(hVar3, dVar3), textClause4), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D174", null, null, null, 30), null, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_cancellation_reason_not_listed_action_proceed, zhm.u.c(textClause4), null, 12), null, 14), null, null, null, b4.EXPIRED_OR_INVALID_KEY_VALUE);
                    yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                    return model4;
                }
                RowDelegate.Model model5 = new RowDelegate.Model("ID_REASON_NOT_LISTED_ITEM", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D174", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_cancellation_reason_not_listed_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_cancellation_reason_not_listed_description, v.k(fgk.b.a(hVar3, dVar3), textClause4), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                return model5;
            case 9:
                Template content2 = (Template) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                return ((inc.j) obj5).e.a(content2, z);
            case 10:
                return a(obj2, obj3, obj4);
            case 11:
                return b(obj2, obj3, obj4);
            case 12:
                return c(obj2, obj3, obj4);
            case 13:
                return d(obj2, obj3, obj4);
            case 14:
                return e(obj2, obj3, obj4);
            case 15:
                return g(obj2, obj3, obj4);
            case 16:
                return h(obj2, obj3, obj4);
            case 17:
                return i(obj2, obj3, obj4);
            default:
                return AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0((Function0) obj5, z, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }

    public /* synthetic */ t(Object obj2, boolean z, int i) {
        this.f5559a = i;
        this.f5561c = obj2;
        this.f5560b = z;
    }

    public /* synthetic */ t(Object obj2, boolean z, Object obj3, int i) {
        this.f5559a = i;
        this.f5560b = z;
        this.f5561c = obj3;
    }

    public /* synthetic */ t(ovb.p pVar, ovb.e eVar, boolean z) {
        this.f5559a = 13;
        this.f5561c = eVar;
        this.f5560b = z;
    }

    public /* synthetic */ t(boolean z, Object obj2, int i) {
        this.f5559a = i;
        this.f5560b = z;
        this.f5561c = obj2;
    }
}
