package com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreenContract$Input;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import efm.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.c;
import prk.g0;
import te0.w;
import up5.d0;
import uvk.b;
import uvk.d;
import uvk.h;
import uvk.j;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/add_key_stats_view_groups/AddKeyStatsViewGroupsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luvk/h;", "Ldli/a;", "Luvk/j;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddKeyStatsViewGroupsScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AddKeyStatsViewGroupsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AddKeyStatsViewGroupsScreenContract$Input K;
    public final Object L;
    public final Object M;
    public final int N;
    public final ao.h O;
    public final RowDelegate P;
    public final Object Q;

    public AddKeyStatsViewGroupsScreen(AddKeyStatsViewGroupsScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsViewGroupsScreen f283472b;

            {
                this.f283472b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen = this.f283472b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddKeyStatsViewGroupsScreen.R;
                        qji.b bVarU2 = addKeyStatsViewGroupsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.di.AddKeyStatsViewGroupsScreenComponent.Injector");
                        prk.b bVar = (prk.b) bVarU2;
                        g0 g0Var = bVar.f239060b;
                        prk.b bVar2 = bVar.f239061c;
                        AddKeyStatsViewGroupsScreenContract$Input addKeyStatsViewGroupsScreenContract$Input = addKeyStatsViewGroupsScreen.K;
                        return new prk.c(g0Var, bVar2, addKeyStatsViewGroupsScreenContract$Input, new awk.a(addKeyStatsViewGroupsScreen.P), new awk.f(addKeyStatsViewGroupsScreenContract$Input.f104022b, new awk.d(addKeyStatsViewGroupsScreenContract$Input.f104021a), addKeyStatsViewGroupsScreenContract$Input.f104023c));
                    case 1:
                        KProperty[] kPropertyArr2 = AddKeyStatsViewGroupsScreen.R;
                        return (o) ((prk.c) addKeyStatsViewGroupsScreen.L.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = AddKeyStatsViewGroupsScreen.R;
                        AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen2 = this.f283472b;
                        return dli.f.a(addKeyStatsViewGroupsScreen2, addKeyStatsViewGroupsScreen2.d(), v.k(addKeyStatsViewGroupsScreen2.P, new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsViewGroupsScreen f283472b;

            {
                this.f283472b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen = this.f283472b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddKeyStatsViewGroupsScreen.R;
                        qji.b bVarU2 = addKeyStatsViewGroupsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.di.AddKeyStatsViewGroupsScreenComponent.Injector");
                        prk.b bVar = (prk.b) bVarU2;
                        g0 g0Var = bVar.f239060b;
                        prk.b bVar2 = bVar.f239061c;
                        AddKeyStatsViewGroupsScreenContract$Input addKeyStatsViewGroupsScreenContract$Input = addKeyStatsViewGroupsScreen.K;
                        return new prk.c(g0Var, bVar2, addKeyStatsViewGroupsScreenContract$Input, new awk.a(addKeyStatsViewGroupsScreen.P), new awk.f(addKeyStatsViewGroupsScreenContract$Input.f104022b, new awk.d(addKeyStatsViewGroupsScreenContract$Input.f104021a), addKeyStatsViewGroupsScreenContract$Input.f104023c));
                    case 1:
                        KProperty[] kPropertyArr2 = AddKeyStatsViewGroupsScreen.R;
                        return (o) ((prk.c) addKeyStatsViewGroupsScreen.L.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = AddKeyStatsViewGroupsScreen.R;
                        AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen2 = this.f283472b;
                        return dli.f.a(addKeyStatsViewGroupsScreen2, addKeyStatsViewGroupsScreen2.d(), v.k(addKeyStatsViewGroupsScreen2.P, new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        this.O = s.t(this, b.f);
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsViewGroupsScreen f283472b;

            {
                this.f283472b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen = this.f283472b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddKeyStatsViewGroupsScreen.R;
                        qji.b bVarU2 = addKeyStatsViewGroupsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.di.AddKeyStatsViewGroupsScreenComponent.Injector");
                        prk.b bVar = (prk.b) bVarU2;
                        g0 g0Var = bVar.f239060b;
                        prk.b bVar2 = bVar.f239061c;
                        AddKeyStatsViewGroupsScreenContract$Input addKeyStatsViewGroupsScreenContract$Input = addKeyStatsViewGroupsScreen.K;
                        return new prk.c(g0Var, bVar2, addKeyStatsViewGroupsScreenContract$Input, new awk.a(addKeyStatsViewGroupsScreen.P), new awk.f(addKeyStatsViewGroupsScreenContract$Input.f104022b, new awk.d(addKeyStatsViewGroupsScreenContract$Input.f104021a), addKeyStatsViewGroupsScreenContract$Input.f104023c));
                    case 1:
                        KProperty[] kPropertyArr2 = AddKeyStatsViewGroupsScreen.R;
                        return (o) ((prk.c) addKeyStatsViewGroupsScreen.L.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = AddKeyStatsViewGroupsScreen.R;
                        AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen2 = this.f283472b;
                        return dli.f.a(addKeyStatsViewGroupsScreen2, addKeyStatsViewGroupsScreen2.d(), v.k(addKeyStatsViewGroupsScreen2.P, new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_details_customize_key_stats_edit_add_new_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_details_customize_key_stats_edit_add_new_title, null, null, 14));
        navBarWithToolbar.setHints(u.c(new TextLocalisedClause(R$string.wealth_details_customize_key_stats_search_placeholder, null, null, 14)));
        navBarWithToolbar.setSearchButtonActive(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.wealth_details_customize_key_stats_groups_done_button_label, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(w.a0(this.P.f53218h, new uv1.c(7))), new uvk.c(this, null, 0), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59409p.f57337m), new uvk.c(this, null, 1), 3);
        r rVarFilter = navBarWithToolbar.X0.filter(new d0(22, new uv1.c(8)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new d(this, null, 1), 3);
        d3().f174564b.setEnabled(true);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final uvk.o d() {
        return (uvk.o) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
