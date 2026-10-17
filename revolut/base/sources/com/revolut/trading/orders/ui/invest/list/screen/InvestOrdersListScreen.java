package com.revolut.trading.orders.ui.invest.list.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.trading.orders.ui.invest.list.screen.InvestOrdersListScreen;
import d1h.j;
import dli.a;
import dli.c;
import dtl.d;
import htl.g;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import mq4.b;
import mtl.e;
import te0.w;
import vc.s;
import vkm.q0;
import xsl.i;
import z0h.s1;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/list/screen/InvestOrdersListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrdersListScreen extends ViewController<q> implements a, s1, g, d, j {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106829a0 = {o0.f186429a.j(new h0(InvestOrdersListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InvestOrdersListFeatureContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final ListSubheaderDelegate T;
    public final InputDisclosureDelegate U;
    public final ListSubheaderLoadingDelegate V;
    public final Object W;
    public final FooterTextDelegate X;
    public final Object Y;
    public final Object Z;

    public InvestOrdersListScreen(InvestOrdersListFeatureContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, mtl.g.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mtl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrdersListScreen f208919b;

            {
                this.f208919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestOrdersListScreen investOrdersListScreen = this.f208919b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen2 = this.f208919b;
                        phm.a aVar = (phm.a) ue0.e.j(investOrdersListScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = investOrdersListScreen2.K;
                        investOrdersListFeatureContract$InputData.getClass();
                        return new xsl.i(pVar, investOrdersListFeatureContract$InputData, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrdersListScreen.f106829a0;
                        return (d) ((xsl.i) investOrdersListScreen.N.getValue()).f308653q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrdersListScreen.f106829a0;
                        return new SwipeToActionDelegate((RowDelegate) investOrdersListScreen.Q.getValue(), false);
                    case 3:
                        return v.k((RowLoadingDelegate) investOrdersListScreen.P.getValue(), (RowDelegate) investOrdersListScreen.Q.getValue(), (TextDelegate) investOrdersListScreen.R.getValue(), investOrdersListScreen.getO(), (SwipeToActionDelegate) investOrdersListScreen.W.getValue(), investOrdersListScreen.T, investOrdersListScreen.U, investOrdersListScreen.V, investOrdersListScreen.X);
                    default:
                        KProperty[] kPropertyArr4 = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen3 = this.f208919b;
                        return dli.f.a(investOrdersListScreen3, (d) investOrdersListScreen3.O.getValue(), (List) investOrdersListScreen3.Y.getValue(), investOrdersListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mtl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrdersListScreen f208919b;

            {
                this.f208919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestOrdersListScreen investOrdersListScreen = this.f208919b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen2 = this.f208919b;
                        phm.a aVar = (phm.a) ue0.e.j(investOrdersListScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = investOrdersListScreen2.K;
                        investOrdersListFeatureContract$InputData.getClass();
                        return new xsl.i(pVar, investOrdersListFeatureContract$InputData, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrdersListScreen.f106829a0;
                        return (d) ((xsl.i) investOrdersListScreen.N.getValue()).f308653q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrdersListScreen.f106829a0;
                        return new SwipeToActionDelegate((RowDelegate) investOrdersListScreen.Q.getValue(), false);
                    case 3:
                        return v.k((RowLoadingDelegate) investOrdersListScreen.P.getValue(), (RowDelegate) investOrdersListScreen.Q.getValue(), (TextDelegate) investOrdersListScreen.R.getValue(), investOrdersListScreen.getO(), (SwipeToActionDelegate) investOrdersListScreen.W.getValue(), investOrdersListScreen.T, investOrdersListScreen.U, investOrdersListScreen.V, investOrdersListScreen.X);
                    default:
                        KProperty[] kPropertyArr4 = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen3 = this.f208919b;
                        return dli.f.a(investOrdersListScreen3, (d) investOrdersListScreen3.O.getValue(), (List) investOrdersListScreen3.Y.getValue(), investOrdersListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.P = w.y0(new b(20));
        this.Q = w.y0(new b(21));
        this.R = w.y0(new b(22));
        this.S = w.y0(new b(23));
        this.T = new ListSubheaderDelegate();
        this.U = new InputDisclosureDelegate();
        this.V = new ListSubheaderLoadingDelegate();
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: mtl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrdersListScreen f208919b;

            {
                this.f208919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestOrdersListScreen investOrdersListScreen = this.f208919b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen2 = this.f208919b;
                        phm.a aVar = (phm.a) ue0.e.j(investOrdersListScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = investOrdersListScreen2.K;
                        investOrdersListFeatureContract$InputData.getClass();
                        return new xsl.i(pVar, investOrdersListFeatureContract$InputData, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrdersListScreen.f106829a0;
                        return (d) ((xsl.i) investOrdersListScreen.N.getValue()).f308653q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrdersListScreen.f106829a0;
                        return new SwipeToActionDelegate((RowDelegate) investOrdersListScreen.Q.getValue(), false);
                    case 3:
                        return v.k((RowLoadingDelegate) investOrdersListScreen.P.getValue(), (RowDelegate) investOrdersListScreen.Q.getValue(), (TextDelegate) investOrdersListScreen.R.getValue(), investOrdersListScreen.getO(), (SwipeToActionDelegate) investOrdersListScreen.W.getValue(), investOrdersListScreen.T, investOrdersListScreen.U, investOrdersListScreen.V, investOrdersListScreen.X);
                    default:
                        KProperty[] kPropertyArr4 = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen3 = this.f208919b;
                        return dli.f.a(investOrdersListScreen3, (d) investOrdersListScreen3.O.getValue(), (List) investOrdersListScreen3.Y.getValue(), investOrdersListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.X = new FooterTextDelegate();
        final int i5 = 3;
        this.Y = w.y0(new Function0(this) { // from class: mtl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrdersListScreen f208919b;

            {
                this.f208919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InvestOrdersListScreen investOrdersListScreen = this.f208919b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen2 = this.f208919b;
                        phm.a aVar = (phm.a) ue0.e.j(investOrdersListScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = investOrdersListScreen2.K;
                        investOrdersListFeatureContract$InputData.getClass();
                        return new xsl.i(pVar, investOrdersListFeatureContract$InputData, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrdersListScreen.f106829a0;
                        return (d) ((xsl.i) investOrdersListScreen.N.getValue()).f308653q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrdersListScreen.f106829a0;
                        return new SwipeToActionDelegate((RowDelegate) investOrdersListScreen.Q.getValue(), false);
                    case 3:
                        return v.k((RowLoadingDelegate) investOrdersListScreen.P.getValue(), (RowDelegate) investOrdersListScreen.Q.getValue(), (TextDelegate) investOrdersListScreen.R.getValue(), investOrdersListScreen.getO(), (SwipeToActionDelegate) investOrdersListScreen.W.getValue(), investOrdersListScreen.T, investOrdersListScreen.U, investOrdersListScreen.V, investOrdersListScreen.X);
                    default:
                        KProperty[] kPropertyArr4 = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen3 = this.f208919b;
                        return dli.f.a(investOrdersListScreen3, (d) investOrdersListScreen3.O.getValue(), (List) investOrdersListScreen3.Y.getValue(), investOrdersListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i6 = 4;
        this.Z = w.y0(new Function0(this) { // from class: mtl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrdersListScreen f208919b;

            {
                this.f208919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                InvestOrdersListScreen investOrdersListScreen = this.f208919b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen2 = this.f208919b;
                        phm.a aVar = (phm.a) ue0.e.j(investOrdersListScreen2.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = investOrdersListScreen2.K;
                        investOrdersListFeatureContract$InputData.getClass();
                        return new xsl.i(pVar, investOrdersListFeatureContract$InputData, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2, investOrdersListScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestOrdersListScreen.f106829a0;
                        return (d) ((xsl.i) investOrdersListScreen.N.getValue()).f308653q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestOrdersListScreen.f106829a0;
                        return new SwipeToActionDelegate((RowDelegate) investOrdersListScreen.Q.getValue(), false);
                    case 3:
                        return v.k((RowLoadingDelegate) investOrdersListScreen.P.getValue(), (RowDelegate) investOrdersListScreen.Q.getValue(), (TextDelegate) investOrdersListScreen.R.getValue(), investOrdersListScreen.getO(), (SwipeToActionDelegate) investOrdersListScreen.W.getValue(), investOrdersListScreen.T, investOrdersListScreen.U, investOrdersListScreen.V, investOrdersListScreen.X);
                    default:
                        KProperty[] kPropertyArr4 = InvestOrdersListScreen.f106829a0;
                        InvestOrdersListScreen investOrdersListScreen3 = this.f208919b;
                        return dli.f.a(investOrdersListScreen3, (d) investOrdersListScreen3.O.getValue(), (List) investOrdersListScreen3.Y.getValue(), investOrdersListScreen3.d3().f174540c.getId(), null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f208916a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // dtl.d
    public final Flow B0() {
        return rd0.e.b(((SwipeToActionDelegate) this.W.getValue()).f);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getX() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // htl.g
    public final vkm.d O1() {
        return rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // d1h.j
    /* JADX INFO: renamed from: Q */
    public final FullScreenStateDelegate getO() {
        return (FullScreenStateDelegate) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (mtl.d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = this.K;
        if (investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.PendingOrders) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_title, null, null, 14);
        } else {
            if (!(investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.RecurringOrders)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_invest_invest_plans_title, null, null, 14);
        }
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ViewController.P2(this, new q0(rd0.e.b(navBarWithToolbar.f59410q), new mtl.h(this, null, 0), 1), null, 7);
        ViewController.P2(this, new q0(new mmh.e(rd0.e.b(navBarWithToolbar.o.f57403b), 8), new mtl.h(this, null, 1), 1), null, 7);
        ViewController.P2(this, new q0(vkm.q.J(rd0.e.b(getO().f52371h.f121375b), rd0.e.b(this.U.f52538c)), new mkk.q(this, null, 18), 1), null, 7);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, f106829a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(((TextDelegate) this.R.getValue()).d);
    }
}
