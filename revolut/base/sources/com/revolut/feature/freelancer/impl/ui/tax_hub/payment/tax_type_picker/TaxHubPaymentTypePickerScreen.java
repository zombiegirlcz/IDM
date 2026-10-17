package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt6.n;
import bt6.p;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.TaxHubPaymentTypePickerScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import r37.f;
import r37.g;
import r37.i;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/tax_type_picker/TaxHubPaymentTypePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr37/f;", "Ltki/c;", "Lr37/i;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubPaymentTypePickerScreen extends ViewController<f> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TaxHubPaymentTypePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TaxHubPaymentTypePickerScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: r37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentTypePickerScreen f251191b;

            {
                this.f251191b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubPaymentTypePickerScreen taxHubPaymentTypePickerScreen = this.f251191b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubPaymentTypePickerScreen.R;
                        qji.b bVarU2 = taxHubPaymentTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.di.TaxHubPaymentTypePickerScreenInjector");
                        bt6.b bVar = ((n) bVarU2).f18367b;
                        p pVar = new p();
                        pVar.f18372a = e4m.b.b(new bt6.c(bVar, pVar));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubPaymentTypePickerScreen.R;
                        return (g) ((p) taxHubPaymentTypePickerScreen.O.getValue()).f18372a.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubPaymentTypePickerScreen.R;
                        TaxHubPaymentTypePickerScreen taxHubPaymentTypePickerScreen2 = this.f251191b;
                        return tki.g.a(taxHubPaymentTypePickerScreen2, (g) taxHubPaymentTypePickerScreen2.P.getValue(), v.k(taxHubPaymentTypePickerScreen2.M, taxHubPaymentTypePickerScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: r37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentTypePickerScreen f251191b;

            {
                this.f251191b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubPaymentTypePickerScreen taxHubPaymentTypePickerScreen = this.f251191b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubPaymentTypePickerScreen.R;
                        qji.b bVarU2 = taxHubPaymentTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.di.TaxHubPaymentTypePickerScreenInjector");
                        bt6.b bVar = ((n) bVarU2).f18367b;
                        p pVar = new p();
                        pVar.f18372a = e4m.b.b(new bt6.c(bVar, pVar));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubPaymentTypePickerScreen.R;
                        return (g) ((p) taxHubPaymentTypePickerScreen.O.getValue()).f18372a.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubPaymentTypePickerScreen.R;
                        TaxHubPaymentTypePickerScreen taxHubPaymentTypePickerScreen2 = this.f251191b;
                        return tki.g.a(taxHubPaymentTypePickerScreen2, (g) taxHubPaymentTypePickerScreen2.P.getValue(), v.k(taxHubPaymentTypePickerScreen2.M, taxHubPaymentTypePickerScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: r37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentTypePickerScreen f251191b;

            {
                this.f251191b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxHubPaymentTypePickerScreen taxHubPaymentTypePickerScreen = this.f251191b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubPaymentTypePickerScreen.R;
                        qji.b bVarU2 = taxHubPaymentTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.di.TaxHubPaymentTypePickerScreenInjector");
                        bt6.b bVar = ((n) bVarU2).f18367b;
                        p pVar = new p();
                        pVar.f18372a = e4m.b.b(new bt6.c(bVar, pVar));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubPaymentTypePickerScreen.R;
                        return (g) ((p) taxHubPaymentTypePickerScreen.O.getValue()).f18372a.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubPaymentTypePickerScreen.R;
                        TaxHubPaymentTypePickerScreen taxHubPaymentTypePickerScreen2 = this.f251191b;
                        return tki.g.a(taxHubPaymentTypePickerScreen2, (g) taxHubPaymentTypePickerScreen2.P.getValue(), v.k(taxHubPaymentTypePickerScreen2.M, taxHubPaymentTypePickerScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        r37.h hVar = uiState.f251198a;
        TextLocalisedClause textLocalisedClause = hVar.f251196a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(hVar.f251197b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174539b.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new r0e.c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new r37.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new r37.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
