package com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transaction_list.impl.R$string;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rgf.b;
import rgf.c;
import rgf.d;
import rgf.g;
import rgf.i;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/list/screen/all_accounts_filter/AllAccountsTransactionFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrgf/g;", "Ldli/a;", "Lrgf/i;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AllAccountsTransactionFiltersScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AllAccountsTransactionFiltersScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final RowDelegate K;
    public final SelectableDelegate L;
    public final ListSubheaderDelegate M;
    public final CellDetailsDelegate N;
    public final h O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public AllAccountsTransactionFiltersScreen(AllAccountsTransactionFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.K = rowDelegate;
        this.L = new SelectableDelegate(rowDelegate);
        this.M = new ListSubheaderDelegate();
        this.N = new CellDetailsDelegate();
        this.O = s.t(this, c.f);
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: rgf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllAccountsTransactionFiltersScreen f254143b;

            {
                this.f254143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AllAccountsTransactionFiltersScreen.T;
                        return (h) ((pgf.a) this.f254143b.R.getValue()).f235880c.get();
                    default:
                        KProperty[] kPropertyArr2 = AllAccountsTransactionFiltersScreen.T;
                        AllAccountsTransactionFiltersScreen allAccountsTransactionFiltersScreen = this.f254143b;
                        return dli.f.a(allAccountsTransactionFiltersScreen, allAccountsTransactionFiltersScreen.R2(), zhm.v.k(allAccountsTransactionFiltersScreen.M, allAccountsTransactionFiltersScreen.L, allAccountsTransactionFiltersScreen.K, allAccountsTransactionFiltersScreen.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new b(this, inputData, i));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: rgf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllAccountsTransactionFiltersScreen f254143b;

            {
                this.f254143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AllAccountsTransactionFiltersScreen.T;
                        return (h) ((pgf.a) this.f254143b.R.getValue()).f235880c.get();
                    default:
                        KProperty[] kPropertyArr2 = AllAccountsTransactionFiltersScreen.T;
                        AllAccountsTransactionFiltersScreen allAccountsTransactionFiltersScreen = this.f254143b;
                        return dli.f.a(allAccountsTransactionFiltersScreen, allAccountsTransactionFiltersScreen.R2(), zhm.v.k(allAccountsTransactionFiltersScreen.M, allAccountsTransactionFiltersScreen.L, allAccountsTransactionFiltersScreen.K, allAccountsTransactionFiltersScreen.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174565c.setMenuItems(uiState.f254158b);
        d3().f174564b.setEnabled(uiState.f254159c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pgf.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_filter_screen_header_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.transactionUI_filter_screen_action_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new rgf.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new rgf.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new r5e.e(this, null, 21), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rgf.h R2() {
        return (rgf.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
