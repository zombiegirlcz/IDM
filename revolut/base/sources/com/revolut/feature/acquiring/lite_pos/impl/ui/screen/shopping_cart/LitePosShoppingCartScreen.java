package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.LitePosShoppingCartScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import df1.d;
import df1.f;
import df1.g;
import df1.k;
import df1.l;
import jd1.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/LitePosShoppingCartScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/a;", "Ldli/a;", "Ldf1/l;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LitePosShoppingCartScreen extends ViewController<com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.a> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(LitePosShoppingCartScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenShoppingCartBinding;", 0))};
    public final int K = R$layout.screen_shopping_cart;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final SwipeToActionDelegate P;
    public final ListSubheaderDelegate Q;
    public final CellDetailsDelegate R;
    public final FullScreenStateDelegate S;
    public final Object T;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenShoppingCartBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.shoppingCartScreen_cta_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.shoppingCartScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.shoppingCartScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new n(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public LitePosShoppingCartScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: df1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LitePosShoppingCartScreen f113750b;

            {
                this.f113750b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LitePosShoppingCartScreen litePosShoppingCartScreen = this.f113750b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LitePosShoppingCartScreen.U;
                        qji.b bVarU2 = litePosShoppingCartScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.di.ShoppingCartScreenInjector");
                        ld1.w wVar = (ld1.w) bVarU2;
                        return new ld1.o(wVar.f194006a, wVar.f194007b, litePosShoppingCartScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = LitePosShoppingCartScreen.U;
                        return (k) ((ld1.o) litePosShoppingCartScreen.M.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = LitePosShoppingCartScreen.U;
                        LitePosShoppingCartScreen litePosShoppingCartScreen2 = this.f113750b;
                        return dli.f.a(litePosShoppingCartScreen2, litePosShoppingCartScreen2.R2(), v.k(litePosShoppingCartScreen2.O, litePosShoppingCartScreen2.P, litePosShoppingCartScreen2.Q, litePosShoppingCartScreen2.R, litePosShoppingCartScreen2.S), R$id.shoppingCartScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: df1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LitePosShoppingCartScreen f113750b;

            {
                this.f113750b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LitePosShoppingCartScreen litePosShoppingCartScreen = this.f113750b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LitePosShoppingCartScreen.U;
                        qji.b bVarU2 = litePosShoppingCartScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.di.ShoppingCartScreenInjector");
                        ld1.w wVar = (ld1.w) bVarU2;
                        return new ld1.o(wVar.f194006a, wVar.f194007b, litePosShoppingCartScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = LitePosShoppingCartScreen.U;
                        return (k) ((ld1.o) litePosShoppingCartScreen.M.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = LitePosShoppingCartScreen.U;
                        LitePosShoppingCartScreen litePosShoppingCartScreen2 = this.f113750b;
                        return dli.f.a(litePosShoppingCartScreen2, litePosShoppingCartScreen2.R2(), v.k(litePosShoppingCartScreen2.O, litePosShoppingCartScreen2.P, litePosShoppingCartScreen2.Q, litePosShoppingCartScreen2.R, litePosShoppingCartScreen2.S), R$id.shoppingCartScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new SwipeToActionDelegate(rowDelegate, false);
        this.Q = new ListSubheaderDelegate();
        this.R = new CellDetailsDelegate();
        this.S = new FullScreenStateDelegate();
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: df1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LitePosShoppingCartScreen f113750b;

            {
                this.f113750b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LitePosShoppingCartScreen litePosShoppingCartScreen = this.f113750b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LitePosShoppingCartScreen.U;
                        qji.b bVarU2 = litePosShoppingCartScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.di.ShoppingCartScreenInjector");
                        ld1.w wVar = (ld1.w) bVarU2;
                        return new ld1.o(wVar.f194006a, wVar.f194007b, litePosShoppingCartScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = LitePosShoppingCartScreen.U;
                        return (k) ((ld1.o) litePosShoppingCartScreen.M.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = LitePosShoppingCartScreen.U;
                        LitePosShoppingCartScreen litePosShoppingCartScreen2 = this.f113750b;
                        return dli.f.a(litePosShoppingCartScreen2, litePosShoppingCartScreen2.R2(), v.k(litePosShoppingCartScreen2.O, litePosShoppingCartScreen2.P, litePosShoppingCartScreen2.Q, litePosShoppingCartScreen2.R, litePosShoppingCartScreen2.S), R$id.shoppingCartScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f172941b;
        largeActionButton.setEnabled(uiState.f113756c);
        largeActionButton.setText(uiState.d);
        d3().f172942c.setMenuItems(uiState.f113755b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ld1.o) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172942c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_shopping_cart_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172942c;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new d8j.c(this, continuation, 13), 3);
        ViewController.P2(this, rd0.e.b(zi0.c.K(d3().f172941b.o)), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new df1.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52707c), new g(this, null), 3);
    }

    public final n d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
