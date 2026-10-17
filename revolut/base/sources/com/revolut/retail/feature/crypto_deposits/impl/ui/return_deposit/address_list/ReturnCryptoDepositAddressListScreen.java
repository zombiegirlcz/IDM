package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.address_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.address_list.ReturnCryptoDepositAddressListScreen;
import dli.a;
import hcj.b;
import hcj.c;
import hcj.d;
import hcj.k;
import hcj.l;
import hcj.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qbj.u;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/address_list/ReturnCryptoDepositAddressListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhcj/k;", "Ldli/a;", "Lhcj/m;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReturnCryptoDepositAddressListScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ReturnCryptoDepositAddressListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ReturnCryptoDepositAddressListScreen(ReturnCryptoDepositAddressListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = w.y0(new h43.b(19));
        this.M = w.y0(new h43.b(20));
        this.N = R$layout.screen_recycler_navbar;
        this.O = w.y0(new h1k.a(this, inputData, 16));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: hcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReturnCryptoDepositAddressListScreen f150903b;

            {
                this.f150903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ReturnCryptoDepositAddressListScreen.R;
                        return (l) ((u) this.f150903b.O.getValue()).f244361c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReturnCryptoDepositAddressListScreen.R;
                        int i2 = R$id.recyclerView;
                        ReturnCryptoDepositAddressListScreen returnCryptoDepositAddressListScreen = this.f150903b;
                        return dli.f.a(returnCryptoDepositAddressListScreen, returnCryptoDepositAddressListScreen.d(), v.k((RowDelegate) returnCryptoDepositAddressListScreen.L.getValue(), (FullScreenStateDelegate) returnCryptoDepositAddressListScreen.M.getValue(), new RowLoadingDelegate()), i2, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReturnCryptoDepositAddressListScreen f150903b;

            {
                this.f150903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReturnCryptoDepositAddressListScreen.R;
                        return (l) ((u) this.f150903b.O.getValue()).f244361c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReturnCryptoDepositAddressListScreen.R;
                        int i22 = R$id.recyclerView;
                        ReturnCryptoDepositAddressListScreen returnCryptoDepositAddressListScreen = this.f150903b;
                        return dli.f.a(returnCryptoDepositAddressListScreen, returnCryptoDepositAddressListScreen.d(), v.k((RowDelegate) returnCryptoDepositAddressListScreen.L.getValue(), (FullScreenStateDelegate) returnCryptoDepositAddressListScreen.M.getValue(), new RowLoadingDelegate()), i22, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f150911b, null);
        d3().f174539b.setSecondDescriptionText(uiState.f150912c);
        d3().f174539b.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.L.getValue()).f53218h), new d(this, null), 3);
        ?? r56 = this.M;
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) r56.getValue()).f52371h.f121375b), new hcj.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) r56.getValue()).d), new hba.k(this, (Continuation) null, 2), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
