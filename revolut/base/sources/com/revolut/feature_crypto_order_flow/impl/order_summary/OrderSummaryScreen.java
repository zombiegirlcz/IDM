package com.revolut.feature_crypto_order_flow.impl.order_summary;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import dli.c;
import efm.r;
import ihm.f;
import jii.k;
import jzh.d0;
import jzh.f0;
import jzh.m;
import jzh.n;
import jzh.p;
import jzh.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import mkd.g;
import te0.w;
import uzh.b;
import vc.s;
import xki.e;
import yy0.i;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/order_summary/OrderSummaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljzh/d0;", "Luzh/b;", "Lvzh/b;", "Lmkd/g;", "Ltzh/b;", "Lpzh/b;", "Lmga/i0;", "Ldli/a;", "Ljzh/i0;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderSummaryScreen extends ViewController<d0> implements b, vzh.b, g, tzh.b, pzh.b, i0, dli.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96774a0 = {o0.f186429a.j(new h0(OrderSummaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final FixedTabsDelegate L;
    public final ActionWidgetDelegate M;
    public final HighlightTileDelegate N;
    public final CellDetailsDelegate O;
    public final CellDetailsActionDelegate P;
    public final CellDetailsSwitcherDelegate Q;
    public final RowDelegate R;
    public final FullScreenStateDelegate S;
    public final PlainTextWarningDelegate T;
    public final TextDelegate U;
    public final ScrollerDelegate V;
    public final Object W;
    public final h X;
    public final Object Y;
    public final Object Z;

    public OrderSummaryScreen(OrderSummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = new FixedTabsDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.M = actionWidgetDelegate;
        this.N = new HighlightTileDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new CellDetailsActionDelegate();
        this.Q = new CellDetailsSwitcherDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new FullScreenStateDelegate();
        this.T = new PlainTextWarningDelegate();
        this.U = new TextDelegate();
        final int i = 0;
        final int i2 = 1;
        this.V = new ScrollerDelegate(v.k(new ActionWidgetLoadingDelegate(), actionWidgetDelegate), false);
        this.W = w.y0(new Function0(this) { // from class: jzh.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSummaryScreen f179837b;

            {
                this.f179837b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = OrderSummaryScreen.f96774a0;
                        OrderSummaryScreen orderSummaryScreen = this.f179837b;
                        return dli.f.a(orderSummaryScreen, orderSummaryScreen.R2(), zhm.v.k(orderSummaryScreen.V, orderSummaryScreen.M, orderSummaryScreen.N, orderSummaryScreen.L, orderSummaryScreen.O, new CellDetailsLoadingDelegate(), orderSummaryScreen.S, orderSummaryScreen.P, orderSummaryScreen.Q, orderSummaryScreen.R, orderSummaryScreen.T, orderSummaryScreen.U), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = OrderSummaryScreen.f96774a0;
                        return (f0) ((tyh.g) this.f179837b.Y.getValue()).L.get();
                }
            }
        });
        this.X = s.t(this, m.f);
        this.Y = w.y0(new jnf.a(this, inputData, 18));
        this.Z = w.y0(new Function0(this) { // from class: jzh.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSummaryScreen f179837b;

            {
                this.f179837b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderSummaryScreen.f96774a0;
                        OrderSummaryScreen orderSummaryScreen = this.f179837b;
                        return dli.f.a(orderSummaryScreen, orderSummaryScreen.R2(), zhm.v.k(orderSummaryScreen.V, orderSummaryScreen.M, orderSummaryScreen.N, orderSummaryScreen.L, orderSummaryScreen.O, new CellDetailsLoadingDelegate(), orderSummaryScreen.S, orderSummaryScreen.P, orderSummaryScreen.Q, orderSummaryScreen.R, orderSummaryScreen.T, orderSummaryScreen.U), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = OrderSummaryScreen.f96774a0;
                        return (f0) ((tyh.g) this.f179837b.Y.getValue()).L.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void B(o oVar, q qVar) {
        jzh.i0 uiState = (jzh.i0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        t tVar = uiState.f179830b;
        navBarWithToolbar.setHeaderDisclaimerSticky(tVar.f179853a);
        i iVar = l.Companion;
        Image image = tVar.f179854b;
        iVar.getClass();
        navBarWithToolbar.setEndImage(i.a(image));
        navBarWithToolbar.setEndIconBadgeImage(tVar.e);
        ?? r06 = tVar.f179855c;
        navBarWithToolbar.setToolbarTitle(r06);
        navBarWithToolbar.setTitle(r06, null);
        navBarWithToolbar.setDescriptionText(tVar.d);
    }

    @Override // mkd.g
    public final r F1() {
        return this.V.i;
    }

    @Override // mga.i0
    public final r N0() {
        return this.N.f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (tyh.g) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i2 == 41053) {
            F2();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        d3().f174533b.setModel(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.cryptobuysell_market_order_confirmation_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55));
    }

    @Override // mga.i0
    public final r a2() {
        return this.R.f53218h;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new n(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b((f) d3().f174534c.f59406n.f258290b), new jzh.o(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new n(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new p(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52339c.f121375b), new jzh.o(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51912c), new jzh.q(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.s()), new jzh.o(this, continuation, 2), 3);
    }

    public final k d3() {
        ViewBinding value = this.X.getValue(this, f96774a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f0 d() {
        return (f0) this.Z.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f174532a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((c) this.W.getValue()).w().f;
    }
}
