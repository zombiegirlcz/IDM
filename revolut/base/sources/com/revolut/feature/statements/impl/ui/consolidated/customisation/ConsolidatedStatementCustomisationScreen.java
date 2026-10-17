package com.revolut.feature.statements.impl.ui.consolidated.customisation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import fzd.b;
import fzd.c;
import fzd.d;
import fzd.f;
import fzd.g;
import fzd.i;
import fzd.k;
import fzd.m;
import h30.l;
import jii.u;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/customisation/ConsolidatedStatementCustomisationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfzd/k;", "Ldli/a;", "Lfzd/m;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsolidatedStatementCustomisationScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ConsolidatedStatementCustomisationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final RowDelegate L;
    public final SelectableDelegate M;
    public final CellDetailsSwitcherDelegate N;
    public final CellDetailsActionDelegate O;
    public final LargeActionButtonDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final h U;

    public ConsolidatedStatementCustomisationScreen(ConsolidatedStatementCustomisationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        this.M = new SelectableDelegate(rowDelegate);
        this.N = new CellDetailsSwitcherDelegate();
        this.O = new CellDetailsActionDelegate();
        this.P = new LargeActionButtonDelegate();
        this.Q = new FullScreenStateDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: fzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsolidatedStatementCustomisationScreen f139138b;

            {
                this.f139138b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ConsolidatedStatementCustomisationScreen.V;
                        ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen = this.f139138b;
                        return dli.f.a(consolidatedStatementCustomisationScreen, consolidatedStatementCustomisationScreen.R2(), zhm.v.k(consolidatedStatementCustomisationScreen.N, consolidatedStatementCustomisationScreen.O, consolidatedStatementCustomisationScreen.M, consolidatedStatementCustomisationScreen.P, consolidatedStatementCustomisationScreen.Q, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ConsolidatedStatementCustomisationScreen.V;
                        return (l) ((eyd.k) this.f139138b.S.getValue()).f.get();
                }
            }
        });
        this.S = w.y0(new fx5.a(this, inputData, 1));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: fzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsolidatedStatementCustomisationScreen f139138b;

            {
                this.f139138b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsolidatedStatementCustomisationScreen.V;
                        ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen = this.f139138b;
                        return dli.f.a(consolidatedStatementCustomisationScreen, consolidatedStatementCustomisationScreen.R2(), zhm.v.k(consolidatedStatementCustomisationScreen.N, consolidatedStatementCustomisationScreen.O, consolidatedStatementCustomisationScreen.M, consolidatedStatementCustomisationScreen.P, consolidatedStatementCustomisationScreen.Q, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ConsolidatedStatementCustomisationScreen.V;
                        return (l) ((eyd.k) this.f139138b.S.getValue()).f.get();
                }
            }
        });
        this.U = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        boolean z = uiState.f139148b;
        largeActionButton.setEnabled(z);
        largeActionButton.setVisibility(z ? 0 : 8);
        Clause clause = uiState.f139149c;
        if (clause != null) {
            largeActionButton.setText(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (eyd.k) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.consolidated_statement_filters_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.consolidated_statement_filters_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        l.A(R.string.common_action_apply, null, null, 14, largeActionButton);
        largeActionButton.setVisibility(4);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51912c), null, new fzd.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.r()), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new fzd.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new i(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.U.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fzd.l R2() {
        return (fzd.l) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
