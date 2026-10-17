package com.revolut.feature.freelancer.impl.ui.ecommerce.manage.shopify;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import aw0.e;
import aw0.n6;
import bx6.c;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$id;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.shopify.ShopifyManageScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import rs6.g;
import te0.w;
import us6.h1;
import us6.n1;
import vc.s;
import xw6.a;
import xw6.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/shopify/ShopifyManageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lbx6/g;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopifyManageScreen extends ViewController<Object> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ShopifyManageScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenShopifyManageBinding;", 0))};
    public final FullScreenStateDelegate K = new FullScreenStateDelegate();
    public final h L = s.t(this, a.f);
    public final int M = R$layout.screen_shopify_manage;
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/freelancer/impl/databinding/ScreenShopifyManageBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.footerView;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
            if (actionFooterView != null) {
                i = R$id.navBarView;
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
                if (navBarWithContainer != null) {
                    i = R$id.recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.storyContentView;
                        StoryNavBarContentView storyNavBarContentView = (StoryNavBarContentView) ViewBindings.findChildViewById(p0, i);
                        if (storyNavBarContentView != null) {
                            return new g((ControllerContainerCoordinatorLayout) p0, actionFooterView, navBarWithContainer, storyNavBarContentView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ShopifyManageScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopifyManageScreen f19494b;

            {
                this.f19494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShopifyManageScreen shopifyManageScreen = this.f19494b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ShopifyManageScreen.Q;
                        ShopifyManageScreen shopifyManageScreen2 = this.f19494b;
                        return dli.f.a(shopifyManageScreen2, shopifyManageScreen2.d(), v.k(shopifyManageScreen2.K, new CellDetailsDelegate(), new ListSubheaderDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopifyManageScreen.Q;
                        qji.b bVarU2 = shopifyManageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.ecommerce.manage.shopify.di.ShopifyManageScreenInjector");
                        h1 h1Var = (h1) bVarU2;
                        return new n1(h1Var.f282563a, h1Var.f282564b);
                    default:
                        KProperty[] kPropertyArr3 = ShopifyManageScreen.Q;
                        return (e) ((n1) shopifyManageScreen.O.getValue()).f282636a.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopifyManageScreen f19494b;

            {
                this.f19494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShopifyManageScreen shopifyManageScreen = this.f19494b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopifyManageScreen.Q;
                        ShopifyManageScreen shopifyManageScreen2 = this.f19494b;
                        return dli.f.a(shopifyManageScreen2, shopifyManageScreen2.d(), v.k(shopifyManageScreen2.K, new CellDetailsDelegate(), new ListSubheaderDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopifyManageScreen.Q;
                        qji.b bVarU2 = shopifyManageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.ecommerce.manage.shopify.di.ShopifyManageScreenInjector");
                        h1 h1Var = (h1) bVarU2;
                        return new n1(h1Var.f282563a, h1Var.f282564b);
                    default:
                        KProperty[] kPropertyArr3 = ShopifyManageScreen.Q;
                        return (e) ((n1) shopifyManageScreen.O.getValue()).f282636a.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: bx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopifyManageScreen f19494b;

            {
                this.f19494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShopifyManageScreen shopifyManageScreen = this.f19494b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopifyManageScreen.Q;
                        ShopifyManageScreen shopifyManageScreen2 = this.f19494b;
                        return dli.f.a(shopifyManageScreen2, shopifyManageScreen2.d(), v.k(shopifyManageScreen2.K, new CellDetailsDelegate(), new ListSubheaderDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopifyManageScreen.Q;
                        qji.b bVarU2 = shopifyManageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.ecommerce.manage.shopify.di.ShopifyManageScreenInjector");
                        h1 h1Var = (h1) bVarU2;
                        return new n1(h1Var.f282563a, h1Var.f282564b);
                    default:
                        KProperty[] kPropertyArr3 = ShopifyManageScreen.Q;
                        return (e) ((n1) shopifyManageScreen.O.getValue()).f282636a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        bx6.g uiState = (bx6.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f257036b.setModel(new e(true, uiState.d, null, new n6(uiState.f19501c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 52));
        StoryNavBarContentView storyNavBarContentView = d3().d;
        xw6.a aVar = uiState.f19500b;
        if (aVar instanceof a.C1718a) {
            storyNavBarContentView.setLoading();
        } else {
            if (!(aVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            storyNavBarContentView.setStories(u.c(((b) aVar).f309333a));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n1) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainer navBarWithContainer = d3().f257037c;
        navBarWithContainer.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithContainer.M();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f257037c.K()), null, new bx6.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f257036b.f), null, new bx6.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f257036b.e), null, new btd.e(this, null, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f52371h.f121375b), null, new c(this, null), 3);
    }

    public final g d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bx6.e d() {
        return (bx6.e) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
