package com.revolut.feature.wealth.impl.ui.screens.popularassets;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsController;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rbj.g;
import rch.b;
import rch.d;
import rch.k;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/popularassets/PopularAssetsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PopularAssetsController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PopularAssetsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PopularAssetsControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final TextDelegate Q;
    public final SmallActionButtonDelegate R;
    public final LargeActionButtonDelegate S;
    public final SwipeToActionDelegate T;
    public final Object U;
    public final j V;

    public PopularAssetsController(PopularAssetsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: rch.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PopularAssetsController f253269b;

            {
                this.f253269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PopularAssetsController popularAssetsController = this.f253269b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PopularAssetsController.W;
                        phm.a aVar = (phm.a) ue0.e.j(popularAssetsController.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        PopularAssetsControllerContract$InputData popularAssetsControllerContract$InputData = popularAssetsController.K;
                        o5d.b bVar = new o5d.b(popularAssetsController.T);
                        avk.j jVar = popularAssetsController.V;
                        popularAssetsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new z9h.h(dVar, popularAssetsControllerContract$InputData, bVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PopularAssetsController.W;
                        return (d) ((z9h.h) ((sch.a) popularAssetsController.N.getValue())).f320436l.get();
                    default:
                        KProperty[] kPropertyArr3 = PopularAssetsController.W;
                        PopularAssetsController popularAssetsController2 = this.f253269b;
                        return tki.g.a(popularAssetsController2, (d) popularAssetsController2.O.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), popularAssetsController2.S, popularAssetsController2.P, popularAssetsController2.R, popularAssetsController2.Q, popularAssetsController2.T), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: rch.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PopularAssetsController f253269b;

            {
                this.f253269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PopularAssetsController popularAssetsController = this.f253269b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PopularAssetsController.W;
                        phm.a aVar = (phm.a) ue0.e.j(popularAssetsController.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        PopularAssetsControllerContract$InputData popularAssetsControllerContract$InputData = popularAssetsController.K;
                        o5d.b bVar = new o5d.b(popularAssetsController.T);
                        avk.j jVar = popularAssetsController.V;
                        popularAssetsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new z9h.h(dVar, popularAssetsControllerContract$InputData, bVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PopularAssetsController.W;
                        return (d) ((z9h.h) ((sch.a) popularAssetsController.N.getValue())).f320436l.get();
                    default:
                        KProperty[] kPropertyArr3 = PopularAssetsController.W;
                        PopularAssetsController popularAssetsController2 = this.f253269b;
                        return tki.g.a(popularAssetsController2, (d) popularAssetsController2.O.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), popularAssetsController2.S, popularAssetsController2.P, popularAssetsController2.R, popularAssetsController2.Q, popularAssetsController2.T), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new TextDelegate();
        this.R = new SmallActionButtonDelegate();
        this.S = new LargeActionButtonDelegate();
        this.T = new SwipeToActionDelegate(rowDelegate, false);
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: rch.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PopularAssetsController f253269b;

            {
                this.f253269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PopularAssetsController popularAssetsController = this.f253269b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PopularAssetsController.W;
                        phm.a aVar = (phm.a) ue0.e.j(popularAssetsController.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        PopularAssetsControllerContract$InputData popularAssetsControllerContract$InputData = popularAssetsController.K;
                        o5d.b bVar = new o5d.b(popularAssetsController.T);
                        avk.j jVar = popularAssetsController.V;
                        popularAssetsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new z9h.h(dVar, popularAssetsControllerContract$InputData, bVar, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PopularAssetsController.W;
                        return (d) ((z9h.h) ((sch.a) popularAssetsController.N.getValue())).f320436l.get();
                    default:
                        KProperty[] kPropertyArr3 = PopularAssetsController.W;
                        PopularAssetsController popularAssetsController2 = this.f253269b;
                        return tki.g.a(popularAssetsController2, (d) popularAssetsController2.O.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), popularAssetsController2.S, popularAssetsController2.P, popularAssetsController2.R, popularAssetsController2.Q, popularAssetsController2.T), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.V = new j(this, 24);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f253278a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f253279b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (sch.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new r0e.c(this, null, 20), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new rch.c(this, null, 0), 3);
        r rVarMerge = r.merge(w.a0(this.P.f53218h, new g(7)), w.a0(this.Q.d, new g(8)), w.a0(this.S.d.f121375b, new g(9)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new rch.c(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
