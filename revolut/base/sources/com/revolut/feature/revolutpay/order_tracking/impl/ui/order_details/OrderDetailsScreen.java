package com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.p0;
import au0.r0;
import au0.s0;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressTrackingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.revolutpay.order_tracking.impl.R$id;
import com.revolut.feature.revolutpay.order_tracking.impl.R$layout;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lbc.b;
import lbc.c;
import lbc.d;
import lbc.f;
import lbc.g;
import lbc.i;
import lbc.j;
import lbc.n;
import lbc.p;
import lbc.u;
import te0.w;
import tx0.p2;
import vc.s;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Llbc/u;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(OrderDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/order_tracking/impl/databinding/ScreenOrderDetailsBinding;", 0))};
    public final Integer K;
    public final int L;
    public final TripDetailsDelegate M;
    public final AppTipDelegate N;
    public final LinearProgressTrackingDelegate O;
    public final CellDetailsDelegate P;
    public final CellDetailsActionDelegate Q;
    public final ListSubheaderDelegate R;
    public final FullScreenStateDelegate S;
    public final RowDelegate T;
    public final Object U;
    public final h V;
    public final Object W;
    public final Object X;

    public OrderDetailsScreen(OrderDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = Integer.valueOf(R$style.UiKitTheme_Transparent);
        this.L = R$layout.screen_order_details;
        this.M = new TripDetailsDelegate();
        this.N = new AppTipDelegate();
        this.O = new LinearProgressTrackingDelegate();
        this.P = new CellDetailsDelegate();
        this.Q = new CellDetailsActionDelegate();
        this.R = new ListSubheaderDelegate();
        this.S = new FullScreenStateDelegate();
        this.T = new RowDelegate(null, null, 7);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: lbc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailsScreen f193629b;

            {
                this.f193629b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = OrderDetailsScreen.Y;
                        OrderDetailsScreen orderDetailsScreen = this.f193629b;
                        return dli.f.a(orderDetailsScreen, orderDetailsScreen.R2(), zhm.v.k(new ScrollerDelegate(zhm.u.c(orderDetailsScreen.M), false), orderDetailsScreen.M, orderDetailsScreen.N, orderDetailsScreen.O, orderDetailsScreen.P, orderDetailsScreen.Q, new CellDetailsLoadingDelegate(), new CellDetailsTotalDelegate(), new CellDetailsNoteDelegate(), orderDetailsScreen.R, orderDetailsScreen.T, orderDetailsScreen.S), R$id.orderDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = OrderDetailsScreen.Y;
                        return (s) ((uac.e) this.f193629b.W.getValue()).e.get();
                }
            }
        });
        this.V = s.t(this, b.f);
        this.W = w.y0(new kpl.b(this, inputData, 26));
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: lbc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailsScreen f193629b;

            {
                this.f193629b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderDetailsScreen.Y;
                        OrderDetailsScreen orderDetailsScreen = this.f193629b;
                        return dli.f.a(orderDetailsScreen, orderDetailsScreen.R2(), zhm.v.k(new ScrollerDelegate(zhm.u.c(orderDetailsScreen.M), false), orderDetailsScreen.M, orderDetailsScreen.N, orderDetailsScreen.O, orderDetailsScreen.P, orderDetailsScreen.Q, new CellDetailsLoadingDelegate(), new CellDetailsTotalDelegate(), new CellDetailsNoteDelegate(), orderDetailsScreen.R, orderDetailsScreen.T, orderDetailsScreen.S), R$id.orderDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = OrderDetailsScreen.Y;
                        return (s) ((uac.e) this.f193629b.W.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getK() {
        return this.K;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        lbc.q qVar2 = uiState.f193647a;
        if (qVar2 instanceof p) {
            NavBarWithBigTile navBarWithBigTile = d3().f252809b;
            navBarWithBigTile.setLoadingState(true);
            navBarWithBigTile.setMenuItems(f0.f322471a);
            return;
        }
        if (qVar2 instanceof lbc.o) {
            NavBarWithBigTile navBarWithBigTile2 = d3().f252809b;
            navBarWithBigTile2.setLoadingState(false);
            navBarWithBigTile2.setIcon(null, r0.DEFAULT);
            navBarWithBigTile2.setTitle((Clause) null);
            navBarWithBigTile2.setDescription((p0) null);
            f0 f0Var = f0.f322471a;
            navBarWithBigTile2.setActions(f0Var);
            navBarWithBigTile2.setMenuItems(f0Var);
            return;
        }
        if (!(qVar2 instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        n nVar = (n) qVar2;
        NavBarWithBigTile navBarWithBigTile3 = d3().f252809b;
        navBarWithBigTile3.setLoadingState(false);
        navBarWithBigTile3.setIcon(nVar.f193642c, r0.BLURRED_BACKGROUND);
        navBarWithBigTile3.setIconClickable(false);
        TextClause textClause = nVar.f193640a;
        navBarWithBigTile3.setTitle(textClause);
        navBarWithBigTile3.setToolbarTitle(textClause);
        navBarWithBigTile3.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile3.setDescription(new au0.o0(nVar.f193641b));
        navBarWithBigTile3.setActions(nVar.d);
        navBarWithBigTile3.setMenuItems(nVar.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (uac.e) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f252809b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f252809b.f59357t), new la8.h(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f252809b.b()), new lbc.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f252809b.K()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new g(this, null), 3);
        AppTipDelegate appTipDelegate = this.N;
        ViewController.P2(this, rd0.e.b(appTipDelegate.d), new lbc.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(appTipDelegate.f51654g), new lbc.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52659c), new lbc.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new d(this, null), 3);
    }

    public final rac.a d3() {
        ViewBinding value = this.V.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rac.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final lbc.s R2() {
        return (lbc.s) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
