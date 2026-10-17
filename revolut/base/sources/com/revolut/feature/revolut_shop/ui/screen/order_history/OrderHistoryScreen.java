package com.revolut.feature.revolut_shop.ui.screen.order_history;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolut_shop.ui.screen.order_history.OrderHistoryScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g4c.b;
import g4c.c;
import g4c.d;
import g4c.f;
import g4c.k;
import g4c.l;
import jii.m;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/screen/order_history/OrderHistoryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg4c/k;", "Ldli/a;", "Lg4c/m;", "<init>", "()V", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderHistoryScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(OrderHistoryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object T;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final RowLoadingDelegate P = new RowLoadingDelegate();
    public final VaultsProgressDelegate Q = new VaultsProgressDelegate();
    public final FullScreenStateDelegate R = new FullScreenStateDelegate();
    public final ErrorDelegate S = new ErrorDelegate();

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public OrderHistoryScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: g4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderHistoryScreen f140473b;

            {
                this.f140473b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderHistoryScreen orderHistoryScreen = this.f140473b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderHistoryScreen.U;
                        qji.b bVarU2 = orderHistoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.order_history.di.OrderHistoryScreenInjector");
                        m3c.g gVar = (m3c.g) bVarU2;
                        return new m3c.h(gVar.f202338b, gVar.f202339c);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderHistoryScreen.U;
                        return (l) ((m3c.h) orderHistoryScreen.M.getValue()).f202342c.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderHistoryScreen.U;
                        OrderHistoryScreen orderHistoryScreen2 = this.f140473b;
                        return dli.f.a(orderHistoryScreen2, orderHistoryScreen2.d(), zhm.v.k(orderHistoryScreen2.O, orderHistoryScreen2.P, orderHistoryScreen2.Q, new VaultsProgressLoadingDelegate(), orderHistoryScreen2.R, orderHistoryScreen2.S), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: g4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderHistoryScreen f140473b;

            {
                this.f140473b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderHistoryScreen orderHistoryScreen = this.f140473b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderHistoryScreen.U;
                        qji.b bVarU2 = orderHistoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.order_history.di.OrderHistoryScreenInjector");
                        m3c.g gVar = (m3c.g) bVarU2;
                        return new m3c.h(gVar.f202338b, gVar.f202339c);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderHistoryScreen.U;
                        return (l) ((m3c.h) orderHistoryScreen.M.getValue()).f202342c.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderHistoryScreen.U;
                        OrderHistoryScreen orderHistoryScreen2 = this.f140473b;
                        return dli.f.a(orderHistoryScreen2, orderHistoryScreen2.d(), zhm.v.k(orderHistoryScreen2.O, orderHistoryScreen2.P, orderHistoryScreen2.Q, new VaultsProgressLoadingDelegate(), orderHistoryScreen2.R, orderHistoryScreen2.S), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: g4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderHistoryScreen f140473b;

            {
                this.f140473b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OrderHistoryScreen orderHistoryScreen = this.f140473b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderHistoryScreen.U;
                        qji.b bVarU2 = orderHistoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.order_history.di.OrderHistoryScreenInjector");
                        m3c.g gVar = (m3c.g) bVarU2;
                        return new m3c.h(gVar.f202338b, gVar.f202339c);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderHistoryScreen.U;
                        return (l) ((m3c.h) orderHistoryScreen.M.getValue()).f202342c.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderHistoryScreen.U;
                        OrderHistoryScreen orderHistoryScreen2 = this.f140473b;
                        return dli.f.a(orderHistoryScreen2, orderHistoryScreen2.d(), zhm.v.k(orderHistoryScreen2.O, orderHistoryScreen2.P, orderHistoryScreen2.Q, new VaultsProgressLoadingDelegate(), orderHistoryScreen2.R, orderHistoryScreen2.S), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g4c.m uiState = (g4c.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f140481b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m3c.h) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new b(this, continuation, 0), 3);
        VaultsProgressDelegate vaultsProgressDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(vaultsProgressDelegate.r()), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(vaultsProgressDelegate.d.f121375b), new g4c.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52226c), new b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new b(this, continuation, 2), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.N.getValue();
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
