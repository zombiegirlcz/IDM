package com.revolut.feature.statements.impl.ui.savings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreen;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import eyd.a0;
import eyd.b0;
import java.util.List;
import jii.u;
import k0e.b;
import k0e.c;
import k0e.d;
import k0e.g;
import k0e.h;
import k0e.i;
import k0e.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/savings/SavingsStatementsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lk0e/j;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsStatementsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SavingsStatementsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final SavingsStatementsScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final FixedTabsDelegate R;
    public final Object S;

    public SavingsStatementsScreen(SavingsStatementsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: k0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsStatementsScreen f180023b;

            {
                this.f180023b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsStatementsScreen savingsStatementsScreen = this.f180023b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsStatementsScreen.T;
                        qji.b bVarU2 = savingsStatementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.savings.di.StatementsScreenInjector");
                        eyd.w wVar = (eyd.w) bVarU2;
                        b0 b0Var = wVar.f130835b;
                        eyd.w wVar2 = wVar.f130836c;
                        SavingsStatementsScreenContract$InputData savingsStatementsScreenContract$InputData = savingsStatementsScreen.K;
                        savingsStatementsScreenContract$InputData.getClass();
                        return new a0(b0Var, wVar2, savingsStatementsScreen, savingsStatementsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsStatementsScreen.T;
                        return (g) ((a0) savingsStatementsScreen.O.getValue()).f130679l.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsStatementsScreen.T;
                        SavingsStatementsScreen savingsStatementsScreen2 = this.f180023b;
                        return dli.f.a(savingsStatementsScreen2, savingsStatementsScreen2.R2(), d0.E0(((i0e.m) ((i0e.f) ((a0) savingsStatementsScreen2.O.getValue()).f130676g.get())).Q(), v.k(new TextDelegate(), (SmallActionButtonDelegate) savingsStatementsScreen2.Q.getValue(), savingsStatementsScreen2.R)), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: k0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsStatementsScreen f180023b;

            {
                this.f180023b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsStatementsScreen savingsStatementsScreen = this.f180023b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsStatementsScreen.T;
                        qji.b bVarU2 = savingsStatementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.savings.di.StatementsScreenInjector");
                        eyd.w wVar = (eyd.w) bVarU2;
                        b0 b0Var = wVar.f130835b;
                        eyd.w wVar2 = wVar.f130836c;
                        SavingsStatementsScreenContract$InputData savingsStatementsScreenContract$InputData = savingsStatementsScreen.K;
                        savingsStatementsScreenContract$InputData.getClass();
                        return new a0(b0Var, wVar2, savingsStatementsScreen, savingsStatementsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsStatementsScreen.T;
                        return (g) ((a0) savingsStatementsScreen.O.getValue()).f130679l.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsStatementsScreen.T;
                        SavingsStatementsScreen savingsStatementsScreen2 = this.f180023b;
                        return dli.f.a(savingsStatementsScreen2, savingsStatementsScreen2.R2(), d0.E0(((i0e.m) ((i0e.f) ((a0) savingsStatementsScreen2.O.getValue()).f130676g.get())).Q(), v.k(new TextDelegate(), (SmallActionButtonDelegate) savingsStatementsScreen2.Q.getValue(), savingsStatementsScreen2.R)), 0, null, null, null, 60);
                }
            }
        });
        this.Q = w.y0(new jxi.a(28));
        this.R = new FixedTabsDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: k0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsStatementsScreen f180023b;

            {
                this.f180023b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsStatementsScreen savingsStatementsScreen = this.f180023b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsStatementsScreen.T;
                        qji.b bVarU2 = savingsStatementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.savings.di.StatementsScreenInjector");
                        eyd.w wVar = (eyd.w) bVarU2;
                        b0 b0Var = wVar.f130835b;
                        eyd.w wVar2 = wVar.f130836c;
                        SavingsStatementsScreenContract$InputData savingsStatementsScreenContract$InputData = savingsStatementsScreen.K;
                        savingsStatementsScreenContract$InputData.getClass();
                        return new a0(b0Var, wVar2, savingsStatementsScreen, savingsStatementsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsStatementsScreen.T;
                        return (g) ((a0) savingsStatementsScreen.O.getValue()).f130679l.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsStatementsScreen.T;
                        SavingsStatementsScreen savingsStatementsScreen2 = this.f180023b;
                        return dli.f.a(savingsStatementsScreen2, savingsStatementsScreen2.R2(), d0.E0(((i0e.m) ((i0e.f) ((a0) savingsStatementsScreen2.O.getValue()).f130676g.get())).Q(), v.k(new TextDelegate(), (SmallActionButtonDelegate) savingsStatementsScreen2.Q.getValue(), savingsStatementsScreen2.R)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f180032b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        k0e.h hVar = uiState.f180033c;
        if (hVar instanceof h.b) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            navBarWithToolbar.l0();
        }
        Clause textClause = hVar instanceof i ? ((i) hVar).f180030a : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.statement_action_generate, null, null, 14));
        largeActionButton.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SmallActionButtonDelegate) this.Q.getValue()).f53336c.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52339c.f121375b), null, new jl6.b(2, R2(), g.class, "onTabSelected", "onTabSelected(Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$SelectedData;)V", 4, 5), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
