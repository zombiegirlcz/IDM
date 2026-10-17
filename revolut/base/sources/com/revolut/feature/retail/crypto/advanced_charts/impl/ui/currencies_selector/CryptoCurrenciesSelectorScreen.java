package com.revolut.feature.retail.crypto.advanced_charts.impl.ui.currencies_selector;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.crypto.advanced_charts.api.R$string;
import com.revolut.feature.retail.crypto.advanced_charts.impl.ui.currencies_selector.CryptoCurrenciesSelectorScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t8b.a;
import te0.w;
import vc.s;
import xki.e;
import z8b.b;
import z8b.c;
import z8b.d;
import z8b.f;
import z8b.i;
import z8b.j;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/crypto/advanced_charts/impl/ui/currencies_selector/CryptoCurrenciesSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt8b/a;", "Ldli/a;", "Lz8b/i;", "feature_retail_crypto_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCurrenciesSelectorScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CryptoCurrenciesSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public boolean O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final SelectableDelegate R;
    public final Object S;

    public CryptoCurrenciesSelectorScreen(z8b.h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = w.y0(new ywi.b(this, inputData, 16));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: z8b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCurrenciesSelectorScreen f320055b;

            {
                this.f320055b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCurrenciesSelectorScreen.T;
                        return (j) ((u8b.b) this.f320055b.M.getValue()).f278153c.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoCurrenciesSelectorScreen.T;
                        CryptoCurrenciesSelectorScreen cryptoCurrenciesSelectorScreen = this.f320055b;
                        return dli.f.a(cryptoCurrenciesSelectorScreen, cryptoCurrenciesSelectorScreen.d(), v.k(new RowLoadingDelegate(), cryptoCurrenciesSelectorScreen.P, cryptoCurrenciesSelectorScreen.Q, cryptoCurrenciesSelectorScreen.R), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        this.R = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: z8b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCurrenciesSelectorScreen f320055b;

            {
                this.f320055b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCurrenciesSelectorScreen.T;
                        return (j) ((u8b.b) this.f320055b.M.getValue()).f278153c.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoCurrenciesSelectorScreen.T;
                        CryptoCurrenciesSelectorScreen cryptoCurrenciesSelectorScreen = this.f320055b;
                        return dli.f.a(cryptoCurrenciesSelectorScreen, cryptoCurrenciesSelectorScreen.d(), v.k(new RowLoadingDelegate(), cryptoCurrenciesSelectorScreen.P, cryptoCurrenciesSelectorScreen.Q, cryptoCurrenciesSelectorScreen.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (this.O) {
            return;
        }
        this.O = true;
        d3().f174565c.K0(j4.NO_ANIMATION);
        d3().f174565c.E0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u8b.b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.crypto_currencies_picker_search_hint, null, null, 14));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_currencies_picker_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSearchButtonActive(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.crypto_currencies_picker_compare_action_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.P.f53218h, new z55.w(16))), new z8b.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.R.r()), new f(this, null), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), new z8b.e(this, continuation, i), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
