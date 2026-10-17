package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b94.d;
import b94.f;
import b94.g;
import b94.m;
import b94.n;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.g8;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb94/m;", "Ldli/a;", "Lb94/o;", "Companion", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DebtDetailsController extends ViewController<m> implements dli.a {
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final InputChecklistDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(DebtDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public DebtDetailsController(DebtDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = s.t(this, b94.b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: b94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f13642b;

            {
                this.f13642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DebtDetailsController debtDetailsController = this.f13642b;
                switch (i2) {
                    case 0:
                        DebtDetailsController.Companion companion = DebtDetailsController.INSTANCE;
                        return debtDetailsController.d3().e;
                    case 1:
                        DebtDetailsController.Companion companion2 = DebtDetailsController.INSTANCE;
                        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = debtDetailsController.d3().f174557b;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
                        return screenRecyclerNavbarFooterNextbuttonButton;
                    case 2:
                        DebtDetailsController.Companion companion3 = DebtDetailsController.INSTANCE;
                        return new InputTextDelegate(new b7d.c(debtDetailsController, 3));
                    case 3:
                        DebtDetailsController.Companion companion4 = DebtDetailsController.INSTANCE;
                        qd0.b bVarN = ((g8) debtDetailsController.S.getValue()).f118830b.f118443h.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        DebtDetailsController.Companion companion5 = DebtDetailsController.INSTANCE;
                        DebtDetailsController debtDetailsController2 = this.f13642b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.d(), v.k((InputTextDelegate) debtDetailsController2.P.getValue(), debtDetailsController2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        DebtDetailsController.Companion companion6 = DebtDetailsController.INSTANCE;
                        return (n) ((g8) debtDetailsController.S.getValue()).f118833h.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: b94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f13642b;

            {
                this.f13642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DebtDetailsController debtDetailsController = this.f13642b;
                switch (i22) {
                    case 0:
                        DebtDetailsController.Companion companion = DebtDetailsController.INSTANCE;
                        return debtDetailsController.d3().e;
                    case 1:
                        DebtDetailsController.Companion companion2 = DebtDetailsController.INSTANCE;
                        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = debtDetailsController.d3().f174557b;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
                        return screenRecyclerNavbarFooterNextbuttonButton;
                    case 2:
                        DebtDetailsController.Companion companion3 = DebtDetailsController.INSTANCE;
                        return new InputTextDelegate(new b7d.c(debtDetailsController, 3));
                    case 3:
                        DebtDetailsController.Companion companion4 = DebtDetailsController.INSTANCE;
                        qd0.b bVarN = ((g8) debtDetailsController.S.getValue()).f118830b.f118443h.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        DebtDetailsController.Companion companion5 = DebtDetailsController.INSTANCE;
                        DebtDetailsController debtDetailsController2 = this.f13642b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.d(), v.k((InputTextDelegate) debtDetailsController2.P.getValue(), debtDetailsController2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        DebtDetailsController.Companion companion6 = DebtDetailsController.INSTANCE;
                        return (n) ((g8) debtDetailsController.S.getValue()).f118833h.get();
                }
            }
        });
        this.O = new InputChecklistDelegate();
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: b94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f13642b;

            {
                this.f13642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DebtDetailsController debtDetailsController = this.f13642b;
                switch (i22) {
                    case 0:
                        DebtDetailsController.Companion companion = DebtDetailsController.INSTANCE;
                        return debtDetailsController.d3().e;
                    case 1:
                        DebtDetailsController.Companion companion2 = DebtDetailsController.INSTANCE;
                        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = debtDetailsController.d3().f174557b;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
                        return screenRecyclerNavbarFooterNextbuttonButton;
                    case 2:
                        DebtDetailsController.Companion companion3 = DebtDetailsController.INSTANCE;
                        return new InputTextDelegate(new b7d.c(debtDetailsController, 3));
                    case 3:
                        DebtDetailsController.Companion companion4 = DebtDetailsController.INSTANCE;
                        qd0.b bVarN = ((g8) debtDetailsController.S.getValue()).f118830b.f118443h.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        DebtDetailsController.Companion companion5 = DebtDetailsController.INSTANCE;
                        DebtDetailsController debtDetailsController2 = this.f13642b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.d(), v.k((InputTextDelegate) debtDetailsController2.P.getValue(), debtDetailsController2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        DebtDetailsController.Companion companion6 = DebtDetailsController.INSTANCE;
                        return (n) ((g8) debtDetailsController.S.getValue()).f118833h.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: b94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f13642b;

            {
                this.f13642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DebtDetailsController debtDetailsController = this.f13642b;
                switch (i22) {
                    case 0:
                        DebtDetailsController.Companion companion = DebtDetailsController.INSTANCE;
                        return debtDetailsController.d3().e;
                    case 1:
                        DebtDetailsController.Companion companion2 = DebtDetailsController.INSTANCE;
                        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = debtDetailsController.d3().f174557b;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
                        return screenRecyclerNavbarFooterNextbuttonButton;
                    case 2:
                        DebtDetailsController.Companion companion3 = DebtDetailsController.INSTANCE;
                        return new InputTextDelegate(new b7d.c(debtDetailsController, 3));
                    case 3:
                        DebtDetailsController.Companion companion4 = DebtDetailsController.INSTANCE;
                        qd0.b bVarN = ((g8) debtDetailsController.S.getValue()).f118830b.f118443h.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        DebtDetailsController.Companion companion5 = DebtDetailsController.INSTANCE;
                        DebtDetailsController debtDetailsController2 = this.f13642b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.d(), v.k((InputTextDelegate) debtDetailsController2.P.getValue(), debtDetailsController2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        DebtDetailsController.Companion companion6 = DebtDetailsController.INSTANCE;
                        return (n) ((g8) debtDetailsController.S.getValue()).f118833h.get();
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: b94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f13642b;

            {
                this.f13642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                DebtDetailsController debtDetailsController = this.f13642b;
                switch (i22) {
                    case 0:
                        DebtDetailsController.Companion companion = DebtDetailsController.INSTANCE;
                        return debtDetailsController.d3().e;
                    case 1:
                        DebtDetailsController.Companion companion2 = DebtDetailsController.INSTANCE;
                        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = debtDetailsController.d3().f174557b;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
                        return screenRecyclerNavbarFooterNextbuttonButton;
                    case 2:
                        DebtDetailsController.Companion companion3 = DebtDetailsController.INSTANCE;
                        return new InputTextDelegate(new b7d.c(debtDetailsController, 3));
                    case 3:
                        DebtDetailsController.Companion companion4 = DebtDetailsController.INSTANCE;
                        qd0.b bVarN = ((g8) debtDetailsController.S.getValue()).f118830b.f118443h.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        DebtDetailsController.Companion companion5 = DebtDetailsController.INSTANCE;
                        DebtDetailsController debtDetailsController2 = this.f13642b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.d(), v.k((InputTextDelegate) debtDetailsController2.P.getValue(), debtDetailsController2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        DebtDetailsController.Companion companion6 = DebtDetailsController.INSTANCE;
                        return (n) ((g8) debtDetailsController.S.getValue()).f118833h.get();
                }
            }
        });
        this.S = w.y0(new at4.b(this, inputData, 24));
        final int i21 = 5;
        this.T = w.y0(new Function0(this) { // from class: b94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtDetailsController f13642b;

            {
                this.f13642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                DebtDetailsController debtDetailsController = this.f13642b;
                switch (i22) {
                    case 0:
                        DebtDetailsController.Companion companion = DebtDetailsController.INSTANCE;
                        return debtDetailsController.d3().e;
                    case 1:
                        DebtDetailsController.Companion companion2 = DebtDetailsController.INSTANCE;
                        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = debtDetailsController.d3().f174557b;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
                        return screenRecyclerNavbarFooterNextbuttonButton;
                    case 2:
                        DebtDetailsController.Companion companion3 = DebtDetailsController.INSTANCE;
                        return new InputTextDelegate(new b7d.c(debtDetailsController, 3));
                    case 3:
                        DebtDetailsController.Companion companion4 = DebtDetailsController.INSTANCE;
                        qd0.b bVarN = ((g8) debtDetailsController.S.getValue()).f118830b.f118443h.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        DebtDetailsController.Companion companion5 = DebtDetailsController.INSTANCE;
                        DebtDetailsController debtDetailsController2 = this.f13642b;
                        return dli.f.a(debtDetailsController2, debtDetailsController2.d(), v.k((InputTextDelegate) debtDetailsController2.P.getValue(), debtDetailsController2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        DebtDetailsController.Companion companion6 = DebtDetailsController.INSTANCE;
                        return (n) ((g8) debtDetailsController.S.getValue()).f118833h.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b94.o uiState = (b94.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.M.getValue();
        navBarWithToolbar.setToolbarTitle(uiState.f13653a);
        navBarWithToolbar.setTitle(uiState.f13653a, null);
        navBarWithToolbar.setMenuItems(uiState.e);
        ?? r4 = this.N;
        ((LargeActionButton) r4.getValue()).setText(uiState.f13654b);
        ((LargeActionButton) r4.getValue()).setEnabled(uiState.d);
        d3().f174558c.setTextClause(uiState.f13655c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g8) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((NavBarWithToolbar) this.M.getValue()).setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((LargeActionButton) this.N.getValue()).setLoadingButtonTag("LOADING_TAG_ADD_DEBT");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r06 = this.M;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r06.getValue()).f59410q), new b94.c(view, this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r06.getValue()).o.f57403b), new d(this, continuation, 0), 3);
        ?? r09 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r09.getValue()).e.f121375b), null, new b94.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r09.getValue()).f52579m), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r09.getValue()).f52575g.f121375b), new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r09.getValue()).f.f121375b), null, new d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52518c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButton) this.N.getValue()).o), new b94.c(view, this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
