package com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.ScreenerMetaCollectionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cqh.d;
import cqh.f;
import cqh.h;
import cqh.i;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tki.c;
import uqh.r;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/meta_collection/ScreenerMetaCollectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lcqh/i;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerMetaCollectionScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ScreenerMetaCollectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final ao.h L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final SmallActionButtonDelegate O;
    public final ListSubheaderDelegate P;
    public final ActionsDelegate Q;
    public final TextDelegate R;
    public final SwipeToActionDelegate S;
    public final Object T;
    public final int U;
    public final Object V;
    public final Object W;

    public ScreenerMetaCollectionScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, d.f);
        this.M = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new SmallActionButtonDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new ActionsDelegate();
        this.R = new TextDelegate();
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: cqh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerMetaCollectionScreen f108104b;

            {
                this.f108104b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerMetaCollectionScreen screenerMetaCollectionScreen = this.f108104b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerMetaCollectionScreen.X;
                        return (f) ((joh.q) ((dqh.a) screenerMetaCollectionScreen.W.getValue())).f177051r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerMetaCollectionScreen.X;
                        ScreenerMetaCollectionScreen screenerMetaCollectionScreen2 = this.f108104b;
                        return tki.g.a(screenerMetaCollectionScreen2, (f) screenerMetaCollectionScreen2.T.getValue(), v.k(screenerMetaCollectionScreen2.M, screenerMetaCollectionScreen2.N, screenerMetaCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerMetaCollectionScreen2.P, screenerMetaCollectionScreen2.Q, screenerMetaCollectionScreen2.R, screenerMetaCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerMetaCollectionScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(screenerMetaCollectionScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        h hVar = screenerMetaCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerMetaCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, screenerMetaCollectionScreen.P, screenerMetaCollectionScreen.N, screenerMetaCollectionScreen.M, screenerMetaCollectionScreen.O, screenerMetaCollectionScreen.Q, screenerMetaCollectionScreen.R);
                        o5d.b bVar = new o5d.b(screenerMetaCollectionScreen.S);
                        hVar.getClass();
                        return new joh.q(wVar, hVar, rVar, bVar);
                }
            }
        });
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: cqh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerMetaCollectionScreen f108104b;

            {
                this.f108104b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerMetaCollectionScreen screenerMetaCollectionScreen = this.f108104b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerMetaCollectionScreen.X;
                        return (f) ((joh.q) ((dqh.a) screenerMetaCollectionScreen.W.getValue())).f177051r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerMetaCollectionScreen.X;
                        ScreenerMetaCollectionScreen screenerMetaCollectionScreen2 = this.f108104b;
                        return tki.g.a(screenerMetaCollectionScreen2, (f) screenerMetaCollectionScreen2.T.getValue(), v.k(screenerMetaCollectionScreen2.M, screenerMetaCollectionScreen2.N, screenerMetaCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerMetaCollectionScreen2.P, screenerMetaCollectionScreen2.Q, screenerMetaCollectionScreen2.R, screenerMetaCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerMetaCollectionScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(screenerMetaCollectionScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        h hVar = screenerMetaCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerMetaCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, screenerMetaCollectionScreen.P, screenerMetaCollectionScreen.N, screenerMetaCollectionScreen.M, screenerMetaCollectionScreen.O, screenerMetaCollectionScreen.Q, screenerMetaCollectionScreen.R);
                        o5d.b bVar = new o5d.b(screenerMetaCollectionScreen.S);
                        hVar.getClass();
                        return new joh.q(wVar, hVar, rVar, bVar);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: cqh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerMetaCollectionScreen f108104b;

            {
                this.f108104b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerMetaCollectionScreen screenerMetaCollectionScreen = this.f108104b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerMetaCollectionScreen.X;
                        return (f) ((joh.q) ((dqh.a) screenerMetaCollectionScreen.W.getValue())).f177051r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerMetaCollectionScreen.X;
                        ScreenerMetaCollectionScreen screenerMetaCollectionScreen2 = this.f108104b;
                        return tki.g.a(screenerMetaCollectionScreen2, (f) screenerMetaCollectionScreen2.T.getValue(), v.k(screenerMetaCollectionScreen2.M, screenerMetaCollectionScreen2.N, screenerMetaCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerMetaCollectionScreen2.P, screenerMetaCollectionScreen2.Q, screenerMetaCollectionScreen2.R, screenerMetaCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerMetaCollectionScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(screenerMetaCollectionScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        h hVar = screenerMetaCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerMetaCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, screenerMetaCollectionScreen.P, screenerMetaCollectionScreen.N, screenerMetaCollectionScreen.M, screenerMetaCollectionScreen.O, screenerMetaCollectionScreen.Q, screenerMetaCollectionScreen.R);
                        o5d.b bVar = new o5d.b(screenerMetaCollectionScreen.S);
                        hVar.getClass();
                        return new joh.q(wVar, hVar, rVar, bVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f108110b, null);
        d3().f174565c.setToolbarTitle(uiState.f108110b);
        d3().f174565c.setSecondDescriptionText(uiState.f108111c);
        d3().f174565c.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dqh.a) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new co7.c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51611c.f121375b), new cqh.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}
