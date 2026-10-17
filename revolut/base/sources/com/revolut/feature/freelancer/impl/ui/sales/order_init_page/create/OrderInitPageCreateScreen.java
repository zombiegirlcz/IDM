package com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.f;
import aw0.g;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d27.a0;
import d27.b;
import d27.b0;
import d27.c;
import d27.c0;
import d27.i;
import d27.j;
import d27.k;
import d27.l;
import d27.m;
import d27.y;
import d27.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.i1;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld27/y;", "Ldli/a;", "Ld27/c0;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderInitPageCreateScreen extends ViewController<y> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(OrderInitPageCreateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final OrderInitPageCreateScreenContract$InputData K;
    public final int L;
    public final h M;
    public final AmountEditDelegate N;
    public final BannerDelegate O;
    public final FullScreenStateDelegate P;
    public final InputTextDelegate Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public OrderInitPageCreateScreen(OrderInitPageCreateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, c.f);
        this.N = new AmountEditDelegate(new b(2, 0, OrderInitPageCreateScreen.class, this, "getAmountMaskingDelegate", "getAmountMaskingDelegate(Lcom/revolut/core/ui_kit/delegates/AmountEditDelegate$Model;Lcom/revolut/core/ui_kit/views/amount/AmountEditView;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"));
        this.O = new BannerDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new InputTextDelegate(null);
        this.R = new RowDelegate(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: d27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageCreateScreen f110729b;

            {
                this.f110729b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderInitPageCreateScreen orderInitPageCreateScreen = this.f110729b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageCreateScreen.W;
                        qd0.b bVarN = ((i1) orderInitPageCreateScreen.T.getValue()).f282576b.f282691m.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = OrderInitPageCreateScreen.W;
                        qji.b bVarU2 = orderInitPageCreateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.di.OrderInitPageCreateScreenInjector");
                        us6.b0 b0Var = (us6.b0) bVarU2;
                        us6.q qVar = b0Var.f282456b;
                        us6.b0 b0Var2 = b0Var.f282457c;
                        OrderInitPageCreateScreenContract$InputData orderInitPageCreateScreenContract$InputData = orderInitPageCreateScreen.K;
                        orderInitPageCreateScreenContract$InputData.getClass();
                        return new i1(qVar, b0Var2, orderInitPageCreateScreen, orderInitPageCreateScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = OrderInitPageCreateScreen.W;
                        return (z) ((i1) orderInitPageCreateScreen.T.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr4 = OrderInitPageCreateScreen.W;
                        OrderInitPageCreateScreen orderInitPageCreateScreen2 = this.f110729b;
                        return dli.f.a(orderInitPageCreateScreen2, orderInitPageCreateScreen2.d(), zhm.d0.E0(((fd6.a) ((i1) orderInitPageCreateScreen2.T.getValue()).d.get()).e, zhm.v.k(orderInitPageCreateScreen2.N, orderInitPageCreateScreen2.O, orderInitPageCreateScreen2.P, orderInitPageCreateScreen2.Q, new ListSubheaderDelegate(), orderInitPageCreateScreen2.R, new RowLoadingDelegate())), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: d27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageCreateScreen f110729b;

            {
                this.f110729b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderInitPageCreateScreen orderInitPageCreateScreen = this.f110729b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageCreateScreen.W;
                        qd0.b bVarN = ((i1) orderInitPageCreateScreen.T.getValue()).f282576b.f282691m.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = OrderInitPageCreateScreen.W;
                        qji.b bVarU2 = orderInitPageCreateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.di.OrderInitPageCreateScreenInjector");
                        us6.b0 b0Var = (us6.b0) bVarU2;
                        us6.q qVar = b0Var.f282456b;
                        us6.b0 b0Var2 = b0Var.f282457c;
                        OrderInitPageCreateScreenContract$InputData orderInitPageCreateScreenContract$InputData = orderInitPageCreateScreen.K;
                        orderInitPageCreateScreenContract$InputData.getClass();
                        return new i1(qVar, b0Var2, orderInitPageCreateScreen, orderInitPageCreateScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = OrderInitPageCreateScreen.W;
                        return (z) ((i1) orderInitPageCreateScreen.T.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr4 = OrderInitPageCreateScreen.W;
                        OrderInitPageCreateScreen orderInitPageCreateScreen2 = this.f110729b;
                        return dli.f.a(orderInitPageCreateScreen2, orderInitPageCreateScreen2.d(), zhm.d0.E0(((fd6.a) ((i1) orderInitPageCreateScreen2.T.getValue()).d.get()).e, zhm.v.k(orderInitPageCreateScreen2.N, orderInitPageCreateScreen2.O, orderInitPageCreateScreen2.P, orderInitPageCreateScreen2.Q, new ListSubheaderDelegate(), orderInitPageCreateScreen2.R, new RowLoadingDelegate())), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: d27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageCreateScreen f110729b;

            {
                this.f110729b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OrderInitPageCreateScreen orderInitPageCreateScreen = this.f110729b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageCreateScreen.W;
                        qd0.b bVarN = ((i1) orderInitPageCreateScreen.T.getValue()).f282576b.f282691m.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = OrderInitPageCreateScreen.W;
                        qji.b bVarU2 = orderInitPageCreateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.di.OrderInitPageCreateScreenInjector");
                        us6.b0 b0Var = (us6.b0) bVarU2;
                        us6.q qVar = b0Var.f282456b;
                        us6.b0 b0Var2 = b0Var.f282457c;
                        OrderInitPageCreateScreenContract$InputData orderInitPageCreateScreenContract$InputData = orderInitPageCreateScreen.K;
                        orderInitPageCreateScreenContract$InputData.getClass();
                        return new i1(qVar, b0Var2, orderInitPageCreateScreen, orderInitPageCreateScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = OrderInitPageCreateScreen.W;
                        return (z) ((i1) orderInitPageCreateScreen.T.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr4 = OrderInitPageCreateScreen.W;
                        OrderInitPageCreateScreen orderInitPageCreateScreen2 = this.f110729b;
                        return dli.f.a(orderInitPageCreateScreen2, orderInitPageCreateScreen2.d(), zhm.d0.E0(((fd6.a) ((i1) orderInitPageCreateScreen2.T.getValue()).d.get()).e, zhm.v.k(orderInitPageCreateScreen2.N, orderInitPageCreateScreen2.O, orderInitPageCreateScreen2.P, orderInitPageCreateScreen2.Q, new ListSubheaderDelegate(), orderInitPageCreateScreen2.R, new RowLoadingDelegate())), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: d27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageCreateScreen f110729b;

            {
                this.f110729b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                OrderInitPageCreateScreen orderInitPageCreateScreen = this.f110729b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageCreateScreen.W;
                        qd0.b bVarN = ((i1) orderInitPageCreateScreen.T.getValue()).f282576b.f282691m.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = OrderInitPageCreateScreen.W;
                        qji.b bVarU2 = orderInitPageCreateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.di.OrderInitPageCreateScreenInjector");
                        us6.b0 b0Var = (us6.b0) bVarU2;
                        us6.q qVar = b0Var.f282456b;
                        us6.b0 b0Var2 = b0Var.f282457c;
                        OrderInitPageCreateScreenContract$InputData orderInitPageCreateScreenContract$InputData = orderInitPageCreateScreen.K;
                        orderInitPageCreateScreenContract$InputData.getClass();
                        return new i1(qVar, b0Var2, orderInitPageCreateScreen, orderInitPageCreateScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = OrderInitPageCreateScreen.W;
                        return (z) ((i1) orderInitPageCreateScreen.T.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr4 = OrderInitPageCreateScreen.W;
                        OrderInitPageCreateScreen orderInitPageCreateScreen2 = this.f110729b;
                        return dli.f.a(orderInitPageCreateScreen2, orderInitPageCreateScreen2.d(), zhm.d0.E0(((fd6.a) ((i1) orderInitPageCreateScreen2.T.getValue()).d.get()).e, zhm.v.k(orderInitPageCreateScreen2.N, orderInitPageCreateScreen2.O, orderInitPageCreateScreen2.P, orderInitPageCreateScreen2.Q, new ListSubheaderDelegate(), orderInitPageCreateScreen2.R, new RowLoadingDelegate())), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c0 uiState = (c0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        b0 b0Var = uiState.f110736c;
        TextLocalisedClause textLocalisedClause = b0Var.f110732a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setFilters(b0Var.f110733b);
        ActionFooterView actionFooterView = d3().f174533b;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        a0 a0Var = uiState.f110734a;
        actionFooterView.setModel(new g(new n6(null, defaultFilledButton, new ResourceImage(R$drawable.uikit_icn_24_eye, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, a0Var.f110731b, null, null, 984), new n6(a0Var.f110730a, defaultFilledButton, null, "TAG_BUTTON_CREATE_OIP", a0Var.f110731b, null, null, 972), (Clause) null, f.SMALL_PRIMARY_BUTTON, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i1) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        String currencyCode;
        if (i != 4 || i2 != -1 || intent == null || (currencyCode = intent.getStringExtra("argCurrency")) == null) {
            return;
        }
        a aVar = (a) d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        aVar.H2(aVar.E, new c86.c(currencyCode, 22));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new d27.g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.s0()), new d27.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new d27.g(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f58955g), new d27.g(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.e), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new k(this, null), 3);
        InputTextDelegate inputTextDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new m(this, null), 3);
        RowDelegate rowDelegate = this.R;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new d27.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53224q), new d27.f(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final z d() {
        return (z) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
