package com.revolut.feature.credit.loan.impl.ui.rev10.repayamount;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b75.d;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import ihm.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q3d.c;
import q5g.f0;
import q75.b;
import q75.g;
import q75.i;
import q75.k;
import q75.m;
import te0.w;
import tx0.e0;
import u45.r0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lq75/m;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanPartialRepaymentController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(LoanPartialRepaymentController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final LoanPartialRepaymentControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final LargeActionButtonDelegate P;
    public final CellDetailsDelegate Q;
    public final Object R;
    public final FullScreenStateDelegate S;
    public final RowLoadingDelegate T;
    public final RowDelegate U;
    public final CenteredAmountDelegate V;
    public final Object W;

    public LoanPartialRepaymentController(LoanPartialRepaymentControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_basic_navbar_action_footer;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: q75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPartialRepaymentController f242740b;

            {
                this.f242740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanPartialRepaymentController loanPartialRepaymentController = this.f242740b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanPartialRepaymentController.X;
                        u45.h hVar = czi.c.o(loanPartialRepaymentController.m2()).B;
                        LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData = loanPartialRepaymentController.K;
                        loanPartialRepaymentControllerContract$InputData.getClass();
                        return new r0(hVar, loanPartialRepaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanPartialRepaymentController.X;
                        return (k) ((r0) loanPartialRepaymentController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanPartialRepaymentController.X;
                        qd0.b bVarN = ((r0) loanPartialRepaymentController.N.getValue()).f277208b.f277138q.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = LoanPartialRepaymentController.X;
                        LoanPartialRepaymentController loanPartialRepaymentController2 = this.f242740b;
                        return dli.f.a(loanPartialRepaymentController2, (k) loanPartialRepaymentController2.O.getValue(), zhm.v.k(loanPartialRepaymentController2.Q, loanPartialRepaymentController2.P, loanPartialRepaymentController2.S, loanPartialRepaymentController2.V, loanPartialRepaymentController2.T), loanPartialRepaymentController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: q75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPartialRepaymentController f242740b;

            {
                this.f242740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanPartialRepaymentController loanPartialRepaymentController = this.f242740b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanPartialRepaymentController.X;
                        u45.h hVar = czi.c.o(loanPartialRepaymentController.m2()).B;
                        LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData = loanPartialRepaymentController.K;
                        loanPartialRepaymentControllerContract$InputData.getClass();
                        return new r0(hVar, loanPartialRepaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanPartialRepaymentController.X;
                        return (k) ((r0) loanPartialRepaymentController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanPartialRepaymentController.X;
                        qd0.b bVarN = ((r0) loanPartialRepaymentController.N.getValue()).f277208b.f277138q.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = LoanPartialRepaymentController.X;
                        LoanPartialRepaymentController loanPartialRepaymentController2 = this.f242740b;
                        return dli.f.a(loanPartialRepaymentController2, (k) loanPartialRepaymentController2.O.getValue(), zhm.v.k(loanPartialRepaymentController2.Q, loanPartialRepaymentController2.P, loanPartialRepaymentController2.S, loanPartialRepaymentController2.V, loanPartialRepaymentController2.T), loanPartialRepaymentController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.P = new LargeActionButtonDelegate();
        this.Q = new CellDetailsDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: q75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPartialRepaymentController f242740b;

            {
                this.f242740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanPartialRepaymentController loanPartialRepaymentController = this.f242740b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanPartialRepaymentController.X;
                        u45.h hVar = czi.c.o(loanPartialRepaymentController.m2()).B;
                        LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData = loanPartialRepaymentController.K;
                        loanPartialRepaymentControllerContract$InputData.getClass();
                        return new r0(hVar, loanPartialRepaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanPartialRepaymentController.X;
                        return (k) ((r0) loanPartialRepaymentController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanPartialRepaymentController.X;
                        qd0.b bVarN = ((r0) loanPartialRepaymentController.N.getValue()).f277208b.f277138q.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = LoanPartialRepaymentController.X;
                        LoanPartialRepaymentController loanPartialRepaymentController2 = this.f242740b;
                        return dli.f.a(loanPartialRepaymentController2, (k) loanPartialRepaymentController2.O.getValue(), zhm.v.k(loanPartialRepaymentController2.Q, loanPartialRepaymentController2.P, loanPartialRepaymentController2.S, loanPartialRepaymentController2.V, loanPartialRepaymentController2.T), loanPartialRepaymentController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.S = new FullScreenStateDelegate();
        this.T = new RowLoadingDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new CenteredAmountDelegate(new f0(this, 2));
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: q75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPartialRepaymentController f242740b;

            {
                this.f242740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                LoanPartialRepaymentController loanPartialRepaymentController = this.f242740b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanPartialRepaymentController.X;
                        u45.h hVar = czi.c.o(loanPartialRepaymentController.m2()).B;
                        LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData = loanPartialRepaymentController.K;
                        loanPartialRepaymentControllerContract$InputData.getClass();
                        return new r0(hVar, loanPartialRepaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanPartialRepaymentController.X;
                        return (k) ((r0) loanPartialRepaymentController.N.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanPartialRepaymentController.X;
                        qd0.b bVarN = ((r0) loanPartialRepaymentController.N.getValue()).f277208b.f277138q.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = LoanPartialRepaymentController.X;
                        LoanPartialRepaymentController loanPartialRepaymentController2 = this.f242740b;
                        return dli.f.a(loanPartialRepaymentController2, (k) loanPartialRepaymentController2.O.getValue(), zhm.v.k(loanPartialRepaymentController2.Q, loanPartialRepaymentController2.P, loanPartialRepaymentController2.S, loanPartialRepaymentController2.V, loanPartialRepaymentController2.T), loanPartialRepaymentController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        i iVar = uiState.f242753b;
        BasicNavBar basicNavBar = d3().f174528c;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        if (iVar instanceof g) {
            basicNavBar.u(e0.TITLE_AND_SUBTITLE);
        } else {
            if (!(iVar instanceof q75.h)) {
                throw new NoWhenBranchMatchedException();
            }
            basicNavBar.o();
            basicNavBar.setTitle((Clause) ((q75.h) iVar).f242749a);
        }
        aw0.i iVar2 = uiState.f242754c;
        ActionFooterView actionFooterView = d3().f174527b;
        actionFooterView.setVisibility(iVar2 != null ? 0 : 8);
        if (iVar2 != null) {
            actionFooterView.setModel(iVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setItemAnimator(null);
        d3().f174528c.setTitleCentered(true);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CellDetailsDelegate cellDetailsDelegate = this.Q;
        f fVar = cellDetailsDelegate.f;
        f fVar2 = cellDetailsDelegate.d;
        f fVar3 = cellDetailsDelegate.e;
        f fVar4 = this.P.d.f121375b;
        f fVar5 = d3().f174527b.e;
        r map = d3().f174527b.f.map(new c(13, new q3d.i(26)));
        CenteredAmountDelegate centeredAmountDelegate = this.V;
        r rVarMergeArray = r.mergeArray(fVar, fVar2, fVar3, fVar4, fVar5, map, centeredAmountDelegate.f.f121375b.map(new c(14, new q3d.i(27))), this.U.f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(rVarMergeArray), yx4.b.Companion, 15), null, new pp4.h(2, (k) this.O.getValue(), k.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174528c.f59211b), null, new q43.m(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.e.f121375b), new q75.d(this, null), 3);
    }

    public final jii.i d3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
