package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection;

import a09.b;
import abf.d;
import abf.f;
import abf.g;
import abf.k;
import abf.l;
import abf.m;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/asset_selection/TransferOutAssetSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Labf/k;", "Ldli/a;", "Labf/m;", "Companion", "a", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferOutAssetSelectionScreen extends ViewController<k> implements a {
    public final String K;
    public final int L;
    public final h M;
    public final SelectableDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransferOutAssetSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TransferOutAssetSelectionScreen(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.K = accountId;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, d.f);
        this.N = new SelectableDelegate(new RowDelegate(null, new b(this, 26), 5));
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: abf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutAssetSelectionScreen f2947b;

            {
                this.f2947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferOutAssetSelectionScreen transferOutAssetSelectionScreen = this.f2947b;
                switch (i2) {
                    case 0:
                        TransferOutAssetSelectionScreen.Companion companion = TransferOutAssetSelectionScreen.INSTANCE;
                        qji.b bVarU2 = transferOutAssetSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.di.TransferOutAssetSelectionScreenInjector");
                        l9f.o oVar = (l9f.o) bVarU2;
                        return new l9f.m(oVar.f193206b, oVar.f193207c, new TransferOutAssetSelectionScreenContract$InputData(transferOutAssetSelectionScreen.K));
                    case 1:
                        TransferOutAssetSelectionScreen.Companion companion2 = TransferOutAssetSelectionScreen.INSTANCE;
                        return (l) ((l9f.m) transferOutAssetSelectionScreen.P.getValue()).f193203b.get();
                    default:
                        TransferOutAssetSelectionScreen.Companion companion3 = TransferOutAssetSelectionScreen.INSTANCE;
                        TransferOutAssetSelectionScreen transferOutAssetSelectionScreen2 = this.f2947b;
                        return dli.f.a(transferOutAssetSelectionScreen2, transferOutAssetSelectionScreen2.R2(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), transferOutAssetSelectionScreen2.N, transferOutAssetSelectionScreen2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: abf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutAssetSelectionScreen f2947b;

            {
                this.f2947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferOutAssetSelectionScreen transferOutAssetSelectionScreen = this.f2947b;
                switch (i22) {
                    case 0:
                        TransferOutAssetSelectionScreen.Companion companion = TransferOutAssetSelectionScreen.INSTANCE;
                        qji.b bVarU2 = transferOutAssetSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.di.TransferOutAssetSelectionScreenInjector");
                        l9f.o oVar = (l9f.o) bVarU2;
                        return new l9f.m(oVar.f193206b, oVar.f193207c, new TransferOutAssetSelectionScreenContract$InputData(transferOutAssetSelectionScreen.K));
                    case 1:
                        TransferOutAssetSelectionScreen.Companion companion2 = TransferOutAssetSelectionScreen.INSTANCE;
                        return (l) ((l9f.m) transferOutAssetSelectionScreen.P.getValue()).f193203b.get();
                    default:
                        TransferOutAssetSelectionScreen.Companion companion3 = TransferOutAssetSelectionScreen.INSTANCE;
                        TransferOutAssetSelectionScreen transferOutAssetSelectionScreen2 = this.f2947b;
                        return dli.f.a(transferOutAssetSelectionScreen2, transferOutAssetSelectionScreen2.R2(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), transferOutAssetSelectionScreen2.N, transferOutAssetSelectionScreen2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: abf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutAssetSelectionScreen f2947b;

            {
                this.f2947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferOutAssetSelectionScreen transferOutAssetSelectionScreen = this.f2947b;
                switch (i22) {
                    case 0:
                        TransferOutAssetSelectionScreen.Companion companion = TransferOutAssetSelectionScreen.INSTANCE;
                        qji.b bVarU2 = transferOutAssetSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.di.TransferOutAssetSelectionScreenInjector");
                        l9f.o oVar = (l9f.o) bVarU2;
                        return new l9f.m(oVar.f193206b, oVar.f193207c, new TransferOutAssetSelectionScreenContract$InputData(transferOutAssetSelectionScreen.K));
                    case 1:
                        TransferOutAssetSelectionScreen.Companion companion2 = TransferOutAssetSelectionScreen.INSTANCE;
                        return (l) ((l9f.m) transferOutAssetSelectionScreen.P.getValue()).f193203b.get();
                    default:
                        TransferOutAssetSelectionScreen.Companion companion3 = TransferOutAssetSelectionScreen.INSTANCE;
                        TransferOutAssetSelectionScreen transferOutAssetSelectionScreen2 = this.f2947b;
                        return dli.f.a(transferOutAssetSelectionScreen2, transferOutAssetSelectionScreen2.R2(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), transferOutAssetSelectionScreen2.N, transferOutAssetSelectionScreen2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174533b.setModel(uiState.f2955a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l9f.m) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setTitleAutoSize(false);
        screenRecyclerNavbarActionFooterNavBar.setHeaderTitleMode(j0.MULTILINE);
        screenRecyclerNavbarActionFooterNavBar.setTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_out_confirmation_header_title, null, null, 14), null);
        screenRecyclerNavbarActionFooterNavBar.setToolbarTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_out_confirmation_header_title, null, null, 14));
        screenRecyclerNavbarActionFooterNavBar.setSecondDescriptionText(new TextLocalisedClause(R$string.trading_stocks_transfer_out_confirmation_header_subtitle, null, null, 14));
        screenRecyclerNavbarActionFooterNavBar.setSecondDescriptionVisible(true);
        screenRecyclerNavbarActionFooterNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
        y.g(screenRecyclerNavbarActionFooterRecyclerView, m2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new abf.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new abf.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.r()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new g(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
