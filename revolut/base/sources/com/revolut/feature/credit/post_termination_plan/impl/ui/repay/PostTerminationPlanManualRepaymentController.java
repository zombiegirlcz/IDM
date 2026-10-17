package com.revolut.feature.credit.post_termination_plan.impl.ui.repay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oa5.d;
import te0.w;
import vc.s;
import xki.e;
import y8a.g;
import ya5.b;
import ya5.c;
import ya5.i;
import ya5.l;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/impl/ui/repay/PostTerminationPlanManualRepaymentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lya5/i;", "feature_credit_post_termination_plan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PostTerminationPlanManualRepaymentController extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PostTerminationPlanManualRepaymentController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final CenteredAmountDelegate R;
    public final Object S;

    public PostTerminationPlanManualRepaymentController(PostTerminationPlanManualRepaymentControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = true;
        this.M = s.t(this, b.f);
        this.N = w.y0(new y1a.a(this, inputData, 10));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ya5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostTerminationPlanManualRepaymentController f311930b;

            {
                this.f311930b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PostTerminationPlanManualRepaymentController postTerminationPlanManualRepaymentController = this.f311930b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PostTerminationPlanManualRepaymentController.T;
                        return (l) ((oa5.d) postTerminationPlanManualRepaymentController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PostTerminationPlanManualRepaymentController.T;
                        qd0.b bVarN = ((oa5.d) postTerminationPlanManualRepaymentController.N.getValue()).f223542b.f.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = PostTerminationPlanManualRepaymentController.T;
                        PostTerminationPlanManualRepaymentController postTerminationPlanManualRepaymentController2 = this.f311930b;
                        return dli.f.a(postTerminationPlanManualRepaymentController2, postTerminationPlanManualRepaymentController2.k3(), v.k(postTerminationPlanManualRepaymentController2.R, postTerminationPlanManualRepaymentController2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ya5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostTerminationPlanManualRepaymentController f311930b;

            {
                this.f311930b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PostTerminationPlanManualRepaymentController postTerminationPlanManualRepaymentController = this.f311930b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PostTerminationPlanManualRepaymentController.T;
                        return (l) ((oa5.d) postTerminationPlanManualRepaymentController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PostTerminationPlanManualRepaymentController.T;
                        qd0.b bVarN = ((oa5.d) postTerminationPlanManualRepaymentController.N.getValue()).f223542b.f.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = PostTerminationPlanManualRepaymentController.T;
                        PostTerminationPlanManualRepaymentController postTerminationPlanManualRepaymentController2 = this.f311930b;
                        return dli.f.a(postTerminationPlanManualRepaymentController2, postTerminationPlanManualRepaymentController2.k3(), v.k(postTerminationPlanManualRepaymentController2.R, postTerminationPlanManualRepaymentController2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new CenteredAmountDelegate(new g(this, 2));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ya5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostTerminationPlanManualRepaymentController f311930b;

            {
                this.f311930b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PostTerminationPlanManualRepaymentController postTerminationPlanManualRepaymentController = this.f311930b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PostTerminationPlanManualRepaymentController.T;
                        return (l) ((oa5.d) postTerminationPlanManualRepaymentController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PostTerminationPlanManualRepaymentController.T;
                        qd0.b bVarN = ((oa5.d) postTerminationPlanManualRepaymentController.N.getValue()).f223542b.f.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = PostTerminationPlanManualRepaymentController.T;
                        PostTerminationPlanManualRepaymentController postTerminationPlanManualRepaymentController2 = this.f311930b;
                        return dli.f.a(postTerminationPlanManualRepaymentController2, postTerminationPlanManualRepaymentController2.k3(), v.k(postTerminationPlanManualRepaymentController2.R, postTerminationPlanManualRepaymentController2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ya5.h hVar = uiState.f311938b;
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(hVar.f311936a);
        aw0.i iVar = uiState.f311939c;
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new ya5.d(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
