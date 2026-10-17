package com.revolut.feature.transaction_list.impl.ui.list.flow;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction_list.impl.R$id;
import com.revolut.feature.transaction_list.impl.R$layout;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlow;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData;
import com.revolut.feature.transactions.api.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pgf.f;
import qgf.d;
import qgf.e;
import qgf.g;
import qgf.i;
import qgf.l;
import qgf.m;
import qji.b;
import te0.w;
import tx0.m3;
import vc.s;
import wki.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lwki/a;", "Lqgf/m;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionListFlow extends ViewController<q> implements wki.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TransactionListFlow.class, "binding", "getBinding()Lcom/revolut/feature/transaction_list/impl/databinding/FlowTransactionListBinding;", 0))};
    public final TransactionListFlowContract$InputData K;
    public final int L;
    public final boolean M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;

    public TransactionListFlow(TransactionListFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_transaction_list;
        this.M = true;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qgf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionListFlow f245796b;

            {
                this.f245796b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionListFlow transactionListFlow = this.f245796b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionListFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(transactionListFlow.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        TransactionListFlowContract$InputData transactionListFlowContract$InputData = transactionListFlow.K;
                        transactionListFlowContract$InputData.getClass();
                        return new pgf.f(eVar, transactionListFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionListFlow.R;
                        return (i) ((pgf.f) transactionListFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionListFlow.R;
                        return md6.s.a(transactionListFlow, transactionListFlow.d(), R$id.flowTransactionList_container, 4);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qgf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionListFlow f245796b;

            {
                this.f245796b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionListFlow transactionListFlow = this.f245796b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionListFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(transactionListFlow.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        TransactionListFlowContract$InputData transactionListFlowContract$InputData = transactionListFlow.K;
                        transactionListFlowContract$InputData.getClass();
                        return new pgf.f(eVar, transactionListFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionListFlow.R;
                        return (i) ((pgf.f) transactionListFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionListFlow.R;
                        return md6.s.a(transactionListFlow, transactionListFlow.d(), R$id.flowTransactionList_container, 4);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qgf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionListFlow f245796b;

            {
                this.f245796b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransactionListFlow transactionListFlow = this.f245796b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionListFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(transactionListFlow.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        TransactionListFlowContract$InputData transactionListFlowContract$InputData = transactionListFlow.K;
                        transactionListFlowContract$InputData.getClass();
                        return new pgf.f(eVar, transactionListFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionListFlow.R;
                        return (i) ((pgf.f) transactionListFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionListFlow.R;
                        return md6.s.a(transactionListFlow, transactionListFlow.d(), R$id.flowTransactionList_container, 4);
                }
            }
        });
        this.Q = s.t(this, e.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174035c;
        l lVar = uiState.f245807a;
        Clause clause = lVar.f245805b;
        Clause clause2 = lVar.f245804a;
        int i = d.f245797a[lVar.e.ordinal()];
        if (i == 1) {
            navBarWithToolbar.setTitle(clause2, null);
            navBarWithToolbar.setToolbarTitle(clause2);
            if (clause != null) {
                navBarWithToolbar.setDescriptionText(clause);
                navBarWithToolbar.setDescriptionVisible(true);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.setStickyAnimatedTitle(new m3(clause2, clause));
        }
        navBarWithToolbar.setEndIconImage(lVar.f245806c);
        navBarWithToolbar.setSearchButtonActive(lVar.d);
        navBarWithToolbar.setFiltersState(uiState.e);
        Tabs tabs = d3().f174034b;
        tabs.setVisibility(uiState.f245808b ? 0 : 8);
        tabs.setItems(uiState.f245809c, uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174035c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.transaction_list_navbar_search_hint_text, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        d3().f174035c.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new db.a(this, 5));
        SlidingFromTopViewContainer flowTransactionListSlidingContainer = d3().d;
        Intrinsics.checkNotNullExpressionValue(flowTransactionListSlidingContainer, "flowTransactionListSlidingContainer");
        ViewGroup.LayoutParams layoutParams = flowTransactionListSlidingContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
        layoutParams2.setBehavior(new NavBarScrollingViewBehavior());
        flowTransactionListSlidingContainer.setLayoutParams(layoutParams2);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174035c.f59410q), null, new qgf.f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174035c.u0()), null, new qgf.f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174035c.v0()), null, new qgf.f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174035c.f59409p.f57336l), null, new qgf.f(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174035c.f59409p.f57337m), null, new g(this, null, 0), 3);
        ViewController.P2(this, ((a) d()).f91918s, new qgf.f(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174034b.f58882b), null, new g(this, null, 1), 3);
    }

    public final jgf.a d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jgf.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (c) this.P.getValue();
    }
}
