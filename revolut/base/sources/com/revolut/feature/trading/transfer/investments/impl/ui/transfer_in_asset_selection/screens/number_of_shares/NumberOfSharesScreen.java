package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.j8;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.trading.transfer.investments.impl.R$id;
import com.revolut.feature.trading.transfer.investments.impl.R$layout;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import dli.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.f;
import te0.w;
import vc.s;
import x9f.b;
import x9f.c;
import x9f.d;
import x9f.j;
import x9f.k;
import x9f.l;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/screens/number_of_shares/NumberOfSharesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lx9f/j;", "Ldli/a;", "Lx9f/l;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NumberOfSharesScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(NumberOfSharesScreen.class, "binding", "getBinding()Lcom/revolut/feature/trading/transfer/investments/impl/databinding/ScreenNumberOfSharesBinding;", 0))};
    public final TransferInInstrument K;
    public final Integer L;
    public final h M;
    public final CenteredAmountDelegate N;
    public final LargeActionButtonDelegate O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public NumberOfSharesScreen(TransferInInstrument selectedInstrument, Integer num) {
        Intrinsics.checkNotNullParameter(selectedInstrument, "selectedInstrument");
        this.K = selectedInstrument;
        this.L = num;
        this.M = s.t(this, b.f);
        this.N = new CenteredAmountDelegate(null);
        this.O = new LargeActionButtonDelegate();
        this.P = R$layout.screen_number_of_shares;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: x9f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NumberOfSharesScreen f303700b;

            {
                this.f303700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NumberOfSharesScreen numberOfSharesScreen = this.f303700b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NumberOfSharesScreen.U;
                        qji.b bVarU2 = numberOfSharesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.di.NumberOfSharesScreenComponentInjector");
                        l9f.h hVar = (l9f.h) bVarU2;
                        return new l9f.f(hVar.f193174b, hVar.f193175c, numberOfSharesScreen, new NumberOfSharesScreenContract$InputData(numberOfSharesScreen.K, numberOfSharesScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = NumberOfSharesScreen.U;
                        return (k) ((l9f.f) numberOfSharesScreen.Q.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = NumberOfSharesScreen.U;
                        return (j60.a) ((l9f.f) numberOfSharesScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = NumberOfSharesScreen.U;
                        NumberOfSharesScreen numberOfSharesScreen2 = this.f303700b;
                        return dli.f.a(numberOfSharesScreen2, numberOfSharesScreen2.d(), u.c(numberOfSharesScreen2.N), R$id.screenNumberOfShares_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: x9f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NumberOfSharesScreen f303700b;

            {
                this.f303700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NumberOfSharesScreen numberOfSharesScreen = this.f303700b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NumberOfSharesScreen.U;
                        qji.b bVarU2 = numberOfSharesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.di.NumberOfSharesScreenComponentInjector");
                        l9f.h hVar = (l9f.h) bVarU2;
                        return new l9f.f(hVar.f193174b, hVar.f193175c, numberOfSharesScreen, new NumberOfSharesScreenContract$InputData(numberOfSharesScreen.K, numberOfSharesScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = NumberOfSharesScreen.U;
                        return (k) ((l9f.f) numberOfSharesScreen.Q.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = NumberOfSharesScreen.U;
                        return (j60.a) ((l9f.f) numberOfSharesScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = NumberOfSharesScreen.U;
                        NumberOfSharesScreen numberOfSharesScreen2 = this.f303700b;
                        return dli.f.a(numberOfSharesScreen2, numberOfSharesScreen2.d(), u.c(numberOfSharesScreen2.N), R$id.screenNumberOfShares_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: x9f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NumberOfSharesScreen f303700b;

            {
                this.f303700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NumberOfSharesScreen numberOfSharesScreen = this.f303700b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NumberOfSharesScreen.U;
                        qji.b bVarU2 = numberOfSharesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.di.NumberOfSharesScreenComponentInjector");
                        l9f.h hVar = (l9f.h) bVarU2;
                        return new l9f.f(hVar.f193174b, hVar.f193175c, numberOfSharesScreen, new NumberOfSharesScreenContract$InputData(numberOfSharesScreen.K, numberOfSharesScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = NumberOfSharesScreen.U;
                        return (k) ((l9f.f) numberOfSharesScreen.Q.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = NumberOfSharesScreen.U;
                        return (j60.a) ((l9f.f) numberOfSharesScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = NumberOfSharesScreen.U;
                        NumberOfSharesScreen numberOfSharesScreen2 = this.f303700b;
                        return dli.f.a(numberOfSharesScreen2, numberOfSharesScreen2.d(), u.c(numberOfSharesScreen2.N), R$id.screenNumberOfShares_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: x9f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NumberOfSharesScreen f303700b;

            {
                this.f303700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                NumberOfSharesScreen numberOfSharesScreen = this.f303700b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NumberOfSharesScreen.U;
                        qji.b bVarU2 = numberOfSharesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.di.NumberOfSharesScreenComponentInjector");
                        l9f.h hVar = (l9f.h) bVarU2;
                        return new l9f.f(hVar.f193174b, hVar.f193175c, numberOfSharesScreen, new NumberOfSharesScreenContract$InputData(numberOfSharesScreen.K, numberOfSharesScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = NumberOfSharesScreen.U;
                        return (k) ((l9f.f) numberOfSharesScreen.Q.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = NumberOfSharesScreen.U;
                        return (j60.a) ((l9f.f) numberOfSharesScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = NumberOfSharesScreen.U;
                        NumberOfSharesScreen numberOfSharesScreen2 = this.f303700b;
                        return dli.f.a(numberOfSharesScreen2, numberOfSharesScreen2.d(), u.c(numberOfSharesScreen2.N), R$id.screenNumberOfShares_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton screenNumberOfSharesGoToButton = d3().f182332b;
        Intrinsics.checkNotNullExpressionValue(screenNumberOfSharesGoToButton, "screenNumberOfSharesGoToButton");
        screenNumberOfSharesGoToButton.setEnabled(uiState.f303707a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar screenNumberOfSharesNavBarWithAvatar = d3().f182333c;
        Intrinsics.checkNotNullExpressionValue(screenNumberOfSharesNavBarWithAvatar, "screenNumberOfSharesNavBarWithAvatar");
        screenNumberOfSharesNavBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        int i = R$string.trading_stocks_transfer_in_asset_amount_header_title;
        TransferInInstrument transferInInstrument = this.K;
        String upperCase = transferInInstrument.f91508c.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        screenNumberOfSharesNavBarWithAvatar.setModel(new j8(new TextLocalisedClause(i, u.c(upperCase), null, 12), null, new InstrumentImage(transferInInstrument.f91506a, 30, null, null), null, 24));
        LargeActionButton screenNumberOfSharesGoToButton = d3().f182332b;
        Intrinsics.checkNotNullExpressionValue(screenNumberOfSharesGoToButton, "screenNumberOfSharesGoToButton");
        screenNumberOfSharesGoToButton.setText(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_continue, null, null, 14));
        ((j60.a) this.S.getValue()).d(u.c(this.O));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f182333c.f59338a), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f182332b.o), new c(this, null, 1), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.N;
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.d.f121375b), new x64.b(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new x9f.e(this, null), 3);
    }

    public final k9f.b d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k9f.b) value;
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
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
