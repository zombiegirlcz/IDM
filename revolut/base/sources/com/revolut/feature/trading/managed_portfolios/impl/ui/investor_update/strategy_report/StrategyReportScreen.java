package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p0l.d;
import p7f.g;
import p7f.j;
import p7f.k;
import p7f.l;
import p7f.m;
import p7f.n;
import te0.w;
import tki.c;
import tx0.t3;
import vc.s;
import w5f.a0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/strategy_report/StrategyReportScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lp7f/n;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StrategyReportScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(StrategyReportScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final StrategyReportScreenContract$InputData K;
    public final h L;
    public final int M;
    public final FullScreenStateDelegate N;
    public final CellDetailsDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public StrategyReportScreen(StrategyReportScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, p7f.c.f);
        this.M = R$layout.screen_recycler_navbar;
        this.N = new FullScreenStateDelegate();
        this.O = new CellDetailsDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: p7f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyReportScreen f233757b;

            {
                this.f233757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StrategyReportScreen strategyReportScreen = this.f233757b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StrategyReportScreen.S;
                        StrategyReportScreen strategyReportScreen2 = this.f233757b;
                        return tki.g.a(strategyReportScreen2, strategyReportScreen2.d(), v.k(new RowLoadingDelegate(), strategyReportScreen2.N, new HeaderDelegate(), new ListCellDelegate(), strategyReportScreen2.O, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StrategyReportScreen.S;
                        qji.b bVarU2 = strategyReportScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.di.StrategyReportScreenInjector");
                        w5f.a aVar = (w5f.a) bVarU2;
                        w5f.m mVar = aVar.f295109b;
                        w5f.a aVar2 = aVar.f295110c;
                        StrategyReportScreenContract$InputData strategyReportScreenContract$InputData = strategyReportScreen.K;
                        strategyReportScreenContract$InputData.getClass();
                        return new a0(mVar, aVar2, strategyReportScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StrategyReportScreen.S;
                        return (j) ((a0) strategyReportScreen.Q.getValue()).f295113c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: p7f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyReportScreen f233757b;

            {
                this.f233757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StrategyReportScreen strategyReportScreen = this.f233757b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StrategyReportScreen.S;
                        StrategyReportScreen strategyReportScreen2 = this.f233757b;
                        return tki.g.a(strategyReportScreen2, strategyReportScreen2.d(), v.k(new RowLoadingDelegate(), strategyReportScreen2.N, new HeaderDelegate(), new ListCellDelegate(), strategyReportScreen2.O, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StrategyReportScreen.S;
                        qji.b bVarU2 = strategyReportScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.di.StrategyReportScreenInjector");
                        w5f.a aVar = (w5f.a) bVarU2;
                        w5f.m mVar = aVar.f295109b;
                        w5f.a aVar2 = aVar.f295110c;
                        StrategyReportScreenContract$InputData strategyReportScreenContract$InputData = strategyReportScreen.K;
                        strategyReportScreenContract$InputData.getClass();
                        return new a0(mVar, aVar2, strategyReportScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StrategyReportScreen.S;
                        return (j) ((a0) strategyReportScreen.Q.getValue()).f295113c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: p7f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrategyReportScreen f233757b;

            {
                this.f233757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StrategyReportScreen strategyReportScreen = this.f233757b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StrategyReportScreen.S;
                        StrategyReportScreen strategyReportScreen2 = this.f233757b;
                        return tki.g.a(strategyReportScreen2, strategyReportScreen2.d(), v.k(new RowLoadingDelegate(), strategyReportScreen2.N, new HeaderDelegate(), new ListCellDelegate(), strategyReportScreen2.O, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StrategyReportScreen.S;
                        qji.b bVarU2 = strategyReportScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.di.StrategyReportScreenInjector");
                        w5f.a aVar = (w5f.a) bVarU2;
                        w5f.m mVar = aVar.f295109b;
                        w5f.a aVar2 = aVar.f295110c;
                        StrategyReportScreenContract$InputData strategyReportScreenContract$InputData = strategyReportScreen.K;
                        strategyReportScreenContract$InputData.getClass();
                        return new a0(mVar, aVar2, strategyReportScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StrategyReportScreen.S;
                        return (j) ((a0) strategyReportScreen.Q.getValue()).f295113c.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        m mVar = uiState.f233766a;
        if (!(mVar instanceof k)) {
            if (!mVar.equals(l.f233765a)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        k kVar = (k) mVar;
        TextLocalisedClause textLocalisedClause = kVar.f233763a;
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        navBarWithToolbar2.setDescriptionText(kVar.f233764b);
        navBarWithToolbar2.setDescriptionVisible(true);
        navBarWithToolbar2.l0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, continuation, 11), 3);
        ViewController.P2(this, new njj.l(new p73.d(rd0.e.b(d3().f174539b.p0()), 1), 12), new g(this, continuation, 0), 3);
        ViewController.P2(this, new p73.d(rd0.e.b(this.O.e), 2), new g(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new p7f.h(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
