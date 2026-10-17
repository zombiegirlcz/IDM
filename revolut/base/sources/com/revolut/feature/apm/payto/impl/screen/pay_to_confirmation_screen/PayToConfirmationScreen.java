package com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nb2.c;
import ot1.p;
import ox5.r;
import pb2.e;
import pb2.f;
import pb2.g;
import pb2.i;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpb2/p;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayToConfirmationScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PayToConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final FullScreenStateDelegate L;
    public final ListSubheaderDelegate M;
    public final TextDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public PayToConfirmationScreen(PayToConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = new FullScreenStateDelegate();
        this.M = new ListSubheaderDelegate();
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: pb2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToConfirmationScreen f234605b;

            {
                this.f234605b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PayToConfirmationScreen.S;
                        PayToConfirmationScreen payToConfirmationScreen = this.f234605b;
                        return dli.f.a(payToConfirmationScreen, payToConfirmationScreen.d(), zhm.v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new CellDetailsDelegate(), payToConfirmationScreen.M, payToConfirmationScreen.L, payToConfirmationScreen.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PayToConfirmationScreen.S;
                        return (i) ((nb2.c) this.f234605b.Q.getValue()).f213969c.get();
                }
            }
        });
        this.P = s.t(this, e.f);
        this.Q = w.y0(new p(this, inputData, 23));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: pb2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToConfirmationScreen f234605b;

            {
                this.f234605b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayToConfirmationScreen.S;
                        PayToConfirmationScreen payToConfirmationScreen = this.f234605b;
                        return dli.f.a(payToConfirmationScreen, payToConfirmationScreen.d(), zhm.v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new CellDetailsDelegate(), payToConfirmationScreen.M, payToConfirmationScreen.L, payToConfirmationScreen.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PayToConfirmationScreen.S;
                        return (i) ((nb2.c) this.f234605b.Q.getValue()).f213969c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        pb2.p uiState = (pb2.p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setTitle(uiState.f234614b, null);
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(uiState.f234615c ? 0 : 8);
        actionFooterView.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f58955g), new f(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new r(this, null, 19), 3);
    }

    public final k d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
