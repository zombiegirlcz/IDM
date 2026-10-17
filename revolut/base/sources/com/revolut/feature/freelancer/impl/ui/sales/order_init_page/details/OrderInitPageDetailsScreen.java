package com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ft.d;
import g27.b;
import g27.f;
import g27.g;
import g27.i;
import g27.j;
import g27.k;
import g27.l;
import g27.p;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.t3;
import us6.j1;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/details/OrderInitPageDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lg27/p;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderInitPageDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(OrderInitPageDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final FullScreenStateDelegate L;
    public final RowDelegate M;
    public final CellDetailsChevronDelegate N;
    public final CellDetailsNoteDelegate O;
    public final ListSubheaderDelegate P;
    public final ListCellDelegate Q;
    public final boolean R;
    public final int S;
    public final Object T;
    public final Object U;
    public final Object V;

    public OrderInitPageDetailsScreen(OrderInitPageDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new FullScreenStateDelegate();
        this.M = new RowDelegate(null, null, 7);
        this.N = new CellDetailsChevronDelegate();
        this.O = new CellDetailsNoteDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new ListCellDelegate();
        this.R = true;
        this.S = R$layout.screen_recycler_navbar;
        this.T = w.y0(new fx5.a(this, inputData, 6));
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: g27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageDetailsScreen f139914b;

            {
                this.f139914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageDetailsScreen.W;
                        return (o) ((j1) this.f139914b.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = OrderInitPageDetailsScreen.W;
                        OrderInitPageDetailsScreen orderInitPageDetailsScreen = this.f139914b;
                        return dli.f.a(orderInitPageDetailsScreen, orderInitPageDetailsScreen.R2(), zhm.v.k(orderInitPageDetailsScreen.L, orderInitPageDetailsScreen.M, orderInitPageDetailsScreen.N, orderInitPageDetailsScreen.O, orderInitPageDetailsScreen.P, orderInitPageDetailsScreen.Q, new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsTotalDelegate(), new PlainTextWarningDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: g27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageDetailsScreen f139914b;

            {
                this.f139914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageDetailsScreen.W;
                        return (o) ((j1) this.f139914b.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = OrderInitPageDetailsScreen.W;
                        OrderInitPageDetailsScreen orderInitPageDetailsScreen = this.f139914b;
                        return dli.f.a(orderInitPageDetailsScreen, orderInitPageDetailsScreen.R2(), zhm.v.k(orderInitPageDetailsScreen.L, orderInitPageDetailsScreen.M, orderInitPageDetailsScreen.N, orderInitPageDetailsScreen.O, orderInitPageDetailsScreen.P, orderInitPageDetailsScreen.Q, new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsTotalDelegate(), new PlainTextWarningDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f139923b;
        Clause clause2 = uiState.f139924c;
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        if (clause != null) {
            navBarWithToolbar.l0();
        } else {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionText(uiState.d);
        navBarWithToolbar.setActions(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j1) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.s0()), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new g27.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new fo6.d(rd0.e.b(this.O.f), 16), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52707c), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new fo6.d(rd0.e.b(this.Q.f52692c), 17), null, new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g27.o R2() {
        return (g27.o) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
