package com.revolut.feature_exchange.impl.ui.order_details_kompot;

import a3i.d;
import a3i.f;
import a3i.m;
import a3i.n;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsController;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import te0.w;
import v0i.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/order_details_kompot/OrderDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "La3i/o;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderDetailsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(OrderDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final OrderDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final ActionsDelegate N;
    public final CellDetailsActionDelegate O;
    public final CellDetailsChevronDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public OrderDetailsController(OrderDetailsScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, a3i.b.f);
        this.N = new ActionsDelegate();
        this.O = new CellDetailsActionDelegate();
        this.P = new CellDetailsChevronDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: a3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailsController f1137b;

            {
                this.f1137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderDetailsController orderDetailsController = this.f1137b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderDetailsController.T;
                        OrderDetailsController orderDetailsController2 = this.f1137b;
                        return dli.f.a(orderDetailsController2, orderDetailsController2.R2(), zhm.v.k(new CellDetailsDelegate(), orderDetailsController2.N, orderDetailsController2.O, new ListSubheaderDelegate(), new ListCellDelegate(), new TextDelegate(), orderDetailsController2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderDetailsController.T;
                        phm.a aVar = (phm.a) ue0.e.j(orderDetailsController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        OrderDetailsScreenContract$InputData orderDetailsScreenContract$InputData = orderDetailsController.K;
                        orderDetailsScreenContract$InputData.getClass();
                        return new v0i.c(bVar, orderDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = OrderDetailsController.T;
                        return (n) ((v0i.c) orderDetailsController.R.getValue()).f284874c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: a3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailsController f1137b;

            {
                this.f1137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderDetailsController orderDetailsController = this.f1137b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderDetailsController.T;
                        OrderDetailsController orderDetailsController2 = this.f1137b;
                        return dli.f.a(orderDetailsController2, orderDetailsController2.R2(), zhm.v.k(new CellDetailsDelegate(), orderDetailsController2.N, orderDetailsController2.O, new ListSubheaderDelegate(), new ListCellDelegate(), new TextDelegate(), orderDetailsController2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderDetailsController.T;
                        phm.a aVar = (phm.a) ue0.e.j(orderDetailsController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        OrderDetailsScreenContract$InputData orderDetailsScreenContract$InputData = orderDetailsController.K;
                        orderDetailsScreenContract$InputData.getClass();
                        return new v0i.c(bVar, orderDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = OrderDetailsController.T;
                        return (n) ((v0i.c) orderDetailsController.R.getValue()).f284874c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: a3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderDetailsController f1137b;

            {
                this.f1137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OrderDetailsController orderDetailsController = this.f1137b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderDetailsController.T;
                        OrderDetailsController orderDetailsController2 = this.f1137b;
                        return dli.f.a(orderDetailsController2, orderDetailsController2.R2(), zhm.v.k(new CellDetailsDelegate(), orderDetailsController2.N, orderDetailsController2.O, new ListSubheaderDelegate(), new ListCellDelegate(), new TextDelegate(), orderDetailsController2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = OrderDetailsController.T;
                        phm.a aVar = (phm.a) ue0.e.j(orderDetailsController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        OrderDetailsScreenContract$InputData orderDetailsScreenContract$InputData = orderDetailsController.K;
                        orderDetailsScreenContract$InputData.getClass();
                        return new v0i.c(bVar, orderDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = OrderDetailsController.T;
                        return (n) ((v0i.c) orderDetailsController.R.getValue()).f284874c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        a3i.o uiState = (a3i.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        m mVar = uiState.f1154b;
        if (mVar == null) {
            m70.a.c(t0.f186434a);
            navBarWithToolbar.setToolbarTitle(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            navBarWithToolbar.setTitle(null, null);
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setEndIconImage(null);
            navBarWithToolbar.setEndImageClickable(false);
            return;
        }
        MoneyClause moneyClause = mVar.f1150a;
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setDescriptionText(mVar.f1151b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEndIconImage(mVar.f1152c);
        navBarWithToolbar.setEndImageClickable(mVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new a3i.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.r0()), new a3i.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51611c.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d), new a3i.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51821c), new f(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
