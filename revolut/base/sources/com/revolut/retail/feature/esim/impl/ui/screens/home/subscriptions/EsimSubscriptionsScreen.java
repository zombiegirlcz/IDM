package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import afj.y0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$InputData;
import dli.c;
import efm.r;
import jii.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkd.g;
import pij.b1;
import pij.d;
import pij.d0;
import pij.e;
import pij.j;
import pij.l;
import pij.m;
import pij.n;
import pij.p;
import pij.t;
import pij.u;
import pij.y;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$OutputData;", "Ldli/a;", "Lpij/d0;", "Lmkd/g;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimSubscriptionsScreen extends ViewController<EsimSubscriptionsScreenContract$OutputData> implements dli.a, g {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101021d0 = {o0.f186429a.j(new h0(EsimSubscriptionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final EsimSubscriptionsScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final EsimDelegate R;
    public final EsimDetailsDelegate S;
    public final TextDelegate T;
    public final CellDetailsDelegate U;
    public final CellDetailsChevronDelegate V;
    public final LargeActionButtonDelegate W;
    public final FullScreenStateDelegate X;
    public final ActionWidgetDelegate Y;
    public final SmallActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f101022a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ScrollerDelegate f101023b0;
    public final Object c0;

    public EsimSubscriptionsScreen(EsimSubscriptionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        final int i = 1;
        this.M = true;
        this.N = s.t(this, e.f);
        final int i2 = 0;
        this.O = w.y0(new Function0(this) { // from class: pij.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSubscriptionsScreen f236532b;

            {
                this.f236532b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EsimSubscriptionsScreen esimSubscriptionsScreen = this.f236532b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSubscriptionsScreen.f101021d0;
                        EsimSubscriptionsScreen esimSubscriptionsScreen2 = this.f236532b;
                        qji.b bVarU2 = esimSubscriptionsScreen2.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.di.EsimSubscriptionsScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        afj.b bVar = mVar.f4337b;
                        afj.m mVar2 = mVar.f4338c;
                        EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData = esimSubscriptionsScreen2.K;
                        esimSubscriptionsScreenContract$InputData.getClass();
                        return new afj.y0(bVar, mVar2, esimSubscriptionsScreen2, esimSubscriptionsScreenContract$InputData, esimSubscriptionsScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimSubscriptionsScreen.f101021d0;
                        return (y) ((afj.y0) esimSubscriptionsScreen.O.getValue()).f4537p.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EsimSubscriptionsScreen.f101021d0;
                        return (j60.a) ((afj.y0) esimSubscriptionsScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = EsimSubscriptionsScreen.f101021d0;
                        EsimSubscriptionsScreen esimSubscriptionsScreen3 = this.f236532b;
                        return dli.f.a(esimSubscriptionsScreen3, esimSubscriptionsScreen3.R2(), zhm.v.k(esimSubscriptionsScreen3.R, esimSubscriptionsScreen3.S, new EsimLoadingDelegate(), esimSubscriptionsScreen3.X, esimSubscriptionsScreen3.Y, esimSubscriptionsScreen3.f101023b0, esimSubscriptionsScreen3.V, esimSubscriptionsScreen3.Z), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new Function0(this) { // from class: pij.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSubscriptionsScreen f236532b;

            {
                this.f236532b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                EsimSubscriptionsScreen esimSubscriptionsScreen = this.f236532b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSubscriptionsScreen.f101021d0;
                        EsimSubscriptionsScreen esimSubscriptionsScreen2 = this.f236532b;
                        qji.b bVarU2 = esimSubscriptionsScreen2.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.di.EsimSubscriptionsScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        afj.b bVar = mVar.f4337b;
                        afj.m mVar2 = mVar.f4338c;
                        EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData = esimSubscriptionsScreen2.K;
                        esimSubscriptionsScreenContract$InputData.getClass();
                        return new afj.y0(bVar, mVar2, esimSubscriptionsScreen2, esimSubscriptionsScreenContract$InputData, esimSubscriptionsScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimSubscriptionsScreen.f101021d0;
                        return (y) ((afj.y0) esimSubscriptionsScreen.O.getValue()).f4537p.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EsimSubscriptionsScreen.f101021d0;
                        return (j60.a) ((afj.y0) esimSubscriptionsScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = EsimSubscriptionsScreen.f101021d0;
                        EsimSubscriptionsScreen esimSubscriptionsScreen3 = this.f236532b;
                        return dli.f.a(esimSubscriptionsScreen3, esimSubscriptionsScreen3.R2(), zhm.v.k(esimSubscriptionsScreen3.R, esimSubscriptionsScreen3.S, new EsimLoadingDelegate(), esimSubscriptionsScreen3.X, esimSubscriptionsScreen3.Y, esimSubscriptionsScreen3.f101023b0, esimSubscriptionsScreen3.V, esimSubscriptionsScreen3.Z), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: pij.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSubscriptionsScreen f236532b;

            {
                this.f236532b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                EsimSubscriptionsScreen esimSubscriptionsScreen = this.f236532b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSubscriptionsScreen.f101021d0;
                        EsimSubscriptionsScreen esimSubscriptionsScreen2 = this.f236532b;
                        qji.b bVarU2 = esimSubscriptionsScreen2.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.di.EsimSubscriptionsScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        afj.b bVar = mVar.f4337b;
                        afj.m mVar2 = mVar.f4338c;
                        EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData = esimSubscriptionsScreen2.K;
                        esimSubscriptionsScreenContract$InputData.getClass();
                        return new afj.y0(bVar, mVar2, esimSubscriptionsScreen2, esimSubscriptionsScreenContract$InputData, esimSubscriptionsScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimSubscriptionsScreen.f101021d0;
                        return (y) ((afj.y0) esimSubscriptionsScreen.O.getValue()).f4537p.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EsimSubscriptionsScreen.f101021d0;
                        return (j60.a) ((afj.y0) esimSubscriptionsScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = EsimSubscriptionsScreen.f101021d0;
                        EsimSubscriptionsScreen esimSubscriptionsScreen3 = this.f236532b;
                        return dli.f.a(esimSubscriptionsScreen3, esimSubscriptionsScreen3.R2(), zhm.v.k(esimSubscriptionsScreen3.R, esimSubscriptionsScreen3.S, new EsimLoadingDelegate(), esimSubscriptionsScreen3.X, esimSubscriptionsScreen3.Y, esimSubscriptionsScreen3.f101023b0, esimSubscriptionsScreen3.V, esimSubscriptionsScreen3.Z), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new EsimDelegate();
        this.S = new EsimDetailsDelegate();
        this.T = new TextDelegate();
        this.U = new CellDetailsDelegate();
        this.V = new CellDetailsChevronDelegate();
        this.W = new LargeActionButtonDelegate();
        this.X = new FullScreenStateDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.Y = actionWidgetDelegate;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        this.Z = new SmallActionButtonDelegate();
        this.f101023b0 = new ScrollerDelegate(v.k(actionWidgetDelegate, heroBannerDelegate), false);
        final int i5 = 3;
        this.c0 = w.y0(new Function0(this) { // from class: pij.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSubscriptionsScreen f236532b;

            {
                this.f236532b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                EsimSubscriptionsScreen esimSubscriptionsScreen = this.f236532b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSubscriptionsScreen.f101021d0;
                        EsimSubscriptionsScreen esimSubscriptionsScreen2 = this.f236532b;
                        qji.b bVarU2 = esimSubscriptionsScreen2.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.di.EsimSubscriptionsScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        afj.b bVar = mVar.f4337b;
                        afj.m mVar2 = mVar.f4338c;
                        EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData = esimSubscriptionsScreen2.K;
                        esimSubscriptionsScreenContract$InputData.getClass();
                        return new afj.y0(bVar, mVar2, esimSubscriptionsScreen2, esimSubscriptionsScreenContract$InputData, esimSubscriptionsScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimSubscriptionsScreen.f101021d0;
                        return (y) ((afj.y0) esimSubscriptionsScreen.O.getValue()).f4537p.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EsimSubscriptionsScreen.f101021d0;
                        return (j60.a) ((afj.y0) esimSubscriptionsScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = EsimSubscriptionsScreen.f101021d0;
                        EsimSubscriptionsScreen esimSubscriptionsScreen3 = this.f236532b;
                        return dli.f.a(esimSubscriptionsScreen3, esimSubscriptionsScreen3.R2(), zhm.v.k(esimSubscriptionsScreen3.R, esimSubscriptionsScreen3.S, new EsimLoadingDelegate(), esimSubscriptionsScreen3.X, esimSubscriptionsScreen3.Y, esimSubscriptionsScreen3.f101023b0, esimSubscriptionsScreen3.V, esimSubscriptionsScreen3.Z), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d0 uiState = (d0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        k kVarD3 = d3();
        i iVar = uiState.d;
        TextLocalisedClause textLocalisedClause = uiState.f236538c;
        Continuation continuation = null;
        if (iVar != null) {
            kVarD3.f174533b.setModel(iVar);
            if (uiState.e && !this.f101022a0) {
                this.f101022a0 = true;
                ActionFooterView actionFooterView = kVarD3.f174533b;
                i iVar2 = actionFooterView.f58953b;
                if ((iVar2 instanceof aw0.e) || (iVar2 instanceof aw0.h)) {
                    TwinVerticalButton twinVerticalButton = actionFooterView.twinVerticalButton;
                    if (twinVerticalButton != null) {
                        twinVerticalButton.q0();
                    }
                } else if (iVar2 instanceof aw0.g) {
                    TwinHorizontalButton twinHorizontalButton = actionFooterView.twinHorizontalButton;
                    if (twinHorizontalButton != null) {
                        twinHorizontalButton.f();
                    }
                } else if (iVar2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVar = (b) R2();
                bVar.getClass();
                bVar.l2(new b1(bVar, continuation, 2), new yi5.b(26));
            }
        }
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = kVarD3.f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(iVar != null ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = kVarD3.f174534c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setMenuItems(uiState.f236537b);
    }

    @Override // mkd.g
    public final r F1() {
        return this.f101023b0.i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.Q.getValue()).d(v.k(this.T, this.U, this.W));
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 0;
        int i2 = 3;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new m(this, continuation, i), 3);
        int i3 = 2;
        r rVarFilter = d3().f174534c.o.f57403b.filter(new phc.b(17, new d(2)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new m(this, continuation, i2), 3);
        int i5 = 1;
        ViewController.P2(this, vkm.q.J(rd0.e.b(d3().f174533b.f), rd0.e.b(d3().f174533b.f58955g)), new pij.k(this, continuation, 8), 3);
        EsimDelegate esimDelegate = this.R;
        ViewController.P2(this, new p73.d(rd0.e.b(esimDelegate.d), 7), new pij.s(this, null), 3);
        ViewController.P2(this, new p73.d(rd0.e.b(esimDelegate.e), 8), new t(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.e), new u(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.f51821c), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d), new pij.k(this, continuation, i), 3);
        ViewController.P2(this, new p73.d(rd0.e.b(this.W.d.f121375b), 9), new l(this, null), 3);
        ActionWidgetDelegate actionWidgetDelegate = this.Y;
        r map = actionWidgetDelegate.f51589c.f121375b.filter(new phc.b(21, new phc.e(27))).map(new phc.b(22, new phc.e(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new pij.k(this, continuation, i5), 3);
        e01.a aVar = actionWidgetDelegate.f51589c;
        r rVarFilter2 = aVar.f121375b.filter(new phc.b(23, new phc.e(29)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarFilter2, new d(0))), new pij.k(this, continuation, i3), 3);
        r rVarFilter3 = aVar.f121375b.filter(new phc.b(24, new d(1)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarFilter3, new d(3))), new pij.k(this, continuation, i2), 3);
        r rVarFilter4 = aVar.f121375b.filter(new phc.b(25, new d(4))).filter(new phc.b(15, new d(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarFilter4, new phc.e(22))), new pij.k(this, continuation, 4), 3);
        r rVarFilter5 = aVar.f121375b.filter(new phc.b(16, new phc.e(23)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter5, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter5), null, new m(this, continuation, i5), 3);
        r rVarFilter6 = aVar.f121375b.filter(new phc.b(18, new phc.e(24)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter6, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter6), new m(this, continuation, i3), 3);
        r map2 = aVar.f121375b.filter(new phc.b(19, new phc.e(25))).map(new phc.b(20, new phc.e(26)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        ViewController.P2(this, rd0.e.b(map2), new pij.k(this, continuation, 5), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.X;
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), new n(this, null), 3);
        ViewController.P2(this, new p73.d(rd0.e.b(aVar.f121375b), 10), new pij.o(this, null), 3);
        EsimDetailsDelegate esimDetailsDelegate = this.S;
        ViewController.P2(this, rd0.e.b(esimDetailsDelegate.e), new p(this, null), 3);
        ViewController.P2(this, rd0.e.b(esimDetailsDelegate.d), new pij.q(this, null), 3);
        ViewController.P2(this, rd0.e.b(esimDetailsDelegate.f), new pij.k(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(this.Z.f53336c.f121375b), new pij.r(this, null), 3);
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.d), new pij.k(this, continuation, 7), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, f101021d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final y R2() {
        return (y) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((c) this.c0.getValue()).w().f;
    }
}
