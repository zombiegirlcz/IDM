package com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vfg.m;
import vq5.b;
import vq5.c;
import vq5.d;
import vq5.f;
import vq5.k;
import vq5.l;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvq5/k;", "Ldli/a;", "Lvq5/l;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendConfirmationController extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CryptoSendConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CryptoSendConfirmationControllerContract$InputData K;
    public final h L;
    public final CellDetailsActionDelegate M;
    public final CellDetailsDelegate N;
    public final FooterTextDelegate O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CryptoSendConfirmationController(CryptoSendConfirmationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new CellDetailsActionDelegate();
        this.N = new CellDetailsDelegate();
        this.O = new FooterTextDelegate();
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: vq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendConfirmationController f291313b;

            {
                this.f291313b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoSendConfirmationController cryptoSendConfirmationController = this.f291313b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendConfirmationController.T;
                        qji.b bVarR1 = cryptoSendConfirmationController.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.di.CryptoSendConfirmationControllerInjector");
                        zo5.f fVar = (zo5.f) bVarR1;
                        zo5.d dVar = fVar.f323906b;
                        zo5.f fVar2 = fVar.f323907c;
                        CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData = cryptoSendConfirmationController.K;
                        cryptoSendConfirmationControllerContract$InputData.getClass();
                        return new zo5.e(dVar, fVar2, cryptoSendConfirmationControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendConfirmationController.T;
                        return (f) ((zo5.e) cryptoSendConfirmationController.Q.getValue()).f323904c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoSendConfirmationController.T;
                        CryptoSendConfirmationController cryptoSendConfirmationController2 = this.f291313b;
                        return dli.f.a(cryptoSendConfirmationController2, cryptoSendConfirmationController2.d(), zhm.v.k(cryptoSendConfirmationController2.M, cryptoSendConfirmationController2.N, new CellDetailsLoadingDelegate(), cryptoSendConfirmationController2.O, new PlainTextWarningDelegate()), cryptoSendConfirmationController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: vq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendConfirmationController f291313b;

            {
                this.f291313b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoSendConfirmationController cryptoSendConfirmationController = this.f291313b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendConfirmationController.T;
                        qji.b bVarR1 = cryptoSendConfirmationController.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.di.CryptoSendConfirmationControllerInjector");
                        zo5.f fVar = (zo5.f) bVarR1;
                        zo5.d dVar = fVar.f323906b;
                        zo5.f fVar2 = fVar.f323907c;
                        CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData = cryptoSendConfirmationController.K;
                        cryptoSendConfirmationControllerContract$InputData.getClass();
                        return new zo5.e(dVar, fVar2, cryptoSendConfirmationControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendConfirmationController.T;
                        return (f) ((zo5.e) cryptoSendConfirmationController.Q.getValue()).f323904c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoSendConfirmationController.T;
                        CryptoSendConfirmationController cryptoSendConfirmationController2 = this.f291313b;
                        return dli.f.a(cryptoSendConfirmationController2, cryptoSendConfirmationController2.d(), zhm.v.k(cryptoSendConfirmationController2.M, cryptoSendConfirmationController2.N, new CellDetailsLoadingDelegate(), cryptoSendConfirmationController2.O, new PlainTextWarningDelegate()), cryptoSendConfirmationController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: vq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendConfirmationController f291313b;

            {
                this.f291313b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoSendConfirmationController cryptoSendConfirmationController = this.f291313b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSendConfirmationController.T;
                        qji.b bVarR1 = cryptoSendConfirmationController.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.di.CryptoSendConfirmationControllerInjector");
                        zo5.f fVar = (zo5.f) bVarR1;
                        zo5.d dVar = fVar.f323906b;
                        zo5.f fVar2 = fVar.f323907c;
                        CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData = cryptoSendConfirmationController.K;
                        cryptoSendConfirmationControllerContract$InputData.getClass();
                        return new zo5.e(dVar, fVar2, cryptoSendConfirmationControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSendConfirmationController.T;
                        return (f) ((zo5.e) cryptoSendConfirmationController.Q.getValue()).f323904c.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoSendConfirmationController.T;
                        CryptoSendConfirmationController cryptoSendConfirmationController2 = this.f291313b;
                        return dli.f.a(cryptoSendConfirmationController2, cryptoSendConfirmationController2.d(), zhm.v.k(cryptoSendConfirmationController2.M, cryptoSendConfirmationController2.N, new CellDetailsLoadingDelegate(), cryptoSendConfirmationController2.O, new PlainTextWarningDelegate()), cryptoSendConfirmationController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f291326a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f291327b);
        largeActionButton.setEnabled(uiState.f291328c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zo5.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setTag("CryptoSendConfirmation_ConfirmButton_Tag");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new vq5.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new m(this, continuation, 23), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.R.getValue();
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
