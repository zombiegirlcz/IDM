package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.q0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto.asset_details.impl.R$id;
import com.revolut.retail.feature.crypto.asset_details.impl.R$layout;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import io3.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import m3g.c;
import m75.i;
import m9d.y0;
import m9j.b;
import m9j.f;
import m9j.k;
import m9j.l;
import q8j.g;
import rd0.e;
import te0.w;
import vc.s;
import x8j.o;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/holding/CryptoHoldingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm9j/l;", "Lx8j/o;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoHoldingScreen extends ViewController<q> implements dli.a, o {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CryptoHoldingScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/crypto/asset_details/impl/databinding/ScreenCryptoInvestmentDetailsBinding;", 0))};
    public final CellDetailsDelegate K;
    public final CellDetailsChevronDelegate L;
    public final CellDetailsActionDelegate M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final int S;
    public final Object T;
    public final CellDetailsSwitcherDelegate U;

    public CryptoHoldingScreen(d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.K = new CellDetailsDelegate();
        this.L = new CellDetailsChevronDelegate();
        this.M = new CellDetailsActionDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: m9j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoHoldingScreen f203800b;

            {
                this.f203800b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoHoldingScreen cryptoHoldingScreen = this.f203800b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoHoldingScreen.V;
                        return (j60.a) ((q8j.g) cryptoHoldingScreen.Q.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoHoldingScreen.V;
                        return (k) ((q8j.g) cryptoHoldingScreen.Q.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoHoldingScreen.V;
                        int i3 = R$id.cryptoInvestmentDetails_recycler;
                        CryptoHoldingScreen cryptoHoldingScreen2 = this.f203800b;
                        return dli.f.a(cryptoHoldingScreen2, cryptoHoldingScreen2.d(), v.k(new HeaderDelegate(), new HeaderLoadingDelegate(), cryptoHoldingScreen2.K, cryptoHoldingScreen2.L, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), cryptoHoldingScreen2.M, cryptoHoldingScreen2.U), i3, null, null, null, 56);
                }
            }
        });
        this.O = w.y0(new c(14));
        this.P = s.t(this, b.f);
        this.Q = w.y0(new ltf.b(this, pocket, 22));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: m9j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoHoldingScreen f203800b;

            {
                this.f203800b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoHoldingScreen cryptoHoldingScreen = this.f203800b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoHoldingScreen.V;
                        return (j60.a) ((q8j.g) cryptoHoldingScreen.Q.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoHoldingScreen.V;
                        return (k) ((q8j.g) cryptoHoldingScreen.Q.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoHoldingScreen.V;
                        int i3 = R$id.cryptoInvestmentDetails_recycler;
                        CryptoHoldingScreen cryptoHoldingScreen2 = this.f203800b;
                        return dli.f.a(cryptoHoldingScreen2, cryptoHoldingScreen2.d(), v.k(new HeaderDelegate(), new HeaderLoadingDelegate(), cryptoHoldingScreen2.K, cryptoHoldingScreen2.L, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), cryptoHoldingScreen2.M, cryptoHoldingScreen2.U), i3, null, null, null, 56);
                }
            }
        });
        this.S = R$layout.screen_crypto_investment_details;
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: m9j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoHoldingScreen f203800b;

            {
                this.f203800b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoHoldingScreen cryptoHoldingScreen = this.f203800b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoHoldingScreen.V;
                        return (j60.a) ((q8j.g) cryptoHoldingScreen.Q.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoHoldingScreen.V;
                        return (k) ((q8j.g) cryptoHoldingScreen.Q.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoHoldingScreen.V;
                        int i32 = R$id.cryptoInvestmentDetails_recycler;
                        CryptoHoldingScreen cryptoHoldingScreen2 = this.f203800b;
                        return dli.f.a(cryptoHoldingScreen2, cryptoHoldingScreen2.d(), v.k(new HeaderDelegate(), new HeaderLoadingDelegate(), cryptoHoldingScreen2.K, cryptoHoldingScreen2.L, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), cryptoHoldingScreen2.M, cryptoHoldingScreen2.U), i32, null, null, null, 56);
                }
            }
        });
        this.U = new CellDetailsSwitcherDelegate();
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f192999c;
        navBarWithToolbar.setTitle(uiState.f203811a, null);
        navBarWithToolbar.setEndIconImage(uiState.f203813c);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f203812b);
        navBarWithToolbar.setMenuItems(uiState.e);
        ButtonsActionsView cryptoInvestmentDetailsButtonsActions = d3().f192998b;
        Intrinsics.checkNotNullExpressionValue(cryptoInvestmentDetailsButtonsActions, "cryptoInvestmentDetailsButtonsActions");
        q0 q0Var = uiState.d;
        cryptoInvestmentDetailsButtonsActions.setVisibility(q0Var != null ? 0 : 8);
        if (q0Var != null) {
            d3().f192998b.b(q0Var);
        }
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // x8j.o
    public final Flow N1() {
        return e.b(((LargeActionButtonDelegate) this.O.getValue()).d.f121375b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.Q.getValue();
    }

    @Override // x8j.o
    public final Flow S1() {
        return e.b(d3().f192998b.e.f121375b);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f192999c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) this.N.getValue()).d(v.k((LargeActionButtonDelegate) this.O.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new TwinHorizontalButtonDelegate(), new RowDelegate(null, null, 7), new CellDetailsDelegate()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(d3().f192999c.f59410q), null, new y0(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(d3().f192999c.o.f57403b), null, new i(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.L.f51821c), null, new m9j.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.M.d), null, new m9j.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.K.e), null, new m9j.e(this, null), 3);
        CellDetailsSwitcherDelegate cellDetailsSwitcherDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsSwitcherDelegate.f51912c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsSwitcherDelegate.d), null, new m9j.g(this, null), 3);
    }

    public final l8j.a d3() {
        ViewBinding value = this.P.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l8j.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
