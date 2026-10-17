package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import iaf.c;
import iaf.d;
import iaf.l;
import iaf.m;
import iaf.n;
import jii.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.g;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/selected_assets/SelectedAssetsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liaf/l;", "Ldli/a;", "Liaf/n;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectedAssetsListScreen extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SelectedAssetsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final TransferBroker K;
    public final String L;
    public final h M;
    public final RowDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public SelectedAssetsListScreen(TransferBroker broker, String tradingAccountId) {
        Intrinsics.checkNotNullParameter(broker, "broker");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        this.K = broker;
        this.L = tradingAccountId;
        this.M = s.t(this, c.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: iaf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectedAssetsListScreen f159998b;

            {
                this.f159998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectedAssetsListScreen selectedAssetsListScreen = this.f159998b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectedAssetsListScreen.T;
                        qji.b bVarU2 = selectedAssetsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.di.SelectedAssetsListScreenInjector");
                        l9f.i iVar = (l9f.i) bVarU2;
                        return new l9f.g(iVar.f193177b, iVar.f193178c, selectedAssetsListScreen, new SelectedAssetsListScreenContract$InputData(selectedAssetsListScreen.K, selectedAssetsListScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = SelectedAssetsListScreen.T;
                        return (m) ((l9f.g) selectedAssetsListScreen.P.getValue()).f193172g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SelectedAssetsListScreen.T;
                        return (j60.a) ((l9f.g) selectedAssetsListScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = SelectedAssetsListScreen.T;
                        SelectedAssetsListScreen selectedAssetsListScreen2 = this.f159998b;
                        return dli.f.a(selectedAssetsListScreen2, (m) selectedAssetsListScreen2.Q.getValue(), u.c(selectedAssetsListScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: iaf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectedAssetsListScreen f159998b;

            {
                this.f159998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectedAssetsListScreen selectedAssetsListScreen = this.f159998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectedAssetsListScreen.T;
                        qji.b bVarU2 = selectedAssetsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.di.SelectedAssetsListScreenInjector");
                        l9f.i iVar = (l9f.i) bVarU2;
                        return new l9f.g(iVar.f193177b, iVar.f193178c, selectedAssetsListScreen, new SelectedAssetsListScreenContract$InputData(selectedAssetsListScreen.K, selectedAssetsListScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = SelectedAssetsListScreen.T;
                        return (m) ((l9f.g) selectedAssetsListScreen.P.getValue()).f193172g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SelectedAssetsListScreen.T;
                        return (j60.a) ((l9f.g) selectedAssetsListScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = SelectedAssetsListScreen.T;
                        SelectedAssetsListScreen selectedAssetsListScreen2 = this.f159998b;
                        return dli.f.a(selectedAssetsListScreen2, (m) selectedAssetsListScreen2.Q.getValue(), u.c(selectedAssetsListScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: iaf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectedAssetsListScreen f159998b;

            {
                this.f159998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectedAssetsListScreen selectedAssetsListScreen = this.f159998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectedAssetsListScreen.T;
                        qji.b bVarU2 = selectedAssetsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.di.SelectedAssetsListScreenInjector");
                        l9f.i iVar = (l9f.i) bVarU2;
                        return new l9f.g(iVar.f193177b, iVar.f193178c, selectedAssetsListScreen, new SelectedAssetsListScreenContract$InputData(selectedAssetsListScreen.K, selectedAssetsListScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = SelectedAssetsListScreen.T;
                        return (m) ((l9f.g) selectedAssetsListScreen.P.getValue()).f193172g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SelectedAssetsListScreen.T;
                        return (j60.a) ((l9f.g) selectedAssetsListScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = SelectedAssetsListScreen.T;
                        SelectedAssetsListScreen selectedAssetsListScreen2 = this.f159998b;
                        return dli.f.a(selectedAssetsListScreen2, (m) selectedAssetsListScreen2.Q.getValue(), u.c(selectedAssetsListScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: iaf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectedAssetsListScreen f159998b;

            {
                this.f159998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SelectedAssetsListScreen selectedAssetsListScreen = this.f159998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectedAssetsListScreen.T;
                        qji.b bVarU2 = selectedAssetsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.di.SelectedAssetsListScreenInjector");
                        l9f.i iVar = (l9f.i) bVarU2;
                        return new l9f.g(iVar.f193177b, iVar.f193178c, selectedAssetsListScreen, new SelectedAssetsListScreenContract$InputData(selectedAssetsListScreen.K, selectedAssetsListScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = SelectedAssetsListScreen.T;
                        return (m) ((l9f.g) selectedAssetsListScreen.P.getValue()).f193172g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SelectedAssetsListScreen.T;
                        return (j60.a) ((l9f.g) selectedAssetsListScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = SelectedAssetsListScreen.T;
                        SelectedAssetsListScreen selectedAssetsListScreen2 = this.f159998b;
                        return dli.f.a(selectedAssetsListScreen2, (m) selectedAssetsListScreen2.Q.getValue(), u.c(selectedAssetsListScreen2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        twinHorizontalButton.setPrimaryButtonEnabled(uiState.f160007a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (m) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_header_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_continue, null, null, 14));
        twinHorizontalButton.setGradientBackgroundEnabled(true);
        twinHorizontalButton.setSecondaryButtonVisible(false);
        ((j60.a) this.R.getValue()).d(u.c(this.N));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174567b.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new iaf.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.c()), new hy2.e(this, null, 19), 3);
    }

    public final v d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
