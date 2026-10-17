package com.revolut.retail.feature.crypto_deposits.impl.ui.overview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nz8.d;
import qbj.r;
import rp0.z1;
import te0.w;
import vc.s;
import xki.e;
import zbj.a0;
import zbj.b0;
import zbj.f;
import zbj.g;
import zbj.g0;
import zbj.i;
import zbj.j;
import zbj.k;
import zbj.l;
import zbj.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzbj/b0;", "", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoDepositsOverviewController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoDepositsOverviewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ g0 K;
    public final CryptoDepositsOverviewControllerContract$InputData L;
    public final int M;
    public final h N;
    public a0 O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CryptoDepositsOverviewController(CryptoDepositsOverviewControllerContract$InputData inputData, g0 delegatesContainer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(delegatesContainer, "delegatesContainer");
        this.K = delegatesContainer;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, zbj.c.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zbj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDepositsOverviewController f320897b;

            {
                this.f320897b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoDepositsOverviewController.S;
                        return (s) ((qbj.r) this.f320897b.Q.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoDepositsOverviewController.S;
                        CryptoDepositsOverviewController cryptoDepositsOverviewController = this.f320897b;
                        s sVarD = cryptoDepositsOverviewController.d();
                        g0 g0Var = cryptoDepositsOverviewController.K;
                        return dli.f.a(cryptoDepositsOverviewController, sVarD, zhm.d0.E0(zhm.u.c(new RowLoadingDelegate()), zhm.v.k((RowDelegate) g0Var.d.getValue(), new FullScreenStateLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), (LargeActionButtonDelegate) g0Var.e.getValue(), (ErrorDelegate) g0Var.f320909c.getValue(), (FixedTabsDelegate) g0Var.f320907a.getValue(), (FullScreenStateDelegate) g0Var.f320908b.getValue(), (CellDetailsActionDelegate) g0Var.f.getValue(), (CellDetailsDelegate) g0Var.f320910g.getValue(), (PlainTextDelegate) g0Var.f320912j.getValue(), (QRCodeDelegate) g0Var.i.getValue(), new QRCodeLoadingDelegate(), (CircleActionButtonsBarDelegate) g0Var.f320911h.getValue(), (TextDelegate) g0Var.k.getValue())), 0, null, null, null, 60);
                }
            }
        });
        this.Q = w.y0(new ywi.b(this, delegatesContainer, 21));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: zbj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDepositsOverviewController f320897b;

            {
                this.f320897b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoDepositsOverviewController.S;
                        return (s) ((qbj.r) this.f320897b.Q.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoDepositsOverviewController.S;
                        CryptoDepositsOverviewController cryptoDepositsOverviewController = this.f320897b;
                        s sVarD = cryptoDepositsOverviewController.d();
                        g0 g0Var = cryptoDepositsOverviewController.K;
                        return dli.f.a(cryptoDepositsOverviewController, sVarD, zhm.d0.E0(zhm.u.c(new RowLoadingDelegate()), zhm.v.k((RowDelegate) g0Var.d.getValue(), new FullScreenStateLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), (LargeActionButtonDelegate) g0Var.e.getValue(), (ErrorDelegate) g0Var.f320909c.getValue(), (FixedTabsDelegate) g0Var.f320907a.getValue(), (FullScreenStateDelegate) g0Var.f320908b.getValue(), (CellDetailsActionDelegate) g0Var.f.getValue(), (CellDetailsDelegate) g0Var.f320910g.getValue(), (PlainTextDelegate) g0Var.f320912j.getValue(), (QRCodeDelegate) g0Var.i.getValue(), new QRCodeLoadingDelegate(), (CircleActionButtonsBarDelegate) g0Var.f320911h.getValue(), (TextDelegate) g0Var.k.getValue())), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b0 uiState = (b0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f320899b;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setDescriptionText(uiState.f320900c);
        navBarWithToolbar.setEndImage(d.L(uiState.d));
        a0 a0Var = uiState.e;
        a0 a0Var2 = this.O;
        if (a0Var2 != null && !a0Var2.equals(a0Var)) {
            ((dli.c) this.R.getValue()).h().scrollToPosition(0);
        }
        this.O = a0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new zbj.h(this, null, 0), 3);
        g0 g0Var = this.K;
        ViewController.P2(this, rd0.e.b(((FixedTabsDelegate) g0Var.f320907a.getValue()).f52339c.f121375b), new g(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) g0Var.f320908b.getValue()).f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ErrorDelegate) g0Var.f320909c.getValue()).f52226c), new zbj.h(this, null, 1), 3);
        ?? r06 = g0Var.d;
        ViewController.P2(this, rd0.e.b(((RowDelegate) r06.getValue()).f53218h), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r06.getValue()).f53226s), new g(this, continuation, 5), 3);
        ?? r09 = g0Var.f;
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) r09.getValue()).d), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) r09.getValue()).f51780c), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) g0Var.f320910g.getValue()).d), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) g0Var.e.getValue()).d.f121375b), new zbj.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CircleActionButtonsBarDelegate) g0Var.f320911h.getValue()).f52087c.f121375b), new zbj.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((QRCodeDelegate) g0Var.i.getValue()).u()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((TextDelegate) g0Var.k.getValue()).d), new g(this, continuation, 0), 3);
        ?? r62 = this.Q;
        ViewController.P2(this, rd0.e.b(((z1) ((r) r62.getValue()).f244348g.get()).f256231b), new g(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((z1) ((r) r62.getValue()).f244348g.get()).e), new g(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((z1) ((r) r62.getValue()).f244348g.get()).f256232c), new g(this, continuation, 3), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final zbj.s d() {
        return (zbj.s) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
