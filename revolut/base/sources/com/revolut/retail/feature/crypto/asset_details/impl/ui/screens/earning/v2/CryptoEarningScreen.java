package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.q0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewProductDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto.asset_details.impl.R$id;
import com.revolut.retail.feature.crypto.asset_details.impl.R$layout;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import l9j.b;
import l9j.c;
import l9j.d;
import l9j.i;
import q8j.f;
import te0.w;
import vc.s;
import x8j.o;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/impl/ui/screens/earning/v2/CryptoEarningScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ll9j/i;", "Lx8j/o;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoEarningScreen extends ViewController<q> implements dli.a, o {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CryptoEarningScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/crypto/asset_details/impl/databinding/ScreenCryptoInvestmentDetailsBinding;", 0))};
    public final CellDetailsDelegate K;
    public final ListSubheaderDelegate L;
    public final CellDetailsActionDelegate M;
    public final CellDetailsChevronDelegate N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final int R;
    public final Object S;

    public CryptoEarningScreen(StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        this.K = new CellDetailsDelegate();
        this.L = new ListSubheaderDelegate();
        this.M = new CellDetailsActionDelegate();
        this.N = new CellDetailsChevronDelegate();
        this.O = s.t(this, b.f);
        this.P = w.y0(new kpl.b(this, stakingPocket, 21));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: l9j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoEarningScreen f193253b;

            {
                this.f193253b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoEarningScreen.T;
                        return (h) ((q8j.f) this.f193253b.P.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoEarningScreen.T;
                        int i2 = R$id.cryptoInvestmentDetails_recycler;
                        CryptoEarningScreen cryptoEarningScreen = this.f193253b;
                        return dli.f.a(cryptoEarningScreen, cryptoEarningScreen.d(), v.k(new HeaderDelegate(), new NewProductDelegate(), new CounterTextDelegate(), new HeaderLoadingDelegate(), cryptoEarningScreen.K, cryptoEarningScreen.M, cryptoEarningScreen.L, new RowDelegate(null, null, 7), cryptoEarningScreen.N, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate()), i2, null, null, null, 56);
                }
            }
        });
        this.R = R$layout.screen_crypto_investment_details;
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: l9j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoEarningScreen f193253b;

            {
                this.f193253b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoEarningScreen.T;
                        return (h) ((q8j.f) this.f193253b.P.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoEarningScreen.T;
                        int i22 = R$id.cryptoInvestmentDetails_recycler;
                        CryptoEarningScreen cryptoEarningScreen = this.f193253b;
                        return dli.f.a(cryptoEarningScreen, cryptoEarningScreen.d(), v.k(new HeaderDelegate(), new NewProductDelegate(), new CounterTextDelegate(), new HeaderLoadingDelegate(), cryptoEarningScreen.K, cryptoEarningScreen.M, cryptoEarningScreen.L, new RowDelegate(null, null, 7), cryptoEarningScreen.N, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate()), i22, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f192999c;
        navBarWithToolbar.setTitle(uiState.f193260a, null);
        navBarWithToolbar.setEndIconImage(uiState.f193262c);
        navBarWithToolbar.setMenuItems(uiState.d);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f193261b);
        ButtonsActionsView cryptoInvestmentDetailsButtonsActions = d3().f192998b;
        Intrinsics.checkNotNullExpressionValue(cryptoInvestmentDetailsButtonsActions, "cryptoInvestmentDetailsButtonsActions");
        q0 q0Var = uiState.e;
        cryptoInvestmentDetailsButtonsActions.setVisibility(q0Var != null ? 0 : 8);
        if (q0Var != null) {
            d3().f192998b.b(q0Var);
        }
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    @Override // x8j.o
    public final Flow N1() {
        return vkm.i.f290039a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.P.getValue();
    }

    @Override // x8j.o
    public final Flow S1() {
        return rd0.e.b(d3().f192998b.e.f121375b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f192999c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f192999c.f59410q), null, new ko2.b(this, continuation, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f192999c.o.f57403b), null, new l1g.e(this, continuation, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.e), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new l9j.e(this, null), 3);
    }

    public final l8j.a d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l8j.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l9j.h d() {
        return (l9j.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
