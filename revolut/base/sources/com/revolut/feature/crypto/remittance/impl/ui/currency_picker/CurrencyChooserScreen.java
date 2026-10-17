package com.revolut.feature.crypto.remittance.impl.ui.currency_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SeparatorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.remittance.impl.R$id;
import com.revolut.feature.crypto.remittance.impl.R$layout;
import com.revolut.feature.crypto.remittance.impl.R$string;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mk5.b;
import mk5.f;
import mk5.i;
import mk5.j;
import mk5.n;
import mk5.p;
import te0.w;
import tki.c;
import vc.s;
import vj5.d;
import vj5.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/impl/ui/currency_picker/CurrencyChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvj5/g;", "Ltki/c;", "Lmk5/p;", "feature_crypto_remittance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CurrencyChooserScreen extends ViewController<g> implements c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CurrencyChooserScreen.class, "binding", "getBinding()Lcom/revolut/feature/crypto/remittance/impl/databinding/ScreenCryptoCurrencyChooserBinding;", 0))};
    public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public CurrencyChooserScreen(CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_crypto_currency_chooser;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: mk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChooserScreen f206179b;

            {
                this.f206179b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CurrencyChooserScreen currencyChooserScreen = this.f206179b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChooserScreen.W;
                        return (n) ((ak5.n) ((pk5.a) currencyChooserScreen.P.getValue())).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChooserScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChooserScreen.m2()).a().get(ak5.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ak5.j.class, " is not found"));
                        }
                        ak5.j jVar = ((ak5.j) aVar2.b()).f5711n;
                        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData2 = currencyChooserScreen.K;
                        inputData2.getClass();
                        return new ak5.n(jVar, inputData2);
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChooserScreen.W;
                        CurrencyChooserScreen currencyChooserScreen2 = this.f206179b;
                        return tki.g.a(currencyChooserScreen2, currencyChooserScreen2.d(), zhm.v.k((AccountCellItemDelegate) currencyChooserScreen2.R.getValue(), (FullScreenStateDelegate) currencyChooserScreen2.S.getValue(), (RowDelegate) currencyChooserScreen2.T.getValue(), (ListSubheaderDelegate) currencyChooserScreen2.U.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (LargeActionButtonDelegate) currencyChooserScreen2.V.getValue(), new SeparatorDelegate()), R$id.cryptoCurrencyChooser_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: mk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChooserScreen f206179b;

            {
                this.f206179b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CurrencyChooserScreen currencyChooserScreen = this.f206179b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChooserScreen.W;
                        return (n) ((ak5.n) ((pk5.a) currencyChooserScreen.P.getValue())).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChooserScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChooserScreen.m2()).a().get(ak5.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ak5.j.class, " is not found"));
                        }
                        ak5.j jVar = ((ak5.j) aVar2.b()).f5711n;
                        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData2 = currencyChooserScreen.K;
                        inputData2.getClass();
                        return new ak5.n(jVar, inputData2);
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChooserScreen.W;
                        CurrencyChooserScreen currencyChooserScreen2 = this.f206179b;
                        return tki.g.a(currencyChooserScreen2, currencyChooserScreen2.d(), zhm.v.k((AccountCellItemDelegate) currencyChooserScreen2.R.getValue(), (FullScreenStateDelegate) currencyChooserScreen2.S.getValue(), (RowDelegate) currencyChooserScreen2.T.getValue(), (ListSubheaderDelegate) currencyChooserScreen2.U.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (LargeActionButtonDelegate) currencyChooserScreen2.V.getValue(), new SeparatorDelegate()), R$id.cryptoCurrencyChooser_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: mk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChooserScreen f206179b;

            {
                this.f206179b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CurrencyChooserScreen currencyChooserScreen = this.f206179b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChooserScreen.W;
                        return (n) ((ak5.n) ((pk5.a) currencyChooserScreen.P.getValue())).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChooserScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChooserScreen.m2()).a().get(ak5.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ak5.j.class, " is not found"));
                        }
                        ak5.j jVar = ((ak5.j) aVar2.b()).f5711n;
                        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData2 = currencyChooserScreen.K;
                        inputData2.getClass();
                        return new ak5.n(jVar, inputData2);
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChooserScreen.W;
                        CurrencyChooserScreen currencyChooserScreen2 = this.f206179b;
                        return tki.g.a(currencyChooserScreen2, currencyChooserScreen2.d(), zhm.v.k((AccountCellItemDelegate) currencyChooserScreen2.R.getValue(), (FullScreenStateDelegate) currencyChooserScreen2.S.getValue(), (RowDelegate) currencyChooserScreen2.T.getValue(), (ListSubheaderDelegate) currencyChooserScreen2.U.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (LargeActionButtonDelegate) currencyChooserScreen2.V.getValue(), new SeparatorDelegate()), R$id.cryptoCurrencyChooser_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new mfl.b(21));
        this.S = w.y0(new mfl.b(22));
        this.T = w.y0(new mfl.b(23));
        this.U = w.y0(new mfl.b(24));
        this.V = w.y0(new mfl.b(25));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbarF3 = f3();
        Clause clause = uiState.f206194b;
        navBarWithToolbarF3.setTitle(clause, null);
        navBarWithToolbarF3.setToolbarTitle(clause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) d()).C2(d.f289652a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pk5.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        mk5.q.Companion.getClass();
        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData = this.K;
        if (j.a(inputData)) {
            FixedTabs cryptoCurrencyChooserTabs = d3().f314422c;
            Intrinsics.checkNotNullExpressionValue(cryptoCurrencyChooserTabs, "cryptoCurrencyChooserTabs");
            cryptoCurrencyChooserTabs.setVisibility(0);
            FixedTabs cryptoCurrencyChooserTabs2 = d3().f314422c;
            Intrinsics.checkNotNullExpressionValue(cryptoCurrencyChooserTabs2, "cryptoCurrencyChooserTabs");
            FixedTabs.setItems$default(cryptoCurrencyChooserTabs2, v.k(new FixedTabs.Item("WALLETS_TAB", new TextLocalisedClause(R$string.crypto_receive_screen_deposit_destination_tabs_wallet, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("REVOLUT_FRIENDS_TAB", new TextLocalisedClause(R$string.crypto_receive_screen_deposit_destination_tabs_friends, null, null, 14), (AnalyticsContext) null, 12)), null, 2, null);
        } else {
            FixedTabs cryptoCurrencyChooserTabs3 = d3().f314422c;
            Intrinsics.checkNotNullExpressionValue(cryptoCurrencyChooserTabs3, "cryptoCurrencyChooserTabs");
            cryptoCurrencyChooserTabs3.setVisibility(8);
        }
        NavBarWithToolbar navBarWithToolbarF3 = f3();
        navBarWithToolbarF3.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        Clause textLocalisedClause = inputData.f;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_common_search_currencies_placeholder, null, null, 14);
        }
        navBarWithToolbarF3.setHint(textLocalisedClause);
        navBarWithToolbarF3.setSearchButtonActive(true);
        navBarWithToolbarF3.setSecondDescriptionVisible(false);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59410q), null, new mk5.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59409p.f57337m), null, new mk5.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().x0()), null, new mk5.d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((AccountCellItemDelegate) this.R.getValue()).f51551c.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), null, new mk5.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f314422c.f), null, new mk5.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.T.getValue()).f53218h), null, new mk5.h(this, null), 3);
        ViewController.P2(this, new lt.d(rd0.e.b(((LargeActionButtonDelegate) this.V.getValue()).d.f121375b), 28), new i(this, null), 3);
    }

    public final yj5.b d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (yj5.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.O.getValue();
    }

    public final NavBarWithToolbar f3() {
        NavBarWithToolbar cryptoCurrencyChooserNavBarWithToolbar = d3().f314421b;
        Intrinsics.checkNotNullExpressionValue(cryptoCurrencyChooserNavBarWithToolbar, "cryptoCurrencyChooserNavBarWithToolbar");
        return cryptoCurrencyChooserNavBarWithToolbar;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
