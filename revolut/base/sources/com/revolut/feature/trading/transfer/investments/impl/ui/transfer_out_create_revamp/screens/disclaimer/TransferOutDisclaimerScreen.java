package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.disclaimer;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.d;
import aw0.e;
import aw0.n6;
import cbf.c;
import cbf.f;
import cbf.j;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.disclaimer.TransferOutDisclaimerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.w;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.n;
import l9f.o;
import pki.b;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/disclaimer/TransferOutDisclaimerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lcbf/h;", "<init>", "()V", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferOutDisclaimerScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransferOutDisclaimerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public f N;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final WebViewDelegate K = new WebViewDelegate();
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final h M = s.t(this, a.f);
    public final int O = R$layout.screen_recycler_navbar_twin_vertical_buttons;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, w.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return w.a(p0);
        }
    }

    public TransferOutDisclaimerScreen() {
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: cbf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutDisclaimerScreen f22787b;

            {
                this.f22787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferOutDisclaimerScreen transferOutDisclaimerScreen = this.f22787b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferOutDisclaimerScreen.S;
                        qji.b bVarU2 = transferOutDisclaimerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.disclaimer.di.TransferOutDisclaimerScreenInjector");
                        l9f.k kVar = ((o) bVarU2).f193206b;
                        n nVar = new n();
                        nVar.f193204a = e4m.b.b(new kw5.e(kVar, 13));
                        return nVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferOutDisclaimerScreen.S;
                        return (j) ((n) transferOutDisclaimerScreen.P.getValue()).f193204a.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferOutDisclaimerScreen.S;
                        TransferOutDisclaimerScreen transferOutDisclaimerScreen2 = this.f22787b;
                        return dli.f.a(transferOutDisclaimerScreen2, (j) transferOutDisclaimerScreen2.Q.getValue(), v.k(transferOutDisclaimerScreen2.K, new FullScreenDocumentLoadingDelegate(), transferOutDisclaimerScreen2.L), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: cbf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutDisclaimerScreen f22787b;

            {
                this.f22787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferOutDisclaimerScreen transferOutDisclaimerScreen = this.f22787b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferOutDisclaimerScreen.S;
                        qji.b bVarU2 = transferOutDisclaimerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.disclaimer.di.TransferOutDisclaimerScreenInjector");
                        l9f.k kVar = ((o) bVarU2).f193206b;
                        n nVar = new n();
                        nVar.f193204a = e4m.b.b(new kw5.e(kVar, 13));
                        return nVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferOutDisclaimerScreen.S;
                        return (j) ((n) transferOutDisclaimerScreen.P.getValue()).f193204a.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferOutDisclaimerScreen.S;
                        TransferOutDisclaimerScreen transferOutDisclaimerScreen2 = this.f22787b;
                        return dli.f.a(transferOutDisclaimerScreen2, (j) transferOutDisclaimerScreen2.Q.getValue(), v.k(transferOutDisclaimerScreen2.K, new FullScreenDocumentLoadingDelegate(), transferOutDisclaimerScreen2.L), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: cbf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutDisclaimerScreen f22787b;

            {
                this.f22787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferOutDisclaimerScreen transferOutDisclaimerScreen = this.f22787b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferOutDisclaimerScreen.S;
                        qji.b bVarU2 = transferOutDisclaimerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.disclaimer.di.TransferOutDisclaimerScreenInjector");
                        l9f.k kVar = ((o) bVarU2).f193206b;
                        n nVar = new n();
                        nVar.f193204a = e4m.b.b(new kw5.e(kVar, 13));
                        return nVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TransferOutDisclaimerScreen.S;
                        return (j) ((n) transferOutDisclaimerScreen.P.getValue()).f193204a.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferOutDisclaimerScreen.S;
                        TransferOutDisclaimerScreen transferOutDisclaimerScreen2 = this.f22787b;
                        return dli.f.a(transferOutDisclaimerScreen2, (j) transferOutDisclaimerScreen2.Q.getValue(), v.k(transferOutDisclaimerScreen2.K, new FullScreenDocumentLoadingDelegate(), transferOutDisclaimerScreen2.L), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        cbf.h uiState = (cbf.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        TextLocalisedClause textLocalisedClause = uiState.f22793a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        TwinVerticalButton twinVerticalButton = d3().d;
        e eVar = uiState.f22794b;
        n6 n6Var = eVar.d;
        twinVerticalButton.setMainButtonText(n6Var.f10433a);
        twinVerticalButton.setMainButtonStyle(n6Var.f10434b);
        d dVar = eVar.e;
        if (dVar != null) {
            twinVerticalButton.setFabImage(dVar.f10272a);
            twinVerticalButton.setFabEnabled(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174570b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setVisibility(8);
        twinVerticalButton.setSecondaryButtonVisible(false);
        f fVar = this.N;
        if (fVar != null) {
            d3().f174571c.removeOnScrollListener(fVar);
        }
        f fVar2 = new f(this);
        d3().f174571c.addOnScrollListener(fVar2);
        this.N = fVar2;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = 0;
        Continuation continuation = null;
        ViewController.P2(this, new c(rd0.e.b(this.K.f53637c), i), new cbf.d(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174570b.f59410q), new cbf.d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new cbf.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.m0()), new cbf.d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new cbf.d(this, continuation, 3), 3);
    }

    public final w d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
