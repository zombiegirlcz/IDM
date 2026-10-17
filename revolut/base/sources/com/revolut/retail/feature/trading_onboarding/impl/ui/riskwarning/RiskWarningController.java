package com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning.RiskWarningController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kyk.t;
import kyk.v;
import kyk.y;
import no.m;
import te0.w;
import vc.s;
import x0l.b;
import x0l.d;
import x0l.f;
import x0l.g;
import x0l.i;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/riskwarning/RiskWarningController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lx0l/b;", "Lno/m;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RiskWarningController extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(RiskWarningController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final AnalyticsProduct K;
    public final WebViewDelegate L;
    public final FullScreenStateDelegate M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public x0l.h R;
    public final Object S;
    public final Object T;
    public final int U;
    public final Object V;

    public RiskWarningController(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.K = analyticsProduct;
        this.L = new WebViewDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = s.t(this, d.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: x0l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskWarningController f301657b;

            {
                this.f301657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                RiskWarningController riskWarningController = this.f301657b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RiskWarningController.W;
                        return riskWarningController.d3().f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskWarningController.W;
                        return riskWarningController.d3().f174571c;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskWarningController.W;
                        return riskWarningController.d3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = RiskWarningController.W;
                        return (i) ((t) riskWarningController.T.getValue()).f190978a.get();
                    case 4:
                        KProperty[] kPropertyArr5 = RiskWarningController.W;
                        phm.a aVar = (phm.a) ue0.e.j(riskWarningController.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        v vVar = ((v) ((y) aVar2.b())).A;
                        t tVar = new t();
                        tVar.f190978a = e4m.b.b(new kyk.s(vVar, i3));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr6 = RiskWarningController.W;
                        RiskWarningController riskWarningController2 = this.f301657b;
                        return dli.f.a(riskWarningController2, (i) riskWarningController2.S.getValue(), zhm.v.k(riskWarningController2.L, riskWarningController2.M), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: x0l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskWarningController f301657b;

            {
                this.f301657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                RiskWarningController riskWarningController = this.f301657b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RiskWarningController.W;
                        return riskWarningController.d3().f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskWarningController.W;
                        return riskWarningController.d3().f174571c;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskWarningController.W;
                        return riskWarningController.d3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = RiskWarningController.W;
                        return (i) ((t) riskWarningController.T.getValue()).f190978a.get();
                    case 4:
                        KProperty[] kPropertyArr5 = RiskWarningController.W;
                        phm.a aVar = (phm.a) ue0.e.j(riskWarningController.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        v vVar = ((v) ((y) aVar2.b())).A;
                        t tVar = new t();
                        tVar.f190978a = e4m.b.b(new kyk.s(vVar, i3));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr6 = RiskWarningController.W;
                        RiskWarningController riskWarningController2 = this.f301657b;
                        return dli.f.a(riskWarningController2, (i) riskWarningController2.S.getValue(), zhm.v.k(riskWarningController2.L, riskWarningController2.M), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: x0l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskWarningController f301657b;

            {
                this.f301657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                RiskWarningController riskWarningController = this.f301657b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RiskWarningController.W;
                        return riskWarningController.d3().f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskWarningController.W;
                        return riskWarningController.d3().f174571c;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskWarningController.W;
                        return riskWarningController.d3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = RiskWarningController.W;
                        return (i) ((t) riskWarningController.T.getValue()).f190978a.get();
                    case 4:
                        KProperty[] kPropertyArr5 = RiskWarningController.W;
                        phm.a aVar = (phm.a) ue0.e.j(riskWarningController.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        v vVar = ((v) ((y) aVar2.b())).A;
                        t tVar = new t();
                        tVar.f190978a = e4m.b.b(new kyk.s(vVar, i32));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr6 = RiskWarningController.W;
                        RiskWarningController riskWarningController2 = this.f301657b;
                        return dli.f.a(riskWarningController2, (i) riskWarningController2.S.getValue(), zhm.v.k(riskWarningController2.L, riskWarningController2.M), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: x0l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskWarningController f301657b;

            {
                this.f301657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 0;
                RiskWarningController riskWarningController = this.f301657b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RiskWarningController.W;
                        return riskWarningController.d3().f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskWarningController.W;
                        return riskWarningController.d3().f174571c;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskWarningController.W;
                        return riskWarningController.d3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = RiskWarningController.W;
                        return (i) ((t) riskWarningController.T.getValue()).f190978a.get();
                    case 4:
                        KProperty[] kPropertyArr5 = RiskWarningController.W;
                        phm.a aVar = (phm.a) ue0.e.j(riskWarningController.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        v vVar = ((v) ((y) aVar2.b())).A;
                        t tVar = new t();
                        tVar.f190978a = e4m.b.b(new kyk.s(vVar, i32));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr6 = RiskWarningController.W;
                        RiskWarningController riskWarningController2 = this.f301657b;
                        return dli.f.a(riskWarningController2, (i) riskWarningController2.S.getValue(), zhm.v.k(riskWarningController2.L, riskWarningController2.M), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: x0l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskWarningController f301657b;

            {
                this.f301657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                int i32 = 0;
                RiskWarningController riskWarningController = this.f301657b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RiskWarningController.W;
                        return riskWarningController.d3().f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskWarningController.W;
                        return riskWarningController.d3().f174571c;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskWarningController.W;
                        return riskWarningController.d3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = RiskWarningController.W;
                        return (i) ((t) riskWarningController.T.getValue()).f190978a.get();
                    case 4:
                        KProperty[] kPropertyArr5 = RiskWarningController.W;
                        phm.a aVar = (phm.a) ue0.e.j(riskWarningController.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        v vVar = ((v) ((y) aVar2.b())).A;
                        t tVar = new t();
                        tVar.f190978a = e4m.b.b(new kyk.s(vVar, i32));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr6 = RiskWarningController.W;
                        RiskWarningController riskWarningController2 = this.f301657b;
                        return dli.f.a(riskWarningController2, (i) riskWarningController2.S.getValue(), zhm.v.k(riskWarningController2.L, riskWarningController2.M), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.U = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        final int i21 = 5;
        this.V = w.y0(new Function0(this) { // from class: x0l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskWarningController f301657b;

            {
                this.f301657b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                int i32 = 0;
                RiskWarningController riskWarningController = this.f301657b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RiskWarningController.W;
                        return riskWarningController.d3().f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskWarningController.W;
                        return riskWarningController.d3().f174571c;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskWarningController.W;
                        return riskWarningController.d3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = RiskWarningController.W;
                        return (i) ((t) riskWarningController.T.getValue()).f190978a.get();
                    case 4:
                        KProperty[] kPropertyArr5 = RiskWarningController.W;
                        phm.a aVar = (phm.a) ue0.e.j(riskWarningController.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                        }
                        v vVar = ((v) ((y) aVar2.b())).A;
                        t tVar = new t();
                        tVar.f190978a = e4m.b.b(new kyk.s(vVar, i32));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr6 = RiskWarningController.W;
                        RiskWarningController riskWarningController2 = this.f301657b;
                        return dli.f.a(riskWarningController2, (i) riskWarningController2.S.getValue(), zhm.v.k(riskWarningController2.L, riskWarningController2.M), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.O.getValue();
        TextLocalisedClause textLocalisedClause = uiState.f301653a;
        e eVar = uiState.f301655c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f301654b;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        TwinVerticalButton twinVerticalButtonE3 = e3();
        n6 n6Var = eVar.d;
        twinVerticalButtonE3.setMainButtonText(n6Var.f10433a);
        twinVerticalButtonE3.setMainButtonStyle(n6Var.f10434b);
        aw0.d dVar = eVar.e;
        if (dVar != null) {
            twinVerticalButtonE3.setFabImage(dVar.f10272a);
            twinVerticalButtonE3.setFabEnabled(true);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((NavBarWithToolbar) this.O.getValue()).setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TwinVerticalButton twinVerticalButtonE3 = e3();
        twinVerticalButtonE3.setVisibility(8);
        twinVerticalButtonE3.setSecondaryButtonVisible(false);
        x0l.h hVar = this.R;
        ?? r06 = this.P;
        if (hVar != null) {
            ((ScreenContentRecyclerView) r06.getValue()).removeOnScrollListener(hVar);
        }
        x0l.h hVar2 = new x0l.h(this);
        ((ScreenContentRecyclerView) r06.getValue()).addOnScrollListener(hVar2);
        this.R = hVar2;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, new wvl.b(rd0.e.b(this.L.f53637c), 12), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new g(this, null), 3);
        TwinVerticalButton twinVerticalButtonE3 = e3();
        ViewController.P2(this, rd0.e.b(twinVerticalButtonE3.m0()), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButtonE3.o0()), new f(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) this.O.getValue()).f59410q), new f(this, continuation, 3), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final TwinVerticalButton e3() {
        return (TwinVerticalButton) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }
}
