package com.revolut.feature.payees.impl.ui.payees_overview.flow;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payees.impl.R$id;
import com.revolut.feature.payees.impl.R$layout;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlow;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rm9.e;
import sm9.f;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrm9/e;", "Lali/g;", "Lsm9/f;", "Lcom/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlowContract$FlowPagerItem;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayeesOverviewFlow extends ViewController<e> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PayeesOverviewFlow.class, "binding", "getBinding()Lcom/revolut/feature/payees/impl/databinding/FlowPayeesOverviewBinding;", 0))};
    public final sm9.d K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public PayeesOverviewFlow(sm9.d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_payees_overview;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: sm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesOverviewFlow f264391b;

            {
                this.f264391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayeesOverviewFlow payeesOverviewFlow = this.f264391b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesOverviewFlow.Q;
                        return mif.a.a(payeesOverviewFlow, 0, R$id.payeesOverviewFlow_viewPager, (c) payeesOverviewFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PayeesOverviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(payeesOverviewFlow.m2()).a().get(hm9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm9.b.class, " is not found"));
                        }
                        hm9.b bVar = ((hm9.b) aVar2.b()).f153550j;
                        d dVar = payeesOverviewFlow.K;
                        dVar.getClass();
                        return new hm9.g(bVar, dVar);
                    default:
                        KProperty[] kPropertyArr3 = PayeesOverviewFlow.Q;
                        return (c) ((hm9.g) payeesOverviewFlow.O.getValue()).d.get();
                }
            }
        });
        this.N = s.t(this, sm9.b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: sm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesOverviewFlow f264391b;

            {
                this.f264391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayeesOverviewFlow payeesOverviewFlow = this.f264391b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesOverviewFlow.Q;
                        return mif.a.a(payeesOverviewFlow, 0, R$id.payeesOverviewFlow_viewPager, (c) payeesOverviewFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PayeesOverviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(payeesOverviewFlow.m2()).a().get(hm9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm9.b.class, " is not found"));
                        }
                        hm9.b bVar = ((hm9.b) aVar2.b()).f153550j;
                        d dVar = payeesOverviewFlow.K;
                        dVar.getClass();
                        return new hm9.g(bVar, dVar);
                    default:
                        KProperty[] kPropertyArr3 = PayeesOverviewFlow.Q;
                        return (c) ((hm9.g) payeesOverviewFlow.O.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: sm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesOverviewFlow f264391b;

            {
                this.f264391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayeesOverviewFlow payeesOverviewFlow = this.f264391b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesOverviewFlow.Q;
                        return mif.a.a(payeesOverviewFlow, 0, R$id.payeesOverviewFlow_viewPager, (c) payeesOverviewFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PayeesOverviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(payeesOverviewFlow.m2()).a().get(hm9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm9.b.class, " is not found"));
                        }
                        hm9.b bVar = ((hm9.b) aVar2.b()).f153550j;
                        d dVar = payeesOverviewFlow.K;
                        dVar.getClass();
                        return new hm9.g(bVar, dVar);
                    default:
                        KProperty[] kPropertyArr3 = PayeesOverviewFlow.Q;
                        return (c) ((hm9.g) payeesOverviewFlow.O.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        DraggableTabsView draggableTabsView = d3().f144795c;
        draggableTabsView.setItems(uiState.f264395a, uiState.f264396b);
        draggableTabsView.setVisibility(uiState.f264397c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        PayeesOverviewFlowContract$FlowPagerItem pagerItem2 = (PayeesOverviewFlowContract$FlowPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        c cVar = (c) ((sm9.c) this.P.getValue());
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        cVar.H2(cVar.f79009q, new sl5.a(pagerItem2, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (hm9.g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (hm9.g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (sm9.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f144794b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_home_payees, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_home_payees, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f144794b.f59410q), new se4.c(this, null, 11), 3);
        ViewController.P2(this, rd0.e.b(d3().f144795c.m()), new sek.q(this, null, 8), 3);
    }

    public final gm9.a d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gm9.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.M.getValue();
    }
}
