package com.revolut.feature_move_money.impl.amount.order_settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u7i.r;
import v4a.i;
import v6i.b;
import v6i.d;
import v6i.j;
import v6i.l;
import v6i.m;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/order_settings/OrderSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv6i/j;", "Ldli/a;", "Lv6i/l;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderSettingsScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(OrderSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final h L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;

    public OrderSettingsScreen(OrderSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: v6i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSettingsScreen f286391b;

            {
                this.f286391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = OrderSettingsScreen.Q;
                        return new InputTextDelegate(new c(2, 0, OrderSettingsScreen.class, this.f286391b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"));
                    case 1:
                        KProperty[] kPropertyArr2 = OrderSettingsScreen.Q;
                        OrderSettingsScreen orderSettingsScreen = this.f286391b;
                        return dli.f.a(orderSettingsScreen, (m) orderSettingsScreen.P.getValue(), v.k((InputTextDelegate) orderSettingsScreen.K.getValue(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = OrderSettingsScreen.Q;
                        return (m) ((r) this.f286391b.O.getValue()).d.get();
                }
            }
        });
        this.L = s.t(this, b.f);
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: v6i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSettingsScreen f286391b;

            {
                this.f286391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderSettingsScreen.Q;
                        return new InputTextDelegate(new c(2, 0, OrderSettingsScreen.class, this.f286391b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"));
                    case 1:
                        KProperty[] kPropertyArr2 = OrderSettingsScreen.Q;
                        OrderSettingsScreen orderSettingsScreen = this.f286391b;
                        return dli.f.a(orderSettingsScreen, (m) orderSettingsScreen.P.getValue(), v.k((InputTextDelegate) orderSettingsScreen.K.getValue(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = OrderSettingsScreen.Q;
                        return (m) ((r) this.f286391b.O.getValue()).d.get();
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        this.O = w.y0(new v0c.b(this, inputData, 18));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: v6i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSettingsScreen f286391b;

            {
                this.f286391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = OrderSettingsScreen.Q;
                        return new InputTextDelegate(new c(2, 0, OrderSettingsScreen.class, this.f286391b, "getMaskBinder", "getMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit/formatting/AmountMaskingDelegate;"));
                    case 1:
                        KProperty[] kPropertyArr2 = OrderSettingsScreen.Q;
                        OrderSettingsScreen orderSettingsScreen = this.f286391b;
                        return dli.f.a(orderSettingsScreen, (m) orderSettingsScreen.P.getValue(), v.k((InputTextDelegate) orderSettingsScreen.K.getValue(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = OrderSettingsScreen.Q;
                        return (m) ((r) this.f286391b.O.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Clause clause = uiState.f286400a;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
        d3().f174564b.setEnabled(uiState.f286401b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionClickable(false);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.move_money_order_settings_navbar_title, null, null, 14), null);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14));
        largeActionButton.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.p0()), new v6i.e(this, null, 0), 3);
        efm.r map = ((InputTextDelegate) this.K.getValue()).e.f121375b.map(new i(26, new v6e.d(4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new v6i.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(w.a0(d3().f174564b.o, new v6e.d(5))), new d(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
