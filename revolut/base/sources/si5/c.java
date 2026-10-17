package si5;

import aim.e;
import android.os.Parcelable;
import androidx.content.NavType;
import androidx.content.serialization.RouteBuilder;
import androidx.content.serialization.RouteSerializerKt;
import aw0.a6;
import aw0.c7;
import aw0.k7;
import aw0.ka;
import aw0.o9;
import aw0.w5;
import aw0.x5;
import aw0.y4;
import aw0.z5;
import ba6.l;
import ba6.p;
import ba6.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewProductDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.ci;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.CellWithLinearProgressDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.EarthMapLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.EarthMapWidgetDelegate;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CounterBadge;
import com.revolut.core.ui_kit.recycler.ScrollOffsetData;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.insurance_credit.impl.data.model.action.InsuranceAction;
import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayType;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$DashboardUserData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import com.revolut.feature.uipersonalisation.api.CoverIcon;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerOption;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import com.revolut.feature_travel_hotels_models.location.HotelsSmartSearchLocation;
import com.revolut.feature_travel_hotels_models.property.Address;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyType;
import com.revolut.retail.feature.esim.api.model.EsimConnectivityTroubleshootingInfo;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.revolut.tracking.v3.SettingsThemingContext;
import dej.o1;
import dfj.o;
import ip0.ak0;
import ip0.ik0;
import ip0.ip;
import ip0.jk0;
import ip0.pp;
import ip0.qd0;
import ip0.sk0;
import ip0.tp;
import ip0.uk0;
import ip0.vd0;
import ip0.vk0;
import ip0.y10;
import ip0.zj;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import ms0.h4;
import ms0.j4;
import mx0.s5;
import mx0.u5;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import r3b.h;
import rzj.f;
import rzj.j;
import snd.i0;
import t27.i;
import t27.n;
import t27.t;
import t27.u;
import t3b.k;
import t8j.g;
import tb6.e0;
import tb6.s;
import tb6.z;
import tcg.a0;
import tch.q;
import tij.m;
import tx0.r3;
import uuk.b;
import vf0.y;
import xnd.k0;
import xnd.o0;
import xnd.p0;
import xnd.q0;
import xnd.r0;
import xnd.y0;
import zhm.f0;
import zhm.v;
import zhm.w;
import zod.j0;
import zod.l0;
import zod.m0;
import zod.n0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f263518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f263519c;

    public /* synthetic */ c(Data data, List list, m mVar) {
        this.f263517a = 19;
        this.f263518b = data;
        this.f263519c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0387  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.c.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.c.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r58, java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.c.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        SelectableDelegate.Model model;
        u uVar = (u) this.f263518b;
        i iVar = (i) this.f263519c;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
        e eVarB = zhm.u.b();
        n nVar = iVar.f267432b;
        String str = iVar.f267433c;
        EnumEntries<n> enumEntriesA = n.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (n nVar2 : enumEntriesA) {
            int i = t.f267444a[nVar2.ordinal()];
            if (i == 1) {
                model = new SelectableDelegate.Model("ITEM_ID_SELECTABLE_PRODUCT_TAX", new RowDelegate.Model("ITEM_ID_PRODUCT_TAX", null, new TextLocalisedClause(R$string.freelancer_subaccount_sale_reservation_item_product_tax_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.freelancer_subaccount_sale_reservation_item_product_tax_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874), nVar2 == nVar ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, nVar2, null, false, 32488);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                model = new SelectableDelegate.Model("ITEM_ID_SELECTABLE_FIXED_TAX", new RowDelegate.Model("ITEM_ID_FIXED_TAX", null, new TextLocalisedClause(R$string.freelancer_subaccount_sale_reservation_item_fixed_percentage_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.freelancer_subaccount_sale_reservation_item_fixed_percentage_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874), nVar2 == nVar ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, nVar2, null, false, 32488);
            }
            arrayList.add(model);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        if (iVar.f267432b == n.FIXED_PERCENTAGE_TAX) {
            float f = iVar.d;
            boolean z = (((0.01f > f ? 1 : (0.01f == f ? 0 : -1)) <= 0 && (f > 100.0f ? 1 : (f == 100.0f ? 0 : -1)) <= 0) || str == null || d0.W(str)) ? false : true;
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("ITEM_ID_PERCENTAGE_INPUT", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, new TextClause("%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, z ? new TextLocalisedClause(R$string.freelancer_subaccount_sale_reservation_item_fixed_percentage_error_exceeds_max, null, null, 14) : null, null, null, null, null, null, false, null, null, z, false, 8194, 0, null, false, true, null, false, zhm.u.c(uVar.f267445a), false, false, false, null, null, 0, -1143079068, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            eVarB.add(model2);
        }
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0215 A[PHI: r0
      0x0215: PHI (r0v19 java.util.List) = (r0v12 java.util.List), (r0v23 java.util.List) binds: [B:105:0x0210, B:97:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.c.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        t3b.i iVar = (t3b.i) this.f263518b;
        wel.e eVar = (wel.e) this.f263519c;
        h content = (h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        String portfolioId = eVar.f296818a;
        k5b.d dVar = iVar.f267729b;
        List positionsPerformance = content.f251239a;
        Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
        List<y49.h> listP0 = zhm.d0.P0(positionsPerformance, new k5b.c());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (y49.h positionsPerformance2 : listP0) {
            c5b.b bVar = iVar.f267730c;
            k kVar = iVar.f267728a;
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(positionsPerformance2, "positionsPerformance");
            String strQ = j6.a.q("ID_POSITIONS_GROUP_", positionsPerformance2.f310847a.f214596b);
            d2b.a aVar = kVar.f267731a;
            BigDecimal quantity = positionsPerformance2.f310848b;
            nel.n instrument = positionsPerformance2.f310847a;
            String str = instrument.d;
            String str2 = instrument.f214596b;
            c5b.a aVar2 = (c5b.a) aVar;
            TextLocalisedClause textLocalisedClauseC = aVar2.c(str, quantity);
            ej0.b currentPrice = positionsPerformance2.i;
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
            TextLocalisedClause textLocalisedClauseB = c5b.a.b(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_position_symbol_price, quantity, instrument, currentPrice);
            InstrumentImage instrumentImage = new InstrumentImage(str2, 30, null, null);
            List list = positionsPerformance2.f310853l;
            arrayList.add(bVar.b(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(instrumentImage, list.size() > 1 ? new CounterBadge(list.size()) : null, null, false, null, false, 60), textLocalisedClauseC, null, 0, textLocalisedClauseB, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(positionsPerformance2.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), aVar2.a(positionsPerformance2.f310849c), null, false, 124), false, null, false, null, null, null, null, null, null, new r3b.k(str2, portfolioId), null, 0, 0, 0, 0, 532675544), positionsPerformance2, portfolioId));
        }
        return arrayList;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        return RouteSerializerKt.generateRouteWithArgs$lambda$5((Map) this.f263518b, (RouteBuilder) this.f263519c, ((Integer) obj2).intValue(), (String) obj3, (NavType) obj4);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.f263518b;
        t6f.h hVar = (t6f.h) this.f263519c;
        Template content = (Template) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        e eVarB = zhm.u.b();
        String str = content.f95711j;
        eVarB.add(new PlainTextDelegate.Model("ManagedPortfolioDetailsAboutInfoExtensionMapper_about_text", (UrlImage) null, (Clause) null, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746));
        String str2 = hVar.f268333b;
        if (str2 != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_about_report_action, null, null, 14);
            h4 h4Var = h4.SEMIACCENT;
            ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked managedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked = new ManagedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked(str2);
            int i = R$attr.uikit_dp16;
            eVarB.add(new SmallActionButtonDelegate.Model("ManagedPortfolioDetailsAboutInfoExtensionMapper_strategy_report_button", h4Var, null, null, textLocalisedClause, null, j4.f208300a, managedPortfolioDetailsAboutInfoExtensionContract$Action$ButtonClicked, null, 0, i, i, i, 3416));
        }
        return yp0.b.g(zhm.u.a(eVarB), model, null, 0, 0, 126);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0b43  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0bb7  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0d20  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0d5a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r108, java.lang.Object r109, java.lang.Object r110) {
        /*
            Method dump skipped, instruction units count: 3578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.c.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        char c2;
        Clause compositeClause;
        t8j.h hVar = (t8j.h) this.f263518b;
        Integer num = (Integer) this.f263519c;
        List articlesContent = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(articlesContent, "articlesContent");
        if (articlesContent.isEmpty() && zBooleanValue) {
            hVar.getClass();
            return t8j.h.c(num);
        }
        hVar.getClass();
        if (articlesContent.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model modelB = t8j.h.b(num, articlesContent.size() >= 5);
        List<f> list = articlesContent;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (f fVar : list) {
            String strQ = j6.a.q("CRYPTO_LATEST_NEWS_ITEM_ID_", fVar.d().f101797a);
            TextClause textClause = new TextClause(fVar.d().f101798b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            UrlImage urlImage = new UrlImage(fVar.d().f101799c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            boolean z = fVar.a() instanceof rzj.i;
            boolean z3 = fVar.e() instanceof rzj.i;
            j jVarA = fVar.a();
            Clause clauseA = jVarA != null ? t8j.h.a(jVarA, z3) : null;
            j jVarE = fVar.e();
            Clause clauseA2 = jVarE != null ? t8j.h.a(jVarE, z) : null;
            TextClause textClause2 = fVar.c() > 2 ? new TextClause(a0.d.h(fVar.c() - 2, "+"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            if (clauseA == null || clauseA2 == null) {
                c2 = 2;
                compositeClause = fVar.a() != null ? clauseA : clauseA2 == null ? null : clauseA2;
            } else {
                c2 = 2;
                Clause[] elements = {clauseA, clauseA2, textClause2};
                Intrinsics.checkNotNullParameter(elements, "elements");
                compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            j jVarA2 = fVar.a();
            CurrencyImage currencyImageD = jVarA2 != null ? t8j.h.d(jVarA2, false) : null;
            j jVarE2 = fVar.e();
            CurrencyImage currencyImageD2 = jVarE2 != null ? t8j.h.d(jVarE2, true) : null;
            j jVarB = fVar.b();
            CurrencyImage currencyImageD3 = jVarB != null ? t8j.h.d(jVarB, true) : null;
            Image[] elements2 = new Image[3];
            elements2[0] = currencyImageD;
            elements2[1] = currencyImageD2;
            elements2[c2] = currencyImageD3;
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL = kotlin.collections.d.L(elements2);
            NewsDelegate.Model model = new NewsDelegate.Model(strQ, textClause, urlImage, new TextClause(fVar.d().f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), jbh.f.a(jli.b.g(fVar.d().e)), compositeClause, !listL.isEmpty() ? listL : null, NewsDelegate.Model.b.a.f52847a, null, new g(fVar.d()), null, 2592);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return v.k(modelB, t8j.h.f(arrayList));
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        String str;
        int i;
        ba6.j jVar;
        List listC;
        List list;
        List listC2;
        List list2;
        int i2;
        List listK;
        List listG;
        int i3;
        Collection collectionK;
        Collection collectionC;
        boolean z;
        TextLocalisedClause textLocalisedClause;
        z zVar = (z) this.f263518b;
        tb6.m mVar = (tb6.m) this.f263519c;
        y yVar = (y) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(yVar, "<destruct>");
        l charity = (l) yVar.f288491a;
        xi0.b donationCurrency = (xi0.b) yVar.f288492b;
        List charities = (List) yVar.f288493c;
        boolean zBooleanValue = ((Boolean) yVar.d).booleanValue();
        boolean zBooleanValue2 = ((Boolean) yVar.e).booleanValue();
        boolean zBooleanValue3 = ((Boolean) yVar.f).booleanValue();
        s0 s0Var = new s0(5);
        vb6.c cVar = zVar.f269505a;
        Data spareChange = mVar.f269482c;
        Data averageSpareChange = mVar.d;
        Data recurringPayments = mVar.f269481b;
        boolean z3 = mVar.f269487m;
        r rVar = mVar.f269488n;
        boolean z4 = mVar.k;
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(spareChange, "spareChange");
        Intrinsics.checkNotNullParameter(averageSpareChange, "averageSpareChange");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(donationCurrency, "donationCurrency");
        ba6.j jVar2 = charity.f13948q;
        String str2 = charity.f13939b;
        int i5 = vb6.b.f287426a[jVar2.ordinal()];
        if (i5 != 1) {
            i = 1;
            if (i5 != 2 && i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "averageSpareChange";
            jVar = jVar2;
            sa saVar = new sa("ITEM_ID_AVAILABILITY", (Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_availability_title, null, null, 14), (Clause) new TextLocalisedClause(jVar2 == ba6.j.NOT_AVAILABLE ? com.revolut.feature.donations.impl.R$string.donations_details_availability_description_not_available : com.revolut.feature.donations.impl.R$string.donations_details_availability_description_not_available_in_user_country, zhm.u.c(str2), null, 12), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
            listC = zhm.u.c(saVar);
        } else {
            str = "averageSpareChange";
            i = 1;
            jVar = jVar2;
            listC = f0.f322471a;
        }
        if (z4 && hx7.b.o(charity)) {
            list = listC;
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("ITEM_ID_BANNER_PENDING", new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_pending_donations_banner_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_pending_donations_banner_description, null, null, 14), new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorAccent_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_16_sand_watch, Integer.valueOf(R$attr.uikit_colorAccent), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), ActionWidgetDelegate.Model.b.C0394b.f51606a, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_pending_donations_banner_action_title, null, null, 14), null, 14), null, null, null, 1984);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC2 = zhm.u.c(model);
        } else {
            list = listC;
            listC2 = f0.f322471a;
        }
        if (hx7.b.o(charity)) {
            ((wb6.b) cVar.f287429b).getClass();
            Intrinsics.checkNotNullParameter(charity, "charity");
            Intrinsics.checkNotNullParameter(donationCurrency, "donationCurrency");
            if (rVar != null) {
                p pVar = rVar.d;
                ba6.n nVar = rVar.f13956c;
                b93.b bVar = nVar.f13952a;
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                if (pVar == p.LOCKED) {
                    dj0.d dVarU = cp5.c.u(rVar, donationCurrency);
                    if (dVarU != null) {
                        ListSubheaderDelegate.Model modelA = wb6.b.a();
                        if (v04.b.k(bVar, null) != null) {
                            int i6 = com.revolut.feature.donations.impl.R$string.donations_details_card_campaign_locked_message;
                            MoneyClause moneyClause = new MoneyClause(dVarU, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                            i2 = 0;
                            Object objK = v04.b.k(bVar, null);
                            if (objK == null) {
                                objK = str2;
                            }
                            textLocalisedClause = new TextLocalisedClause(i6, v.k(moneyClause, objK), null, 12);
                        } else {
                            i2 = 0;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_card_campaign_locked_message_simple, zhm.u.c(new MoneyClause(dVarU, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                        }
                        NewProductDelegate.Model model2 = new NewProductDelegate.Model("CHARITY_CARD_CAMPAIGN_LOCKED_ITEM_ID", new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_card_campaign_locked_main_title, null, null, 14), textLocalisedClause, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 8.0f, null, null, 48), new UrlImage(nVar.f13953b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), rVar);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        qv0.i[] iVarArr = new qv0.i[2];
                        iVarArr[i2] = modelA;
                        iVarArr[i] = model2;
                        listK = v.k(iVarArr);
                        list2 = listC2;
                    } else {
                        i2 = 0;
                        list2 = listC2;
                        listK = null;
                    }
                } else {
                    i2 = 0;
                    Intrinsics.checkNotNullParameter(rVar, "<this>");
                    if (pVar == p.UNLOCKED) {
                        ListSubheaderDelegate.Model modelA2 = wb6.b.a();
                        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cards, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 8.0f, null, null, 48);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_card_campaign_unlocked_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_card_campaign_unlocked_state, null, null, 14);
                        m70.a.a(t0.f186434a);
                        list2 = listC2;
                        NewProductDelegate.Model model3 = new NewProductDelegate.Model("CHARITY_CARD_CAMPAIGN_UNLOCKED_ITEM_ID", textLocalisedClause2, new CompositeClause(v.k(textLocalisedClause3, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_card_campaign_unlocked_subtitle, null, null, 14)), null, null, null, 14), layeredImageB, new UrlImage(nVar.f13953b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), rVar);
                        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                        qv0.i[] iVarArr2 = new qv0.i[2];
                        iVarArr2[0] = modelA2;
                        iVarArr2[i] = model3;
                        listK = v.k(iVarArr2);
                    } else {
                        list2 = listC2;
                        listK = f0.f322471a;
                    }
                }
                if (listK == null) {
                }
            } else {
                list2 = listC2;
                i2 = 0;
            }
            listK = f0.f322471a;
        } else {
            list2 = listC2;
            i2 = 0;
            listK = f0.f322471a;
        }
        vb6.e eVar = cVar.f287428a;
        int i21 = (zBooleanValue && charity.f13949r) ? i : i2;
        final e0 e0Var = (e0) eVar;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(spareChange, "spareChange");
        Intrinsics.checkNotNullParameter(averageSpareChange, str);
        ba6.j availability = jVar;
        Intrinsics.checkNotNullParameter(availability, "availability");
        if (availability != ba6.j.AVAILABLE) {
            listG = f0.f322471a;
        } else {
            e eVarB = zhm.u.b();
            if (i21 != 0) {
                eVarB.add(new RowDelegate.Model("item_id_donate_with_rev_points", e0.a(R$drawable.uikit_icn_24_rev_points_mono, null), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_fund_rev_points_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_fund_rev_points_subtitle, null, null, 14), null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
            }
            if (zBooleanValue2) {
                final int i22 = i2;
                qv0.i iVar = (qv0.i) iii.c.f(t1.t(spareChange, averageSpareChange), new t9b.a(25), new t5e.j(28), new Function3() { // from class: tb6.d0
                    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        Clause textClause;
                        float f;
                        TextLocalisedClause textLocalisedClause4;
                        TextLocalisedClause textLocalisedClause5;
                        int i32 = i22;
                        LayeredImage layeredImageD = null;
                        e0 e0Var2 = e0Var;
                        switch (i32) {
                            case 0:
                                Pair pair = (Pair) obj5;
                                ((Boolean) obj6).getClass();
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                od0.i iVar2 = (od0.i) pair.f186385a;
                                dj0.d dVar = (dj0.d) pair.f186386b;
                                yvh.b bVar2 = (yvh.b) iVar2.f224257a;
                                e0Var2.getClass();
                                if (bVar2 == null) {
                                    return new RowDelegate.Model("item_id_create_spare_change", e0.a(R$drawable.uikit_icn_24_coins, null), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_create_spare_change_switch_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, null, null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
                                }
                                Float f4 = bVar2.i;
                                Clause[] clauseArr = new Clause[3];
                                clauseArr[0] = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_create_spare_change_switch_title, null, null, 14);
                                t0 t0Var = t0.f186434a;
                                m70.a.t(t0Var);
                                clauseArr[1] = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                int iIntValue = f4 != null ? f4.intValue() : 1;
                                boolean z6 = bVar2.f317177b;
                                Object obj8 = ib6.e.f160095a;
                                Integer num = (Integer) ib6.e.f160095a.get(Float.valueOf(iIntValue));
                                if (num != null) {
                                    textClause = new TextLocalisedClause(num.intValue(), null, null, 14);
                                } else {
                                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                }
                                clauseArr[2] = textClause;
                                CompositeClause compositeClause = new CompositeClause(zhm.v.k(clauseArr), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 10);
                                if (z6) {
                                    int i33 = com.revolut.feature.donations.impl.R$string.donations_fund_per_month_format;
                                    long j2 = dVar.f115082a;
                                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                    int iIntValue2 = f4 != null ? f4.intValue() : 1;
                                    f = 12.0f;
                                    textLocalisedClause4 = new TextLocalisedClause(i33, zhm.u.c(new MoneyClause(new dj0.d(j2 * ((long) iIntValue2), dVar.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8)), null, 12);
                                } else {
                                    f = 12.0f;
                                    if (z6) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_spare_change_action_subtitle_paused, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10);
                                }
                                int i43 = R$drawable.uikit_icn_24_coins;
                                if (z6) {
                                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                                    int i59 = R$drawable.uikit_icn_16_check;
                                    int i66 = R$attr.uikit_colorWhite;
                                    layeredImageD = companion.d(i59, R$attr.uikit_colorGreen, i66, Integer.valueOf(i66), 2.0f, 2.0f, Float.valueOf(f));
                                }
                                return new RowDelegate.Model("item_id_spare_change", e0.a(i43, layeredImageD), compositeClause, null, 0, textLocalisedClause4, null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, bVar2, null, 0, 0, 0, 0, 532675544);
                            default:
                                List recurringPayments2 = (List) obj5;
                                ((Boolean) obj6).getClass();
                                Intrinsics.checkNotNullParameter(recurringPayments2, "recurringPayments");
                                qua.p pVar2 = (qua.p) zhm.d0.d0(recurringPayments2);
                                e0Var2.getClass();
                                if (pVar2 == null) {
                                    return new RowDelegate.Model("item_id_create_recurring", e0.a(R$drawable.uikit_icn_24_calendar_recurring, null), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_section_recurring_donation, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_fund_recurring_donation_subtitle_intro, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10), null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
                                }
                                boolean z11 = pVar2.f249316b == ibd.f.ACTIVE;
                                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_section_recurring_donation, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                                if (z11) {
                                    int i74 = com.revolut.feature.donations.impl.R$string.donations_recurring_list_subtitle_active_template;
                                    MoneyClause moneyClause2 = new MoneyClause(qua.u.f(pVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                    Integer numValueOf = ofm.q.r(pVar2) ? Integer.valueOf(com.revolut.feature.donations.impl.R$string.donations_recurring_period_daily) : ofm.q.I(pVar2) ? Integer.valueOf(com.revolut.feature.donations.impl.R$string.donations_recurring_period_weekly) : (ofm.q.F(pVar2) || ofm.q.x(pVar2)) ? Integer.valueOf(com.revolut.feature.donations.impl.R$string.donations_recurring_period_monthly) : null;
                                    Object[] elements = {moneyClause2, numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null};
                                    Intrinsics.checkNotNullParameter(elements, "elements");
                                    textLocalisedClause5 = new TextLocalisedClause(i74, kotlin.collections.d.L(elements), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                                } else {
                                    textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_recurring_transfer_action_subtitle_paused, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10);
                                }
                                TextLocalisedClause textLocalisedClause7 = textLocalisedClause5;
                                int i92 = R$drawable.uikit_icn_24_calendar_recurring;
                                if (z11) {
                                    LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                                    int i96 = R$drawable.uikit_icn_16_check;
                                    int i99 = R$attr.uikit_colorWhite;
                                    layeredImageD = companion2.d(i96, R$attr.uikit_colorGreen, i99, Integer.valueOf(i99), 2.0f, 2.0f, Float.valueOf(12.0f));
                                }
                                return new RowDelegate.Model("item_id_recurring_payment", e0.a(i92, layeredImageD), textLocalisedClause6, null, 0, textLocalisedClause7, null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, pVar2, null, 0, 0, 0, 0, 532675544);
                        }
                    }
                });
                if (iVar != null) {
                    eVarB.add(iVar);
                }
            }
            if (zBooleanValue3) {
                final int i32 = i;
                qv0.i iVar2 = (qv0.i) iii.c.f(recurringPayments, new t9b.a(26), new t5e.j(29), new Function3() { // from class: tb6.d0
                    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        Clause textClause;
                        float f;
                        TextLocalisedClause textLocalisedClause4;
                        TextLocalisedClause textLocalisedClause5;
                        int i322 = i32;
                        LayeredImage layeredImageD = null;
                        e0 e0Var2 = e0Var;
                        switch (i322) {
                            case 0:
                                Pair pair = (Pair) obj5;
                                ((Boolean) obj6).getClass();
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                od0.i iVar22 = (od0.i) pair.f186385a;
                                dj0.d dVar = (dj0.d) pair.f186386b;
                                yvh.b bVar2 = (yvh.b) iVar22.f224257a;
                                e0Var2.getClass();
                                if (bVar2 == null) {
                                    return new RowDelegate.Model("item_id_create_spare_change", e0.a(R$drawable.uikit_icn_24_coins, null), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_create_spare_change_switch_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, null, null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
                                }
                                Float f4 = bVar2.i;
                                Clause[] clauseArr = new Clause[3];
                                clauseArr[0] = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_create_spare_change_switch_title, null, null, 14);
                                t0 t0Var = t0.f186434a;
                                m70.a.t(t0Var);
                                clauseArr[1] = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                int iIntValue = f4 != null ? f4.intValue() : 1;
                                boolean z6 = bVar2.f317177b;
                                Object obj8 = ib6.e.f160095a;
                                Integer num = (Integer) ib6.e.f160095a.get(Float.valueOf(iIntValue));
                                if (num != null) {
                                    textClause = new TextLocalisedClause(num.intValue(), null, null, 14);
                                } else {
                                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                }
                                clauseArr[2] = textClause;
                                CompositeClause compositeClause = new CompositeClause(zhm.v.k(clauseArr), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 10);
                                if (z6) {
                                    int i33 = com.revolut.feature.donations.impl.R$string.donations_fund_per_month_format;
                                    long j2 = dVar.f115082a;
                                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                    int iIntValue2 = f4 != null ? f4.intValue() : 1;
                                    f = 12.0f;
                                    textLocalisedClause4 = new TextLocalisedClause(i33, zhm.u.c(new MoneyClause(new dj0.d(j2 * ((long) iIntValue2), dVar.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8)), null, 12);
                                } else {
                                    f = 12.0f;
                                    if (z6) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_spare_change_action_subtitle_paused, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10);
                                }
                                int i43 = R$drawable.uikit_icn_24_coins;
                                if (z6) {
                                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                                    int i59 = R$drawable.uikit_icn_16_check;
                                    int i66 = R$attr.uikit_colorWhite;
                                    layeredImageD = companion.d(i59, R$attr.uikit_colorGreen, i66, Integer.valueOf(i66), 2.0f, 2.0f, Float.valueOf(f));
                                }
                                return new RowDelegate.Model("item_id_spare_change", e0.a(i43, layeredImageD), compositeClause, null, 0, textLocalisedClause4, null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, bVar2, null, 0, 0, 0, 0, 532675544);
                            default:
                                List recurringPayments2 = (List) obj5;
                                ((Boolean) obj6).getClass();
                                Intrinsics.checkNotNullParameter(recurringPayments2, "recurringPayments");
                                qua.p pVar2 = (qua.p) zhm.d0.d0(recurringPayments2);
                                e0Var2.getClass();
                                if (pVar2 == null) {
                                    return new RowDelegate.Model("item_id_create_recurring", e0.a(R$drawable.uikit_icn_24_calendar_recurring, null), new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_section_recurring_donation, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_fund_recurring_donation_subtitle_intro, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10), null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
                                }
                                boolean z11 = pVar2.f249316b == ibd.f.ACTIVE;
                                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_section_recurring_donation, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                                if (z11) {
                                    int i74 = com.revolut.feature.donations.impl.R$string.donations_recurring_list_subtitle_active_template;
                                    MoneyClause moneyClause2 = new MoneyClause(qua.u.f(pVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                    Integer numValueOf = ofm.q.r(pVar2) ? Integer.valueOf(com.revolut.feature.donations.impl.R$string.donations_recurring_period_daily) : ofm.q.I(pVar2) ? Integer.valueOf(com.revolut.feature.donations.impl.R$string.donations_recurring_period_weekly) : (ofm.q.F(pVar2) || ofm.q.x(pVar2)) ? Integer.valueOf(com.revolut.feature.donations.impl.R$string.donations_recurring_period_monthly) : null;
                                    Object[] elements = {moneyClause2, numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null};
                                    Intrinsics.checkNotNullParameter(elements, "elements");
                                    textLocalisedClause5 = new TextLocalisedClause(i74, kotlin.collections.d.L(elements), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                                } else {
                                    textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_recurring_transfer_action_subtitle_paused, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), 10);
                                }
                                TextLocalisedClause textLocalisedClause7 = textLocalisedClause5;
                                int i92 = R$drawable.uikit_icn_24_calendar_recurring;
                                if (z11) {
                                    LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                                    int i96 = R$drawable.uikit_icn_16_check;
                                    int i99 = R$attr.uikit_colorWhite;
                                    layeredImageD = companion2.d(i96, R$attr.uikit_colorGreen, i99, Integer.valueOf(i99), 2.0f, 2.0f, Float.valueOf(12.0f));
                                }
                                return new RowDelegate.Model("item_id_recurring_payment", e0.a(i92, layeredImageD), textLocalisedClause6, null, 0, textLocalisedClause7, null, null, 0, e0.b(), false, null, false, null, null, null, null, null, null, pVar2, null, 0, 0, 0, 0, 532675544);
                        }
                    }
                });
                if (iVar2 != null) {
                    eVarB.add(iVar2);
                }
            }
            e eVarA = zhm.u.a(eVarB);
            listG = eVarA.isEmpty() ? f0.f322471a : yp0.b.g(eVarA, new ListSubheaderDelegate.Model("item_id_title", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_ways_to_donate_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        ListSubheaderDelegate.Model model4 = new ListSubheaderDelegate.Model("ITEM_ID_DESCRIPTION_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_description_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List listC3 = zhm.u.c(new PlainTextDelegate.Model("ITEM_ID_DESCRIPTION_CELL", (Clause) null, (Clause) new TextClause(charity.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z3 ? new u5(2, new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_see_less_button_title, null, null, 14)) : new s5(2, new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_see_more_button_title, null, null, 14)), (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65486));
        yp0.b.k(listC3, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        List[] elements = {list, list2, listK, listG, i2b.a.q(model4, listC3)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        s0Var.b(w.u(kotlin.collections.d.L(elements)).toArray(new qv0.i[0]));
        s0Var.b(yp0.b.g(zhm.u.c(new CellDetailsDelegate.Model("ITEM_ID_TOTAL_DONATIONS_CELL", new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.charity_label_total_donated, null, null, 14), new MoneyClause(charity.f13942h, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)), new ListSubheaderDelegate.Model("ITEM_ID_TOTAL_DONATIONS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_donors_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126).toArray(new qv0.i[0]));
        s0Var.b(mVar.f269485j.toArray(new qv0.i[0]));
        Intrinsics.checkNotNullParameter(charities, "charities");
        if (charities.size() < 2) {
            collectionK = f0.f322471a;
            i3 = 0;
        } else {
            boolean z6 = charities.size() > 3;
            ListSubheaderDelegate.Model model5 = new ListSubheaderDelegate.Model("ITEM_ID_MORE_CHARITIES_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_more_charities_header_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (z6 ? new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_common_action_see_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : null), z6, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
            List<l> listV0 = zhm.d0.V0(charities, 3);
            ArrayList arrayList = new ArrayList(w.t(listV0, 10));
            for (l lVar : listV0) {
                VoucherSmallTileDelegate.Model model6 = new VoucherSmallTileDelegate.Model(j6.a.q("ITEM_ID_CHARITY", lVar.f13938a), new zi(new UrlImage(lVar.f13941g, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)), new TextClause(lVar.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, new UrlImage(lVar.f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null, null, null, null, false, null, null, lVar, 262008);
                yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                arrayList.add(model6);
            }
            i3 = 0;
            collectionK = v.k(model5, new hg("ITEM_ID_CHARITIES_CAROUSEL", arrayList, 2, new y4(vb6.c.f287427c), null, new gg.c(0), true, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28560));
        }
        s0Var.b(collectionK.toArray(new qv0.i[i3]));
        if (mVar.f269486l) {
            TextDelegate.Model model7 = new TextDelegate.Model("ITEM_ID_COMPANY", new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_details_footer_provider_revolut_ltd, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
            yp0.b.r(model7, 0, R$attr.uikit_dp0, 0, 0, 13);
            collectionC = zhm.u.c(model7);
        } else {
            collectionC = f0.f322471a;
        }
        s0Var.b(collectionC.toArray(new qv0.i[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        List listK2 = v.k(arrayList2.toArray(new qv0.i[arrayList2.size()]));
        e eVarB2 = zhm.u.b();
        if (availability == ba6.j.AVAILABLE) {
            z = false;
            eVarB2.add(new ActionsView.Item("ACTION_ID_DONATE", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_action_donate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_heart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, charity, null, 24476));
        } else {
            z = false;
        }
        return new s(listK2, zhm.u.a(eVarB2), new TextClause(charity.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(charity.i, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), new UrlImage(charity.f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, z, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), new UrlImage(charity.f13941g, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, false, false, 507902));
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        char c2;
        RowDelegate.Model model;
        RowDelegate.Model model2;
        Integer numValueOf;
        char c3;
        Clause textClause;
        Clause compositeClause;
        tcg.e0 e0Var = (tcg.e0) this.f263518b;
        String str = (String) this.f263519c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        char c5 = '\f';
        int i = 14;
        if (content.isEmpty()) {
            e0Var.getClass();
            FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("LOCATION_EMPTY_ITEM_ID", new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_location_search_no_result_title, null, null, 14), new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_location_search_no_result_subtitle, zhm.u.c(str), null, 12), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_location_search_no_result_caption, null, null, 14)), null, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model3);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj5 : content) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            ffi.e eVar = (ffi.e) obj5;
            if (eVar instanceof HotelsLocation) {
                HotelsLocation hotelsLocation = (HotelsLocation) eVar;
                e0Var.getClass();
                String strN = a0.d.n("LOCATION_ITEM_ID_SEARCHED", hotelsLocation.hashCode());
                LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_location_pin, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
                TextClause textClause2 = new TextClause(hotelsLocation.f97955c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (tcg.d0.f269783a[hotelsLocation.f97954b.ordinal()] == 1) {
                    compositeClause = new TextLocalisedClause(tcg.e0.a(hotelsLocation), null, null, i);
                } else {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(tcg.e0.a(hotelsLocation), null, null, i);
                    m70.a.t(t0.f186434a);
                    compositeClause = new CompositeClause(v.k(textLocalisedClause, new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(hotelsLocation.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
                }
                model = new RowDelegate.Model(strN, layeredImageB, null, null, textClause2, compositeClause, null, null, 0, null, false, false, null, null, null, null, null, new oag.d(hotelsLocation, i2), null, 0, 0, 0, 0, 1056964460);
                c2 = c5;
            } else {
                if (eVar instanceof dgi.b) {
                    dgi.b bVar = (dgi.b) eVar;
                    e0Var.getClass();
                    String strN2 = a0.d.n("PROPERTIES_SEARCHED_ITEM_ID", bVar.hashCode());
                    LayeredImage layeredImageB2 = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_hotel, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
                    TextClause textClause3 = new TextClause(bVar.f114669b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    HotelsPropertyType hotelsPropertyType = bVar.f114670c;
                    Address address = bVar.d.f114667a;
                    Intrinsics.checkNotNullParameter(hotelsPropertyType, "<this>");
                    switch (n9g.a.f213645a[hotelsPropertyType.f98053c.ordinal()]) {
                        case 1:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_holiday_rental_location_info);
                            break;
                        case 2:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_hotel_location_info);
                            break;
                        case 3:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_guesthouse_location_info);
                            break;
                        case 4:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_resort_location_info);
                            break;
                        case 5:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_all_inclusive_location_info);
                            break;
                        case 6:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_inn_location_info);
                            break;
                        case 7:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_cruise_location_info);
                            break;
                        case 8:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_motel_location_info);
                            break;
                        case 9:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_camping_location_info);
                            break;
                        case 10:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_town_house_location_info);
                            break;
                        case 11:
                            numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_types_hostel_location_info);
                            break;
                        case 12:
                            numValueOf = null;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(address.d);
                        sb6.append(", ");
                        m70.a.t(t0.f186434a);
                        sb6.append(((o8b.c) e0Var.f269784a).b(address.e));
                        Unit unit = Unit.f186387a;
                        List listC = zhm.u.c(new TextClause(sb6.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        c3 = '\f';
                        textClause = new TextLocalisedClause(iIntValue, listC, null, 12);
                    } else {
                        c3 = c5;
                        m70.a.c(t0.f186434a);
                        textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    c2 = c3;
                    model2 = new RowDelegate.Model(strN2, layeredImageB2, null, null, textClause3, textClause, null, null, 0, null, false, false, null, null, null, null, null, new oag.e(bVar, i2), null, 0, 0, 0, 0, 1056964460);
                } else {
                    c2 = c5;
                    if (eVar instanceof HotelsSmartSearchLocation) {
                        if (((jte.d) e0Var.f269785b).c(TravelHotelsApi$Toggles.StaysSmartSearch.f93619c)) {
                            HotelsSmartSearchLocation hotelsSmartSearchLocation = (HotelsSmartSearchLocation) eVar;
                            model2 = new RowDelegate.Model(j6.a.q("SMART_SEARCH_ITEM_ID", hotelsSmartSearchLocation.f97958a), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_search, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextClause(hotelsSmartSearchLocation.f97959b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, null, false, false, null, null, null, null, null, new oag.j(hotelsSmartSearchLocation, i2), null, 0, 0, 0, 0, 1056964588);
                        }
                    }
                    model = null;
                }
                model = model2;
            }
            if (model != null) {
                arrayList.add(model);
            }
            c5 = c2;
            i2 = i3;
            i = 14;
        }
        boolean z = ((jte.d) e0Var.f269785b).c(TravelHotelsApi$Toggles.StaysSmartSearch.f93619c) && !arrayList.isEmpty();
        if (z) {
            yp0.b.k(arrayList, 0, R$attr.uikit_dp0, 0, 0, 29);
        } else {
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        }
        return z ? zhm.d0.F0(z92.f.e(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_location_search_smart_search_disclaimer, true), arrayList) : arrayList;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        tch.i iVar = (tch.i) this.f263518b;
        q qVar = (q) this.f263519c;
        PortfolioRecurringOrder recurringOrder = (PortfolioRecurringOrder) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
        Data data = qVar.d;
        Intrinsics.checkNotNullParameter(recurringOrder, "<this>");
        List listL = v.l((recurringOrder.d != k4l.d0.INACTIVE || data == null) ? null : (sa) iii.c.f(data, new a0(3), new tc6.b(6), new tch.c(iVar, 1)));
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("RECURRING_TRANSFER_INFO_REPEAT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_recurring_transfer_details_frequency, null, null, 14), iVar.f269830a.a(recurringOrder.e), 0, null, null, null, null, null, false, 0, 0, 32752);
        LocalDate localDate = recurringOrder.f;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_recurring_transfer_details_started_on, null, null, 14);
        long jP = ebm.a.P(localDate);
        TimeClause.Format.INSTANCE.getClass();
        TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
        qv0.i[] elements = {model, new CellDetailsDelegate.Model("RECURRING_TRANSFER_INFO_REPEAT", textLocalisedClause, new TimeClause(jP, dateMedium, null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32752), nz8.d.k(recurringOrder) ? new CellDetailsDelegate.Model("RECURRING_TRANSFER_INFO_NEXT_PAYMENT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_recurring_transfer_details_next_payment, null, null, 14), new TimeClause(ebm.a.P(recurringOrder.f104652g), dateMedium, null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL2 = kotlin.collections.d.L(elements);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        Data data2 = qVar.f269844b;
        List listL3 = v.l(data2 != null ? (qv0.i) iii.c.f(data2, new a0(4), new tc6.b(7), new sr8.a(11)) : null);
        yp0.b.k(listL3, 0, 0, 0, 0, 31);
        return w.u(v.k(listL, listL2, listL3));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        Data data = (Data) this.f263518b;
        List list = (List) this.f263519c;
        List banners = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(banners, "banners");
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : banners) {
            if (obj5 instanceof qij.j) {
                arrayList.add(obj5);
            }
        }
        if (!arrayList.isEmpty()) {
            List list2 = (List) data.getContent();
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(tij.w.a(list2, ((qij.j) it8.next()).f246736a));
                }
                List listB = m.b(arrayList2);
                int i = R$attr.uikit_dp8;
                int i2 = R$attr.uikit_dp0;
                yp0.b.o(i, i, i2, i2, listB);
                return listB;
            }
            if (data.getLoading()) {
                return f0.f322471a;
            }
        }
        return list;
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        tn7.k kVar = (tn7.k) this.f263518b;
        tn7.d dVar = (tn7.d) this.f263519c;
        kl7.h documentDelivery = (kl7.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(documentDelivery, "documentDelivery");
        e eVarB = zhm.u.b();
        RowDelegate.Model model = new RowDelegate.Model("SHIPPING_ADDRESS_ID", xl7.n.i(R$drawable.uikit_icn_24_location_arrow, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_certificate_shipping_details_cells_shipping_address_title, null, null, 14), null, 0, new TextClause(o51.a.b(documentDelivery.f185328a, ((s80.b) kVar.f272333a).b()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        RowDelegate.Model model2 = new RowDelegate.Model("DELIVERY_DATE_ID", xl7.n.i(R$drawable.uikit_icn_24_calendar_date, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_certificate_shipping_details_cells_delivery_date_title, zhm.u.c(xl7.n.e(documentDelivery.f185329b, new TimeClause.Format.DayAndMonth(ka.SHORT))), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        zhm.a0.x(yp0.b.g(v.k(new CellDetailsChevronDelegate.Model("CONTACT_SUPPORT_ID", new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_certificate_shipping_details_cells_support_title, null, null, 14), 0, false, null, null, null, 2044), new CellDetailsChevronDelegate.Model("DOWNLOAD_AND_PRINT_ID", new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_certificate_shipping_details_cells_print_certificate_title, null, null, 14), 0, false, null, null, null, 2044)), new ListSubheaderDelegate.Model("SOMETHING_WRONG_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_certificate_shipping_details_sections_actions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), yp0.e0.INSIDE_BOX, 0, 0, 124), eVarB);
        return new tn7.g(tn7.k.b(dVar), zhm.u.a(eVarB), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    private final Object q(Object obj2, Object obj3, Object obj4) {
        TextDelegate.Model model;
        sk0 sk0Var;
        e eVarA;
        int i;
        Image colorImage;
        ?? selectableIconModel;
        ik0 ik0Var;
        tna.u uVar = (tna.u) this.f263518b;
        tna.k kVar = (tna.k) this.f263519c;
        tna.m themeInfo = (tna.m) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
        e eVarB = zhm.u.b();
        vjg.g gVar = uVar.f272363b;
        gwl.d dVar = (gwl.d) gVar;
        int i2 = 14;
        ?? r92 = 0;
        boolean z = false;
        int i3 = 1;
        if (dVar.f().size() <= 1) {
            e eVarB2 = zhm.u.b();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_appearance_dialog_subheader_color, null, null, 14);
            List listC = zhm.u.c(uVar.b(themeInfo, kVar.d, gVar.c()));
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_COLOR_THEME_SWITCHER_HEADER", (Image) null, (Clause) textLocalisedClause, (Image) null, gVar.b(themeInfo.f272346a.f94563c), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57322);
            yp0.e0 e0Var = yp0.e0.INSIDE_BOX;
            zhm.a0.x(yp0.b.g(listC, model2, e0Var, 0, 0, 124), eVarB2);
            xjg.m mVar = themeInfo.f272346a.f94562b;
            boolean z3 = kVar.f272344b;
            int i5 = tna.t.f272360b[mVar.ordinal()];
            if (i5 == 1) {
                ik0Var = ik0.SYSTEM;
            } else if (i5 == 2) {
                ik0Var = ik0.NIGHT;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ik0Var = ik0.DAY;
            }
            ik0 ik0Var2 = ik0Var;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.appearance_theme_light, null, null, 14);
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            SettingsThemingContext.a aVarNewBuilder = SettingsThemingContext.newBuilder();
            aVarNewBuilder.h(false);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.appearance_theme_dark, null, null, 14);
            SettingsThemingContext.a aVarNewBuilder2 = SettingsThemingContext.newBuilder();
            aVarNewBuilder2.h(true);
            zhm.a0.x(yp0.b.g(zhm.u.c(new jk0(ik0Var2, textLocalisedClause2, textLocalisedClause3, new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.appearance_theme_system, null, null, 14), z3, new AnalyticsContext(w0VarA2), new AnalyticsContext(AnalyticsContext.Companion.a(aVarNewBuilder2.a())), R$attr.uikit_dp16)), new ListSubheaderDelegate.Model("ID_THEME_MODE_SWITCHER_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_appearance_dialog_subheader_theme, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, 0, 0, 124), eVarB2);
            eVarA = zhm.u.a(eVarB2);
        } else {
            e eVarB3 = zhm.u.b();
            ScrollOffsetData scrollOffsetData = kVar.d;
            ArrayList<GlobalThemeDeclaration> arrayListF = dVar.f();
            ArrayList arrayList = new ArrayList();
            for (GlobalThemeDeclaration globalThemeDeclaration : arrayListF) {
                boolean z4 = z;
                if (globalThemeDeclaration.K5(uVar.f272364c)) {
                    i = i3;
                    boolean zF = Intrinsics.f(globalThemeDeclaration.getF94454a(), themeInfo.f272346a.f94561a.getF94454a());
                    String f94454a = globalThemeDeclaration.getF94454a();
                    CoverIcon i6 = globalThemeDeclaration.getI();
                    if (i6 instanceof CoverIcon.Url) {
                        colorImage = new UrlImage(((CoverIcon.Url) i6).f94465a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 507902);
                    } else {
                        if (!(i6 instanceof CoverIcon.Transparent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        colorImage = new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorGroupedBackground), r92);
                    }
                    int i21 = R$attr.uikit_colorAccent;
                    boolean z6 = globalThemeDeclaration.getI() instanceof CoverIcon.Transparent;
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.appearance_theme_app_accessibility_label, r92, r92, i2);
                    AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                    SettingsThemingContext.a aVarNewBuilder3 = SettingsThemingContext.newBuilder();
                    String f94454a2 = globalThemeDeclaration.getF94454a();
                    aVarNewBuilder3.c();
                    ((SettingsThemingContext) aVarNewBuilder3.f49761b).setAppTheme(f94454a2);
                    w0 w0VarA3 = aVarNewBuilder3.a();
                    companion2.getClass();
                    selectableIconModel = new IconSelectorDelegate.SelectableIconModel(f94454a, colorImage, zF, null, textLocalisedClause4, false, null, i21, z6, globalThemeDeclaration, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA3)), 616);
                } else {
                    i = i3;
                    selectableIconModel = r92;
                }
                if (selectableIconModel != 0) {
                    arrayList.add(selectableIconModel);
                }
                z = z4;
                i3 = i;
                i2 = 14;
                r92 = 0;
            }
            boolean z11 = z;
            int i22 = i3;
            IconSelectorDelegate.Model model3 = new IconSelectorDelegate.Model("ID_GLOBAL_THEME_SWITCHER", arrayList, ip.f164732b, new pp(null), tp.RECT, 32);
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_settings_item_theme_accent_color, null, null, 14);
            int i32 = R$attr.uikit_dp0;
            ListSubheaderDelegate.Model model4 = new ListSubheaderDelegate.Model("accentSelectorHeader", (Image) null, (Clause) textLocalisedClause5, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i32, i32, 0, 0, 53242);
            AppTheme appTheme = themeInfo.f272346a;
            IconSelectorDelegate.Model modelB = uVar.b(themeInfo, scrollOffsetData, appTheme.f94561a.getF94527b());
            GlobalThemeDeclaration globalThemeDeclaration2 = appTheme.f94561a;
            Float fValueOf = Float.valueOf(16.0f);
            if ((globalThemeDeclaration2.e2() != null ? globalThemeDeclaration2 : null) != null) {
                ak0 ak0Var = new ak0(null, null, 3);
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.settings_appearance_seasonal_theme_action_title, null, null, 14);
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_info_outline, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16);
                Clause[] clauseArr = new Clause[2];
                clauseArr[z11 ? 1 : 0] = textLocalisedClause6;
                clauseArr[i22] = imageClause;
                List listK = v.k(clauseArr);
                m70.a.t(t0.f186434a);
                model = new TextDelegate.Model("ID_SEASONAL_STYLE_DISCLAIMER", new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), true, ak0Var, null, null, R$attr.uikit_dp0, 0, 0, 0, 1904);
            } else {
                model = null;
            }
            qv0.i[] elements = new qv0.i[4];
            elements[z11 ? 1 : 0] = model3;
            elements[i22] = model4;
            elements[2] = modelB;
            elements[3] = model;
            Intrinsics.checkNotNullParameter(elements, "elements");
            zhm.a0.x(yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("globalThemeHeader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_appearance_dialog_subheader_theme, null, null, 14), (Image) null, globalThemeDeclaration2.getF94526a(), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null, 0, 0, 126), eVarB3);
            boolean z12 = kVar.f272344b;
            int i33 = globalThemeDeclaration2.getD() != null ? i22 : z11 ? 1 : 0;
            int i43 = tna.t.f272360b[appTheme.f94562b.ordinal()];
            if (i43 == i22) {
                sk0Var = sk0.SYSTEM;
            } else if (i43 == 2) {
                sk0Var = sk0.NIGHT;
            } else {
                if (i43 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sk0Var = sk0.DAY;
            }
            sk0 sk0Var2 = sk0Var;
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.appearance_theme_light, null, null, 14);
            AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
            SettingsThemingContext.a aVarNewBuilder4 = SettingsThemingContext.newBuilder();
            aVarNewBuilder4.h(z11);
            w0 w0VarA4 = aVarNewBuilder4.a();
            companion3.getClass();
            w0 w0VarA5 = AnalyticsContext.Companion.a(w0VarA4);
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.appearance_theme_dark, null, null, 14);
            SettingsThemingContext.a aVarNewBuilder5 = SettingsThemingContext.newBuilder();
            aVarNewBuilder5.h(true);
            w0 w0VarA6 = AnalyticsContext.Companion.a(aVarNewBuilder5.a());
            Object[] elements2 = {new ci(sk0Var2, textLocalisedClause7, textLocalisedClause8, new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.appearance_theme_system, null, null, 14), z12, i33 != 0 ? uk0.f166691a : vk0.f166837a, new AnalyticsContext(w0VarA5), new AnalyticsContext(w0VarA6)), i33 != 0 ? new TextDelegate.Model("ID_THEME_MODE_SWITCHER_FOOTER", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_settings_item_theme_blocked_note, zhm.u.c(globalThemeDeclaration2.getF94526a()), null, 12), false, new ak0(null, null, 3), null, null, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, 1652) : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            zhm.a0.x(yp0.b.g(kotlin.collections.d.L(elements2), new ListSubheaderDelegate.Model("ID_THEME_MODE_SWITCHER_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_settings_item_theme_mode_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), eVarB3);
            eVarA = zhm.u.a(eVarB3);
        }
        zhm.a0.x(eVarA, eVarB);
        return zhm.u.a(eVarB);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        boolean z;
        qv0.i iVarA;
        PlainTextDelegate.Model model;
        qv0.i iVar;
        List listI;
        TextLocalisedClause textLocalisedClause;
        RowDelegate.Model model2;
        RowDelegate.Model model3;
        bof.r rVar = (bof.r) this.f263518b;
        rnj.c cVar = (rnj.c) this.f263519c;
        EsimConnectivityTroubleshootingInfo troubleshootingInfo = (EsimConnectivityTroubleshootingInfo) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(troubleshootingInfo, "troubleshooting");
        tnj.e eVar = (tnj.e) rVar.f17430c;
        Intrinsics.checkNotNullParameter(troubleshootingInfo, "troubleshooting");
        Instant instant = troubleshootingInfo.f100200b;
        if (instant != null) {
            Instant instantNow = Instant.now();
            if (instantNow.compareTo(instant) < 0) {
                int i = com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_transfer_section_progress_title;
                int i2 = com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_transfer_section_progress_subtitle;
                Duration durationBetween = Duration.between(instant.minus((TemporalAmount) Duration.ofHours(24L)), instantNow);
                Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                long jH = kotlin.time.c.h(durationBetween.getSeconds(), pkm.e.SECONDS);
                int nano = durationBetween.getNano();
                pkm.e eVar2 = pkm.e.NANOSECONDS;
                long jL = kotlin.time.b.l(jH, kotlin.time.c.g(nano, eVar2));
                long jG = kotlin.time.c.g(1, pkm.e.DAYS);
                pkm.e eVar3 = (((int) jL) & 1) == 0 ? eVar2 : pkm.e.MILLISECONDS;
                z = true;
                if ((((int) jG) & 1) != 0) {
                    eVar2 = pkm.e.MILLISECONDS;
                }
                pkm.e eVar4 = (pkm.e) cim.c.k(eVar3, eVar2);
                iVarA = eVar.a(instant, i, i2, kotlin.ranges.f.g(rim.d.b((kotlin.time.b.m(jL, eVar4) / kotlin.time.b.m(jG, eVar4)) * ((double) 100)), 0, 100), null);
            } else {
                z = true;
                iVarA = eVar.a(instant, com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_transfer_section_completed_title, com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_transfer_section_completed_subtitle, 100, new ImageClause(R$drawable.uikit_icn_24_check, new ImageClauseTint.Color(R$attr.uikit_colorStatusSuccess), (Float) null, (Float) null, 28));
            }
        } else {
            z = true;
            Instant instant2 = troubleshootingInfo.f100201c;
            if (instant2 != null) {
                if (instant2.compareTo(Instant.now()) > 0) {
                    model = null;
                } else {
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_transfer_section_number_transfer_title, null, null, 14);
                    int i3 = com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_transfer_section_number_transfer_subtitle;
                    eVar.f272465a.getClass();
                    model = new PlainTextDelegate.Model("TRANSFER_PROGRESS_ID", (Clause) textLocalisedClause2, (Clause) new TextLocalisedClause(i3, zhm.u.c(tnj.a.a(instant2)), null, 12), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                }
                iVarA = model;
            } else {
                iVarA = null;
            }
        }
        if (iVarA != null) {
            yp0.b.l(iVarA, 0, 0, 0, 0, null, false, 63);
            iVar = iVarA;
        } else {
            iVar = null;
        }
        List listA = ((tnj.d) rVar.f17429b).a(iVar != null ? z : false);
        EsimProfile esimProfile = (EsimProfile) cVar.f255702a.getContent();
        if (esimProfile != null) {
            o1 o1Var = esimProfile.f100424b;
            tnj.c cVar2 = (tnj.c) rVar.d;
            boolean z3 = cVar.f255704c instanceof o;
            Intrinsics.checkNotNullParameter(troubleshootingInfo, "troubleshootingInfo");
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            tnj.a aVar = cVar2.f272462a;
            boolean z4 = troubleshootingInfo.f;
            Instant instant3 = troubleshootingInfo.d;
            if (z4) {
                int i5 = tnj.b.f272461a[o1Var.ordinal()];
                if (i5 == z) {
                    model3 = null;
                } else if (i5 != 2) {
                    if (z3) {
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_reset_section_install_esim_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_reset_section_esim_reset_subtitle, null, null, 14);
                        int i6 = R$drawable.uikit_icn_24_download;
                        aVar.getClass();
                        model2 = new RowDelegate.Model("INSTALL_ESIM_ID", tnj.a.b(i6), textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, (tf) aVar.f272460a.getValue(), false, null, false, null, null, null, null, null, null, null, new AnalyticsContext(vnj.a.a(esimProfile)), 0, 0, 0, 0, 528481240);
                        model3 = model2;
                    }
                    model3 = null;
                } else {
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_reset_section_pending_reset_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_reset_section_pending_reset_subtitle, null, null, 14);
                    int i21 = R$drawable.uikit_icn_24_refresh;
                    aVar.getClass();
                    model3 = new RowDelegate.Model("RESET_ESIM_ID", tnj.a.b(i21), textLocalisedClause5, null, 0, textLocalisedClause6, null, null, 0, null, false, null, false, RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536852440);
                }
            } else {
                if (o1Var == o1.INSTALLED && (troubleshootingInfo.e || instant3 != null)) {
                    TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_reset_section_reset_esim, null, null, 14);
                    if (instant3 != null) {
                        int i22 = com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_reset_section_reset_esim_subtitle;
                        aVar.getClass();
                        textLocalisedClause = new TextLocalisedClause(i22, zhm.u.c(tnj.a.a(instant3)), null, 12);
                    } else {
                        textLocalisedClause = null;
                    }
                    int i32 = R$drawable.uikit_icn_24_refresh;
                    aVar.getClass();
                    model2 = new RowDelegate.Model("RESET_ESIM_ID", tnj.a.b(i32), textLocalisedClause7, null, 0, textLocalisedClause, null, null, 0, (tf) aVar.f272460a.getValue(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
                    model3 = model2;
                }
                model3 = null;
            }
            listI = model3 != null ? yp0.b.i(model3, new ListSubheaderDelegate.Model("RESET_ESIM_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_reset_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : null;
            if (listI == null) {
                listI = f0.f322471a;
            }
        } else {
            listI = null;
        }
        if (listI == null) {
            listI = f0.f322471a;
        }
        return new rnj.f(iVar != null ? new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_header_subtitle_transfer, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_connectivity_issues_header_subtitle_generic, null, null, 14), zhm.d0.E0(listI, zhm.d0.E0(listA, v.l(iVar))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4, types: [mx0.l7] */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r2v18, types: [wpl.b] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17, types: [wpl.b] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [vpl.b] */
    /* JADX WARN: Type inference failed for: r9v12, types: [wpl.b] */
    /* JADX WARN: Type inference failed for: r9v6, types: [wpl.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r52, java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.c.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        Collection collectionJ;
        ts1.b bVar = (ts1.b) this.f263518b;
        ts1.w wVar = (ts1.w) this.f263519c;
        a12.j jVar = wVar.f273942a;
        ts1.c content = (ts1.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        e eVarB = zhm.u.b();
        if (bVar.f273921b) {
            eVarB.add(((s12.f) jVar).d(ApmBizum.f61808c.e()));
        }
        eVarB.addAll(((s12.a) wVar.f273943b).a(content.f273922a));
        eVarB.addAll(((s12.i) wVar.f273944c).a(content.f273923b));
        vs1.b bVar2 = wVar.d;
        ts1.e info = content.f273924c;
        List list = info.f273925a;
        Intrinsics.checkNotNullParameter(info, "info");
        if (list.isEmpty()) {
            collectionJ = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_SUBSCRIPTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_subscriptions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57258);
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(a9e.h.c(bVar2.f291711a, (qua.p) it8.next()));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            collectionJ = ue0.e.J(model, arrayList);
        }
        eVarB.addAll(collectionJ);
        eVarB.addAll(((s12.f) jVar).b(v.k(ts1.a.Settings, ts1.a.Help)));
        return zhm.u.a(eVarB);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z3;
        Object obj5;
        RowDelegate.Model.MainImage.Image24 image24A;
        Iterator it8;
        CellDetailsNoteDelegate.Model model;
        vt7.c cVar;
        String str;
        RowDelegate.Model.MainImage.Image24 image24A2;
        String str2;
        xs7.b bVar;
        Click click;
        Iterator it9;
        RowDelegate.Model.MainImage.Image24 image24A3;
        Integer numValueOf;
        String str3;
        tt7.r rVar = (tt7.r) this.f263518b;
        tt7.i iVar = (tt7.i) this.f263519c;
        os7.a layout = (os7.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        hha.d dVar = iVar.f274244b;
        ws7.b bVar2 = layout.f229255b;
        ss7.d section = layout.f;
        TextClause textClause = new TextClause(bVar2.f299675a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ws7.a aVar = layout.f229255b.f299676b;
        TextClause textClauseA = (aVar == null || (str3 = aVar.f299674a) == null) ? null : sr7.c.a(str3, null);
        e eVarB = zhm.u.b();
        if (layout.f229256c != null) {
            eVarB.add(new ActionsView.Item("ACTION_VIEW_DOCUMENTS", mx0.d.SECONDARY_WHITE, false, null, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_header_action_documents, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, layout.f229256c, null, 24476));
        }
        if (layout.d != null) {
            eVarB.add(new ActionsView.Item("ACTION_VIEW_GET_HELP", mx0.d.SECONDARY_WHITE, false, null, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_header_action_get_help, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_help_chat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, layout.d, null, 24476));
        }
        if (layout.e != null) {
            eVarB.add(new ActionsView.Item("ACTION_VIEW_MAKE_A_CLAIM", mx0.d.SECONDARY_WHITE, false, null, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_header_action_claim, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_claim, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, layout.e, null, 24476));
        }
        tt7.j jVar = new tt7.j(textClause, textClauseA, zhm.u.a(eVarB));
        AnimatedBackgroundType animatedBackgroundTypeA = dVar != null ? fgk.a.a(rVar.e, dVar) : AnimatedBackgroundType.DEFAULT.f51471a;
        e eVarB2 = zhm.u.b();
        String str4 = "section";
        if (section != null) {
            vt7.b bVar3 = rVar.f274259a;
            int i = R$attr.uikit_dp0;
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(section, "section");
            ArrayList arrayList = section.f265354a;
            z = false;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it10 = arrayList.iterator();
            while (it10.hasNext()) {
                ss7.c cVar2 = (ss7.c) it10.next();
                Float fValueOf = Float.valueOf(16.0f);
                String str5 = cVar2.f265351a;
                String strQ = j6.a.q("CONDITION_ITEM_ID_", str5);
                String str6 = cVar2.f265352b;
                if (str6 != null) {
                    it9 = it10;
                    image24A3 = zt7.c.a(bVar3.f291916a, str6, Integer.valueOf(R$attr.uikit_colorForeground));
                } else {
                    it9 = it10;
                    image24A3 = null;
                }
                TextLocalisedClause textLocalisedClauseS = l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_condition_title, str5);
                ss7.b bVar4 = cVar2.d;
                if (bVar4 instanceof ss7.a) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_copy);
                } else {
                    if (bVar4 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = null;
                }
                Clause[] elements = {textLocalisedClauseS, numValueOf != null ? new ImageClause(numValueOf.intValue(), (Integer) null, fValueOf, fValueOf, 18) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
                String str7 = cVar2.f265353c;
                TextLocalisedClause textLocalisedClauseS2 = str7 != null ? l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_condition_subtitle, str7) : null;
                ss7.b bVar5 = cVar2.d;
                arrayList2.add(new RowDelegate.Model(strQ, image24A3, compositeClauseM, null, 0, textLocalisedClauseS2, null, null, 0, null, bVar5 != null, null, false, null, null, null, null, null, null, bVar5, new AnalyticsContext(zw4.a.a("CONDITION_ITEM_ID_".concat(str5))), 0, 0, 0, 0, 524285912));
                it10 = it9;
            }
            z3 = true;
            yp0.b.k(arrayList2, i, 0, 0, 0, 30);
            Iterator it11 = arrayList2.iterator();
            while (it11.hasNext()) {
                eVarB2.add((koi.j) it11.next());
            }
        } else {
            z = false;
            z3 = true;
        }
        xs7.g section2 = layout.f229257g;
        if (section2 != null) {
            vt7.d dVar2 = rVar.f274260b;
            int i2 = R$attr.uikit_dp16;
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(section2, "section");
            ArrayList arrayList3 = section2.f308435a;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it12 = arrayList3.iterator();
            while (it12.hasNext()) {
                xs7.f fVar = (xs7.f) it12.next();
                String str8 = fVar.f308432a;
                xs7.b bVar6 = fVar.f308434c;
                String strQ2 = j6.a.q("POLICY_INFO_ITEM_ID_", str8);
                int i3 = com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_policy_info_title;
                String str9 = fVar.f308432a;
                TextLocalisedClause textLocalisedClauseS3 = l9.l.s(i3, str9);
                xs7.e eVar = fVar.d;
                aw0.t0 t0Var = new aw0.t0(textLocalisedClauseS3, eVar != null ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, 0, eVar != null ? z3 : z, 20);
                Iterator it13 = it12;
                int i5 = com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_policy_info_value;
                String str10 = fVar.f308433b;
                if (bVar6 != null) {
                    str2 = str10;
                    bVar = bVar6;
                    click = new Click(12, Integer.valueOf(R$attr.uikit_colorBlue), (Object) bVar6, str2, false);
                } else {
                    str2 = str10;
                    bVar = bVar6;
                    click = null;
                }
                arrayList4.add(new CellDetailsDelegate.Model(strQ2, t0Var, l9.l.e(new TextClause(str2, (Style) click, (Integer) null, false, (o9) null, (List) null, 124), i5), null, (eVar == null && bVar == null) ? null : new xs7.c(eVar, bVar), null, null, 0, null, false, false, null, new AnalyticsContext(zw4.a.a("POLICY_INFO_ITEM_ID_".concat(str9))), 16312));
                it12 = it13;
            }
            yp0.b.k(arrayList4, i2, 0, 0, 0, 30);
            Iterator it14 = arrayList4.iterator();
            while (it14.hasNext()) {
                eVarB2.add((koi.j) it14.next());
            }
        }
        List list = layout.f229258h;
        if (list != null) {
            Iterator it15 = list.iterator();
            while (it15.hasNext()) {
                us7.d dVar3 = (us7.d) it15.next();
                int i6 = section != null ? R$attr.uikit_dp16 : R$attr.uikit_dp0;
                vt7.c cVar3 = rVar.f274261c;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(dVar3, str4);
                e eVarB3 = zhm.u.b();
                String str11 = dVar3.f282834b;
                if (str11 != null) {
                    it8 = it15;
                    model = new CellDetailsNoteDelegate.Model("COVERAGE_SUBTITLE_ID_".concat(str11), l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_coverage_subtitle_title, str11), null, null, null, false, null, null, null, null, new AnalyticsContext(zw4.a.a("COVERAGE_SUBTITLE_ID_".concat(str11))), 0, 126964);
                } else {
                    it8 = it15;
                    model = null;
                }
                if (model != null) {
                    eVarB3.add(model);
                }
                ArrayList arrayList5 = dVar3.f282835c;
                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                Iterator it16 = arrayList5.iterator();
                while (it16.hasNext()) {
                    us7.c cVar4 = (us7.c) it16.next();
                    String str12 = cVar4.f282831b;
                    String strQ3 = j6.a.q("COVERAGE_ITEM_ID_", str12);
                    Iterator it17 = it16;
                    String str13 = cVar4.f282830a;
                    if (str13 != null) {
                        str = str4;
                        cVar = cVar3;
                        image24A2 = zt7.c.a(cVar3.f291917a, str13, Integer.valueOf(R$attr.uikit_colorForeground));
                    } else {
                        cVar = cVar3;
                        str = str4;
                        image24A2 = null;
                    }
                    TextLocalisedClause textLocalisedClauseS4 = l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_coverage_title, str12);
                    String str14 = cVar4.f282832c;
                    TextLocalisedClause textLocalisedClauseS5 = str14 != null ? l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_coverage_subtitle, str14) : null;
                    tf tfVar = new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246)));
                    us7.b bVar7 = cVar4.d;
                    arrayList6.add(new RowDelegate.Model(strQ3, image24A2, textLocalisedClauseS4, null, 0, textLocalisedClauseS5, null, null, 0, bVar7 != null ? tfVar : null, bVar7 != null ? z3 : z, null, false, null, null, null, null, null, null, bVar7, new AnalyticsContext(zw4.a.a("COVERAGE_ITEM_ID_".concat(str12))), 0, 0, 0, 0, 524284888));
                    it16 = it17;
                    str4 = str;
                    cVar3 = cVar;
                }
                String str15 = str4;
                Iterator it18 = arrayList6.iterator();
                while (it18.hasNext()) {
                    eVarB3.add((qv0.i) it18.next());
                }
                e eVarA = zhm.u.a(eVarB3);
                String str16 = dVar3.f282833a;
                Iterator it19 = zt7.b.a(eVarA, "COVERAGES_HEADER", str16 != null ? l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_details_coverages_section_title, str16) : null, i6).iterator();
                while (it19.hasNext()) {
                    eVarB2.add((koi.j) it19.next());
                }
                str4 = str15;
                it15 = it8;
            }
        }
        List actions = layout.i;
        if (actions != null) {
            vt7.a aVar2 = rVar.d;
            int i21 = R$attr.uikit_dp16;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(actions, "actions");
            List<InsuranceAction> list2 = actions;
            ArrayList arrayList7 = new ArrayList(w.t(list2, 10));
            for (InsuranceAction insuranceAction : list2) {
                String strQ4 = j6.a.q("ACTION_ITEM_", insuranceAction.f75758a);
                String str17 = insuranceAction.f75759b;
                if (str17 != null) {
                    obj5 = null;
                    image24A = zt7.c.a(aVar2.f291915a, str17, null);
                } else {
                    obj5 = null;
                    image24A = null;
                }
                arrayList7.add(new RowDelegate.Model(strQ4, image24A, new TextClause(insuranceAction.f75758a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, insuranceAction, new AnalyticsContext(zw4.a.a(strQ4)), 0, 0, 0, 0, 524284920));
            }
            yp0.b.k(arrayList7, i21, 0, 0, 0, 30);
            Iterator it20 = arrayList7.iterator();
            while (it20.hasNext()) {
                eVarB2.add((koi.j) it20.next());
            }
        }
        return new tt7.o(zhm.u.a(eVarB2), jVar, animatedBackgroundTypeA);
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        List listL;
        CellDetailsActionDelegate.Model model;
        int i;
        TextLocalisedClause textLocalisedClause;
        ttl.a0 a0Var = (ttl.a0) this.f263518b;
        ttl.g gVar = (ttl.g) this.f263519c;
        Map dateTypesMap = (Map) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(dateTypesMap, "dateTypesMap");
        nvl.b bVar = a0Var.f274440a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : dateTypesMap.entrySet()) {
            k4l.k kVar = (k4l.k) entry.getKey();
            nvl.g.Companion.getClass();
            if (nvl.a.f219744b.contains(kVar)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List availableDates = zhm.d0.P0(zhm.t0.C(linkedHashMap), new ttl.z());
        k4l.k selectedDate = gVar.f274445a;
        ((nvl.i) bVar).getClass();
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        List<Pair> list = availableDates;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Pair pair : list) {
            k4l.k type = (k4l.k) pair.f186385a;
            LocalDate date = (LocalDate) pair.f186386b;
            boolean z = type == selectedDate;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(date, "date");
            String str = "selectable." + type;
            String str2 = "selectable.date." + type;
            int[] iArr = nvl.h.f219748a;
            switch (iArr[type.ordinal()]) {
                case 1:
                case 2:
                    i = R$drawable.uikit_icn_24_calendar_check;
                    break;
                case 3:
                case 4:
                case 5:
                    i = R$drawable.uikit_icn_24_calendar;
                    break;
                case 6:
                    i = R$drawable.uikit_icn_24_calendar_date;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            LayeredImage layeredImageI = LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10);
            switch (iArr[type.ordinal()]) {
                case 1:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_today_title, null, null, 14);
                    break;
                case 2:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_next_trading_day_title, null, null, 14);
                    break;
                case 3:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_one_week_title, null, null, 14);
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_ninety_days_title, null, null, 14);
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_six_months_title, null, null, 14);
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_custom_title, null, null, 14);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new SelectableDelegate.Model(str, new RowDelegate.Model(str2, layeredImageI, null, null, textLocalisedClause, type != k4l.k.CUSTOM ? new TimeClause(oc.c.F(date), TimeClause.Format.DateLong.f57962b, null, null, 12) : new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_custom_info, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, new nvl.d(type), null, 0, 0, 0, 0, 1056964460), z, null, vd0.RADIO, 131048));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        k4l.k kVar2 = gVar.f274445a;
        k4l.k kVar3 = k4l.k.CUSTOM;
        if (kVar2 == kVar3) {
            LocalDate date2 = (LocalDate) dateTypesMap.get(kVar3);
            if (date2 != null) {
                ((nvl.i) bVar).getClass();
                Intrinsics.checkNotNullParameter(date2, "date");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_title, null, null, 14);
                long jF = oc.c.F(date2);
                TimeClause.Format.INSTANCE.getClass();
                CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("custom_date.input", textLocalisedClause2, 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TimeClause(jF, TimeClause.Format.f57959a, null, null, 12), null, false, false, null, null, new nvl.c(date2), 0, 0, 0, 0, 4192228);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                model = model2;
            } else {
                model = null;
            }
            listL = v.l(model);
        } else {
            listL = f0.f322471a;
        }
        return w.u(v.k(arrayList, listL));
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model modelA;
        CellDetailsDelegate.Model modelA2;
        CellDetailsDelegate.Model modelA3;
        CellDetailsDelegate.Model modelA4;
        List listQ;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        CellDetailsDelegate.Model modelA5;
        CellDetailsDelegate.Model modelA6;
        CellDetailsDelegate.Model model;
        List listQ2;
        dj0.d dVar;
        CellDetailsDelegate.Model modelA7;
        Collection collectionO;
        List listC;
        tuk.f fVar = (tuk.f) this.f263518b;
        tuk.o oVar = (tuk.o) this.f263519c;
        jel.c instrumentDetails = (jel.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        nel.n instrument = fVar.f274625a;
        if (((tuk.d) ((Map) oVar.f274634b).get(instrument.f214597c)) == null) {
            return f0.f322471a;
        }
        tuk.g gVar = (tuk.g) ((Map) oVar.f274635c).get(instrument.f214597c);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        jel.m mVar = instrumentDetails instanceof jel.m ? (jel.m) instrumentDetails : null;
        if (mVar == null) {
            collectionO = f0.f322471a;
        } else {
            jel.e eVar = mVar.f;
            BigDecimal bigDecimal = eVar.f173436a;
            jel.f fVar2 = eVar.d;
            LocalDate localDate = eVar.f173438c;
            jel.g gVar2 = eVar.f173437b;
            if (bigDecimal == null && gVar2 == null && localDate == null && fVar2 == null) {
                listQ = f0.f322471a;
            } else {
                ListSubheaderDelegate.Model modelB = vuk.b.b(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_screen_coupon_title, null, null, 14), "COUPON", b.a.C1567b.f283242a);
                if (bigDecimal != null) {
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_coupon_current_coupon, null, null, 14);
                    ytk.c.Companion.getClass();
                    modelA = vuk.b.a(new PercentageClause(bigDecimal, ytk.c.f316835a, (Style) null, 4), textLocalisedClause3, "COUPON_CURRENT");
                } else {
                    modelA = null;
                }
                if (gVar2 != null) {
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_coupon_coupon_type, null, null, 14);
                    int i = vuk.a.f292405a[gVar2.ordinal()];
                    if (i == 1) {
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_coupon_coupon_type_fixed, null, null, 14);
                    } else if (i == 2) {
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_coupon_coupon_type_floating, null, null, 14);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_coupon_coupon_type_step_up_step_down, null, null, 14);
                    }
                    modelA2 = vuk.b.a(textLocalisedClause2, textLocalisedClause4, "COUPON_TYPE");
                } else {
                    modelA2 = null;
                }
                if (localDate != null) {
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_coupon_next_coupon_date, null, null, 14);
                    long jP = ebm.a.P(localDate);
                    TimeClause.Format.INSTANCE.getClass();
                    modelA3 = vuk.b.a(new TimeClause(jP, TimeClause.Format.f57959a, null, null, 12), textLocalisedClause5, "COUPON_NEXT_DATE");
                } else {
                    modelA3 = null;
                }
                if (fVar2 != null) {
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_coupon_coupon_frequency, null, null, 14);
                    int i2 = vuk.a.f292406b[fVar2.ordinal()];
                    if (i2 == 1) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_coupon_frequency_annually, null, null, 14);
                    } else if (i2 == 2) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_coupon_frequency_semi_annual, null, null, 14);
                    } else if (i2 == 3) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_coupon_frequency_quarterly, null, null, 14);
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_coupon_frequency_monthly, null, null, 14);
                    }
                    modelA4 = vuk.b.a(textLocalisedClause, textLocalisedClause6, "COUPON_FREQUENCY");
                } else {
                    modelA4 = null;
                }
                CellDetailsDelegate.Model[] elements = {modelA, modelA2, modelA3, modelA4};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                listQ = i2b.a.q(modelB, listL);
            }
            ListSubheaderDelegate.Model modelB2 = vuk.b.b(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_screen_bond_issue_title, null, null, 14), "BOND_ISSUE", b.a.C1566a.f283241a);
            CellDetailsDelegate.Model modelA8 = vuk.b.a(new CurrencyClause(instrument.i, CurrencyClause.Format.Ticker.f57756a, null, 4), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_issue_currency, null, null, 14), "BOND_ISSUE_CURRENCY");
            jel.h hVar = mVar.d;
            LocalDate localDate2 = hVar.f173454c;
            if (localDate2 != null) {
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_issue_maturity, null, null, 14);
                long jP2 = ebm.a.P(localDate2);
                TimeClause.Format.INSTANCE.getClass();
                modelA5 = vuk.b.a(new TimeClause(jP2, TimeClause.Format.f57959a, null, null, 12), textLocalisedClause7, "BOND_ISSUE_MATURITY");
            } else {
                modelA5 = null;
            }
            dj0.d dVar2 = hVar.d;
            CellDetailsDelegate.Model modelA9 = dVar2 != null ? vuk.b.a(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_issue_face_value, null, null, 14), "BOND_ISSUE_FACE_VALUE") : null;
            LocalDate localDate3 = hVar.f173452a;
            if (localDate3 != null) {
                TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_issue_issue_date, null, null, 14);
                long jP3 = ebm.a.P(localDate3);
                TimeClause.Format.INSTANCE.getClass();
                modelA6 = vuk.b.a(new TimeClause(jP3, TimeClause.Format.f57959a, null, null, 12), textLocalisedClause8, "BOND_ISSUE_ISSUE_DATE");
            } else {
                modelA6 = null;
            }
            dj0.d dVar3 = hVar.f173453b;
            CellDetailsDelegate.Model modelA10 = dVar3 != null ? vuk.b.a(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_issue_issue_price, null, null, 14), "BOND_ISSUE_ISSUE_PRICE") : null;
            dj0.d dVar4 = hVar.e;
            CellDetailsDelegate.Model modelA11 = dVar4 != null ? vuk.b.a(new MoneyClause(dVar4, new MoneyClause.Format.Shorts(false, 63), null, null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_issue_outstanding_volume, null, null, 14), "BOND_ISSUE_OUTSTANDING_VOLUME") : null;
            String str = instrument.f214600j;
            CellDetailsDelegate.Model[] elements2 = {modelA8, modelA5, modelA9, modelA6, modelA10, modelA11, str != null ? vuk.b.a(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_issue_isin, null, null, 14), "BOND_ISSUE_ISIN") : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL2 = kotlin.collections.d.L(elements2);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            List listO = i2b.a.o(listQ, i2b.a.q(modelB2, listL2));
            jel.d dVar5 = mVar.i;
            if (dVar5 == null) {
                listQ2 = f0.f322471a;
            } else {
                boolean z = dVar5.f173427a;
                ListSubheaderDelegate.Model modelB3 = vuk.b.b(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_screen_redemption_title, null, null, 14), "BOND_REDEMPTION", new uuk.c(z));
                CellDetailsDelegate.Model modelA12 = vuk.b.a(new TextLocalisedClause(z ? com.revolut.retail.common.ui.R$string.common_action_yes : com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_callability_callable, null, null, 14), "BOND_REDEMPTION_CALLABLE");
                if (z) {
                    LocalDate localDate4 = dVar5.f173428b;
                    if (localDate4 != null) {
                        TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_callability_next_call_date, null, null, 14);
                        long jP4 = ebm.a.P(localDate4);
                        TimeClause.Format.INSTANCE.getClass();
                        modelA7 = vuk.b.a(new TimeClause(jP4, TimeClause.Format.f57959a, null, null, 12), textLocalisedClause9, "BOND_REDEMPTION_NEXT_CALL_DATE");
                    } else {
                        modelA7 = null;
                    }
                    model = modelA7;
                } else {
                    model = null;
                }
                CellDetailsDelegate.Model[] elements3 = {modelA12, model, (!z || (dVar = dVar5.f173429c) == null) ? null : vuk.b.a(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_bonds_attributes_dictionary_bond_callability_next_call_price, null, null, 14), "BOND_REDEMPTION_NEXT_CALL_PRICE")};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                List listL3 = kotlin.collections.d.L(elements3);
                yp0.b.k(listL3, 0, 0, 0, 0, 31);
                listQ2 = i2b.a.q(modelB3, listL3);
            }
            collectionO = i2b.a.o(listO, listQ2);
        }
        return zhm.d0.E0((gVar == null || (listC = zhm.u.c(new TextDelegate.Model("DETAILED_STATS_FOOTER", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_footer_disclosure_bonds_disclaimer, zhm.u.c(new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "FOOTER_LEARN_MORE", false), 10)), null, 12))), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036))) == null) ? f0.f322471a : listC, collectionO);
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        tv4.p pVar = (tv4.p) this.f263518b;
        tv4.e eVar = (tv4.e) this.f263519c;
        tv4.d content = (tv4.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_transactions_title, null, null, 14);
        List listK = v.k(com.revolut.core.ui_kit.models.j.b(c7.Companion, content.f274695a, new LocalDateClause$DateFormat.MonthAndYear(0)), sx4.f.b(3, null, null, content.f274696b));
        m70.a.a(t0.f186434a);
        tv4.l lVar = new tv4.l(new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), textLocalisedClause);
        sv4.m mVar = pVar.f274715b;
        Data upcomingPayments = eVar.f274699b;
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        List list = (List) iii.c.f(upcomingPayments, new ss4.z(12), new ss4.a0(6), new sa5.b(mVar, 15));
        LinkedHashMap linkedHashMap = content.d;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LocalDate localDate = (LocalDate) entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayListB = pVar.f274714a.b(list2, false);
            String strS = h30.l.s("id_credit_card_transactions_header_", localDate);
            TimeClause timeClause = new TimeClause(oc.c.N(localDate), new TimeClause.Format.DayAndMonth(0), null, null, 12);
            dj0.d.Companion.getClass();
            dj0.d dVarF = dj0.d.e;
            int i = 0;
            for (Object obj5 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarF = i == 0 ? ((sv4.i) obj5).f() : pyd.c.O(dVarF, ((sv4.i) obj5).f());
                i = i2;
            }
            arrayList.add(yp0.b.g(arrayListB, new ListSubheaderDelegate.Model(strS, (Image) null, (Clause) timeClause, (Image) null, (Clause) sx4.f.b(3, null, null, dVarF), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null, 0, 0, 126));
        }
        return new tv4.m(lVar, zhm.d0.E0(w.u(arrayList), list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.revolut.core.ui_kit.models.Style, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter$Options] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        ec5.d dVar;
        String str;
        Iterator it8;
        Object next;
        Object objJ;
        Object objG;
        ?? r23;
        ?? next2;
        List selectedValues;
        int i;
        Clause clause;
        ArrayList arrayList;
        List<ScreenerOption> listV0;
        ?? r132;
        TextLocalisedClause textLocalisedClause;
        dj0.d u;
        TextClause textClause;
        r3 r3Var;
        List listC;
        String o;
        Data data;
        int i2;
        int i3 = this.f263517a;
        int i5 = 10;
        int i6 = 4;
        int i21 = 6;
        Object obj5 = null;
        Object obj6 = this.f263519c;
        Object obj7 = this.f263518b;
        int i22 = 2;
        boolean z = false;
        boolean z3 = true;
        switch (i3) {
            case 0:
                yh5.a aVar = (yh5.a) obj6;
                ec5.c content = (ec5.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                ((d) obj7).getClass();
                ec5.j jVar = content.f124432a;
                if (jVar == ec5.j.COMPLETED && (dVar = content.f124434c) != null && dVar.d && (str = dVar.f124437c) != null && str.length() != 0 && yh5.b.w(aVar)) {
                    return d.a(content);
                }
                if (jVar == ec5.j.STARTED && yh5.b.x(aVar)) {
                    return d.a(content);
                }
                if (jVar != ec5.j.RENEW) {
                    return f0.f322471a;
                }
                List listC2 = zhm.u.c(new ActionWidgetDelegate.Model("ONBOARDING_BANNER_LIST_ID", new TextLocalisedClause(com.revolut.feature.crypto.onboarding.impl.R$string.crypto_onboarding_banner_action_required_title_renewal, null, null, 14), new TextLocalisedClause(com.revolut.feature.crypto.onboarding.impl.R$string.crypto_onboarding_banner_action_required_description_renewal_restricted, null, null, 14), new com.revolut.core.ui_kit.delegates.m(new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (LayeredImage) null, (ProgressStyle) null, 6), ActionWidgetDelegate.Model.b.C0394b.f51606a, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.crypto.onboarding.impl.R$string.crypto_onboarding_continue, null, null, 14), null, false), null, new bi5.c(content), null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return listC2;
            case 1:
                final i0 i0Var = (i0) obj7;
                snd.a content2 = (snd.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                List list = ((snd.b) obj6).f264522b;
                e eVarB = zhm.u.b();
                Data data2 = content2.f264517c;
                ynd.a aVar2 = (ynd.a) content2.f264516b.getContent();
                List list2 = aVar2 != null ? aVar2.f315441a : null;
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                eVarB.addAll((List) iii.c.f(data2, new snd.f0(i0Var, 4), new sl5.g(7), new lk7.p(i0Var, 29, list2, (AnalyticsDashboardContract$DashboardUserData) content2.i.getContent())));
                List<Object> list3 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (Object objA : list3) {
                    qv0.i iVar = objA instanceof qv0.i ? (qv0.i) objA : null;
                    if (iVar != null) {
                        objA = i0Var.a(iVar);
                    }
                    arrayList2.add(objA);
                }
                eVarB.addAll(arrayList2);
                final int i32 = 1;
                eVarB.addAll((List) iii.c.f(content2.d, new snd.f0(i0Var, 2), new sl5.g(i5), new Function3() { // from class: snd.g0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                        List listL;
                        hg hgVar;
                        int i33;
                        a6 a6Var;
                        Iterator it9;
                        qzi.a aVar3;
                        int iAbs;
                        TextLocalisedClause textLocalisedClause2;
                        CompositeClause compositeClauseA;
                        List list4;
                        String str2;
                        Iterator it10;
                        String str3;
                        Object model;
                        int i43;
                        boolean z4;
                        dj0.d dVar2;
                        ArrayList arrayList3;
                        String str4;
                        String strQ;
                        String str5;
                        gte.a aVar4;
                        List listL2;
                        int i59 = i32;
                        String str6 = "widgetData";
                        int i66 = 3;
                        i0 i0Var2 = i0Var;
                        switch (i59) {
                            case 0:
                                r0 toolsData = (r0) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(toolsData, "content");
                                wnd.h hVar = i0Var2.f264539b;
                                Intrinsics.checkNotNullParameter(toolsData, "toolsData");
                                if (hVar.b()) {
                                    y0 y0Var = toolsData.f307440a;
                                    RowDelegate.Model modelE = y0Var != null ? hVar.e(y0Var) : null;
                                    RowDelegate.Model modelD = hVar.d(toolsData);
                                    RowDelegate.Model modelI = toolsData.f307444h ? hVar.i() : null;
                                    q0 q0Var = toolsData.d;
                                    RowDelegate.Model modelJ = q0Var != null ? hVar.j(q0Var) : null;
                                    o0 o0Var = toolsData.e;
                                    RowDelegate.Model modelH = o0Var != null ? hVar.h(o0Var) : null;
                                    p0 p0Var = toolsData.f307442c;
                                    RowDelegate.Model modelG = p0Var != null ? hVar.g(p0Var) : null;
                                    Boolean bool = toolsData.f307443g;
                                    RowDelegate.Model modelF = bool != null ? hVar.f(bool.booleanValue()) : null;
                                    k0 k0Var = toolsData.f;
                                    qv0.i[] elements = {modelE, modelD, modelI, modelJ, modelH, modelG, modelF, k0Var != null ? hVar.c(k0Var) : null};
                                    Intrinsics.checkNotNullParameter(elements, "elements");
                                    listL = kotlin.collections.d.L(elements);
                                } else {
                                    RowDelegate.Model modelD2 = hVar.d(toolsData);
                                    Boolean bool2 = toolsData.f307443g;
                                    RowDelegate.Model modelF2 = bool2 != null ? hVar.f(bool2.booleanValue()) : null;
                                    o0 o0Var2 = toolsData.e;
                                    RowDelegate.Model modelH2 = o0Var2 != null ? hVar.h(o0Var2) : null;
                                    p0 p0Var2 = toolsData.f307442c;
                                    RowDelegate.Model modelG2 = p0Var2 != null ? hVar.g(p0Var2) : null;
                                    y0 y0Var2 = toolsData.f307440a;
                                    RowDelegate.Model modelE2 = y0Var2 != null ? hVar.e(y0Var2) : null;
                                    q0 q0Var2 = toolsData.d;
                                    RowDelegate.Model modelJ2 = q0Var2 != null ? hVar.j(q0Var2) : null;
                                    k0 k0Var2 = toolsData.f;
                                    qv0.i[] elements2 = {modelD2, modelF2, modelH2, modelG2, modelE2, modelJ2, k0Var2 != null ? hVar.c(k0Var2) : null, toolsData.f307444h ? hVar.i() : null};
                                    Intrinsics.checkNotNullParameter(elements2, "elements");
                                    listL = kotlin.collections.d.L(elements2);
                                }
                                List list5 = listL;
                                if (list5.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                return yp0.b.g(list5, new ListSubheaderDelegate.Model("TOOLS_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_tools_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), hVar.b() ? yp0.e0.INSIDE_BOX : yp0.e0.OUTSIDE_BOX, 0, 0, 124);
                            case 1:
                                List widgetData = (List) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(widgetData, "content");
                                Intrinsics.checkNotNullParameter("BUDGET_WIDGET_ID_", "id");
                                Intrinsics.checkNotNullParameter(widgetData, "widgetData");
                                if (widgetData.isEmpty()) {
                                    hgVar = null;
                                } else {
                                    List list6 = widgetData;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                                    Iterator it11 = list6.iterator();
                                    int i74 = 0;
                                    while (it11.hasNext()) {
                                        Object next3 = it11.next();
                                        int i92 = i74 + 1;
                                        if (i74 < 0) {
                                            zhm.v.s();
                                            throw null;
                                        }
                                        zod.w wVar = (zod.w) next3;
                                        String strN = a0.d.n("BUDGET_WIDGET_ID_", i74);
                                        qzi.h hVar2 = wVar.f324038a;
                                        qzi.g gVar = hVar2.f250656c;
                                        qzi.a aVar5 = hVar2.f250654a;
                                        dj0.d dVar3 = hVar2.f;
                                        int[] iArr = xod.u.f307826b;
                                        int i96 = iArr[gVar.ordinal()];
                                        if (i96 == 1) {
                                            i33 = R$attr.uikit_colorPerformanceNegative;
                                        } else if (i96 == 2) {
                                            i33 = R$attr.uikit_colorPerformancePositive;
                                        } else {
                                            if (i96 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i33 = R$attr.uikit_colorOrange;
                                        }
                                        int i99 = iArr[gVar.ordinal()];
                                        if (i99 == 1) {
                                            a6Var = w5.f10586a;
                                        } else if (i99 == 2) {
                                            a6Var = x5.f10605a;
                                        } else {
                                            if (i99 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            a6Var = z5.f10641a;
                                        }
                                        a6 a6Var2 = a6Var;
                                        int i100 = iArr[gVar.ordinal()];
                                        if (i100 == 1) {
                                            it9 = it11;
                                            aVar3 = aVar5;
                                            iAbs = 0;
                                        } else {
                                            if (i100 != 2 && i100 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            long j2 = aVar5.f250648c.f115082a;
                                            aVar3 = aVar5;
                                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar3.f115082a);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                                            it9 = it11;
                                            BigDecimal scale = bigDecimalValueOf.setScale(2);
                                            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
                                            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j2);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                                            BigDecimal bigDecimalDivide = scale.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                                            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(100);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(bigDecimalValueOf3);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                                            iAbs = Math.abs(bigDecimalMultiply.intValue());
                                        }
                                        dj0.d dVar4 = gVar == qzi.g.OVERSPENT ? new dj0.d(0L, dVar3.f115083b) : otd.f.a(dVar3.a());
                                        int i101 = xod.u.f307825a[wVar.f324039b.ordinal()];
                                        if (i101 == 1) {
                                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_account_personal, null, null, 14);
                                        } else {
                                            if (i101 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_account_joint, null, null, 14);
                                        }
                                        TextLocalisedClause textLocalisedClause3 = textLocalisedClause2;
                                        MoneyClause moneyClause = new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_budget_left_to_spend, null, null, 14);
                                        int i102 = iArr[gVar.ordinal()];
                                        if (i102 == 1) {
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_overspent, R$drawable.uikit_icn_16_exclamation_mark, i33);
                                        } else if (i102 == 2) {
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_on_track, R$drawable.uikit_icn_16_check_circle, i33);
                                        } else {
                                            if (i102 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_not_on_track, R$drawable.uikit_icn_24_exclamation_triangle, i33);
                                        }
                                        arrayList4.add(new CellWithLinearProgressDelegate.Model(strN, textLocalisedClause3, moneyClause, compositeClauseA, textLocalisedClause4, iAbs, new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_budget_remaining, zhm.u.c(new TextClause(String.valueOf(iAbs), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new MoneyClause(aVar3.f250648c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), a6Var2, wVar.f324040c));
                                        it11 = it9;
                                        i74 = i92;
                                        i66 = 3;
                                    }
                                    hgVar = new hg("BUDGET_WIDGET_ID_", arrayList4, 1, new y4(new aw0.d0(2, 1)), null, new gg.b(arrayList4.size() > 1, 2), false, false, null, null, 0, 0, 0, 0, 32720);
                                }
                                if (hgVar == null) {
                                    return zhm.f0.f322471a;
                                }
                                aim.e eVarB2 = zhm.u.b();
                                if (!i0Var2.f264541g) {
                                    eVarB2.add(new ListSubheaderDelegate.Model("BUDGETING_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_budget_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338));
                                }
                                eVarB2.add(i0Var2.a(hgVar));
                                return zhm.u.a(eVarB2);
                            default:
                                List content3 = (List) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(content3, "content");
                                if (content3.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                List list7 = content3;
                                ArrayList<n0> widgetsData = new ArrayList();
                                for (Object obj11 : list7) {
                                    if (obj11 instanceof n0) {
                                        widgetsData.add(obj11);
                                    }
                                }
                                aim.e eVarB3 = zhm.u.b();
                                if (widgetsData.isEmpty()) {
                                    list4 = list7;
                                    str2 = "widgetData";
                                } else {
                                    yod.m mVar = i0Var2.d;
                                    gte.a aVar6 = mVar.e;
                                    String str7 = "OVERVIEW_WIDGET_ID_";
                                    Intrinsics.checkNotNullParameter("OVERVIEW_WIDGET_ID_", "id");
                                    Intrinsics.checkNotNullParameter(widgetsData, "widgetsData");
                                    if (widgetsData.size() > 1) {
                                        z4 = true;
                                        i43 = 1;
                                    } else {
                                        i43 = 1;
                                        z4 = false;
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (n0 n0Var : widgetsData) {
                                        List list8 = n0Var.f324009a;
                                        NetWorthAccount netWorthAccount = n0Var.f;
                                        m0 m0Var = n0Var.e;
                                        List list9 = list7;
                                        xi0.b bVar = n0Var.f324011c;
                                        dj0.d dVarM = hx7.e.m(list8, bVar);
                                        dj0.d dVarM2 = hx7.e.m(n0Var.f324010b, bVar);
                                        if (m0Var.equals(l0.f324007a)) {
                                            dVar2 = dVarM2;
                                            arrayList3 = widgetsData;
                                            strQ = "personal";
                                            str4 = str7;
                                        } else {
                                            if (!(m0Var instanceof zod.k0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String str8 = ((zod.k0) m0Var).f324003a;
                                            dVar2 = dVarM2;
                                            arrayList3 = widgetsData;
                                            ArrayList arrayList6 = new ArrayList(str8.length());
                                            str4 = str7;
                                            for (int i103 = 0; i103 < str8.length(); i103++) {
                                                char cCharAt = str8.charAt(i103);
                                                if (!Character.isLetterOrDigit(cCharAt)) {
                                                    cCharAt = '_';
                                                }
                                                arrayList6.add(Character.valueOf(cCharAt));
                                            }
                                            strQ = j6.a.q("junior_", zhm.d0.k0(arrayList6, "", null, null, 0, null, 62));
                                        }
                                        if (!z4) {
                                            strQ = null;
                                        }
                                        j0 j0Var = n0Var.d;
                                        if (j0Var instanceof zod.g0) {
                                            zod.g0 g0Var = (zod.g0) j0Var;
                                            aVar4 = aVar6;
                                            amd.a aVar7 = g0Var.f323992c;
                                            str5 = str6;
                                            mVar = mVar;
                                            qv0.q qVarA = mVar.a(yod.m.d("ASSETS_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), m0Var, z4), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), dVarM, g0Var.f323990a, aVar7, true, n0Var.f324009a, n0Var.f324011c, new zod.l(yld.g.ASSET, netWorthAccount));
                                            qv0.q qVarA2 = (dVar2.k() && g0Var.f323991b.isEmpty()) ? null : mVar.a(yod.m.d("LIABILITIES_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), m0Var, z4), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), dVar2, g0Var.f323991b, aVar7, false, n0Var.f324010b, n0Var.f324011c, new zod.l(yld.g.LIABILITY, netWorthAccount));
                                            qv0.q[] elements3 = new qv0.q[2];
                                            elements3[0] = qVarA;
                                            elements3[i43] = qVarA2;
                                            Intrinsics.checkNotNullParameter(elements3, "elements");
                                            listL2 = kotlin.collections.d.L(elements3);
                                        } else {
                                            str5 = str6;
                                            aVar4 = aVar6;
                                            dj0.d dVar5 = dVar2;
                                            if (j0Var.equals(zod.h0.f323995a)) {
                                                String strD = yod.m.d("ASSETS_ID", strQ);
                                                zod.l lVar = new zod.l(yld.g.ASSET, netWorthAccount);
                                                AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
                                                qv0.q model2 = ((jte.d) aVar4).c(analyticsRevamp) ? new ChartWithDetailsLoadingWidgetDelegate.Model(strD, lVar, 2) : new ComparisonLineChartLoadingWidgetDelegate.Model(strD, lVar);
                                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                                String strD2 = yod.m.d("LIABILITIES_ID", strQ);
                                                zod.l lVar2 = new zod.l(yld.g.LIABILITY, netWorthAccount);
                                                qv0.q model3 = ((jte.d) aVar4).c(analyticsRevamp) ? new ChartWithDetailsLoadingWidgetDelegate.Model(strD2, lVar2, 2) : new ComparisonLineChartLoadingWidgetDelegate.Model(strD2, lVar2);
                                                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                                                qv0.q[] qVarArr = new qv0.q[2];
                                                qVarArr[0] = model2;
                                                qVarArr[i43] = model3;
                                                listL2 = zhm.v.k(qVarArr);
                                            } else {
                                                if (!j0Var.equals(zod.i0.f323998a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String strD3 = yod.m.d("ASSETS_ID", strQ);
                                                Clause clauseC = yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), m0Var, z4);
                                                List list10 = n0Var.f324009a;
                                                xi0.b bVar2 = n0Var.f324011c;
                                                yld.g gVar2 = yld.g.ASSET;
                                                AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp2 = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
                                                qv0.q qVarB = mVar.b(strD3, clauseC, dVarM, list10, bVar2, gVar2, netWorthAccount, ((jte.d) aVar4).c(analyticsRevamp2));
                                                qv0.q qVarB2 = !dVar5.k() ? mVar.b(yod.m.d("LIABILITIES_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), m0Var, z4), dVar5, n0Var.f324010b, n0Var.f324011c, yld.g.LIABILITY, netWorthAccount, ((jte.d) aVar4).c(analyticsRevamp2)) : null;
                                                qv0.q[] elements4 = new qv0.q[2];
                                                elements4[0] = qVarB;
                                                elements4[i43] = qVarB2;
                                                Intrinsics.checkNotNullParameter(elements4, "elements");
                                                listL2 = kotlin.collections.d.L(elements4);
                                            }
                                        }
                                        zhm.a0.x(listL2, arrayList5);
                                        list7 = list9;
                                        widgetsData = arrayList3;
                                        str7 = str4;
                                        aVar6 = aVar4;
                                        str6 = str5;
                                    }
                                    list4 = list7;
                                    str2 = str6;
                                    ArrayList arrayList7 = widgetsData;
                                    String str9 = str7;
                                    int i104 = i43;
                                    y4 y4Var = new y4(new aw0.d0(2, i104));
                                    gg.b bVar3 = new gg.b(arrayList5.size() > i104, 2);
                                    n0 n0Var2 = (n0) zhm.d0.M0(arrayList7);
                                    eVarB3.add(i0Var2.a(new hg(str9, arrayList5, 1, y4Var, null, bVar3, false, false, null, n0Var2 != null ? n0Var2.f : null, 0, 0, 0, 0, 31696)));
                                }
                                Iterator it12 = list4.iterator();
                                while (it12.hasNext()) {
                                    zod.s0 s0Var = (zod.s0) it12.next();
                                    if (s0Var instanceof n0) {
                                        it10 = it12;
                                        str3 = str2;
                                    } else {
                                        if (!(s0Var instanceof zod.r0)) {
                                            if ((s0Var instanceof zod.v) || (s0Var instanceof zod.w) || (s0Var instanceof zod.f0)) {
                                                throw new IllegalStateException("Widget type not supported in Overview section");
                                            }
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        zod.r0 r0Var = (zod.r0) s0Var;
                                        Intrinsics.checkNotNullParameter("TRIPS_GLOBE_WIDGET_ID_", "id");
                                        str3 = str2;
                                        Intrinsics.checkNotNullParameter(r0Var, str3);
                                        if (r0Var instanceof zod.o0) {
                                            zod.o0 o0Var3 = (zod.o0) r0Var;
                                            EarthMapWidgetDelegate.Model.Companion companion = EarthMapWidgetDelegate.Model.INSTANCE;
                                            Image image = o0Var3.f324015a;
                                            TextLocalisedClause topLabel = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_widget_title, null, null, 14);
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat1 = new com.revolut.core.ui_kit.delegates.widgets.p0(new PercentageClause(o0Var3.d, (PercentageClause.Format) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_percentage_world, null, null, 14));
                                            it10 = it12;
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat2 = new com.revolut.core.ui_kit.delegates.widgets.p0(new NumberClause(o0Var3.f324017c, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_trips, null, null, 14));
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat3 = new com.revolut.core.ui_kit.delegates.widgets.p0(new NumberClause(o0Var3.f324016b, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_countries, null, null, 14));
                                            companion.getClass();
                                            Intrinsics.checkNotNullParameter("TRIPS_GLOBE_WIDGET_ID_", "listId");
                                            Intrinsics.checkNotNullParameter(image, "image");
                                            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
                                            Intrinsics.checkNotNullParameter(stat1, "stat1");
                                            Intrinsics.checkNotNullParameter(stat2, "stat2");
                                            Intrinsics.checkNotNullParameter(stat3, "stat3");
                                            model = new EarthMapWidgetDelegate.Model(image, topLabel, stat1, stat2, stat3);
                                        } else {
                                            it10 = it12;
                                            if (r0Var instanceof zod.p0) {
                                                model = new EarthMapLoadingWidgetDelegate.Model();
                                            } else {
                                                if (!(r0Var instanceof zod.q0)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                model = null;
                                            }
                                        }
                                        if (model != null) {
                                            eVarB3.add(model);
                                        }
                                    }
                                    it12 = it10;
                                    str2 = str3;
                                }
                                aim.e eVarA = zhm.u.a(eVarB3);
                                if (eVarA.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                aim.e eVarB4 = zhm.u.b();
                                if (!i0Var2.f264541g) {
                                    eVarB4.add(new ListSubheaderDelegate.Model("OVERVIEW_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_overview_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338));
                                }
                                eVarB4.addAll(eVarA);
                                return zhm.u.a(eVarB4);
                        }
                    }
                }));
                final int i33 = 2;
                eVarB.addAll((List) iii.c.f(content2.e, new snd.f0(i0Var, 3), new sl5.g(11), new Function3() { // from class: snd.g0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                        List listL;
                        hg hgVar;
                        int i332;
                        a6 a6Var;
                        Iterator it9;
                        qzi.a aVar3;
                        int iAbs;
                        TextLocalisedClause textLocalisedClause2;
                        CompositeClause compositeClauseA;
                        List list4;
                        String str2;
                        Iterator it10;
                        String str3;
                        Object model;
                        int i43;
                        boolean z4;
                        dj0.d dVar2;
                        ArrayList arrayList3;
                        String str4;
                        String strQ;
                        String str5;
                        gte.a aVar4;
                        List listL2;
                        int i59 = i33;
                        String str6 = "widgetData";
                        int i66 = 3;
                        i0 i0Var2 = i0Var;
                        switch (i59) {
                            case 0:
                                r0 toolsData = (r0) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(toolsData, "content");
                                wnd.h hVar = i0Var2.f264539b;
                                Intrinsics.checkNotNullParameter(toolsData, "toolsData");
                                if (hVar.b()) {
                                    y0 y0Var = toolsData.f307440a;
                                    RowDelegate.Model modelE = y0Var != null ? hVar.e(y0Var) : null;
                                    RowDelegate.Model modelD = hVar.d(toolsData);
                                    RowDelegate.Model modelI = toolsData.f307444h ? hVar.i() : null;
                                    q0 q0Var = toolsData.d;
                                    RowDelegate.Model modelJ = q0Var != null ? hVar.j(q0Var) : null;
                                    o0 o0Var = toolsData.e;
                                    RowDelegate.Model modelH = o0Var != null ? hVar.h(o0Var) : null;
                                    p0 p0Var = toolsData.f307442c;
                                    RowDelegate.Model modelG = p0Var != null ? hVar.g(p0Var) : null;
                                    Boolean bool = toolsData.f307443g;
                                    RowDelegate.Model modelF = bool != null ? hVar.f(bool.booleanValue()) : null;
                                    k0 k0Var = toolsData.f;
                                    qv0.i[] elements = {modelE, modelD, modelI, modelJ, modelH, modelG, modelF, k0Var != null ? hVar.c(k0Var) : null};
                                    Intrinsics.checkNotNullParameter(elements, "elements");
                                    listL = kotlin.collections.d.L(elements);
                                } else {
                                    RowDelegate.Model modelD2 = hVar.d(toolsData);
                                    Boolean bool2 = toolsData.f307443g;
                                    RowDelegate.Model modelF2 = bool2 != null ? hVar.f(bool2.booleanValue()) : null;
                                    o0 o0Var2 = toolsData.e;
                                    RowDelegate.Model modelH2 = o0Var2 != null ? hVar.h(o0Var2) : null;
                                    p0 p0Var2 = toolsData.f307442c;
                                    RowDelegate.Model modelG2 = p0Var2 != null ? hVar.g(p0Var2) : null;
                                    y0 y0Var2 = toolsData.f307440a;
                                    RowDelegate.Model modelE2 = y0Var2 != null ? hVar.e(y0Var2) : null;
                                    q0 q0Var2 = toolsData.d;
                                    RowDelegate.Model modelJ2 = q0Var2 != null ? hVar.j(q0Var2) : null;
                                    k0 k0Var2 = toolsData.f;
                                    qv0.i[] elements2 = {modelD2, modelF2, modelH2, modelG2, modelE2, modelJ2, k0Var2 != null ? hVar.c(k0Var2) : null, toolsData.f307444h ? hVar.i() : null};
                                    Intrinsics.checkNotNullParameter(elements2, "elements");
                                    listL = kotlin.collections.d.L(elements2);
                                }
                                List list5 = listL;
                                if (list5.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                return yp0.b.g(list5, new ListSubheaderDelegate.Model("TOOLS_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_tools_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), hVar.b() ? yp0.e0.INSIDE_BOX : yp0.e0.OUTSIDE_BOX, 0, 0, 124);
                            case 1:
                                List widgetData = (List) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(widgetData, "content");
                                Intrinsics.checkNotNullParameter("BUDGET_WIDGET_ID_", "id");
                                Intrinsics.checkNotNullParameter(widgetData, "widgetData");
                                if (widgetData.isEmpty()) {
                                    hgVar = null;
                                } else {
                                    List list6 = widgetData;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                                    Iterator it11 = list6.iterator();
                                    int i74 = 0;
                                    while (it11.hasNext()) {
                                        Object next3 = it11.next();
                                        int i92 = i74 + 1;
                                        if (i74 < 0) {
                                            zhm.v.s();
                                            throw null;
                                        }
                                        zod.w wVar = (zod.w) next3;
                                        String strN = a0.d.n("BUDGET_WIDGET_ID_", i74);
                                        qzi.h hVar2 = wVar.f324038a;
                                        qzi.g gVar = hVar2.f250656c;
                                        qzi.a aVar5 = hVar2.f250654a;
                                        dj0.d dVar3 = hVar2.f;
                                        int[] iArr = xod.u.f307826b;
                                        int i96 = iArr[gVar.ordinal()];
                                        if (i96 == 1) {
                                            i332 = R$attr.uikit_colorPerformanceNegative;
                                        } else if (i96 == 2) {
                                            i332 = R$attr.uikit_colorPerformancePositive;
                                        } else {
                                            if (i96 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i332 = R$attr.uikit_colorOrange;
                                        }
                                        int i99 = iArr[gVar.ordinal()];
                                        if (i99 == 1) {
                                            a6Var = w5.f10586a;
                                        } else if (i99 == 2) {
                                            a6Var = x5.f10605a;
                                        } else {
                                            if (i99 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            a6Var = z5.f10641a;
                                        }
                                        a6 a6Var2 = a6Var;
                                        int i100 = iArr[gVar.ordinal()];
                                        if (i100 == 1) {
                                            it9 = it11;
                                            aVar3 = aVar5;
                                            iAbs = 0;
                                        } else {
                                            if (i100 != 2 && i100 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            long j2 = aVar5.f250648c.f115082a;
                                            aVar3 = aVar5;
                                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar3.f115082a);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                                            it9 = it11;
                                            BigDecimal scale = bigDecimalValueOf.setScale(2);
                                            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
                                            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j2);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                                            BigDecimal bigDecimalDivide = scale.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                                            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(100);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(bigDecimalValueOf3);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                                            iAbs = Math.abs(bigDecimalMultiply.intValue());
                                        }
                                        dj0.d dVar4 = gVar == qzi.g.OVERSPENT ? new dj0.d(0L, dVar3.f115083b) : otd.f.a(dVar3.a());
                                        int i101 = xod.u.f307825a[wVar.f324039b.ordinal()];
                                        if (i101 == 1) {
                                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_account_personal, null, null, 14);
                                        } else {
                                            if (i101 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_account_joint, null, null, 14);
                                        }
                                        TextLocalisedClause textLocalisedClause3 = textLocalisedClause2;
                                        MoneyClause moneyClause = new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_budget_left_to_spend, null, null, 14);
                                        int i102 = iArr[gVar.ordinal()];
                                        if (i102 == 1) {
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_overspent, R$drawable.uikit_icn_16_exclamation_mark, i332);
                                        } else if (i102 == 2) {
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_on_track, R$drawable.uikit_icn_16_check_circle, i332);
                                        } else {
                                            if (i102 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_not_on_track, R$drawable.uikit_icn_24_exclamation_triangle, i332);
                                        }
                                        arrayList4.add(new CellWithLinearProgressDelegate.Model(strN, textLocalisedClause3, moneyClause, compositeClauseA, textLocalisedClause4, iAbs, new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_budget_remaining, zhm.u.c(new TextClause(String.valueOf(iAbs), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new MoneyClause(aVar3.f250648c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), a6Var2, wVar.f324040c));
                                        it11 = it9;
                                        i74 = i92;
                                        i66 = 3;
                                    }
                                    hgVar = new hg("BUDGET_WIDGET_ID_", arrayList4, 1, new y4(new aw0.d0(2, 1)), null, new gg.b(arrayList4.size() > 1, 2), false, false, null, null, 0, 0, 0, 0, 32720);
                                }
                                if (hgVar == null) {
                                    return zhm.f0.f322471a;
                                }
                                aim.e eVarB2 = zhm.u.b();
                                if (!i0Var2.f264541g) {
                                    eVarB2.add(new ListSubheaderDelegate.Model("BUDGETING_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_budget_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338));
                                }
                                eVarB2.add(i0Var2.a(hgVar));
                                return zhm.u.a(eVarB2);
                            default:
                                List content3 = (List) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(content3, "content");
                                if (content3.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                List list7 = content3;
                                ArrayList<n0> widgetsData = new ArrayList();
                                for (Object obj11 : list7) {
                                    if (obj11 instanceof n0) {
                                        widgetsData.add(obj11);
                                    }
                                }
                                aim.e eVarB3 = zhm.u.b();
                                if (widgetsData.isEmpty()) {
                                    list4 = list7;
                                    str2 = "widgetData";
                                } else {
                                    yod.m mVar = i0Var2.d;
                                    gte.a aVar6 = mVar.e;
                                    String str7 = "OVERVIEW_WIDGET_ID_";
                                    Intrinsics.checkNotNullParameter("OVERVIEW_WIDGET_ID_", "id");
                                    Intrinsics.checkNotNullParameter(widgetsData, "widgetsData");
                                    if (widgetsData.size() > 1) {
                                        z4 = true;
                                        i43 = 1;
                                    } else {
                                        i43 = 1;
                                        z4 = false;
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (n0 n0Var : widgetsData) {
                                        List list8 = n0Var.f324009a;
                                        NetWorthAccount netWorthAccount = n0Var.f;
                                        m0 m0Var = n0Var.e;
                                        List list9 = list7;
                                        xi0.b bVar = n0Var.f324011c;
                                        dj0.d dVarM = hx7.e.m(list8, bVar);
                                        dj0.d dVarM2 = hx7.e.m(n0Var.f324010b, bVar);
                                        if (m0Var.equals(l0.f324007a)) {
                                            dVar2 = dVarM2;
                                            arrayList3 = widgetsData;
                                            strQ = "personal";
                                            str4 = str7;
                                        } else {
                                            if (!(m0Var instanceof zod.k0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String str8 = ((zod.k0) m0Var).f324003a;
                                            dVar2 = dVarM2;
                                            arrayList3 = widgetsData;
                                            ArrayList arrayList6 = new ArrayList(str8.length());
                                            str4 = str7;
                                            for (int i103 = 0; i103 < str8.length(); i103++) {
                                                char cCharAt = str8.charAt(i103);
                                                if (!Character.isLetterOrDigit(cCharAt)) {
                                                    cCharAt = '_';
                                                }
                                                arrayList6.add(Character.valueOf(cCharAt));
                                            }
                                            strQ = j6.a.q("junior_", zhm.d0.k0(arrayList6, "", null, null, 0, null, 62));
                                        }
                                        if (!z4) {
                                            strQ = null;
                                        }
                                        j0 j0Var = n0Var.d;
                                        if (j0Var instanceof zod.g0) {
                                            zod.g0 g0Var = (zod.g0) j0Var;
                                            aVar4 = aVar6;
                                            amd.a aVar7 = g0Var.f323992c;
                                            str5 = str6;
                                            mVar = mVar;
                                            qv0.q qVarA = mVar.a(yod.m.d("ASSETS_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), m0Var, z4), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), dVarM, g0Var.f323990a, aVar7, true, n0Var.f324009a, n0Var.f324011c, new zod.l(yld.g.ASSET, netWorthAccount));
                                            qv0.q qVarA2 = (dVar2.k() && g0Var.f323991b.isEmpty()) ? null : mVar.a(yod.m.d("LIABILITIES_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), m0Var, z4), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), dVar2, g0Var.f323991b, aVar7, false, n0Var.f324010b, n0Var.f324011c, new zod.l(yld.g.LIABILITY, netWorthAccount));
                                            qv0.q[] elements3 = new qv0.q[2];
                                            elements3[0] = qVarA;
                                            elements3[i43] = qVarA2;
                                            Intrinsics.checkNotNullParameter(elements3, "elements");
                                            listL2 = kotlin.collections.d.L(elements3);
                                        } else {
                                            str5 = str6;
                                            aVar4 = aVar6;
                                            dj0.d dVar5 = dVar2;
                                            if (j0Var.equals(zod.h0.f323995a)) {
                                                String strD = yod.m.d("ASSETS_ID", strQ);
                                                zod.l lVar = new zod.l(yld.g.ASSET, netWorthAccount);
                                                AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
                                                qv0.q model2 = ((jte.d) aVar4).c(analyticsRevamp) ? new ChartWithDetailsLoadingWidgetDelegate.Model(strD, lVar, 2) : new ComparisonLineChartLoadingWidgetDelegate.Model(strD, lVar);
                                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                                String strD2 = yod.m.d("LIABILITIES_ID", strQ);
                                                zod.l lVar2 = new zod.l(yld.g.LIABILITY, netWorthAccount);
                                                qv0.q model3 = ((jte.d) aVar4).c(analyticsRevamp) ? new ChartWithDetailsLoadingWidgetDelegate.Model(strD2, lVar2, 2) : new ComparisonLineChartLoadingWidgetDelegate.Model(strD2, lVar2);
                                                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                                                qv0.q[] qVarArr = new qv0.q[2];
                                                qVarArr[0] = model2;
                                                qVarArr[i43] = model3;
                                                listL2 = zhm.v.k(qVarArr);
                                            } else {
                                                if (!j0Var.equals(zod.i0.f323998a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String strD3 = yod.m.d("ASSETS_ID", strQ);
                                                Clause clauseC = yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), m0Var, z4);
                                                List list10 = n0Var.f324009a;
                                                xi0.b bVar2 = n0Var.f324011c;
                                                yld.g gVar2 = yld.g.ASSET;
                                                AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp2 = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
                                                qv0.q qVarB = mVar.b(strD3, clauseC, dVarM, list10, bVar2, gVar2, netWorthAccount, ((jte.d) aVar4).c(analyticsRevamp2));
                                                qv0.q qVarB2 = !dVar5.k() ? mVar.b(yod.m.d("LIABILITIES_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), m0Var, z4), dVar5, n0Var.f324010b, n0Var.f324011c, yld.g.LIABILITY, netWorthAccount, ((jte.d) aVar4).c(analyticsRevamp2)) : null;
                                                qv0.q[] elements4 = new qv0.q[2];
                                                elements4[0] = qVarB;
                                                elements4[i43] = qVarB2;
                                                Intrinsics.checkNotNullParameter(elements4, "elements");
                                                listL2 = kotlin.collections.d.L(elements4);
                                            }
                                        }
                                        zhm.a0.x(listL2, arrayList5);
                                        list7 = list9;
                                        widgetsData = arrayList3;
                                        str7 = str4;
                                        aVar6 = aVar4;
                                        str6 = str5;
                                    }
                                    list4 = list7;
                                    str2 = str6;
                                    ArrayList arrayList7 = widgetsData;
                                    String str9 = str7;
                                    int i104 = i43;
                                    y4 y4Var = new y4(new aw0.d0(2, i104));
                                    gg.b bVar3 = new gg.b(arrayList5.size() > i104, 2);
                                    n0 n0Var2 = (n0) zhm.d0.M0(arrayList7);
                                    eVarB3.add(i0Var2.a(new hg(str9, arrayList5, 1, y4Var, null, bVar3, false, false, null, n0Var2 != null ? n0Var2.f : null, 0, 0, 0, 0, 31696)));
                                }
                                Iterator it12 = list4.iterator();
                                while (it12.hasNext()) {
                                    zod.s0 s0Var = (zod.s0) it12.next();
                                    if (s0Var instanceof n0) {
                                        it10 = it12;
                                        str3 = str2;
                                    } else {
                                        if (!(s0Var instanceof zod.r0)) {
                                            if ((s0Var instanceof zod.v) || (s0Var instanceof zod.w) || (s0Var instanceof zod.f0)) {
                                                throw new IllegalStateException("Widget type not supported in Overview section");
                                            }
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        zod.r0 r0Var = (zod.r0) s0Var;
                                        Intrinsics.checkNotNullParameter("TRIPS_GLOBE_WIDGET_ID_", "id");
                                        str3 = str2;
                                        Intrinsics.checkNotNullParameter(r0Var, str3);
                                        if (r0Var instanceof zod.o0) {
                                            zod.o0 o0Var3 = (zod.o0) r0Var;
                                            EarthMapWidgetDelegate.Model.Companion companion = EarthMapWidgetDelegate.Model.INSTANCE;
                                            Image image = o0Var3.f324015a;
                                            TextLocalisedClause topLabel = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_widget_title, null, null, 14);
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat1 = new com.revolut.core.ui_kit.delegates.widgets.p0(new PercentageClause(o0Var3.d, (PercentageClause.Format) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_percentage_world, null, null, 14));
                                            it10 = it12;
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat2 = new com.revolut.core.ui_kit.delegates.widgets.p0(new NumberClause(o0Var3.f324017c, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_trips, null, null, 14));
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat3 = new com.revolut.core.ui_kit.delegates.widgets.p0(new NumberClause(o0Var3.f324016b, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_countries, null, null, 14));
                                            companion.getClass();
                                            Intrinsics.checkNotNullParameter("TRIPS_GLOBE_WIDGET_ID_", "listId");
                                            Intrinsics.checkNotNullParameter(image, "image");
                                            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
                                            Intrinsics.checkNotNullParameter(stat1, "stat1");
                                            Intrinsics.checkNotNullParameter(stat2, "stat2");
                                            Intrinsics.checkNotNullParameter(stat3, "stat3");
                                            model = new EarthMapWidgetDelegate.Model(image, topLabel, stat1, stat2, stat3);
                                        } else {
                                            it10 = it12;
                                            if (r0Var instanceof zod.p0) {
                                                model = new EarthMapLoadingWidgetDelegate.Model();
                                            } else {
                                                if (!(r0Var instanceof zod.q0)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                model = null;
                                            }
                                        }
                                        if (model != null) {
                                            eVarB3.add(model);
                                        }
                                    }
                                    it12 = it10;
                                    str2 = str3;
                                }
                                aim.e eVarA = zhm.u.a(eVarB3);
                                if (eVarA.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                aim.e eVarB4 = zhm.u.b();
                                if (!i0Var2.f264541g) {
                                    eVarB4.add(new ListSubheaderDelegate.Model("OVERVIEW_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_overview_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338));
                                }
                                eVarB4.addAll(eVarA);
                                return zhm.u.a(eVarB4);
                        }
                    }
                }));
                final int i43 = 0;
                eVarB.addAll((List) iii.c.f(content2.f, new snd.f0(i0Var, 1), new sl5.g(8), new Function3() { // from class: snd.g0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                        List listL;
                        hg hgVar;
                        int i332;
                        a6 a6Var;
                        Iterator it9;
                        qzi.a aVar3;
                        int iAbs;
                        TextLocalisedClause textLocalisedClause2;
                        CompositeClause compositeClauseA;
                        List list4;
                        String str2;
                        Iterator it10;
                        String str3;
                        Object model;
                        int i432;
                        boolean z4;
                        dj0.d dVar2;
                        ArrayList arrayList3;
                        String str4;
                        String strQ;
                        String str5;
                        gte.a aVar4;
                        List listL2;
                        int i59 = i43;
                        String str6 = "widgetData";
                        int i66 = 3;
                        i0 i0Var2 = i0Var;
                        switch (i59) {
                            case 0:
                                r0 toolsData = (r0) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(toolsData, "content");
                                wnd.h hVar = i0Var2.f264539b;
                                Intrinsics.checkNotNullParameter(toolsData, "toolsData");
                                if (hVar.b()) {
                                    y0 y0Var = toolsData.f307440a;
                                    RowDelegate.Model modelE = y0Var != null ? hVar.e(y0Var) : null;
                                    RowDelegate.Model modelD = hVar.d(toolsData);
                                    RowDelegate.Model modelI = toolsData.f307444h ? hVar.i() : null;
                                    q0 q0Var = toolsData.d;
                                    RowDelegate.Model modelJ = q0Var != null ? hVar.j(q0Var) : null;
                                    o0 o0Var = toolsData.e;
                                    RowDelegate.Model modelH = o0Var != null ? hVar.h(o0Var) : null;
                                    p0 p0Var = toolsData.f307442c;
                                    RowDelegate.Model modelG = p0Var != null ? hVar.g(p0Var) : null;
                                    Boolean bool = toolsData.f307443g;
                                    RowDelegate.Model modelF = bool != null ? hVar.f(bool.booleanValue()) : null;
                                    k0 k0Var = toolsData.f;
                                    qv0.i[] elements = {modelE, modelD, modelI, modelJ, modelH, modelG, modelF, k0Var != null ? hVar.c(k0Var) : null};
                                    Intrinsics.checkNotNullParameter(elements, "elements");
                                    listL = kotlin.collections.d.L(elements);
                                } else {
                                    RowDelegate.Model modelD2 = hVar.d(toolsData);
                                    Boolean bool2 = toolsData.f307443g;
                                    RowDelegate.Model modelF2 = bool2 != null ? hVar.f(bool2.booleanValue()) : null;
                                    o0 o0Var2 = toolsData.e;
                                    RowDelegate.Model modelH2 = o0Var2 != null ? hVar.h(o0Var2) : null;
                                    p0 p0Var2 = toolsData.f307442c;
                                    RowDelegate.Model modelG2 = p0Var2 != null ? hVar.g(p0Var2) : null;
                                    y0 y0Var2 = toolsData.f307440a;
                                    RowDelegate.Model modelE2 = y0Var2 != null ? hVar.e(y0Var2) : null;
                                    q0 q0Var2 = toolsData.d;
                                    RowDelegate.Model modelJ2 = q0Var2 != null ? hVar.j(q0Var2) : null;
                                    k0 k0Var2 = toolsData.f;
                                    qv0.i[] elements2 = {modelD2, modelF2, modelH2, modelG2, modelE2, modelJ2, k0Var2 != null ? hVar.c(k0Var2) : null, toolsData.f307444h ? hVar.i() : null};
                                    Intrinsics.checkNotNullParameter(elements2, "elements");
                                    listL = kotlin.collections.d.L(elements2);
                                }
                                List list5 = listL;
                                if (list5.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                return yp0.b.g(list5, new ListSubheaderDelegate.Model("TOOLS_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_tools_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), hVar.b() ? yp0.e0.INSIDE_BOX : yp0.e0.OUTSIDE_BOX, 0, 0, 124);
                            case 1:
                                List widgetData = (List) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(widgetData, "content");
                                Intrinsics.checkNotNullParameter("BUDGET_WIDGET_ID_", "id");
                                Intrinsics.checkNotNullParameter(widgetData, "widgetData");
                                if (widgetData.isEmpty()) {
                                    hgVar = null;
                                } else {
                                    List list6 = widgetData;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                                    Iterator it11 = list6.iterator();
                                    int i74 = 0;
                                    while (it11.hasNext()) {
                                        Object next3 = it11.next();
                                        int i92 = i74 + 1;
                                        if (i74 < 0) {
                                            zhm.v.s();
                                            throw null;
                                        }
                                        zod.w wVar = (zod.w) next3;
                                        String strN = a0.d.n("BUDGET_WIDGET_ID_", i74);
                                        qzi.h hVar2 = wVar.f324038a;
                                        qzi.g gVar = hVar2.f250656c;
                                        qzi.a aVar5 = hVar2.f250654a;
                                        dj0.d dVar3 = hVar2.f;
                                        int[] iArr = xod.u.f307826b;
                                        int i96 = iArr[gVar.ordinal()];
                                        if (i96 == 1) {
                                            i332 = R$attr.uikit_colorPerformanceNegative;
                                        } else if (i96 == 2) {
                                            i332 = R$attr.uikit_colorPerformancePositive;
                                        } else {
                                            if (i96 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i332 = R$attr.uikit_colorOrange;
                                        }
                                        int i99 = iArr[gVar.ordinal()];
                                        if (i99 == 1) {
                                            a6Var = w5.f10586a;
                                        } else if (i99 == 2) {
                                            a6Var = x5.f10605a;
                                        } else {
                                            if (i99 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            a6Var = z5.f10641a;
                                        }
                                        a6 a6Var2 = a6Var;
                                        int i100 = iArr[gVar.ordinal()];
                                        if (i100 == 1) {
                                            it9 = it11;
                                            aVar3 = aVar5;
                                            iAbs = 0;
                                        } else {
                                            if (i100 != 2 && i100 != i66) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            long j2 = aVar5.f250648c.f115082a;
                                            aVar3 = aVar5;
                                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar3.f115082a);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                                            it9 = it11;
                                            BigDecimal scale = bigDecimalValueOf.setScale(2);
                                            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
                                            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j2);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                                            BigDecimal bigDecimalDivide = scale.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                                            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(100);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(bigDecimalValueOf3);
                                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                                            iAbs = Math.abs(bigDecimalMultiply.intValue());
                                        }
                                        dj0.d dVar4 = gVar == qzi.g.OVERSPENT ? new dj0.d(0L, dVar3.f115083b) : otd.f.a(dVar3.a());
                                        int i101 = xod.u.f307825a[wVar.f324039b.ordinal()];
                                        if (i101 == 1) {
                                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_account_personal, null, null, 14);
                                        } else {
                                            if (i101 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_account_joint, null, null, 14);
                                        }
                                        TextLocalisedClause textLocalisedClause3 = textLocalisedClause2;
                                        MoneyClause moneyClause = new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_budget_left_to_spend, null, null, 14);
                                        int i102 = iArr[gVar.ordinal()];
                                        if (i102 == 1) {
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_overspent, R$drawable.uikit_icn_16_exclamation_mark, i332);
                                        } else if (i102 == 2) {
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_on_track, R$drawable.uikit_icn_16_check_circle, i332);
                                        } else {
                                            if (i102 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            compositeClauseA = xod.t.a(com.revolut.feature.spending_analytics.api.R$string.analytics_budgeting_overview_not_on_track, R$drawable.uikit_icn_24_exclamation_triangle, i332);
                                        }
                                        arrayList4.add(new CellWithLinearProgressDelegate.Model(strN, textLocalisedClause3, moneyClause, compositeClauseA, textLocalisedClause4, iAbs, new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_budget_remaining, zhm.u.c(new TextClause(String.valueOf(iAbs), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new MoneyClause(aVar3.f250648c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), a6Var2, wVar.f324040c));
                                        it11 = it9;
                                        i74 = i92;
                                        i66 = 3;
                                    }
                                    hgVar = new hg("BUDGET_WIDGET_ID_", arrayList4, 1, new y4(new aw0.d0(2, 1)), null, new gg.b(arrayList4.size() > 1, 2), false, false, null, null, 0, 0, 0, 0, 32720);
                                }
                                if (hgVar == null) {
                                    return zhm.f0.f322471a;
                                }
                                aim.e eVarB2 = zhm.u.b();
                                if (!i0Var2.f264541g) {
                                    eVarB2.add(new ListSubheaderDelegate.Model("BUDGETING_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_budget_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338));
                                }
                                eVarB2.add(i0Var2.a(hgVar));
                                return zhm.u.a(eVarB2);
                            default:
                                List content3 = (List) obj8;
                                ((Boolean) obj9).getClass();
                                Intrinsics.checkNotNullParameter(content3, "content");
                                if (content3.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                List list7 = content3;
                                ArrayList<n0> widgetsData = new ArrayList();
                                for (Object obj11 : list7) {
                                    if (obj11 instanceof n0) {
                                        widgetsData.add(obj11);
                                    }
                                }
                                aim.e eVarB3 = zhm.u.b();
                                if (widgetsData.isEmpty()) {
                                    list4 = list7;
                                    str2 = "widgetData";
                                } else {
                                    yod.m mVar = i0Var2.d;
                                    gte.a aVar6 = mVar.e;
                                    String str7 = "OVERVIEW_WIDGET_ID_";
                                    Intrinsics.checkNotNullParameter("OVERVIEW_WIDGET_ID_", "id");
                                    Intrinsics.checkNotNullParameter(widgetsData, "widgetsData");
                                    if (widgetsData.size() > 1) {
                                        z4 = true;
                                        i432 = 1;
                                    } else {
                                        i432 = 1;
                                        z4 = false;
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    for (n0 n0Var : widgetsData) {
                                        List list8 = n0Var.f324009a;
                                        NetWorthAccount netWorthAccount = n0Var.f;
                                        m0 m0Var = n0Var.e;
                                        List list9 = list7;
                                        xi0.b bVar = n0Var.f324011c;
                                        dj0.d dVarM = hx7.e.m(list8, bVar);
                                        dj0.d dVarM2 = hx7.e.m(n0Var.f324010b, bVar);
                                        if (m0Var.equals(l0.f324007a)) {
                                            dVar2 = dVarM2;
                                            arrayList3 = widgetsData;
                                            strQ = "personal";
                                            str4 = str7;
                                        } else {
                                            if (!(m0Var instanceof zod.k0)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String str8 = ((zod.k0) m0Var).f324003a;
                                            dVar2 = dVarM2;
                                            arrayList3 = widgetsData;
                                            ArrayList arrayList6 = new ArrayList(str8.length());
                                            str4 = str7;
                                            for (int i103 = 0; i103 < str8.length(); i103++) {
                                                char cCharAt = str8.charAt(i103);
                                                if (!Character.isLetterOrDigit(cCharAt)) {
                                                    cCharAt = '_';
                                                }
                                                arrayList6.add(Character.valueOf(cCharAt));
                                            }
                                            strQ = j6.a.q("junior_", zhm.d0.k0(arrayList6, "", null, null, 0, null, 62));
                                        }
                                        if (!z4) {
                                            strQ = null;
                                        }
                                        j0 j0Var = n0Var.d;
                                        if (j0Var instanceof zod.g0) {
                                            zod.g0 g0Var = (zod.g0) j0Var;
                                            aVar4 = aVar6;
                                            amd.a aVar7 = g0Var.f323992c;
                                            str5 = str6;
                                            mVar = mVar;
                                            qv0.q qVarA = mVar.a(yod.m.d("ASSETS_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), m0Var, z4), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), dVarM, g0Var.f323990a, aVar7, true, n0Var.f324009a, n0Var.f324011c, new zod.l(yld.g.ASSET, netWorthAccount));
                                            qv0.q qVarA2 = (dVar2.k() && g0Var.f323991b.isEmpty()) ? null : mVar.a(yod.m.d("LIABILITIES_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), m0Var, z4), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), dVar2, g0Var.f323991b, aVar7, false, n0Var.f324010b, n0Var.f324011c, new zod.l(yld.g.LIABILITY, netWorthAccount));
                                            qv0.q[] elements3 = new qv0.q[2];
                                            elements3[0] = qVarA;
                                            elements3[i432] = qVarA2;
                                            Intrinsics.checkNotNullParameter(elements3, "elements");
                                            listL2 = kotlin.collections.d.L(elements3);
                                        } else {
                                            str5 = str6;
                                            aVar4 = aVar6;
                                            dj0.d dVar5 = dVar2;
                                            if (j0Var.equals(zod.h0.f323995a)) {
                                                String strD = yod.m.d("ASSETS_ID", strQ);
                                                zod.l lVar = new zod.l(yld.g.ASSET, netWorthAccount);
                                                AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
                                                qv0.q model2 = ((jte.d) aVar4).c(analyticsRevamp) ? new ChartWithDetailsLoadingWidgetDelegate.Model(strD, lVar, 2) : new ComparisonLineChartLoadingWidgetDelegate.Model(strD, lVar);
                                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                                String strD2 = yod.m.d("LIABILITIES_ID", strQ);
                                                zod.l lVar2 = new zod.l(yld.g.LIABILITY, netWorthAccount);
                                                qv0.q model3 = ((jte.d) aVar4).c(analyticsRevamp) ? new ChartWithDetailsLoadingWidgetDelegate.Model(strD2, lVar2, 2) : new ComparisonLineChartLoadingWidgetDelegate.Model(strD2, lVar2);
                                                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                                                qv0.q[] qVarArr = new qv0.q[2];
                                                qVarArr[0] = model2;
                                                qVarArr[i432] = model3;
                                                listL2 = zhm.v.k(qVarArr);
                                            } else {
                                                if (!j0Var.equals(zod.i0.f323998a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String strD3 = yod.m.d("ASSETS_ID", strQ);
                                                Clause clauseC = yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_assets, null, null, 14), m0Var, z4);
                                                List list10 = n0Var.f324009a;
                                                xi0.b bVar2 = n0Var.f324011c;
                                                yld.g gVar2 = yld.g.ASSET;
                                                AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp2 = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
                                                qv0.q qVarB = mVar.b(strD3, clauseC, dVarM, list10, bVar2, gVar2, netWorthAccount, ((jte.d) aVar4).c(analyticsRevamp2));
                                                qv0.q qVarB2 = !dVar5.k() ? mVar.b(yod.m.d("LIABILITIES_ID", strQ), yod.m.c(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_widget_total_wealth_liabilities, null, null, 14), m0Var, z4), dVar5, n0Var.f324010b, n0Var.f324011c, yld.g.LIABILITY, netWorthAccount, ((jte.d) aVar4).c(analyticsRevamp2)) : null;
                                                qv0.q[] elements4 = new qv0.q[2];
                                                elements4[0] = qVarB;
                                                elements4[i432] = qVarB2;
                                                Intrinsics.checkNotNullParameter(elements4, "elements");
                                                listL2 = kotlin.collections.d.L(elements4);
                                            }
                                        }
                                        zhm.a0.x(listL2, arrayList5);
                                        list7 = list9;
                                        widgetsData = arrayList3;
                                        str7 = str4;
                                        aVar6 = aVar4;
                                        str6 = str5;
                                    }
                                    list4 = list7;
                                    str2 = str6;
                                    ArrayList arrayList7 = widgetsData;
                                    String str9 = str7;
                                    int i104 = i432;
                                    y4 y4Var = new y4(new aw0.d0(2, i104));
                                    gg.b bVar3 = new gg.b(arrayList5.size() > i104, 2);
                                    n0 n0Var2 = (n0) zhm.d0.M0(arrayList7);
                                    eVarB3.add(i0Var2.a(new hg(str9, arrayList5, 1, y4Var, null, bVar3, false, false, null, n0Var2 != null ? n0Var2.f : null, 0, 0, 0, 0, 31696)));
                                }
                                Iterator it12 = list4.iterator();
                                while (it12.hasNext()) {
                                    zod.s0 s0Var = (zod.s0) it12.next();
                                    if (s0Var instanceof n0) {
                                        it10 = it12;
                                        str3 = str2;
                                    } else {
                                        if (!(s0Var instanceof zod.r0)) {
                                            if ((s0Var instanceof zod.v) || (s0Var instanceof zod.w) || (s0Var instanceof zod.f0)) {
                                                throw new IllegalStateException("Widget type not supported in Overview section");
                                            }
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        zod.r0 r0Var = (zod.r0) s0Var;
                                        Intrinsics.checkNotNullParameter("TRIPS_GLOBE_WIDGET_ID_", "id");
                                        str3 = str2;
                                        Intrinsics.checkNotNullParameter(r0Var, str3);
                                        if (r0Var instanceof zod.o0) {
                                            zod.o0 o0Var3 = (zod.o0) r0Var;
                                            EarthMapWidgetDelegate.Model.Companion companion = EarthMapWidgetDelegate.Model.INSTANCE;
                                            Image image = o0Var3.f324015a;
                                            TextLocalisedClause topLabel = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_widget_title, null, null, 14);
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat1 = new com.revolut.core.ui_kit.delegates.widgets.p0(new PercentageClause(o0Var3.d, (PercentageClause.Format) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_percentage_world, null, null, 14));
                                            it10 = it12;
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat2 = new com.revolut.core.ui_kit.delegates.widgets.p0(new NumberClause(o0Var3.f324017c, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_trips, null, null, 14));
                                            com.revolut.core.ui_kit.delegates.widgets.p0 stat3 = new com.revolut.core.ui_kit.delegates.widgets.p0(new NumberClause(o0Var3.f324016b, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_countries, null, null, 14));
                                            companion.getClass();
                                            Intrinsics.checkNotNullParameter("TRIPS_GLOBE_WIDGET_ID_", "listId");
                                            Intrinsics.checkNotNullParameter(image, "image");
                                            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
                                            Intrinsics.checkNotNullParameter(stat1, "stat1");
                                            Intrinsics.checkNotNullParameter(stat2, "stat2");
                                            Intrinsics.checkNotNullParameter(stat3, "stat3");
                                            model = new EarthMapWidgetDelegate.Model(image, topLabel, stat1, stat2, stat3);
                                        } else {
                                            it10 = it12;
                                            if (r0Var instanceof zod.p0) {
                                                model = new EarthMapLoadingWidgetDelegate.Model();
                                            } else {
                                                if (!(r0Var instanceof zod.q0)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                model = null;
                                            }
                                        }
                                        if (model != null) {
                                            eVarB3.add(model);
                                        }
                                    }
                                    it12 = it10;
                                    str2 = str3;
                                }
                                aim.e eVarA = zhm.u.a(eVarB3);
                                if (eVarA.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                aim.e eVarB4 = zhm.u.b();
                                if (!i0Var2.f264541g) {
                                    eVarB4.add(new ListSubheaderDelegate.Model("OVERVIEW_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_dashboard_section_overview_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338));
                                }
                                eVarB4.addAll(eVarA);
                                return zhm.u.a(eVarB4);
                        }
                    }
                }));
                vzi.d dVar2 = (vzi.d) content2.f264518g.getContent();
                if (dVar2 == null) {
                    dVar2 = vzi.d.NONE;
                }
                n14.e.b(eVarB, rrd.g.b(dVar2));
                return zhm.u.a(eVarB);
            case 2:
                sph.l lVar = (sph.l) obj7;
                List unsavedFilters = (List) obj6;
                List content3 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                List list4 = content3;
                ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    soh.e eVar = (soh.e) it9.next();
                    if (eVar instanceof soh.d) {
                        sph.e eVar2 = lVar.f264957a;
                        soh.d filter = (soh.d) eVar;
                        Intrinsics.checkNotNullParameter(filter, "filter");
                        Intrinsics.checkNotNullParameter(unsavedFilters, "unsavedFilters");
                        objG = yp0.b.i(eVar2.f264952a.a(filter, unsavedFilters), new ListSubheaderDelegate.Model("header_" + filter.f264833a, (Image) null, (Clause) filter.f264834b, (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z3, z3, z, i6), false, false, (Object) new qph.o(filter.f264835c), (Parcelable) null, 0, 0, 0, 0, 64432), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG);
                        it8 = it9;
                    } else {
                        if (!(eVar instanceof ScreenerFilter$Options)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ScreenerFilter$Options filter2 = (ScreenerFilter$Options) eVar;
                        ScreenerFilterInfo screenerFilterInfo = filter2.f96156c;
                        Clause clause2 = filter2.f96155b;
                        boolean z4 = z;
                        ArrayList<ScreenerOption> allValues = filter2.e;
                        ?? r192 = obj5;
                        zel.g gVar = filter2.f96154a;
                        int i59 = sph.k.f264955a[filter2.d.ordinal()];
                        if (i59 == z3) {
                            it8 = it9;
                            sph.a aVar3 = lVar.f264958b;
                            Intrinsics.checkNotNullParameter(filter2, "filter");
                            Intrinsics.checkNotNullParameter(unsavedFilters, "unsavedFilters");
                            Iterator it10 = unsavedFilters.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (((ScreenerSelectedFilter) next).getF105167a() == gVar) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            ScreenerSelectedFilter.Options options = next instanceof ScreenerSelectedFilter.Options ? (ScreenerSelectedFilter.Options) next : null;
                            ip0.z zVarA = aVar3.f264951a.a(filter2, unsavedFilters);
                            if (zVarA != null) {
                                int i66 = R$attr.uikit_dp0;
                                yp0.b.p(zVarA, i66, R$attr.uikit_dp16, i66, i66);
                            } else {
                                zVarA = null;
                            }
                            List listL = v.l(zVarA);
                            if (listL.isEmpty()) {
                                objJ = f0.f322471a;
                            } else {
                                objJ = ue0.e.J(new ListSubheaderDelegate.Model("header_" + gVar, (Image) null, (Clause) (((options != null ? options.f105166b : null) == null || options.f105166b.isEmpty()) ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_section_header_title_pattern, v.k(clause2, new TextClause(String.valueOf(allValues.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_section_header_title_pattern, v.k(clause2, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_section_header_title_count_pattern, v.k(new TextClause(String.valueOf(options.f105166b.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(String.valueOf(allValues.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), null, 12)), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) new qph.o(screenerFilterInfo), (Parcelable) null, 0, 0, 0, 0, 64432), listL);
                            }
                            objG = objJ;
                        } else {
                            if (i59 != i22) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Intrinsics.checkNotNullParameter(filter2, "filter");
                            Intrinsics.checkNotNullParameter(unsavedFilters, "unsavedFilters");
                            Iterator it11 = unsavedFilters.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    next2 = it11.next();
                                    r23 = z3;
                                    if (((ScreenerSelectedFilter) next2).getF105167a() != gVar) {
                                        z3 = r23 == true ? 1 : 0;
                                    }
                                } else {
                                    r23 = z3;
                                    next2 = r192;
                                }
                            }
                            ?? r4 = next2 instanceof ScreenerSelectedFilter.Options ? (ScreenerSelectedFilter.Options) next2 : r192;
                            if (r4 == 0 || (selectedValues = r4.f105166b) == null) {
                                selectedValues = f0.f322471a;
                            }
                            Intrinsics.checkNotNullParameter(allValues, "allValues");
                            Intrinsics.checkNotNullParameter(selectedValues, "selectedValues");
                            if (allValues.isEmpty()) {
                                i = z4 ? 1 : 0;
                            } else {
                                int i74 = z4 ? 1 : 0;
                                for (ScreenerOption it12 : allValues) {
                                    Intrinsics.checkNotNullParameter(it12, "it");
                                    if (selectedValues.contains(it12.getF96152a()) && (i74 = i74 + 1) < 0) {
                                        v.r();
                                        throw r192;
                                    }
                                }
                                i = i74;
                            }
                            if (i > 3) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj8 : allValues) {
                                    Iterator it13 = it9;
                                    Clause clause3 = clause2;
                                    ScreenerOption it14 = (ScreenerOption) obj8;
                                    Intrinsics.checkNotNullParameter(it14, "it");
                                    if (selectedValues.contains(it14.getF96152a())) {
                                        arrayList4.add(obj8);
                                    }
                                    it9 = it13;
                                    clause2 = clause3;
                                }
                                it8 = it9;
                                clause = clause2;
                                listV0 = zhm.d0.V0(arrayList4, 3);
                                arrayList = allValues;
                            } else {
                                it8 = it9;
                                clause = clause2;
                                int i92 = 3 - i;
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it15 = allValues.iterator();
                                int i96 = z4 ? 1 : 0;
                                while (it15.hasNext()) {
                                    Iterator it16 = it15;
                                    Object next3 = it16.next();
                                    ArrayList arrayList6 = allValues;
                                    ScreenerOption it17 = (ScreenerOption) next3;
                                    Intrinsics.checkNotNullParameter(it17, "it");
                                    if (selectedValues.contains(it17.getF96152a())) {
                                        r132 = r23;
                                    } else if (i96 < i92) {
                                        i96++;
                                        r132 = r23;
                                    } else {
                                        r132 = z4 ? 1 : 0;
                                    }
                                    if (r132 != 0) {
                                        arrayList5.add(next3);
                                    }
                                    it15 = it16;
                                    allValues = arrayList6;
                                }
                                arrayList = allValues;
                                listV0 = zhm.d0.V0(arrayList5, 3);
                            }
                            ?? r110 = arrayList.size() > listV0.size() ? r23 : z4 ? 1 : 0;
                            String str2 = "header_" + gVar;
                            Intrinsics.checkNotNullParameter(filter2, "filter");
                            if ((r4 != 0 ? r4.f105166b : r192) == 0 || r4.f105166b.isEmpty()) {
                                int i99 = com.revolut.retail.wealth.resources.R$string.screener_section_header_title_pattern;
                                TextClause textClause2 = new TextClause(String.valueOf(arrayList.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                Clause[] clauseArr = new Clause[2];
                                clauseArr[z4 ? 1 : 0] = clause;
                                clauseArr[r23] = textClause2;
                                textLocalisedClause = new TextLocalisedClause(i99, v.k(clauseArr), null, 12);
                            } else {
                                int i100 = com.revolut.retail.wealth.resources.R$string.screener_section_header_title_pattern;
                                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_section_header_title_count_pattern, v.k(new TextClause(String.valueOf(r4.f105166b.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(String.valueOf(arrayList.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), r192, 12);
                                Clause[] clauseArr2 = new Clause[2];
                                clauseArr2[z4 ? 1 : 0] = clause;
                                clauseArr2[r23] = textLocalisedClause2;
                                textLocalisedClause = new TextLocalisedClause(i100, v.k(clauseArr2), r192, 12);
                            }
                            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(str2, (Image) null, (Clause) textLocalisedClause, (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) (r110 != 0 ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14) : null), "screener.filter." + gVar + ".see_all", (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(r23, z4, r110, 2), false, false, (Object) new qph.p(filter2, r4, screenerFilterInfo), (Parcelable) null, 0, 0, 0, 0, 64384);
                            ArrayList arrayList7 = new ArrayList();
                            for (ScreenerOption screenerOption : listV0) {
                                List list5 = r4 != 0 ? r4.f105166b : null;
                                if (list5 == null) {
                                    list5 = f0.f322471a;
                                }
                                SelectableDelegate.Model modelA = zph.t.a(screenerOption, filter2, zhm.d0.i1(list5));
                                if (modelA != null) {
                                    arrayList7.add(modelA);
                                }
                            }
                            objG = yp0.b.g(arrayList7, model, null, 0, 0, 126);
                        }
                    }
                    arrayList3.add(objG);
                    it9 = it8;
                    i6 = 4;
                    obj5 = null;
                    i22 = 2;
                    z = false;
                    z3 = true;
                }
                return w.u(arrayList3);
            case 3:
                return a(obj2, obj3, obj4);
            case 4:
                jsl.a0 a0Var = (jsl.a0) obj6;
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                tsl.j jVar2 = (tsl.j) pair.f186385a;
                nel.n instrument = (nel.n) pair.f186386b;
                ndf.f fVar = ((ssl.c) obj7).f265428a;
                InvestOrder investOrder = jVar2.a();
                wul.e eVar3 = (wul.e) fVar;
                Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                    int i101 = wul.d.f300227a[investOrder.getF104635j().ordinal()];
                    if (i101 == 1 || i101 == 2 || i101 == 3) {
                        u = ((InvestOrder.InvestSecuritiesOrder) investOrder).getU();
                    } else {
                        if (i101 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u = ((InvestOrder.InvestSecuritiesOrder) investOrder).getF104641r();
                    }
                } else {
                    if (investOrder instanceof InvestCommodityOrder) {
                        throw new IllegalStateException("Commodity order is unsupported");
                    }
                    if (investOrder instanceof InvestFundOrder) {
                        throw new IllegalStateException("Fund order is not supported");
                    }
                    if (investOrder instanceof InvestMutualFundOrder) {
                        throw new IllegalStateException("Mutual fund order is not supported");
                    }
                    if (investOrder instanceof InvestOptionOrder) {
                        throw new IllegalStateException("Option order is not supported");
                    }
                    if (!(investOrder instanceof InvestMarginOrder)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                    int i102 = wul.d.f300227a[investMarginOrder.f104552j.ordinal()];
                    if (i102 != 1 && i102 != 2 && i102 != 3) {
                        if (i102 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Recurring order type is unsupported");
                    }
                    u = investMarginOrder.f104559s;
                }
                MoneyClause moneyClause = new MoneyClause(com.revolut.retail.trading.core.domain.orders.a.n(u, investOrder.getF104634h()), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.NON_SENSITIVE, 4);
                InvestOrder investOrder2 = jVar2.a();
                Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                    if (wul.d.f300228b[instrument.f214597c.ordinal()] == 1) {
                        o = instrument.d;
                        InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                        k4l.r0 f104635j = investSecuritiesOrder.getF104635j();
                        BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                        if (oi0.d.z(f104635j)) {
                            o = com.google.android.gms.internal.mlkit_vision_face.a.o((f104643t.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : f104643t.stripTrailingZeros()).toPlainString(), " ", o);
                        }
                    } else {
                        o = ((InvestOrder.InvestSecuritiesOrder) investOrder2).getO();
                    }
                    textClause = new TextClause(o, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else {
                    if (investOrder2 instanceof InvestCommodityOrder) {
                        throw new IllegalStateException("Commodity order is unsupported");
                    }
                    if (investOrder2 instanceof InvestFundOrder) {
                        throw new IllegalStateException("Fund order is unsupported");
                    }
                    if (investOrder2 instanceof InvestMutualFundOrder) {
                        throw new IllegalStateException("Mutual fund order is unsupported");
                    }
                    if (investOrder2 instanceof InvestOptionOrder) {
                        throw new IllegalStateException("Option order is unsupported");
                    }
                    if (!(investOrder2 instanceof InvestMarginOrder)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textClause = new TextClause(((InvestMarginOrder) investOrder2).o, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                TextLocalisedClause textLocalisedClauseL = eVar3.f300230a.l(investOrder2.getF104634h(), investOrder2.getF104635j(), textClause, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), investOrder2.getD());
                InvestOrder investOrder3 = jVar2.a();
                Intrinsics.checkNotNullParameter(investOrder3, "investOrder");
                TimeClause timeClause = new TimeClause(investOrder3.getE().toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12);
                InvestOrder investOrder4 = jVar2.a();
                Intrinsics.checkNotNullParameter(investOrder4, "investOrder");
                if (investOrder4 instanceof InvestOrder.InvestSecuritiesOrder) {
                    r3Var = new r3(new yy0.j(nbh.a.a(com.revolut.retail.trading.core.domain.orders.a.j((InvestOrder.InvestSecuritiesOrder) investOrder4))));
                } else {
                    if (investOrder4 instanceof InvestCommodityOrder) {
                        throw new IllegalStateException("Commodity order is unsupported");
                    }
                    if (!(investOrder4 instanceof InvestMarginOrder)) {
                        if (investOrder4 instanceof InvestFundOrder) {
                            throw new IllegalStateException("Fund order is unsupported");
                        }
                        if (investOrder4 instanceof InvestMutualFundOrder) {
                            throw new IllegalStateException("Mutual fund order is unsupported");
                        }
                        if (investOrder4 instanceof InvestOptionOrder) {
                            throw new IllegalStateException("Option order is unsupported");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    r3Var = new r3(new yy0.j(nbh.a.a(com.revolut.retail.trading.core.domain.orders.a.h((InvestMarginOrder) investOrder4))));
                }
                r3 r3Var2 = r3Var;
                AccentCircleBadge accentCircleBadgeA = msl.a.a(jVar2.a().getF104634h(), jVar2.a().getF104635j());
                jsl.o oVar = a0Var.f;
                if (Intrinsics.f(oVar, jsl.m.f178223a)) {
                    listC = f0.f322471a;
                } else if (Intrinsics.f(oVar, jsl.l.f178221a)) {
                    listC = zhm.u.c(eVar3.j(jVar2.a(), true));
                } else {
                    if (!Intrinsics.f(oVar, jsl.n.f178225a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listC = zhm.u.c(eVar3.j(jVar2.a(), false));
                }
                return new jsl.f0(moneyClause, textLocalisedClauseL, timeClause, r3Var2, accentCircleBadgeA, listC);
            case 5:
                return b(obj2, obj3, obj4);
            case 6:
                return c(obj2, obj3, obj4);
            case 7:
                return d(obj2, obj3, obj4);
            case 8:
                return e(obj2, obj3, obj4);
            case 9:
                r3b.i iVar2 = (r3b.i) obj7;
                t3b.e eVar4 = (t3b.e) obj6;
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                wel.e eVar5 = (wel.e) pair2.f186385a;
                List list6 = (List) pair2.f186386b;
                return (!i2b.a.m(eVar5) || (data = iVar2.f251243c) == null) ? eVar4.a(list6, eVar5, null) : (tx0.r) iii.c.f(data, new t3b.b(eVar4, 1), new t3b.c(eVar4, 1), new soc.f(eVar4, i22, eVar5, list6));
            case 10:
                return g(obj2, obj3, obj4);
            case 11:
                t3b.l lVar2 = (t3b.l) obj7;
                Data data3 = (Data) obj6;
                h5b.e content4 = (h5b.e) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content4, "content");
                return (!content4.f149527c || content4.a() > 80) ? f0.f322471a : ((h5b.n) lVar2.f267732a).a(data3);
            case 12:
                return h(obj2, obj3, obj4);
            case 13:
                return i(obj2, obj3, obj4);
            case 14:
                return j(obj2, obj3, obj4);
            case 15:
                return k(obj2, obj3, obj4);
            case 16:
                return l(obj2, obj3, obj4);
            case 17:
                return m(obj2, obj3, obj4);
            case 18:
                return n(obj2, obj3, obj4);
            case 19:
                return o(obj2, obj3, obj4);
            case 20:
                return p(obj2, obj3, obj4);
            case 21:
                return q(obj2, obj3, obj4);
            case 22:
                return r(obj2, obj3, obj4);
            case 23:
                return s(obj2, obj3, obj4);
            case 24:
                return t(obj2, obj3, obj4);
            case 25:
                return u(obj2, obj3, obj4);
            case 26:
                return v(obj2, obj3, obj4);
            case 27:
                return w(obj2, obj3, obj4);
            case 28:
                return x(obj2, obj3, obj4);
            default:
                tvc.l lVar3 = (tvc.l) obj7;
                tvc.d dVar3 = (tvc.d) obj6;
                SecurityDelayInfo info = (SecurityDelayInfo) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(info, "info");
                if (info instanceof SecurityDelayInfo.Created) {
                    SecurityDelayType securityDelayType = dVar3.f274745a;
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_initial_title, null, null, 14);
                    if (securityDelayType instanceof SecurityDelayType.Transaction) {
                        i2 = com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_initial_subtitle;
                    } else {
                        if (!(securityDelayType instanceof SecurityDelayType.WealthProtection)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_wealth_protection_initial_subtitle;
                    }
                    lw0.a aVar4 = new lw0.a(textLocalisedClause3, new TextLocalisedClause(i2, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_lock, null, null, 6)), null, false, 24);
                    List listK = v.k(new RowDelegate.Model("SECURITY_DELAY_INFO_CREATED_TIME_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_time_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i21), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_bullet_time, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("SECURITY_DELAY_INFO_CREATED_NOTIFICATION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i21), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_bullet_notification, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("SECURITY_DELAY_INFO_CREATED_VERIFICATION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i21), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_bullet_verification, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    return new tvc.f(aVar4, listK, true, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_initial_action, null, null, 14), new TextLocalisedClause(tvc.l.b(securityDelayType), null, null, 14));
                }
                if (!(info instanceof SecurityDelayInfo.InProgress)) {
                    if (info instanceof SecurityDelayInfo.Ready) {
                        return lVar3.d(dVar3.f274745a);
                    }
                    if (info instanceof SecurityDelayInfo.NotFound) {
                        throw new IllegalStateException("NotFound state can't be rendered here");
                    }
                    if (info instanceof SecurityDelayInfo.Unknown) {
                        throw new IllegalStateException(j6.a.q("Unsupported security delay info: id=", ((SecurityDelayInfo.Unknown) info).f85417a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                SecurityDelayType securityDelayType2 = dVar3.f274745a;
                if (securityDelayType2 instanceof SecurityDelayType.Transaction) {
                    lw0.a aVar5 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_initial_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_initial_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_lock, null, null, 6)), null, false, 24);
                    List listK2 = v.k(new RowDelegate.Model("SECURITY_DELAY_INFO_CREATED_NOTIFICATION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i21), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_bullet_notification, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("SECURITY_DELAY_INFO_CREATED_VERIFICATION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i21), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_bullet_verification, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                    yp0.b.k(listK2, 0, 0, 0, 0, 31);
                    return new tvc.f(aVar5, listK2, true, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_got_it, null, null, 14), null);
                }
                if (!Intrinsics.f(securityDelayType2, SecurityDelayType.WealthProtection.f85459a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (dVar3.f274746b) {
                    return lVar3.d(securityDelayType2);
                }
                SecurityDelayInfo.InProgress inProgress = (SecurityDelayInfo.InProgress) info;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_in_progress_title, null, null, 14);
                long j2 = inProgress.f85414c;
                lw0.a aVar6 = new lw0.a(textLocalisedClause4, null, new lw0.f(j2 - inProgress.f85413b, j2), null, false, 26);
                List listK3 = v.k(new RowDelegate.Model("SECURITY_DELAY_INFO_IN_PROGRESS_TIME_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_time_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_bullet_notification, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("SECURITY_DELAY_INFO_IN_PROGRESS_VERIFICATION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_bullet_verification, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_bullet_subtile_verification, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                return new tvc.f(aVar6, listK3, false, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_delay_bottom_sheet_in_progress_action, null, null, 14), new TextLocalisedClause(tvc.l.b(securityDelayType2), null, null, 14));
        }
    }

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f263517a = i;
        this.f263518b = obj2;
        this.f263519c = obj3;
    }
}
