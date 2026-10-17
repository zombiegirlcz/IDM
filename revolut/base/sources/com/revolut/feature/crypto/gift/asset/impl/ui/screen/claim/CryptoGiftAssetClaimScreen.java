package com.revolut.feature.crypto.gift.asset.impl.ui.screen.claim;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.TitleDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.revolut.feature.crypto.gift.asset.impl.R$id;
import com.revolut.feature.crypto.gift.asset.impl.R$layout;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.claim.CryptoGiftAssetClaimScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import woc.p;
import xki.e;
import yg5.j;
import yg5.k;
import yg5.l;
import yg5.m;
import zg5.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/impl/ui/screen/claim/CryptoGiftAssetClaimScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyg5/j;", "Ldli/a;", "Lyg5/l;", "<init>", "()V", "feature_crypto_gift_asset_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoGiftAssetClaimScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(CryptoGiftAssetClaimScreen.class, "binding", "getBinding()Lcom/revolut/feature/crypto/gift/asset/impl/databinding/ScreenCryptoGiftAssetClaimBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_crypto_gift_asset_claim;
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, rg5.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/crypto/gift/asset/impl/databinding/ScreenCryptoGiftAssetClaimBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.cryptoGiftAssetClaim_actionFooterView;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
            if (actionFooterView != null) {
                i = R$id.cryptoGiftAssetClaim_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.cryptoGiftAssetClaim_recyclerView;
                    if (((AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.cryptoGiftAssetClaim_spinnerPicker;
                        SpinnerPickerView spinnerPickerView = (SpinnerPickerView) ViewBindings.findChildViewById(p0, i);
                        if (spinnerPickerView != null) {
                            return new rg5.a((ControllerContainerConstraintLayout) p0, actionFooterView, navBarWithToolbar, spinnerPickerView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public CryptoGiftAssetClaimScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yg5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoGiftAssetClaimScreen f313520b;

            {
                this.f313520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen = this.f313520b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoGiftAssetClaimScreen.P;
                        return ((zg5.b) cryptoGiftAssetClaimScreen.M.getValue()).x();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoGiftAssetClaimScreen.P;
                        qji.b bVarU2 = cryptoGiftAssetClaimScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.gift.asset.impl.ui.screen.claim.di.CryptoGiftAssetClaimScreenInjector");
                        return (zg5.b) ((zg5.a) ((zg5.c) bVarU2).b().mo3808a(cryptoGiftAssetClaimScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CryptoGiftAssetClaimScreen.P;
                        CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen2 = this.f313520b;
                        return dli.f.a(cryptoGiftAssetClaimScreen2, cryptoGiftAssetClaimScreen2.d(), zhm.u.c(new TitleDelegate()), R$id.cryptoGiftAssetClaim_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: yg5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoGiftAssetClaimScreen f313520b;

            {
                this.f313520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen = this.f313520b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoGiftAssetClaimScreen.P;
                        return ((zg5.b) cryptoGiftAssetClaimScreen.M.getValue()).x();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoGiftAssetClaimScreen.P;
                        qji.b bVarU2 = cryptoGiftAssetClaimScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.gift.asset.impl.ui.screen.claim.di.CryptoGiftAssetClaimScreenInjector");
                        return (zg5.b) ((zg5.a) ((zg5.c) bVarU2).b().mo3808a(cryptoGiftAssetClaimScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CryptoGiftAssetClaimScreen.P;
                        CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen2 = this.f313520b;
                        return dli.f.a(cryptoGiftAssetClaimScreen2, cryptoGiftAssetClaimScreen2.d(), zhm.u.c(new TitleDelegate()), R$id.cryptoGiftAssetClaim_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: yg5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoGiftAssetClaimScreen f313520b;

            {
                this.f313520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen = this.f313520b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoGiftAssetClaimScreen.P;
                        return ((zg5.b) cryptoGiftAssetClaimScreen.M.getValue()).x();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoGiftAssetClaimScreen.P;
                        qji.b bVarU2 = cryptoGiftAssetClaimScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.gift.asset.impl.ui.screen.claim.di.CryptoGiftAssetClaimScreenInjector");
                        return (zg5.b) ((zg5.a) ((zg5.c) bVarU2).b().mo3808a(cryptoGiftAssetClaimScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CryptoGiftAssetClaimScreen.P;
                        CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen2 = this.f313520b;
                        return dli.f.a(cryptoGiftAssetClaimScreen2, cryptoGiftAssetClaimScreen2.d(), zhm.u.c(new TitleDelegate()), R$id.cryptoGiftAssetClaim_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        rg5.a aVarD3 = d3();
        aVarD3.d.setModel(uiState.f313530b);
        aVarD3.f254040b.setModel(uiState.f313531c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        rg5.a aVarD3 = d3();
        aVarD3.f254041c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        NavBarWithToolbar cryptoGiftAssetClaimNavBar = aVarD3.f254041c;
        Intrinsics.checkNotNullExpressionValue(cryptoGiftAssetClaimNavBar, "cryptoGiftAssetClaimNavBar");
        cryptoGiftAssetClaimNavBar.j0(false);
        aVarD3.d.setModel(m.f313532a);
        RecyclerView.LayoutManager layoutManager = ((c) this.N.getValue()).h().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.setStackFromEnd(true);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f254041c.f59410q), new yg5.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.d), new yg5.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.f59694a.f55846c), new yg5.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f254040b.f), new yg5.b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f254040b.e), new p(2, d(), k.class, "onFooterLinkClicked", "onFooterLinkClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 23), 3);
    }

    public final rg5.a d3() {
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rg5.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
