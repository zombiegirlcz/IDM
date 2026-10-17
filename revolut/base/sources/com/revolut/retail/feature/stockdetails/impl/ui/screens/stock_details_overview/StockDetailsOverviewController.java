package com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import avk.h;
import avk.j;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.EmptyStateTextDelegate;
import com.revolut.core.ui_kit.delegates.EpsChartDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GroupedBarLineChartDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalHistogramTileDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalHistogramTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalLegendDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LogosTileDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import i7d.i;
import java.util.List;
import jpc.e;
import jul.o;
import kbb.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m5e.d;
import mwk.b;
import mwk.f;
import mwk.g;
import prk.e0;
import prk.f0;
import prk.g0;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/stock_details_overview/StockDetailsOverviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmwk/j;", "Li7d/i;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockDetailsOverviewController extends ViewController<q> implements a, i {
    public static final /* synthetic */ KProperty[] P0 = {o0.f186429a.j(new h0(StockDetailsOverviewController.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/FragmentAssetDetailsBinding;", 0))};
    public final fvk.i A0;
    public final j B0;
    public final g C0;
    public final e D0;
    public final mwk.e E0;
    public final f F0;
    public final h G0;
    public final c H0;
    public final b I0;
    public final avk.b J0;
    public final StockDetailsOverviewControllerContract$InputData K;
    public final o K0;
    public final ao.h L;
    public final jx0.a L0;
    public final Object M;
    public final d M0;
    public final Object N;
    public final fvk.d N0;
    public final Object O;
    public final k7i.i O0;
    public final AppTipDelegate P;
    public final AirTipDelegate Q;
    public final ProgressStepVerticalDelegate R;
    public final ListSubheaderDelegate S;
    public final ListSubheaderLoadingDelegate T;
    public final ReferralContactDelegate U;
    public final RowDelegate V;
    public final RowLoadingDelegate W;
    public final LargeActionButtonDelegate X;
    public final CalendarRowDelegate Y;
    public final CellDetailsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f104047a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final SmallActionButtonDelegate f104048b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ToDoItemDelegate f104049d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final FullScreenStateDelegate f104050e0;
    public final CandleStickGraphDelegate f0;
    public final FixedTabsDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final TabsDelegate f104051h0;
    public final HeaderDelegate i0;
    public final PlainTextWarningDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final BannerDelegate f104052k0;
    public final ListCellDelegate l0;
    public final PlainTextDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final LogosTileDelegate f104053n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final HorizontalHistogramTileDelegate f104054o0;
    public final ScrollerDelegate p0;
    public final SuggestionsBarDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TrendViewDelegate f104055r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final EpsChartDelegate f104056s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final HorizontalLegendDelegate f104057t0;
    public final GroupedBarLineChartDelegate u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final SwipeToActionDelegate f104058v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f104059w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f104060x0;
    public final mwk.d y0;
    public final kgm.c z0;

    public StockDetailsOverviewController(StockDetailsOverviewControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, mwk.c.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mwk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsOverviewController f209489b;

            {
                this.f209489b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockDetailsOverviewController stockDetailsOverviewController = this.f209489b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StockDetailsOverviewController.P0;
                        StockDetailsOverviewController stockDetailsOverviewController2 = this.f209489b;
                        qji.b bVarU2 = stockDetailsOverviewController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.di.StockDetailsOverviewControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockDetailsOverviewControllerContract$InputData stockDetailsOverviewControllerContract$InputData = stockDetailsOverviewController2.K;
                        d dVar = stockDetailsOverviewController2.y0;
                        kgm.c cVar = stockDetailsOverviewController2.z0;
                        atk.e eVar = new atk.e(stockDetailsOverviewControllerContract$InputData.f104061a);
                        fvk.i iVar = stockDetailsOverviewController2.A0;
                        String str = stockDetailsOverviewControllerContract$InputData.f104061a;
                        boolean z = stockDetailsOverviewControllerContract$InputData.f104062b;
                        h3h.e eVar2 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(stockDetailsOverviewController2.i0, stockDetailsOverviewController2.S, stockDetailsOverviewController2.T, stockDetailsOverviewController2.V, stockDetailsOverviewController2.W);
                        e eVar3 = stockDetailsOverviewController2.E0;
                        f fVar = stockDetailsOverviewController2.F0;
                        avk.j jVar = stockDetailsOverviewController2.B0;
                        zsk.b bVar = new zsk.b(str);
                        ListSubheaderDelegate listSubheaderDelegate = stockDetailsOverviewController2.S;
                        ctk.g gVar = new ctk.g(listSubheaderDelegate, new ctk.f(stockDetailsOverviewController2.U));
                        ctk.h hVar = new ctk.h(str);
                        jpc.e eVar4 = stockDetailsOverviewController2.D0;
                        osk.e eVar5 = new osk.e(str);
                        ftk.e eVar6 = new ftk.e(str, z);
                        g gVar2 = stockDetailsOverviewController2.C0;
                        avk.h hVar2 = stockDetailsOverviewController2.G0;
                        jtk.c cVar3 = new jtk.c(stockDetailsOverviewController2.j0, stockDetailsOverviewController2.f104052k0, stockDetailsOverviewController2.p0);
                        jtk.d dVar2 = new jtk.d(str);
                        kbb.c cVar4 = stockDetailsOverviewController2.H0;
                        b bVar2 = stockDetailsOverviewController2.I0;
                        avk.b bVar3 = stockDetailsOverviewController2.J0;
                        m5e.d dVar3 = stockDetailsOverviewController2.M0;
                        dtk.d dVar4 = new dtk.d(stockDetailsOverviewController2.Z, listSubheaderDelegate);
                        jul.o oVar = stockDetailsOverviewController2.K0;
                        tsk.e eVar7 = new tsk.e(str);
                        jx0.a aVar = stockDetailsOverviewController2.L0;
                        fvk.d dVar5 = stockDetailsOverviewController2.N0;
                        xsk.d dVar6 = new xsk.d(str);
                        k7i.i iVar2 = stockDetailsOverviewController2.O0;
                        dVar.getClass();
                        cVar.getClass();
                        iVar.getClass();
                        eVar3.getClass();
                        fVar.getClass();
                        jVar.getClass();
                        eVar4.getClass();
                        gVar2.getClass();
                        hVar2.getClass();
                        cVar4.getClass();
                        bVar2.getClass();
                        bVar3.getClass();
                        dVar3.getClass();
                        oVar.getClass();
                        aVar.getClass();
                        dVar5.getClass();
                        iVar2.getClass();
                        return new f0(g0Var, e0Var2, new rdf.a(), new f3h.b(), new f3h.a(), stockDetailsOverviewController2, stockDetailsOverviewControllerContract$InputData, dVar, cVar, eVar, iVar, eVar2, cVar2, eVar3, fVar, jVar, bVar, gVar, hVar, eVar4, eVar5, eVar6, gVar2, hVar2, stockDetailsOverviewController2, cVar3, dVar2, cVar4, bVar2, bVar3, dVar3, dVar4, oVar, eVar7, aVar, dVar5, dVar6, iVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = StockDetailsOverviewController.P0;
                        return (h) ((f0) ((nwk.a) stockDetailsOverviewController.M.getValue())).N0.get();
                    case 2:
                        KProperty[] kPropertyArr3 = StockDetailsOverviewController.P0;
                        return (j60.a) ((f0) ((nwk.a) stockDetailsOverviewController.M.getValue())).f239111d0.get();
                    default:
                        KProperty[] kPropertyArr4 = StockDetailsOverviewController.P0;
                        StockDetailsOverviewController stockDetailsOverviewController3 = this.f209489b;
                        return dli.f.a(stockDetailsOverviewController3, (h) stockDetailsOverviewController3.N.getValue(), v.k(stockDetailsOverviewController3.P, stockDetailsOverviewController3.Q, stockDetailsOverviewController3.f0, new EmptyStateTextDelegate(), stockDetailsOverviewController3.g0, stockDetailsOverviewController3.f104051h0, stockDetailsOverviewController3.i0, new HeaderLoadingDelegate(), stockDetailsOverviewController3.X, stockDetailsOverviewController3.l0, stockDetailsOverviewController3.S, stockDetailsOverviewController3.T, stockDetailsOverviewController3.m0, stockDetailsOverviewController3.j0, stockDetailsOverviewController3.f104052k0, stockDetailsOverviewController3.V, stockDetailsOverviewController3.W, stockDetailsOverviewController3.p0, new ScrollerBoxDelegate(u.c(stockDetailsOverviewController3.U)), stockDetailsOverviewController3.f104048b0, stockDetailsOverviewController3.q0, stockDetailsOverviewController3.c0, stockDetailsOverviewController3.f104055r0, stockDetailsOverviewController3.f104049d0, stockDetailsOverviewController3.Y, stockDetailsOverviewController3.Z, stockDetailsOverviewController3.f104056s0, stockDetailsOverviewController3.f104057t0, stockDetailsOverviewController3.u0, stockDetailsOverviewController3.f104050e0, stockDetailsOverviewController3.f104058v0), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mwk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsOverviewController f209489b;

            {
                this.f209489b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockDetailsOverviewController stockDetailsOverviewController = this.f209489b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockDetailsOverviewController.P0;
                        StockDetailsOverviewController stockDetailsOverviewController2 = this.f209489b;
                        qji.b bVarU2 = stockDetailsOverviewController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.di.StockDetailsOverviewControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockDetailsOverviewControllerContract$InputData stockDetailsOverviewControllerContract$InputData = stockDetailsOverviewController2.K;
                        d dVar = stockDetailsOverviewController2.y0;
                        kgm.c cVar = stockDetailsOverviewController2.z0;
                        atk.e eVar = new atk.e(stockDetailsOverviewControllerContract$InputData.f104061a);
                        fvk.i iVar = stockDetailsOverviewController2.A0;
                        String str = stockDetailsOverviewControllerContract$InputData.f104061a;
                        boolean z = stockDetailsOverviewControllerContract$InputData.f104062b;
                        h3h.e eVar2 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(stockDetailsOverviewController2.i0, stockDetailsOverviewController2.S, stockDetailsOverviewController2.T, stockDetailsOverviewController2.V, stockDetailsOverviewController2.W);
                        e eVar3 = stockDetailsOverviewController2.E0;
                        f fVar = stockDetailsOverviewController2.F0;
                        avk.j jVar = stockDetailsOverviewController2.B0;
                        zsk.b bVar = new zsk.b(str);
                        ListSubheaderDelegate listSubheaderDelegate = stockDetailsOverviewController2.S;
                        ctk.g gVar = new ctk.g(listSubheaderDelegate, new ctk.f(stockDetailsOverviewController2.U));
                        ctk.h hVar = new ctk.h(str);
                        jpc.e eVar4 = stockDetailsOverviewController2.D0;
                        osk.e eVar5 = new osk.e(str);
                        ftk.e eVar6 = new ftk.e(str, z);
                        g gVar2 = stockDetailsOverviewController2.C0;
                        avk.h hVar2 = stockDetailsOverviewController2.G0;
                        jtk.c cVar3 = new jtk.c(stockDetailsOverviewController2.j0, stockDetailsOverviewController2.f104052k0, stockDetailsOverviewController2.p0);
                        jtk.d dVar2 = new jtk.d(str);
                        kbb.c cVar4 = stockDetailsOverviewController2.H0;
                        b bVar2 = stockDetailsOverviewController2.I0;
                        avk.b bVar3 = stockDetailsOverviewController2.J0;
                        m5e.d dVar3 = stockDetailsOverviewController2.M0;
                        dtk.d dVar4 = new dtk.d(stockDetailsOverviewController2.Z, listSubheaderDelegate);
                        jul.o oVar = stockDetailsOverviewController2.K0;
                        tsk.e eVar7 = new tsk.e(str);
                        jx0.a aVar = stockDetailsOverviewController2.L0;
                        fvk.d dVar5 = stockDetailsOverviewController2.N0;
                        xsk.d dVar6 = new xsk.d(str);
                        k7i.i iVar2 = stockDetailsOverviewController2.O0;
                        dVar.getClass();
                        cVar.getClass();
                        iVar.getClass();
                        eVar3.getClass();
                        fVar.getClass();
                        jVar.getClass();
                        eVar4.getClass();
                        gVar2.getClass();
                        hVar2.getClass();
                        cVar4.getClass();
                        bVar2.getClass();
                        bVar3.getClass();
                        dVar3.getClass();
                        oVar.getClass();
                        aVar.getClass();
                        dVar5.getClass();
                        iVar2.getClass();
                        return new f0(g0Var, e0Var2, new rdf.a(), new f3h.b(), new f3h.a(), stockDetailsOverviewController2, stockDetailsOverviewControllerContract$InputData, dVar, cVar, eVar, iVar, eVar2, cVar2, eVar3, fVar, jVar, bVar, gVar, hVar, eVar4, eVar5, eVar6, gVar2, hVar2, stockDetailsOverviewController2, cVar3, dVar2, cVar4, bVar2, bVar3, dVar3, dVar4, oVar, eVar7, aVar, dVar5, dVar6, iVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = StockDetailsOverviewController.P0;
                        return (h) ((f0) ((nwk.a) stockDetailsOverviewController.M.getValue())).N0.get();
                    case 2:
                        KProperty[] kPropertyArr3 = StockDetailsOverviewController.P0;
                        return (j60.a) ((f0) ((nwk.a) stockDetailsOverviewController.M.getValue())).f239111d0.get();
                    default:
                        KProperty[] kPropertyArr4 = StockDetailsOverviewController.P0;
                        StockDetailsOverviewController stockDetailsOverviewController3 = this.f209489b;
                        return dli.f.a(stockDetailsOverviewController3, (h) stockDetailsOverviewController3.N.getValue(), v.k(stockDetailsOverviewController3.P, stockDetailsOverviewController3.Q, stockDetailsOverviewController3.f0, new EmptyStateTextDelegate(), stockDetailsOverviewController3.g0, stockDetailsOverviewController3.f104051h0, stockDetailsOverviewController3.i0, new HeaderLoadingDelegate(), stockDetailsOverviewController3.X, stockDetailsOverviewController3.l0, stockDetailsOverviewController3.S, stockDetailsOverviewController3.T, stockDetailsOverviewController3.m0, stockDetailsOverviewController3.j0, stockDetailsOverviewController3.f104052k0, stockDetailsOverviewController3.V, stockDetailsOverviewController3.W, stockDetailsOverviewController3.p0, new ScrollerBoxDelegate(u.c(stockDetailsOverviewController3.U)), stockDetailsOverviewController3.f104048b0, stockDetailsOverviewController3.q0, stockDetailsOverviewController3.c0, stockDetailsOverviewController3.f104055r0, stockDetailsOverviewController3.f104049d0, stockDetailsOverviewController3.Y, stockDetailsOverviewController3.Z, stockDetailsOverviewController3.f104056s0, stockDetailsOverviewController3.f104057t0, stockDetailsOverviewController3.u0, stockDetailsOverviewController3.f104050e0, stockDetailsOverviewController3.f104058v0), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: mwk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsOverviewController f209489b;

            {
                this.f209489b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StockDetailsOverviewController stockDetailsOverviewController = this.f209489b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockDetailsOverviewController.P0;
                        StockDetailsOverviewController stockDetailsOverviewController2 = this.f209489b;
                        qji.b bVarU2 = stockDetailsOverviewController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.di.StockDetailsOverviewControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockDetailsOverviewControllerContract$InputData stockDetailsOverviewControllerContract$InputData = stockDetailsOverviewController2.K;
                        d dVar = stockDetailsOverviewController2.y0;
                        kgm.c cVar = stockDetailsOverviewController2.z0;
                        atk.e eVar = new atk.e(stockDetailsOverviewControllerContract$InputData.f104061a);
                        fvk.i iVar = stockDetailsOverviewController2.A0;
                        String str = stockDetailsOverviewControllerContract$InputData.f104061a;
                        boolean z = stockDetailsOverviewControllerContract$InputData.f104062b;
                        h3h.e eVar2 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(stockDetailsOverviewController2.i0, stockDetailsOverviewController2.S, stockDetailsOverviewController2.T, stockDetailsOverviewController2.V, stockDetailsOverviewController2.W);
                        e eVar3 = stockDetailsOverviewController2.E0;
                        f fVar = stockDetailsOverviewController2.F0;
                        avk.j jVar = stockDetailsOverviewController2.B0;
                        zsk.b bVar = new zsk.b(str);
                        ListSubheaderDelegate listSubheaderDelegate = stockDetailsOverviewController2.S;
                        ctk.g gVar = new ctk.g(listSubheaderDelegate, new ctk.f(stockDetailsOverviewController2.U));
                        ctk.h hVar = new ctk.h(str);
                        jpc.e eVar4 = stockDetailsOverviewController2.D0;
                        osk.e eVar5 = new osk.e(str);
                        ftk.e eVar6 = new ftk.e(str, z);
                        g gVar2 = stockDetailsOverviewController2.C0;
                        avk.h hVar2 = stockDetailsOverviewController2.G0;
                        jtk.c cVar3 = new jtk.c(stockDetailsOverviewController2.j0, stockDetailsOverviewController2.f104052k0, stockDetailsOverviewController2.p0);
                        jtk.d dVar2 = new jtk.d(str);
                        kbb.c cVar4 = stockDetailsOverviewController2.H0;
                        b bVar2 = stockDetailsOverviewController2.I0;
                        avk.b bVar3 = stockDetailsOverviewController2.J0;
                        m5e.d dVar3 = stockDetailsOverviewController2.M0;
                        dtk.d dVar4 = new dtk.d(stockDetailsOverviewController2.Z, listSubheaderDelegate);
                        jul.o oVar = stockDetailsOverviewController2.K0;
                        tsk.e eVar7 = new tsk.e(str);
                        jx0.a aVar = stockDetailsOverviewController2.L0;
                        fvk.d dVar5 = stockDetailsOverviewController2.N0;
                        xsk.d dVar6 = new xsk.d(str);
                        k7i.i iVar2 = stockDetailsOverviewController2.O0;
                        dVar.getClass();
                        cVar.getClass();
                        iVar.getClass();
                        eVar3.getClass();
                        fVar.getClass();
                        jVar.getClass();
                        eVar4.getClass();
                        gVar2.getClass();
                        hVar2.getClass();
                        cVar4.getClass();
                        bVar2.getClass();
                        bVar3.getClass();
                        dVar3.getClass();
                        oVar.getClass();
                        aVar.getClass();
                        dVar5.getClass();
                        iVar2.getClass();
                        return new f0(g0Var, e0Var2, new rdf.a(), new f3h.b(), new f3h.a(), stockDetailsOverviewController2, stockDetailsOverviewControllerContract$InputData, dVar, cVar, eVar, iVar, eVar2, cVar2, eVar3, fVar, jVar, bVar, gVar, hVar, eVar4, eVar5, eVar6, gVar2, hVar2, stockDetailsOverviewController2, cVar3, dVar2, cVar4, bVar2, bVar3, dVar3, dVar4, oVar, eVar7, aVar, dVar5, dVar6, iVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = StockDetailsOverviewController.P0;
                        return (h) ((f0) ((nwk.a) stockDetailsOverviewController.M.getValue())).N0.get();
                    case 2:
                        KProperty[] kPropertyArr3 = StockDetailsOverviewController.P0;
                        return (j60.a) ((f0) ((nwk.a) stockDetailsOverviewController.M.getValue())).f239111d0.get();
                    default:
                        KProperty[] kPropertyArr4 = StockDetailsOverviewController.P0;
                        StockDetailsOverviewController stockDetailsOverviewController3 = this.f209489b;
                        return dli.f.a(stockDetailsOverviewController3, (h) stockDetailsOverviewController3.N.getValue(), v.k(stockDetailsOverviewController3.P, stockDetailsOverviewController3.Q, stockDetailsOverviewController3.f0, new EmptyStateTextDelegate(), stockDetailsOverviewController3.g0, stockDetailsOverviewController3.f104051h0, stockDetailsOverviewController3.i0, new HeaderLoadingDelegate(), stockDetailsOverviewController3.X, stockDetailsOverviewController3.l0, stockDetailsOverviewController3.S, stockDetailsOverviewController3.T, stockDetailsOverviewController3.m0, stockDetailsOverviewController3.j0, stockDetailsOverviewController3.f104052k0, stockDetailsOverviewController3.V, stockDetailsOverviewController3.W, stockDetailsOverviewController3.p0, new ScrollerBoxDelegate(u.c(stockDetailsOverviewController3.U)), stockDetailsOverviewController3.f104048b0, stockDetailsOverviewController3.q0, stockDetailsOverviewController3.c0, stockDetailsOverviewController3.f104055r0, stockDetailsOverviewController3.f104049d0, stockDetailsOverviewController3.Y, stockDetailsOverviewController3.Z, stockDetailsOverviewController3.f104056s0, stockDetailsOverviewController3.f104057t0, stockDetailsOverviewController3.u0, stockDetailsOverviewController3.f104050e0, stockDetailsOverviewController3.f104058v0), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.P = new AppTipDelegate();
        this.Q = new AirTipDelegate();
        this.R = new ProgressStepVerticalDelegate();
        this.S = new ListSubheaderDelegate();
        this.T = new ListSubheaderLoadingDelegate();
        this.U = new ReferralContactDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.V = rowDelegate;
        this.W = new RowLoadingDelegate();
        this.X = new LargeActionButtonDelegate();
        this.Y = new CalendarRowDelegate();
        this.Z = new CellDetailsDelegate();
        this.f104047a0 = new TwinHorizontalButtonDelegate();
        this.f104048b0 = new SmallActionButtonDelegate();
        this.c0 = new TextDelegate();
        this.f104049d0 = new ToDoItemDelegate();
        this.f104050e0 = new FullScreenStateDelegate();
        this.f0 = new CandleStickGraphDelegate(yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        this.g0 = new FixedTabsDelegate();
        this.f104051h0 = new TabsDelegate();
        this.i0 = new HeaderDelegate();
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.j0 = plainTextWarningDelegate;
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.f104052k0 = bannerDelegate;
        this.l0 = new ListCellDelegate();
        this.m0 = new PlainTextDelegate();
        LogosTileDelegate logosTileDelegate = new LogosTileDelegate();
        this.f104053n0 = logosTileDelegate;
        HorizontalHistogramTileDelegate horizontalHistogramTileDelegate = new HorizontalHistogramTileDelegate();
        this.f104054o0 = horizontalHistogramTileDelegate;
        final int i5 = 3;
        this.p0 = new ScrollerDelegate(v.k(plainTextWarningDelegate, bannerDelegate, logosTileDelegate, horizontalHistogramTileDelegate, new HorizontalHistogramTileLoadingDelegate()), false);
        this.q0 = new SuggestionsBarDelegate();
        this.f104055r0 = new TrendViewDelegate(1000L);
        this.f104056s0 = new EpsChartDelegate();
        this.f104057t0 = new HorizontalLegendDelegate();
        this.u0 = new GroupedBarLineChartDelegate();
        this.f104058v0 = new SwipeToActionDelegate(rowDelegate, true);
        this.f104059w0 = w.y0(new Function0(this) { // from class: mwk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsOverviewController f209489b;

            {
                this.f209489b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                StockDetailsOverviewController stockDetailsOverviewController = this.f209489b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockDetailsOverviewController.P0;
                        StockDetailsOverviewController stockDetailsOverviewController2 = this.f209489b;
                        qji.b bVarU2 = stockDetailsOverviewController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.di.StockDetailsOverviewControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockDetailsOverviewControllerContract$InputData stockDetailsOverviewControllerContract$InputData = stockDetailsOverviewController2.K;
                        d dVar = stockDetailsOverviewController2.y0;
                        kgm.c cVar = stockDetailsOverviewController2.z0;
                        atk.e eVar = new atk.e(stockDetailsOverviewControllerContract$InputData.f104061a);
                        fvk.i iVar = stockDetailsOverviewController2.A0;
                        String str = stockDetailsOverviewControllerContract$InputData.f104061a;
                        boolean z = stockDetailsOverviewControllerContract$InputData.f104062b;
                        h3h.e eVar2 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(stockDetailsOverviewController2.i0, stockDetailsOverviewController2.S, stockDetailsOverviewController2.T, stockDetailsOverviewController2.V, stockDetailsOverviewController2.W);
                        e eVar3 = stockDetailsOverviewController2.E0;
                        f fVar = stockDetailsOverviewController2.F0;
                        avk.j jVar = stockDetailsOverviewController2.B0;
                        zsk.b bVar = new zsk.b(str);
                        ListSubheaderDelegate listSubheaderDelegate = stockDetailsOverviewController2.S;
                        ctk.g gVar = new ctk.g(listSubheaderDelegate, new ctk.f(stockDetailsOverviewController2.U));
                        ctk.h hVar = new ctk.h(str);
                        jpc.e eVar4 = stockDetailsOverviewController2.D0;
                        osk.e eVar5 = new osk.e(str);
                        ftk.e eVar6 = new ftk.e(str, z);
                        g gVar2 = stockDetailsOverviewController2.C0;
                        avk.h hVar2 = stockDetailsOverviewController2.G0;
                        jtk.c cVar3 = new jtk.c(stockDetailsOverviewController2.j0, stockDetailsOverviewController2.f104052k0, stockDetailsOverviewController2.p0);
                        jtk.d dVar2 = new jtk.d(str);
                        kbb.c cVar4 = stockDetailsOverviewController2.H0;
                        b bVar2 = stockDetailsOverviewController2.I0;
                        avk.b bVar3 = stockDetailsOverviewController2.J0;
                        m5e.d dVar3 = stockDetailsOverviewController2.M0;
                        dtk.d dVar4 = new dtk.d(stockDetailsOverviewController2.Z, listSubheaderDelegate);
                        jul.o oVar = stockDetailsOverviewController2.K0;
                        tsk.e eVar7 = new tsk.e(str);
                        jx0.a aVar = stockDetailsOverviewController2.L0;
                        fvk.d dVar5 = stockDetailsOverviewController2.N0;
                        xsk.d dVar6 = new xsk.d(str);
                        k7i.i iVar2 = stockDetailsOverviewController2.O0;
                        dVar.getClass();
                        cVar.getClass();
                        iVar.getClass();
                        eVar3.getClass();
                        fVar.getClass();
                        jVar.getClass();
                        eVar4.getClass();
                        gVar2.getClass();
                        hVar2.getClass();
                        cVar4.getClass();
                        bVar2.getClass();
                        bVar3.getClass();
                        dVar3.getClass();
                        oVar.getClass();
                        aVar.getClass();
                        dVar5.getClass();
                        iVar2.getClass();
                        return new f0(g0Var, e0Var2, new rdf.a(), new f3h.b(), new f3h.a(), stockDetailsOverviewController2, stockDetailsOverviewControllerContract$InputData, dVar, cVar, eVar, iVar, eVar2, cVar2, eVar3, fVar, jVar, bVar, gVar, hVar, eVar4, eVar5, eVar6, gVar2, hVar2, stockDetailsOverviewController2, cVar3, dVar2, cVar4, bVar2, bVar3, dVar3, dVar4, oVar, eVar7, aVar, dVar5, dVar6, iVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = StockDetailsOverviewController.P0;
                        return (h) ((f0) ((nwk.a) stockDetailsOverviewController.M.getValue())).N0.get();
                    case 2:
                        KProperty[] kPropertyArr3 = StockDetailsOverviewController.P0;
                        return (j60.a) ((f0) ((nwk.a) stockDetailsOverviewController.M.getValue())).f239111d0.get();
                    default:
                        KProperty[] kPropertyArr4 = StockDetailsOverviewController.P0;
                        StockDetailsOverviewController stockDetailsOverviewController3 = this.f209489b;
                        return dli.f.a(stockDetailsOverviewController3, (h) stockDetailsOverviewController3.N.getValue(), v.k(stockDetailsOverviewController3.P, stockDetailsOverviewController3.Q, stockDetailsOverviewController3.f0, new EmptyStateTextDelegate(), stockDetailsOverviewController3.g0, stockDetailsOverviewController3.f104051h0, stockDetailsOverviewController3.i0, new HeaderLoadingDelegate(), stockDetailsOverviewController3.X, stockDetailsOverviewController3.l0, stockDetailsOverviewController3.S, stockDetailsOverviewController3.T, stockDetailsOverviewController3.m0, stockDetailsOverviewController3.j0, stockDetailsOverviewController3.f104052k0, stockDetailsOverviewController3.V, stockDetailsOverviewController3.W, stockDetailsOverviewController3.p0, new ScrollerBoxDelegate(u.c(stockDetailsOverviewController3.U)), stockDetailsOverviewController3.f104048b0, stockDetailsOverviewController3.q0, stockDetailsOverviewController3.c0, stockDetailsOverviewController3.f104055r0, stockDetailsOverviewController3.f104049d0, stockDetailsOverviewController3.Y, stockDetailsOverviewController3.Z, stockDetailsOverviewController3.f104056s0, stockDetailsOverviewController3.f104057t0, stockDetailsOverviewController3.u0, stockDetailsOverviewController3.f104050e0, stockDetailsOverviewController3.f104058v0), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.f104060x0 = R$layout.fragment_asset_details;
        this.y0 = new mwk.d(this);
        this.z0 = new kgm.c(this, 17);
        this.A0 = new fvk.i(this);
        this.B0 = new j(this, 17);
        this.C0 = new g(this);
        this.D0 = new e(this);
        this.E0 = new mwk.e(this);
        this.F0 = new f(this);
        this.G0 = new h(this);
        this.H0 = new c(this);
        this.I0 = new b(this);
        this.J0 = new avk.b(this, i5);
        this.K0 = new o(this);
        this.L0 = new jx0.a(this);
        this.M0 = new d(this);
        this.N0 = new fvk.d(this);
        this.O0 = new k7i.i(this);
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        a.z0((mwk.j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (nwk.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (mwk.h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_stock_details_tab_overview, null, null, 14));
        ViewBinding value = this.L.getValue(this, P0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((nrk.b) value).f218664b.setTag("StockOverviewContractRecycler");
        ((j60.a) this.O.getValue()).d(v.k(this.f104047a0, this.Z, this.X));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.f104059w0.getValue()).w();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.f104060x0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f104059w0.getValue();
    }
}
