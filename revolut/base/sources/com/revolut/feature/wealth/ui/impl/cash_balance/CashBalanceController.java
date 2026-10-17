package com.revolut.feature.wealth.ui.impl.cash_balance;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import i7d.i;
import jii.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import z0h.s1;
import zhm.v;
import zjh.d;
import zjh.e;
import zjh.f;
import zjh.g;
import zjh.j;
import zjh.p;
import zjh.r;
import zjh.t;
import zjh.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lzjh/u;", "Lz0h/s1;", "Li7d/i;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashBalanceController extends ViewController<q> implements tki.c, s1, i {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(CashBalanceController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final h K;
    public final RowDelegate L;
    public final CellDetailsActionDelegate M;
    public final CellDetailsDelegate N;
    public final ListSubheaderDelegate O;
    public final VaultsProgressLoadingDelegate P;
    public final VaultsProgressDelegate Q;
    public final LargeActionButtonDelegate R;
    public final TextDelegate S;
    public final FooterTextDelegate T;
    public final FullScreenStateDelegate U;
    public final SwipeToActionDelegate V;
    public final BannerDelegate W;
    public final d X;
    public final e Y;
    public final avk.h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final f f95946a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final zjh.c f95947b0;
    public final j c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final zjh.i f95948d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final r3b.c f95949e0;
    public final int f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f95950h0;
    public final Object i0;

    public CashBalanceController(CashBalanceControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, zjh.b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        this.M = new CellDetailsActionDelegate();
        this.N = new CellDetailsDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = new VaultsProgressLoadingDelegate();
        this.Q = new VaultsProgressDelegate();
        this.R = new LargeActionButtonDelegate();
        this.S = new TextDelegate();
        this.T = new FooterTextDelegate();
        this.U = new FullScreenStateDelegate();
        this.V = new SwipeToActionDelegate(rowDelegate, false);
        this.W = new BannerDelegate();
        new BannerLoadingDelegate();
        this.X = new d(this);
        this.Y = new e(this);
        this.Z = new avk.h(this);
        this.f95946a0 = new f(this);
        this.f95947b0 = new zjh.c(this);
        this.c0 = new j(this);
        this.f95948d0 = new zjh.i(this);
        this.f95949e0 = new r3b.c(this);
        this.f0 = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.g0 = w.y0(new Function0(this) { // from class: zjh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBalanceController f322822b;

            {
                this.f322822b = this;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CashBalanceController.j0;
                        int i2 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        CashBalanceController cashBalanceController = this.f322822b;
                        return tki.g.a(cashBalanceController, cashBalanceController.k3(), zhm.v.k(cashBalanceController.O, cashBalanceController.L, cashBalanceController.P, cashBalanceController.Q, cashBalanceController.S, new RowLoadingDelegate(), cashBalanceController.U, cashBalanceController.M, cashBalanceController.N, cashBalanceController.T, cashBalanceController.V, cashBalanceController.W), i2, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = CashBalanceController.j0;
                        return (p) ((mkh.a) this.f322822b.f95950h0.getValue()).f206296b0.get();
                }
            }
        });
        this.f95950h0 = w.y0(new ywi.b(this, inputData, 29));
        final int i2 = 1;
        this.i0 = w.y0(new Function0(this) { // from class: zjh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBalanceController f322822b;

            {
                this.f322822b = this;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashBalanceController.j0;
                        int i22 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        CashBalanceController cashBalanceController = this.f322822b;
                        return tki.g.a(cashBalanceController, cashBalanceController.k3(), zhm.v.k(cashBalanceController.O, cashBalanceController.L, cashBalanceController.P, cashBalanceController.Q, cashBalanceController.S, new RowLoadingDelegate(), cashBalanceController.U, cashBalanceController.M, cashBalanceController.N, cashBalanceController.T, cashBalanceController.V, cashBalanceController.W), i22, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = CashBalanceController.j0;
                        return (p) ((mkh.a) this.f322822b.f95950h0.getValue()).f206296b0.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        dli.a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        t tVar = uiState.f322856a;
        if (tVar != null) {
            if (tVar instanceof r) {
                r rVar = (r) tVar;
                MoneyClause moneyClause = rVar.f322852a;
                screenRecyclerNavbarActionFooterNavBar.setTitle(moneyClause, null);
                screenRecyclerNavbarActionFooterNavBar.setToolbarTitle(moneyClause);
                screenRecyclerNavbarActionFooterNavBar.setSecondDescriptionText(rVar.f322853b);
                screenRecyclerNavbarActionFooterNavBar.setEndImage(nz8.d.L(rVar.f322854c));
                d3().f174534c.setLoadingVisible(false);
            } else {
                if (!tVar.equals(zjh.s.f322855a)) {
                    throw new NoWhenBranchMatchedException();
                }
                d3().f174534c.setLoadingVisible(true);
            }
        }
        aw0.i iVar = uiState.f322857b;
        if (iVar != null) {
            ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
            screenRecyclerNavbarActionFooterActionFooterView.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mkh.a) this.f95950h0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        screenRecyclerNavbarActionFooterNavBar.setSecondDescriptionVisible(true);
        screenRecyclerNavbarActionFooterNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) ((mkh.a) this.f95950h0.getValue()).f206307s.get()).d(v.k(this.R, this.L));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((tki.b) ((tki.a) this.g0.getValue())).f271959b.f;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new z3f.b(this, continuation, 17), 3);
        ViewController.P2(this, l.y(d3().f174533b.f, d3().f174533b.f58955g, "merge(...)"), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new zjh.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.x0()), new g(this, continuation, 1), 3);
    }

    public final k d3() {
        ViewBinding value = this.K.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.i0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.f0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.g0.getValue();
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.S.d);
    }
}
