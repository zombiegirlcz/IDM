package com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bl6.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.CrossBorderBranchesScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import ff4.z;
import fo6.b;
import fo6.d;
import fo6.g;
import fo6.j;
import fo6.k;
import fo6.n;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.f1;
import xf6.g1;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/screen/cross_border/branches/CrossBorderBranchesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfo6/k;", "Ldli/a;", "Lfo6/n;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrossBorderBranchesScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CrossBorderBranchesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final j K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public CrossBorderBranchesScreen(j inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fo6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderBranchesScreen f136822b;

            {
                this.f136822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CrossBorderBranchesScreen crossBorderBranchesScreen = this.f136822b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderBranchesScreen.S;
                        qji.b bVarU2 = crossBorderBranchesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.di.CrossBorderBranchesScreenComponent.Injector");
                        f1 f1Var = (f1) ((go6.a) bVarU2).j().mo3808a(crossBorderBranchesScreen);
                        j jVar = crossBorderBranchesScreen.K;
                        switch (f1Var.f304847a) {
                            case 0:
                                jVar.getClass();
                                f1Var.d = jVar;
                                break;
                            default:
                                jVar.getClass();
                                f1Var.d = jVar;
                                break;
                        }
                        return (g1) f1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderBranchesScreen.S;
                        g1 g1Var = (g1) crossBorderBranchesScreen.N.getValue();
                        switch (g1Var.f304859a) {
                            case 0:
                                return (m) g1Var.d.get();
                            default:
                                return (m) g1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderBranchesScreen.S;
                        CrossBorderBranchesScreen crossBorderBranchesScreen2 = this.f136822b;
                        return dli.f.a(crossBorderBranchesScreen2, crossBorderBranchesScreen2.d(), v.k(crossBorderBranchesScreen2.P, new RowLoadingDelegate(), crossBorderBranchesScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fo6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderBranchesScreen f136822b;

            {
                this.f136822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CrossBorderBranchesScreen crossBorderBranchesScreen = this.f136822b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderBranchesScreen.S;
                        qji.b bVarU2 = crossBorderBranchesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.di.CrossBorderBranchesScreenComponent.Injector");
                        f1 f1Var = (f1) ((go6.a) bVarU2).j().mo3808a(crossBorderBranchesScreen);
                        j jVar = crossBorderBranchesScreen.K;
                        switch (f1Var.f304847a) {
                            case 0:
                                jVar.getClass();
                                f1Var.d = jVar;
                                break;
                            default:
                                jVar.getClass();
                                f1Var.d = jVar;
                                break;
                        }
                        return (g1) f1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderBranchesScreen.S;
                        g1 g1Var = (g1) crossBorderBranchesScreen.N.getValue();
                        switch (g1Var.f304859a) {
                            case 0:
                                return (m) g1Var.d.get();
                            default:
                                return (m) g1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderBranchesScreen.S;
                        CrossBorderBranchesScreen crossBorderBranchesScreen2 = this.f136822b;
                        return dli.f.a(crossBorderBranchesScreen2, crossBorderBranchesScreen2.d(), v.k(crossBorderBranchesScreen2.P, new RowLoadingDelegate(), crossBorderBranchesScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: fo6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderBranchesScreen f136822b;

            {
                this.f136822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CrossBorderBranchesScreen crossBorderBranchesScreen = this.f136822b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderBranchesScreen.S;
                        qji.b bVarU2 = crossBorderBranchesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.di.CrossBorderBranchesScreenComponent.Injector");
                        f1 f1Var = (f1) ((go6.a) bVarU2).j().mo3808a(crossBorderBranchesScreen);
                        j jVar = crossBorderBranchesScreen.K;
                        switch (f1Var.f304847a) {
                            case 0:
                                jVar.getClass();
                                f1Var.d = jVar;
                                break;
                            default:
                                jVar.getClass();
                                f1Var.d = jVar;
                                break;
                        }
                        return (g1) f1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderBranchesScreen.S;
                        g1 g1Var = (g1) crossBorderBranchesScreen.N.getValue();
                        switch (g1Var.f304859a) {
                            case 0:
                                return (m) g1Var.d.get();
                            default:
                                return (m) g1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderBranchesScreen.S;
                        CrossBorderBranchesScreen crossBorderBranchesScreen2 = this.f136822b;
                        return dli.f.a(crossBorderBranchesScreen2, crossBorderBranchesScreen2.d(), v.k(crossBorderBranchesScreen2.P, new RowLoadingDelegate(), crossBorderBranchesScreen2.Q), R$id.recyclerView, null, null, null, 56);
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
        return (g1) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.external_institutions_cross_border_branch_selection_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.external_institutions_cross_border_branch_selection_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new z(this, null, 20), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new fo6.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new f(navBarWithToolbar, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new fo6.h(this, null), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, new d(rd0.e.b(rowDelegate.f53218h), 0), new fo6.e(this, null, 0), 3);
        ViewController.P2(this, new d(rd0.e.b(rowDelegate.f53218h), 1), new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final fo6.m d() {
        return (fo6.m) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
