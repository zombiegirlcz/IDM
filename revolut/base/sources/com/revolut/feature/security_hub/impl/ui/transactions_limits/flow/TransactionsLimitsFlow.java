package com.revolut.feature.security_hub.impl.ui.transactions_limits.flow;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import fwc.k;
import fwc.l;
import fwc.m;
import gmk.j;
import gwc.f;
import gwc.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import vtc.b0;
import vtc.t;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/flow/TransactionsLimitsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgwc/f;", "Lali/g;", "Lgwc/g;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/flow/TransactionsLimitsFlowContract$PagerItem;", "Lin0/g;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsLimitsFlow extends ViewController<f> implements g, in0.g {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TransactionsLimitsFlow.class, "binding", "getBinding()Lcom/revolut/feature/security_hub/impl/databinding/FlowTransactionsLimitsBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.flow_transactions_limits;
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, utc.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/security_hub/impl/databinding/FlowTransactionsLimitsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.transactionsLimitsFlow_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.transactionsLimitsFlow_tabs;
                DraggableTabsView draggableTabsView = (DraggableTabsView) ViewBindings.findChildViewById(p0, i);
                if (draggableTabsView != null) {
                    i = R$id.transactionsLimitsFlow_viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                    if (viewPager2 != null) {
                        return new utc.b(viewPager2, draggableTabsView, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TransactionsLimitsFlow() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsFlow f147305b;

            {
                this.f147305b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionsLimitsFlow transactionsLimitsFlow = this.f147305b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsLimitsFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new b0(((t) aVar2.b()).M);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsFlow.P;
                        return (i) ((b0) transactionsLimitsFlow.M.getValue()).f291954b.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsLimitsFlow.P;
                        return mif.a.a(transactionsLimitsFlow, 0, R$id.transactionsLimitsFlow_viewPager, (i) transactionsLimitsFlow.N.getValue(), 5);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsFlow f147305b;

            {
                this.f147305b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionsLimitsFlow transactionsLimitsFlow = this.f147305b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsLimitsFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new b0(((t) aVar2.b()).M);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsFlow.P;
                        return (i) ((b0) transactionsLimitsFlow.M.getValue()).f291954b.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsLimitsFlow.P;
                        return mif.a.a(transactionsLimitsFlow, 0, R$id.transactionsLimitsFlow_viewPager, (i) transactionsLimitsFlow.N.getValue(), 5);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: gwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsFlow f147305b;

            {
                this.f147305b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransactionsLimitsFlow transactionsLimitsFlow = this.f147305b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsLimitsFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new b0(((t) aVar2.b()).M);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsFlow.P;
                        return (i) ((b0) transactionsLimitsFlow.M.getValue()).f291954b.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsLimitsFlow.P;
                        return mif.a.a(transactionsLimitsFlow, 0, R$id.transactionsLimitsFlow_viewPager, (i) transactionsLimitsFlow.N.getValue(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        gwc.g uiState = (gwc.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f283078c.setItems(uiState.f147310a, uiState.f147311b);
        DraggableTabsView transactionsLimitsFlowTabs = d3().f283078c;
        Intrinsics.checkNotNullExpressionValue(transactionsLimitsFlowTabs, "transactionsLimitsFlowTabs");
        transactionsLimitsFlowTabs.setVisibility(uiState.f147312c ? 0 : 8);
        m mVar = uiState.d;
        if (mVar instanceof l) {
            d3().f283077b.I0(t3.TWO_LINES, true);
            return;
        }
        if (!(mVar instanceof k)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar = d3().f283077b;
        navBarWithToolbar.l0();
        k kVar = (k) mVar;
        TextLocalisedClause textLocalisedClause = kVar.f138608a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(kVar.f138609b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TransactionsLimitsFlowContract$PagerItem pagerItem2 = (TransactionsLimitsFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        i iVar = (i) this.N.getValue();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        iVar.H2(iVar.f147315r, new j(pagerItem2, 29));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f283077b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_transactions_limits_title, null, null, 14), null);
        d3().f283078c.k(d3().d);
        DraggableTabsView transactionsLimitsFlowTabs = d3().f283078c;
        Intrinsics.checkNotNullExpressionValue(transactionsLimitsFlowTabs, "transactionsLimitsFlowTabs");
        transactionsLimitsFlowTabs.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f283077b.f59410q), new gwc.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f283077b.o.f57403b), new gwc.b(this, null, 1), 3);
    }

    public final utc.b d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (utc.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
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
