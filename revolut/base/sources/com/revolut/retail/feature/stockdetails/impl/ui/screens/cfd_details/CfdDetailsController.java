package com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details;

import aii.q;
import akl.e0;
import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.b;
import avk.c;
import avk.d;
import avk.e;
import avk.g;
import avk.j;
import avk.k;
import avk.n;
import avk.p;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.EmptyStateTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
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
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import i7d.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.n0;
import r10.r;
import te0.w;
import tx0.j0;
import tx0.t3;
import tx0.u3;
import vc.s;
import zhm.v;
import zjh.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/cfd_details/CfdDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lavk/r;", "Li7d/i;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdDetailsController extends ViewController<q> implements a, i {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f103904s0 = {o0.f186429a.j(new h0(CfdDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final CfdDetailsControllerContract$InputData K;
    public final h L;
    public final AirTipDelegate M;
    public final CandleStickGraphDelegate N;
    public final FixedTabsDelegate O;
    public final TabsDelegate P;
    public final HeaderDelegate Q;
    public final ListCellDelegate R;
    public final ListSubheaderDelegate S;
    public final ListSubheaderLoadingDelegate T;
    public final PlainTextDelegate U;
    public final PlainTextWarningDelegate V;
    public final BannerDelegate W;
    public final RowDelegate X;
    public final RowLoadingDelegate Y;
    public final ScrollerDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SuggestionsBarDelegate f103905a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final SwipeToActionDelegate f103906b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TrendViewDelegate f103907d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final f f103908e0;
    public final c f0;
    public final b g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final e f103909h0;
    public final r i0;
    public final avk.f j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final g f103910k0;
    public final avk.h l0;
    public final zjh.i m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final j f103911n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int f103912o0;
    public final Object p0;
    public final Object q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f103913r0;

    public CfdDetailsController(CfdDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, d.f);
        this.M = new AirTipDelegate();
        this.N = new CandleStickGraphDelegate(yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        this.O = new FixedTabsDelegate();
        this.P = new TabsDelegate();
        this.Q = new HeaderDelegate();
        this.R = new ListCellDelegate();
        this.S = new ListSubheaderDelegate();
        this.T = new ListSubheaderLoadingDelegate();
        this.U = new PlainTextDelegate();
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.V = plainTextWarningDelegate;
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.W = bannerDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.X = rowDelegate;
        this.Y = new RowLoadingDelegate();
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.Z = new ScrollerDelegate(v.k(plainTextWarningDelegate, bannerDelegate), false);
        this.f103905a0 = new SuggestionsBarDelegate();
        this.f103906b0 = new SwipeToActionDelegate(rowDelegate, false);
        this.c0 = new TextDelegate();
        this.f103907d0 = new TrendViewDelegate(1000L);
        this.f103908e0 = new f(this, 6);
        this.f0 = new c(this);
        this.g0 = new b(this, i2);
        this.f103909h0 = new e(this);
        r rVar = new r();
        rVar.f250851a = this.R;
        rVar.f250852b = this.S;
        rVar.f250853c = this.U;
        this.i0 = rVar;
        this.j0 = new avk.f(this);
        this.f103910k0 = new g(this);
        this.l0 = new avk.h(this);
        this.m0 = new zjh.i(this);
        this.f103911n0 = new j(this, i2);
        this.f103912o0 = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        this.p0 = w.y0(new Function0(this) { // from class: avk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdDetailsController f10066b;

            {
                this.f10066b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdDetailsController.f103904s0;
                        CfdDetailsController cfdDetailsController = this.f10066b;
                        return dli.f.a(cfdDetailsController, (k) cfdDetailsController.f103913r0.getValue(), zhm.v.k(cfdDetailsController.M, cfdDetailsController.N, new EmptyStateTextDelegate(), cfdDetailsController.O, new FullScreenStateDelegate(), cfdDetailsController.Q, new HeaderLoadingDelegate(), cfdDetailsController.R, cfdDetailsController.S, cfdDetailsController.T, cfdDetailsController.U, cfdDetailsController.V, cfdDetailsController.W, cfdDetailsController.X, cfdDetailsController.Y, cfdDetailsController.Z, cfdDetailsController.f103905a0, cfdDetailsController.f103906b0, cfdDetailsController.P, cfdDetailsController.c0, cfdDetailsController.f103907d0), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdDetailsController.f103904s0;
                        CfdDetailsController cfdDetailsController2 = this.f10066b;
                        Activity activityM2 = cfdDetailsController2.m2();
                        CfdDetailsControllerContract$InputData cfdDetailsControllerContract$InputData = cfdDetailsController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        prk.g0 g0Var = ((prk.g0) ((n0) aVar2.b())).N;
                        String str = cfdDetailsControllerContract$InputData.f103914a;
                        boolean z = cfdDetailsControllerContract$InputData.f103915b;
                        n2h.e eVar = new n2h.e(str, z);
                        zjh.f fVar = cfdDetailsController2.f103908e0;
                        c cVar = cfdDetailsController2.f0;
                        b bVar = cfdDetailsController2.g0;
                        e eVar2 = cfdDetailsController2.f103909h0;
                        r10.r rVar2 = cfdDetailsController2.i0;
                        f fVar2 = cfdDetailsController2.j0;
                        g gVar = cfdDetailsController2.f103910k0;
                        h hVar = cfdDetailsController2.l0;
                        atk.e eVar3 = new atk.e(str);
                        zjh.i iVar = cfdDetailsController2.m0;
                        h3h.e eVar4 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(cfdDetailsController2.Q, cfdDetailsController2.S, cfdDetailsController2.T, cfdDetailsController2.X, cfdDetailsController2.Y);
                        jtk.c cVar3 = new jtk.c(cfdDetailsController2.V, cfdDetailsController2.W, cfdDetailsController2.Z);
                        jtk.d dVar = new jtk.d(str);
                        j jVar = cfdDetailsController2.f103911n0;
                        fVar.getClass();
                        cVar.getClass();
                        bVar.getClass();
                        eVar2.getClass();
                        rVar2.getClass();
                        fVar2.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        iVar.getClass();
                        jVar.getClass();
                        return new prk.k(g0Var, new bvk.d(), new f3h.b(), new f3h.a(), cfdDetailsController2, eVar, fVar, cVar, bVar, cfdDetailsController2, eVar2, cfdDetailsControllerContract$InputData, rVar2, fVar2, gVar, hVar, eVar3, iVar, eVar4, cVar2, cVar3, dVar, jVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdDetailsController.f103904s0;
                        return (k) ((prk.k) ((bvk.a) this.f10066b.q0.getValue())).m0.get();
                }
            }
        });
        this.q0 = w.y0(new Function0(this) { // from class: avk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdDetailsController f10066b;

            {
                this.f10066b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CfdDetailsController.f103904s0;
                        CfdDetailsController cfdDetailsController = this.f10066b;
                        return dli.f.a(cfdDetailsController, (k) cfdDetailsController.f103913r0.getValue(), zhm.v.k(cfdDetailsController.M, cfdDetailsController.N, new EmptyStateTextDelegate(), cfdDetailsController.O, new FullScreenStateDelegate(), cfdDetailsController.Q, new HeaderLoadingDelegate(), cfdDetailsController.R, cfdDetailsController.S, cfdDetailsController.T, cfdDetailsController.U, cfdDetailsController.V, cfdDetailsController.W, cfdDetailsController.X, cfdDetailsController.Y, cfdDetailsController.Z, cfdDetailsController.f103905a0, cfdDetailsController.f103906b0, cfdDetailsController.P, cfdDetailsController.c0, cfdDetailsController.f103907d0), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdDetailsController.f103904s0;
                        CfdDetailsController cfdDetailsController2 = this.f10066b;
                        Activity activityM2 = cfdDetailsController2.m2();
                        CfdDetailsControllerContract$InputData cfdDetailsControllerContract$InputData = cfdDetailsController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        prk.g0 g0Var = ((prk.g0) ((n0) aVar2.b())).N;
                        String str = cfdDetailsControllerContract$InputData.f103914a;
                        boolean z = cfdDetailsControllerContract$InputData.f103915b;
                        n2h.e eVar = new n2h.e(str, z);
                        zjh.f fVar = cfdDetailsController2.f103908e0;
                        c cVar = cfdDetailsController2.f0;
                        b bVar = cfdDetailsController2.g0;
                        e eVar2 = cfdDetailsController2.f103909h0;
                        r10.r rVar2 = cfdDetailsController2.i0;
                        f fVar2 = cfdDetailsController2.j0;
                        g gVar = cfdDetailsController2.f103910k0;
                        h hVar = cfdDetailsController2.l0;
                        atk.e eVar3 = new atk.e(str);
                        zjh.i iVar = cfdDetailsController2.m0;
                        h3h.e eVar4 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(cfdDetailsController2.Q, cfdDetailsController2.S, cfdDetailsController2.T, cfdDetailsController2.X, cfdDetailsController2.Y);
                        jtk.c cVar3 = new jtk.c(cfdDetailsController2.V, cfdDetailsController2.W, cfdDetailsController2.Z);
                        jtk.d dVar = new jtk.d(str);
                        j jVar = cfdDetailsController2.f103911n0;
                        fVar.getClass();
                        cVar.getClass();
                        bVar.getClass();
                        eVar2.getClass();
                        rVar2.getClass();
                        fVar2.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        iVar.getClass();
                        jVar.getClass();
                        return new prk.k(g0Var, new bvk.d(), new f3h.b(), new f3h.a(), cfdDetailsController2, eVar, fVar, cVar, bVar, cfdDetailsController2, eVar2, cfdDetailsControllerContract$InputData, rVar2, fVar2, gVar, hVar, eVar3, iVar, eVar4, cVar2, cVar3, dVar, jVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdDetailsController.f103904s0;
                        return (k) ((prk.k) ((bvk.a) this.f10066b.q0.getValue())).m0.get();
                }
            }
        });
        this.f103913r0 = w.y0(new Function0(this) { // from class: avk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdDetailsController f10066b;

            {
                this.f10066b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CfdDetailsController.f103904s0;
                        CfdDetailsController cfdDetailsController = this.f10066b;
                        return dli.f.a(cfdDetailsController, (k) cfdDetailsController.f103913r0.getValue(), zhm.v.k(cfdDetailsController.M, cfdDetailsController.N, new EmptyStateTextDelegate(), cfdDetailsController.O, new FullScreenStateDelegate(), cfdDetailsController.Q, new HeaderLoadingDelegate(), cfdDetailsController.R, cfdDetailsController.S, cfdDetailsController.T, cfdDetailsController.U, cfdDetailsController.V, cfdDetailsController.W, cfdDetailsController.X, cfdDetailsController.Y, cfdDetailsController.Z, cfdDetailsController.f103905a0, cfdDetailsController.f103906b0, cfdDetailsController.P, cfdDetailsController.c0, cfdDetailsController.f103907d0), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdDetailsController.f103904s0;
                        CfdDetailsController cfdDetailsController2 = this.f10066b;
                        Activity activityM2 = cfdDetailsController2.m2();
                        CfdDetailsControllerContract$InputData cfdDetailsControllerContract$InputData = cfdDetailsController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        prk.g0 g0Var = ((prk.g0) ((n0) aVar2.b())).N;
                        String str = cfdDetailsControllerContract$InputData.f103914a;
                        boolean z = cfdDetailsControllerContract$InputData.f103915b;
                        n2h.e eVar = new n2h.e(str, z);
                        zjh.f fVar = cfdDetailsController2.f103908e0;
                        c cVar = cfdDetailsController2.f0;
                        b bVar = cfdDetailsController2.g0;
                        e eVar2 = cfdDetailsController2.f103909h0;
                        r10.r rVar2 = cfdDetailsController2.i0;
                        f fVar2 = cfdDetailsController2.j0;
                        g gVar = cfdDetailsController2.f103910k0;
                        h hVar = cfdDetailsController2.l0;
                        atk.e eVar3 = new atk.e(str);
                        zjh.i iVar = cfdDetailsController2.m0;
                        h3h.e eVar4 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(cfdDetailsController2.Q, cfdDetailsController2.S, cfdDetailsController2.T, cfdDetailsController2.X, cfdDetailsController2.Y);
                        jtk.c cVar3 = new jtk.c(cfdDetailsController2.V, cfdDetailsController2.W, cfdDetailsController2.Z);
                        jtk.d dVar = new jtk.d(str);
                        j jVar = cfdDetailsController2.f103911n0;
                        fVar.getClass();
                        cVar.getClass();
                        bVar.getClass();
                        eVar2.getClass();
                        rVar2.getClass();
                        fVar2.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        iVar.getClass();
                        jVar.getClass();
                        return new prk.k(g0Var, new bvk.d(), new f3h.b(), new f3h.a(), cfdDetailsController2, eVar, fVar, cVar, bVar, cfdDetailsController2, eVar2, cfdDetailsControllerContract$InputData, rVar2, fVar2, gVar, hVar, eVar3, iVar, eVar4, cVar2, cVar3, dVar, jVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdDetailsController.f103904s0;
                        return (k) ((prk.k) ((bvk.a) this.f10066b.q0.getValue())).m0.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        avk.r uiState = (avk.r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        avk.q qVar2 = uiState.f10118a;
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        if (qVar2 instanceof n) {
            navBarWithToolbar.l0();
            n nVar = (n) qVar2;
            navBarWithToolbar.setDescriptionText(nVar.f10115c);
            navBarWithToolbar.setToolbarTitle(nVar.f10113a);
            navBarWithToolbar.setEndImage(nVar.e);
            navBarWithToolbar.setMenuItems(nVar.f);
        } else if (qVar2 instanceof avk.o) {
            navBarWithToolbar.l0();
        } else {
            if (!(qVar2 instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        x2h.b bVar = uiState.f10119b;
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        n2h.h.a(bVar, twinHorizontalButton);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (bvk.a) this.q0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.f103913r0.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_stock_details_tab_overview, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitleAutoSize(true);
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setToolbarTitleVisibilityMode(u3.COLLAPSING);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().d.setBackgroundResource(R$drawable.uikit_bottom_container_gradient);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.p0.getValue()).w();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174567b.f59410q), new e0(this, continuation, 21), 3);
        ViewController.P2(this, rd0.e.b(d3().f174567b.o.f57403b), new avk.i(this, continuation, 0), 3);
    }

    public final jii.v d3() {
        ViewBinding value = this.L.getValue(this, f103904s0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.v) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.f103912o0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.p0.getValue();
    }
}
