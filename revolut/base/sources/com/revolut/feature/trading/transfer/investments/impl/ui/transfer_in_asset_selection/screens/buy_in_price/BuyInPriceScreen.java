package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price;

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
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.trading.transfer.investments.impl.R$id;
import com.revolut.feature.trading.transfer.investments.impl.R$layout;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import dli.a;
import ej0.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.x;
import l9f.y;
import sy6.j;
import t9f.c;
import t9f.d;
import t9f.f;
import t9f.k;
import t9f.l;
import t9f.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/screens/buy_in_price/BuyInPriceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt9f/k;", "Ldli/a;", "Lt9f/m;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BuyInPriceScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(BuyInPriceScreen.class, "binding", "getBinding()Lcom/revolut/feature/trading/transfer/investments/impl/databinding/ScreenBuyInPriceBinding;", 0))};
    public final TransferInInstrument K;
    public final b L;
    public final boolean M;
    public final h N;
    public final CenteredAmountDelegate O;
    public final LargeActionButtonDelegate P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public BuyInPriceScreen(TransferInInstrument selectedInstrument, b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(selectedInstrument, "selectedInstrument");
        this.K = selectedInstrument;
        this.L = bVar;
        this.M = z;
        this.N = s.t(this, c.f);
        this.O = new CenteredAmountDelegate(new suf.a(this, 29));
        this.P = new LargeActionButtonDelegate();
        this.Q = R$layout.screen_buy_in_price;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: t9f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyInPriceScreen f269015b;

            {
                this.f269015b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BuyInPriceScreen buyInPriceScreen = this.f269015b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BuyInPriceScreen.V;
                        qji.b bVarU2 = buyInPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.di.BuyInPriceScreenComponentInjector");
                        x xVarB = ((u9f.a) bVarU2).b();
                        BuyInPriceScreenContract$InputData buyInPriceScreenContract$InputData = new BuyInPriceScreenContract$InputData(buyInPriceScreen.K, buyInPriceScreen.L, buyInPriceScreen.M);
                        switch (xVarB.f193234a) {
                            case 0:
                                xVarB.d = buyInPriceScreenContract$InputData;
                                break;
                            default:
                                xVarB.d = buyInPriceScreenContract$InputData;
                                break;
                        }
                        return (y) ((x) xVarB.mo3808a(buyInPriceScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BuyInPriceScreen.V;
                        y yVar = (y) buyInPriceScreen.R.getValue();
                        switch (yVar.f193237a) {
                            case 0:
                                return (l) yVar.i.get();
                            default:
                                return (l) yVar.i.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = BuyInPriceScreen.V;
                        y yVar2 = (y) buyInPriceScreen.R.getValue();
                        switch (yVar2.f193237a) {
                            case 0:
                                return (j60.a) yVar2.f.get();
                            default:
                                return (j60.a) yVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = BuyInPriceScreen.V;
                        BuyInPriceScreen buyInPriceScreen2 = this.f269015b;
                        return dli.f.a(buyInPriceScreen2, buyInPriceScreen2.R2(), u.c(buyInPriceScreen2.O), R$id.screenBuyInPrice_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: t9f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyInPriceScreen f269015b;

            {
                this.f269015b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BuyInPriceScreen buyInPriceScreen = this.f269015b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BuyInPriceScreen.V;
                        qji.b bVarU2 = buyInPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.di.BuyInPriceScreenComponentInjector");
                        x xVarB = ((u9f.a) bVarU2).b();
                        BuyInPriceScreenContract$InputData buyInPriceScreenContract$InputData = new BuyInPriceScreenContract$InputData(buyInPriceScreen.K, buyInPriceScreen.L, buyInPriceScreen.M);
                        switch (xVarB.f193234a) {
                            case 0:
                                xVarB.d = buyInPriceScreenContract$InputData;
                                break;
                            default:
                                xVarB.d = buyInPriceScreenContract$InputData;
                                break;
                        }
                        return (y) ((x) xVarB.mo3808a(buyInPriceScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BuyInPriceScreen.V;
                        y yVar = (y) buyInPriceScreen.R.getValue();
                        switch (yVar.f193237a) {
                            case 0:
                                return (l) yVar.i.get();
                            default:
                                return (l) yVar.i.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = BuyInPriceScreen.V;
                        y yVar2 = (y) buyInPriceScreen.R.getValue();
                        switch (yVar2.f193237a) {
                            case 0:
                                return (j60.a) yVar2.f.get();
                            default:
                                return (j60.a) yVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = BuyInPriceScreen.V;
                        BuyInPriceScreen buyInPriceScreen2 = this.f269015b;
                        return dli.f.a(buyInPriceScreen2, buyInPriceScreen2.R2(), u.c(buyInPriceScreen2.O), R$id.screenBuyInPrice_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: t9f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyInPriceScreen f269015b;

            {
                this.f269015b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BuyInPriceScreen buyInPriceScreen = this.f269015b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BuyInPriceScreen.V;
                        qji.b bVarU2 = buyInPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.di.BuyInPriceScreenComponentInjector");
                        x xVarB = ((u9f.a) bVarU2).b();
                        BuyInPriceScreenContract$InputData buyInPriceScreenContract$InputData = new BuyInPriceScreenContract$InputData(buyInPriceScreen.K, buyInPriceScreen.L, buyInPriceScreen.M);
                        switch (xVarB.f193234a) {
                            case 0:
                                xVarB.d = buyInPriceScreenContract$InputData;
                                break;
                            default:
                                xVarB.d = buyInPriceScreenContract$InputData;
                                break;
                        }
                        return (y) ((x) xVarB.mo3808a(buyInPriceScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BuyInPriceScreen.V;
                        y yVar = (y) buyInPriceScreen.R.getValue();
                        switch (yVar.f193237a) {
                            case 0:
                                return (l) yVar.i.get();
                            default:
                                return (l) yVar.i.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = BuyInPriceScreen.V;
                        y yVar2 = (y) buyInPriceScreen.R.getValue();
                        switch (yVar2.f193237a) {
                            case 0:
                                return (j60.a) yVar2.f.get();
                            default:
                                return (j60.a) yVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = BuyInPriceScreen.V;
                        BuyInPriceScreen buyInPriceScreen2 = this.f269015b;
                        return dli.f.a(buyInPriceScreen2, buyInPriceScreen2.R2(), u.c(buyInPriceScreen2.O), R$id.screenBuyInPrice_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: t9f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyInPriceScreen f269015b;

            {
                this.f269015b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BuyInPriceScreen buyInPriceScreen = this.f269015b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BuyInPriceScreen.V;
                        qji.b bVarU2 = buyInPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.di.BuyInPriceScreenComponentInjector");
                        x xVarB = ((u9f.a) bVarU2).b();
                        BuyInPriceScreenContract$InputData buyInPriceScreenContract$InputData = new BuyInPriceScreenContract$InputData(buyInPriceScreen.K, buyInPriceScreen.L, buyInPriceScreen.M);
                        switch (xVarB.f193234a) {
                            case 0:
                                xVarB.d = buyInPriceScreenContract$InputData;
                                break;
                            default:
                                xVarB.d = buyInPriceScreenContract$InputData;
                                break;
                        }
                        return (y) ((x) xVarB.mo3808a(buyInPriceScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BuyInPriceScreen.V;
                        y yVar = (y) buyInPriceScreen.R.getValue();
                        switch (yVar.f193237a) {
                            case 0:
                                return (l) yVar.i.get();
                            default:
                                return (l) yVar.i.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = BuyInPriceScreen.V;
                        y yVar2 = (y) buyInPriceScreen.R.getValue();
                        switch (yVar2.f193237a) {
                            case 0:
                                return (j60.a) yVar2.f.get();
                            default:
                                return (j60.a) yVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = BuyInPriceScreen.V;
                        BuyInPriceScreen buyInPriceScreen2 = this.f269015b;
                        return dli.f.a(buyInPriceScreen2, buyInPriceScreen2.R2(), u.c(buyInPriceScreen2.O), R$id.screenBuyInPrice_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinHorizontalButton screenBuyInPriceTwinHorizontalButton = d3().f182330c;
        Intrinsics.checkNotNullExpressionValue(screenBuyInPriceTwinHorizontalButton, "screenBuyInPriceTwinHorizontalButton");
        screenBuyInPriceTwinHorizontalButton.setSecondaryButtonEnabled(uiState.f269023a);
        screenBuyInPriceTwinHorizontalButton.setPrimaryButtonVisible(uiState.f269024b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar screenBuyInPriceNavBarWithAvatar = d3().f182329b;
        Intrinsics.checkNotNullExpressionValue(screenBuyInPriceNavBarWithAvatar, "screenBuyInPriceNavBarWithAvatar");
        screenBuyInPriceNavBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        screenBuyInPriceNavBarWithAvatar.setModel(new j8(new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_price_header_title, null, null, 14), null, new InstrumentImage(this.K.f91506a, 30, null, null), null, 24));
        TwinHorizontalButton screenBuyInPriceTwinHorizontalButton = d3().f182330c;
        Intrinsics.checkNotNullExpressionValue(screenBuyInPriceTwinHorizontalButton, "screenBuyInPriceTwinHorizontalButton");
        screenBuyInPriceTwinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_price_action_skip, null, null, 14));
        screenBuyInPriceTwinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        screenBuyInPriceTwinHorizontalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_price_action_continue, null, null, 14));
        screenBuyInPriceTwinHorizontalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        screenBuyInPriceTwinHorizontalButton.setSecondaryButtonVisible(true);
        screenBuyInPriceTwinHorizontalButton.setGradientBackgroundEnabled(true);
        ((j60.a) this.T.getValue()).d(u.c(this.P));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f182329b.f59338a), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f182330c.c()), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f182330c.d()), new d(this, null, 2), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.O;
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.d.f121375b), new j(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), new t9f.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new f(this, null), 3);
    }

    public final k9f.a d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k9f.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
