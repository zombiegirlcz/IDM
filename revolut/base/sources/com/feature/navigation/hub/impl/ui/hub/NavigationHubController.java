package com.feature.navigation.hub.impl.ui.hub;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.feature.navigation.hub.impl.ui.hub.NavigationHubController;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ma.b;
import ma.c;
import ma.d;
import ma.f;
import ma.k;
import ma.l;
import ma.m;
import ma.n;
import ma.u;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/feature/navigation/hub/impl/ui/hub/NavigationHubController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lma/k;", "Ldli/a;", "Lma/n;", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavigationHubController extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(NavigationHubController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final Object K;
    public final int L;
    public final h M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final Object Q;

    public NavigationHubController(NavigationHubControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: ma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavigationHubController f203842b;

            {
                this.f203842b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = NavigationHubController.R;
                        return (u) ((ga.b) this.f203842b.N.getValue()).f141964c.get();
                    default:
                        KProperty[] kPropertyArr2 = NavigationHubController.R;
                        NavigationHubController navigationHubController = this.f203842b;
                        return dli.f.a(navigationHubController, navigationHubController.R2(), v.k(navigationHubController.O, navigationHubController.P, new ListSubheaderDelegate(), new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.L = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new ltf.b(this, inputData, 25));
        this.O = new FullScreenStateDelegate();
        this.P = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavigationHubController f203842b;

            {
                this.f203842b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NavigationHubController.R;
                        return (u) ((ga.b) this.f203842b.N.getValue()).f141964c.get();
                    default:
                        KProperty[] kPropertyArr2 = NavigationHubController.R;
                        NavigationHubController navigationHubController = this.f203842b;
                        return dli.f.a(navigationHubController, navigationHubController.R2(), v.k(navigationHubController.O, navigationHubController.P, new ListSubheaderDelegate(), new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        m mVar = uiState.f203852b;
        l lVar = uiState.f203853c;
        navBarWithToolbar.setTitle(new TextClause(mVar.f203849a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setToolbarTitle(new TextClause(mVar.f203849a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        if (mVar.f203850b != null) {
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(new TextClause(mVar.f203850b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        } else {
            navBarWithToolbar.setSecondDescriptionVisible(false);
        }
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        if (lVar == null) {
            collapsingActionButton.setVisibility(8);
            return;
        }
        collapsingActionButton.setVisibility(0);
        collapsingActionButton.setLargeButtonText(lVar.f203847a);
        collapsingActionButton.setLargeButtonEnabled(lVar.f203848b);
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ga.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(collapsingActionButton.d()), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(collapsingActionButton.c()), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new ma.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new f(this, null), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final u R2() {
        return (u) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
