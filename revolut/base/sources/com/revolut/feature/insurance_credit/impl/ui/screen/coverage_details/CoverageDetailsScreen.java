package com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt7.f;
import bt7.j;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import qt7.b;
import qt7.c;
import qt7.d;
import qt7.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/screen/coverage_details/CoverageDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqt7/g;", "Lno/m;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoverageDetailsScreen extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CoverageDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CoverageDetailsScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final RowDelegate N;
    public final CellDetailsDelegate O;
    public final PlainTextDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public CoverageDetailsScreen(CoverageDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = new RowDelegate(null, null, 7);
        this.O = new CellDetailsDelegate();
        this.P = new PlainTextDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: qt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageDetailsScreen f249007b;

            {
                this.f249007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CoverageDetailsScreen coverageDetailsScreen = this.f249007b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageDetailsScreen.U;
                        CoverageDetailsScreen coverageDetailsScreen2 = this.f249007b;
                        return dli.f.a(coverageDetailsScreen2, coverageDetailsScreen2.R2(), v.k(coverageDetailsScreen2.N, coverageDetailsScreen2.O, coverageDetailsScreen2.P, new ListCellDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageDetailsScreen.U;
                        qji.b bVarU2 = coverageDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.di.CoverageDetailsScreenInjector");
                        j jVar = (j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        j jVar2 = jVar.f18443c;
                        CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = coverageDetailsScreen.K;
                        coverageDetailsScreenContract$InputData.getClass();
                        return new bt7.f(iVar, jVar2, coverageDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageDetailsScreen.U;
                        return (f) ((bt7.f) coverageDetailsScreen.S.getValue()).f18418c.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: qt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageDetailsScreen f249007b;

            {
                this.f249007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CoverageDetailsScreen coverageDetailsScreen = this.f249007b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageDetailsScreen.U;
                        CoverageDetailsScreen coverageDetailsScreen2 = this.f249007b;
                        return dli.f.a(coverageDetailsScreen2, coverageDetailsScreen2.R2(), v.k(coverageDetailsScreen2.N, coverageDetailsScreen2.O, coverageDetailsScreen2.P, new ListCellDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageDetailsScreen.U;
                        qji.b bVarU2 = coverageDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.di.CoverageDetailsScreenInjector");
                        j jVar = (j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        j jVar2 = jVar.f18443c;
                        CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = coverageDetailsScreen.K;
                        coverageDetailsScreenContract$InputData.getClass();
                        return new bt7.f(iVar, jVar2, coverageDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageDetailsScreen.U;
                        return (f) ((bt7.f) coverageDetailsScreen.S.getValue()).f18418c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: qt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageDetailsScreen f249007b;

            {
                this.f249007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CoverageDetailsScreen coverageDetailsScreen = this.f249007b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageDetailsScreen.U;
                        CoverageDetailsScreen coverageDetailsScreen2 = this.f249007b;
                        return dli.f.a(coverageDetailsScreen2, coverageDetailsScreen2.R2(), v.k(coverageDetailsScreen2.N, coverageDetailsScreen2.O, coverageDetailsScreen2.P, new ListCellDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageDetailsScreen.U;
                        qji.b bVarU2 = coverageDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.di.CoverageDetailsScreenInjector");
                        j jVar = (j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        j jVar2 = jVar.f18443c;
                        CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = coverageDetailsScreen.K;
                        coverageDetailsScreenContract$InputData.getClass();
                        return new bt7.f(iVar, jVar2, coverageDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageDetailsScreen.U;
                        return (f) ((bt7.f) coverageDetailsScreen.S.getValue()).f18418c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f249008a;
        Clause clause = uiState.f249010c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause2 = uiState.f249009b;
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(clause == null ? 8 : 0);
        largeActionButton.setText(clause);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setItemAnimator(null);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.e), new qt7.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new qp7.g(this, continuation, 6), 3);
    }

    public final u d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final qt7.f R2() {
        return (qt7.f) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
