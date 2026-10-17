package com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.EmptyStateTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import fvk.b;
import fvk.d;
import fvk.e;
import fvk.f;
import fvk.g;
import fvk.k;
import fvk.n;
import i7d.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.g0;
import prk.p;
import te0.w;
import vc.s;
import zhm.v;
import zjh.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/etf_details_overview/EtfDetailsOverviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfvk/n;", "Li7d/i;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EtfDetailsOverviewController extends ViewController<q> implements a, i {
    public static final /* synthetic */ KProperty[] B0 = {o0.f186429a.j(new h0(EtfDetailsOverviewController.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/FragmentAssetDetailsBinding;", 0))};
    public final j A0;
    public final EtfDetailsOverviewControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final AppTipDelegate O;
    public final AirTipDelegate P;
    public final CandleStickGraphDelegate Q;
    public final CellDetailsDelegate R;
    public final FixedTabsDelegate S;
    public final TabsDelegate T;
    public final ReferralContactDelegate U;
    public final HeaderDelegate V;
    public final LargeActionButtonDelegate W;
    public final ListCellDelegate X;
    public final ListSubheaderDelegate Y;
    public final ListSubheaderLoadingDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final PlainTextDelegate f103932a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final PlainTextWarningDelegate f103933b0;
    public final BannerDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final PlanTileDelegate f103934d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RowDelegate f103935e0;
    public final RowLoadingDelegate f0;
    public final ScrollerDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final SuggestionsBarDelegate f103936h0;
    public final SwipeToActionDelegate i0;
    public final TextDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final TrendViewDelegate f103937k0;
    public final Object l0;
    public final int m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final f4h.a f103938n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final e f103939o0;
    public final fvk.i p0;
    public final fvk.j q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final g f103940r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final fvk.h f103941s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final avk.h f103942t0;
    public final c u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final d f103943v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final f61.a f103944w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final f f103945x0;
    public final b y0;
    public final avk.b z0;

    public EtfDetailsOverviewController(EtfDetailsOverviewControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, fvk.c.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: fvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EtfDetailsOverviewController f138427b;

            {
                this.f138427b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = EtfDetailsOverviewController.B0;
                        EtfDetailsOverviewController etfDetailsOverviewController = this.f138427b;
                        qji.b bVarU2 = etfDetailsOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.di.EtfDetailsOverviewControllerComponentInjector");
                        prk.n nVar = (prk.n) ((ptk.a) bVarU2);
                        g0 g0Var = nVar.f239243g;
                        prk.n nVar2 = nVar.f239244h;
                        EtfDetailsOverviewControllerContract$InputData etfDetailsOverviewControllerContract$InputData = etfDetailsOverviewController.K;
                        f4h.a aVar = etfDetailsOverviewController.f103938n0;
                        e eVar = etfDetailsOverviewController.f103939o0;
                        atk.e eVar2 = new atk.e(etfDetailsOverviewControllerContract$InputData.f103946a);
                        i iVar = etfDetailsOverviewController.p0;
                        String str = etfDetailsOverviewControllerContract$InputData.f103946a;
                        btk.e eVar3 = new btk.e(str);
                        j jVar = etfDetailsOverviewController.q0;
                        g gVar = etfDetailsOverviewController.f103940r0;
                        h hVar = etfDetailsOverviewController.f103941s0;
                        avk.h hVar2 = etfDetailsOverviewController.f103942t0;
                        h3h.c cVar = new h3h.c(etfDetailsOverviewController.V, etfDetailsOverviewController.Y, etfDetailsOverviewController.Z, etfDetailsOverviewController.f103935e0, etfDetailsOverviewController.f0);
                        h3h.e eVar4 = new h3h.e(str, etfDetailsOverviewControllerContract$InputData.f103947b);
                        ListSubheaderDelegate listSubheaderDelegate = etfDetailsOverviewController.Y;
                        ctk.g gVar2 = new ctk.g(listSubheaderDelegate, new ctk.f(etfDetailsOverviewController.U));
                        ctk.h hVar3 = new ctk.h(str);
                        dtk.d dVar = new dtk.d(etfDetailsOverviewController.R, listSubheaderDelegate);
                        a3h.e eVar5 = new a3h.e(str);
                        zjh.c cVar2 = etfDetailsOverviewController.u0;
                        vsk.d dVar2 = new vsk.d(str);
                        d dVar3 = etfDetailsOverviewController.f103943v0;
                        f61.a aVar2 = etfDetailsOverviewController.f103944w0;
                        f fVar = etfDetailsOverviewController.f103945x0;
                        b bVar = etfDetailsOverviewController.y0;
                        avk.b bVar2 = etfDetailsOverviewController.z0;
                        jtk.c cVar3 = new jtk.c(etfDetailsOverviewController.f103933b0, etfDetailsOverviewController.c0, etfDetailsOverviewController.g0);
                        jtk.d dVar4 = new jtk.d(str);
                        avk.j jVar2 = etfDetailsOverviewController.A0;
                        aVar.getClass();
                        eVar.getClass();
                        iVar.getClass();
                        jVar.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        hVar2.getClass();
                        cVar2.getClass();
                        dVar3.getClass();
                        aVar2.getClass();
                        fVar.getClass();
                        bVar.getClass();
                        bVar2.getClass();
                        jVar2.getClass();
                        return new prk.p(g0Var, nVar2, new rdf.a(), new f3h.b(), new f3h.a(), etfDetailsOverviewController, etfDetailsOverviewControllerContract$InputData, aVar, eVar, eVar2, iVar, eVar3, jVar, cVar, eVar4, gVar, hVar, hVar2, dVar, eVar5, cVar2, dVar3, dVar2, aVar2, fVar, gVar2, hVar3, cVar3, dVar4, bVar, bVar2, etfDetailsOverviewController, jVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = EtfDetailsOverviewController.B0;
                        return (k) ((prk.p) this.f138427b.M.getValue()).y0.get();
                    default:
                        KProperty[] kPropertyArr3 = EtfDetailsOverviewController.B0;
                        EtfDetailsOverviewController etfDetailsOverviewController2 = this.f138427b;
                        return dli.f.a(etfDetailsOverviewController2, (k) etfDetailsOverviewController2.N.getValue(), zhm.v.k(etfDetailsOverviewController2.O, etfDetailsOverviewController2.P, etfDetailsOverviewController2.Q, etfDetailsOverviewController2.R, new EmptyStateTextDelegate(), etfDetailsOverviewController2.S, etfDetailsOverviewController2.V, new HeaderLoadingDelegate(), etfDetailsOverviewController2.W, etfDetailsOverviewController2.X, etfDetailsOverviewController2.Y, etfDetailsOverviewController2.Z, etfDetailsOverviewController2.f103932a0, etfDetailsOverviewController2.f103933b0, etfDetailsOverviewController2.c0, etfDetailsOverviewController2.f103934d0, etfDetailsOverviewController2.f103935e0, etfDetailsOverviewController2.f0, etfDetailsOverviewController2.g0, new ScrollerBoxDelegate(zhm.u.c(etfDetailsOverviewController2.U)), etfDetailsOverviewController2.f103936h0, etfDetailsOverviewController2.i0, etfDetailsOverviewController2.T, etfDetailsOverviewController2.j0, etfDetailsOverviewController2.f103937k0), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: fvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EtfDetailsOverviewController f138427b;

            {
                this.f138427b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EtfDetailsOverviewController.B0;
                        EtfDetailsOverviewController etfDetailsOverviewController = this.f138427b;
                        qji.b bVarU2 = etfDetailsOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.di.EtfDetailsOverviewControllerComponentInjector");
                        prk.n nVar = (prk.n) ((ptk.a) bVarU2);
                        g0 g0Var = nVar.f239243g;
                        prk.n nVar2 = nVar.f239244h;
                        EtfDetailsOverviewControllerContract$InputData etfDetailsOverviewControllerContract$InputData = etfDetailsOverviewController.K;
                        f4h.a aVar = etfDetailsOverviewController.f103938n0;
                        e eVar = etfDetailsOverviewController.f103939o0;
                        atk.e eVar2 = new atk.e(etfDetailsOverviewControllerContract$InputData.f103946a);
                        i iVar = etfDetailsOverviewController.p0;
                        String str = etfDetailsOverviewControllerContract$InputData.f103946a;
                        btk.e eVar3 = new btk.e(str);
                        j jVar = etfDetailsOverviewController.q0;
                        g gVar = etfDetailsOverviewController.f103940r0;
                        h hVar = etfDetailsOverviewController.f103941s0;
                        avk.h hVar2 = etfDetailsOverviewController.f103942t0;
                        h3h.c cVar = new h3h.c(etfDetailsOverviewController.V, etfDetailsOverviewController.Y, etfDetailsOverviewController.Z, etfDetailsOverviewController.f103935e0, etfDetailsOverviewController.f0);
                        h3h.e eVar4 = new h3h.e(str, etfDetailsOverviewControllerContract$InputData.f103947b);
                        ListSubheaderDelegate listSubheaderDelegate = etfDetailsOverviewController.Y;
                        ctk.g gVar2 = new ctk.g(listSubheaderDelegate, new ctk.f(etfDetailsOverviewController.U));
                        ctk.h hVar3 = new ctk.h(str);
                        dtk.d dVar = new dtk.d(etfDetailsOverviewController.R, listSubheaderDelegate);
                        a3h.e eVar5 = new a3h.e(str);
                        zjh.c cVar2 = etfDetailsOverviewController.u0;
                        vsk.d dVar2 = new vsk.d(str);
                        d dVar3 = etfDetailsOverviewController.f103943v0;
                        f61.a aVar2 = etfDetailsOverviewController.f103944w0;
                        f fVar = etfDetailsOverviewController.f103945x0;
                        b bVar = etfDetailsOverviewController.y0;
                        avk.b bVar2 = etfDetailsOverviewController.z0;
                        jtk.c cVar3 = new jtk.c(etfDetailsOverviewController.f103933b0, etfDetailsOverviewController.c0, etfDetailsOverviewController.g0);
                        jtk.d dVar4 = new jtk.d(str);
                        avk.j jVar2 = etfDetailsOverviewController.A0;
                        aVar.getClass();
                        eVar.getClass();
                        iVar.getClass();
                        jVar.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        hVar2.getClass();
                        cVar2.getClass();
                        dVar3.getClass();
                        aVar2.getClass();
                        fVar.getClass();
                        bVar.getClass();
                        bVar2.getClass();
                        jVar2.getClass();
                        return new prk.p(g0Var, nVar2, new rdf.a(), new f3h.b(), new f3h.a(), etfDetailsOverviewController, etfDetailsOverviewControllerContract$InputData, aVar, eVar, eVar2, iVar, eVar3, jVar, cVar, eVar4, gVar, hVar, hVar2, dVar, eVar5, cVar2, dVar3, dVar2, aVar2, fVar, gVar2, hVar3, cVar3, dVar4, bVar, bVar2, etfDetailsOverviewController, jVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = EtfDetailsOverviewController.B0;
                        return (k) ((prk.p) this.f138427b.M.getValue()).y0.get();
                    default:
                        KProperty[] kPropertyArr3 = EtfDetailsOverviewController.B0;
                        EtfDetailsOverviewController etfDetailsOverviewController2 = this.f138427b;
                        return dli.f.a(etfDetailsOverviewController2, (k) etfDetailsOverviewController2.N.getValue(), zhm.v.k(etfDetailsOverviewController2.O, etfDetailsOverviewController2.P, etfDetailsOverviewController2.Q, etfDetailsOverviewController2.R, new EmptyStateTextDelegate(), etfDetailsOverviewController2.S, etfDetailsOverviewController2.V, new HeaderLoadingDelegate(), etfDetailsOverviewController2.W, etfDetailsOverviewController2.X, etfDetailsOverviewController2.Y, etfDetailsOverviewController2.Z, etfDetailsOverviewController2.f103932a0, etfDetailsOverviewController2.f103933b0, etfDetailsOverviewController2.c0, etfDetailsOverviewController2.f103934d0, etfDetailsOverviewController2.f103935e0, etfDetailsOverviewController2.f0, etfDetailsOverviewController2.g0, new ScrollerBoxDelegate(zhm.u.c(etfDetailsOverviewController2.U)), etfDetailsOverviewController2.f103936h0, etfDetailsOverviewController2.i0, etfDetailsOverviewController2.T, etfDetailsOverviewController2.j0, etfDetailsOverviewController2.f103937k0), 0, null, null, null, 60);
                }
            }
        });
        this.O = new AppTipDelegate();
        this.P = new AirTipDelegate();
        this.Q = new CandleStickGraphDelegate(yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        this.R = new CellDetailsDelegate();
        this.S = new FixedTabsDelegate();
        this.T = new TabsDelegate();
        this.U = new ReferralContactDelegate();
        this.V = new HeaderDelegate();
        this.W = new LargeActionButtonDelegate();
        this.X = new ListCellDelegate();
        this.Y = new ListSubheaderDelegate();
        this.Z = new ListSubheaderLoadingDelegate();
        this.f103932a0 = new PlainTextDelegate();
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.f103933b0 = plainTextWarningDelegate;
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.c0 = bannerDelegate;
        this.f103934d0 = new PlanTileDelegate(0);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f103935e0 = rowDelegate;
        this.f0 = new RowLoadingDelegate();
        final int i3 = 2;
        this.g0 = new ScrollerDelegate(v.k(plainTextWarningDelegate, bannerDelegate), false);
        this.f103936h0 = new SuggestionsBarDelegate();
        this.i0 = new SwipeToActionDelegate(rowDelegate, false);
        this.j0 = new TextDelegate();
        this.f103937k0 = new TrendViewDelegate(1000L);
        this.l0 = w.y0(new Function0(this) { // from class: fvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EtfDetailsOverviewController f138427b;

            {
                this.f138427b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EtfDetailsOverviewController.B0;
                        EtfDetailsOverviewController etfDetailsOverviewController = this.f138427b;
                        qji.b bVarU2 = etfDetailsOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.di.EtfDetailsOverviewControllerComponentInjector");
                        prk.n nVar = (prk.n) ((ptk.a) bVarU2);
                        g0 g0Var = nVar.f239243g;
                        prk.n nVar2 = nVar.f239244h;
                        EtfDetailsOverviewControllerContract$InputData etfDetailsOverviewControllerContract$InputData = etfDetailsOverviewController.K;
                        f4h.a aVar = etfDetailsOverviewController.f103938n0;
                        e eVar = etfDetailsOverviewController.f103939o0;
                        atk.e eVar2 = new atk.e(etfDetailsOverviewControllerContract$InputData.f103946a);
                        i iVar = etfDetailsOverviewController.p0;
                        String str = etfDetailsOverviewControllerContract$InputData.f103946a;
                        btk.e eVar3 = new btk.e(str);
                        j jVar = etfDetailsOverviewController.q0;
                        g gVar = etfDetailsOverviewController.f103940r0;
                        h hVar = etfDetailsOverviewController.f103941s0;
                        avk.h hVar2 = etfDetailsOverviewController.f103942t0;
                        h3h.c cVar = new h3h.c(etfDetailsOverviewController.V, etfDetailsOverviewController.Y, etfDetailsOverviewController.Z, etfDetailsOverviewController.f103935e0, etfDetailsOverviewController.f0);
                        h3h.e eVar4 = new h3h.e(str, etfDetailsOverviewControllerContract$InputData.f103947b);
                        ListSubheaderDelegate listSubheaderDelegate = etfDetailsOverviewController.Y;
                        ctk.g gVar2 = new ctk.g(listSubheaderDelegate, new ctk.f(etfDetailsOverviewController.U));
                        ctk.h hVar3 = new ctk.h(str);
                        dtk.d dVar = new dtk.d(etfDetailsOverviewController.R, listSubheaderDelegate);
                        a3h.e eVar5 = new a3h.e(str);
                        zjh.c cVar2 = etfDetailsOverviewController.u0;
                        vsk.d dVar2 = new vsk.d(str);
                        d dVar3 = etfDetailsOverviewController.f103943v0;
                        f61.a aVar2 = etfDetailsOverviewController.f103944w0;
                        f fVar = etfDetailsOverviewController.f103945x0;
                        b bVar = etfDetailsOverviewController.y0;
                        avk.b bVar2 = etfDetailsOverviewController.z0;
                        jtk.c cVar3 = new jtk.c(etfDetailsOverviewController.f103933b0, etfDetailsOverviewController.c0, etfDetailsOverviewController.g0);
                        jtk.d dVar4 = new jtk.d(str);
                        avk.j jVar2 = etfDetailsOverviewController.A0;
                        aVar.getClass();
                        eVar.getClass();
                        iVar.getClass();
                        jVar.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        hVar2.getClass();
                        cVar2.getClass();
                        dVar3.getClass();
                        aVar2.getClass();
                        fVar.getClass();
                        bVar.getClass();
                        bVar2.getClass();
                        jVar2.getClass();
                        return new prk.p(g0Var, nVar2, new rdf.a(), new f3h.b(), new f3h.a(), etfDetailsOverviewController, etfDetailsOverviewControllerContract$InputData, aVar, eVar, eVar2, iVar, eVar3, jVar, cVar, eVar4, gVar, hVar, hVar2, dVar, eVar5, cVar2, dVar3, dVar2, aVar2, fVar, gVar2, hVar3, cVar3, dVar4, bVar, bVar2, etfDetailsOverviewController, jVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = EtfDetailsOverviewController.B0;
                        return (k) ((prk.p) this.f138427b.M.getValue()).y0.get();
                    default:
                        KProperty[] kPropertyArr3 = EtfDetailsOverviewController.B0;
                        EtfDetailsOverviewController etfDetailsOverviewController2 = this.f138427b;
                        return dli.f.a(etfDetailsOverviewController2, (k) etfDetailsOverviewController2.N.getValue(), zhm.v.k(etfDetailsOverviewController2.O, etfDetailsOverviewController2.P, etfDetailsOverviewController2.Q, etfDetailsOverviewController2.R, new EmptyStateTextDelegate(), etfDetailsOverviewController2.S, etfDetailsOverviewController2.V, new HeaderLoadingDelegate(), etfDetailsOverviewController2.W, etfDetailsOverviewController2.X, etfDetailsOverviewController2.Y, etfDetailsOverviewController2.Z, etfDetailsOverviewController2.f103932a0, etfDetailsOverviewController2.f103933b0, etfDetailsOverviewController2.c0, etfDetailsOverviewController2.f103934d0, etfDetailsOverviewController2.f103935e0, etfDetailsOverviewController2.f0, etfDetailsOverviewController2.g0, new ScrollerBoxDelegate(zhm.u.c(etfDetailsOverviewController2.U)), etfDetailsOverviewController2.f103936h0, etfDetailsOverviewController2.i0, etfDetailsOverviewController2.T, etfDetailsOverviewController2.j0, etfDetailsOverviewController2.f103937k0), 0, null, null, null, 60);
                }
            }
        });
        this.m0 = R$layout.fragment_asset_details;
        this.f103938n0 = new f4h.a(this);
        this.f103939o0 = new e(this);
        this.p0 = new fvk.i(this);
        this.q0 = new fvk.j(this);
        this.f103940r0 = new g(this);
        this.f103941s0 = new fvk.h(this);
        this.f103942t0 = new avk.h(this);
        this.u0 = new c(this);
        this.f103943v0 = new d(this);
        this.f103944w0 = new f61.a(this, 4);
        this.f103945x0 = new f(this);
        this.y0 = new b(this);
        this.z0 = new avk.b(this, i2);
        this.A0 = new j(this, 7);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_stock_details_tab_overview, null, null, 14));
        ViewBinding value = this.L.getValue(this, B0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((nrk.b) value).f218664b.setTag("StockOverviewContractRecycler");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.l0.getValue()).w();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.m0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.l0.getValue();
    }
}
