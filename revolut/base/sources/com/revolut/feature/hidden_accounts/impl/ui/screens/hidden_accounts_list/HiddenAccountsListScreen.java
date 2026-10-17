package com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list;

import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import fb6.j;
import fb7.b;
import fb7.b0;
import fb7.c;
import fb7.c0;
import fb7.d;
import fb7.d0;
import fb7.f;
import fb7.g;
import fb7.i;
import fb7.t;
import ix0.m1;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/screens/hidden_accounts_list/HiddenAccountsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfb7/t;", "Ldli/a;", "Lfb7/d0;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HiddenAccountsListScreen extends ViewController<t> implements a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(HiddenAccountsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final CellDetailsDelegate L;
    public final ListSubheaderDelegate M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final SelectableDelegate P;
    public final SwipeToActionDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final int U;
    public final Object V;

    public HiddenAccountsListScreen(HiddenAccountsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new CellDetailsDelegate();
        this.M = new ListSubheaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new FullScreenStateDelegate();
        this.P = new SelectableDelegate(rowDelegate);
        this.Q = new SwipeToActionDelegate(rowDelegate, false);
        this.R = w.y0(new f2i.b(25));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: fb7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenAccountsListScreen f133465b;

            {
                this.f133465b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = HiddenAccountsListScreen.W;
                        ta7.j jVar = (ta7.j) this.f133465b.T.getValue();
                        switch (jVar.f269136a) {
                            case 0:
                                return (b0) jVar.d.get();
                            default:
                                return (b0) jVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = HiddenAccountsListScreen.W;
                        HiddenAccountsListScreen hiddenAccountsListScreen = this.f133465b;
                        return dli.f.a(hiddenAccountsListScreen, hiddenAccountsListScreen.d(), zhm.v.k(hiddenAccountsListScreen.L, hiddenAccountsListScreen.O, hiddenAccountsListScreen.P, hiddenAccountsListScreen.M, hiddenAccountsListScreen.N, new RowLoadingDelegate(), hiddenAccountsListScreen.Q), 0, null, null, null, 60);
                }
            }
        });
        this.T = w.y0(new j(this, inputData, 1));
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: fb7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenAccountsListScreen f133465b;

            {
                this.f133465b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HiddenAccountsListScreen.W;
                        ta7.j jVar = (ta7.j) this.f133465b.T.getValue();
                        switch (jVar.f269136a) {
                            case 0:
                                return (b0) jVar.d.get();
                            default:
                                return (b0) jVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = HiddenAccountsListScreen.W;
                        HiddenAccountsListScreen hiddenAccountsListScreen = this.f133465b;
                        return dli.f.a(hiddenAccountsListScreen, hiddenAccountsListScreen.d(), zhm.v.k(hiddenAccountsListScreen.L, hiddenAccountsListScreen.O, hiddenAccountsListScreen.P, hiddenAccountsListScreen.M, hiddenAccountsListScreen.N, new RowLoadingDelegate(), hiddenAccountsListScreen.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d0 uiState = (d0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TextLocalisedClause textLocalisedClause = uiState.f133469b;
        if (qVar instanceof c0) {
            ScreenContentRecyclerView recyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            m1.a(recyclerView);
        }
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Clause clause = uiState.f133471g;
        boolean z = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(uiState.f133470c);
        if (z) {
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        } else {
            navBarWithToolbar.setSecondDescriptionVisible(false);
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        }
        if (!z) {
            d3().f174564b.setVisibility(8);
            return;
        }
        d3().f174564b.setVisibility(0);
        d3().f174564b.setText(uiState.e);
        d3().f174564b.setEnabled(uiState.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ta7.j) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().d.setItemAnimator((DefaultItemAnimator) this.R.getValue());
        d3().f174564b.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new d(this, continuation, 0), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.O;
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), new fb7.e(this, null), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.d), new d(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.P.r()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f), new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f), null, new fb7.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, i), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b0 d() {
        return (b0) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
