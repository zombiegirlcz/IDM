package com.revolut.feature.crypto.exchange.fees.impl.ui;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.impl.R$id;
import com.revolut.feature.crypto.exchange.fees.impl.R$layout;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tf5.f;
import vc.s;
import xki.e;
import zf5.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lski/a;", "Lzf5/i;", "Lcom/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$PagerItem;", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoExchangeFeesController extends ViewController<q> implements ski.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(CryptoExchangeFeesController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/exchange/fees/impl/databinding/ControllerCryptoExchangeFeesBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CryptoExchangeFeesController(lf5.b source, CryptoExchangeFeesMode mode) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.K = s.t(this, zf5.c.f);
        this.L = R$layout.controller_crypto_exchange_fees;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zf5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFeesController f321860b;

            {
                this.f321860b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoExchangeFeesController cryptoExchangeFeesController = this.f321860b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoExchangeFeesController.P;
                        return czi.c.c(cryptoExchangeFeesController, R$id.controllerCryptoExchangeFees_Pager, cryptoExchangeFeesController.d());
                    default:
                        KProperty[] kPropertyArr2 = CryptoExchangeFeesController.P;
                        return (f) ((tf5.f) cryptoExchangeFeesController.N.getValue()).d.get();
                }
            }
        });
        this.N = w.y0(new zf5.b(this, i, source, mode));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zf5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFeesController f321860b;

            {
                this.f321860b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoExchangeFeesController cryptoExchangeFeesController = this.f321860b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoExchangeFeesController.P;
                        return czi.c.c(cryptoExchangeFeesController, R$id.controllerCryptoExchangeFees_Pager, cryptoExchangeFeesController.d());
                    default:
                        KProperty[] kPropertyArr2 = CryptoExchangeFeesController.P;
                        return (f) ((tf5.f) cryptoExchangeFeesController.N.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        zf5.h hVar = qVar instanceof zf5.h ? (zf5.h) qVar : null;
        if (pd.b.k(hVar != null ? Boolean.valueOf(hVar.f321869a) : null)) {
            NavBarWithToolbar controllerCryptoExchangeFeesNavBar = d3().f235471c;
            Intrinsics.checkNotNullExpressionValue(controllerCryptoExchangeFeesNavBar, "controllerCryptoExchangeFeesNavBar");
            controllerCryptoExchangeFeesNavBar.setTitle(uiState.f321872a, null);
        }
        if (pd.b.k(hVar != null ? Boolean.valueOf(hVar.f321870b) : null)) {
            NavBarWithToolbar navBarWithToolbar = d3().f235471c;
            navBarWithToolbar.setSecondDescriptionText(uiState.f321873b);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        }
        if (pd.b.k(hVar != null ? Boolean.valueOf(hVar.f321871c) : null)) {
            d3().d.setItems(uiState.f321874c, uiState.e);
            Tabs controllerCryptoExchangeFeesTabs = d3().d;
            Intrinsics.checkNotNullExpressionValue(controllerCryptoExchangeFeesTabs, "controllerCryptoExchangeFeesTabs");
            controllerCryptoExchangeFeesTabs.setVisibility((uiState.f321874c.isEmpty() || uiState.d) ? 8 : 0);
        }
        if (pd.b.k(hVar != null ? Boolean.valueOf(hVar.d) : null) && uiState.e != null) {
            Tabs controllerCryptoExchangeFeesTabs2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(controllerCryptoExchangeFeesTabs2, "controllerCryptoExchangeFeesTabs");
            Tabs.u(controllerCryptoExchangeFeesTabs2, uiState.e, true, false, false, 12);
        }
        if (pd.b.k(hVar != null ? Boolean.valueOf(hVar.e) : null)) {
            LargeActionButton largeActionButton = d3().f235470b;
            largeActionButton.setText(uiState.f);
            largeActionButton.setVisibility(uiState.f != null ? 0 : 8);
        }
        d3().f235471c.setHeaderDisclaimerSticky(uiState.f321875g);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        CryptoExchangeFeesControllerContract$PagerItem pagerItem2 = (CryptoExchangeFeesControllerContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        c cVar = (c) d();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        cVar.H2(cVar.v, new za9.c(pagerItem2, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f235471c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f235471c.f59410q), new zf5.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f235471c.x0()), new zf5.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b((ihm.f) d3().f235471c.f59406n.f258290b), null, new zf5.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().d.f58882b), new zf5.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f235470b.o), new zf5.d(this, continuation, 1), 3);
    }

    public final pf5.a d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (pf5.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final zf5.f d() {
        return (zf5.f) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ski.c) this.M.getValue();
    }
}
