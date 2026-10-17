package com.revolut.feature.statements.impl.ui.consolidated.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.consolidated.StatementsModeConfig;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreen;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import eyd.m;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pyc.p;
import pzd.i;
import pzd.j;
import pzd.k;
import pzd.l;
import pzd.r;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/screen/ConsolidatedStatementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpzd/r;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsolidatedStatementScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ConsolidatedStatementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ConsolidatedStatementScreenContract$InputData K;
    public final h L;
    public final SmallActionButtonDelegate M;
    public final FixedTabsDelegate N;
    public final PlainTextWarningDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final boolean R;
    public final int S;
    public final Object T;
    public final Object U;

    public ConsolidatedStatementScreen(ConsolidatedStatementScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, i.f);
        this.M = new SmallActionButtonDelegate();
        this.N = new FixedTabsDelegate();
        this.O = new PlainTextWarningDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: pzd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsolidatedStatementScreen f240967b;

            {
                this.f240967b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConsolidatedStatementScreen consolidatedStatementScreen = this.f240967b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsolidatedStatementScreen.V;
                        return (o) ((eyd.m) consolidatedStatementScreen.U.getValue()).f130789m.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ConsolidatedStatementScreen.V;
                        ConsolidatedStatementScreen consolidatedStatementScreen2 = this.f240967b;
                        return dli.f.a(consolidatedStatementScreen2, consolidatedStatementScreen2.R2(), zhm.d0.E0(((i0e.m) ((i0e.f) ((eyd.m) consolidatedStatementScreen2.U.getValue()).f130786h.get())).Q(), zhm.v.k(consolidatedStatementScreen2.M, consolidatedStatementScreen2.N, consolidatedStatementScreen2.O, consolidatedStatementScreen2.P)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ConsolidatedStatementScreen.V;
                        qji.b bVarU2 = consolidatedStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.screen.di.ConsolidatedStatementScreenInjector");
                        eyd.l lVar = (eyd.l) bVarU2;
                        eyd.b0 b0Var = lVar.f130780b;
                        eyd.l lVar2 = lVar.f130781c;
                        ConsolidatedStatementScreenContract$InputData consolidatedStatementScreenContract$InputData = consolidatedStatementScreen.K;
                        consolidatedStatementScreenContract$InputData.getClass();
                        return new eyd.m(b0Var, lVar2, consolidatedStatementScreen, consolidatedStatementScreenContract$InputData);
                }
            }
        });
        this.R = true;
        this.S = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: pzd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsolidatedStatementScreen f240967b;

            {
                this.f240967b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConsolidatedStatementScreen consolidatedStatementScreen = this.f240967b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsolidatedStatementScreen.V;
                        return (o) ((eyd.m) consolidatedStatementScreen.U.getValue()).f130789m.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ConsolidatedStatementScreen.V;
                        ConsolidatedStatementScreen consolidatedStatementScreen2 = this.f240967b;
                        return dli.f.a(consolidatedStatementScreen2, consolidatedStatementScreen2.R2(), zhm.d0.E0(((i0e.m) ((i0e.f) ((eyd.m) consolidatedStatementScreen2.U.getValue()).f130786h.get())).Q(), zhm.v.k(consolidatedStatementScreen2.M, consolidatedStatementScreen2.N, consolidatedStatementScreen2.O, consolidatedStatementScreen2.P)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ConsolidatedStatementScreen.V;
                        qji.b bVarU2 = consolidatedStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.screen.di.ConsolidatedStatementScreenInjector");
                        eyd.l lVar = (eyd.l) bVarU2;
                        eyd.b0 b0Var = lVar.f130780b;
                        eyd.l lVar2 = lVar.f130781c;
                        ConsolidatedStatementScreenContract$InputData consolidatedStatementScreenContract$InputData = consolidatedStatementScreen.K;
                        consolidatedStatementScreenContract$InputData.getClass();
                        return new eyd.m(b0Var, lVar2, consolidatedStatementScreen, consolidatedStatementScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: pzd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsolidatedStatementScreen f240967b;

            {
                this.f240967b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConsolidatedStatementScreen consolidatedStatementScreen = this.f240967b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsolidatedStatementScreen.V;
                        return (o) ((eyd.m) consolidatedStatementScreen.U.getValue()).f130789m.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ConsolidatedStatementScreen.V;
                        ConsolidatedStatementScreen consolidatedStatementScreen2 = this.f240967b;
                        return dli.f.a(consolidatedStatementScreen2, consolidatedStatementScreen2.R2(), zhm.d0.E0(((i0e.m) ((i0e.f) ((eyd.m) consolidatedStatementScreen2.U.getValue()).f130786h.get())).Q(), zhm.v.k(consolidatedStatementScreen2.M, consolidatedStatementScreen2.N, consolidatedStatementScreen2.O, consolidatedStatementScreen2.P)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ConsolidatedStatementScreen.V;
                        qji.b bVarU2 = consolidatedStatementScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.screen.di.ConsolidatedStatementScreenInjector");
                        eyd.l lVar = (eyd.l) bVarU2;
                        eyd.b0 b0Var = lVar.f130780b;
                        eyd.l lVar2 = lVar.f130781c;
                        ConsolidatedStatementScreenContract$InputData consolidatedStatementScreenContract$InputData = consolidatedStatementScreen.K;
                        consolidatedStatementScreenContract$InputData.getClass();
                        return new eyd.m(b0Var, lVar2, consolidatedStatementScreen, consolidatedStatementScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f240974a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        StatementsModeConfig statementsModeConfig = this.K.f88313a;
        Clause clause = statementsModeConfig.f88296b;
        Clause clause2 = statementsModeConfig.f88297c;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        d3().f174564b.setText(new TextLocalisedClause(R$string.statement_action_generate, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53336c.f121375b), null, new k(this, null), 3);
        efm.r map = this.N.f52339c.f121375b.map(new pz4.a(16, new p(16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new l(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.s()), null, new l(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new pzd.m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new j(this, continuation, i), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final pzd.o R2() {
        return (pzd.o) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
