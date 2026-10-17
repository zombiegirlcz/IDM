package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.TransferReviewSubmitContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.TransferReviewSubmitScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import k7c.l0;
import kaf.c;
import kaf.d;
import kaf.f;
import kaf.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.i;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/transfer_review_submit/TransferReviewSubmitScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkaf/c;", "Ldli/a;", "Lkaf/d;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReviewSubmitScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TransferReviewSubmitScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final TransferBroker K;
    public final TransferUserAccountInformation L;
    public final List M;
    public final String N;
    public final h O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TransferReviewSubmitScreen(TransferBroker broker, TransferUserAccountInformation userAccountInformation, List selectedAssets, String tradingAccountId) {
        Intrinsics.checkNotNullParameter(broker, "broker");
        Intrinsics.checkNotNullParameter(userAccountInformation, "userAccountInformation");
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        this.K = broker;
        this.L = userAccountInformation;
        this.M = selectedAssets;
        this.N = tradingAccountId;
        this.O = s.t(this, f.f);
        this.P = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: kaf.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReviewSubmitScreen f182487b;

            {
                this.f182487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferReviewSubmitScreen transferReviewSubmitScreen = this.f182487b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReviewSubmitScreen.T;
                        qji.b bVarU2 = transferReviewSubmitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.di.TransferReviewSubmitScreenInjector");
                        i iVar = (i) bVarU2;
                        return new l9f.s(iVar.f193177b, iVar.f193178c, new TransferReviewSubmitContract$InputData(transferReviewSubmitScreen.K, transferReviewSubmitScreen.L, transferReviewSubmitScreen.M, transferReviewSubmitScreen.N));
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReviewSubmitScreen.T;
                        return (g) ((l9f.s) transferReviewSubmitScreen.Q.getValue()).f193221c.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferReviewSubmitScreen.T;
                        TransferReviewSubmitScreen transferReviewSubmitScreen2 = this.f182487b;
                        return dli.f.a(transferReviewSubmitScreen2, (g) transferReviewSubmitScreen2.R.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: kaf.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReviewSubmitScreen f182487b;

            {
                this.f182487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferReviewSubmitScreen transferReviewSubmitScreen = this.f182487b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReviewSubmitScreen.T;
                        qji.b bVarU2 = transferReviewSubmitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.di.TransferReviewSubmitScreenInjector");
                        i iVar = (i) bVarU2;
                        return new l9f.s(iVar.f193177b, iVar.f193178c, new TransferReviewSubmitContract$InputData(transferReviewSubmitScreen.K, transferReviewSubmitScreen.L, transferReviewSubmitScreen.M, transferReviewSubmitScreen.N));
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReviewSubmitScreen.T;
                        return (g) ((l9f.s) transferReviewSubmitScreen.Q.getValue()).f193221c.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferReviewSubmitScreen.T;
                        TransferReviewSubmitScreen transferReviewSubmitScreen2 = this.f182487b;
                        return dli.f.a(transferReviewSubmitScreen2, (g) transferReviewSubmitScreen2.R.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: kaf.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReviewSubmitScreen f182487b;

            {
                this.f182487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferReviewSubmitScreen transferReviewSubmitScreen = this.f182487b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReviewSubmitScreen.T;
                        qji.b bVarU2 = transferReviewSubmitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.di.TransferReviewSubmitScreenInjector");
                        i iVar = (i) bVarU2;
                        return new l9f.s(iVar.f193177b, iVar.f193178c, new TransferReviewSubmitContract$InputData(transferReviewSubmitScreen.K, transferReviewSubmitScreen.L, transferReviewSubmitScreen.M, transferReviewSubmitScreen.N));
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReviewSubmitScreen.T;
                        return (g) ((l9f.s) transferReviewSubmitScreen.Q.getValue()).f193221c.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferReviewSubmitScreen.T;
                        TransferReviewSubmitScreen transferReviewSubmitScreen2 = this.f182487b;
                        return dli.f.a(transferReviewSubmitScreen2, (g) transferReviewSubmitScreen2.R.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        twinHorizontalButton.setPrimaryButtonEnabled(uiState.f182484a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l9f.s) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_header_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_header_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_submit, null, null, 14));
        twinHorizontalButton.setGradientBackgroundEnabled(true);
        twinHorizontalButton.setSecondaryButtonVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174567b.f59410q), new k22.c(this, null, 15), 3);
        ViewController.P2(this, rd0.e.b(d3().d.c()), new l0(this, null, 7), 3);
    }

    public final jii.v d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.v) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
