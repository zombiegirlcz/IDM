package com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import ce9.r;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.currency_pair.picker.api.R$string;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import ee5.a;
import exe.j;
import ihm.f;
import iqh.d;
import java.util.concurrent.TimeUnit;
import jch.p;
import jcj.n;
import je5.b;
import je5.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/currency_pair/picker/impl/ui/currency_pair_picker/CryptoCurrencyPairPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lee5/a;", "Ldli/a;", "Lje5/m;", "feature_crypto_currency_pair_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCurrencyPairPickerScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CryptoCurrencyPairPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public boolean O;
    public final r P;
    public final RowDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;

    public CryptoCurrencyPairPickerScreen(je5.h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new j68.a(this, inputData, 20));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: je5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCurrencyPairPickerScreen f173213b;

            {
                this.f173213b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCurrencyPairPickerScreen.T;
                        return (f) ((fe5.b) this.f173213b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoCurrencyPairPickerScreen.T;
                        CryptoCurrencyPairPickerScreen cryptoCurrencyPairPickerScreen = this.f173213b;
                        return dli.f.a(cryptoCurrencyPairPickerScreen, cryptoCurrencyPairPickerScreen.R2(), v.k(cryptoCurrencyPairPickerScreen.Q, cryptoCurrencyPairPickerScreen.R, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = new r(new p(this, 9));
        this.Q = new RowDelegate(null, null, 7);
        this.R = new FullScreenStateDelegate();
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: je5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCurrencyPairPickerScreen f173213b;

            {
                this.f173213b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCurrencyPairPickerScreen.T;
                        return (f) ((fe5.b) this.f173213b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoCurrencyPairPickerScreen.T;
                        CryptoCurrencyPairPickerScreen cryptoCurrencyPairPickerScreen = this.f173213b;
                        return dli.f.a(cryptoCurrencyPairPickerScreen, cryptoCurrencyPairPickerScreen.R2(), v.k(cryptoCurrencyPairPickerScreen.Q, cryptoCurrencyPairPickerScreen.R, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (this.O) {
            return;
        }
        this.O = true;
        d3().f174539b.K0(j4.NO_ANIMATION);
        d3().f174539b.E0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fe5.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.crypto_advanced_charts_currency_picker_search_hint, null, null, 14));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_advanced_charts_currency_picker_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSearchButtonActive(true);
        ((c) this.S.getValue()).h().addOnScrollListener(this.P);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new j2c.b(this, continuation, 19), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new je5.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.Q.f53218h, new n(29))), new j82.q(this, continuation, 14), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        f fVar = navBarWithToolbar.f59409p.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ViewController.P2(this, new j(new d(rd0.e.b(w.y(fVar, 400L)), 27), 26), new hp4.e(2, R2(), je5.f.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/crypto/currency_pair/picker/impl/ui/currency_pair_picker/CryptoCurrencyPairPickerScreenContract$UIEvent;)V", 4, 27), 3);
        navBarWithToolbar.post(new cgd.e(navBarWithToolbar, 2));
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final je5.f R2() {
        return (je5.f) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
