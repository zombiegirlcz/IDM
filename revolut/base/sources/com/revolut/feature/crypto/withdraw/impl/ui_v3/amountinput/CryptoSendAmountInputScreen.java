package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dmj.k;
import eq5.a0;
import eq5.e0;
import eq5.w;
import eq5.x;
import eq5.y;
import eq5.z;
import h30.l;
import jii.b0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leq5/w;", "Ldli/a;", "Leq5/a0;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendAmountInputScreen extends ViewController<w> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CryptoSendAmountInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0))};
    public final CryptoSendAmountInputScreenDestination$InputData K;
    public final ao.h L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CryptoSendAmountInputScreen(CryptoSendAmountInputScreenDestination$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, eq5.b.f);
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: eq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendAmountInputScreen f128248b;

            {
                this.f128248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoSendAmountInputScreen cryptoSendAmountInputScreen = this.f128248b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendAmountInputScreen.R;
                        return (b0) ((zo5.c) cryptoSendAmountInputScreen.P.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendAmountInputScreen.R;
                        CryptoSendAmountInputScreen cryptoSendAmountInputScreen2 = this.f128248b;
                        return dli.f.a(cryptoSendAmountInputScreen2, cryptoSendAmountInputScreen2.d(), ((e0) cryptoSendAmountInputScreen2.f3()).a(), cryptoSendAmountInputScreen2.d3().d.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoSendAmountInputScreen.R;
                        qji.b bVarR1 = cryptoSendAmountInputScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.di.CryptoSendAmountInputScreenInjector");
                        zo5.f fVar = (zo5.f) bVarR1;
                        zo5.d dVar = fVar.f323906b;
                        zo5.f fVar2 = fVar.f323907c;
                        CryptoSendAmountInputScreenDestination$InputData cryptoSendAmountInputScreenDestination$InputData = cryptoSendAmountInputScreen.K;
                        cryptoSendAmountInputScreenDestination$InputData.getClass();
                        return new zo5.c(dVar, fVar2, cryptoSendAmountInputScreen, cryptoSendAmountInputScreenDestination$InputData);
                    default:
                        KProperty[] kPropertyArr4 = CryptoSendAmountInputScreen.R;
                        return (x) ((zo5.c) cryptoSendAmountInputScreen.P.getValue()).f323884h.get();
                }
            }
        });
        this.N = R$layout.screen_recycler_navbarwithavatar_nextbutton;
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: eq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendAmountInputScreen f128248b;

            {
                this.f128248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoSendAmountInputScreen cryptoSendAmountInputScreen = this.f128248b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendAmountInputScreen.R;
                        return (b0) ((zo5.c) cryptoSendAmountInputScreen.P.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendAmountInputScreen.R;
                        CryptoSendAmountInputScreen cryptoSendAmountInputScreen2 = this.f128248b;
                        return dli.f.a(cryptoSendAmountInputScreen2, cryptoSendAmountInputScreen2.d(), ((e0) cryptoSendAmountInputScreen2.f3()).a(), cryptoSendAmountInputScreen2.d3().d.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoSendAmountInputScreen.R;
                        qji.b bVarR1 = cryptoSendAmountInputScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.di.CryptoSendAmountInputScreenInjector");
                        zo5.f fVar = (zo5.f) bVarR1;
                        zo5.d dVar = fVar.f323906b;
                        zo5.f fVar2 = fVar.f323907c;
                        CryptoSendAmountInputScreenDestination$InputData cryptoSendAmountInputScreenDestination$InputData = cryptoSendAmountInputScreen.K;
                        cryptoSendAmountInputScreenDestination$InputData.getClass();
                        return new zo5.c(dVar, fVar2, cryptoSendAmountInputScreen, cryptoSendAmountInputScreenDestination$InputData);
                    default:
                        KProperty[] kPropertyArr4 = CryptoSendAmountInputScreen.R;
                        return (x) ((zo5.c) cryptoSendAmountInputScreen.P.getValue()).f323884h.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: eq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendAmountInputScreen f128248b;

            {
                this.f128248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoSendAmountInputScreen cryptoSendAmountInputScreen = this.f128248b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendAmountInputScreen.R;
                        return (b0) ((zo5.c) cryptoSendAmountInputScreen.P.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendAmountInputScreen.R;
                        CryptoSendAmountInputScreen cryptoSendAmountInputScreen2 = this.f128248b;
                        return dli.f.a(cryptoSendAmountInputScreen2, cryptoSendAmountInputScreen2.d(), ((e0) cryptoSendAmountInputScreen2.f3()).a(), cryptoSendAmountInputScreen2.d3().d.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoSendAmountInputScreen.R;
                        qji.b bVarR1 = cryptoSendAmountInputScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.di.CryptoSendAmountInputScreenInjector");
                        zo5.f fVar = (zo5.f) bVarR1;
                        zo5.d dVar = fVar.f323906b;
                        zo5.f fVar2 = fVar.f323907c;
                        CryptoSendAmountInputScreenDestination$InputData cryptoSendAmountInputScreenDestination$InputData = cryptoSendAmountInputScreen.K;
                        cryptoSendAmountInputScreenDestination$InputData.getClass();
                        return new zo5.c(dVar, fVar2, cryptoSendAmountInputScreen, cryptoSendAmountInputScreenDestination$InputData);
                    default:
                        KProperty[] kPropertyArr4 = CryptoSendAmountInputScreen.R;
                        return (x) ((zo5.c) cryptoSendAmountInputScreen.P.getValue()).f323884h.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = te0.w.y0(new Function0(this) { // from class: eq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendAmountInputScreen f128248b;

            {
                this.f128248b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CryptoSendAmountInputScreen cryptoSendAmountInputScreen = this.f128248b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendAmountInputScreen.R;
                        return (b0) ((zo5.c) cryptoSendAmountInputScreen.P.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendAmountInputScreen.R;
                        CryptoSendAmountInputScreen cryptoSendAmountInputScreen2 = this.f128248b;
                        return dli.f.a(cryptoSendAmountInputScreen2, cryptoSendAmountInputScreen2.d(), ((e0) cryptoSendAmountInputScreen2.f3()).a(), cryptoSendAmountInputScreen2.d3().d.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoSendAmountInputScreen.R;
                        qji.b bVarR1 = cryptoSendAmountInputScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.di.CryptoSendAmountInputScreenInjector");
                        zo5.f fVar = (zo5.f) bVarR1;
                        zo5.d dVar = fVar.f323906b;
                        zo5.f fVar2 = fVar.f323907c;
                        CryptoSendAmountInputScreenDestination$InputData cryptoSendAmountInputScreenDestination$InputData = cryptoSendAmountInputScreen.K;
                        cryptoSendAmountInputScreenDestination$InputData.getClass();
                        return new zo5.c(dVar, fVar2, cryptoSendAmountInputScreen, cryptoSendAmountInputScreenDestination$InputData);
                    default:
                        KProperty[] kPropertyArr4 = CryptoSendAmountInputScreen.R;
                        return (x) ((zo5.c) cryptoSendAmountInputScreen.P.getValue()).f323884h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        a0 uiState = (a0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithAvatar navBarWithAvatar = d3().f174500c;
        z zVar = uiState.f128250b;
        navBarWithAvatar.setToolbarTitle(zVar.f128355a);
        navBarWithAvatar.setToolbarDescription(zVar.f128356b);
        navBarWithAvatar.setAvatarImage(zVar.f128357c);
        LargeActionButton largeActionButton = d3().f174499b;
        y yVar = uiState.f128251c;
        largeActionButton.setVisibility(yVar != null ? 0 : 8);
        largeActionButton.setText(yVar != null ? yVar.f128351a : null);
        largeActionButton.setEnabled(yVar != null ? yVar.f128352b : false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (zo5.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174500c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174499b.setLoadingButtonTag("CryptoSendAmountInputScreen_NextButton_LoadingTag");
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59338a), new eq5.d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59339b), new eq5.d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((e0) f3()).f128266c), new eq5.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) ((e0) f3()).d.getValue()).f), new eq5.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((e0) f3()).b().e.f121375b), new eq5.g(this, null), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(((e0) f3()).b().f51966j.f121375b), rd0.e.b(((e0) f3()).b().k.f121375b)), new eq5.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(((e0) f3()).b().o.f121375b), new eq5.i(this, null), 3);
        ViewController.P2(this, l.y(((e0) f3()).b().f51965h.f121375b, ((e0) f3()).b().i.f121375b, "merge(...)"), new eq5.j(this, null), 3);
        ViewController.P2(this, new k(rd0.e.b(((e0) f3()).b().f.f121375b), 27), new enb.f(this, continuation, 13), 3);
        ViewController.P2(this, rd0.e.b(d3().f174499b.o), new eq5.d(this, continuation, 0), 3);
    }

    public final b0 d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x d() {
        return (x) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final eq5.b0 f3() {
        return (eq5.b0) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
