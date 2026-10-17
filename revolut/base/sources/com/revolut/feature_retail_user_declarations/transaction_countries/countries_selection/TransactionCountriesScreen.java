package com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.CountriesSelectionScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.TransactionCountriesScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.c;
import h30.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jii.u;
import knm.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c9;
import no.m;
import oai.g0;
import oai.i0;
import qci.f;
import qci.g;
import qci.n;
import qci.p;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yhm.j;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/transaction_countries/countries_selection/TransactionCountriesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqci/f;", "Ldli/a;", "Lqci/h;", "Lno/m;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionCountriesScreen extends ViewController<f> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TransactionCountriesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CountriesSelectionScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final SelectableDelegate N;
    public final ListSubheaderDelegate O;
    public final FullScreenStateDelegate P;
    public final Lazy Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public TransactionCountriesScreen(CountriesSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new SelectableDelegate(rowDelegate);
        this.O = new ListSubheaderDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = j.b(new Function0(this) { // from class: qci.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCountriesScreen f244806b;

            {
                this.f244806b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionCountriesScreen transactionCountriesScreen = this.f244806b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionCountriesScreen.V;
                        qji.c cVarZ2 = transactionCountriesScreen.z2();
                        no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionCountriesScreen.V;
                        TransactionCountriesScreen transactionCountriesScreen2 = this.f244806b;
                        return dli.f.a(transactionCountriesScreen2, transactionCountriesScreen2.R2(), v.k(transactionCountriesScreen2.M, transactionCountriesScreen2.N, transactionCountriesScreen2.O, transactionCountriesScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionCountriesScreen.V;
                        qji.b bVarU2 = transactionCountriesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.di.CountriesSelectionScreenInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData = transactionCountriesScreen.K;
                        countriesSelectionScreenContract$InputData.getClass();
                        return new oai.f(i0Var, g0Var2, countriesSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = TransactionCountriesScreen.V;
                        return (g) ((oai.f) transactionCountriesScreen.T.getValue()).f223681c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: qci.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCountriesScreen f244806b;

            {
                this.f244806b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionCountriesScreen transactionCountriesScreen = this.f244806b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionCountriesScreen.V;
                        qji.c cVarZ2 = transactionCountriesScreen.z2();
                        no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionCountriesScreen.V;
                        TransactionCountriesScreen transactionCountriesScreen2 = this.f244806b;
                        return dli.f.a(transactionCountriesScreen2, transactionCountriesScreen2.R2(), v.k(transactionCountriesScreen2.M, transactionCountriesScreen2.N, transactionCountriesScreen2.O, transactionCountriesScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionCountriesScreen.V;
                        qji.b bVarU2 = transactionCountriesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.di.CountriesSelectionScreenInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData = transactionCountriesScreen.K;
                        countriesSelectionScreenContract$InputData.getClass();
                        return new oai.f(i0Var, g0Var2, countriesSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = TransactionCountriesScreen.V;
                        return (g) ((oai.f) transactionCountriesScreen.T.getValue()).f223681c.get();
                }
            }
        });
        this.S = s.t(this, n.f);
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: qci.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCountriesScreen f244806b;

            {
                this.f244806b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransactionCountriesScreen transactionCountriesScreen = this.f244806b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionCountriesScreen.V;
                        qji.c cVarZ2 = transactionCountriesScreen.z2();
                        no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionCountriesScreen.V;
                        TransactionCountriesScreen transactionCountriesScreen2 = this.f244806b;
                        return dli.f.a(transactionCountriesScreen2, transactionCountriesScreen2.R2(), v.k(transactionCountriesScreen2.M, transactionCountriesScreen2.N, transactionCountriesScreen2.O, transactionCountriesScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionCountriesScreen.V;
                        qji.b bVarU2 = transactionCountriesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.di.CountriesSelectionScreenInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData = transactionCountriesScreen.K;
                        countriesSelectionScreenContract$InputData.getClass();
                        return new oai.f(i0Var, g0Var2, countriesSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = TransactionCountriesScreen.V;
                        return (g) ((oai.f) transactionCountriesScreen.T.getValue()).f223681c.get();
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: qci.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCountriesScreen f244806b;

            {
                this.f244806b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TransactionCountriesScreen transactionCountriesScreen = this.f244806b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionCountriesScreen.V;
                        qji.c cVarZ2 = transactionCountriesScreen.z2();
                        no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionCountriesScreen.V;
                        TransactionCountriesScreen transactionCountriesScreen2 = this.f244806b;
                        return dli.f.a(transactionCountriesScreen2, transactionCountriesScreen2.R2(), v.k(transactionCountriesScreen2.M, transactionCountriesScreen2.N, transactionCountriesScreen2.O, transactionCountriesScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionCountriesScreen.V;
                        qji.b bVarU2 = transactionCountriesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.di.CountriesSelectionScreenInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData = transactionCountriesScreen.K;
                        countriesSelectionScreenContract$InputData.getClass();
                        return new oai.f(i0Var, g0Var2, countriesSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = TransactionCountriesScreen.V;
                        return (g) ((oai.f) transactionCountriesScreen.T.getValue()).f223681c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        qci.h uiState = (qci.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        ScreenContentRecyclerView recyclerView = uVarD3.d;
        LargeActionButton goToButton = uVarD3.f174564b;
        navBarWithToolbar.setSearchButtonActive(true);
        NavBarWithToolbar navBarWithToolbar2 = uVarD3.f174565c;
        if (!navBarWithToolbar2.f59421x0 && uiState.d.length() > 0) {
            navBarWithToolbar2.setSearchInput(new TextClause(uiState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            navBarWithToolbar2.K0(j4.NO_ANIMATION);
            navBarWithToolbar2.post(new o6.a(uVarD3, 15));
        }
        TextNavBarMenuItem textNavBarMenuItem = uiState.e;
        boolean z = uiState.f244797c;
        navBarWithToolbar2.setMenuItems(v.l(textNavBarMenuItem));
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(z ? 0 : 8);
        goToButton.setEnabled(uiState.f244796b);
        if (z) {
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            b.v(kli.a.k(context, 92.0f), recyclerView);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return (AnalyticsProduct) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (oai.f) this.T.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((hli.e) view).setFitStatusBar(true);
        u uVarD3 = d3();
        uVarD3.f174564b.o(LargeActionButton.ButtonStyle.f58725a);
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setOnClickListener(new c9(this, 9));
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData = this.K;
        TextClause textClause = new TextClause(countriesSelectionScreenContract$InputData.f97756a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        navBarWithToolbar.setToolbarTitle(textClause);
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setSecondDescriptionText(new TextClause(countriesSelectionScreenContract$InputData.f97757b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(0);
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
        navBarWithToolbar.setTag("COUNTRIES_SELECTION_NAV_BAR_TAG");
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        ScreenContentRecyclerView recyclerView = uVarD3.d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.g(recyclerView, m2());
        if (countriesSelectionScreenContract$InputData.f97758c) {
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u uVarD3 = d3();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(uVarD3.f174565c.o.f57403b), null, new qci.o(this, null, 0), 3);
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        ihm.f fVar = navBarWithToolbar.f59409p.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.y(fVar, 300L)), null, new qci.o(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new q43.m(this, null, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.r()), null, new p(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.U.getValue();
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
