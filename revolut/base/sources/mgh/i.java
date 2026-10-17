package mgh;

import android.content.Context;
import android.os.Parcelable;
import aw0.a2;
import aw0.b9;
import aw0.e2;
import aw0.e5;
import aw0.f2;
import aw0.f5;
import aw0.k7;
import aw0.ka;
import aw0.l2;
import aw0.o0;
import aw0.o9;
import aw0.w1;
import aw0.y1;
import aw0.z1;
import cli.n;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.widgets.BarChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a0;
import com.revolut.core.ui_kit.delegates.widgets.c0;
import com.revolut.core.ui_kit.delegates.widgets.x;
import com.revolut.core.ui_kit.delegates.widgets.y;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.api.model.UserDeviceAddress;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingInstitutions;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingProvider;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.second_device_login.impl.R$string;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.ui.widgetised.models.PnLValues;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.youTransactor.uCube.rpc.Constants;
import dej.e3;
import dej.p0;
import ip0.a10;
import ip0.c10;
import ip0.c4;
import ip0.ck0;
import ip0.i10;
import ip0.iq;
import ip0.jj0;
import ip0.k10;
import ip0.qe0;
import ip0.re;
import ip0.te;
import ip0.ti0;
import ip0.ue;
import ip0.ui0;
import ip0.we0;
import ip0.xk;
import ip0.y10;
import ip0.yj0;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.ranges.IntRange;
import kotlin.text.d0;
import m1c.o;
import mel.i0;
import mel.q;
import mtl.r;
import mx0.v5;
import n47.t;
import nci.p;
import nci.s;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.cbeff.ISO781611;
import tof.x5;
import wxg.m;
import yp0.e0;
import zh9.b1;
import zh9.k1;
import zh9.l1;
import zh9.m1;
import zh9.n1;
import zh9.o1;
import zh9.q1;
import zh9.t1;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f205284b;

    public /* synthetic */ i(int i, cli.j jVar, n nVar) {
        this.f205283a = i;
        this.f205284b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a A[LOOP:0: B:27:0x0114->B:29:0x011a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mgh.i.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        mtc.n nVar = (mtc.n) this.f205284b;
        itc.c content = (itc.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(content instanceof itc.a)) {
            if (content instanceof itc.b) {
                return new mtc.i(mtc.n.a(), false);
            }
            throw new NoWhenBranchMatchedException();
        }
        sa saVar = new sa("SECOND_DEVICE_LOGIN_BANNER_LIST_ID", (Clause) new TextLocalisedClause(R$string.second_device_login_banner_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.second_device_login_banner_content, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        UserDevice userDevice = ((itc.a) content).f168361a;
        UserDeviceAddress userDeviceAddress = userDevice.f71924q;
        TextClause textClause = !d0.W(userDeviceAddress.d) ? new TextClause(userDeviceAddress.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        TextClause textClause2 = !d0.W(userDeviceAddress.f71929b) ? new TextClause(userDeviceAddress.f71929b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.second_device_login_info_location, null, null, 14);
        TextClause[] elements = {textClause, textClause2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("SECOND_DEVICE_LOGIN_LOCATION_LIST_ID", textLocalisedClause, new CompositeClause(kotlin.collections.d.L(elements), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.second_device_login_info_device, null, null, 14);
        r86.b bVar = nVar.f208818a;
        List listK = v.k(model, new CellDetailsDelegate.Model("SECOND_DEVICE_LOGIN_DEVICE_LIST_ID", textLocalisedClause2, bVar.a(userDevice), null, null, false, 0, null, null, null, null, 0, new ResourceImage(bVar.b(userDevice), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 0, 0, 0, 0, 1040360), new CellDetailsDelegate.Model("SECOND_DEVICE_LOGIN_IP_LIST_ID", new TextLocalisedClause(R$string.second_device_login_info_ip_address, null, null, 14), new TextClause(userDevice.f71918h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        List listK2 = v.k(new CellDetailsDelegate.Model("SECOND_DEVICE_LOGIN_LAST_ACTIVITY_LIST_ID", new TextLocalisedClause(R$string.second_device_login_info_last_activity, null, null, 14), new TimeClause(userDevice.o, new TimeClause.Format.Pretty(0), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("SECOND_DEVICE_LOGIN_FIRST_LOGIN_LIST_ID", new TextLocalisedClause(R$string.second_device_login_info_first_login, null, null, 14), new TimeClause(userDevice.f71923p, new TimeClause.Format.Pretty(0), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        return new mtc.i(ue0.e.J(saVar, w.u(v.k(listK, listK2))), true);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        List listG;
        Object bVar;
        Object obj5;
        r rVar = (r) this.f205284b;
        List investOrders = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(investOrders, "investOrders");
        ks0.n nVar = rVar.e;
        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = rVar.f208936a;
        if (!(investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.PendingOrders)) {
            if (!(investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.RecurringOrders)) {
                throw new NoWhenBranchMatchedException();
            }
            List listA = investOrders.isEmpty() ? rVar.a() : rVar.d(investOrders, nVar.e(ptl.b.INCLUDE_ONLY_RECURRING_BUYS));
            yp0.b.k(listA, 0, 0, 0, 0, 31);
            return listA;
        }
        InvestOrdersListFeatureContract$InputData.PendingOrders.Context context = ((InvestOrdersListFeatureContract$InputData.PendingOrders) investOrdersListFeatureContract$InputData).f91752b;
        if (!((jte.d) rVar.d).c(FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c)) {
            List listA2 = investOrders.isEmpty() ? rVar.a() : rVar.d(investOrders, nVar.e(ptl.b.ALL));
            yp0.b.k(listA2, 0, 0, 0, 0, 31);
            return listA2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : investOrders) {
            if (oi0.d.B(((InvestOrderExtended) obj6).getOrder().getF104635j())) {
                arrayList.add(obj6);
            } else {
                arrayList2.add(obj6);
            }
        }
        ArrayList arrayListF1 = zhm.d0.f1(rVar.d(zhm.d0.V0(arrayList, 3), nVar.e(ptl.b.INCLUDE_ONLY_RECURRING_BUYS)));
        if (!arrayListF1.isEmpty()) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_list_action_go_to_recurring_orders, null, null, 14);
            if (context == null) {
                obj5 = null;
            } else {
                if (context instanceof InvestOrdersListFeatureContract$InputData.PendingOrders.Context.Security) {
                    bVar = new mtl.c(((InvestOrdersListFeatureContract$InputData.PendingOrders.Context.Security) context).f91755a);
                } else {
                    if (!(context instanceof InvestOrdersListFeatureContract$InputData.PendingOrders.Context.Commodity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new mtl.b(((InvestOrdersListFeatureContract$InputData.PendingOrders.Context.Commodity) context).f91754a);
                }
                obj5 = bVar;
            }
            arrayListF1.add(new InputDisclosureDelegate.Model("LIST_ID_GO_TO_RECURRING_BUY", textLocalisedClause, null, obj5, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        }
        e0 e0Var = e0.OUTSIDE_BOX;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        if (!arrayListF1.isEmpty()) {
            arrayListF1 = yp0.b.d(arrayListF1, new ListSubheaderDelegate.Model("list_id_section_recurring", (Image) null, (Clause) new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_list_section_recurring, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i, i, i2, i2);
        }
        ArrayList arrayListD = rVar.d(arrayList2, nVar.e(ptl.b.EXCLUDE_RECURRING_BUYS));
        Lazy lazyY0 = te0.w.y0(new mq4.b(25));
        if (arrayListF1.isEmpty() && arrayListD.isEmpty()) {
            listG = rVar.a();
            yp0.b.k(listG, 0, 0, 0, 0, 31);
        } else {
            listG = arrayListD.isEmpty() ? yp0.b.g(rVar.a(), (ListSubheaderDelegate.Model) lazyY0.getValue(), null, 0, 0, 126) : yp0.b.g(arrayListD, (ListSubheaderDelegate.Model) lazyY0.getValue(), null, 0, 0, 126);
        }
        return w.u(v.k(arrayListF1, listG));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        muk.n nVar = (muk.n) this.f205284b;
        i0 technicalInsights = (i0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
        s0 s0Var = new s0(4);
        q qVar = technicalInsights.f204755a;
        TextLocalisedClause textLocalisedClauseY = mif.a.Y(qVar, null);
        float fU = mif.a.U(qVar);
        b9 b9VarT = mif.a.T(qVar);
        q qVar2 = q.BEARISH;
        TextLocalisedClause textLocalisedClauseY2 = mif.a.Y(qVar2, null);
        q qVar3 = q.NEUTRAL;
        TextLocalisedClause textLocalisedClauseY3 = mif.a.Y(qVar3, null);
        q qVar4 = q.BULLISH;
        c4 c4Var = new c4("TECHNICALS_BIG_GAUGE_ID", new o0(fU, b9VarT, textLocalisedClauseY2, textLocalisedClauseY3, mif.a.Y(qVar4, null)), textLocalisedClauseY);
        yp0.b.l(c4Var, 0, 0, 0, 0, null, false, 63);
        s0Var.a(c4Var);
        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
        CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
        String strA = ouk.b.a(qVar2);
        TextLocalisedClause textLocalisedClauseY4 = mif.a.Y(qVar2, null);
        Intrinsics.checkNotNullParameter(technicalInsights, "<this>");
        NumberClause numberClause = new NumberClause(mif.e0.i(technicalInsights, qVar2), (NumberClause.Format.Compact) null, (Custom) null, 6);
        int i = R$attr.uikit_dp0;
        CounterTextDelegate.Model modelD = CounterTextDelegate.Model.Companion.d(companion, strA, textLocalisedClauseY4, numberClause, i, i);
        String strA2 = ouk.b.a(qVar3);
        TextLocalisedClause textLocalisedClauseY5 = mif.a.Y(qVar3, null);
        Intrinsics.checkNotNullParameter(technicalInsights, "<this>");
        NumberClause numberClause2 = new NumberClause(mif.e0.i(technicalInsights, qVar3), (NumberClause.Format.Compact) null, (Custom) null, 6);
        int i2 = R$attr.uikit_dp0;
        CounterTextDelegate.Model modelD2 = CounterTextDelegate.Model.Companion.d(companion, strA2, textLocalisedClauseY5, numberClause2, i2, i2);
        String strA3 = ouk.b.a(qVar4);
        TextLocalisedClause textLocalisedClauseY6 = mif.a.Y(qVar4, null);
        Intrinsics.checkNotNullParameter(technicalInsights, "<this>");
        NumberClause numberClause3 = new NumberClause(mif.e0.i(technicalInsights, qVar4), (NumberClause.Format.Compact) null, (Custom) null, 6);
        int i3 = R$attr.uikit_dp0;
        List listK = v.k(modelD, modelD2, CounterTextDelegate.Model.Companion.d(companion, strA3, textLocalisedClauseY6, numberClause3, i3, i3));
        yp0.b.q(listK, 0, 0, 0, 0, 15);
        xk xkVar = new xk("TECHNICALS_COUNTER_CONTAINER_ID", listK, 3, null, null, 56);
        yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
        s0Var.a(xkVar);
        ouk.e eVar = nVar.f209048a;
        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
        s0Var.b(yp0.b.g(eVar.b("TECHNICALS_ITEM_MOVING_AVERAGE_ID", technicalInsights.f204756b), new ListSubheaderDelegate.Model("TECHNICALS_SUBHEADER_MOVING_AVERAGE_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_technicals_moving_averages, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) muk.h.f209044a, (Parcelable) null, 0, 0, 0, 0, 64434), null, 0, 0, 126).toArray(new koi.j[0]));
        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
        s0Var.b(yp0.b.g(eVar.b("TECHNICALS_ITEM_OSCILLATORS_ID", technicalInsights.f204757c), new ListSubheaderDelegate.Model("TECHNICALS_SUBHEADER_OSCILLATORS_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_technicals_oscillators, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) muk.i.f209045a, (Parcelable) null, 0, 0, 0, 0, 64434), null, 0, 0, 126).toArray(new koi.j[0]));
        ArrayList arrayList = s0Var.f186433a;
        return v.k(arrayList.toArray(new koi.j[arrayList.size()]));
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        Clause textLocalisedClause;
        myg.c cVar = (myg.c) this.f205284b;
        gte.a aVar = cVar.f210498b;
        jzg.a content = (jzg.a) obj2;
        ((Boolean) obj3).getClass();
        Float fValueOf = Float.valueOf(10.0f);
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.f179809a.isEmpty()) {
            if (((jte.d) aVar).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c)) {
                BarChartWidgetDelegate.Model.Companion aVar2 = BarChartWidgetDelegate.Model.INSTANCE;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_title, null, null, 14);
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(new e5(String.valueOf(it8.nextInt()), null, u.c(new f5(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorAccentNeutral)), 0, 104));
                }
                return BarChartWidgetDelegate.Model.Companion.b(aVar2, "ALLOCATIONS_WIDGET_LIST_ID", textLocalisedClause2, null, null, arrayList, null, null, null, 992);
            }
            BarChartWidgetDelegate.Model.Companion aVar3 = BarChartWidgetDelegate.Model.INSTANCE;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_title, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_asset_allocation_footer_empty_subtitle, null, null, 14);
            IntRange intRange2 = new IntRange(1, 5, 1);
            ArrayList arrayList2 = new ArrayList(w.t(intRange2, 10));
            vim.f it9 = intRange2.iterator();
            while (it9.f289625c) {
                arrayList2.add(new e5(String.valueOf(it9.nextInt()), null, u.c(new f5(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorAccentNeutral)), 0, 104));
            }
            return BarChartWidgetDelegate.Model.Companion.a(aVar3, "ALLOCATIONS_WIDGET_LIST_ID", textLocalisedClause3, null, null, null, textLocalisedClause4, null, arrayList2, null, false, null, null, 32512);
        }
        vxg.b bVar = cVar.f210497a;
        List totalValueAssets = content.f179809a;
        Intrinsics.checkNotNullParameter(totalValueAssets, "totalValueAssets");
        List<m> list = totalValueAssets;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        for (m mVar : list) {
            if (mVar instanceof wxg.a) {
                textLocalisedClause = new TextClause(((wxg.a) mVar).f300951c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (mVar instanceof wxg.d) {
                textLocalisedClause = new TextClause(((wxg.d) mVar).f300959a.f306286a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (mVar instanceof wxg.b) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_cash_balance_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
            } else if (mVar instanceof wxg.f) {
                textLocalisedClause = new TextClause(((wxg.f) mVar).f300967a.f306286a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (mVar instanceof wxg.g) {
                textLocalisedClause = new TextClause(((wxg.g) mVar).f300970a.f306286a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (mVar instanceof wxg.h) {
                textLocalisedClause = new TextClause(((wxg.h) mVar).f300975c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (mVar instanceof wxg.k) {
                textLocalisedClause = new TextLocalisedClause(ce9.m.p(((wxg.k) mVar).f300982a, bVar.b()), null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
            } else if (mVar instanceof wxg.l) {
                textLocalisedClause = new TextClause(((wxg.l) mVar).f300985a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (mVar instanceof wxg.e) {
                textLocalisedClause = new TextClause(((wxg.e) mVar).f300962a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (mVar instanceof wxg.c) {
                textLocalisedClause = new TextClause(((wxg.c) mVar).f300955a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (mVar instanceof wxg.j) {
                textLocalisedClause = new TextClause(((wxg.j) mVar).f300980b.f306286a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            } else {
                if (!(mVar instanceof wxg.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(ce9.m.o(((wxg.i) mVar).f300976a, bVar.b()), null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
            }
            arrayList3.add(new vxg.a(textLocalisedClause, bVar.a(mVar), mVar.getAllocation()));
        }
        ArrayList arrayListB = myg.c.b(arrayList3);
        if (((jte.d) aVar).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c)) {
            return BarChartWidgetDelegate.Model.Companion.b(BarChartWidgetDelegate.Model.INSTANCE, "ALLOCATIONS_WIDGET_LIST_ID", new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_title, null, null, 14), myg.c.a(arrayList3), null, myg.c.b(arrayList3), null, null, null, 992);
        }
        BarChartWidgetDelegate.Model.Companion aVar4 = BarChartWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_title, null, null, 14);
        CompositeClause compositeClause = new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_24_bar_chart, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_asset_allocation_footer_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        CompositeClause compositeClauseA = myg.c.a(arrayList3);
        ArrayList arrayListB2 = myg.c.b(arrayList3);
        boolean z = arrayListB.size() > 2;
        int size = arrayListB.size();
        return BarChartWidgetDelegate.Model.Companion.a(aVar4, "ALLOCATIONS_WIDGET_LIST_ID", textLocalisedClause5, null, null, compositeClause, compositeClauseA, null, arrayListB2, Float.valueOf(size != 1 ? (size == 2 || size == 3) ? 16.0f : 8.0f : 24.0f), z, null, null, 30720);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        a0 xVar;
        myg.k kVar = (myg.k) this.f205284b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        PnLValues pnLValues = (PnLValues) pair.f186385a;
        List list = (List) pair.f186386b;
        dj0.d dVar = pnLValues.f95096a;
        dj0.d dVar2 = pnLValues.f95097b;
        dj0.d dVar3 = pnLValues.f95098c;
        dj0.d dVar4 = pnLValues.d;
        c0 c0Var = null;
        if (!((jte.d) kVar.f210505a).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c)) {
            return new SimpleTileWidgetDelegate.Model("PNL_WIDGET_ID", myg.k.a(dVar, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_title, null, null, 14), null, new com.revolut.core.ui_kit.delegates.widgets.c4(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_realised, u.c(myg.k.a(dVar2, Integer.valueOf(R$attr.uikit_colorForeground))), null, 12), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_unrealised, u.c(myg.k.a(dVar3, Integer.valueOf(R$attr.uikit_colorForeground))), null, 12)), null, 104);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_title, null, null, 14);
        MoneyClause moneyClauseA = myg.k.a(dVar, null);
        c0 c0Var2 = new c0(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_realised_label, null, null, 14), myg.k.a(dVar2, null));
        c0 c0Var3 = new c0(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_unrealised_label, null, null, 14), myg.k.a(dVar3, null));
        if (dVar4 != null) {
            if (!dVar4.f(dj0.d.e)) {
                dVar4 = null;
            }
            if (dVar4 != null) {
                c0Var = new c0(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_income_label, null, null, 14), myg.k.a(dVar4, null));
            }
        }
        com.revolut.core.ui_kit.delegates.widgets.d0 d0Var = new com.revolut.core.ui_kit.delegates.widgets.d0(c0Var2, c0Var3, c0Var);
        ArrayList<fzg.d> arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (obj5 instanceof fzg.d) {
                arrayList.add(obj5);
            }
        }
        if (arrayList.isEmpty()) {
            xVar = y.f55555a;
        } else {
            w1 w1Var = y1.Companion;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (fzg.d dVar5 : arrayList) {
                z1 z1Var = a2.Companion;
                dj0.d dVar6 = dVar5.f139198a;
                float f = dVar6.f115082a;
                MoneyClause contentDescription = new MoneyClause(dVar6, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
                z1Var.getClass();
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                arrayList2.add(new a2(f, contentDescription));
            }
            xVar = new x(w1.a(w1Var, arrayList2, null, null, null, null, true, null, 222), l2.GREATER_VALUE_GREEN, f2.FIRST_OF_CURRENT_LINE, e2.PERFORMANCE);
        }
        return new ChartWithDetailsWidgetDelegate.Model("PNL_WIDGET_ID", textLocalisedClause, moneyClauseA, null, d0Var, xVar, op0.q.MEDIUM, null, 392);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        i3g.k kVar = (i3g.k) this.f205284b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        mzb.c cVar = (mzb.c) kVar.f158221b;
        Intrinsics.checkNotNullParameter(content, "content");
        int size = content.size();
        List list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            o oVar = (o) next;
            String str = oVar.f201424g;
            jj0 jj0Var = new jj0(a0.d.n("HEADER_ITEM_ID_PREFIX_", i), new TextClause(oVar.f201422b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(a0.d.i(i2, "/", size), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(oVar.f201423c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            int i3 = R$attr.uikit_dp0;
            yp0.b.p(jj0Var, i3, R$attr.uikit_dp16, i3, i3);
            String strN = a0.d.n("DESCRIPTION_ITEM_ID_PREFIX_", i);
            TextClause textClause = new TextClause(oVar.d.f84047a, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
            ck0 ck0Var = new ck0(yj0.START);
            int i5 = R$attr.uikit_dp0;
            TextDelegate.Model model = new TextDelegate.Model(strN, textClause, false, ck0Var, null, null, i5, R$attr.uikit_dp64, i5, i5, 116);
            Context context = cVar.f210746a.f22265a;
            int iZ = ((int) kli.a.z(context.getResources().getDisplayMetrics().widthPixels, context)) - 80;
            mzb.c cVar2 = cVar;
            Iterator it9 = it8;
            we0 we0Var = new we0(a0.d.n("MEDIA_ITEM_ID_PREFIX_", i), new qe0(-2, new UrlImage(oVar.e, (String) null, (UrlImageDrawable) new UrlImageDrawable.Shimmering.Transformable(new ImageTransformations(null, new RoundedRectTransformation(24.0f), null, null, null, null, null, ISO781611.SMT_TAG)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, Integer.valueOf((int) (((double) iZ) * 1.05d)), Integer.valueOf(iZ), false, false, (Clause) null, 475130)));
            String strN2 = a0.d.n("CONTENT_ITEM_ID_PREFIX_", i);
            List listK = v.k(jj0Var, model, we0Var);
            ti0 ti0Var = new ti0(str != null, str != null, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str != null ? "LEARN_CTA_LOADING_TAG" : null);
            String str2 = oVar.f;
            arrayList.add(new ui0(strN2, listK, ti0Var, str2 != null ? new mzb.a(str2) : null));
            cVar = cVar2;
            i = i2;
            it8 = it9;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r32, java.lang.Object r33, java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mgh.i.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        int i;
        Iterable iterableC;
        Iterator it8;
        Clause clauseB;
        TaxHubTransactionExportPeriodPickerScreenContract$DomainState taxHubTransactionExportPeriodPickerScreenContract$DomainState = (TaxHubTransactionExportPeriodPickerScreenContract$DomainState) this.f205284b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((n47.f) obj2, "<unused var>");
        n47.i iVar = taxHubTransactionExportPeriodPickerScreenContract$DomainState.f74403b;
        if (Intrinsics.f(iVar, n47.g.f212316a)) {
            return f0.f322471a;
        }
        if (Intrinsics.f(iVar, n47.h.f212317a)) {
            return t.a();
        }
        if (!(iVar instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e)) {
            throw new NoWhenBranchMatchedException();
        }
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e periodSelection = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e) iVar;
        aim.e eVarB = u.b();
        Intrinsics.checkNotNullParameter(periodSelection, "periodSelection");
        boolean z = periodSelection instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.a;
        if (z) {
            i = com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_period_all_time;
        } else if (periodSelection instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b) {
            i = com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_period_custom;
        } else if (periodSelection instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.c) {
            i = com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_period_month;
        } else {
            if (!(periodSelection instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d)) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_period_tax_year;
        }
        InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model("LIST_ID_INPUT_TEXT_PERIOD", new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_period, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelA);
        if (z) {
            iterableC = f0.f322471a;
        } else if (periodSelection instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b) {
            com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b periodSelection2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b) periodSelection;
            TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period period = periodSelection2.f74412a;
            Intrinsics.checkNotNullParameter(periodSelection2, "periodSelection");
            long jN = oc.c.N(period.f74404a);
            TimeClause.Format.DateLong dateLong = TimeClause.Format.DateLong.f57962b;
            InputTextDelegate.Model modelA2 = yp0.r.a(new InputTextDelegate.Model("LIST_ID_INPUT_TEXT_PERIOD_CUSTOM_FROM", new TimeClause(jN, dateLong, null, null, 12), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_from, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
            InputTextDelegate.Model modelA3 = yp0.r.a(new InputTextDelegate.Model("LIST_ID_INPUT_TEXT_PERIOD_CUSTOM_TO", new TimeClause(oc.c.N(period.f74405b), dateLong, null, null, 12), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_to, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            yp0.b.l(modelA3, 0, 0, 0, 0, null, false, 63);
            iterableC = v.k(modelA2, modelA3);
        } else if (periodSelection instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.c) {
            com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.c periodSelection3 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.c) periodSelection;
            Intrinsics.checkNotNullParameter(periodSelection3, "periodSelection");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_from, null, null, 14);
            List list = periodSelection3.f74413a;
            TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period period2 = periodSelection3.f74414b;
            List<TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period period3 : list2) {
                arrayList.add(new ue(new TimeClause(oc.c.N(period3.f74404a), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), period3.f74404a));
            }
            te teVar = new te(textLocalisedClause, arrayList, Integer.valueOf(r47.a.a(period2.f74404a, list)), 24);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_to, null, null, 14);
            List<TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period> list3 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period period4 : list3) {
                arrayList2.add(new ue(new TimeClause(oc.c.N(period4.f74405b), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), period4.f74405b));
            }
            re reVar = new re("LIST_ID_DOUBLE_PICKER", teVar, new te(textLocalisedClause2, arrayList2, Integer.valueOf(r47.a.a(period2.f74405b, list)), 24));
            yp0.b.l(reVar, 0, 0, 0, 0, null, false, 63);
            iterableC = u.c(reVar);
        } else {
            if (!(periodSelection instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d)) {
                throw new NoWhenBranchMatchedException();
            }
            com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d periodSelection4 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d) periodSelection;
            Intrinsics.checkNotNullParameter(periodSelection4, "periodSelection");
            ArrayList arrayList3 = new ArrayList();
            TaxPeriod taxPeriod = periodSelection4.f74417c;
            boolean z3 = taxPeriod.getFrom().compareTo((ChronoLocalDate) taxPeriod.getTo()) < 0;
            int iJ = 1;
            for (Iterator it9 = periodSelection4.f74415a.iterator(); it9.hasNext(); it9 = it8) {
                TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period period5 = (TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period) it9.next();
                LocalDate localDate = period5.f74404a;
                LocalDate localDate2 = period5.f74405b;
                if (localDate.getYear() != localDate2.getYear()) {
                    it8 = it9;
                    clauseB = r47.a.b(period5, new TimeClause.Format.Year(0));
                } else if (z3) {
                    clauseB = new TimeClause(oc.c.N(localDate), new TimeClause.Format.Year(0), null, null, 12);
                    it8 = it9;
                } else {
                    it8 = it9;
                    if (localDate2.compareTo((ChronoLocalDate) taxPeriod.getTo().withYear(localDate2.getYear())) <= 0) {
                        LocalDate localDateWithYear = taxPeriod.getFrom().withYear(localDate.minusYears(1L).getYear());
                        Intrinsics.checkNotNullExpressionValue(localDateWithYear, "withYear(...)");
                        clauseB = r47.a.b(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period.a(period5, localDateWithYear, null, 2), new TimeClause.Format.Year(0));
                    } else {
                        LocalDate localDateWithYear2 = taxPeriod.getTo().withYear(localDate2.plusYears(1L).getYear());
                        Intrinsics.checkNotNullExpressionValue(localDateWithYear2, "withYear(...)");
                        clauseB = r47.a.b(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period.a(period5, null, localDateWithYear2, 1), new TimeClause.Format.Year(0));
                    }
                }
                arrayList3.add(new c10(clauseB, period5));
                if (periodSelection4.f74416b.equals(period5) || iJ == -1) {
                    iJ = v.j(arrayList3);
                }
            }
            a10 a10Var = new a10("LIST_ID_SINGLE_PICKER", arrayList3, iJ);
            yp0.b.l(a10Var, 0, 0, 0, 0, null, false, 63);
            iterableC = u.c(a10Var);
        }
        zhm.a0.x(iterableC, eVarB);
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0025 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mgh.i.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        nci.k kVar = (nci.k) this.f205284b;
        nci.j content = (nci.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(content instanceof nci.h)) {
            if (content instanceof nci.i) {
                return new p((List) f0.f322471a, s.a(kVar), ((nci.i) content).f214203a, true);
            }
            throw new NoWhenBranchMatchedException();
        }
        kj kjVar = new kj("HTML_ITEM_ID", new lj(((nci.h) content).f214202a, "utf-8"), null, Constants.TAG_FC_SPEED_MODE);
        int i = R$attr.uikit_dp16;
        yp0.b.l(kjVar, 0, 0, i, i, null, false, 51);
        return new p(u.c(kjVar), s.a(kVar), kVar.f214206c, 4);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        ni1.l lVar = (ni1.l) this.f205284b;
        sh1.l lVar2 = lVar.f215634a;
        List searchResult = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(searchResult, "searchResult");
        if (searchResult.isEmpty()) {
            return u.c(new k10("NO_RESULTS_ITEM_ID", lVar.f215635b, new i10(lVar2.f263377b.d)));
        }
        RowDelegate.Model model = new RowDelegate.Model("NOT_LISTED_ID", null, lVar2.f263377b.e, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : searchResult) {
            if (((Address) obj5).getFullAddress() != null) {
                arrayList.add(obj5);
            }
        }
        List<Address> listP0 = zhm.d0.P0(arrayList, new ni1.k());
        ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
        for (Address address : listP0) {
            String fullAddress = address.getFullAddress();
            Intrinsics.h(fullAddress);
            String fullAddress2 = address.getFullAddress();
            Intrinsics.h(fullAddress2);
            arrayList2.add(new RowDelegate.Model(fullAddress, null, new TextClause(fullAddress2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
        }
        return ue0.e.J(model, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a0  */
    /* JADX WARN: Type inference failed for: r2v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mgh.i.n(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        boolean z;
        List listC;
        nj9.d dVar;
        Object model;
        Object model2;
        CellDetailsActionDelegate.Model model3;
        nj9.h hVar = (nj9.h) this.f205284b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        zh9.n nVar = (zh9.n) pair.f186385a;
        o1 o1Var = (o1) pair.f186386b;
        m1 m1Var = hVar.f216420c;
        if (m1Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aim.e eVarB = u.b();
        boolean z3 = m1Var instanceof k1;
        if (z3) {
            z = ((k1) m1Var).f322298c.f322314c;
        } else {
            if (!(m1Var instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_subtitle_has_upfront_payment, null, custom, 10) : new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_subtitle_no_upfront_payment, null, custom, 10);
        aim.e eVarB2 = u.b();
        eVarB2.add(new PlainTextDelegate.Model("id_header", (UrlImage) null, new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_title, null, null, 14), textLocalisedClause, (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp24, R$attr.uikit_dp0, 0, 0, 26602));
        eVarB.addAll(u.a(eVarB2));
        ArrayList<m1> arrayList = o1Var.f322315a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (m1 m1Var2 : arrayList) {
            Intrinsics.checkNotNullParameter(m1Var2, "<this>");
            arrayList2.add(new FixedTabs.Item(String.valueOf(m1Var2.a()), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_segmented_control_option, u.c(Integer.valueOf(m1Var2.a())), null, 12), (AnalyticsContext) null, 12));
        }
        eVarB.add(new FixedTabsDelegate.Model("options", arrayList2, String.valueOf(m1Var.a()), null, null, 0, R$attr.uikit_dp8, 0, 0, 440));
        if (z3) {
            k1 k1Var = (k1) m1Var;
            for (q1 q1Var : nVar.e) {
                if (q1Var.f322323a == k1Var.f322296a) {
                    aim.e eVarB3 = u.b();
                    n1 n1Var = k1Var.f322298c;
                    dj0.d dVar2 = n1Var.f322312a;
                    t1 t1Var = k1Var.f322297b;
                    if (t1Var == t1.MaxPurchaseLessThanMin) {
                        int i = R$attr.uikit_colorOrange;
                        Custom custom2 = new Custom(Integer.valueOf(i), false, null, false, null, 254);
                        model = new CellDetailsActionDelegate.Model("amount", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_purchase_amount_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_purchase_amount_description_warning, u.c(sx4.f.b(1, custom2, null, dVar2)), custom2, 8), false, false, null, new nj9.p(k1Var), 0, 0, 32224);
                    } else {
                        model = new CellDetailsDelegate.Model("amount_cell", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_purchase_amount_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_purchase_amount_description, v.k(sx4.f.b(3, null, null, dVar2), sx4.f.b(3, null, null, n1Var.f322313b)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                    }
                    eVarB3.add(model);
                    boolean zA = nVar.a(q1Var);
                    wi0.b bVar = nVar.d;
                    if (zA) {
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_account_details_fee, null, null, 14);
                        BigDecimal ZERO = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        PercentageClause percentageClauseA = ky4.d.a(ZERO, bVar, null);
                        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
                        b1 b1Var = nVar.f322309a;
                        if (b1Var == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        model2 = new CellDetailsActionDelegate.Model("fee", textLocalisedClause2, 0, resourceImage, percentageClauseA, false, true, null, new nj9.q(new vj9.a(b1Var, new Pair(cp5.d.r(q1Var), bVar))), 0, 0, 32160);
                    } else {
                        model2 = new CellDetailsDelegate.Model("fee_cell", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_account_details_fee, null, null, 14), ky4.d.a(q1Var.f322324b, bVar, null), 0, null, null, null, null, null, false, 0, 0, 32760);
                    }
                    eVarB3.add(model2);
                    if (t1Var == null) {
                        model3 = new CellDetailsActionDelegate.Model("monthly_instalments", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_monthly_instalment_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pie_chart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_monthly_instalment_description, null, null, 14), false, false, null, nj9.o.f216431a, 0, 0, 32224);
                    } else {
                        int i2 = R$attr.uikit_colorAccent_30;
                        model3 = new CellDetailsActionDelegate.Model("monthly_instalments", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_monthly_instalment_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pie_chart, (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_monthly_instalment_description, null, new Custom(Integer.valueOf(i2), false, null, false, null, 254), 10), false, false, null, null, 0, 0, 32672);
                    }
                    eVarB3.add(model3);
                    listC = u.a(eVarB3);
                    yp0.b.k(listC, 0, R$attr.uikit_dp0, 0, 0, 29);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (!(m1Var instanceof l1)) {
            throw new NoWhenBranchMatchedException();
        }
        listC = u.c(new FullScreenStateDelegate.Model("option_not_available", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_option_not_available, u.c(Integer.valueOf(((l1) m1Var).f322301a)), null, 12), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D212", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, R$attr.uikit_dp16, 28644));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        aim.e eVarA = u.a(eVarB);
        if (z3) {
            k1 k1Var2 = (k1) m1Var;
            dVar = new nj9.d(new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_activate_button_title, u.c(Integer.valueOf(k1Var2.f322296a)), null, 12), k1Var2.f322297b == null);
        } else {
            if (!(m1Var instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new nj9.d(new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_term_selector_discover_button_title, u.c(Integer.valueOf(((l1) m1Var).f322301a)), null, 12), true);
        }
        return new nj9.j(eVarA, dVar);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        Clause clauseM;
        nle.f fVar = (nle.f) this.f205284b;
        wel.d content = (wel.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        fVar.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_settings_buy_block_title, null, null, 14);
        if (Intrinsics.f(content, wel.a.f296815a) || Intrinsics.f(content, wel.b.f296816a)) {
            clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_settings_buy_block_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.tab.invest.impl.R$string.trading_settings_buy_block_learnMore, null, new Click(30, (Integer) null, (Object) null, "INVEST_BUY_BLOCK_LEARN_MORE_ID", false), 10)));
        } else {
            if (!(content instanceof wel.c)) {
                throw new NoWhenBranchMatchedException();
            }
            clauseM = new TextLocalisedClause(com.revolut.feature.tab.invest.impl.R$string.trading_settings_buy_block_subtitle_pending, null, null, 14);
        }
        boolean z = false;
        return new RowDelegate.Model("INVEST_BUY_BLOCK_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), textLocalisedClause, null, 0, clauseM, null, null, 0, new vf(content instanceof wel.a, true), false, null, false, null, null, null, null, null, null, new nle.c(content), null, 0, 0, 0, 0, 532673496);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        List listN;
        nm6.e eVar = (nm6.e) this.f205284b;
        IndiaNetBankingInstitutions institutionData = (IndiaNetBankingInstitutions) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(institutionData, "institutionData");
        String str = eVar.f217184b;
        if (str.length() == 0) {
            ArrayList arrayList = institutionData.f72367a;
            ArrayList arrayList2 = institutionData.f72368b;
            aim.e eVarB = u.b();
            if (!arrayList.isEmpty()) {
                eVarB.addAll(nm6.k.d(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_net_banking_selection_popular, "LIST_ID_POPULAR_APP_SUBHEADER", arrayList));
            }
            if (!arrayList2.isEmpty()) {
                eVarB.addAll(nm6.k.d(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_net_banking_selection_all_banks, "LIST_ID_OTHER_APP_SUBHEADER", arrayList2));
            }
            listN = c6d.b.N(u.a(eVarB));
        } else {
            ArrayList arrayListA = nm6.k.a(str, institutionData.f72367a);
            ArrayList arrayList3 = new ArrayList(w.t(arrayListA, 10));
            Iterator it8 = arrayListA.iterator();
            while (it8.hasNext()) {
                arrayList3.add(nm6.k.b((IndiaNetBankingProvider) it8.next()));
            }
            ArrayList arrayListA2 = nm6.k.a(str, institutionData.f72368b);
            ArrayList arrayList4 = new ArrayList(w.t(arrayListA2, 10));
            Iterator it9 = arrayListA2.iterator();
            while (it9.hasNext()) {
                arrayList4.add(nm6.k.b((IndiaNetBankingProvider) it9.next()));
            }
            aim.e eVarB2 = u.b();
            eVarB2.addAll(arrayList3);
            eVarB2.addAll(arrayList4);
            aim.e eVarA = u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            listN = c6d.b.N(eVarA);
        }
        if (listN != null) {
            return listN;
        }
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_EMPTY_SEARCH", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_net_banking_selection_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_net_banking_selection_no_results_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_binoculars, null, null, 6)), null, zj.REGULAR, false, null, null, null, 1856);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        List listK;
        TextLocalisedClause textLocalisedClause;
        int i;
        int i2;
        int i3;
        nm9.g gVar = (nm9.g) this.f205284b;
        nm9.f content = (nm9.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        PayeesFlowType payeesFlowType = gVar.f217221a;
        boolean z = payeesFlowType instanceof PayeesFlowType.Blocked;
        if (z) {
            listK = v.k(nm9.n.b(0, com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_blocked_info_list_send_messages, R$drawable.uikit_icn_24_chat), nm9.n.b(1, com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_blocked_info_list_request_or_send_money, R$drawable.uikit_icn_24_transfers), nm9.n.b(2, com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_blocked_info_list_add_to_groups, R$drawable.uikit_icn_24_people));
        } else {
            if (!(payeesFlowType instanceof PayeesFlowType.RequireAuthentication)) {
                throw new NoWhenBranchMatchedException();
            }
            listK = v.k(nm9.n.b(0, com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_requires_authentication_info_list_verification, R$drawable.uikit_icn_24_face_id), nm9.n.b(1, com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_requires_authentication_info_list_no_action_required, R$drawable.uikit_icn_24_map_marker_hide));
        }
        List list = listK;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        boolean z3 = content instanceof nm9.e;
        if (z3) {
            if (z) {
                i3 = com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_sheet_block_title;
            } else {
                if (!(payeesFlowType instanceof PayeesFlowType.RequireAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_sheet_require_authentication_title;
            }
            textLocalisedClause = new TextLocalisedClause(i3, u.c(((nm9.e) content).f217219b), null, 12);
        } else {
            if (!(content instanceof nm9.d)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                i = com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_sheet_block_multiple_title;
            } else {
                if (!(payeesFlowType instanceof PayeesFlowType.RequireAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_sheet_require_authentication_multiple_title;
            }
            textLocalisedClause = new TextLocalisedClause(i, u.c(Integer.valueOf(((nm9.d) content).f217217a.size())), null, 12);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        if (z) {
            i2 = com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_sheet_block_subtitle;
        } else {
            if (!(payeesFlowType instanceof PayeesFlowType.RequireAuthentication)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z3) {
                i2 = com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_sheet_require_authentication_subtitle;
            } else {
                if (!(content instanceof nm9.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_sheet_require_authentication_multiple_subtitle;
            }
        }
        return new nm9.k(list, new lw0.a(textLocalisedClause2, new TextLocalisedClause(i2, null, null, 14), null, null, false, 28), true, nm9.n.a(gVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mgh.i.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    private final Object t(Object obj2, Object obj3, Object obj4) {
        nnf.n nVar = (nnf.n) this.f205284b;
        x5 transactionRecallable = (x5) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionRecallable, "transactionRecallable");
        return new RowDelegate.Model("LIST_ID_WAITING_FOR_REFUND", null, new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_pending_info_refund_title, null, null, 14), null, 0, (transactionRecallable.f273160a && ((Boolean) nVar.f217630c.getValue()).booleanValue()) ? new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_pending_info_refund_description_revert, u.c(new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_pending_info_refund_description_revert_link, null, new Click(30, (Integer) null, (Object) null, "LIST_ID_REVERT_PAYMENT", false), 10)), null, 12) : new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_pending_info_refund_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        List listK;
        nnj.k kVar = (nnj.k) this.f205284b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((vf0.h) obj2, "<unused var>");
        nnj.j jVar = kVar.f217693b;
        int i = 4;
        int i2 = 0;
        if (jVar instanceof nnj.h) {
            e3 e3Var = ((nnj.h) jVar).f217690a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_refund_reason_cannot_install, null, null, 14);
            e3 e3Var2 = e3.NOT_ABLE_TO_INSTALL_ESIM;
            boolean z = e3Var == e3Var2;
            iq iqVar = iq.RADIO_BUTTON;
            InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("ID_LIST_NOT_ABLE_TO_INSTALL_ESIM", textLocalisedClause, z, false, null, iqVar, null, null, e3Var2, null, 0, 0, 0, 523992);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_refund_reason_does_not_work, null, null, 14);
            e3 e3Var3 = e3.ESIM_INSTALLED_BUT_NOT_WORKING;
            InputChecklistDelegate.Model model2 = new InputChecklistDelegate.Model("ID_LIST_ESIM_INSTALLED_BUT_NOT_WORKING", textLocalisedClause2, e3Var == e3Var3, false, null, iqVar, null, null, e3Var3, null, 0, 0, 0, 523992);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_refund_reason_device_locked, null, null, 14);
            e3 e3Var4 = e3.DEVICE_IS_CARRIER_BLOCKED;
            InputChecklistDelegate.Model model3 = new InputChecklistDelegate.Model("ID_LIST_DEVICE_IS_CARRIER_BLOCKED", textLocalisedClause3, e3Var == e3Var4, false, null, iqVar, null, null, e3Var4, null, 0, 0, 0, 523992);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_refund_reason_accidental_purchase, null, null, 14);
            e3 e3Var5 = e3.ACCIDENTAL_PURCHASE;
            InputChecklistDelegate.Model model4 = new InputChecklistDelegate.Model("ID_LIST_ACCIDENTAL_PURCHASE", textLocalisedClause4, e3Var == e3Var5, false, null, iqVar, null, null, e3Var5, null, 0, 0, 0, 523992);
            TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            e3 e3Var6 = e3.OTHER;
            listK = v.k(model, model2, model3, model4, new InputChecklistDelegate.Model("ID_REASON_ITEM_OTHER", textClause, e3Var == e3Var6, false, new InputChecklistDelegate.a.C0408a(i, i2, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_refund_reason_other, null, null, 14), e3Var == e3Var6), iqVar, null, null, e3Var6, null, 0, 0, 0, 523976));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
        } else {
            if (!(jVar instanceof nnj.i)) {
                throw new NoWhenBranchMatchedException();
            }
            p0 p0Var = ((nnj.i) jVar).f217691a;
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_cancellation_reason_cannot_install, null, null, 14);
            p0 p0Var2 = p0.NOT_ABLE_TO_INSTALL_ESIM;
            boolean z3 = p0Var == p0Var2;
            iq iqVar2 = iq.RADIO_BUTTON;
            InputChecklistDelegate.Model model5 = new InputChecklistDelegate.Model("ID_LIST_NOT_ABLE_TO_INSTALL_ESIM", textLocalisedClause5, z3, false, null, iqVar2, null, null, p0Var2, null, 0, 0, 0, 523992);
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_cancellation_reason_does_not_work, null, null, 14);
            p0 p0Var3 = p0.ESIM_INSTALLED_BUT_NOT_WORKING;
            InputChecklistDelegate.Model model6 = new InputChecklistDelegate.Model("ID_LIST_ESIM_INSTALLED_BUT_NOT_WORKING", textLocalisedClause6, p0Var == p0Var3, false, null, iqVar2, null, null, p0Var3, null, 0, 0, 0, 523992);
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_cancellation_reason_can_not_transfer_number, null, null, 14);
            p0 p0Var4 = p0.CAN_NOT_TRANSFER_MY_NUMBER;
            InputChecklistDelegate.Model model7 = new InputChecklistDelegate.Model("ID_LIST_CAN_NOT_TRANSFER_NUMBER", textLocalisedClause7, p0Var == p0Var4, false, null, iqVar2, null, null, p0Var4, null, 0, 0, 0, 523992);
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_cancellation_reason_poor_quality, null, null, 14);
            p0 p0Var5 = p0.POOR_NETWORK_QUALITY;
            InputChecklistDelegate.Model model8 = new InputChecklistDelegate.Model("ID_LIST_POOR_NETWORK_QUALITY", textLocalisedClause8, p0Var == p0Var5, false, null, iqVar2, null, null, p0Var5, null, 0, 0, 0, 523992);
            TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_cancellation_reason_too_expensive, null, null, 14);
            p0 p0Var6 = p0.TOO_EXPENSIVE;
            InputChecklistDelegate.Model model9 = new InputChecklistDelegate.Model("ID_LIST_TOO_EXPENSIVE", textLocalisedClause9, p0Var == p0Var6, false, null, iqVar2, null, null, p0Var6, null, 0, 0, 0, 523992);
            TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            p0 p0Var7 = p0.OTHER;
            listK = v.k(model5, model6, model7, model8, model9, new InputChecklistDelegate.Model("ID_REASON_ITEM_OTHER", textClause2, p0Var == p0Var7, false, new InputChecklistDelegate.a.C0408a(4, i2, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_cancellation_reason_other, null, null, 14), p0Var == p0Var7), iqVar2, null, null, p0Var7, null, 0, 0, 0, 523976));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
        }
        nnj.j jVar2 = kVar.f217693b;
        String str = kVar.f217694c;
        return new nnj.p(listK, ((jVar2 instanceof nnj.i) && ((nnj.i) jVar2).f217691a == p0.OTHER && (str == null || d0.W(str))) ? nnj.o.VISIBLE_DISABLED : nnj.o.VISIBLE_ENABLED);
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        i3g.k kVar = (i3g.k) this.f205284b;
        nob.f content = (nob.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_sheets_automations_title, null, null, 14), null, null, null, false, 30);
        List listA = ((nob.a) kVar.f158221b).a(content.f217965b, content.f217964a);
        yp0.b.k(listA, 0, 0, 0, 0, 31);
        return new nob.h(listA, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x07a9  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v8, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage, java.util.List] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r96, java.lang.Object r97, java.lang.Object r98) {
        /*
            Method dump skipped, instruction units count: 3582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mgh.i.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f205283a = i;
        this.f205284b = obj2;
    }

    public /* synthetic */ i(Object obj2, n nVar, int i) {
        this.f205283a = i;
        this.f205284b = obj2;
    }
}
