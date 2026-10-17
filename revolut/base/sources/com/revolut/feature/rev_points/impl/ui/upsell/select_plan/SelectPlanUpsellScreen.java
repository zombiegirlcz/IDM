package com.revolut.feature.rev_points.impl.ui.upsell.select_plan;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.upsell.select_plan.SelectPlanUpsellScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import e1c.f;
import e1c.g;
import e1c.l;
import e1c.m;
import e1c.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;
import zxb.e0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/upsell/select_plan/SelectPlanUpsellScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le1c/m;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectPlanUpsellScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SelectPlanUpsellScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenSelectPlanUpsellBinding;", 0))};
    public final Object N;
    public final Object P;
    public final Object Q;
    public final int K = R$layout.screen_select_plan_upsell;
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, wxb.q.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/impl/databinding/ScreenSelectPlanUpsellBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.selectPlanUpsellScreen_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                int i2 = R$id.selectPlanUpsellScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i2);
                if (navBarWithToolbar != null) {
                    i2 = R$id.selectPlanUpsellScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                        return new wxb.q(largeActionButton, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
                i = i2;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public SelectPlanUpsellScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: e1c.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectPlanUpsellScreen f121949b;

            {
                this.f121949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectPlanUpsellScreen selectPlanUpsellScreen = this.f121949b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectPlanUpsellScreen.R;
                        SelectPlanUpsellScreen selectPlanUpsellScreen2 = this.f121949b;
                        return dli.f.a(selectPlanUpsellScreen2, (l) selectPlanUpsellScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), selectPlanUpsellScreen2.M, selectPlanUpsellScreen2.L), R$id.selectPlanUpsellScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectPlanUpsellScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(selectPlanUpsellScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new e0(((zxb.e) aVar2.b()).V);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SelectPlanUpsellScreen.R;
                        return (l) ((e0) selectPlanUpsellScreen.P.getValue()).f326140c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e1c.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectPlanUpsellScreen f121949b;

            {
                this.f121949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectPlanUpsellScreen selectPlanUpsellScreen = this.f121949b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectPlanUpsellScreen.R;
                        SelectPlanUpsellScreen selectPlanUpsellScreen2 = this.f121949b;
                        return dli.f.a(selectPlanUpsellScreen2, (l) selectPlanUpsellScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), selectPlanUpsellScreen2.M, selectPlanUpsellScreen2.L), R$id.selectPlanUpsellScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectPlanUpsellScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(selectPlanUpsellScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new e0(((zxb.e) aVar2.b()).V);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SelectPlanUpsellScreen.R;
                        return (l) ((e0) selectPlanUpsellScreen.P.getValue()).f326140c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: e1c.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectPlanUpsellScreen f121949b;

            {
                this.f121949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectPlanUpsellScreen selectPlanUpsellScreen = this.f121949b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectPlanUpsellScreen.R;
                        SelectPlanUpsellScreen selectPlanUpsellScreen2 = this.f121949b;
                        return dli.f.a(selectPlanUpsellScreen2, (l) selectPlanUpsellScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), selectPlanUpsellScreen2.M, selectPlanUpsellScreen2.L), R$id.selectPlanUpsellScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectPlanUpsellScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(selectPlanUpsellScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new e0(((zxb.e) aVar2.b()).V);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SelectPlanUpsellScreen.R;
                        return (l) ((e0) selectPlanUpsellScreen.P.getValue()).f326140c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f300849b.setEnabled(uiState.f121956b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (l) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f300850c;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, new TextLocalisedClause(R$string.rev_points_upsell_select_plan_title, null, null, 14), new TextLocalisedClause(R$string.rev_points_upsell_select_plan_subtitle, null, null, 14), null, 4, null);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.rev_points_upsell_select_plan_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.rev_points_upsell_select_plan_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f300849b;
        largeActionButton.setText(new TextLocalisedClause(R$string.rev_points_upsell_select_plan_button_title, null, null, 14));
        n.Companion.getClass();
        largeActionButton.setLoadingButtonTag("CTA_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f300850c.f59410q), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f300849b.o), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new e1c.h(this, null), 3);
    }

    public final wxb.q d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wxb.q) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
