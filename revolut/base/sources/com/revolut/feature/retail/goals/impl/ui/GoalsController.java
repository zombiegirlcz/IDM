package com.revolut.feature.retail.goals.impl.ui;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cab.b;
import cab.c;
import cab.d;
import cli.o;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.goals.impl.R$id;
import com.revolut.feature.retail.goals.impl.R$layout;
import com.revolut.feature.retail.goals.impl.ui.GoalsController;
import com.revolut.feature.retail.goals.impl.ui.GoalsControllerContract$InputData;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/goals/impl/ui/GoalsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lcab/h;", "feature_retail_goals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoalsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(GoalsController.class, "binding", "getBinding()Lcom/revolut/feature/retail/goals/impl/databinding/ScreenGoalsAmountBinding;", 0))};
    public final GoalsControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final boolean N;
    public final int O;
    public final Object P;
    public final h Q;
    public final Lazy R;
    public final Object S;
    public final Object T;

    public GoalsController(GoalsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: cab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsController f22577b;

            {
                this.f22577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GoalsController goalsController = this.f22577b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GoalsController.U;
                        qd0.b bVarN = ((bab.b) goalsController.S.getValue()).f14009b.f14005a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = GoalsController.U;
                        return new CenteredAmountDelegate(new c9f.c(goalsController, 3));
                    case 2:
                        KProperty[] kPropertyArr3 = GoalsController.U;
                        GoalsController goalsController2 = this.f22577b;
                        return dli.f.a(goalsController2, goalsController2.R2(), u.c((CenteredAmountDelegate) goalsController2.M.getValue()), R$id.goals_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = GoalsController.U;
                        return goalsController.d3().f320323c;
                    case 4:
                        KProperty[] kPropertyArr5 = GoalsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(goalsController.m2()).a().get(bab.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bab.a.class, " is not found"));
                        }
                        bab.a aVar3 = ((bab.a) aVar2.b()).d;
                        GoalsControllerContract$InputData goalsControllerContract$InputData = goalsController.K;
                        goalsControllerContract$InputData.getClass();
                        return new bab.b(aVar3, goalsController, goalsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = GoalsController.U;
                        return (e) ((bab.b) goalsController.S.getValue()).f14012h.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: cab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsController f22577b;

            {
                this.f22577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GoalsController goalsController = this.f22577b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GoalsController.U;
                        qd0.b bVarN = ((bab.b) goalsController.S.getValue()).f14009b.f14005a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = GoalsController.U;
                        return new CenteredAmountDelegate(new c9f.c(goalsController, 3));
                    case 2:
                        KProperty[] kPropertyArr3 = GoalsController.U;
                        GoalsController goalsController2 = this.f22577b;
                        return dli.f.a(goalsController2, goalsController2.R2(), u.c((CenteredAmountDelegate) goalsController2.M.getValue()), R$id.goals_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = GoalsController.U;
                        return goalsController.d3().f320323c;
                    case 4:
                        KProperty[] kPropertyArr5 = GoalsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(goalsController.m2()).a().get(bab.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bab.a.class, " is not found"));
                        }
                        bab.a aVar3 = ((bab.a) aVar2.b()).d;
                        GoalsControllerContract$InputData goalsControllerContract$InputData = goalsController.K;
                        goalsControllerContract$InputData.getClass();
                        return new bab.b(aVar3, goalsController, goalsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = GoalsController.U;
                        return (e) ((bab.b) goalsController.S.getValue()).f14012h.get();
                }
            }
        });
        this.N = true;
        this.O = R$layout.screen_goals_amount;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: cab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsController f22577b;

            {
                this.f22577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GoalsController goalsController = this.f22577b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GoalsController.U;
                        qd0.b bVarN = ((bab.b) goalsController.S.getValue()).f14009b.f14005a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = GoalsController.U;
                        return new CenteredAmountDelegate(new c9f.c(goalsController, 3));
                    case 2:
                        KProperty[] kPropertyArr3 = GoalsController.U;
                        GoalsController goalsController2 = this.f22577b;
                        return dli.f.a(goalsController2, goalsController2.R2(), u.c((CenteredAmountDelegate) goalsController2.M.getValue()), R$id.goals_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = GoalsController.U;
                        return goalsController.d3().f320323c;
                    case 4:
                        KProperty[] kPropertyArr5 = GoalsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(goalsController.m2()).a().get(bab.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bab.a.class, " is not found"));
                        }
                        bab.a aVar3 = ((bab.a) aVar2.b()).d;
                        GoalsControllerContract$InputData goalsControllerContract$InputData = goalsController.K;
                        goalsControllerContract$InputData.getClass();
                        return new bab.b(aVar3, goalsController, goalsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = GoalsController.U;
                        return (e) ((bab.b) goalsController.S.getValue()).f14012h.get();
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i5 = 3;
        this.R = j.b(new Function0(this) { // from class: cab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsController f22577b;

            {
                this.f22577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                GoalsController goalsController = this.f22577b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GoalsController.U;
                        qd0.b bVarN = ((bab.b) goalsController.S.getValue()).f14009b.f14005a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = GoalsController.U;
                        return new CenteredAmountDelegate(new c9f.c(goalsController, 3));
                    case 2:
                        KProperty[] kPropertyArr3 = GoalsController.U;
                        GoalsController goalsController2 = this.f22577b;
                        return dli.f.a(goalsController2, goalsController2.R2(), u.c((CenteredAmountDelegate) goalsController2.M.getValue()), R$id.goals_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = GoalsController.U;
                        return goalsController.d3().f320323c;
                    case 4:
                        KProperty[] kPropertyArr5 = GoalsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(goalsController.m2()).a().get(bab.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bab.a.class, " is not found"));
                        }
                        bab.a aVar3 = ((bab.a) aVar2.b()).d;
                        GoalsControllerContract$InputData goalsControllerContract$InputData = goalsController.K;
                        goalsControllerContract$InputData.getClass();
                        return new bab.b(aVar3, goalsController, goalsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = GoalsController.U;
                        return (e) ((bab.b) goalsController.S.getValue()).f14012h.get();
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: cab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsController f22577b;

            {
                this.f22577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                GoalsController goalsController = this.f22577b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GoalsController.U;
                        qd0.b bVarN = ((bab.b) goalsController.S.getValue()).f14009b.f14005a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = GoalsController.U;
                        return new CenteredAmountDelegate(new c9f.c(goalsController, 3));
                    case 2:
                        KProperty[] kPropertyArr3 = GoalsController.U;
                        GoalsController goalsController2 = this.f22577b;
                        return dli.f.a(goalsController2, goalsController2.R2(), u.c((CenteredAmountDelegate) goalsController2.M.getValue()), R$id.goals_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = GoalsController.U;
                        return goalsController.d3().f320323c;
                    case 4:
                        KProperty[] kPropertyArr5 = GoalsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(goalsController.m2()).a().get(bab.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bab.a.class, " is not found"));
                        }
                        bab.a aVar3 = ((bab.a) aVar2.b()).d;
                        GoalsControllerContract$InputData goalsControllerContract$InputData = goalsController.K;
                        goalsControllerContract$InputData.getClass();
                        return new bab.b(aVar3, goalsController, goalsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = GoalsController.U;
                        return (e) ((bab.b) goalsController.S.getValue()).f14012h.get();
                }
            }
        });
        final int i21 = 5;
        this.T = w.y0(new Function0(this) { // from class: cab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsController f22577b;

            {
                this.f22577b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                GoalsController goalsController = this.f22577b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GoalsController.U;
                        qd0.b bVarN = ((bab.b) goalsController.S.getValue()).f14009b.f14005a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = GoalsController.U;
                        return new CenteredAmountDelegate(new c9f.c(goalsController, 3));
                    case 2:
                        KProperty[] kPropertyArr3 = GoalsController.U;
                        GoalsController goalsController2 = this.f22577b;
                        return dli.f.a(goalsController2, goalsController2.R2(), u.c((CenteredAmountDelegate) goalsController2.M.getValue()), R$id.goals_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = GoalsController.U;
                        return goalsController.d3().f320323c;
                    case 4:
                        KProperty[] kPropertyArr5 = GoalsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(goalsController.m2()).a().get(bab.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bab.a.class, " is not found"));
                        }
                        bab.a aVar3 = ((bab.a) aVar2.b()).d;
                        GoalsControllerContract$InputData goalsControllerContract$InputData = goalsController.K;
                        goalsControllerContract$InputData.getClass();
                        return new bab.b(aVar3, goalsController, goalsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = GoalsController.U;
                        return (e) ((bab.b) goalsController.S.getValue()).f14012h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        cab.h uiState = (cab.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ((NavBarWithToolbar) this.R.getValue()).setMenuItems(uiState.f22585a);
        d3().f320322b.setModel(uiState.f22586b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bab.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.R.getValue();
        navBarWithToolbar.setVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.vaults_details_edit_your_vault_goal, null, null, 14));
        navBarWithToolbar.j0(false);
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) this.R.getValue()).f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f320323c.o.f57403b), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f320322b.f), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f320322b.f58955g), new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.M.getValue()).d.f121375b), null, new d(this, continuation, 1), 3);
    }

    public final z9b.a d3() {
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (z9b.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cab.e R2() {
        return (cab.e) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
