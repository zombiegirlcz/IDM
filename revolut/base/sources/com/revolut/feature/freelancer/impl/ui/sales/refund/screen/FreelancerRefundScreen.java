package com.revolut.feature.freelancer.impl.ui.sales.refund.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreen;
import com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData;
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
import o27.c;
import o27.f;
import o27.g;
import o27.o;
import o27.p;
import o27.r;
import te0.w;
import us6.v0;
import us6.w0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/refund/screen/FreelancerRefundScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo27/o;", "Ldli/a;", "Lo27/s;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerRefundScreen extends ViewController<o> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(FreelancerRefundScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final FreelancerRefundScreenContract$InputData K;
    public final int L;
    public final h M;
    public final AmountEditDelegate N;
    public final FullScreenStateDelegate O;
    public final InputTextDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public FreelancerRefundScreen(FreelancerRefundScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, c.f);
        this.N = new AmountEditDelegate(new o27.b(2, 0, FreelancerRefundScreen.class, this, "getAmountMaskingDelegate", "getAmountMaskingDelegate(Lcom/revolut/core/ui_kit/delegates/AmountEditDelegate$Model;Lcom/revolut/core/ui_kit/views/amount/AmountEditView;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"));
        this.O = new FullScreenStateDelegate();
        this.P = new InputTextDelegate(null);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: o27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerRefundScreen f221506b;

            {
                this.f221506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerRefundScreen freelancerRefundScreen = this.f221506b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerRefundScreen.U;
                        qd0.b bVarN = ((w0) freelancerRefundScreen.R.getValue()).f282785b.f282691m.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerRefundScreen.U;
                        qji.b bVarU2 = freelancerRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.refund.screen.di.FreelancerRefundScreenInjector");
                        v0 v0Var = (v0) bVarU2;
                        us6.q qVar = v0Var.f282776b;
                        v0 v0Var2 = v0Var.f282777c;
                        FreelancerRefundScreenContract$InputData freelancerRefundScreenContract$InputData = freelancerRefundScreen.K;
                        freelancerRefundScreenContract$InputData.getClass();
                        return new w0(qVar, v0Var2, freelancerRefundScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = FreelancerRefundScreen.U;
                        return (p) ((w0) freelancerRefundScreen.R.getValue()).f282786c.get();
                    default:
                        KProperty[] kPropertyArr4 = FreelancerRefundScreen.U;
                        FreelancerRefundScreen freelancerRefundScreen2 = this.f221506b;
                        return dli.f.a(freelancerRefundScreen2, freelancerRefundScreen2.R2(), zhm.v.k(freelancerRefundScreen2.N, freelancerRefundScreen2.O, freelancerRefundScreen2.P, new PlainTextDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: o27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerRefundScreen f221506b;

            {
                this.f221506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerRefundScreen freelancerRefundScreen = this.f221506b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerRefundScreen.U;
                        qd0.b bVarN = ((w0) freelancerRefundScreen.R.getValue()).f282785b.f282691m.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerRefundScreen.U;
                        qji.b bVarU2 = freelancerRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.refund.screen.di.FreelancerRefundScreenInjector");
                        v0 v0Var = (v0) bVarU2;
                        us6.q qVar = v0Var.f282776b;
                        v0 v0Var2 = v0Var.f282777c;
                        FreelancerRefundScreenContract$InputData freelancerRefundScreenContract$InputData = freelancerRefundScreen.K;
                        freelancerRefundScreenContract$InputData.getClass();
                        return new w0(qVar, v0Var2, freelancerRefundScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = FreelancerRefundScreen.U;
                        return (p) ((w0) freelancerRefundScreen.R.getValue()).f282786c.get();
                    default:
                        KProperty[] kPropertyArr4 = FreelancerRefundScreen.U;
                        FreelancerRefundScreen freelancerRefundScreen2 = this.f221506b;
                        return dli.f.a(freelancerRefundScreen2, freelancerRefundScreen2.R2(), zhm.v.k(freelancerRefundScreen2.N, freelancerRefundScreen2.O, freelancerRefundScreen2.P, new PlainTextDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: o27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerRefundScreen f221506b;

            {
                this.f221506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerRefundScreen freelancerRefundScreen = this.f221506b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerRefundScreen.U;
                        qd0.b bVarN = ((w0) freelancerRefundScreen.R.getValue()).f282785b.f282691m.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerRefundScreen.U;
                        qji.b bVarU2 = freelancerRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.refund.screen.di.FreelancerRefundScreenInjector");
                        v0 v0Var = (v0) bVarU2;
                        us6.q qVar = v0Var.f282776b;
                        v0 v0Var2 = v0Var.f282777c;
                        FreelancerRefundScreenContract$InputData freelancerRefundScreenContract$InputData = freelancerRefundScreen.K;
                        freelancerRefundScreenContract$InputData.getClass();
                        return new w0(qVar, v0Var2, freelancerRefundScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = FreelancerRefundScreen.U;
                        return (p) ((w0) freelancerRefundScreen.R.getValue()).f282786c.get();
                    default:
                        KProperty[] kPropertyArr4 = FreelancerRefundScreen.U;
                        FreelancerRefundScreen freelancerRefundScreen2 = this.f221506b;
                        return dli.f.a(freelancerRefundScreen2, freelancerRefundScreen2.R2(), zhm.v.k(freelancerRefundScreen2.N, freelancerRefundScreen2.O, freelancerRefundScreen2.P, new PlainTextDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: o27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerRefundScreen f221506b;

            {
                this.f221506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                FreelancerRefundScreen freelancerRefundScreen = this.f221506b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerRefundScreen.U;
                        qd0.b bVarN = ((w0) freelancerRefundScreen.R.getValue()).f282785b.f282691m.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerRefundScreen.U;
                        qji.b bVarU2 = freelancerRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.refund.screen.di.FreelancerRefundScreenInjector");
                        v0 v0Var = (v0) bVarU2;
                        us6.q qVar = v0Var.f282776b;
                        v0 v0Var2 = v0Var.f282777c;
                        FreelancerRefundScreenContract$InputData freelancerRefundScreenContract$InputData = freelancerRefundScreen.K;
                        freelancerRefundScreenContract$InputData.getClass();
                        return new w0(qVar, v0Var2, freelancerRefundScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = FreelancerRefundScreen.U;
                        return (p) ((w0) freelancerRefundScreen.R.getValue()).f282786c.get();
                    default:
                        KProperty[] kPropertyArr4 = FreelancerRefundScreen.U;
                        FreelancerRefundScreen freelancerRefundScreen2 = this.f221506b;
                        return dli.f.a(freelancerRefundScreen2, freelancerRefundScreen2.R2(), zhm.v.k(freelancerRefundScreen2.N, freelancerRefundScreen2.O, freelancerRefundScreen2.P, new PlainTextDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        o27.s uiState = (o27.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        r rVar = uiState.f221527a;
        o27.q qVar2 = uiState.f221529c;
        TextLocalisedClause textLocalisedClause = rVar.f221525a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = rVar.f221526b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(qVar2.f221523a);
        largeActionButton.setEnabled(qVar2.f221524b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new o27.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new o27.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.e.f121375b), new g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
