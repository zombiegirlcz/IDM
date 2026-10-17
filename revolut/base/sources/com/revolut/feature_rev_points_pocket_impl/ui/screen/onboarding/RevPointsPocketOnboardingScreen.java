package com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_rev_points_pocket_impl.R$id;
import com.revolut.feature_rev_points_pocket_impl.R$layout;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import dli.a;
import efm.r;
import jdi.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wrj.m;
import x9h.d;
import xdi.b;
import xdi.c;
import xdi.f;
import xdi.l;
import xdi.n;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/onboarding/RevPointsPocketOnboardingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxdi/l;", "Ldli/a;", "Lxdi/n;", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsPocketOnboardingScreen extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RevPointsPocketOnboardingScreen.class, "binding", "getBinding()Lcom/revolut/feature_rev_points_pocket_impl/databinding/ScreenRevPointsPocketOnboardingBinding;", 0))};
    public final h K;
    public final LargeSliderDelegate L;
    public final RowDelegate M;
    public final TextDelegate N;
    public final FullScreenStateDelegate O;
    public final CellDetailsDelegate P;
    public final LargeActionButtonDelegate Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;

    public RevPointsPocketOnboardingScreen(RevPointsPocketOnboardingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new LargeSliderDelegate();
        this.M = new RowDelegate(null, null, 7);
        this.N = new TextDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new CellDetailsDelegate();
        this.Q = new LargeActionButtonDelegate();
        this.R = R$layout.screen_rev_points_pocket_onboarding;
        this.S = w.y0(new m(this, inputData, 27));
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: xdi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPocketOnboardingScreen f304449b;

            {
                this.f304449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPocketOnboardingScreen.V;
                        jdi.j jVar = (jdi.j) this.f304449b.S.getValue();
                        switch (jVar.f173104a) {
                            case 0:
                                return (m) jVar.f173108h.get();
                            default:
                                return (m) jVar.f173108h.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = RevPointsPocketOnboardingScreen.V;
                        RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen = this.f304449b;
                        return dli.f.a(revPointsPocketOnboardingScreen, revPointsPocketOnboardingScreen.d(), zhm.v.k(revPointsPocketOnboardingScreen.L, revPointsPocketOnboardingScreen.M, revPointsPocketOnboardingScreen.N, revPointsPocketOnboardingScreen.O, new LargeSliderLoadingDelegate(), new RowLoadingDelegate(), new PlainTextLoadingDelegate(), new ListSubheaderDelegate()), R$id.revPointsPocketOnboarding_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: xdi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPocketOnboardingScreen f304449b;

            {
                this.f304449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPocketOnboardingScreen.V;
                        jdi.j jVar = (jdi.j) this.f304449b.S.getValue();
                        switch (jVar.f173104a) {
                            case 0:
                                return (m) jVar.f173108h.get();
                            default:
                                return (m) jVar.f173108h.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = RevPointsPocketOnboardingScreen.V;
                        RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen = this.f304449b;
                        return dli.f.a(revPointsPocketOnboardingScreen, revPointsPocketOnboardingScreen.d(), zhm.v.k(revPointsPocketOnboardingScreen.L, revPointsPocketOnboardingScreen.M, revPointsPocketOnboardingScreen.N, revPointsPocketOnboardingScreen.O, new LargeSliderLoadingDelegate(), new RowLoadingDelegate(), new PlainTextLoadingDelegate(), new ListSubheaderDelegate()), R$id.revPointsPocketOnboarding_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton largeActionButton = d3().e;
        xdi.h hVar = uiState.f304462b;
        largeActionButton.setText(hVar.f304454a);
        largeActionButton.setEnabled(hVar.f304455b);
        ObjectCarouselNavBarContentView objectCarouselNavBarContentView = d3().f143186b;
        ObjectCarouselNavBarContentView.c cVar = uiState.f304463c;
        objectCarouselNavBarContentView.setVisibility(cVar != null ? 0 : 8);
        if (cVar != null) {
            objectCarouselNavBarContentView.setModel(cVar);
        }
        d3().d.setMenuItems(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        j jVar = (j) this.S.getValue();
        switch (jVar.f173104a) {
            case 0:
                aVar = (j60.a) jVar.e.get();
                break;
            default:
                aVar = (j60.a) jVar.e.get();
                break;
        }
        aVar.d(v.k(this.P, this.Q));
        NavBarWithContainer navBarWithContainer = d3().d;
        navBarWithContainer.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithContainer.M();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.b()), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.K()), null, new c(this, continuation, 1), 3);
        r rVarFilter = this.L.f52627c.filter(new d(24, new xd2.n(3)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new xdi.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d), null, new xdi.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new xdi.e(this, null), 3);
        r rVarHide = d3().f143186b.f59423a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarHide), null, new xdi.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d.f121375b), null, new f(this, null), 3);
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f143187c;
        controllerContainerCoordinatorLayout.removeView(d3().e);
        controllerContainerCoordinatorLayout.addView(d3().e);
    }

    public final gdi.b d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gdi.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final xdi.m d() {
        return (xdi.m) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
