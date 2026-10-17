package com.revolut.feature.wealth.ui.impl.recurring_buy_hub_collection;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.ui.impl.recurring_buy_hub_collection.RecurringBuyHubCollectionController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import mkh.l;
import pki.b;
import rlh.c;
import rlh.d;
import rlh.v;
import rlh.x;
import rlh.y;
import rlh.z;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/recurring_buy_hub_collection/RecurringBuyHubCollectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "<init>", "()V", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringBuyHubCollectionController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RecurringBuyHubCollectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final LargeActionButtonDelegate O = new LargeActionButtonDelegate();
    public final FixedTabsDelegate P = new FixedTabsDelegate();
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public RecurringBuyHubCollectionController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: rlh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringBuyHubCollectionController f255047b;

            {
                this.f255047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecurringBuyHubCollectionController recurringBuyHubCollectionController = this.f255047b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringBuyHubCollectionController.T;
                        RecurringBuyHubCollectionController recurringBuyHubCollectionController2 = this.f255047b;
                        return dli.f.a(recurringBuyHubCollectionController2, (m) recurringBuyHubCollectionController2.S.getValue(), zhm.v.k(recurringBuyHubCollectionController2.M, new RowLoadingDelegate(), recurringBuyHubCollectionController2.N, recurringBuyHubCollectionController2.O, recurringBuyHubCollectionController2.P), recurringBuyHubCollectionController2.d3().f174540c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringBuyHubCollectionController.T;
                        phm.a aVar = (phm.a) ue0.e.j(recurringBuyHubCollectionController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mkh.l(((mkh.s) ((mkh.u) aVar2.b())).l0);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RecurringBuyHubCollectionController.T;
                        return (m) ((mkh.l) recurringBuyHubCollectionController.R.getValue()).f206347c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: rlh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringBuyHubCollectionController f255047b;

            {
                this.f255047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecurringBuyHubCollectionController recurringBuyHubCollectionController = this.f255047b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringBuyHubCollectionController.T;
                        RecurringBuyHubCollectionController recurringBuyHubCollectionController2 = this.f255047b;
                        return dli.f.a(recurringBuyHubCollectionController2, (m) recurringBuyHubCollectionController2.S.getValue(), zhm.v.k(recurringBuyHubCollectionController2.M, new RowLoadingDelegate(), recurringBuyHubCollectionController2.N, recurringBuyHubCollectionController2.O, recurringBuyHubCollectionController2.P), recurringBuyHubCollectionController2.d3().f174540c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringBuyHubCollectionController.T;
                        phm.a aVar = (phm.a) ue0.e.j(recurringBuyHubCollectionController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mkh.l(((mkh.s) ((mkh.u) aVar2.b())).l0);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RecurringBuyHubCollectionController.T;
                        return (m) ((mkh.l) recurringBuyHubCollectionController.R.getValue()).f206347c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: rlh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringBuyHubCollectionController f255047b;

            {
                this.f255047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RecurringBuyHubCollectionController recurringBuyHubCollectionController = this.f255047b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringBuyHubCollectionController.T;
                        RecurringBuyHubCollectionController recurringBuyHubCollectionController2 = this.f255047b;
                        return dli.f.a(recurringBuyHubCollectionController2, (m) recurringBuyHubCollectionController2.S.getValue(), zhm.v.k(recurringBuyHubCollectionController2.M, new RowLoadingDelegate(), recurringBuyHubCollectionController2.N, recurringBuyHubCollectionController2.O, recurringBuyHubCollectionController2.P), recurringBuyHubCollectionController2.d3().f174540c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringBuyHubCollectionController.T;
                        phm.a aVar = (phm.a) ue0.e.j(recurringBuyHubCollectionController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new mkh.l(((mkh.s) ((mkh.u) aVar2.b())).l0);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RecurringBuyHubCollectionController.T;
                        return (m) ((mkh.l) recurringBuyHubCollectionController.R.getValue()).f206347c.get();
                }
            }
        });
    }

    public static /* synthetic */ void f3(RecurringBuyHubCollectionController recurringBuyHubCollectionController, int i) {
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        m70.a.c(t0Var);
        recurringBuyHubCollectionController.e3(textClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (i & 4) == 0);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        z uiState = (z) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        y yVar = uiState.f255077a;
        if (Intrinsics.f(yVar, x.f255076a)) {
            f3(this, 7);
            return;
        }
        if (Intrinsics.f(yVar, rlh.w.f255075a)) {
            f3(this, 3);
        } else {
            if (!(yVar instanceof v)) {
                throw new NoWhenBranchMatchedException();
            }
            v vVar = (v) yVar;
            e3(vVar.f255073a, vVar.f255074b, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (rlh.m) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(this.N.f52371h.f121375b), rd0.e.b(this.M.f53218h), rd0.e.b(this.O.d.f121375b)), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52339c.f121375b), new d(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    public final void e3(Clause clause, Clause clause2, boolean z) {
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        if (z) {
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        } else {
            navBarWithToolbar.l0();
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
