package com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.AddKeyStatsViewItemsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.AddKeyStatsViewItemsScreenContract$Input;
import dli.a;
import efm.r;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.d;
import prk.g0;
import te0.w;
import vc.s;
import wsg.k;
import wvg.r1;
import wvk.b;
import wvk.c;
import wvk.e;
import wvk.f;
import wvk.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/add_key_stats_view_items/AddKeyStatsViewItemsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwvk/e;", "Ldli/a;", "Lwvk/f;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddKeyStatsViewItemsScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AddKeyStatsViewItemsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AddKeyStatsViewItemsScreenContract$Input K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final RowDelegate P;
    public final DraggableDelegate Q;
    public final SmallActionButtonDelegate R;
    public final Object S;

    public AddKeyStatsViewItemsScreen(AddKeyStatsViewItemsScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsViewItemsScreen f300542b;

            {
                this.f300542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddKeyStatsViewItemsScreen addKeyStatsViewItemsScreen = this.f300542b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddKeyStatsViewItemsScreen.T;
                        qji.b bVarU2 = addKeyStatsViewItemsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.di.AddKeyStatsViewItemsScreenComponent.Injector");
                        prk.b bVar = (prk.b) bVarU2;
                        g0 g0Var = bVar.f239060b;
                        prk.b bVar2 = bVar.f239061c;
                        AddKeyStatsViewItemsScreenContract$Input addKeyStatsViewItemsScreenContract$Input = addKeyStatsViewItemsScreen.K;
                        return new prk.d(g0Var, bVar2, addKeyStatsViewItemsScreenContract$Input, new awk.a(addKeyStatsViewItemsScreen.P), new awk.f(addKeyStatsViewItemsScreenContract$Input.f104026c, new awk.c(addKeyStatsViewItemsScreenContract$Input.f104025b), addKeyStatsViewItemsScreenContract$Input.d));
                    case 1:
                        KProperty[] kPropertyArr2 = AddKeyStatsViewItemsScreen.T;
                        return (j) ((prk.d) addKeyStatsViewItemsScreen.L.getValue()).f239076h.get();
                    default:
                        KProperty[] kPropertyArr3 = AddKeyStatsViewItemsScreen.T;
                        AddKeyStatsViewItemsScreen addKeyStatsViewItemsScreen2 = this.f300542b;
                        return dli.f.a(addKeyStatsViewItemsScreen2, (j) addKeyStatsViewItemsScreen2.M.getValue(), v.k(addKeyStatsViewItemsScreen2.P, addKeyStatsViewItemsScreen2.Q, addKeyStatsViewItemsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsViewItemsScreen f300542b;

            {
                this.f300542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddKeyStatsViewItemsScreen addKeyStatsViewItemsScreen = this.f300542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddKeyStatsViewItemsScreen.T;
                        qji.b bVarU2 = addKeyStatsViewItemsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.di.AddKeyStatsViewItemsScreenComponent.Injector");
                        prk.b bVar = (prk.b) bVarU2;
                        g0 g0Var = bVar.f239060b;
                        prk.b bVar2 = bVar.f239061c;
                        AddKeyStatsViewItemsScreenContract$Input addKeyStatsViewItemsScreenContract$Input = addKeyStatsViewItemsScreen.K;
                        return new prk.d(g0Var, bVar2, addKeyStatsViewItemsScreenContract$Input, new awk.a(addKeyStatsViewItemsScreen.P), new awk.f(addKeyStatsViewItemsScreenContract$Input.f104026c, new awk.c(addKeyStatsViewItemsScreenContract$Input.f104025b), addKeyStatsViewItemsScreenContract$Input.d));
                    case 1:
                        KProperty[] kPropertyArr2 = AddKeyStatsViewItemsScreen.T;
                        return (j) ((prk.d) addKeyStatsViewItemsScreen.L.getValue()).f239076h.get();
                    default:
                        KProperty[] kPropertyArr3 = AddKeyStatsViewItemsScreen.T;
                        AddKeyStatsViewItemsScreen addKeyStatsViewItemsScreen2 = this.f300542b;
                        return dli.f.a(addKeyStatsViewItemsScreen2, (j) addKeyStatsViewItemsScreen2.M.getValue(), v.k(addKeyStatsViewItemsScreen2.P, addKeyStatsViewItemsScreen2.Q, addKeyStatsViewItemsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new DraggableDelegate(rowDelegate, null);
        this.R = new SmallActionButtonDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: wvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsViewItemsScreen f300542b;

            {
                this.f300542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddKeyStatsViewItemsScreen addKeyStatsViewItemsScreen = this.f300542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddKeyStatsViewItemsScreen.T;
                        qji.b bVarU2 = addKeyStatsViewItemsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.di.AddKeyStatsViewItemsScreenComponent.Injector");
                        prk.b bVar = (prk.b) bVarU2;
                        g0 g0Var = bVar.f239060b;
                        prk.b bVar2 = bVar.f239061c;
                        AddKeyStatsViewItemsScreenContract$Input addKeyStatsViewItemsScreenContract$Input = addKeyStatsViewItemsScreen.K;
                        return new prk.d(g0Var, bVar2, addKeyStatsViewItemsScreenContract$Input, new awk.a(addKeyStatsViewItemsScreen.P), new awk.f(addKeyStatsViewItemsScreenContract$Input.f104026c, new awk.c(addKeyStatsViewItemsScreenContract$Input.f104025b), addKeyStatsViewItemsScreenContract$Input.d));
                    case 1:
                        KProperty[] kPropertyArr2 = AddKeyStatsViewItemsScreen.T;
                        return (j) ((prk.d) addKeyStatsViewItemsScreen.L.getValue()).f239076h.get();
                    default:
                        KProperty[] kPropertyArr3 = AddKeyStatsViewItemsScreen.T;
                        AddKeyStatsViewItemsScreen addKeyStatsViewItemsScreen2 = this.f300542b;
                        return dli.f.a(addKeyStatsViewItemsScreen2, (j) addKeyStatsViewItemsScreen2.M.getValue(), v.k(addKeyStatsViewItemsScreen2.P, addKeyStatsViewItemsScreen2.Q, addKeyStatsViewItemsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f300546b, null);
        d3().f174539b.setMenuItems(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((j) this.M.getValue()).I2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.M.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 0), 3);
        r rVarFilter = d3().f174539b.o.f57403b.filter(new k(new r1(4), 19));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new c(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
