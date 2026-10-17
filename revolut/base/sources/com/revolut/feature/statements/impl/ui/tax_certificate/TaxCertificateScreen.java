package com.revolut.feature.statements.impl.ui.tax_certificate;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.tax_certificate.TaxCertificateScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import eyd.b0;
import eyd.d0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r0e.b;
import r0e.c;
import r0e.d;
import r0e.f;
import r0e.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/tax_certificate/TaxCertificateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lr0e/h;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxCertificateScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TaxCertificateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TaxCertificateScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final h R;

    public TaxCertificateScreen(TaxCertificateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: r0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxCertificateScreen f250772b;

            {
                this.f250772b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                TaxCertificateScreen taxCertificateScreen = this.f250772b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxCertificateScreen.S;
                        TaxCertificateScreen taxCertificateScreen2 = this.f250772b;
                        return dli.f.a(taxCertificateScreen2, (m) taxCertificateScreen2.Q.getValue(), v.k(taxCertificateScreen2.M, taxCertificateScreen2.N, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxCertificateScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(taxCertificateScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.tax_certificate.di.TaxCertificateScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        taxCertificateScreen.K.getClass();
                        d0 d0Var = new d0();
                        int i6 = 7;
                        d0Var.f130727a = e4m.b.b(new eyd.j(b0Var, d0Var, i5, i6));
                        d0Var.f130728b = e4m.b.b(new eyd.j(b0Var, d0Var, i3, i6));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = TaxCertificateScreen.S;
                        return (m) ((d0) taxCertificateScreen.P.getValue()).f130728b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: r0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxCertificateScreen f250772b;

            {
                this.f250772b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                TaxCertificateScreen taxCertificateScreen = this.f250772b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxCertificateScreen.S;
                        TaxCertificateScreen taxCertificateScreen2 = this.f250772b;
                        return dli.f.a(taxCertificateScreen2, (m) taxCertificateScreen2.Q.getValue(), v.k(taxCertificateScreen2.M, taxCertificateScreen2.N, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxCertificateScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(taxCertificateScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.tax_certificate.di.TaxCertificateScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        taxCertificateScreen.K.getClass();
                        d0 d0Var = new d0();
                        int i6 = 7;
                        d0Var.f130727a = e4m.b.b(new eyd.j(b0Var, d0Var, i5, i6));
                        d0Var.f130728b = e4m.b.b(new eyd.j(b0Var, d0Var, i3, i6));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = TaxCertificateScreen.S;
                        return (m) ((d0) taxCertificateScreen.P.getValue()).f130728b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: r0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxCertificateScreen f250772b;

            {
                this.f250772b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                TaxCertificateScreen taxCertificateScreen = this.f250772b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxCertificateScreen.S;
                        TaxCertificateScreen taxCertificateScreen2 = this.f250772b;
                        return dli.f.a(taxCertificateScreen2, (m) taxCertificateScreen2.Q.getValue(), v.k(taxCertificateScreen2.M, taxCertificateScreen2.N, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxCertificateScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(taxCertificateScreen.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.tax_certificate.di.TaxCertificateScreenInjector");
                        b0 b0Var = ((b0) objB).o;
                        taxCertificateScreen.K.getClass();
                        d0 d0Var = new d0();
                        int i6 = 7;
                        d0Var.f130727a = e4m.b.b(new eyd.j(b0Var, d0Var, i5, i6));
                        d0Var.f130728b = e4m.b.b(new eyd.j(b0Var, d0Var, i32, i6));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = TaxCertificateScreen.S;
                        return (m) ((d0) taxCertificateScreen.P.getValue()).f130728b.get();
                }
            }
        });
        this.R = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((r0e.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        wi0.b bVar = this.K.f88392a;
        wi0.b.Companion.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(Intrinsics.f(bVar, wi0.b.Y1) ? R$string.statements_group_tax_certificate_mx_title : R$string.statements_group_tax_certificate_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new d(this, null), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, rd0.e.b(rowDelegate.k), new r0e.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new f(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
