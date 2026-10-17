package com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries;

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
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.CrossBorderCountryDepartmentsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import ho6.b;
import ho6.d;
import ho6.g;
import ho6.i;
import ho6.j;
import ho6.l;
import ho6.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.h1;
import xf6.i1;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/screen/cross_border/countries/CrossBorderCountryDepartmentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lho6/j;", "Ldli/a;", "Lho6/m;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrossBorderCountryDepartmentsScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CrossBorderCountryDepartmentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final i K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public CrossBorderCountryDepartmentsScreen(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ho6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderCountryDepartmentsScreen f154225b;

            {
                this.f154225b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen = this.f154225b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderCountryDepartmentsScreen.S;
                        qji.b bVarU2 = crossBorderCountryDepartmentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.di.CrossBorderCountryDepartmentsScreenComponent.Injector");
                        h1 h1Var = (h1) ((io6.a) bVarU2).q().mo3808a(crossBorderCountryDepartmentsScreen);
                        i iVar = crossBorderCountryDepartmentsScreen.K;
                        switch (h1Var.f304873a) {
                            case 0:
                                iVar.getClass();
                                h1Var.d = iVar;
                                break;
                            default:
                                iVar.getClass();
                                h1Var.d = iVar;
                                break;
                        }
                        return (i1) h1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderCountryDepartmentsScreen.S;
                        i1 i1Var = (i1) crossBorderCountryDepartmentsScreen.N.getValue();
                        switch (i1Var.f304886a) {
                            case 0:
                                return (l) i1Var.d.get();
                            default:
                                return (l) i1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderCountryDepartmentsScreen.S;
                        CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen2 = this.f154225b;
                        return dli.f.a(crossBorderCountryDepartmentsScreen2, crossBorderCountryDepartmentsScreen2.d(), v.k(crossBorderCountryDepartmentsScreen2.P, new RowLoadingDelegate(), crossBorderCountryDepartmentsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ho6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderCountryDepartmentsScreen f154225b;

            {
                this.f154225b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen = this.f154225b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderCountryDepartmentsScreen.S;
                        qji.b bVarU2 = crossBorderCountryDepartmentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.di.CrossBorderCountryDepartmentsScreenComponent.Injector");
                        h1 h1Var = (h1) ((io6.a) bVarU2).q().mo3808a(crossBorderCountryDepartmentsScreen);
                        i iVar = crossBorderCountryDepartmentsScreen.K;
                        switch (h1Var.f304873a) {
                            case 0:
                                iVar.getClass();
                                h1Var.d = iVar;
                                break;
                            default:
                                iVar.getClass();
                                h1Var.d = iVar;
                                break;
                        }
                        return (i1) h1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderCountryDepartmentsScreen.S;
                        i1 i1Var = (i1) crossBorderCountryDepartmentsScreen.N.getValue();
                        switch (i1Var.f304886a) {
                            case 0:
                                return (l) i1Var.d.get();
                            default:
                                return (l) i1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderCountryDepartmentsScreen.S;
                        CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen2 = this.f154225b;
                        return dli.f.a(crossBorderCountryDepartmentsScreen2, crossBorderCountryDepartmentsScreen2.d(), v.k(crossBorderCountryDepartmentsScreen2.P, new RowLoadingDelegate(), crossBorderCountryDepartmentsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ho6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderCountryDepartmentsScreen f154225b;

            {
                this.f154225b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen = this.f154225b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CrossBorderCountryDepartmentsScreen.S;
                        qji.b bVarU2 = crossBorderCountryDepartmentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.di.CrossBorderCountryDepartmentsScreenComponent.Injector");
                        h1 h1Var = (h1) ((io6.a) bVarU2).q().mo3808a(crossBorderCountryDepartmentsScreen);
                        i iVar = crossBorderCountryDepartmentsScreen.K;
                        switch (h1Var.f304873a) {
                            case 0:
                                iVar.getClass();
                                h1Var.d = iVar;
                                break;
                            default:
                                iVar.getClass();
                                h1Var.d = iVar;
                                break;
                        }
                        return (i1) h1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CrossBorderCountryDepartmentsScreen.S;
                        i1 i1Var = (i1) crossBorderCountryDepartmentsScreen.N.getValue();
                        switch (i1Var.f304886a) {
                            case 0:
                                return (l) i1Var.d.get();
                            default:
                                return (l) i1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CrossBorderCountryDepartmentsScreen.S;
                        CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen2 = this.f154225b;
                        return dli.f.a(crossBorderCountryDepartmentsScreen2, crossBorderCountryDepartmentsScreen2.d(), v.k(crossBorderCountryDepartmentsScreen2.P, new RowLoadingDelegate(), crossBorderCountryDepartmentsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i1) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.external_institutions_cross_border_country_selection_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.external_institutions_cross_border_country_selection_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new hbg.h(this, null, 17), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new f(navBarWithToolbar, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new g(this, null), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, new h23.b(rd0.e.b(rowDelegate.f53218h), 26), new d(this, null, 0), 3);
        ViewController.P2(this, new h23.b(rd0.e.b(rowDelegate.f53218h), 27), new ho6.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
