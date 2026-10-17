package joa;

import android.os.Parcelable;
import aw0.o9;
import aw0.x4;
import aw0.y4;
import bka.f1;
import bka.l0;
import bka.n0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.ChatTooltipDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleLoadingDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.og;
import com.revolut.core.ui_kit.delegates.q9;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.delegates.widgets.IconGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a2;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreenContract$InputData;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$State;
import com.revolut.feature.tab.accounts.impl.total_wealth.models.TotalWealthCategoryViewInfo;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.b;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchAttraction;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchExperience;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchResponse;
import com.revolut.feature.travel.experiences.api.models.search.recent.TravelRecentSearchLocation;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.feature.wealth.analytics.R$plurals;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.tracking.v3.InvestNewOrderPlacedContext;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOrderDraft;
import com.youTransactor.uCube.rpc.Constants;
import ggk.x0;
import grl.b6;
import grl.d6;
import grl.e4;
import h93.g0;
import ip0.kf0;
import ip0.qd0;
import ip0.sa;
import ip0.w2;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.c3;
import jy6.o;
import jy6.p;
import jyk.d0;
import jzb.f0;
import jzb.r;
import jzb.s;
import k2h.q;
import k4l.r0;
import kkf.b4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import m1c.z;
import nel.n;
import nel.t;
import nel.w;
import nel.x;
import org.joda.time.DateTime;
import sr6.m;
import wp5.y;
import yp0.e0;
import zhm.a0;
import zhm.b0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f176915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f176916c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f176914a = i;
        this.f176915b = obj2;
        this.f176916c = obj3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        BannerDelegate.Model model;
        BannerDelegate.Model model2;
        BannerDelegate.Model model3;
        qv0.i iVarD;
        jtk.l lVar = (jtk.l) this.f176915b;
        jtk.i iVar = (jtk.i) this.f176916c;
        vf0.k kVar = (vf0.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(kVar, "<destruct>");
        n nVar = (n) kVar.f288454a;
        w wVar = (w) kVar.f288456c;
        List<ugl.a> eventBanners = (List) kVar.d;
        jtk.e eVar = (jtk.e) gj7.b.m((Optional) kVar.e);
        if (eVar != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_details_ipo_launch_warning_title, null, null, 14);
            int i = R$string.wealth_stock_details_ipo_launch_warning_description;
            TextClause textClause = new TextClause(eVar.f178528a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(eVar.f178529b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            long epochMilli = eVar.f178530c.toEpochMilli();
            TimeClause.Format.TimeDefault timeDefault = TimeClause.Format.TimeDefault.f57977b;
            BannerDelegate.Model model4 = new BannerDelegate.Model("IPO_LAUNCH_WARNING", new ComplexImage.Regular(y.h(new Color.Solid(R$attr.uikit_colorGreen), 0.2f, LayeredImage.INSTANCE, R$drawable.uikit_icn_24_gifts, new Color.Solid(R$attr.uikit_colorOnAccent))), textLocalisedClause, new TextLocalisedClause(i, v.k(textClause, textClause2, new TimeClause(epochMilli, timeDefault, null, null, 12), new TimeClause(eVar.d.toEpochMilli(), timeDefault, null, null, 12)), null, 12), false, false, null, null, null, null, null, 65488);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            return u.c(model4);
        }
        boolean z = iVar.e;
        aim.e eVarB = u.b();
        m4h.b bVar = lVar.f178539b;
        ArrayList arrayList = new ArrayList();
        if (z) {
            BannerDelegate.Model model5 = new BannerDelegate.Model("HIGH_YIELD_BOND_SELL_ONLY_WARNING", new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(R$string.wealth_details_banner_high_yield_bond_title, null, null, 14), new TextLocalisedClause(R$string.wealth_details_banner_high_yield_bond_description, null, null, 14), true, false, new jtk.f(nVar.d), null, null, null, null, 65440);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model5);
        }
        nel.v vVar = nVar.f;
        String str = nVar.e;
        c3 c3Var = nVar.f214608t;
        String str2 = vVar.f214629a;
        switch (str2.hashCode()) {
            case -2146824541:
                if (str2.equals("CLOSE_POSITIONS")) {
                    model = new BannerDelegate.Model("CLOSE_POSITIONS_WARNING", null, null, new TextLocalisedClause(R$string.wealth_stock_details_close_positions_warning, u.c(str), null, 12), false, false, null, null, null, null, null, 65504);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                } else {
                    model = null;
                }
                break;
            case -1827361180:
                if (str2.equals("MARKET_HALT")) {
                    model = new BannerDelegate.Model("MARKET_HALT_WARNING", null, null, new TextLocalisedClause(R$string.wealth_stock_details_market_halt_warning, u.c(str), null, 12), false, false, null, null, null, null, null, 65504);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                } else {
                    model = null;
                }
                break;
            case 1124965819:
                if (str2.equals("SUSPENDED")) {
                    g3h.a aVarA = m4h.d.a(vVar, c3Var);
                    if (aVarA != null) {
                        model = new BannerDelegate.Model("SUSPENDED_WARNING", jtk.l.b(), bVar.c(aVarA, nVar, null), bVar.b(aVarA, nVar), true, false, new jtk.g(aVarA, nVar), null, w2.MANY, null, null, 64928);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    } else {
                        model2 = new BannerDelegate.Model("SUSPENDED_WARNING", jtk.l.b(), null, new TextLocalisedClause(R$string.wealth_stock_details_suspended_warning, u.c(str), null, 12), false, false, null, null, w2.MANY, null, null, 64928);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        model = model2;
                    }
                } else {
                    model = null;
                }
                break;
            case 1296747641:
                if (str2.equals("SELL_ONLY")) {
                    g3h.a aVarA2 = m4h.d.a(vVar, c3Var);
                    if (aVarA2 != null) {
                        model = new BannerDelegate.Model("SELL_ONLY_WARNING", jtk.l.b(), bVar.c(aVarA2, nVar, null), bVar.b(aVarA2, nVar), true, false, new jtk.g(aVarA2, nVar), null, w2.MANY, null, null, 64928);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    } else {
                        model2 = new BannerDelegate.Model("SELL_ONLY_WARNING", jtk.l.b(), null, new TextLocalisedClause(R$string.wealth_stock_details_sell_only_warning, u.c(str), null, 12), false, false, null, null, null, null, null, 65440);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        model = model2;
                    }
                } else {
                    model = null;
                }
                break;
            default:
                model = null;
                break;
        }
        if (model != null) {
            arrayList.add(model);
        }
        eVarB.addAll(arrayList);
        if (Intrinsics.f(wVar.f, Boolean.TRUE)) {
            model3 = new BannerDelegate.Model("CLOSE_POSITIONS_WARNING", null, null, new TextLocalisedClause(R$string.wealth_stock_details_high_volatility_warning, u.c(str), null, 12), false, false, null, null, null, null, null, 65504);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        } else {
            model3 = null;
        }
        if (model3 != null) {
            eVarB.add(model3);
        }
        kgm.i iVar2 = lVar.f178538a;
        Intrinsics.checkNotNullParameter(eventBanners, "eventBanners");
        LocalDate localDateW = oi0.d.W(((df0.b) iVar2.f184024c).a());
        ArrayList arrayList2 = new ArrayList();
        for (ugl.a aVar : eventBanners) {
            k8b.a aVarA3 = ((ib7.j) iVar2.f184023b).a(aVar.f280040a);
            if (aVarA3 != null) {
                iel.a aVar2 = aVar.f280040a;
                iVarD = aVarA3.d(aVar2, aVar2.f().isBefore(localDateW), localDateW, aVar.f280041b);
            } else {
                iVarD = null;
            }
            if (iVarD != null) {
                arrayList2.add(iVarD);
            }
        }
        eVarB.addAll(arrayList2);
        aim.e eVarA = u.a(eVarB);
        if (eVarA.size() <= 1) {
            return eVarA;
        }
        return u.c(new hg("WARNING_GROUP_SCROLLER_LIST_ID", eVarA, 1, x4.c.f10604a, null, new gg.b(true, 2), false, false, null, null, 0, 0, 0, 0, 32720));
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        jul.j jVar = (jul.j) this.f176915b;
        hul.h hVar = (hul.h) this.f176916c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        n nVar = (n) pair.f186385a;
        InstrumentTicker instrumentTicker = (InstrumentTicker) pair.f186386b;
        dsl.a aVar = jVar.f178689a;
        String ticker = nVar.e;
        t exchange = nVar.k;
        InvestOrderDraft investOrderDraft = hVar.f155719a;
        bfl.g orderSide = investOrderDraft.f106847a;
        r0 orderType = investOrderDraft.f106848b;
        boolean zA = com.revolut.trading.orders.ui.trade.model.a.a(investOrderDraft.f106852j);
        boolean zA2 = x.a(instrumentTicker);
        Intrinsics.checkNotNullParameter(instrumentTicker, "<this>");
        boolean zContains = x.f214635a.contains(instrumentTicker.v);
        ((dsl.b) aVar).getClass();
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        InvestNewOrderPlacedContext.a aVarNewBuilder = InvestNewOrderPlacedContext.newBuilder();
        aVarNewBuilder.c();
        ((InvestNewOrderPlacedContext) aVarNewBuilder.f49761b).setTicker(ticker);
        String strA = exchange.a();
        aVarNewBuilder.c();
        ((InvestNewOrderPlacedContext) aVarNewBuilder.f49761b).setExchange(strA);
        e4 e4Var = zA2 ? e4.OPEN : zContains ? e4.EXTENDED_HOURS : e4.CLOSE;
        aVarNewBuilder.c();
        ((InvestNewOrderPlacedContext) aVarNewBuilder.f49761b).setExchangeStatus(e4Var);
        b6 b6VarO = v04.b.O(orderSide);
        aVarNewBuilder.c();
        ((InvestNewOrderPlacedContext) aVarNewBuilder.f49761b).setOrderSide(b6VarO);
        d6 d6VarP = v04.b.P(orderType);
        aVarNewBuilder.c();
        ((InvestNewOrderPlacedContext) aVarNewBuilder.f49761b).setOrderType(d6VarP);
        aVarNewBuilder.c();
        ((InvestNewOrderPlacedContext) aVarNewBuilder.f49761b).setExtendedHours(zA);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: joa.j.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        int i;
        p pVar = (p) this.f176915b;
        jy6.h hVar = (jy6.h) this.f176916c;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((jy6.g) obj2, "<unused var>");
        aim.e eVarB = u.b();
        RowDelegate.Model model = new RowDelegate.Model("LIST_ID_INVOICE_REMINDERS_SWITCHER", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_reminders_setup_input_send_reminders_title, null, null, 14), null, 0, null, null, null, 0, new vf(hVar.f179336c, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        if (hVar.f179336c) {
            aim.e eVarB2 = u.b();
            eVarB2.add(new CellDetailsNoteDelegate.Model("LIST_ID_INVOICE_REMINDERS_SENT_TITLE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_reminders_setup_input_reminders_sent_title, null, null, 14), null, null, null, false, null, null, null, null, null, 0, 131060));
            CellDetailsStandaloneNoteDelegate.Model.Companion companion = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
            List<m> list = hVar.f179334a;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (m mVar : list) {
                CellDetailsStandaloneNoteDelegate.Model.Companion companion2 = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
                String strQ = j6.a.q("LIST_ID_INVOICE_REMINDERS_SENT_", mVar.name());
                int i2 = o.f179349a[mVar.ordinal()];
                if (i2 == 1) {
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_reminders_schedule_seven_days_before_due_date;
                } else if (i2 == 2) {
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_reminders_schedule_on_due_date;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_reminders_schedule_three_days_after_due_date;
                }
                arrayList.add(CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion2, strQ, new TextLocalisedClause(i, null, null, 14)));
            }
            companion.getClass();
            eVarB2.addAll(CellDetailsStandaloneNoteDelegate.Model.Companion.a(arrayList));
            aim.e eVarA = u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            a0.x(eVarA, eVarB);
        }
        if (pVar.f179350a instanceof InvoiceRemindersScreenContract$InputData.SingleInvoiceReminders) {
            SelectableDelegate.Model model2 = new SelectableDelegate.Model("LIST_ID_INVOICE_REMINDERS_DEFAULT", new RowDelegate.Model("LIST_ID_INVOICE_REMINDERS_DEFAULT_TITLE", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_reminders_setup_input_set_as_default_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), hVar.f179335b ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        }
        return u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Iterator it8;
        Clause clauseA;
        Integer numValueOf;
        jyg.p pVar = (jyg.p) this.f176915b;
        jyg.c cVar = (jyg.c) this.f176916c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        WidgetisedAnalyticsType widgetisedAnalyticsType = cVar.f179427a;
        hel.b bVar = cVar.f179428b;
        ArrayList arrayList = new ArrayList();
        Iterator it9 = content.iterator();
        while (it9.hasNext()) {
            jyg.d dVar = (jyg.d) it9.next();
            ArrayList arrayList2 = dVar.f179431b;
            jyg.a aVar = dVar.f179430a;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                jyg.b bVar2 = (jyg.b) arrayList2.get(i);
                String strN = a0.d.n("AVAILABLE_TYPE_PREFIX_", i);
                WidgetisedAnalyticsType widgetisedAnalyticsType2 = bVar2.f179424a;
                WidgetisedAnalyticsType widgetisedAnalyticsType3 = bVar2.f179424a;
                if ((widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Crypto) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.AllInvestments) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Brokerage) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.JointBrokerage) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Isa) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Pea) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Commodities) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Robo) || (widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Cfd)) {
                    it8 = it9;
                    clauseA = pVar.f179441a.a(widgetisedAnalyticsType2, bVar);
                } else {
                    if (!(widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Jisa)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WidgetisedAnalyticsType.Jisa jisa = (WidgetisedAnalyticsType.Jisa) widgetisedAnalyticsType2;
                    if (jisa.d) {
                        clauseA = new TextLocalisedClause(R$string.wealth_invest_trading_account_jisa_generic_title, null, null, 14);
                        it8 = it9;
                    } else {
                        it8 = it9;
                        clauseA = new TextLocalisedClause(R$string.wealth_invest_trading_account_jisa_title, u.c(jisa.f95150b), null, 12);
                    }
                }
                Clause clause = clauseA;
                boolean zF = Intrinsics.f(widgetisedAnalyticsType, widgetisedAnalyticsType3);
                if (widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.Crypto) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_bitcoin);
                } else if (widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.AllInvestments) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_coins);
                } else if (widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.AllInvestAccounts) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_invest);
                } else {
                    if (!(widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.Brokerage) && !(widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.JointBrokerage) && !(widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.Isa) && !(widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.Jisa) && !(widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.Pea) && !(widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.Commodities) && !(widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.Robo) && !(widgetisedAnalyticsType3 instanceof WidgetisedAnalyticsType.Cfd)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n2l.j jVarA = ayg.a.a(widgetisedAnalyticsType3);
                    numValueOf = jVarA != null ? Integer.valueOf(pVar.f179442b.g(jVarA)) : null;
                }
                RowDelegate.Model.MainImage.Image40 image40 = numValueOf != null ? new RowDelegate.Model.MainImage.Image40(new GlyphImage(numValueOf.intValue(), null, null, 6), d8l.d.b(zF), null, false, null, false, 60) : null;
                Integer num = bVar2.f179425b;
                TextLocalisedQuantityClause textLocalisedQuantityClause = num != null ? new TextLocalisedQuantityClause(R$plurals.wealth_analytics_widgetised_account_picker_investments, Integer.valueOf(num.intValue()), (List) null, (Style) null, 28) : null;
                dj0.d dVar2 = bVar2.f179426c;
                arrayList3.add(new RowDelegate.Model(strN, image40, clause, null, 0, textLocalisedQuantityClause, null, null, 0, new RowDelegate.Model.c.b(dVar2 != null ? new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, null, false, 126), false, null, false, null, null, null, null, null, null, widgetisedAnalyticsType3, null, 0, 0, 0, 0, 532675544));
                i++;
                it9 = it8;
            }
            Iterator it10 = it9;
            String strName = aVar.name();
            int i2 = jyg.o.f179440a[aVar.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_account_picker_crypto_header, null, null, 14);
            } else if (i2 == 2) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_account_picker_invest_header, null, null, 14);
            } else if (i2 == 3) {
                textLocalisedClause2 = null;
                a0.x(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(strName, (Image) null, (Clause) textLocalisedClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList);
                it9 = it10;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_account_picker_kids_invest_header, null, null, 14);
            }
            textLocalisedClause2 = textLocalisedClause;
            a0.x(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(strName, (Image) null, (Clause) textLocalisedClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList);
            it9 = it10;
        }
        return arrayList;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        jzb.v vVar = (jzb.v) this.f176915b;
        hzb.t tVar = (hzb.t) this.f176916c;
        z revPointsAccountStatus = (z) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        if (!(revPointsAccountStatus instanceof m1c.y)) {
            if (!Intrinsics.f(revPointsAccountStatus, z.a.f201476a)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException("Opted-out state received in RevPoints Earn screen");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("OPTED_OUT_ERROR_STATE_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32756);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return new hzb.v(u.c(model));
        }
        s sVar = vVar.f179720a;
        m1c.x revPointsAccount = ((m1c.y) revPointsAccountStatus).f201475a;
        ((jzb.t) sVar).getClass();
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        RevPoints revPoints = revPointsAccount.f201472c;
        aim.e eVarB = u.b();
        m70.a.t(t0.f186434a);
        eVarB.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        eVarB.add(v1.c.g(0, revPoints, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4));
        List listC = u.c(new LabelNavBarMenuItem("REV_POINTS_BALANCE_MENU_ID", resourceImage, new CompositeClause(u.a(eVarB), null, null, null, 14), null, null, 504));
        aim.e eVarB2 = u.b();
        Data data = tVar.f157128j;
        Data availableFeaturesData = tVar.i;
        Data productEligibilitiesData = tVar.e;
        List list = (List) data.getContent();
        if (list != null) {
            eVarB2.addAll(list);
        }
        jzb.h0 h0Var2 = vVar.f179721b;
        Data bannerStateData = tVar.d;
        Data slotManagerData = tVar.f157128j;
        Intrinsics.checkNotNullParameter(bannerStateData, "bannerStateData");
        Intrinsics.checkNotNullParameter(slotManagerData, "slotManagerData");
        eVarB2.addAll((List) iii.c.f(slotManagerData, new d0(13), new fb.c(h0Var2, bannerStateData, 23), new j(h0Var2, bannerStateData, 12)));
        jzb.p pVar = vVar.f179722c;
        Data revPointsBenefits = tVar.f157124b;
        Data pricingPlan = tVar.f157125c;
        Data revPointsEligibilities = tVar.e;
        Data revPointsSpareChange = tVar.f;
        Data revPointsEarningRate = tVar.f157126g;
        Data creditCardEntryPointAvailability = tVar.f157133q;
        Data availableFeatures = tVar.i;
        Data user = tVar.o;
        r rVar = (r) pVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(revPointsBenefits, "revPointsBenefits");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(revPointsEligibilities, "revPointsEligibilities");
        Intrinsics.checkNotNullParameter(revPointsSpareChange, "revPointsSpareChange");
        Intrinsics.checkNotNullParameter(revPointsEarningRate, "revPointsEarningRate");
        Intrinsics.checkNotNullParameter(creditCardEntryPointAvailability, "creditCardEntryPointAvailability");
        Intrinsics.checkNotNullParameter(availableFeatures, "availableFeatures");
        Intrinsics.checkNotNullParameter(user, "user");
        eVarB2.addAll((List) iii.c.f(t1.z(revPointsBenefits, pricingPlan, revPointsEligibilities, revPointsSpareChange, revPointsEarningRate, creditCardEntryPointAvailability, availableFeatures, user), new jud.d(rVar, 23), new jul.c(17), new j75.i(rVar, 21)));
        jzb.d0 d0Var = vVar.d;
        Data revPointsBenefits2 = tVar.f157124b;
        Data revPointsSpareChange2 = tVar.f;
        Data pointsBuyingActivePackageResponse = tVar.f157130m;
        f0 f0Var = (f0) d0Var;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(productEligibilitiesData, "productEligibilitiesData");
        Intrinsics.checkNotNullParameter(availableFeaturesData, "availableFeaturesData");
        Intrinsics.checkNotNullParameter(revPointsBenefits2, "revPointsBenefits");
        Intrinsics.checkNotNullParameter(revPointsSpareChange2, "revPointsSpareChange");
        Intrinsics.checkNotNullParameter(pointsBuyingActivePackageResponse, "pointsBuyingActivePackageResponse");
        eVarB2.addAll((List) iii.c.f(t1.w(productEligibilitiesData, availableFeaturesData, revPointsBenefits2, revPointsSpareChange2, pointsBuyingActivePackageResponse), new jud.d(f0Var, 24), new jul.c(20), new j75.i(f0Var, 22)));
        jzb.x xVar = vVar.f;
        Data section = tVar.f157132p;
        Intrinsics.checkNotNullParameter(section, "section");
        eVarB2.addAll((List) iii.c.f(section, new d0(xVar, 12), new jul.c(19), new jb8.b(xVar, 23)));
        jzb.l lVar = vVar.e;
        Data earningRatesData = tVar.f157127h;
        Data pointsPocketThresholdsData = tVar.k;
        jzb.n nVar = (jzb.n) lVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(earningRatesData, "earningRatesData");
        Intrinsics.checkNotNullParameter(productEligibilitiesData, "productEligibilitiesData");
        Intrinsics.checkNotNullParameter(availableFeaturesData, "availableFeaturesData");
        Intrinsics.checkNotNullParameter(pointsPocketThresholdsData, "pointsPocketThresholdsData");
        eVarB2.addAll((List) iii.c.f(t1.v(earningRatesData, productEligibilitiesData, availableFeaturesData, pointsPocketThresholdsData), new jud.d(nVar, 22), new jul.c(16), new j75.i(nVar, 20)));
        eVarB2.addAll(zjh.j.v(vVar.f179723g, tVar.f157131n));
        return new hzb.v(listC, u.a(eVarB2));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        gx0.a aVarB;
        q qVar = (q) this.f176915b;
        k2h.f fVar = (k2h.f) this.f176916c;
        k2h.g instrumentResult = (k2h.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrumentResult, "instrumentResult");
        List list = instrumentResult.f180584b;
        String str = instrumentResult.f180583a;
        if (list.isEmpty() && !kotlin.text.d0.W(str)) {
            return h2h.a.a(str);
        }
        List<nel.a0> list2 = instrumentResult.f180584b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (nel.a0 instrumentWithTicker : list2) {
            Set set = fVar.f180582c;
            y1h.e eVar = fVar.f180580a;
            adh.c cVar = qVar.f180599a;
            int i = k2h.p.f180598a[eVar.ordinal()];
            if (i == 1) {
                aVarB = cVar.b(instrumentWithTicker, "ASSET_INSTRUMENT_SELECTION_ID_", instrumentWithTicker.f214560a);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n parcel = instrumentWithTicker.f214560a;
                boolean zContains = set.contains(parcel.f214596b);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
                Intrinsics.checkNotNullParameter("ASSET_INSTRUMENT_SELECTION_ID_", "listIdPrefix");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                n nVar = instrumentWithTicker.f214560a;
                aVarB = new SelectableDelegate.Model(a0.d.s("SELECTABLE_", "ASSET_INSTRUMENT_SELECTION_ID_", ".", nVar.e), cVar.a(instrumentWithTicker, "ASSET_INSTRUMENT_SELECTION_ID_", cVar.f3351a.c(nVar), parcel), zContains ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
            }
            arrayList.add(aVarB);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Iterable iterableK;
        String strE0;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        k37.x xVar = (k37.x) this.f176915b;
        k37.g gVar = (k37.g) this.f176916c;
        k37.f taxInfo = (k37.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(taxInfo, "taxInfo");
        m37.g gVar2 = xVar.f180649a;
        wi0.b countryCode = do3.q.y(taxInfo.f180627c);
        ds6.j taxType = gVar.f180628a;
        String websiteUrl = taxInfo.f180625a.f117249a;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(websiteUrl, "websiteUrl");
        int i = m37.f.f202297a[taxType.ordinal()];
        if (i == 1) {
            wi0.b.Companion.getClass();
            if (Intrinsics.f(countryCode, wi0.b.f297750h0)) {
                iterableK = v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_title_income_es, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_income_es, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_agencia_tributaria_income_es, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_title_income_es, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_subtitle_income_es, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_title_income_es, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_subtitle_income_es, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            } else if (Intrinsics.f(countryCode, wi0.b.f297760n0)) {
                String host = ((f80.b) gVar2.f202298a).f(!kotlin.text.d0.J(websiteUrl, "://", false) ? "https://".concat(websiteUrl) : websiteUrl).getHost();
                iterableK = v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_title_income_fr, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_income_fr, u.c(new TextClause((host == null || (strE0 = kotlin.text.d0.e0(host, "www.")) == null) ? websiteUrl : strE0, (Style) new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_title_income_fr, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_subtitle_income_fr, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_title_income_fr, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_subtitle_income_fr, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            } else {
                iterableK = Intrinsics.f(countryCode, wi0.b.p0) ? v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_amount_title_income_gb, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_amount_subtitle_income_gb, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_amount_subtitle_hmrc_income_gb, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_reference_title_income_gb, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_reference_subtitle_income_gb, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_bank_account_title_income_gb, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_bank_account_subtitle_income_gb, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_bank_account_subtitle_hmrc_income_gb, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : Intrinsics.f(countryCode, wi0.b.L0) ? v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_title_income_ie, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_income_ie, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_ros_account_income_ie, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_title_income_ie, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_subtitle_income_ie, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_title_income_ie, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_subtitle_income_ie, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : Intrinsics.f(countryCode, wi0.b.T0) ? v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_title_income_it, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_income_it, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_agenzia_delle_entrate_income_it, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_title_income_it, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_subtitle_income_it, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_title_income_it, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_subtitle_income_it, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : zhm.f0.f322471a;
            }
        } else if (i == 2) {
            wi0.b.Companion.getClass();
            iterableK = Intrinsics.f(countryCode, wi0.b.f297760n0) ? v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_title_social_security_fr, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_social_security_fr, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_urssaf_account_social_security_fr, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_title_social_security_fr, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_subtitle_social_security_fr, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_title_social_security_fr, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_subtitle_social_security_fr, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : zhm.f0.f322471a;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            wi0.b.Companion.getClass();
            iterableK = countryCode.equals(wi0.b.f297750h0) ? v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_title_vat_es, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_vat_es, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_agencia_tributaria_vat_es, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_title_vat_es, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_subtitle_vat_es, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_title_vat_es, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_subtitle_vat_es, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : countryCode.equals(wi0.b.p0) ? v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_amount_title_vat_gb, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_amount_subtitle_vat_gb, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_amount_subtitle_hmrc_vat_gb, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_reference_title_vat_gb, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_reference_subtitle_vat_gb, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_reference_subtitle_hmrc_vat_gb, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_bank_account_title_vat_gb, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_bank_account_subtitle_vat_gb, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_bank_account_subtitle_hmrc_vat_gb, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : countryCode.equals(wi0.b.L0) ? v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_title_vat_ie, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_vat_ie, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_ros_account_vat_ie, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_title_vat_ie, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_subtitle_vat_ie, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_title_vat_ie, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_subtitle_vat_ie, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : countryCode.equals(wi0.b.T0) ? v.k(new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_title_vat_it, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_vat_it, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_login_subtitle_agenzia_delle_entrate_vat_it, null, new Click(28, (Integer) null, (Object) new m37.e(websiteUrl), "ID_HMRC_ONLINE_TAX_ACCOUNT", false), 10)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_title_vat_it, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_selection_subtitle_vat_it, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new m37.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_title_vat_it, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_payment_option_subtitle_vat_it, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : zhm.f0.f322471a;
        }
        Iterable iterable = iterableK;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        int i2 = 0;
        for (Object obj5 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            m37.a aVar = (m37.a) obj5;
            arrayList.add(new RowDelegate.Model(a0.d.n("LIST_ID_PAYMENT_ASSESSMENT_STEP_", i2), new RowDelegate.Model.MainImage.Image24(aVar.f202293c, false, false, 6), aVar.f202291a, null, 0, aVar.f202292b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i2 = i3;
        }
        e0 e0Var = e0.OUTSIDE_BOX;
        int i5 = R$attr.uikit_dp8;
        int i6 = R$attr.uikit_dp16;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayListD = arrayList;
        if (!zIsEmpty) {
            wi0.b countryCode2 = do3.q.y(taxInfo.f180627c);
            Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
            wi0.b.Companion.getClass();
            if (Intrinsics.f(countryCode2, wi0.b.f297750h0) || Intrinsics.f(countryCode2, wi0.b.f297760n0) || Intrinsics.f(countryCode2, wi0.b.L0) || Intrinsics.f(countryCode2, wi0.b.T0)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_header_title_to_do, null, null, 14);
            } else if (Intrinsics.f(countryCode2, wi0.b.p0)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_steps_header_title, null, null, 14);
            } else {
                textLocalisedClause2 = null;
                arrayListD = yp0.b.d(arrayList, new ListSubheaderDelegate.Model("LIST_ID_PAYMENT_ASSESSMENT_SUBHEADER", (Image) null, (Clause) textLocalisedClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i5, i5, i6, i6);
            }
            textLocalisedClause2 = textLocalisedClause;
            arrayListD = yp0.b.d(arrayList, new ListSubheaderDelegate.Model("LIST_ID_PAYMENT_ASSESSMENT_SUBHEADER", (Image) null, (Clause) textLocalisedClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i5, i5, i6, i6);
        }
        boolean zIsEmpty2 = arrayListD.isEmpty();
        List listB = arrayListD;
        if (zIsEmpty2) {
            listB = iii.c.b(null, null, 6, false);
        }
        return listB;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        k3g.p pVar = (k3g.p) this.f176915b;
        k3g.d dVar = (k3g.d) this.f176916c;
        TravelSearchResponse searchResponse = (TravelSearchResponse) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Throwable th10 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(searchResponse, "searchResponse");
        if (th10 != null) {
            return zhm.f0.f322471a;
        }
        if (zBooleanValue) {
            return k3g.p.b();
        }
        Intrinsics.checkNotNullParameter(searchResponse, "<this>");
        boolean zT = ce9.m.t(searchResponse);
        List list = searchResponse.d;
        if (zT) {
            if (ce9.m.t(searchResponse) && dVar.f180714c.length() > 0) {
                String str = dVar.f180714c;
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_SEARCH_ITEM_ID", new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_search_no_result_title, null, null, 14), new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_search_no_result_subtitle, u.c(str), null, 12), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_search_no_result_caption, null, null, 14)), null, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return zhm.d0.E0(pVar.d(dVar.e), zhm.d0.E0(k3g.p.c(), u.c(model)));
            }
            if (ce9.m.t(searchResponse)) {
                String str2 = dVar.f180714c;
                List list2 = dVar.d;
                if (str2.length() == 0 && !list2.isEmpty()) {
                    List listC = k3g.p.c();
                    List<TravelRecentSearchLocation> listV0 = zhm.d0.V0(list2, 3);
                    ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
                    for (TravelRecentSearchLocation travelRecentSearchLocation : listV0) {
                        String strQ = j6.a.q("RECENT_SEARCH_ITEM_ID", travelRecentSearchLocation.f92901a);
                        GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_search, null, null, 6);
                        TextClause textClause = new TextClause(travelRecentSearchLocation.f92903c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        Long l2 = travelRecentSearchLocation.d;
                        Long l3 = travelRecentSearchLocation.e;
                        arrayList.add(new RowDelegate.Model(strQ, glyphImage, null, null, textClause, (l2 == null || l3 == null) ? null : new TimeRangeClause(l2.longValue(), l3.longValue(), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 4), null, null, 0, null, false, false, null, null, null, null, null, travelRecentSearchLocation, null, 0, 0, 0, 0, 1056964460));
                    }
                    return zhm.d0.E0(pVar.d(dVar.e), zhm.d0.E0(yp0.b.g(arrayList, new ListSubheaderDelegate.Model("RECENT_SEARCH_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_search_recent_searches, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124), listC));
                }
            }
            return zhm.d0.E0(pVar.d(dVar.e), k3g.p.c());
        }
        List<TravelSearchExperience> list3 = searchResponse.f92899b;
        List<TravelSearchDestination> list4 = searchResponse.f92900c;
        List<TravelSearchAttraction> list5 = searchResponse.f92898a;
        if (list.isEmpty()) {
            s0 s0Var = new s0(3);
            List list6 = list5;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list6, 10));
            Iterator it8 = list6.iterator();
            while (it8.hasNext()) {
                arrayList2.add(k3g.p.e((TravelSearchAttraction) it8.next()));
            }
            s0Var.b(arrayList2.toArray(new qv0.i[0]));
            List list7 = list4;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list7, 10));
            Iterator it9 = list7.iterator();
            while (it9.hasNext()) {
                arrayList3.add(pVar.f((TravelSearchDestination) it9.next(), "EXPERIENCES_SEARCH_ITEM_ID"));
            }
            s0Var.b(arrayList3.toArray(new qv0.i[0]));
            List list8 = list3;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list8, 10));
            Iterator it10 = list8.iterator();
            while (it10.hasNext()) {
                arrayList4.add(k3g.p.g((TravelSearchExperience) it10.next()));
            }
            s0Var.b(arrayList4.toArray(new qv0.i[0]));
            ArrayList arrayList5 = s0Var.f186433a;
            List listK = v.k(arrayList5.toArray(new qv0.i[arrayList5.size()]));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return listK;
        }
        aim.f builder = new aim.f();
        for (TravelSearchAttraction travelSearchAttraction : list5) {
            builder.put(travelSearchAttraction.f92885a, k3g.p.e(travelSearchAttraction));
        }
        for (TravelSearchDestination travelSearchDestination : list4) {
            builder.put(travelSearchDestination.f92888a, pVar.f(travelSearchDestination, "EXPERIENCES_SEARCH_ITEM_ID"));
        }
        for (TravelSearchExperience travelSearchExperience : list3) {
            builder.put(travelSearchExperience.f92893a, k3g.p.g(travelSearchExperience));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        ArrayList arrayList6 = new ArrayList();
        Iterator it11 = list.iterator();
        while (it11.hasNext()) {
            qv0.i iVar = (qv0.i) fVarB.get((String) it11.next());
            if (iVar != null) {
                arrayList6.add(iVar);
            }
        }
        yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
        return arrayList6;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        Collection collectionK;
        Object next;
        k6a.u uVar = (k6a.u) this.f176915b;
        k6a.j jVar = (k6a.j) this.f176916c;
        List cardsContent = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cardsContent, "cardsContent");
        boolean z = jVar.f181659h;
        List list = jVar.f181656b;
        String str = jVar.f181657c;
        String str2 = jVar.d;
        g0 g0Var = jVar.e;
        if (cardsContent.isEmpty()) {
            collectionK = zhm.f0.f322471a;
        } else {
            Iterator it8 = cardsContent.iterator();
            int i = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.f(((h93.f0) it8.next()).f150110a, str)) {
                    break;
                }
                i++;
            }
            int i2 = i < 0 ? 0 : i;
            List<h93.f0> list2 = cardsContent;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (h93.f0 f0Var : list2) {
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (kotlin.text.a0.z(((CardDetailsDesignConfig) next).f104700a, f0Var.f150114h.f13639a.f13615a, true)) {
                        break;
                    }
                }
                arrayList.add(m93.a.a(uVar.f181676b, h93.h0.i(f0Var), f0Var, (CardDetailsDesignConfig) next, Intrinsics.f(f0Var.f150110a, g0Var != null ? g0Var.f150128a : null) ? g0Var : null, null, null, true, Intrinsics.f(f0Var.f150110a, str2), 0, 0, null, f0Var, null, null, null, 29472));
            }
            int i3 = R$attr.uikit_dp16;
            q9 q9Var = new q9("CARDS_CAROUSEL_LIST_ID", arrayList, i2, i3, i3, 200);
            Pair pair = str2 != null ? new Pair(Integer.valueOf(com.revolut.feature.payments_migration.impl.R$string.payments_migration_move_payment_hide_card_details), Integer.valueOf(R$drawable.uikit_icn_24_eye_hide)) : new Pair(Integer.valueOf(com.revolut.feature.payments_migration.impl.R$string.payments_migration_move_payment_show_card_details), Integer.valueOf(R$drawable.uikit_icn_24_eye_show));
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("SHOW_HIDE_DETAILS_BTN_ID", LargeActionButton.ButtonStyle.f58726b, new ResourceImage(((Number) pair.f186386b).intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 12);
            collectionK = v.k(q9Var, model);
        }
        return zhm.d0.E0(l6a.a.c(com.revolut.feature.payments_migration.impl.R$string.payments_migration_move_payment_instructions_first_step_card_description, R$attr.uikit_dp16, z), collectionK);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        String str;
        Iterator it8;
        Throwable th10;
        boolean z;
        boolean z3;
        String str2;
        ChatBubbleDelegate.ButtonModel buttonModel;
        boolean z4;
        qv0.o oVarB;
        m79.h hVar;
        String str3;
        Object next;
        bka.g0 g0Var;
        String str4;
        k79.t tVar = (k79.t) this.f176915b;
        k79.g gVar = (k79.g) this.f176916c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Throwable th11 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z6 = gVar.d;
        String str5 = gVar.f181919b;
        ArrayList arrayList = new ArrayList(content.size() + 1);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (th11 != null) {
            List listB = k79.t.b(false);
            yp0.b.k(listB, 0, 0, 0, 0, 31);
            a0.x(listB, arrayList);
        } else if (z6) {
            arrayList.add(new ChatBubbleLoadingDelegate.Model("LOADING_LIST_ITEM_ID", new gw0.i(gw0.t.SINGLE_TAIL), gw0.l.LARGE, null, 24));
        }
        Iterator it9 = b0.L(content).iterator();
        int i = 0;
        Object obj5 = null;
        while (true) {
            ListIterator listIterator = ((zhm.w0) it9).f322483a;
            if (!listIterator.hasPrevious()) {
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return arrayList != null ? arrayList : u.c(new FullScreenStateDelegate.Model("NO_ITEMS", new TextLocalisedClause(com.revolut.notification_centre.R$string.notification_center_screen_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.notification_centre.R$string.notification_center_screen_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D024", null, null, null, 30)), null, null, false, null, null, true, 0, 0, 31728));
            }
            Object objPrevious = listIterator.previous();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            g79.a aVar = (g79.a) objPrevious;
            s69.d inboxItem = aVar.f141133a;
            DateTime dateTime = inboxItem.f260160c;
            String str6 = inboxItem.f260158a;
            org.joda.time.LocalDate localDate = dateTime.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
            LocalDate localDateE = jli.b.e(localDate);
            if (obj5 == null || !obj5.equals(localDateE)) {
                if (i != 0 || (th11 == null && !z6)) {
                    arrayList.add(new sa(j6.a.q("date_", str6), new TimeClause(oc.c.F(localDateE), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), 0, 0, 60));
                }
                obj5 = localDateE;
            }
            if (!ref$BooleanRef.f186407a && Intrinsics.f(str6, str5)) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.notification_centre.R$string.revolut_feed_screen_unread_messages, null, null, 14);
                ChatTooltipDelegate.a.C0398a c0398a = ChatTooltipDelegate.a.C0398a.f52074a;
                arrayList.add(new ChatTooltipDelegate.Model("NEW_MESSAGE_SECTION", null, textLocalisedClause, 0, 0, 1008));
                ref$BooleanRef.f186407a = true;
            }
            k79.a aVar2 = tVar.f181943b;
            if (aVar.f141134b != null) {
                aka.a productArticle = (aka.a) aVar.f141135c.getContent();
                if (productArticle != null) {
                    f61.a aVar3 = tVar.f181942a;
                    Intrinsics.checkNotNullParameter(productArticle, "productArticle");
                    Intrinsics.checkNotNullParameter(inboxItem, "inboxItem");
                    if (productArticle instanceof aka.i) {
                        aka.i iVar = (aka.i) productArticle;
                        List list = iVar.f5755b;
                        str = str5;
                        ArrayList arrayList2 = new ArrayList();
                        List list2 = list;
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            aVar3.s(arrayList2, (n0) it10.next());
                            it9 = it9;
                        }
                        it8 = it9;
                        aka.g gVar2 = (aka.g) zhm.d0.d0(iVar.f5756c);
                        m79.a aVar4 = (gVar2 == null || (str4 = gVar2.f5752b) == null) ? null : new m79.a(new TextClause(gVar2.f5751a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str4, inboxItem);
                        Iterator it11 = list2.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it11.next();
                            if (next instanceof l0) {
                                break;
                            }
                        }
                        if (!(next instanceof l0)) {
                            next = null;
                        }
                        l0 l0Var = (l0) next;
                        hVar = new m79.h((l0Var == null || (g0Var = l0Var.f16325a) == null) ? null : g0Var.f, arrayList2, aVar4);
                        th10 = th11;
                        z = z6;
                    } else {
                        str = str5;
                        it8 = it9;
                        if (!(productArticle instanceof aka.l)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aka.l lVar = (aka.l) productArticle;
                        aka.j jVar = lVar.f5761b;
                        ArrayList arrayList3 = new ArrayList();
                        th10 = th11;
                        z = z6;
                        arrayList3.add(new m79.f(jVar.f5758b, null, null));
                        Iterator it12 = lVar.d.iterator();
                        while (it12.hasNext()) {
                            aVar3.s(arrayList3, (f1) it12.next());
                        }
                        aka.g gVar3 = (aka.g) zhm.d0.d0(lVar.e);
                        hVar = new m79.h(jVar.f5757a, arrayList3, (gVar3 == null || (str3 = gVar3.f5752b) == null) ? null : new m79.a(new TextClause(gVar3.f5751a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str3, inboxItem));
                    }
                    ChatBubbleDelegate.Model.Companion companion = ChatBubbleDelegate.Model.INSTANCE;
                    String str7 = inboxItem.f260158a;
                    CompositeClause compositeClauseB = aVar2.b(hVar.f203361b);
                    gw0.i iVar2 = new gw0.i(gw0.t.SINGLE_TAIL);
                    String str8 = hVar.f203360a;
                    kp0.r rVarA = str8 != null ? tVar.a(str8) : null;
                    gw0.l lVar2 = gw0.l.LARGE;
                    gw0.a aVar5 = gw0.a.VERTICAL;
                    m79.a aVar6 = hVar.f203362c;
                    ChatBubbleDelegate.ButtonModel buttonModel2 = aVar6 != null ? new ChatBubbleDelegate.ButtonModel("button", aVar6.f203348a, aVar6, 20) : null;
                    int i3 = R$attr.uikit_dp4;
                    z3 = true;
                    oVarB = ChatBubbleDelegate.Model.Companion.b(companion, str7, compositeClauseB, rVarA, buttonModel2, iVar2, aVar, new AnalyticsContext(h79.a.a(inboxItem, true)), aVar5, lVar2, new xo0.a(null), i3, i3);
                } else {
                    str = str5;
                    it8 = it9;
                    th10 = th11;
                    z = z6;
                    z3 = true;
                    oVarB = new ChatBubbleLoadingDelegate.Model(j6.a.q("LOADING_LIST_ITEM_ID", str6), new gw0.i(gw0.t.SINGLE_TAIL), gw0.l.LARGE, aVar, 8);
                }
                z4 = false;
            } else {
                str = str5;
                it8 = it9;
                th10 = th11;
                z = z6;
                z3 = true;
                s69.e eVar = (s69.e) zhm.d0.d0(inboxItem.f260164l);
                if (eVar == null || (str2 = eVar.f260168c) == null) {
                    str2 = inboxItem.f260163j;
                }
                if (str2 != null) {
                    buttonModel = new ChatBubbleDelegate.ButtonModel("button", eVar != null ? new TextClause(eVar.f260167b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(com.revolut.notification_centre.R$string.revolut_feed_screen_message_learn_more, null, null, 14), inboxItem, 20);
                } else {
                    buttonModel = null;
                }
                String str9 = inboxItem.f;
                String str10 = inboxItem.f260162h;
                if (str10 == null) {
                    str10 = inboxItem.f260161g;
                }
                CompositeClause compositeClauseB2 = aVar2.b(u.c(new m79.f(str9, str10, null)));
                ChatBubbleDelegate.Model.Companion companion2 = ChatBubbleDelegate.Model.INSTANCE;
                String str11 = inboxItem.f260158a;
                gw0.i iVar3 = new gw0.i(gw0.t.SINGLE_TAIL);
                String str12 = inboxItem.k;
                kp0.r rVarA2 = str12 != null ? tVar.a(str12) : null;
                gw0.l lVar3 = gw0.l.LARGE;
                int i5 = R$attr.uikit_dp4;
                z4 = false;
                oVarB = ChatBubbleDelegate.Model.Companion.b(companion2, str11, compositeClauseB2, rVarA2, buttonModel, iVar3, aVar, new AnalyticsContext(h79.a.a(inboxItem, false)), gw0.a.VERTICAL, lVar3, new xo0.a(null), i5, i5);
            }
            arrayList.add(oVarB);
            i = i2;
            str5 = str;
            it9 = it8;
            z6 = z;
            th11 = th10;
        }
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        int i;
        k9h.c cVar = (k9h.c) this.f176915b;
        boolean z = ((k0h.b) this.f176916c).f180045a;
        xzg.k collectionContent = (xzg.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collectionContent, "collectionContent");
        cVar.getClass();
        if (collectionContent instanceof xzg.m) {
            return zhm.f0.f322471a;
        }
        if (collectionContent instanceof xzg.n) {
            xzg.n nVar = (xzg.n) collectionContent;
            List list = nVar.d;
            if (list.isEmpty()) {
                return zhm.f0.f322471a;
            }
            ListSubheaderDelegate.Model modelA = k9h.c.a(collectionContent, z);
            List listV0 = zhm.d0.V0(list, 3);
            String str = nVar.f310015a;
            adh.c cVar2 = cVar.f182336a;
            List<nel.a0> list2 = listV0;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (nel.a0 a0Var : list2) {
                RowDelegate.Model item = cVar2.b(a0Var, str, new k0h.e(a0Var.f214560a));
                u1h.a[] actions = new u1h.a[0];
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(actions, "actions");
                arrayList.add(new wh(j6.a.q("swipe.", item.f53228a), item, new ArrayList(0), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            }
            List listC = u.c(modelA);
            yp0.b.k(arrayList, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            return zhm.d0.E0(arrayList, listC);
        }
        if (!(collectionContent instanceof xzg.l)) {
            throw new NoWhenBranchMatchedException();
        }
        xzg.l lVar = (xzg.l) collectionContent;
        List list3 = lVar.d;
        if (list3.isEmpty()) {
            return zhm.f0.f322471a;
        }
        ListSubheaderDelegate.Model modelA2 = k9h.c.a(collectionContent, z);
        List<xzg.d> listV02 = zhm.d0.V0(list3, 5);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listV02, 10));
        for (xzg.d dVar : listV02) {
            SmallCardDelegate.Model.Companion companion = SmallCardDelegate.Model.INSTANCE;
            String str2 = dVar.f309976a;
            List list4 = dVar.f309981j;
            TextClause textClause = new TextClause(dVar.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i2 = k9h.b.f182335a[dVar.f309977b.ordinal()];
            if (i2 == 1) {
                i = com.revolut.feature.mainscreen.api.R$plurals.crypto_discovery_crypto_amount_plural;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.retail.wealth.resources.R$plurals.wealth_trading_discovery_stocks_amount_plural;
            }
            SmallCardDelegate.b.C0425b c0425b = new SmallCardDelegate.b.C0425b(new TextLocalisedQuantityClause(i, Integer.valueOf(list4 != null ? list4.size() : 0), u.c(Integer.valueOf(list4 != null ? list4.size() : 0)), (Style) null, 24), new ResourceImage(R$drawable.uikit_icn_24_view_list, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground_80), (List) null, (ImageTransformations) null, (Clause) null, 246), kf0.REGULAR);
            String str3 = dVar.f;
            og ogVar = str3 != null ? new og(new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)) : null;
            String str4 = dVar.e;
            SmallCardDelegate.Model modelA3 = SmallCardDelegate.Model.Companion.a(companion, str2, textClause, c0425b, str4 != null ? new UrlImage(str4, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, ogVar, null, new k0h.d(dVar), 32);
            yp0.b.l(modelA3, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(modelA3);
        }
        String strQ = j6.a.q("SCROLLER_PREFIX", lVar.f310006a);
        SmallCardDelegate.INSTANCE.getClass();
        return v.k(modelA2, new hg(strQ, arrayList2, 2, new y4(SmallCardDelegate.f53351j), null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624));
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        af4.v vVar = (af4.v) this.f176915b;
        ka4.f fVar = (ka4.f) this.f176916c;
        oy3.e configuration = (oy3.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        ax4.b bVar = fVar.f182417a;
        hx4.a aVarA = vVar.f3884b.a(configuration.f230883a.f230880a, com.revolut.feature.credit.core.R$string.credit_application_down_payment_source_v2_sources_title);
        mx4.z zVar = vVar.d;
        oy3.d dVar = configuration.f230883a;
        ArrayList arrayListB = zVar.b(dVar.f230881b, bVar);
        mx4.h hVar = vVar.f3885c;
        fx4.c cVar = dVar.f230882c;
        Map map = bVar.f10858c;
        boolean z = false;
        if (!map.isEmpty()) {
            Iterator it8 = map.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((ax4.a) ((Map.Entry) it8.next()).getValue()).f10854a) {
                    z = true;
                    break;
                }
            }
        }
        return new ka4.o(arrayListB, aVarA, hVar.a(cVar, z));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        kh5.c cVar = (kh5.c) this.f176915b;
        kh5.a aVar = (kh5.a) this.f176916c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = (List) aVar.f184066b.getContent();
        aim.e eVarB = u.b();
        List<eh5.b> listP0 = zhm.d0.P0(content, new k2j.d(new b83.a(list, cVar), 1));
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        for (eh5.b bVar : listP0) {
            n9l.a aVarA = list != null ? kh5.c.a(list, bVar) : null;
            dj0.d dVarK = aVarA != null ? pyd.c.K(bVar.a(), aVarA.f213663c, aVarA.f213662b) : null;
            String str = bVar.f125736a.f306286a;
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), new InactiveCircleBadge(dw0.a.Locked), null, false, null, false, 60), new CurrencyClause(bVar.f125736a, CurrencyClause.Format.DisplayName.f57755a, null, 4), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(bVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), dVarK != null ? new MoneyClause(dVarK, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124), true, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532673528));
        }
        int i = R$attr.uikit_dp0;
        yp0.b.k(arrayList, i, i, 0, 0, 28);
        eVarB.addAll(arrayList);
        return u.a(eVarB);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.b bVar = (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.b) this.f176915b;
        TotalWealthCategoryListContract$State totalWealthCategoryListContract$State = (TotalWealthCategoryListContract$State) this.f176916c;
        TotalWealthCategoryViewInfo viewInfo = (TotalWealthCategoryViewInfo) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(viewInfo, "viewInfo");
        List<SpaceContentModel> list = viewInfo.f89605a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (SpaceContentModel spaceContentModel : list) {
            List<Parcelable> list2 = spaceContentModel.f89558c;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (Parcelable parcelableC : list2) {
                if (parcelableC instanceof SubSpaceContentModel.GroupedSubSpaceContentModel) {
                    SubSpaceContentModel.GroupedSubSpaceContentModel groupedSubSpaceContentModel = (SubSpaceContentModel.GroupedSubSpaceContentModel) parcelableC;
                    parcelableC = SubSpaceContentModel.GroupedSubSpaceContentModel.c(groupedSubSpaceContentModel, totalWealthCategoryListContract$State.e.contains(new TotalWealthCategoryListContract$State.SubspaceKey(spaceContentModel.f89556a, groupedSubSpaceContentModel.e)), null, 30);
                }
                arrayList2.add(parcelableC);
            }
            arrayList.add(SpaceContentModel.a(spaceContentModel, arrayList2));
        }
        return ((com.revolut.feature.tab.accounts.impl.ui.spaces.k) bVar.d).d(arrayList, false, null);
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6 */
    private final Object q(Object obj2, Object obj3, Object obj4) {
        hfg.e0 e0Var;
        hfg.e0 e0Var2;
        int i;
        gig.t tVar = (gig.t) this.f176915b;
        khg.h hVar = (khg.h) this.f176916c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        hfg.g0 flightDetails = (hfg.g0) pair.f186385a;
        TravelMilesProvider travelMilesProvider = (TravelMilesProvider) pair.f186386b;
        aim.e eVarB = u.b();
        mhg.d dVar = (mhg.d) tVar.f;
        hfg.f0 f0Var = hVar.f184124c;
        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
        ArrayList arrayList = flightDetails.d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            int i2 = 2;
            boolean z = true;
            ?? r112 = 0;
            if (!it8.hasNext()) {
                TabsDelegate.Model model = new TabsDelegate.Model("TABS_ITEM_ID", arrayList2, (f0Var == null || (e0Var2 = f0Var.f151833a) == null) ? null : e0Var2.name(), null, null, null, 0, 0, null, 8184);
                ArrayList<hfg.f0> arrayList3 = flightDetails.d;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                for (hfg.f0 f0Var2 : arrayList3) {
                    arrayList4.add(dVar.f205570a.a(f0Var2.f151833a.name(), flightDetails.f151839a, f0Var2.f151835c, f0Var2.d, new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_flight_details_item, r112, r112, 14), flightDetails));
                    i2 = i2;
                    z = true;
                    r112 = 0;
                }
                int i3 = i2;
                boolean z3 = z;
                hg hgVarA = mhg.d.a("FLIGHT_CARDS_CARROUSEL_ITEM_ID", (f0Var == null || (e0Var = f0Var.f151833a) == null) ? null : e0Var.name(), arrayList4);
                koi.j[] jVarArr = new koi.j[i3];
                jVarArr[0] = model;
                jVarArr[z3 ? 1 : 0] = hgVarA;
                eVarB.addAll(v.k(jVarArr));
                eVarB.addAll(((iig.d) tVar.f144213b).a(travelMilesProvider, com.revolut.feature.travel.miles.api.R$string.miles_flight_details_link_account, com.revolut.feature.travel.miles.api.R$string.miles_flight_details_account));
                eVarB.addAll(((iig.m) tVar.f144214c).a(travelMilesProvider));
                eVarB.addAll(((iig.n) tVar.d).a(com.revolut.feature.travel.miles.api.R$string.miles_flight_details_learn_more_section_title));
                eVarB.addAll(((iig.g) tVar.e).a());
                return u.a(eVarB);
            }
            hfg.f0 f0Var3 = (hfg.f0) it8.next();
            int i5 = mhg.c.f205569a[f0Var3.f151833a.ordinal()];
            if (i5 == 1) {
                i = com.revolut.feature.travel.miles.api.R$string.miles_flight_details_tabs_economy;
            } else if (i5 == 2) {
                i = com.revolut.feature.travel.miles.api.R$string.miles_flight_details_tabs_business;
            } else if (i5 == 3) {
                i = com.revolut.feature.travel.miles.api.R$string.miles_flight_details_tabs_premium;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.travel.miles.api.R$string.miles_flight_details_tabs_first;
            }
            arrayList2.add(new com.revolut.core.ui_kit.views.q(f0Var3.f151833a.name(), new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(i, u.c(new TextClause(f0Var3.f151834b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), 58));
        }
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f176915b;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f176916c;
        mid.o content = (mid.o) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        ref$BooleanRef.f186407a = zBooleanValue;
        ArrayList<ShopsOutlet> arrayList = content.f205737b;
        ArrayList arrayList2 = new ArrayList();
        for (ShopsOutlet shopsOutlet : arrayList) {
            ShopsCampaignOffer shopsCampaignOffer = (ShopsCampaignOffer) content.f205738c.get(shopsOutlet.f87057b);
            Pair pair = shopsCampaignOffer != null ? new Pair(shopsOutlet, shopsCampaignOffer) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        ref$ObjectRef.f186409a = arrayList2;
        return Unit.f186387a;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object s(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: joa.j.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* JADX WARN: Type inference failed for: r12v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r6v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: joa.j.t(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        Clause textLocalisedClause;
        String strL;
        String str;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        Clause textClause;
        String str2;
        km1.d dVar = (km1.d) this.f176915b;
        km1.i iVar = (km1.i) this.f176916c;
        List items = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : items) {
            String str3 = ((Biller) obj5).f61146b;
            Locale locale = Locale.ROOT;
            String lowerCase = str3.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = dVar.f185670b.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (kotlin.text.d0.J(lowerCase, lowerCase2, false)) {
                arrayList.add(obj5);
            }
        }
        ArrayList<Biller> arrayList2 = new ArrayList();
        for (Object obj6 : arrayList) {
            if (((Biller) obj6).f61149h) {
                arrayList2.add(obj6);
            }
        }
        List listB0 = zhm.d0.B0(arrayList, arrayList2);
        aim.e eVarB = u.b();
        List list = listB0;
        if (!list.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("YOUR_BILLERS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(dVar.f185669a != null ? com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_section_recent : com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_section_your_billers_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        }
        List<Biller> list2 = listB0;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
        for (Biller biller : list2) {
            l80.e eVar = iVar.f185677a;
            String str4 = biller.f61145a;
            cm1.a aVar = biller.d;
            LocalDate localDate = biller.e;
            String strQ = j6.a.q("YOUR_BILLER_ITEM_ID-", str4);
            TextClause textClause2 = new TextClause(biller.f61146b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Biller.Details details = biller.k;
            if ((details != null ? details.f61153c : null) != null) {
                textClause = (details == null || (str2 = details.f61153c) == null) ? null : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                if (localDate == null || !localDate.isBefore(((l80.f) eVar).e())) {
                    l80.f fVar = (l80.f) eVar;
                    if (Intrinsics.f(localDate, fVar.e())) {
                        textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_item_payment_due_today, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
                    } else if (!Intrinsics.f(localDate != null ? localDate.minusDays(1L) : null, fVar.e())) {
                        if (localDate != null && localDate.isAfter(fVar.e())) {
                            if (aVar != null) {
                                int i = com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_item_payment_due_default_placeholder;
                                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(km1.i.a(aVar), null, null, 14);
                                long jF = oc.c.F(localDate);
                                TimeClause.Format.INSTANCE.getClass();
                                textLocalisedClause3 = new TextLocalisedClause(i, v.k(textLocalisedClause4, new TimeClause(jF, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                            } else {
                                int i2 = com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_item_payment_due_next_on;
                                long jF2 = oc.c.F(localDate);
                                TimeClause.Format.INSTANCE.getClass();
                                textLocalisedClause2 = new TextLocalisedClause(i2, u.c(new TimeClause(jF2, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                                textClause = textLocalisedClause2;
                            }
                        }
                    } else if (aVar != null) {
                        textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_item_payment_due_tomorrow_placeholder, v.k(new TextLocalisedClause(km1.i.a(aVar), null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_item_payment_due_tomorrow, null, null, 14)), null, 12);
                    } else {
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_item_payment_due_tomorrow, null, null, 14);
                        textClause = textLocalisedClause2;
                    }
                } else {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_item_payment_due_overdue, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
                }
                textClause = textLocalisedClause3;
            }
            Clause clause = textClause;
            ContactImage contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, biller.f61146b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
            String str5 = biller.f61148g;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(contactImage, str5 != null ? new UrlImage(str5, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, null, false, 28);
            dj0.d dVar2 = biller.f;
            arrayList3.add(new RowDelegate.Model(strQ, image40, textClause2, null, 0, clause, null, null, 0, dVar2 != null ? new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, biller, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList3);
        if (!list.isEmpty() && !arrayList2.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("NEW_BILLER_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(dVar.f185669a != null ? com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_section_all : com.revolut.feature.apm.bills.billers.api.R$string.bills_biller_selection_section_add_new_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        }
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (Biller biller2 : arrayList2) {
            String strQ2 = j6.a.q("NEW_BILLER_ITEM_ID-", biller2.f61145a);
            TextClause textClause3 = new TextClause(biller2.f61146b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Biller.Details details2 = biller2.k;
            if (details2 == null || (str = details2.f61153c) == null) {
                String str6 = biller2.f61147c;
                textLocalisedClause = str6 != null ? new TextLocalisedClause(com.revolut.feature.apm.bills.core.impl.R$string.bills_biller_selection_item_description_estimated_payment, u.c(str6), null, 12) : null;
            } else {
                textLocalisedClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            Clause clause2 = textLocalisedClause;
            String str7 = biller2.f61148g;
            arrayList4.add(new RowDelegate.Model(strQ2, new RowDelegate.Model.MainImage.Image40((str7 == null || (strL = m70.a.l(str7)) == null) ? new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, biller2.f61146b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063) : new UrlImage(strL, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 62), textClause3, null, 0, clause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, biller2, null, 0, 0, 0, 0, 532676568));
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList4);
        return u.a(eVarB);
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        a2 a2Var;
        String str;
        Object objA;
        kme.g gVar = (kme.g) this.f176915b;
        com.revolut.feature.tab.lifestyle.impl.ui.screen.b bVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.b) this.f176916c;
        h19.g gVar2 = (h19.g) obj2;
        ((Boolean) obj3).getClass();
        Integer num = 1;
        Intrinsics.checkNotNullParameter(gVar2, "<destruct>");
        String str2 = gVar2.f148484a;
        List list = gVar2.f148485b;
        if (list.isEmpty()) {
            return zhm.f0.f322471a;
        }
        int i = 14;
        if (list.size() == 1) {
            h19.d homeProduct = (h19.d) zhm.d0.b0(list);
            gVar.getClass();
            String lowerCase = homeProduct.f148480b.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            ((kme.c) gVar.f185790a).getClass();
            Intrinsics.checkNotNullParameter(homeProduct, "homeProduct");
            RowDelegate.Model model = new RowDelegate.Model("LIFESTYLE_HOME_ICONS_ID", new RowDelegate.Model.MainImage.Image56((Image) LayeredImage.Companion.p(LayeredImage.INSTANCE, kme.c.a(homeProduct.f148480b), Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorGreyTone5, 8.0f, 56.0f), (CircleBadgeModel) null, false, 14), new TextClause(homeProduct.f148479a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, new kme.a(homeProduct, new zn.c(num, num, p.a.p("https://assets.revolut.com/mobile/lifestyle_apps/", lowerCase, "_mask.png"), str2, homeProduct.d, null)), null, 0, 0, 0, 0, 532675576);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            objA = model;
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            int i2 = 0;
            for (Object obj5 : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                h19.d homeProduct2 = (h19.d) obj5;
                ((kme.c) gVar.f185790a).getClass();
                Intrinsics.checkNotNullParameter(homeProduct2, "homeProduct");
                String strQ = j6.a.q("LIFESTYLE_HOME_ICON", homeProduct2.f148480b.name());
                TextClause textClause = new TextClause(homeProduct2.f148479a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                h19.c cVar = homeProduct2.f148480b;
                LayeredImage layeredImage = new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_rect_background, Integer.valueOf(R$attr.uikit_colorGreyTone5), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(kme.c.a(cVar), new Color.Solid(R$attr.uikit_colorAccentNeutral), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, i);
                switch (kme.d.f185789a[cVar.ordinal()]) {
                    case 1:
                        str = "icn_24_plane_arrows_left_right";
                        break;
                    case 2:
                        str = "icn_24_resort";
                        break;
                    case 3:
                        str = "icn_24_voucher";
                        break;
                    case 4:
                        str = "icn_24_sim_card";
                        break;
                    case 5:
                        str = "icn_24_shopping";
                        break;
                    case 6:
                        str = "icn_24_lounges";
                        break;
                    case 7:
                        str = "icn_24_turbo_transfer";
                        break;
                    case 8:
                        str = "icn_24_heart";
                        break;
                    case 9:
                        str = "icn_24_insurance";
                        break;
                    case 10:
                        str = "icn_24_present";
                        break;
                    case 11:
                        str = "icn_24_rev_points";
                        break;
                    case 12:
                        str = "icn_24_transport";
                        break;
                    case 13:
                        str = "icn_24_travel";
                        break;
                    case 14:
                        str = "icn_24_airplane_car";
                        break;
                    case 15:
                        str = "icn_24_suitcase";
                        break;
                    case 16:
                        str = "icn_24_lightning";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Integer num2 = num;
                num = num2;
                arrayList.add(new IconDelegate.Model(strQ, layeredImage, textClause, new kme.a(homeProduct2, new zn.c(Integer.valueOf(i3), num2, p.a.p("https://assets.revolut.com?iconName=", str, ".png"), str2, homeProduct2.d, null)), 88));
                i2 = i3;
                i = 14;
            }
            gVar.getClass();
            IconGridWidgetDelegate.Model.Companion companion = IconGridWidgetDelegate.Model.INSTANCE;
            boolean z = bVar instanceof b.a;
            List listSubList = arrayList;
            if (!z) {
                if (!(bVar instanceof nme.y)) {
                    throw new NoWhenBranchMatchedException();
                }
                listSubList = arrayList;
                if (!((nme.y) bVar).f217320a) {
                    int size = arrayList.size();
                    if (8 <= size) {
                        size = 8;
                    }
                    listSubList = arrayList.subList(0, size);
                }
            }
            List list3 = listSubList;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.tab.lifestyle.impl.R$string.tab_lifestyle_section_products, null, null, 14);
            if (z) {
                a2Var = null;
            } else {
                if (!(bVar instanceof nme.y)) {
                    throw new NoWhenBranchMatchedException();
                }
                a2Var = new a2(new TextLocalisedClause(((nme.y) bVar).f217320a ? com.revolut.feature.tab.lifestyle.impl.R$string.tab_lifestyle_section_products_action_collapse : com.revolut.feature.tab.lifestyle.impl.R$string.tab_lifestyle_section_products_action_expand, null, null, 14));
            }
            objA = IconGridWidgetDelegate.Model.Companion.a(companion, "LIFESTYLE_HOME_ICONS_ID", textLocalisedClause, list3, a2Var, 384);
        }
        return u.c(objA);
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        knk.o oVar = (knk.o) this.f176915b;
        knk.f fVar = (knk.f) this.f176916c;
        ggk.f layout = (ggk.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        x0 x0Var = layout.f;
        PlansDashboardLayout$Button plansDashboardLayout$Button = x0Var.f143796a;
        PlansDashboardLayout$Button plansDashboardLayout$Button2 = x0Var.f143797b;
        Clause clause = (Clause) iii.c.f(t1.t(fVar.f186174a, fVar.f186175b), new knd.a(16), new b4(25), new k8d.t(oVar, 9));
        if (plansDashboardLayout$Button != null && plansDashboardLayout$Button2 != null) {
            return new aw0.h(true, knk.o.a(plansDashboardLayout$Button, "top_button"), knk.o.a(plansDashboardLayout$Button2, "bottom_button"), clause, ox0.b0.BELOW_BUTTONS, null, 96);
        }
        if (plansDashboardLayout$Button != null) {
            return new aw0.e(true, clause, ox0.b0.BELOW_BUTTONS, knk.o.a(plansDashboardLayout$Button, "top_button"), null, null, 48);
        }
        if (plansDashboardLayout$Button2 == null) {
            return null;
        }
        return new aw0.e(true, clause, ox0.b0.BELOW_BUTTONS, knk.o.a(plansDashboardLayout$Button2, "bottom_button"), null, null, 48);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.MoneyClause$Format, com.revolut.core.ui_kit.models.Style, xi0.b] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v19 jq4.k, still in use, count: 3, list:
          (r3v19 jq4.k) from 0x0aab: MOVE (r60v1 jq4.k) = (r3v19 jq4.k)
          (r3v19 jq4.k) from 0x0a9c: MOVE (r60v3 jq4.k) = (r3v19 jq4.k)
          (r3v19 jq4.k) from 0x09f8: MOVE (r60v5 jq4.k) = (r3v19 jq4.k)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 3650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: joa.j.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
