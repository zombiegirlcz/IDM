package com.revolut.feature.revolut_shop.ui.screen.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import vrl.d;
import w3c.c;
import w3c.h;
import w3c.i;
import w3c.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/screen/checkout/CheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lw3c/h;", "Ldli/a;", "Lw3c/k;", "<init>", "()V", "Companion", "a", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckoutScreen extends ViewController<h> implements dli.a {
    public final Object M;
    public final Object N;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CheckoutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final int K = R$layout.screen_recycler_navbar_footer_nextbutton;
    public final ao.h L = s.t(this, b.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();

    /* JADX INFO: renamed from: com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, jii.s.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.s.a(p0);
        }
    }

    public CheckoutScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: w3c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutScreen f294269b;

            {
                this.f294269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CheckoutScreen checkoutScreen = this.f294269b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        CheckoutScreen.Companion companion = CheckoutScreen.INSTANCE;
                        qji.b bVarU2 = checkoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.checkout.di.CheckoutScreenInjector");
                        m3c.j jVar = ((m3c.e) bVarU2).f202332b;
                        m3c.a aVar = new m3c.a();
                        int i6 = 14;
                        aVar.f202321a = e4m.b.b(new lzk.b(jVar, aVar, i5, i6));
                        aVar.f202322b = e4m.b.b(new lzk.b(jVar, aVar, i3, i6));
                        return aVar;
                    case 1:
                        CheckoutScreen.Companion companion2 = CheckoutScreen.INSTANCE;
                        return (i) ((m3c.a) checkoutScreen.M.getValue()).f202322b.get();
                    default:
                        CheckoutScreen.Companion companion3 = CheckoutScreen.INSTANCE;
                        CheckoutScreen checkoutScreen2 = this.f294269b;
                        return dli.f.a(checkoutScreen2, checkoutScreen2.d(), v.k(checkoutScreen2.O, new RowLoadingDelegate(), new CellDetailsDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), checkoutScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: w3c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutScreen f294269b;

            {
                this.f294269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CheckoutScreen checkoutScreen = this.f294269b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        CheckoutScreen.Companion companion = CheckoutScreen.INSTANCE;
                        qji.b bVarU2 = checkoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.checkout.di.CheckoutScreenInjector");
                        m3c.j jVar = ((m3c.e) bVarU2).f202332b;
                        m3c.a aVar = new m3c.a();
                        int i6 = 14;
                        aVar.f202321a = e4m.b.b(new lzk.b(jVar, aVar, i5, i6));
                        aVar.f202322b = e4m.b.b(new lzk.b(jVar, aVar, i3, i6));
                        return aVar;
                    case 1:
                        CheckoutScreen.Companion companion2 = CheckoutScreen.INSTANCE;
                        return (i) ((m3c.a) checkoutScreen.M.getValue()).f202322b.get();
                    default:
                        CheckoutScreen.Companion companion3 = CheckoutScreen.INSTANCE;
                        CheckoutScreen checkoutScreen2 = this.f294269b;
                        return dli.f.a(checkoutScreen2, checkoutScreen2.d(), v.k(checkoutScreen2.O, new RowLoadingDelegate(), new CellDetailsDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), checkoutScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: w3c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutScreen f294269b;

            {
                this.f294269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CheckoutScreen checkoutScreen = this.f294269b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        CheckoutScreen.Companion companion = CheckoutScreen.INSTANCE;
                        qji.b bVarU2 = checkoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.checkout.di.CheckoutScreenInjector");
                        m3c.j jVar = ((m3c.e) bVarU2).f202332b;
                        m3c.a aVar = new m3c.a();
                        int i6 = 14;
                        aVar.f202321a = e4m.b.b(new lzk.b(jVar, aVar, i5, i6));
                        aVar.f202322b = e4m.b.b(new lzk.b(jVar, aVar, i32, i6));
                        return aVar;
                    case 1:
                        CheckoutScreen.Companion companion2 = CheckoutScreen.INSTANCE;
                        return (i) ((m3c.a) checkoutScreen.M.getValue()).f202322b.get();
                    default:
                        CheckoutScreen.Companion companion3 = CheckoutScreen.INSTANCE;
                        CheckoutScreen checkoutScreen2 = this.f294269b;
                        return dli.f.a(checkoutScreen2, checkoutScreen2.d(), v.k(checkoutScreen2.O, new RowLoadingDelegate(), new CellDetailsDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), checkoutScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        FooterTextView footerTextView = d3().f174558c;
        footerTextView.setTextClause(uiState.f);
        footerTextView.setVisibility(uiState.e ? 0 : 8);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setVisibility(uiState.f294279c ? 0 : 8);
        largeActionButton.setText(uiState.f294278b);
        largeActionButton.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m3c.a) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_title, null, null, 14));
        d3().f174557b.setLoadingButtonTag("PAY_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new w3c.b(this, continuation, 0), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, vkm.q.J(rd0.e.b(rowDelegate.f53220l), rd0.e.b(rowDelegate.f53218h)), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174558c.f58608l), new d(this, continuation, 25), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new w3c.b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new w3c.d(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
