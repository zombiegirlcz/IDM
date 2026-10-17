package com.revolut.feature.tax_residency.impl.v2.ui.exemption;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.tax_residency.impl.v2.ui.exemption.TaxExemptionScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.exemption.TaxExemptionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import dli.a;
import efm.r;
import ine.k;
import ine.o;
import ine.p;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rpe.b;
import rpe.d;
import rpe.e;
import rpe.g;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/exemption/TaxExemptionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrpe/d;", "Ldli/a;", "Lrpe/e;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxExemptionScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TaxExemptionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TaxExemptionScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final RowDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TaxExemptionScreen(TaxExemptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: rpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxExemptionScreen f256377b;

            {
                this.f256377b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxExemptionScreen taxExemptionScreen = this.f256377b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxExemptionScreen.S;
                        TaxExemptionScreen taxExemptionScreen2 = this.f256377b;
                        return dli.f.a(taxExemptionScreen2, (g) taxExemptionScreen2.R.getValue(), u.c(taxExemptionScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxExemptionScreen.S;
                        qji.b bVarU2 = taxExemptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.exemption.di.TaxExemptionScreenInjector");
                        p pVar = (p) bVarU2;
                        o oVar = pVar.f162893b;
                        p pVar2 = pVar.f162894c;
                        TaxExemptionScreenContract$InputData taxExemptionScreenContract$InputData = taxExemptionScreen.K;
                        taxExemptionScreenContract$InputData.getClass();
                        return new k(oVar, pVar2, taxExemptionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TaxExemptionScreen.S;
                        return (g) ((k) taxExemptionScreen.Q.getValue()).f162866b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxExemptionScreen f256377b;

            {
                this.f256377b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxExemptionScreen taxExemptionScreen = this.f256377b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxExemptionScreen.S;
                        TaxExemptionScreen taxExemptionScreen2 = this.f256377b;
                        return dli.f.a(taxExemptionScreen2, (g) taxExemptionScreen2.R.getValue(), u.c(taxExemptionScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxExemptionScreen.S;
                        qji.b bVarU2 = taxExemptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.exemption.di.TaxExemptionScreenInjector");
                        p pVar = (p) bVarU2;
                        o oVar = pVar.f162893b;
                        p pVar2 = pVar.f162894c;
                        TaxExemptionScreenContract$InputData taxExemptionScreenContract$InputData = taxExemptionScreen.K;
                        taxExemptionScreenContract$InputData.getClass();
                        return new k(oVar, pVar2, taxExemptionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TaxExemptionScreen.S;
                        return (g) ((k) taxExemptionScreen.Q.getValue()).f162866b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: rpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxExemptionScreen f256377b;

            {
                this.f256377b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxExemptionScreen taxExemptionScreen = this.f256377b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxExemptionScreen.S;
                        TaxExemptionScreen taxExemptionScreen2 = this.f256377b;
                        return dli.f.a(taxExemptionScreen2, (g) taxExemptionScreen2.R.getValue(), u.c(taxExemptionScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxExemptionScreen.S;
                        qji.b bVarU2 = taxExemptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.exemption.di.TaxExemptionScreenInjector");
                        p pVar = (p) bVarU2;
                        o oVar = pVar.f162893b;
                        p pVar2 = pVar.f162894c;
                        TaxExemptionScreenContract$InputData taxExemptionScreenContract$InputData = taxExemptionScreen.K;
                        taxExemptionScreenContract$InputData.getClass();
                        return new k(oVar, pVar2, taxExemptionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TaxExemptionScreen.S;
                        return (g) ((k) taxExemptionScreen.Q.getValue()).f162866b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f256380b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f256381c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TaxExemptionScreenContract$InputData taxExemptionScreenContract$InputData = this.K;
        if (c.G(taxExemptionScreenContract$InputData.e)) {
            navBarWithToolbar.setNavigationButtonIcon(c.Q(taxExemptionScreenContract$InputData.e));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        if (c.G(this.K.e)) {
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new rlh.c(this, continuation, 9), 3);
        }
        RowDelegate rowDelegate = this.O;
        r rVarMergeArray = r.mergeArray(rowDelegate.f53218h, rowDelegate.f53220l, rowDelegate.k);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new rpe.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
