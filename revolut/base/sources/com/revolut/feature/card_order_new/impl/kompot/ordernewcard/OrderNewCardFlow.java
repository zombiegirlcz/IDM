package com.revolut.feature.card_order_new.impl.kompot.ordernewcard;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_order_new.api.BackConfirmationDialog;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.impl.R$id;
import com.revolut.feature.card_order_new.impl.R$layout;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlow;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.core.navigation.NaviCommand;
import f23.o;
import f23.p;
import f23.t;
import f23.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pd.b;
import ski.c;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lski/a;", "Lf23/t;", "Lcom/revolut/feature/card_order_new/api/SelectedTab;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderNewCardFlow extends ViewController<q> implements ski.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(OrderNewCardFlow.class, "binding", "getBinding()Lcom/revolut/feature/card_order_new/impl/databinding/ControllerOrderNewCardFlowBinding;", 0))};
    public final OrderNewCardFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;

    public OrderNewCardFlow(OrderNewCardFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.controller_order_new_card_flow;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: f23.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderNewCardFlow f131402b;

            {
                this.f131402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderNewCardFlow orderNewCardFlow = this.f131402b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderNewCardFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(orderNewCardFlow.m2()).a().get(x13.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x13.p.class, " is not found"));
                        }
                        x13.p pVar = ((x13.p) aVar2.b()).T;
                        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = orderNewCardFlow.K;
                        orderNewCardFlowContract$InputData.getClass();
                        return new x13.z(pVar, new agk.c(), orderNewCardFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderNewCardFlow.Q;
                        return (q) ((x13.z) ((l23.a) orderNewCardFlow.M.getValue())).f302225m.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderNewCardFlow.Q;
                        return czi.c.c(orderNewCardFlow, R$id.orderNewCardFlowPager, orderNewCardFlow.d());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: f23.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderNewCardFlow f131402b;

            {
                this.f131402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderNewCardFlow orderNewCardFlow = this.f131402b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderNewCardFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(orderNewCardFlow.m2()).a().get(x13.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x13.p.class, " is not found"));
                        }
                        x13.p pVar = ((x13.p) aVar2.b()).T;
                        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = orderNewCardFlow.K;
                        orderNewCardFlowContract$InputData.getClass();
                        return new x13.z(pVar, new agk.c(), orderNewCardFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderNewCardFlow.Q;
                        return (q) ((x13.z) ((l23.a) orderNewCardFlow.M.getValue())).f302225m.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderNewCardFlow.Q;
                        return czi.c.c(orderNewCardFlow, R$id.orderNewCardFlowPager, orderNewCardFlow.d());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: f23.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderNewCardFlow f131402b;

            {
                this.f131402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OrderNewCardFlow orderNewCardFlow = this.f131402b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderNewCardFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(orderNewCardFlow.m2()).a().get(x13.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x13.p.class, " is not found"));
                        }
                        x13.p pVar = ((x13.p) aVar2.b()).T;
                        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = orderNewCardFlow.K;
                        orderNewCardFlowContract$InputData.getClass();
                        return new x13.z(pVar, new agk.c(), orderNewCardFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderNewCardFlow.Q;
                        return (q) ((x13.z) ((l23.a) orderNewCardFlow.M.getValue())).f302225m.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderNewCardFlow.Q;
                        return czi.c.c(orderNewCardFlow, R$id.orderNewCardFlowPager, orderNewCardFlow.d());
                }
            }
        });
        this.P = s.t(this, o.f);
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        f23.s sVar = qVar instanceof f23.s ? (f23.s) qVar : null;
        if (b.k(sVar != null ? Boolean.valueOf(sVar.f131408a) : null)) {
            NavBarWithToolbar orderNewCardFlowNavBar = d3().f211223b;
            Intrinsics.checkNotNullExpressionValue(orderNewCardFlowNavBar, "orderNewCardFlowNavBar");
            orderNewCardFlowNavBar.setTitle(uiState.f131412a, null);
        }
        if (b.k(sVar != null ? Boolean.valueOf(sVar.f131409b) : null)) {
            Clause clause = uiState.f131413b;
            if (clause != null) {
                d3().f211223b.setSecondDescriptionVisible(true);
                d3().f211223b.setSecondDescriptionText(clause);
            } else {
                d3().f211223b.setSecondDescriptionVisible(false);
            }
        }
        if (b.k(sVar != null ? Boolean.valueOf(sVar.f131410c) : null)) {
            d3().f211223b.setMenuItems(uiState.f131414c);
        }
        if (b.k(sVar != null ? Boolean.valueOf(sVar.d) : null)) {
            d3().f211224c.setItems(uiState.d, uiState.f);
            Tabs orderNewCardFlowTabs = d3().f211224c;
            Intrinsics.checkNotNullExpressionValue(orderNewCardFlowTabs, "orderNewCardFlowTabs");
            orderNewCardFlowTabs.setVisibility((uiState.d.isEmpty() || uiState.e) ? 8 : 0);
        }
        if (!b.k(sVar != null ? Boolean.valueOf(sVar.f) : null) || uiState.f == null) {
            return;
        }
        Tabs orderNewCardFlowTabs2 = d3().f211224c;
        Intrinsics.checkNotNullExpressionValue(orderNewCardFlowTabs2, "orderNewCardFlowTabs");
        Tabs.u(orderNewCardFlowTabs2, uiState.f, true, false, false, 12);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) d();
        com.revolut.kompot.navigable.vc.modal.a aVar2 = aVar.f65110x;
        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = aVar.o;
        BackConfirmationDialog f64942c = orderNewCardFlowContract$InputData.e.getF64942c();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (f64942c != null) {
            oki.h.v2(aVar2, new OrderNewCardFlowContract$ModalStep.BackConfirmation(f64942c), bottom_dialog);
            return true;
        }
        if (orderNewCardFlowContract$InputData.f65091b instanceof CardOrderAccountWrapper.Junior) {
            oki.h.v2(aVar2, OrderNewCardFlowContract$ModalStep.JuniorSkip.f65100a, bottom_dialog);
            return true;
        }
        NaviCommand naviCommand = orderNewCardFlowContract$InputData.f65097m;
        if (naviCommand == null) {
            return super.F2();
        }
        aVar.C1(u0.b(naviCommand));
        return true;
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        SelectedTab pagerItem2 = (SelectedTab) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        a aVar = (a) d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        aVar.H2(aVar.getState(), new v(pagerItem2, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l23.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l23.a) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f211223b;
        navBarWithToolbar.setToolbarBackgroundColor(R$attr.uikit_windowBackground);
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = this.K;
        navBarWithToolbar.setNavigationButtonIcon(orderNewCardFlowContract$InputData.d ? Integer.valueOf(orderNewCardFlowContract$InputData.e.getF64940a()) : null);
        ViewController.P2(this, rd0.e.b(d3().f211223b.f59410q), new ev7.b(this, null, 12), 3);
        ViewController.P2(this, rd0.e.b(d3().f211224c.f58882b), new p(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f211223b.o.f57403b), new p(this, null, 1), 3);
    }

    public final n13.a d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n13.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f23.q d() {
        return (f23.q) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
