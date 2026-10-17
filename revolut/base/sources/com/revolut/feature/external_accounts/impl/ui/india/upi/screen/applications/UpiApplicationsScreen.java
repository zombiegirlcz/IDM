package com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications.UpiApplicationsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import se4.c;
import sm6.f;
import sm6.i;
import sm6.k;
import sm6.m;
import sm6.n;
import sm6.p;
import te0.w;
import vc.s;
import xf6.p0;
import xf6.t;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/india/upi/screen/applications/UpiApplicationsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsm6/m;", "Ldli/a;", "Lsm6/n;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiApplicationsScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(UpiApplicationsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final k K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public UpiApplicationsScreen(k inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: sm6.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiApplicationsScreen f264365b;

            {
                this.f264365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpiApplicationsScreen upiApplicationsScreen = this.f264365b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpiApplicationsScreen.S;
                        qji.b bVarU2 = upiApplicationsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications.di.UpiApplicationsScreenComponent.Injector");
                        p0 p0Var = (p0) bVarU2;
                        t tVar = p0Var.f304985b;
                        p0 p0Var2 = p0Var.f304986c;
                        k kVar = upiApplicationsScreen.K;
                        kVar.getClass();
                        return new xf6.o0(tVar, p0Var2, kVar);
                    case 1:
                        KProperty[] kPropertyArr2 = UpiApplicationsScreen.S;
                        return (p) ((xf6.o0) upiApplicationsScreen.M.getValue()).f304974c.get();
                    default:
                        KProperty[] kPropertyArr3 = UpiApplicationsScreen.S;
                        UpiApplicationsScreen upiApplicationsScreen2 = this.f264365b;
                        return dli.f.a(upiApplicationsScreen2, upiApplicationsScreen2.R2(), v.k(upiApplicationsScreen2.P, upiApplicationsScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: sm6.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiApplicationsScreen f264365b;

            {
                this.f264365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpiApplicationsScreen upiApplicationsScreen = this.f264365b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiApplicationsScreen.S;
                        qji.b bVarU2 = upiApplicationsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications.di.UpiApplicationsScreenComponent.Injector");
                        p0 p0Var = (p0) bVarU2;
                        t tVar = p0Var.f304985b;
                        p0 p0Var2 = p0Var.f304986c;
                        k kVar = upiApplicationsScreen.K;
                        kVar.getClass();
                        return new xf6.o0(tVar, p0Var2, kVar);
                    case 1:
                        KProperty[] kPropertyArr2 = UpiApplicationsScreen.S;
                        return (p) ((xf6.o0) upiApplicationsScreen.M.getValue()).f304974c.get();
                    default:
                        KProperty[] kPropertyArr3 = UpiApplicationsScreen.S;
                        UpiApplicationsScreen upiApplicationsScreen2 = this.f264365b;
                        return dli.f.a(upiApplicationsScreen2, upiApplicationsScreen2.R2(), v.k(upiApplicationsScreen2.P, upiApplicationsScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, f.f);
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sm6.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiApplicationsScreen f264365b;

            {
                this.f264365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UpiApplicationsScreen upiApplicationsScreen = this.f264365b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiApplicationsScreen.S;
                        qji.b bVarU2 = upiApplicationsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications.di.UpiApplicationsScreenComponent.Injector");
                        p0 p0Var = (p0) bVarU2;
                        t tVar = p0Var.f304985b;
                        p0 p0Var2 = p0Var.f304986c;
                        k kVar = upiApplicationsScreen.K;
                        kVar.getClass();
                        return new xf6.o0(tVar, p0Var2, kVar);
                    case 1:
                        KProperty[] kPropertyArr2 = UpiApplicationsScreen.S;
                        return (p) ((xf6.o0) upiApplicationsScreen.M.getValue()).f304974c.get();
                    default:
                        KProperty[] kPropertyArr3 = UpiApplicationsScreen.S;
                        UpiApplicationsScreen upiApplicationsScreen2 = this.f264365b;
                        return dli.f.a(upiApplicationsScreen2, upiApplicationsScreen2.R2(), v.k(upiApplicationsScreen2.P, upiApplicationsScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (xf6.o0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.india_core_topup_upi_selection_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.india_core_topup_upi_selection_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, continuation, 10), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new sm6.h(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new bl6.f(navBarWithToolbar, null, 7), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, new ryj.w(rd0.e.b(this.P.f53218h), 16), new sm6.h(this, continuation, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
