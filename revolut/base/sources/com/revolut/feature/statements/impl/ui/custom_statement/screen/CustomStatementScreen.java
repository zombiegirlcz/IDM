package com.revolut.feature.statements.impl.ui.custom_statement.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import eyd.b0;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rp0.l0;
import te0.w;
import vc.s;
import xki.e;
import xzd.c;
import xzd.d;
import xzd.f;
import xzd.g;
import xzd.i;
import xzd.j;
import xzd.m;
import xzd.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/screen/CustomStatementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxzd/n;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomStatementScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CustomStatementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CustomStatementScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final CellDetailsDelegate N;
    public final CellDetailsSwitcherDelegate O;
    public final CellDetailsActionDelegate P;
    public final RowDelegate Q;
    public final InputTextDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;
    public l0 V;
    public final h W;

    public CustomStatementScreen(CustomStatementScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new FullScreenStateDelegate();
        this.N = new CellDetailsDelegate();
        this.O = new CellDetailsSwitcherDelegate();
        this.P = new CellDetailsActionDelegate();
        this.Q = new RowDelegate(null, null, 7);
        this.R = new InputTextDelegate(null);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: xzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomStatementScreen f309928b;

            {
                this.f309928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomStatementScreen customStatementScreen = this.f309928b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomStatementScreen.X;
                        CustomStatementScreen customStatementScreen2 = this.f309928b;
                        return dli.f.a(customStatementScreen2, customStatementScreen2.d(), zhm.v.k(customStatementScreen2.M, customStatementScreen2.N, customStatementScreen2.O, customStatementScreen2.P, customStatementScreen2.R, customStatementScreen2.Q, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomStatementScreen.X;
                        qji.b bVarU2 = customStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.custom_statement.screen.di.CustomStatementScreenInjector");
                        eyd.p pVar = (eyd.p) bVarU2;
                        b0 b0Var = pVar.f130811a;
                        eyd.p pVar2 = pVar.f130812b;
                        customStatementScreen.K.getClass();
                        return new eyd.q(b0Var, pVar2);
                    default:
                        KProperty[] kPropertyArr3 = CustomStatementScreen.X;
                        return (m) ((eyd.q) customStatementScreen.T.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: xzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomStatementScreen f309928b;

            {
                this.f309928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomStatementScreen customStatementScreen = this.f309928b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomStatementScreen.X;
                        CustomStatementScreen customStatementScreen2 = this.f309928b;
                        return dli.f.a(customStatementScreen2, customStatementScreen2.d(), zhm.v.k(customStatementScreen2.M, customStatementScreen2.N, customStatementScreen2.O, customStatementScreen2.P, customStatementScreen2.R, customStatementScreen2.Q, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomStatementScreen.X;
                        qji.b bVarU2 = customStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.custom_statement.screen.di.CustomStatementScreenInjector");
                        eyd.p pVar = (eyd.p) bVarU2;
                        b0 b0Var = pVar.f130811a;
                        eyd.p pVar2 = pVar.f130812b;
                        customStatementScreen.K.getClass();
                        return new eyd.q(b0Var, pVar2);
                    default:
                        KProperty[] kPropertyArr3 = CustomStatementScreen.X;
                        return (m) ((eyd.q) customStatementScreen.T.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: xzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomStatementScreen f309928b;

            {
                this.f309928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomStatementScreen customStatementScreen = this.f309928b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomStatementScreen.X;
                        CustomStatementScreen customStatementScreen2 = this.f309928b;
                        return dli.f.a(customStatementScreen2, customStatementScreen2.d(), zhm.v.k(customStatementScreen2.M, customStatementScreen2.N, customStatementScreen2.O, customStatementScreen2.P, customStatementScreen2.R, customStatementScreen2.Q, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomStatementScreen.X;
                        qji.b bVarU2 = customStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.custom_statement.screen.di.CustomStatementScreenInjector");
                        eyd.p pVar = (eyd.p) bVarU2;
                        b0 b0Var = pVar.f130811a;
                        eyd.p pVar2 = pVar.f130812b;
                        customStatementScreen.K.getClass();
                        return new eyd.q(b0Var, pVar2);
                    default:
                        KProperty[] kPropertyArr3 = CustomStatementScreen.X;
                        return (m) ((eyd.q) customStatementScreen.T.getValue()).e.get();
                }
            }
        });
        this.W = s.t(this, xzd.b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(uiState.f309936b ? 0 : 8);
        largeActionButton.setEnabled(uiState.f309937c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (eyd.q) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        CustomStatementScreenContract$InputData customStatementScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(customStatementScreenContract$InputData.f88331a);
        navBarWithToolbar.setTitle(customStatementScreenContract$InputData.f88331a, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        this.V = new l0(m2());
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.statement_action_generate, null, null, 14));
        largeActionButton.setLoadingButtonTag("GENERATE_BUTTON_LOADING");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 1), 3);
        l0 l0Var = this.V;
        if (l0Var == null) {
            Intrinsics.r("popupMenuDialogDisplayer");
            throw null;
        }
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(l0Var.f256113c), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new xzd.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f51912c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d), null, new xzd.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53220l), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52575g.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, ((b) d()).f88355y, null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 0), 3);
    }

    public final u d3() {
        ViewBinding value = this.W.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
