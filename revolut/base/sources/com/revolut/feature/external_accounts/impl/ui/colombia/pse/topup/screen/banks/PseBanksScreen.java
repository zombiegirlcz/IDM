package com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.banks;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import bk6.c;
import bl6.b;
import bl6.d;
import bl6.f;
import bl6.h;
import bl6.j;
import bl6.k;
import bl6.l;
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
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.banks.PseBanksScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.l0;
import xf6.n0;
import xf6.t;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/topup/screen/banks/PseBanksScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbl6/j;", "Ldli/a;", "Lbl6/k;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PseBanksScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PseBanksScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final ao.h O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public PseBanksScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseBanksScreen f16476b;

            {
                this.f16476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PseBanksScreen pseBanksScreen = this.f16476b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PseBanksScreen.S;
                        qji.b bVarU2 = pseBanksScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.banks.di.PseBanksScreenComponent.Injector");
                        n0 n0Var = (n0) bVarU2;
                        t tVar = n0Var.f304957b;
                        n0 n0Var2 = n0Var.f304958c;
                        h hVar = pseBanksScreen.K;
                        hVar.getClass();
                        return new l0(tVar, n0Var2, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PseBanksScreen.S;
                        return (l) ((l0) pseBanksScreen.M.getValue()).f304923b.get();
                    default:
                        KProperty[] kPropertyArr3 = PseBanksScreen.S;
                        PseBanksScreen pseBanksScreen2 = this.f16476b;
                        return dli.f.a(pseBanksScreen2, pseBanksScreen2.d(), v.k(pseBanksScreen2.P, pseBanksScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: bl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseBanksScreen f16476b;

            {
                this.f16476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PseBanksScreen pseBanksScreen = this.f16476b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PseBanksScreen.S;
                        qji.b bVarU2 = pseBanksScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.banks.di.PseBanksScreenComponent.Injector");
                        n0 n0Var = (n0) bVarU2;
                        t tVar = n0Var.f304957b;
                        n0 n0Var2 = n0Var.f304958c;
                        h hVar = pseBanksScreen.K;
                        hVar.getClass();
                        return new l0(tVar, n0Var2, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PseBanksScreen.S;
                        return (l) ((l0) pseBanksScreen.M.getValue()).f304923b.get();
                    default:
                        KProperty[] kPropertyArr3 = PseBanksScreen.S;
                        PseBanksScreen pseBanksScreen2 = this.f16476b;
                        return dli.f.a(pseBanksScreen2, pseBanksScreen2.d(), v.k(pseBanksScreen2.P, pseBanksScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: bl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseBanksScreen f16476b;

            {
                this.f16476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PseBanksScreen pseBanksScreen = this.f16476b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PseBanksScreen.S;
                        qji.b bVarU2 = pseBanksScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.banks.di.PseBanksScreenComponent.Injector");
                        n0 n0Var = (n0) bVarU2;
                        t tVar = n0Var.f304957b;
                        n0 n0Var2 = n0Var.f304958c;
                        h hVar = pseBanksScreen.K;
                        hVar.getClass();
                        return new l0(tVar, n0Var2, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PseBanksScreen.S;
                        return (l) ((l0) pseBanksScreen.M.getValue()).f304923b.get();
                    default:
                        KProperty[] kPropertyArr3 = PseBanksScreen.S;
                        PseBanksScreen pseBanksScreen2 = this.f16476b;
                        return dli.f.a(pseBanksScreen2, pseBanksScreen2.d(), v.k(pseBanksScreen2.P, pseBanksScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.india_core_topup_net_banking_selection_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.india_core_topup_net_banking_selection_subtitle, null, null, 14));
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
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new bf5.a(this, null, 11), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new f(navBarWithToolbar, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new bl6.e(this, null), 3);
        ViewController.P2(this, new c(rd0.e.b(this.P.f53218h), 3), new d(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
