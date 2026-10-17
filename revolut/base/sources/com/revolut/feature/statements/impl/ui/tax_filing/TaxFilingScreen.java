package com.revolut.feature.statements.impl.ui.tax_filing;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreen;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import eyd.b0;
import eyd.e0;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sy6.j;
import t0e.b;
import t0e.c;
import t0e.d;
import t0e.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/tax_filing/TaxFilingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lt0e/h;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxFilingScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TaxFilingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TaxFilingScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final PlainTextWarningDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;

    public TaxFilingScreen(TaxFilingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = new PlainTextWarningDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: t0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxFilingScreen f267004b;

            {
                this.f267004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxFilingScreen taxFilingScreen = this.f267004b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxFilingScreen.T;
                        TaxFilingScreen taxFilingScreen2 = this.f267004b;
                        return dli.f.a(taxFilingScreen2, taxFilingScreen2.d(), v.k(taxFilingScreen2.M, taxFilingScreen2.N, taxFilingScreen2.O, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxFilingScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(taxFilingScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.tax_filing.di.TaxFilingScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        TaxFilingScreenContract$InputData taxFilingScreenContract$InputData = taxFilingScreen.K;
                        taxFilingScreenContract$InputData.getClass();
                        return new e0(b0Var, taxFilingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TaxFilingScreen.T;
                        return (g) ((e0) taxFilingScreen.Q.getValue()).f130734c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: t0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxFilingScreen f267004b;

            {
                this.f267004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxFilingScreen taxFilingScreen = this.f267004b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxFilingScreen.T;
                        TaxFilingScreen taxFilingScreen2 = this.f267004b;
                        return dli.f.a(taxFilingScreen2, taxFilingScreen2.d(), v.k(taxFilingScreen2.M, taxFilingScreen2.N, taxFilingScreen2.O, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxFilingScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(taxFilingScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.tax_filing.di.TaxFilingScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        TaxFilingScreenContract$InputData taxFilingScreenContract$InputData = taxFilingScreen.K;
                        taxFilingScreenContract$InputData.getClass();
                        return new e0(b0Var, taxFilingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TaxFilingScreen.T;
                        return (g) ((e0) taxFilingScreen.Q.getValue()).f130734c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: t0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxFilingScreen f267004b;

            {
                this.f267004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxFilingScreen taxFilingScreen = this.f267004b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxFilingScreen.T;
                        TaxFilingScreen taxFilingScreen2 = this.f267004b;
                        return dli.f.a(taxFilingScreen2, taxFilingScreen2.d(), v.k(taxFilingScreen2.M, taxFilingScreen2.N, taxFilingScreen2.O, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxFilingScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(taxFilingScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.tax_filing.di.TaxFilingScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        TaxFilingScreenContract$InputData taxFilingScreenContract$InputData = taxFilingScreen.K;
                        taxFilingScreenContract$InputData.getClass();
                        return new e0(b0Var, taxFilingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TaxFilingScreen.T;
                        return (g) ((e0) taxFilingScreen.Q.getValue()).f130734c.get();
                }
            }
        });
        this.S = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((t0e.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.statements_group_tax_filing_title, u.c(new CountryClause(this.K.f88394a, null)), null, 12);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new t05.m(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, rd0.e.b(rowDelegate.k), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new t0e.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.s()), new j(this, continuation, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
