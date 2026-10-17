package com.revolut.trading.orders.ui.invest.placement.expiry;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.trading.orders.ui.invest.placement.expiry.ExpiryDateSelectorScreen;
import dli.a;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t4j.c;
import t9l.f;
import te0.w;
import ttl.b;
import ttl.o;
import ttl.p;
import ttl.r;
import ttl.x;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/expiry/ExpiryDateSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lttl/p;", "", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpiryDateSelectorScreen extends ViewController<p> implements a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ExpiryDateSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final o K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowLoadingDelegate P;
    public final DatePickerDelegate Q;
    public final CellDetailsActionDelegate R;
    public final LargeActionButtonDelegate S;
    public final SelectableDelegate T;
    public final Object U;
    public final Object V;
    public final Object W;

    public ExpiryDateSelectorScreen(o inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ttl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiryDateSelectorScreen f274439b;

            {
                this.f274439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExpiryDateSelectorScreen expiryDateSelectorScreen = this.f274439b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ExpiryDateSelectorScreen.X;
                        qji.b bVarU2 = expiryDateSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.expiry.di.ExpiryDateSelectorScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        o oVar = expiryDateSelectorScreen.K;
                        oVar.getClass();
                        return new xsl.a(pVar, fVar2, expiryDateSelectorScreen, oVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpiryDateSelectorScreen.X;
                        return (x) ((xsl.a) expiryDateSelectorScreen.N.getValue()).f308577l.get();
                    case 2:
                        return zhm.v.k(expiryDateSelectorScreen.P, expiryDateSelectorScreen.T, expiryDateSelectorScreen.R);
                    case 3:
                        return zhm.v.k(expiryDateSelectorScreen.Q, expiryDateSelectorScreen.S);
                    default:
                        KProperty[] kPropertyArr3 = ExpiryDateSelectorScreen.X;
                        ExpiryDateSelectorScreen expiryDateSelectorScreen2 = this.f274439b;
                        x xVarD = expiryDateSelectorScreen2.d();
                        List list = (List) expiryDateSelectorScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = expiryDateSelectorScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(expiryDateSelectorScreen2, xVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ttl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiryDateSelectorScreen f274439b;

            {
                this.f274439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExpiryDateSelectorScreen expiryDateSelectorScreen = this.f274439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpiryDateSelectorScreen.X;
                        qji.b bVarU2 = expiryDateSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.expiry.di.ExpiryDateSelectorScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        o oVar = expiryDateSelectorScreen.K;
                        oVar.getClass();
                        return new xsl.a(pVar, fVar2, expiryDateSelectorScreen, oVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpiryDateSelectorScreen.X;
                        return (x) ((xsl.a) expiryDateSelectorScreen.N.getValue()).f308577l.get();
                    case 2:
                        return zhm.v.k(expiryDateSelectorScreen.P, expiryDateSelectorScreen.T, expiryDateSelectorScreen.R);
                    case 3:
                        return zhm.v.k(expiryDateSelectorScreen.Q, expiryDateSelectorScreen.S);
                    default:
                        KProperty[] kPropertyArr3 = ExpiryDateSelectorScreen.X;
                        ExpiryDateSelectorScreen expiryDateSelectorScreen2 = this.f274439b;
                        x xVarD = expiryDateSelectorScreen2.d();
                        List list = (List) expiryDateSelectorScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = expiryDateSelectorScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(expiryDateSelectorScreen2, xVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        this.P = new RowLoadingDelegate();
        this.Q = new DatePickerDelegate();
        this.R = new CellDetailsActionDelegate();
        this.S = new LargeActionButtonDelegate();
        this.T = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: ttl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiryDateSelectorScreen f274439b;

            {
                this.f274439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ExpiryDateSelectorScreen expiryDateSelectorScreen = this.f274439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpiryDateSelectorScreen.X;
                        qji.b bVarU2 = expiryDateSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.expiry.di.ExpiryDateSelectorScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        o oVar = expiryDateSelectorScreen.K;
                        oVar.getClass();
                        return new xsl.a(pVar, fVar2, expiryDateSelectorScreen, oVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpiryDateSelectorScreen.X;
                        return (x) ((xsl.a) expiryDateSelectorScreen.N.getValue()).f308577l.get();
                    case 2:
                        return zhm.v.k(expiryDateSelectorScreen.P, expiryDateSelectorScreen.T, expiryDateSelectorScreen.R);
                    case 3:
                        return zhm.v.k(expiryDateSelectorScreen.Q, expiryDateSelectorScreen.S);
                    default:
                        KProperty[] kPropertyArr3 = ExpiryDateSelectorScreen.X;
                        ExpiryDateSelectorScreen expiryDateSelectorScreen2 = this.f274439b;
                        x xVarD = expiryDateSelectorScreen2.d();
                        List list = (List) expiryDateSelectorScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = expiryDateSelectorScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(expiryDateSelectorScreen2, xVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: ttl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiryDateSelectorScreen f274439b;

            {
                this.f274439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ExpiryDateSelectorScreen expiryDateSelectorScreen = this.f274439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpiryDateSelectorScreen.X;
                        qji.b bVarU2 = expiryDateSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.expiry.di.ExpiryDateSelectorScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        o oVar = expiryDateSelectorScreen.K;
                        oVar.getClass();
                        return new xsl.a(pVar, fVar2, expiryDateSelectorScreen, oVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpiryDateSelectorScreen.X;
                        return (x) ((xsl.a) expiryDateSelectorScreen.N.getValue()).f308577l.get();
                    case 2:
                        return zhm.v.k(expiryDateSelectorScreen.P, expiryDateSelectorScreen.T, expiryDateSelectorScreen.R);
                    case 3:
                        return zhm.v.k(expiryDateSelectorScreen.Q, expiryDateSelectorScreen.S);
                    default:
                        KProperty[] kPropertyArr3 = ExpiryDateSelectorScreen.X;
                        ExpiryDateSelectorScreen expiryDateSelectorScreen2 = this.f274439b;
                        x xVarD = expiryDateSelectorScreen2.d();
                        List list = (List) expiryDateSelectorScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = expiryDateSelectorScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(expiryDateSelectorScreen2, xVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.W = w.y0(new Function0(this) { // from class: ttl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiryDateSelectorScreen f274439b;

            {
                this.f274439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ExpiryDateSelectorScreen expiryDateSelectorScreen = this.f274439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpiryDateSelectorScreen.X;
                        qji.b bVarU2 = expiryDateSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.expiry.di.ExpiryDateSelectorScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        o oVar = expiryDateSelectorScreen.K;
                        oVar.getClass();
                        return new xsl.a(pVar, fVar2, expiryDateSelectorScreen, oVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpiryDateSelectorScreen.X;
                        return (x) ((xsl.a) expiryDateSelectorScreen.N.getValue()).f308577l.get();
                    case 2:
                        return zhm.v.k(expiryDateSelectorScreen.P, expiryDateSelectorScreen.T, expiryDateSelectorScreen.R);
                    case 3:
                        return zhm.v.k(expiryDateSelectorScreen.Q, expiryDateSelectorScreen.S);
                    default:
                        KProperty[] kPropertyArr3 = ExpiryDateSelectorScreen.X;
                        ExpiryDateSelectorScreen expiryDateSelectorScreen2 = this.f274439b;
                        x xVarD = expiryDateSelectorScreen2.d();
                        List list = (List) expiryDateSelectorScreen2.U.getValue();
                        ScreenContentRecyclerView recyclerView = expiryDateSelectorScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return dli.f.a(expiryDateSelectorScreen2, xVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f274465a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setText(uiState.f274467c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (xsl.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((xsl.a) this.N.getValue()).e.get()).d((List) this.V.getValue());
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new ttl.e(this, null, 0), 3);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        ViewController.P2(this, rd0.e.b(goToButton.o), new ttl.e(this, null, 1), 3);
        ViewController.P2(this, new c(vkm.q.J(new f(rd0.e.b(this.T.r()), 25), rd0.e.b(this.R.d), rd0.e.b(this.S.d.f121375b)), 1), new ttl.f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52176c.f121375b), new ttl.f(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x d() {
        return (x) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
