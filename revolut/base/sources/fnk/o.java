package fnk;

import android.os.Parcelable;
import aw0.c7;
import aw0.d7;
import aw0.ka;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.r2;
import aw0.t0;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.dg;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.ke;
import com.revolut.core.ui_kit.delegates.li;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationControllerContract$InputData;
import com.revolut.feature.revolutpay.management.api.declaration.RevolutPayManagementApi$Toggles$RevolutPayGenericPointsWidget;
import com.revolut.feature.travel.miles.api.R$plurals;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsUsageRequirements;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$CheckoutPrice;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.tracking.v3.OpenCreditEntryPointContext;
import com.youTransactor.uCube.rpc.Constants;
import dx4.a1;
import g27.y;
import gig.t;
import hfg.z;
import ip0.pl;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.r1;
import mx0.pc;
import ox0.b0;
import pwg.r;
import pyb.s;
import tx0.k0;
import yp0.e0;
import z0h.b1;
import z0h.q1;
import z0h.t1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136716b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f136715a = i;
        this.f136716b = obj2;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        int i;
        fxg.c cVar = (fxg.c) this.f136716b;
        pwg.a portfolioInsights = (pwg.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(portfolioInsights, "portfolioInsights");
        if (portfolioInsights.f240448b == null) {
            PortfolioInsightsUsageRequirements portfolioInsightsUsageRequirements = portfolioInsights.f240447a;
            return yp0.b.i(new eg("PORTFOLIO_INSIGHTS_USAGE_SCROLLER_LIST_ID", u.c(new ReferralContactDelegate.Model("PORTFOLIO_INSIGHTS_USAGE_WIDGET_LIST_ID", new AvatarModel.Default(LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_cleaning, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, null, null, null, 126), new TextLocalisedClause(R$string.wealth_analytics_widgetised_portfolio_insights_empty_title, null, null, 14), new TextClause(portfolioInsightsUsageRequirements.f95016a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ke.MATCH_PARENT, null, new fxg.a(portfolioInsightsUsageRequirements), null, 5520)), new dg.b(), BitmapDescriptorFactory.HUE_RED, 0, 0, 1016), new ListSubheaderDelegate.Model("PORTFOLIO_INSIGHTS_USAGE_WIDGET_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_analytics_widgetised_portfolio_insights_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
        }
        Float fValueOf = Float.valueOf(10.0f);
        exg.a aVar = cVar.f138821a;
        r rVar = portfolioInsights.f240448b;
        if (rVar == null) {
            return f0.f322471a;
        }
        pwg.j gauge = rVar.f240477a;
        pwg.k kVar = rVar.d;
        if (kVar == null) {
            return f0.f322471a;
        }
        Intrinsics.checkNotNullParameter(gauge, "gauge");
        int i2 = exg.b.f130427a[gauge.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorPerformanceNegative;
        } else if (i2 == 2) {
            i = R$attr.uikit_colorPerformanceStatic;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorPerformancePositive;
        }
        int i3 = i;
        HeaderDelegate.Model model = new HeaderDelegate.Model("PORTFOLIO_INSIGHTS_SUMMARY_WIDGET_LIST_ID", new pl(aVar.a(gauge)), new r2(new TextClause(rVar.f240478b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.wealth_analytics_widgetised_portfolio_insights_title, null, null, 14)), null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(cVar.f138822b.a(kVar.f240467c), Integer.valueOf(i3), fValueOf, fValueOf, 16), new TextClause(kVar.f240465a, (Style) null, Integer.valueOf(i3), false, (o9) null, (List) null, 122))), new TextClause(kVar.f240466b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, HeaderDelegate.a.C0407a.f52418a, fxg.b.f138820a, k0.MEDIUM, null, 90840);
        model.f52412x = R$attr.uikit_dp16;
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        gxi.e userPocket = (gxi.e) this.f136716b;
        CheckoutRevPayControllerExtensionContract$CheckoutPrice checkoutPrice = (CheckoutRevPayControllerExtensionContract$CheckoutPrice) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        if (Intrinsics.f(checkoutPrice.f99069b.f115083b, checkoutPrice.f99070c.f115083b) || checkoutPrice.f99069b.k()) {
            return null;
        }
        return new CellDetailsDelegate.Model("list_id_exchange_amount_item", new t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_checkout_price_exchanged_amount, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(checkoutPrice.f99069b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, new CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData(userPocket.f147748a.f84379g, checkoutPrice), null, null, 0, null, false, false, null, null, 32696);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        String string;
        fy5.a aVar = (fy5.a) this.f136716b;
        xzg.h chart = (xzg.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(chart, "chart");
        ArrayList arrayList = chart.f309995b;
        String string2 = chart.f309994a;
        if (arrayList.isEmpty()) {
            string = BigDecimal.ZERO.toString();
        } else {
            TrendViewDelegate.a aVar2 = (TrendViewDelegate.a) aVar.f138912b.f224257a;
            if (aVar2 != null && !(aVar2 instanceof TrendViewDelegate.a.C0428a) && !(aVar2 instanceof li) && (aVar2 instanceof mi)) {
                xzg.i iVar = (xzg.i) d0.e0(((mi) aVar2).f54485b, chart.f309995b);
                if (iVar == null || (string2 = iVar.f310000c) == null) {
                    string2 = BigDecimal.ZERO.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                }
            }
            string = string2;
        }
        Intrinsics.h(string);
        return new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        y yVar = (y) this.f136716b;
        g27.m orders = (g27.m) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(orders, "orders");
        int i = 14;
        CircleBadgeModel circleBadgeModel = null;
        if (orders.f139919a.isEmpty()) {
            return yp0.b.i(new RowDelegate.Model("ITEM_ID_NO_SALES", new RowDelegate.Model.MainImage.Image56((Image) com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30), circleBadgeModel, false, i), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_details_sections_sales_placeholder_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new ListSubheaderDelegate.Model("ITEM_ID_STATUS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_header_title_regular, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
        }
        if (!(orders instanceof g27.m)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = orders.f139919a;
        List listV0 = d0.V0(list, 3);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(yVar.f139943a.d((nr6.b) it8.next(), true));
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("ITEM_ID_STATUS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_header_title_regular, null, null, 14), (ResourceImage) null, false, false, (Clause) (list.size() > 3 ? new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_action_see_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : null), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946), e0.INSIDE_BOX, 0, 0, 124);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        g2d.g gVar = (g2d.g) this.f136716b;
        lgd.c content = (lgd.c) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content instanceof g2d.e) {
            return gVar.f((g2d.e) content);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        g2d.d dVar = (g2d.d) this.f136716b;
        lgd.c content = (lgd.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(content instanceof g2d.h)) {
            return f0.f322471a;
        }
        q1 q1Var = dVar.f139962c;
        t1 t1Var = ((g2d.h) content).f139969a;
        Links links = t1Var.f318563a;
        hel.b bVar = t1Var.f318564b;
        List listC = ((aah.m) q1Var).c(u.c(new b1(links, bVar)), bVar);
        int i = R$attr.uikit_dp0;
        yp0.b.q(listC, i, i, 0, 0, 12);
        return listC;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        g2f.k kVar = (g2f.k) this.f136716b;
        List transactionContents = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionContents, "transactionContents");
        List list = transactionContents;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((s) kVar.f140047a).e(((r1) it8.next()).f201449a, new TimeClause.Format.Pretty(q0.DATETIME)));
        }
        return d0.E0(!transactionContents.isEmpty() ? u.c(new LargeActionButtonDelegate.Model("TRANSACTIONS_SEE_ALL_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_agent_details_transactions_see_all, null, null, 14), false, null, null, null, null, 1000)) : f0.f322471a, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fnk.o.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) throws IOException {
        AnalyticsContext analyticsContext;
        g35.n nVar = (g35.n) this.f136716b;
        List entryPoints = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
        List<CreditApplicationPrimaryEntryPoint> list = entryPoints;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CreditApplicationPrimaryEntryPoint creditApplicationPrimaryEntryPoint : list) {
            String strK0 = d0.k0(creditApplicationPrimaryEntryPoint.getProducts(), null, null, null, 0, new g1k.k(28), 31);
            Clause title = creditApplicationPrimaryEntryPoint.getF66165a();
            Clause description = creditApplicationPrimaryEntryPoint.getF66166b();
            dc dcVar = new dc(creditApplicationPrimaryEntryPoint.getF66167c());
            List<fs3.d> listP = creditApplicationPrimaryEntryPoint.getD();
            ArrayList arrayList2 = new ArrayList(w.t(listP, i));
            for (fs3.d dVar : listP) {
                String str = dVar.f137579b;
                a1 a1Var = dVar.f137578a;
                arrayList2.add(new pc(str, new TagViewData(a1Var != null ? new ResourceImage(a1Var.c(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusSuccess), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_get_credit_tag, u.c(dVar.f137579b), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new Color.Solid(R$attr.uikit_colorGreyTone5), R$attr.uikit_colorTransparent, null, 1000), null));
            }
            if (creditApplicationPrimaryEntryPoint instanceof CreditApplicationPrimaryEntryPoint.SingleProduct) {
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                OpenCreditEntryPointContext.a aVarNewBuilder = OpenCreditEntryPointContext.newBuilder();
                ft3.q0 q0Var = ((CreditApplicationPrimaryEntryPoint.SingleProduct) creditApplicationPrimaryEntryPoint).e;
                Intrinsics.checkNotNullParameter(q0Var, "<this>");
                aVarNewBuilder.i(jb3.l.x(q0Var.getF137852c(), q0Var.getD()));
                aVarNewBuilder.h(nVar.f140200a.f70059b);
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            } else {
                analyticsContext = null;
            }
            ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model(strK0, dcVar, title, description, arrayList2, creditApplicationPrimaryEntryPoint, analyticsContext, false, false, false, 896);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i = 10;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x076c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0769  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.revolut.core.ui_kit.models.Style, d3c.m, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 2044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fnk.o.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        g6j.y yVar = (g6j.y) this.f136716b;
        z0h.c disclaimerContent = (z0h.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
        return ((aah.m) yVar.f140985h).c(u.c(new z0h.k(disclaimerContent.f318484a)), disclaimerContent.f318485b);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        ac4.g gVar = (ac4.g) this.f136716b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        x35.f fVar = (x35.f) pair.f186385a;
        LoanDetails loanDetails = (LoanDetails) pair.f186386b;
        return ac4.g.l(((g75.n) gVar.f3032c).a(((CreateMandateConfirmationControllerContract$InputData) gVar.f3031b).f70462b, fVar, loanDetails));
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        fo3.c cVar = (fo3.c) this.f136716b;
        List balances = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(balances, "balances");
        od0.h hVar = od0.i.Companion;
        dj0.d dVarX = yoj.b.x(balances, cVar.d);
        hVar.getClass();
        return od0.h.a(dVarX);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        gac.g gVar = (gac.g) this.f136716b;
        eac.o revPointsFeatureState = (eac.o) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(revPointsFeatureState, "revPointsFeatureState");
        if (!(revPointsFeatureState instanceof eac.m)) {
            if (revPointsFeatureState instanceof eac.n) {
                return f0.f322471a;
            }
            throw new NoWhenBranchMatchedException();
        }
        eac.m mVar = (eac.m) revPointsFeatureState;
        aim.e eVarB = u.b();
        int i = gac.f.f142137a[mVar.f124170a.ordinal()];
        if (i == 1) {
            HeroBannerDelegate.Model model = new HeroBannerDelegate.Model("ID_REV_POINTS_BUILT_IN_BANNER", new TextLocalisedClause(com.revolut.feature.revolutpay.management.impl.R$string.revolut_pay_management_home_rev_points_banner_title, null, null, 14), ((jte.d) gVar.f142138a).c(RevolutPayManagementApi$Toggles$RevolutPayGenericPointsWidget.f84579c) ? new TextLocalisedClause(com.revolut.feature.revolutpay.management.impl.R$string.revolut_pay_management_home_rev_points_banner_description_generic, null, null, 14) : new TextLocalisedClause(com.revolut.feature.revolutpay.management.impl.R$string.revolut_pay_management_home_rev_points_banner_description, null, null, 14), new CdnImage("rev_points_ultra_banner", "mobile/revolut_pay/points", null, null, null, null, Constants.TAG_FC_SPEED_MODE), v1.DARK);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!mVar.f124171b) {
                ActionWidgetDelegate.Model model2 = new ActionWidgetDelegate.Model("ID_REV_POINTS_START_EARNING_WIDGET", new TextLocalisedClause(com.revolut.feature.revolutpay.management.impl.R$string.revolut_pay_management_home_join_rev_points_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.revolutpay.management.impl.R$string.revolut_pay_management_home_join_rev_points_description, null, null, 14), new com.revolut.core.ui_kit.delegates.m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.revolutpay.management.impl.R$string.revolut_pay_management_home_join_rev_points_start_earning, null, null, 14), null, false), null, null, null, false, 8128);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model2);
            }
        }
        return u.a(eVarB);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        int i;
        TextLocalisedClause textLocalisedClause;
        TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) this.f136716b;
        Optional link = (Optional) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        String str = (String) gj7.b.m(link);
        if (str == null) {
            textLocalisedClause = null;
        } else {
            if (taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa) {
                i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_confirmation_footer_jisa;
            } else {
                if (taxAdvantage == null) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_confirmation_footer_isa;
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_confirmation_footer_format, u.c(new TextLocalisedClause(i, null, new Click(28, (Integer) null, (Object) new gaf.e(str), "FOOTER_CLICK_ID", false), 10)), null, 12);
        }
        return new aw0.e(false, textLocalisedClause, b0.ABOVE_BUTTONS, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 49);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        ActionWidgetDelegate.Model.a kVar;
        gec.e eVar;
        com.revolut.core.ui_kit.delegates.i iVar;
        gec.f fVar = (gec.f) this.f136716b;
        u6c.f0 usageCheck = (u6c.f0) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(usageCheck, "usageCheck");
        aim.e eVarB = u.b();
        if (!usageCheck.a() && !zBooleanValue) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_title, null, null, 14);
            int[] iArr = gec.g.f143280a;
            int i = iArr[fVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_description, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_description_move_money_only, null, null, 14);
            } else if (i == 3) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_description_choose_payment_method, null, null, 14);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_description_add_card, null, null, 14);
            }
            com.revolut.core.ui_kit.delegates.m mVar = new com.revolut.core.ui_kit.delegates.m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_16_warning, R$attr.uikit_colorStatusDanger, R$attr.uikit_colorStatusDanger_10), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10);
            int i2 = iArr[fVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    iVar = new com.revolut.core.ui_kit.delegates.i(12, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_action_move_money, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false);
                } else if (i2 == 3) {
                    iVar = new com.revolut.core.ui_kit.delegates.i(12, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_action_choose_payment_method, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = new com.revolut.core.ui_kit.delegates.i(12, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_action_add_card, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false);
                }
                kVar = iVar;
            } else {
                kVar = new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_action_add_money, null, null, 14), new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_insufficient_funds_widget_action_move_money, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), 240);
            }
            int i3 = iArr[fVar.ordinal()];
            if (i3 == 1) {
                eVar = new gec.e(gec.d.ADD_MONEY, gec.d.MOVE_MONEY);
            } else if (i3 == 2) {
                eVar = new gec.e(gec.d.MOVE_MONEY, null);
            } else if (i3 == 3) {
                eVar = new gec.e(gec.d.PAYMENT_METHOD, null);
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = new gec.e(gec.d.ADD_CARD, null);
            }
            gec.e eVar2 = eVar;
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("INSUFFICIENT_FUNDS_WIDGET_LIST_ID", textLocalisedClause2, textLocalisedClause, mVar, null, kVar, null, eVar2, null, false, 8016);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        return u.a(eVarB);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        List listU;
        List listA;
        gh3.n nVar = (gh3.n) this.f136716b;
        gh3.d detailsContent = (gh3.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(detailsContent, "detailsContent");
        gh3.g gVar = new gh3.g(new TextLocalisedClause(com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_step_details_header_title, u.c(new TextClause(detailsContent.f143834a.f313508a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        hh3.c cVar = nVar.f143851a;
        List<hh3.a> blocks = detailsContent.f143835b;
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        if (blocks.isEmpty()) {
            listU = f0.f322471a;
        } else {
            ArrayList arrayList = new ArrayList();
            for (hh3.a aVar : blocks) {
                Object obj5 = cVar.f152245a.get(aVar.getClass());
                hh3.e eVar = obj5 instanceof hh3.e ? (hh3.e) obj5 : null;
                if (eVar == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("No block mapper found for block " + aVar);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    listA = null;
                } else {
                    listA = eVar.a(aVar);
                }
                if (listA != null) {
                    arrayList.add(listA);
                }
            }
            listU = w.u(arrayList);
        }
        yg3.f fVar = detailsContent.f143836c;
        return new gh3.i(gVar, listU, fVar != null ? new gh3.f(new HtmlClause(0, 30, (Integer) null, (Object) null, fVar.f313506a)) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    private final Object s(Object obj2, Object obj3, Object obj4) {
        Iterator it8;
        t tVar;
        TravelMilesProvider travelMilesProvider;
        aim.e eVar;
        Clause textLocalisedQuantityClause;
        boolean z;
        Clause clauseM;
        ?? r56;
        t tVar2 = (t) this.f136716b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        z recommendedFlights = (z) pair.f186385a;
        TravelMilesProvider travelMilesProvider2 = (TravelMilesProvider) pair.f186386b;
        aim.e eVarB = u.b();
        Intrinsics.checkNotNullParameter(recommendedFlights, "recommendedFlights");
        ArrayList arrayList = recommendedFlights.f151909h;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            hfg.y yVar = (hfg.y) it9.next();
            Duration duration = yVar.f151901g;
            dj0.d dVar = yVar.k;
            LocalDateTime localDateTime = yVar.e;
            long days = duration.toDays();
            String strQ = j6.a.q("RECOMMENDED_FLIGHTS_LOADING_ITEM_ID", yVar.f151898a);
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDate localDate = localDateTime.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
            TimeClause timeClauseB = com.revolut.core.ui_kit.models.j.b(jVar, localDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT));
            TextClause textClause = new TextClause(yVar.f151899b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = yVar.d;
            UrlImage urlImage = null;
            if (str != null) {
                it8 = it9;
                urlImage = new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            } else {
                it8 = it9;
            }
            rw0.a header = new rw0.a(timeClauseB, new rw0.h(textClause, urlImage));
            com.revolut.core.ui_kit.models.k kVar = d7.Companion;
            LocalTime localTime = localDateTime.toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
            TimeClause timeClauseA = com.revolut.core.ui_kit.models.k.a(kVar, localTime);
            TextClause textClause2 = new TextClause(recommendedFlights.f151907c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i = yVar.f151904l - 1;
            if (i == 0) {
                travelMilesProvider = travelMilesProvider2;
                tVar = tVar2;
                eVar = eVarB;
                textLocalisedQuantityClause = new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_recommended_flights_flight_nonstop, null, null, 14);
            } else {
                tVar = tVar2;
                travelMilesProvider = travelMilesProvider2;
                eVar = eVarB;
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.miles_recommended_flights_flight_stops, Integer.valueOf(i), (List) null, (Style) null, 28);
            }
            rw0.j startPoint = new rw0.j(timeClauseA, null, textClause2, new rw0.d(textLocalisedQuantityClause, new TextClause(yVar.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
            LocalTime localTime2 = yVar.f.toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
            rw0.j endPoint = new rw0.j(com.revolut.core.ui_kit.models.k.a(kVar, localTime2), days > 0 ? new TextClause(p.a.m(days, "+"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextClause(recommendedFlights.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
            Duration duration2 = yVar.f151901g;
            long minutes = duration2.toMinutes();
            if (minutes <= 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.m(minutes, "Flight duration has to be greater than 0: "));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                clauseM = new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                r56 = 0;
            } else {
                long hours = duration2.toHours();
                long minutes2 = duration2.minusHours(hours).toMinutes();
                aim.e eVarB2 = u.b();
                if (hours > 0) {
                    eVarB2.add(yoj.b.w(new TextClause(String.valueOf(hours), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.core.android.R$string.date_shortest_hour_format, null, null, 14)));
                }
                if (minutes2 > 0) {
                    z = false;
                    eVarB2.add(yoj.b.w(new TextClause(String.valueOf(minutes2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.core.android.R$string.date_shortest_minute_format, null, null, 14)));
                } else {
                    z = false;
                }
                clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.a(eVarB2));
                r56 = z;
            }
            Clause middleText = clauseM;
            rw0.f priceFooter = new rw0.f(new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_recommended_flights_flight_price, r56, r56, 14), nub.a.k(yVar.f151903j, o9.NON_SENSITIVE, null, Integer.valueOf(R$attr.uikit_colorForeground), 16.0f, null, 38), !dVar.k() ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : r56);
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(middleText, "middleText");
            Intrinsics.checkNotNullParameter(startPoint, "startPoint");
            Intrinsics.checkNotNullParameter(endPoint, "endPoint");
            Intrinsics.checkNotNullParameter(priceFooter, "priceFooter");
            TripDetailsDelegate.Model model = new TripDetailsDelegate.Model(strQ, new rw0.n(header, middleText, null, new rw0.l(startPoint), new rw0.l(endPoint), priceFooter));
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
            it9 = it8;
            travelMilesProvider2 = travelMilesProvider;
            tVar2 = tVar;
            eVarB = eVar;
        }
        t tVar3 = tVar2;
        TravelMilesProvider travelMilesProvider3 = travelMilesProvider2;
        aim.e eVar2 = eVarB;
        eVar2.addAll(iig.o.a(arrayList2));
        eVar2.addAll(((iig.d) tVar3.f144213b).a(travelMilesProvider3, com.revolut.feature.travel.miles.api.R$string.miles_recommended_flights_account_link_button, com.revolut.feature.travel.miles.api.R$string.miles_recommended_flights_account_miles_account));
        eVar2.addAll(((iig.m) tVar3.f144214c).a(travelMilesProvider3));
        eVar2.addAll(((iig.n) tVar3.d).a(com.revolut.feature.travel.miles.api.R$string.miles_recommended_flights_learn_more_section_header));
        eVar2.addAll(((iig.g) tVar3.e).a());
        return u.a(eVar2);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) throws Throwable {
        gjh.g gVar = (gjh.g) this.f136716b;
        djh.b content = (djh.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content == null) {
            hx7.e.n(new IllegalArgumentException(a0.d.l(content.getClass(), "Invalid state. AvailableAccountsWidgetContract.Mapper received ")));
            return f0.f322471a;
        }
        fmc.z zVar = gVar.f144302a;
        List accounts = content.f115387a;
        TradingLegalEntityInformation tradingLegalEntityInformation = content.f115388b;
        ybl.g productGroupsAvailability = content.f115389c;
        djh.a upsellingState = content.d;
        r10.d dVar = (r10.d) zVar.f136369b;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(productGroupsAvailability, "productGroupsAvailability");
        Intrinsics.checkNotNullParameter(upsellingState, "upsellingState");
        List list = accounts;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (jjh.b.b((WealthAccount) it8.next())) {
                    z = false;
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (jjh.b.a((WealthAccount) obj5)) {
                arrayList.add(obj5);
            }
        }
        return z ? dVar.j0(arrayList, tradingLegalEntityInformation, productGroupsAvailability, new ghk.r(27)) : upsellingState.f115386a ? dVar.j0(arrayList, tradingLegalEntityInformation, productGroupsAvailability, new ghk.r(28)) : f0.f322471a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b89  */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r58, java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 3660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fnk.o.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o(Object obj2, Object obj3, int i) {
        this.f136715a = i;
        this.f136716b = obj3;
    }
}
