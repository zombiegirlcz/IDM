package com.revolut.feature.store.impl.ui.brand_filters;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.impl.R$id;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.brand_filters.StoreBrandsFiltersScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import h2e.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vrl.d;
import w2e.b;
import w2e.c;
import w2e.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/store/impl/ui/brand_filters/StoreBrandsFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lw2e/c;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreBrandsFiltersScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(StoreBrandsFiltersScreen.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/ScreenStoreBrandsFiltersBinding;", 0))};
    public final SelectableDelegate K = new SelectableDelegate(new RowDelegate(null, null, 7));
    public final ListSubheaderDelegate L = new ListSubheaderDelegate();
    public final RowLoadingDelegate M = new RowLoadingDelegate();
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final int O = R$layout.screen_store_brands_filters;
    public final h P = s.t(this, a.f);
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/store/impl/databinding/ScreenStoreBrandsFiltersBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.storeBrandsFilters_applyButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.storeBrandsFilters_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.storeBrandsFilters_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new f(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public StoreBrandsFiltersScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: w2e.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandsFiltersScreen f294032b;

            {
                this.f294032b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreBrandsFiltersScreen storeBrandsFiltersScreen = this.f294032b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandsFiltersScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandsFiltersScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        k2e.h hVar = new k2e.h();
                        hVar.f180507a = e4m.b.b(new k2e.g(jVar, 0));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandsFiltersScreen.T;
                        return (b) ((k2e.h) storeBrandsFiltersScreen.Q.getValue()).f180507a.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandsFiltersScreen.T;
                        StoreBrandsFiltersScreen storeBrandsFiltersScreen2 = this.f294032b;
                        return dli.f.a(storeBrandsFiltersScreen2, storeBrandsFiltersScreen2.d(), v.k(storeBrandsFiltersScreen2.L, storeBrandsFiltersScreen2.K, storeBrandsFiltersScreen2.M, storeBrandsFiltersScreen2.N), R$id.storeBrandsFilters_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: w2e.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandsFiltersScreen f294032b;

            {
                this.f294032b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreBrandsFiltersScreen storeBrandsFiltersScreen = this.f294032b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandsFiltersScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandsFiltersScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        k2e.h hVar = new k2e.h();
                        hVar.f180507a = e4m.b.b(new k2e.g(jVar, 0));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandsFiltersScreen.T;
                        return (b) ((k2e.h) storeBrandsFiltersScreen.Q.getValue()).f180507a.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandsFiltersScreen.T;
                        StoreBrandsFiltersScreen storeBrandsFiltersScreen2 = this.f294032b;
                        return dli.f.a(storeBrandsFiltersScreen2, storeBrandsFiltersScreen2.d(), v.k(storeBrandsFiltersScreen2.L, storeBrandsFiltersScreen2.K, storeBrandsFiltersScreen2.M, storeBrandsFiltersScreen2.N), R$id.storeBrandsFilters_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: w2e.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandsFiltersScreen f294032b;

            {
                this.f294032b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreBrandsFiltersScreen storeBrandsFiltersScreen = this.f294032b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandsFiltersScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandsFiltersScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        k2e.h hVar = new k2e.h();
                        hVar.f180507a = e4m.b.b(new k2e.g(jVar, 0));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandsFiltersScreen.T;
                        return (b) ((k2e.h) storeBrandsFiltersScreen.Q.getValue()).f180507a.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandsFiltersScreen.T;
                        StoreBrandsFiltersScreen storeBrandsFiltersScreen2 = this.f294032b;
                        return dli.f.a(storeBrandsFiltersScreen2, storeBrandsFiltersScreen2.d(), v.k(storeBrandsFiltersScreen2.L, storeBrandsFiltersScreen2.K, storeBrandsFiltersScreen2.M, storeBrandsFiltersScreen2.N), R$id.storeBrandsFilters_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f148808c.setMenuItems(uiState.f294029b);
        d3().f148807b.setEnabled(uiState.f294030c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k2e.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f148808c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.store_home_brands_filters_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.store_home_brands_filters_screen_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f148807b.setText(new TextLocalisedClause(R$string.store_home_brands_filters_screen_action_apply, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f148808c.f59410q), null, new w2e.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f148808c.o.f57403b), null, new d(this, null, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.r()), null, new w2e.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f148807b.o), null, new w2e.e(this, null, 1), 3);
    }

    public final f d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b d() {
        return (b) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
