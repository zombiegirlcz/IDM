package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mta.c;
import mzb.e;
import naf.b;
import naf.g;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_price_update/screens/assets_price_update/AssetsPriceUpdateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lnaf/h;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AssetsPriceUpdateScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AssetsPriceUpdateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RowDelegate K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public AssetsPriceUpdateScreen(AssetsPriceUpdateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new RowDelegate(null, null, 7);
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: naf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetsPriceUpdateScreen f213890b;

            {
                this.f213890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AssetsPriceUpdateScreen.Q;
                        AssetsPriceUpdateScreen assetsPriceUpdateScreen = this.f213890b;
                        return dli.f.a(assetsPriceUpdateScreen, (g) assetsPriceUpdateScreen.P.getValue(), u.c(assetsPriceUpdateScreen.K), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = AssetsPriceUpdateScreen.Q;
                        return (g) ((l9f.a) this.f213890b.O.getValue()).f193141c.get();
                }
            }
        });
        this.O = w.y0(new e(this, inputData, 18));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: naf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetsPriceUpdateScreen f213890b;

            {
                this.f213890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AssetsPriceUpdateScreen.Q;
                        AssetsPriceUpdateScreen assetsPriceUpdateScreen = this.f213890b;
                        return dli.f.a(assetsPriceUpdateScreen, (g) assetsPriceUpdateScreen.P.getValue(), u.c(assetsPriceUpdateScreen.K), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = AssetsPriceUpdateScreen.Q;
                        return (g) ((l9f.a) this.f213890b.O.getValue()).f193141c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((naf.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l9f.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_transferred_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_transferred_header_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new c(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(this.K.f53218h), new naf.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
