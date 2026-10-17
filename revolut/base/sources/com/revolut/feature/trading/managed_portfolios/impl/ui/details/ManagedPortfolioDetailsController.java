package com.revolut.feature.trading.managed_portfolios.impl.ui.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedBarDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d1h.j;
import fnc.l;
import hwi.l0;
import i6f.d;
import i6f.e;
import i6f.e0;
import i6f.f;
import i6f.g;
import i6f.m;
import i6f.n;
import i6f.o;
import i6f.p;
import i6f.q;
import i6f.r;
import i6f.v;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li6f/v;", "Ld1h/j;", "Ltki/c;", "Li6f/e0;", "Companion", "a", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfolioDetailsController extends ViewController<v> implements j, tki.c {
    public final int K;
    public final Object L;
    public final h M;
    public final TagDelegate N;
    public final RowDelegate O;
    public final RowLoadingDelegate P;
    public final ListSubheaderDelegate Q;
    public final CellDetailsLoadingDelegate R;
    public final CellDetailsDelegate S;
    public final PlainTextLoadingDelegate T;
    public final PlainTextDelegate U;
    public final CellDetailsChevronDelegate V;
    public final FixedTabsDelegate W;
    public final TextDelegate X;
    public final TrendViewDelegate Y;
    public final ExpandableCellDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final HeaderDelegate f91263a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final HeaderLoadingDelegate f91264b0;
    public final ToDoItemDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SegmentedBarDelegate f91265d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final FullScreenStateDelegate f91266e0;
    public final LargeActionButtonDelegate f0;
    public final SmallActionButtonDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final FooterTextDelegate f91267h0;
    public final ActionWidgetDelegate i0;
    public final ActionWidgetLoadingDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final HeroBannerDelegate f91268k0;
    public final ScrollerDelegate l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f91269n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final e f91270o0;
    public final i6f.c p0;
    public final i6f.b q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final f f91271r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final g f91272s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final n f91273t0;
    public final q u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final r f91274v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final o f91275w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final p f91276x0;
    public final avk.h y0;
    public final l z0;
    public static final /* synthetic */ KProperty[] A0 = {o0.f186429a.j(new h0(ManagedPortfolioDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final TextClause B0 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ManagedPortfolioDetailsController(ManagedPortfolioDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: i6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioDetailsController f158909b;

            {
                this.f158909b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ManagedPortfolioDetailsController.Companion companion = ManagedPortfolioDetailsController.INSTANCE;
                        return (s) ((w5f.f) this.f158909b.m0.getValue()).f295153n0.get();
                    default:
                        ManagedPortfolioDetailsController.Companion companion2 = ManagedPortfolioDetailsController.INSTANCE;
                        ManagedPortfolioDetailsController managedPortfolioDetailsController = this.f158909b;
                        return tki.g.a(managedPortfolioDetailsController, managedPortfolioDetailsController.d(), zhm.v.k(managedPortfolioDetailsController.O, managedPortfolioDetailsController.P, managedPortfolioDetailsController.Q, managedPortfolioDetailsController.R, managedPortfolioDetailsController.T, managedPortfolioDetailsController.S, managedPortfolioDetailsController.U, managedPortfolioDetailsController.V, managedPortfolioDetailsController.Y, managedPortfolioDetailsController.W, managedPortfolioDetailsController.Z, managedPortfolioDetailsController.f91266e0, managedPortfolioDetailsController.N, managedPortfolioDetailsController.f91263a0, managedPortfolioDetailsController.f91264b0, managedPortfolioDetailsController.c0, managedPortfolioDetailsController.f91265d0, managedPortfolioDetailsController.f0, managedPortfolioDetailsController.f91267h0, managedPortfolioDetailsController.g0, managedPortfolioDetailsController.i0, managedPortfolioDetailsController.j0, managedPortfolioDetailsController.f91268k0, managedPortfolioDetailsController.l0, managedPortfolioDetailsController.X, new FooterTextLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.M = s.t(this, d.f);
        this.N = new TagDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new RowLoadingDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new CellDetailsLoadingDelegate();
        this.S = new CellDetailsDelegate();
        this.T = new PlainTextLoadingDelegate();
        this.U = new PlainTextDelegate();
        this.V = new CellDetailsChevronDelegate();
        this.W = new FixedTabsDelegate();
        this.X = new TextDelegate();
        this.Y = new TrendViewDelegate(200L);
        this.Z = new ExpandableCellDelegate();
        this.f91263a0 = new HeaderDelegate();
        this.f91264b0 = new HeaderLoadingDelegate();
        this.c0 = new ToDoItemDelegate();
        this.f91265d0 = new SegmentedBarDelegate();
        this.f91266e0 = new FullScreenStateDelegate();
        this.f0 = new LargeActionButtonDelegate();
        this.g0 = new SmallActionButtonDelegate();
        this.f91267h0 = new FooterTextDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.i0 = actionWidgetDelegate;
        ActionWidgetLoadingDelegate actionWidgetLoadingDelegate = new ActionWidgetLoadingDelegate();
        this.j0 = actionWidgetLoadingDelegate;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        this.f91268k0 = heroBannerDelegate;
        final int i2 = 1;
        this.l0 = new ScrollerDelegate(zhm.v.k(heroBannerDelegate, actionWidgetLoadingDelegate, actionWidgetDelegate), false);
        this.m0 = w.y0(new i1d.b(this, inputData, 3));
        this.f91269n0 = w.y0(new Function0(this) { // from class: i6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioDetailsController f158909b;

            {
                this.f158909b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ManagedPortfolioDetailsController.Companion companion = ManagedPortfolioDetailsController.INSTANCE;
                        return (s) ((w5f.f) this.f158909b.m0.getValue()).f295153n0.get();
                    default:
                        ManagedPortfolioDetailsController.Companion companion2 = ManagedPortfolioDetailsController.INSTANCE;
                        ManagedPortfolioDetailsController managedPortfolioDetailsController = this.f158909b;
                        return tki.g.a(managedPortfolioDetailsController, managedPortfolioDetailsController.d(), zhm.v.k(managedPortfolioDetailsController.O, managedPortfolioDetailsController.P, managedPortfolioDetailsController.Q, managedPortfolioDetailsController.R, managedPortfolioDetailsController.T, managedPortfolioDetailsController.S, managedPortfolioDetailsController.U, managedPortfolioDetailsController.V, managedPortfolioDetailsController.Y, managedPortfolioDetailsController.W, managedPortfolioDetailsController.Z, managedPortfolioDetailsController.f91266e0, managedPortfolioDetailsController.N, managedPortfolioDetailsController.f91263a0, managedPortfolioDetailsController.f91264b0, managedPortfolioDetailsController.c0, managedPortfolioDetailsController.f91265d0, managedPortfolioDetailsController.f0, managedPortfolioDetailsController.f91267h0, managedPortfolioDetailsController.g0, managedPortfolioDetailsController.i0, managedPortfolioDetailsController.j0, managedPortfolioDetailsController.f91268k0, managedPortfolioDetailsController.l0, managedPortfolioDetailsController.X, new FooterTextLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.f91270o0 = new e(this);
        this.p0 = new i6f.c(this);
        this.q0 = new i6f.b(this);
        this.f91271r0 = new f(this);
        this.f91272s0 = new g(this);
        this.f91273t0 = new n(this);
        this.u0 = new q(this);
        this.f91274v0 = new r(this);
        this.f91275w0 = new o(this);
        this.f91276x0 = new p(this);
        this.y0 = new avk.h(this);
        this.z0 = new l(this, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r6v6, types: [au0.f0, com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar] */
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
    public final void B(cli.o oVar, cli.q qVar) {
        y6f.a aVar;
        y6f.a aVar2;
        y6f.a aVar3;
        e0 uiState = (e0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        i iVar = uiState.f158924c;
        y6f.b bVar = uiState.f158922a;
        if (iVar != null) {
            d3().f174533b.setModel(iVar);
            ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
            screenRecyclerNavbarActionFooterActionFooterView.setVisibility(0);
        } else {
            ActionFooterView screenRecyclerNavbarActionFooterActionFooterView2 = d3().f174533b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView2, "screenRecyclerNavbarActionFooterActionFooterView");
            screenRecyclerNavbarActionFooterActionFooterView2.setVisibility(8);
        }
        ?? r62 = d3().f174534c;
        r62.setToolbarTitle(bVar != null ? bVar.f311265a : B0);
        r62.setTitle((bVar == null || (aVar3 = bVar.f311267c) == null) ? null : aVar3.f311263a, null);
        r62.setTitleTopDescription(bVar != null ? bVar.f311265a : 0);
        r62.setTitleTopDescriptionVisible(true);
        r62.setSecondDescriptionText((bVar == null || (aVar2 = bVar.f311267c) == null) ? null : aVar2.f311264b);
        r62.setSecondDescriptionVisible(((bVar == null || (aVar = bVar.f311267c) == null) ? null : aVar.f311264b) != null);
        r62.setEndImage(bVar != null ? new yy0.j(bVar.f311266b) : null);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getF91267h0() {
        return this.f91267h0;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getF91266e0() {
        return this.f91266e0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w5f.f) this.m0.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new l0(this, continuation, 18), 3);
        ViewController.P2(this, new i5b.d(rd0.e.b(d3().f174533b.f), 5), new i6f.l(this, continuation, 0), 3);
        ViewController.P2(this, new i5b.d(rd0.e.b(d3().f174533b.f58955g), 6), new i6f.l(this, continuation, 1), 3);
        ViewController.P2(this, new i5b.d(rd0.e.b(this.i0.f51589c.f121375b), 7), new i6f.l(this, continuation, 2), 3);
        ViewController.P2(this, new i5b.d(rd0.e.b(this.O.f53218h), 4), new m(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, A0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i6f.s d() {
        return (i6f.s) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.f91269n0.getValue();
    }
}
