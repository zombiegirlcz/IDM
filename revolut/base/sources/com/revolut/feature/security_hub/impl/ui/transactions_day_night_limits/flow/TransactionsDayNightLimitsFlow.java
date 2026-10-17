package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import bq7.j;
import bwc.g;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.TransactionsDayNightLimitsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vn2.l;
import vtc.t;
import vtc.y;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbwc/g;", "Lali/g;", "Lbwc/h;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/flow/TransactionsDayNightLimitsFlowContract$PagerItem;", "Lin0/g;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsDayNightLimitsFlow extends ViewController<g> implements ali.g, in0.g {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TransactionsDayNightLimitsFlow.class, "binding", "getBinding()Lcom/revolut/feature/security_hub/impl/databinding/FlowDayNightTransactionsLimitsBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.flow_day_night_transactions_limits;
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, utc.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/security_hub/impl/databinding/FlowDayNightTransactionsLimitsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.dayNightTransactionsLimitsFlow_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.dayNightTransactionsLimitsFlow_tabs;
                DraggableTabsView draggableTabsView = (DraggableTabsView) ViewBindings.findChildViewById(p0, i);
                if (draggableTabsView != null) {
                    i = R$id.dayNightTransactionsLimitsFlow_viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                    if (viewPager2 != null) {
                        return new utc.a(viewPager2, draggableTabsView, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TransactionsDayNightLimitsFlow() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsDayNightLimitsFlow f19310b;

            {
                this.f19310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionsDayNightLimitsFlow transactionsDayNightLimitsFlow = this.f19310b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsDayNightLimitsFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsDayNightLimitsFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        y yVar = new y();
                        yVar.f292095a = e4m.b.b(new l(tVar, yVar, 1, 18));
                        yVar.f292096b = e4m.b.b(new l(tVar, yVar, 0, 18));
                        return yVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsDayNightLimitsFlow.P;
                        return (c) ((y) transactionsDayNightLimitsFlow.M.getValue()).f292096b.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsDayNightLimitsFlow.P;
                        return mif.a.a(transactionsDayNightLimitsFlow, 0, R$id.dayNightTransactionsLimitsFlow_viewPager, (c) transactionsDayNightLimitsFlow.N.getValue(), 5);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: bwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsDayNightLimitsFlow f19310b;

            {
                this.f19310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionsDayNightLimitsFlow transactionsDayNightLimitsFlow = this.f19310b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsDayNightLimitsFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsDayNightLimitsFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        y yVar = new y();
                        yVar.f292095a = e4m.b.b(new l(tVar, yVar, 1, 18));
                        yVar.f292096b = e4m.b.b(new l(tVar, yVar, 0, 18));
                        return yVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsDayNightLimitsFlow.P;
                        return (c) ((y) transactionsDayNightLimitsFlow.M.getValue()).f292096b.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsDayNightLimitsFlow.P;
                        return mif.a.a(transactionsDayNightLimitsFlow, 0, R$id.dayNightTransactionsLimitsFlow_viewPager, (c) transactionsDayNightLimitsFlow.N.getValue(), 5);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: bwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsDayNightLimitsFlow f19310b;

            {
                this.f19310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransactionsDayNightLimitsFlow transactionsDayNightLimitsFlow = this.f19310b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsDayNightLimitsFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsDayNightLimitsFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        y yVar = new y();
                        yVar.f292095a = e4m.b.b(new l(tVar, yVar, 1, 18));
                        yVar.f292096b = e4m.b.b(new l(tVar, yVar, 0, 18));
                        return yVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsDayNightLimitsFlow.P;
                        return (c) ((y) transactionsDayNightLimitsFlow.M.getValue()).f292096b.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsDayNightLimitsFlow.P;
                        return mif.a.a(transactionsDayNightLimitsFlow, 0, R$id.dayNightTransactionsLimitsFlow_viewPager, (c) transactionsDayNightLimitsFlow.N.getValue(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        bwc.h uiState = (bwc.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f283075c.setItems(uiState.f19313a, uiState.f19314b);
        d3().f283074b.setSecondDescriptionText(uiState.f19315c);
        DraggableTabsView dayNightTransactionsLimitsFlowTabs = d3().f283075c;
        Intrinsics.checkNotNullExpressionValue(dayNightTransactionsLimitsFlowTabs, "dayNightTransactionsLimitsFlowTabs");
        dayNightTransactionsLimitsFlowTabs.setVisibility(uiState.d ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TransactionsDayNightLimitsFlowContract$PagerItem pagerItem2 = (TransactionsDayNightLimitsFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        b bVar = (b) ((bwc.c) this.N.getValue());
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        bVar.H2(bVar.f85718q, new j(pagerItem2, 20));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (y) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bwc.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f283074b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_multiple_limits_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_multiple_limits_screen_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f283075c.k(d3().d);
        DraggableTabsView dayNightTransactionsLimitsFlowTabs = d3().f283075c;
        Intrinsics.checkNotNullExpressionValue(dayNightTransactionsLimitsFlowTabs, "dayNightTransactionsLimitsFlowTabs");
        dayNightTransactionsLimitsFlowTabs.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f283074b.f59410q), new bwc.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f283074b.x0()), new bwc.b(this, null, 1), 3);
    }

    public final utc.a d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (utc.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.O.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
