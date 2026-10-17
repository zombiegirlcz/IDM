package com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bl6.f;
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
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.c;
import jii.m;
import jo6.d;
import jo6.e;
import jo6.j;
import jo6.l;
import jo6.n;
import jo6.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import se6.g;
import te0.w;
import vc.s;
import xf6.j1;
import xf6.k1;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/screen/cross_border/institutions/CrossBorderInstitutionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/screen/cross_border/institutions/a;", "Ldli/a;", "Ljo6/p;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrossBorderInstitutionsScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CrossBorderInstitutionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final l K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public CrossBorderInstitutionsScreen(l inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, e.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jo6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderInstitutionsScreen f176870b;

            {
                this.f176870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CrossBorderInstitutionsScreen crossBorderInstitutionsScreen = this.f176870b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderInstitutionsScreen.S;
                        qji.b bVarU2 = crossBorderInstitutionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.di.CrossBorderInstitutionsScreenComponent.Injector");
                        j1 j1Var = (j1) ((ko6.a) bVarU2).c().mo3808a(crossBorderInstitutionsScreen);
                        l lVar = crossBorderInstitutionsScreen.K;
                        switch (j1Var.f304900a) {
                            case 0:
                                lVar.getClass();
                                j1Var.d = lVar;
                                break;
                            default:
                                lVar.getClass();
                                j1Var.d = lVar;
                                break;
                        }
                        return (k1) j1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderInstitutionsScreen.S;
                        k1 k1Var = (k1) crossBorderInstitutionsScreen.N.getValue();
                        switch (k1Var.f304913a) {
                            case 0:
                                return (n) k1Var.e.get();
                            default:
                                return (n) k1Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderInstitutionsScreen.S;
                        CrossBorderInstitutionsScreen crossBorderInstitutionsScreen2 = this.f176870b;
                        return dli.f.a(crossBorderInstitutionsScreen2, crossBorderInstitutionsScreen2.d(), v.k(crossBorderInstitutionsScreen2.P, new RowLoadingDelegate(), new ListSubheaderDelegate(), crossBorderInstitutionsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jo6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderInstitutionsScreen f176870b;

            {
                this.f176870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CrossBorderInstitutionsScreen crossBorderInstitutionsScreen = this.f176870b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderInstitutionsScreen.S;
                        qji.b bVarU2 = crossBorderInstitutionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.di.CrossBorderInstitutionsScreenComponent.Injector");
                        j1 j1Var = (j1) ((ko6.a) bVarU2).c().mo3808a(crossBorderInstitutionsScreen);
                        l lVar = crossBorderInstitutionsScreen.K;
                        switch (j1Var.f304900a) {
                            case 0:
                                lVar.getClass();
                                j1Var.d = lVar;
                                break;
                            default:
                                lVar.getClass();
                                j1Var.d = lVar;
                                break;
                        }
                        return (k1) j1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderInstitutionsScreen.S;
                        k1 k1Var = (k1) crossBorderInstitutionsScreen.N.getValue();
                        switch (k1Var.f304913a) {
                            case 0:
                                return (n) k1Var.e.get();
                            default:
                                return (n) k1Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderInstitutionsScreen.S;
                        CrossBorderInstitutionsScreen crossBorderInstitutionsScreen2 = this.f176870b;
                        return dli.f.a(crossBorderInstitutionsScreen2, crossBorderInstitutionsScreen2.d(), v.k(crossBorderInstitutionsScreen2.P, new RowLoadingDelegate(), new ListSubheaderDelegate(), crossBorderInstitutionsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: jo6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderInstitutionsScreen f176870b;

            {
                this.f176870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CrossBorderInstitutionsScreen crossBorderInstitutionsScreen = this.f176870b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderInstitutionsScreen.S;
                        qji.b bVarU2 = crossBorderInstitutionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.di.CrossBorderInstitutionsScreenComponent.Injector");
                        j1 j1Var = (j1) ((ko6.a) bVarU2).c().mo3808a(crossBorderInstitutionsScreen);
                        l lVar = crossBorderInstitutionsScreen.K;
                        switch (j1Var.f304900a) {
                            case 0:
                                lVar.getClass();
                                j1Var.d = lVar;
                                break;
                            default:
                                lVar.getClass();
                                j1Var.d = lVar;
                                break;
                        }
                        return (k1) j1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderInstitutionsScreen.S;
                        k1 k1Var = (k1) crossBorderInstitutionsScreen.N.getValue();
                        switch (k1Var.f304913a) {
                            case 0:
                                return (n) k1Var.e.get();
                            default:
                                return (n) k1Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderInstitutionsScreen.S;
                        CrossBorderInstitutionsScreen crossBorderInstitutionsScreen2 = this.f176870b;
                        return dli.f.a(crossBorderInstitutionsScreen2, crossBorderInstitutionsScreen2.d(), v.k(crossBorderInstitutionsScreen2.P, new RowLoadingDelegate(), new ListSubheaderDelegate(), crossBorderInstitutionsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        jo6.o oVar2 = qVar instanceof jo6.o ? (jo6.o) qVar : null;
        if (oVar2 == null || oVar2.f176882a) {
            d3().f174539b.setMenuItems(uiState.f176884b);
        }
        if (oVar2 == null || !oVar2.f176882a) {
            return;
        }
        d3().f174540c.scrollToPosition(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k1) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l lVar = this.K;
        g gVar = lVar.f176879b;
        int[] iArr = d.f176871a;
        int i3 = iArr[gVar.ordinal()];
        if (i3 == 1) {
            i = R$string.external_institutions_cross_border_bank_selection_title;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.external_institutions_selection_linking_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        int i5 = iArr[lVar.f176879b.ordinal()];
        if (i5 == 1) {
            i2 = R$string.external_institutions_cross_border_bank_selection_subtitle;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.external_institutions_selection_linking_subtitle;
        }
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(i2, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new jkc.g(this, continuation, 6), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new jo6.h(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new jo6.h(this, continuation, 2), 3);
        int i = 3;
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new f(navBarWithToolbar, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new jo6.f(this, null), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, new jij.d(rd0.e.b(rowDelegate.f53218h), i), new jo6.h(this, continuation, 0), 3);
        ViewController.P2(this, new jij.d(rd0.e.b(rowDelegate.f53218h), 4), new j(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.O.getValue();
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
