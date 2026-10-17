package com.revolut.feature.credit.card.impl.ui.instalment.transactions;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ft4.d;
import ft4.f;
import ft4.g;
import ft4.p;
import ft4.r;
import ft4.t;
import ft4.u;
import ft4.v;
import grl.k9;
import jm4.a3;
import jm4.k3;
import jm4.m3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import w01.k;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/transactions/InstalmentTransactionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lft4/p;", "Ldli/a;", "Lft4/v;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstalmentTransactionsScreen extends ViewController<p> implements a, m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(InstalmentTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InstalmentTransactionsScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public InstalmentTransactionsScreen(InstalmentTransactionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, d.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ft4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentTransactionsScreen f137898b;

            {
                this.f137898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstalmentTransactionsScreen instalmentTransactionsScreen = this.f137898b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentTransactionsScreen.X;
                        qji.b bVarU2 = instalmentTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.transactions.di.InstalmentTransactionsScreenInjector");
                        k3 k3Var = (k3) bVarU2;
                        a3 a3Var = k3Var.f176172b;
                        k3 k3Var2 = k3Var.f176173c;
                        InstalmentTransactionsScreenContract$InputData instalmentTransactionsScreenContract$InputData = instalmentTransactionsScreen.K;
                        instalmentTransactionsScreenContract$InputData.getClass();
                        return new m3(a3Var, k3Var2, instalmentTransactionsScreen, instalmentTransactionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InstalmentTransactionsScreen.X;
                        return (q) ((m3) instalmentTransactionsScreen.O.getValue()).f176204g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InstalmentTransactionsScreen.X;
                        return (j60.a) ((m3) instalmentTransactionsScreen.O.getValue()).d.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InstalmentTransactionsScreen.X;
                        return new SelectableDelegate((RowDelegate) instalmentTransactionsScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = InstalmentTransactionsScreen.X;
                        InstalmentTransactionsScreen instalmentTransactionsScreen2 = this.f137898b;
                        return dli.f.a(instalmentTransactionsScreen2, instalmentTransactionsScreen2.d(), zhm.v.k((TabsDelegate) instalmentTransactionsScreen2.V.getValue(), (SelectableDelegate) instalmentTransactionsScreen2.T.getValue(), (FullScreenStateDelegate) instalmentTransactionsScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ft4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentTransactionsScreen f137898b;

            {
                this.f137898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstalmentTransactionsScreen instalmentTransactionsScreen = this.f137898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentTransactionsScreen.X;
                        qji.b bVarU2 = instalmentTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.transactions.di.InstalmentTransactionsScreenInjector");
                        k3 k3Var = (k3) bVarU2;
                        a3 a3Var = k3Var.f176172b;
                        k3 k3Var2 = k3Var.f176173c;
                        InstalmentTransactionsScreenContract$InputData instalmentTransactionsScreenContract$InputData = instalmentTransactionsScreen.K;
                        instalmentTransactionsScreenContract$InputData.getClass();
                        return new m3(a3Var, k3Var2, instalmentTransactionsScreen, instalmentTransactionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InstalmentTransactionsScreen.X;
                        return (q) ((m3) instalmentTransactionsScreen.O.getValue()).f176204g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InstalmentTransactionsScreen.X;
                        return (j60.a) ((m3) instalmentTransactionsScreen.O.getValue()).d.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InstalmentTransactionsScreen.X;
                        return new SelectableDelegate((RowDelegate) instalmentTransactionsScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = InstalmentTransactionsScreen.X;
                        InstalmentTransactionsScreen instalmentTransactionsScreen2 = this.f137898b;
                        return dli.f.a(instalmentTransactionsScreen2, instalmentTransactionsScreen2.d(), zhm.v.k((TabsDelegate) instalmentTransactionsScreen2.V.getValue(), (SelectableDelegate) instalmentTransactionsScreen2.T.getValue(), (FullScreenStateDelegate) instalmentTransactionsScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ft4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentTransactionsScreen f137898b;

            {
                this.f137898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstalmentTransactionsScreen instalmentTransactionsScreen = this.f137898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentTransactionsScreen.X;
                        qji.b bVarU2 = instalmentTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.transactions.di.InstalmentTransactionsScreenInjector");
                        k3 k3Var = (k3) bVarU2;
                        a3 a3Var = k3Var.f176172b;
                        k3 k3Var2 = k3Var.f176173c;
                        InstalmentTransactionsScreenContract$InputData instalmentTransactionsScreenContract$InputData = instalmentTransactionsScreen.K;
                        instalmentTransactionsScreenContract$InputData.getClass();
                        return new m3(a3Var, k3Var2, instalmentTransactionsScreen, instalmentTransactionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InstalmentTransactionsScreen.X;
                        return (q) ((m3) instalmentTransactionsScreen.O.getValue()).f176204g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InstalmentTransactionsScreen.X;
                        return (j60.a) ((m3) instalmentTransactionsScreen.O.getValue()).d.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InstalmentTransactionsScreen.X;
                        return new SelectableDelegate((RowDelegate) instalmentTransactionsScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = InstalmentTransactionsScreen.X;
                        InstalmentTransactionsScreen instalmentTransactionsScreen2 = this.f137898b;
                        return dli.f.a(instalmentTransactionsScreen2, instalmentTransactionsScreen2.d(), zhm.v.k((TabsDelegate) instalmentTransactionsScreen2.V.getValue(), (SelectableDelegate) instalmentTransactionsScreen2.T.getValue(), (FullScreenStateDelegate) instalmentTransactionsScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.R = w.y0(new ft3.h0(8));
        this.S = w.y0(new ft3.h0(9));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: ft4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentTransactionsScreen f137898b;

            {
                this.f137898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InstalmentTransactionsScreen instalmentTransactionsScreen = this.f137898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentTransactionsScreen.X;
                        qji.b bVarU2 = instalmentTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.transactions.di.InstalmentTransactionsScreenInjector");
                        k3 k3Var = (k3) bVarU2;
                        a3 a3Var = k3Var.f176172b;
                        k3 k3Var2 = k3Var.f176173c;
                        InstalmentTransactionsScreenContract$InputData instalmentTransactionsScreenContract$InputData = instalmentTransactionsScreen.K;
                        instalmentTransactionsScreenContract$InputData.getClass();
                        return new m3(a3Var, k3Var2, instalmentTransactionsScreen, instalmentTransactionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InstalmentTransactionsScreen.X;
                        return (q) ((m3) instalmentTransactionsScreen.O.getValue()).f176204g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InstalmentTransactionsScreen.X;
                        return (j60.a) ((m3) instalmentTransactionsScreen.O.getValue()).d.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InstalmentTransactionsScreen.X;
                        return new SelectableDelegate((RowDelegate) instalmentTransactionsScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = InstalmentTransactionsScreen.X;
                        InstalmentTransactionsScreen instalmentTransactionsScreen2 = this.f137898b;
                        return dli.f.a(instalmentTransactionsScreen2, instalmentTransactionsScreen2.d(), zhm.v.k((TabsDelegate) instalmentTransactionsScreen2.V.getValue(), (SelectableDelegate) instalmentTransactionsScreen2.T.getValue(), (FullScreenStateDelegate) instalmentTransactionsScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.U = w.y0(new ft3.h0(10));
        this.V = w.y0(new ft3.h0(11));
        final int i6 = 4;
        this.W = w.y0(new Function0(this) { // from class: ft4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentTransactionsScreen f137898b;

            {
                this.f137898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                InstalmentTransactionsScreen instalmentTransactionsScreen = this.f137898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentTransactionsScreen.X;
                        qji.b bVarU2 = instalmentTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.transactions.di.InstalmentTransactionsScreenInjector");
                        k3 k3Var = (k3) bVarU2;
                        a3 a3Var = k3Var.f176172b;
                        k3 k3Var2 = k3Var.f176173c;
                        InstalmentTransactionsScreenContract$InputData instalmentTransactionsScreenContract$InputData = instalmentTransactionsScreen.K;
                        instalmentTransactionsScreenContract$InputData.getClass();
                        return new m3(a3Var, k3Var2, instalmentTransactionsScreen, instalmentTransactionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InstalmentTransactionsScreen.X;
                        return (q) ((m3) instalmentTransactionsScreen.O.getValue()).f176204g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InstalmentTransactionsScreen.X;
                        return (j60.a) ((m3) instalmentTransactionsScreen.O.getValue()).d.get();
                    case 3:
                        KProperty[] kPropertyArr4 = InstalmentTransactionsScreen.X;
                        return new SelectableDelegate((RowDelegate) instalmentTransactionsScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = InstalmentTransactionsScreen.X;
                        InstalmentTransactionsScreen instalmentTransactionsScreen2 = this.f137898b;
                        return dli.f.a(instalmentTransactionsScreen2, instalmentTransactionsScreen2.d(), zhm.v.k((TabsDelegate) instalmentTransactionsScreen2.V.getValue(), (SelectableDelegate) instalmentTransactionsScreen2.T.getValue(), (FullScreenStateDelegate) instalmentTransactionsScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        u uVar = uiState.f137929a;
        d3().f174565c.setSearchButtonActive(uiState.d);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uVar.f137927a, null);
        navBarWithToolbar.setToolbarTitle(uVar.f137927a);
        navBarWithToolbar.setNavigationButtonImage(uVar.f137928b);
        t tVar = uiState.f137931c;
        if (tVar instanceof r) {
            LargeActionButton largeActionButton = d3().f174564b;
            k.d(largeActionButton);
            largeActionButton.setText(((r) tVar).f137925a);
        } else {
            if (!(tVar instanceof ft4.s)) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            k.a(goToButton);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m3) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.Q.getValue()).d(zhm.u.c((LargeActionButtonDelegate) this.R.getValue()));
    }

    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        d3().f174565c.setHints(zhm.u.c(new TextLocalisedClause(R$string.credit_card_instalment_select_transaction_search_hint, null, null, 14)));
        ViewController.P2(this, rd0.e.b(d3().f174565c.v0()), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59409p.f57336l), new f(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), new g(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((TabsDelegate) this.V.getValue()).f53515c.f121375b), new g(this, continuation, 0), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(d3().f174565c.o.f57403b), rd0.e.b(d3().f174565c.s0()), rd0.e.b(d3().f174565c.x0()), rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), rd0.e.b(((SelectableDelegate) this.T.getValue()).r()), rd0.e.b(((FullScreenStateDelegate) this.U.getValue()).f52371h.f121375b), new fo6.d(rd0.e.b(d3().f174564b.o), 7)), new g(this, continuation, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ft4.q d() {
        return (ft4.q) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }
}
