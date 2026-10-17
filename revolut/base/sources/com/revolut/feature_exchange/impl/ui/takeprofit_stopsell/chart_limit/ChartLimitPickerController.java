package com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ip0.md;
import j3c.y;
import j3i.c;
import j3i.d;
import j3i.f;
import j3i.g;
import j3i.i;
import j3i.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/a;", "Ldli/a;", "Lj3i/m;", "Companion", "a", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartLimitPickerController extends ViewController<com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.a> implements dli.a {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;
    public final boolean T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ChartLimitPickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public ChartLimitPickerController(TakeProfitStopLossParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: j3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartLimitPickerController f171193b;

            {
                this.f171193b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ChartLimitPickerController.U;
                        return (i) ((v0i.a) this.f171193b.R.getValue()).f284855g.get();
                    default:
                        KProperty[] kPropertyArr2 = ChartLimitPickerController.U;
                        ChartLimitPickerController chartLimitPickerController = this.f171193b;
                        return dli.f.a(chartLimitPickerController, chartLimitPickerController.d(), v.k((TrendViewDelegate) chartLimitPickerController.M.getValue(), (FixedTabsDelegate) chartLimitPickerController.N.getValue(), (RowDelegate) chartLimitPickerController.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.M = w.y0(new y(1));
        this.N = w.y0(new y(2));
        this.O = w.y0(new y(3));
        this.P = w.y0(new y(4));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: j3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartLimitPickerController f171193b;

            {
                this.f171193b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChartLimitPickerController.U;
                        return (i) ((v0i.a) this.f171193b.R.getValue()).f284855g.get();
                    default:
                        KProperty[] kPropertyArr2 = ChartLimitPickerController.U;
                        ChartLimitPickerController chartLimitPickerController = this.f171193b;
                        return dli.f.a(chartLimitPickerController, chartLimitPickerController.d(), v.k((TrendViewDelegate) chartLimitPickerController.M.getValue(), (FixedTabsDelegate) chartLimitPickerController.N.getValue(), (RowDelegate) chartLimitPickerController.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.R = w.y0(new md(this, params, 26));
        this.S = s.t(this, j3i.b.f);
        this.T = true;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, uiState.e, uiState.d, null, 4, null);
        d3().f174564b.setEnabled(uiState.f171205b);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v0i.a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "INFO_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        ((j60.a) ((v0i.a) this.R.getValue()).f284856h.get()).d(v.k(new CellDetailsDelegate(), (LargeActionButtonDelegate) this.O.getValue()));
        d3().f174564b.setText(new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_save, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.P;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53225r), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabsDelegate) this.N.getValue()).f52339c.f121375b), null, new j3i.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, kii.e.t(((TrendViewDelegate) this.M.getValue()).e, "hide(...)"), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new j3i.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.O.getValue()).d.f121375b), null, new j3i.h(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.S.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.T);
    }
}
