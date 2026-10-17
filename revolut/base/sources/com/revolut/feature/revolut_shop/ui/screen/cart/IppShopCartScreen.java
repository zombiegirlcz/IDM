package com.revolut.feature.revolut_shop.ui.screen.cart;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowQuantityDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.ui.screen.cart.IppShopCartScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import m3c.c;
import te0.w;
import u3c.b;
import u3c.d;
import u3c.f;
import u3c.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/screen/cart/IppShopCartScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu3c/f;", "Ldli/a;", "Lu3c/h;", "<init>", "()V", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IppShopCartScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(IppShopCartScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final RowQuantityDelegate P = new RowQuantityDelegate();

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public IppShopCartScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: u3c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopCartScreen f276894b;

            {
                this.f276894b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IppShopCartScreen ippShopCartScreen = this.f276894b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IppShopCartScreen.R;
                        qji.b bVarU2 = ippShopCartScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.cart.di.IppShopCartScreenInjector");
                        m3c.j jVar = ((m3c.e) bVarU2).f202332b;
                        m3c.c cVar = new m3c.c();
                        int i6 = 16;
                        cVar.f202326a = e4m.b.b(new lzk.b(jVar, cVar, i3, i6));
                        cVar.f202327b = e4m.b.b(new lzk.b(jVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IppShopCartScreen.R;
                        return (g) ((m3c.c) ippShopCartScreen.M.getValue()).f202327b.get();
                    default:
                        KProperty[] kPropertyArr3 = IppShopCartScreen.R;
                        IppShopCartScreen ippShopCartScreen2 = this.f276894b;
                        return dli.f.a(ippShopCartScreen2, ippShopCartScreen2.R2(), v.k(ippShopCartScreen2.O, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), ippShopCartScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: u3c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopCartScreen f276894b;

            {
                this.f276894b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IppShopCartScreen ippShopCartScreen = this.f276894b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IppShopCartScreen.R;
                        qji.b bVarU2 = ippShopCartScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.cart.di.IppShopCartScreenInjector");
                        m3c.j jVar = ((m3c.e) bVarU2).f202332b;
                        m3c.c cVar = new m3c.c();
                        int i6 = 16;
                        cVar.f202326a = e4m.b.b(new lzk.b(jVar, cVar, i3, i6));
                        cVar.f202327b = e4m.b.b(new lzk.b(jVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IppShopCartScreen.R;
                        return (g) ((m3c.c) ippShopCartScreen.M.getValue()).f202327b.get();
                    default:
                        KProperty[] kPropertyArr3 = IppShopCartScreen.R;
                        IppShopCartScreen ippShopCartScreen2 = this.f276894b;
                        return dli.f.a(ippShopCartScreen2, ippShopCartScreen2.R2(), v.k(ippShopCartScreen2.O, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), ippShopCartScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: u3c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IppShopCartScreen f276894b;

            {
                this.f276894b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IppShopCartScreen ippShopCartScreen = this.f276894b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IppShopCartScreen.R;
                        qji.b bVarU2 = ippShopCartScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.cart.di.IppShopCartScreenInjector");
                        m3c.j jVar = ((m3c.e) bVarU2).f202332b;
                        m3c.c cVar = new m3c.c();
                        int i6 = 16;
                        cVar.f202326a = e4m.b.b(new lzk.b(jVar, cVar, i32, i6));
                        cVar.f202327b = e4m.b.b(new lzk.b(jVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IppShopCartScreen.R;
                        return (g) ((m3c.c) ippShopCartScreen.M.getValue()).f202327b.get();
                    default:
                        KProperty[] kPropertyArr3 = IppShopCartScreen.R;
                        IppShopCartScreen ippShopCartScreen2 = this.f276894b;
                        return dli.f.a(ippShopCartScreen2, ippShopCartScreen2.R2(), v.k(ippShopCartScreen2.O, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), ippShopCartScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        u3c.h uiState = (u3c.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f276900a ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_cart_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_cart_button_checkout_title, null, null, 14));
        largeActionButton.setLoadingButtonTag("GO_TO_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new u3c.c(this, null), 3);
        RowQuantityDelegate rowQuantityDelegate = this.P;
        ViewController.P2(this, rd0.e.b((ihm.f) rowQuantityDelegate.e.getValue()), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b((ihm.f) rowQuantityDelegate.d.getValue()), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new b(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
