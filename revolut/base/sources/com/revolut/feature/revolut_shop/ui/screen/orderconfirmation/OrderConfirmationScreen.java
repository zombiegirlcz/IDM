package com.revolut.feature.revolut_shop.ui.screen.orderconfirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressTrackingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreen;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import j4c.b;
import j4c.c;
import j4c.d;
import j4c.f;
import j4c.k;
import j4c.n;
import j4c.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m3c.l;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/screen/orderconfirmation/OrderConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj4c/k;", "Ldli/a;", "Lj4c/n;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderConfirmationScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(OrderConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final OrderConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final CellDetailsDelegate Q;
    public final Object R;

    public OrderConfirmationScreen(OrderConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderConfirmationScreen f171335b;

            {
                this.f171335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderConfirmationScreen orderConfirmationScreen = this.f171335b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderConfirmationScreen.S;
                        qji.b bVarU2 = orderConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.di.OrderConfirmationScreenInjector");
                        m3c.k kVar = (m3c.k) ((k4c.a) bVarU2).b().mo3808a(orderConfirmationScreen);
                        OrderConfirmationScreenContract$InputData orderConfirmationScreenContract$InputData = orderConfirmationScreen.K;
                        switch (kVar.f202354a) {
                            case 0:
                                orderConfirmationScreenContract$InputData.getClass();
                                kVar.d = orderConfirmationScreenContract$InputData;
                                break;
                            default:
                                orderConfirmationScreenContract$InputData.getClass();
                                kVar.d = orderConfirmationScreenContract$InputData;
                                break;
                        }
                        return (m3c.l) kVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderConfirmationScreen.S;
                        m3c.l lVar = (m3c.l) orderConfirmationScreen.N.getValue();
                        switch (lVar.f202357a) {
                            case 0:
                                return (l) lVar.f.get();
                            default:
                                return (l) lVar.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = OrderConfirmationScreen.S;
                        OrderConfirmationScreen orderConfirmationScreen2 = this.f171335b;
                        return dli.f.a(orderConfirmationScreen2, orderConfirmationScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), orderConfirmationScreen2.P, new RowDelegate(null, null, 7), new RowLoadingDelegate(), orderConfirmationScreen2.Q, new CellDetailsLoadingDelegate(), new LinearProgressTrackingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: j4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderConfirmationScreen f171335b;

            {
                this.f171335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderConfirmationScreen orderConfirmationScreen = this.f171335b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderConfirmationScreen.S;
                        qji.b bVarU2 = orderConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.di.OrderConfirmationScreenInjector");
                        m3c.k kVar = (m3c.k) ((k4c.a) bVarU2).b().mo3808a(orderConfirmationScreen);
                        OrderConfirmationScreenContract$InputData orderConfirmationScreenContract$InputData = orderConfirmationScreen.K;
                        switch (kVar.f202354a) {
                            case 0:
                                orderConfirmationScreenContract$InputData.getClass();
                                kVar.d = orderConfirmationScreenContract$InputData;
                                break;
                            default:
                                orderConfirmationScreenContract$InputData.getClass();
                                kVar.d = orderConfirmationScreenContract$InputData;
                                break;
                        }
                        return (m3c.l) kVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderConfirmationScreen.S;
                        m3c.l lVar = (m3c.l) orderConfirmationScreen.N.getValue();
                        switch (lVar.f202357a) {
                            case 0:
                                return (l) lVar.f.get();
                            default:
                                return (l) lVar.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = OrderConfirmationScreen.S;
                        OrderConfirmationScreen orderConfirmationScreen2 = this.f171335b;
                        return dli.f.a(orderConfirmationScreen2, orderConfirmationScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), orderConfirmationScreen2.P, new RowDelegate(null, null, 7), new RowLoadingDelegate(), orderConfirmationScreen2.Q, new CellDetailsLoadingDelegate(), new LinearProgressTrackingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        this.Q = new CellDetailsDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: j4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderConfirmationScreen f171335b;

            {
                this.f171335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OrderConfirmationScreen orderConfirmationScreen = this.f171335b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderConfirmationScreen.S;
                        qji.b bVarU2 = orderConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.di.OrderConfirmationScreenInjector");
                        m3c.k kVar = (m3c.k) ((k4c.a) bVarU2).b().mo3808a(orderConfirmationScreen);
                        OrderConfirmationScreenContract$InputData orderConfirmationScreenContract$InputData = orderConfirmationScreen.K;
                        switch (kVar.f202354a) {
                            case 0:
                                orderConfirmationScreenContract$InputData.getClass();
                                kVar.d = orderConfirmationScreenContract$InputData;
                                break;
                            default:
                                orderConfirmationScreenContract$InputData.getClass();
                                kVar.d = orderConfirmationScreenContract$InputData;
                                break;
                        }
                        return (m3c.l) kVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = OrderConfirmationScreen.S;
                        m3c.l lVar = (m3c.l) orderConfirmationScreen.N.getValue();
                        switch (lVar.f202357a) {
                            case 0:
                                return (l) lVar.f.get();
                            default:
                                return (l) lVar.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = OrderConfirmationScreen.S;
                        OrderConfirmationScreen orderConfirmationScreen2 = this.f171335b;
                        return dli.f.a(orderConfirmationScreen2, orderConfirmationScreen2.R2(), zhm.v.k(new ListSubheaderDelegate(), orderConfirmationScreen2.P, new RowDelegate(null, null, 7), new RowLoadingDelegate(), orderConfirmationScreen2.Q, new CellDetailsLoadingDelegate(), new LinearProgressTrackingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        boolean z = uiState.f171346a;
        Clause clause = uiState.e;
        Clause clause2 = uiState.d;
        Clause clause3 = uiState.f171348c;
        Clause clause4 = uiState.f171347b;
        if (z) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            navBarWithToolbar.l0();
        }
        navBarWithToolbar.setTitle(clause4, null);
        if (clause4 != null) {
            navBarWithToolbar.setToolbarTitle(clause4);
        }
        navBarWithToolbar.setDescriptionVisible(clause3 != null);
        navBarWithToolbar.setDescriptionText(clause3);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setFilters(uiState.f);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(clause == null ? 8 : 0);
        largeActionButton.setText(clause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (this.K.f84241b) {
            return false;
        }
        ((u) R2()).C2(k.f171344a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(this.K.f84241b ? R$drawable.uikit_icn_24_back_button_arrow : R$drawable.uikit_icn_24_cross));
        d3().f174564b.setText(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_order_footer_button_close, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f), new j4c.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.s0()), new f(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j4c.l R2() {
        return (j4c.l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
