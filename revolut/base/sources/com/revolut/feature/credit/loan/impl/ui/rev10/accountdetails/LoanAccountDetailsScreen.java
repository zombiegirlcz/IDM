package com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c0;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.t3;
import vc.s;
import xki.e;
import ywi.b;
import z55.g;
import z55.i;
import z55.j;
import z55.k;
import z55.l;
import z55.m;
import z55.n;
import z55.r;
import z55.s;
import z55.t;
import z55.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lz55/u;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanAccountDetailsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(LoanAccountDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;

    public LoanAccountDetailsScreen(LoanAccountDetailsScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = R$layout.screen_recycler_navbar;
        this.L = w.y0(new b(this, input, 13));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: z55.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanAccountDetailsScreen f319499b;

            {
                this.f319499b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = LoanAccountDetailsScreen.Y;
                        return (t) ((u45.g) this.f319499b.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanAccountDetailsScreen.Y;
                        LoanAccountDetailsScreen loanAccountDetailsScreen = this.f319499b;
                        return tki.g.a(loanAccountDetailsScreen, loanAccountDetailsScreen.d(), zhm.v.k((RowDelegate) loanAccountDetailsScreen.P.getValue(), (CellDetailsDelegate) loanAccountDetailsScreen.Q.getValue(), (CellDetailsActionDelegate) loanAccountDetailsScreen.S.getValue(), (CellDetailsChevronDelegate) loanAccountDetailsScreen.R.getValue(), (FullScreenStateDelegate) loanAccountDetailsScreen.U.getValue(), (ProgressStepVerticalDelegate) loanAccountDetailsScreen.V.getValue(), (CellDetailsNoteDelegate) loanAccountDetailsScreen.T.getValue(), (TextDelegate) loanAccountDetailsScreen.W.getValue(), (ListSubheaderDelegate) loanAccountDetailsScreen.X.getValue(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: z55.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanAccountDetailsScreen f319499b;

            {
                this.f319499b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanAccountDetailsScreen.Y;
                        return (t) ((u45.g) this.f319499b.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanAccountDetailsScreen.Y;
                        LoanAccountDetailsScreen loanAccountDetailsScreen = this.f319499b;
                        return tki.g.a(loanAccountDetailsScreen, loanAccountDetailsScreen.d(), zhm.v.k((RowDelegate) loanAccountDetailsScreen.P.getValue(), (CellDetailsDelegate) loanAccountDetailsScreen.Q.getValue(), (CellDetailsActionDelegate) loanAccountDetailsScreen.S.getValue(), (CellDetailsChevronDelegate) loanAccountDetailsScreen.R.getValue(), (FullScreenStateDelegate) loanAccountDetailsScreen.U.getValue(), (ProgressStepVerticalDelegate) loanAccountDetailsScreen.V.getValue(), (CellDetailsNoteDelegate) loanAccountDetailsScreen.T.getValue(), (TextDelegate) loanAccountDetailsScreen.W.getValue(), (ListSubheaderDelegate) loanAccountDetailsScreen.X.getValue(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.O = s.t(this, g.f);
        this.P = w.y0(new z1i.a(12));
        this.Q = w.y0(new z1i.a(13));
        this.R = w.y0(new z1i.a(14));
        this.S = w.y0(new z1i.a(15));
        this.T = w.y0(new z1i.a(16));
        this.U = w.y0(new z1i.a(8));
        this.V = w.y0(new z1i.a(9));
        this.W = w.y0(new z1i.a(10));
        this.X = w.y0(new z1i.a(11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        z55.s sVar = uiState.f319513b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        if (!(sVar instanceof r)) {
            if (sVar instanceof s.a) {
                navBarWithToolbar.H0(false);
                navBarWithToolbar.I0(t3.PROFILE, false);
                return;
            } else {
                if (!(sVar instanceof s.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.l0();
                navBarWithToolbar.j0(false);
                return;
            }
        }
        r rVar = (r) sVar;
        navBarWithToolbar.setTitle(rVar.f319508b, null);
        navBarWithToolbar.setToolbarTitle(rVar.f319509c);
        navBarWithToolbar.setEndIconImage(rVar.f319507a);
        navBarWithToolbar.setDescriptionText(rVar.d);
        navBarWithToolbar.setDescriptionClickable(c0.NONE);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.H0(false);
        navBarWithToolbar.l0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u45.g) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v50, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new z3f.b(this, null, 1), 3);
        int i = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).d), null, new i(2, 4, t.class, d(), "onCellDetailsTitleClicked", "onCellDetailsTitleClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;)V"), 3);
        ?? r122 = this.T;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) r122.getValue()).f), null, new j(2, 4, t.class, d(), "onCellDetailsNoteClicked", "onCellDetailsNoteClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsNoteDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) r122.getValue()).d), null, new k(2, 4, t.class, d(), "onCellDetailsNoteEndLabelClicked", "onCellDetailsNoteEndLabelClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsNoteDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.S.getValue()).d), null, new l(2, 4, t.class, d(), "onCellDetailsActionClicked", "onCellDetailsActionClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new m(2, 4, t.class, d(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.R.getValue()).f51821c), null, new n(2, 4, t.class, d(), "onCellDetailsChevronClicked", "onCellDetailsChevronClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.p0()), null, new ys.i(i, d(), t.class, "onDescriptionClauseClick", "onDescriptionClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.U.getValue()).f52371h.f121375b), null, new z55.o(2, 4, t.class, d(), "onFullScreenMainActionClicked", "onFullScreenMainActionClicked(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        int i2 = 4;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ProgressStepVerticalDelegate) this.V.getValue()).f53000c), null, new ys.i(i, d(), t.class, "onProgressStepTextClauseClicked", "onProgressStepTextClauseClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i2, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.W.getValue()).d), null, new ys.i(i, d(), t.class, "onClauseClicked", "onClauseClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i2, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.X.getValue()).f52707c), null, new z55.h(2, 4, t.class, d(), "onSubheaderClicked", "onSubheaderClicked(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;)V"), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.N.getValue();
    }
}
