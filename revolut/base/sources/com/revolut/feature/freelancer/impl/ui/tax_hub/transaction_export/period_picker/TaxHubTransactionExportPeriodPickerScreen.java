package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt6.y;
import bt6.z;
import cli.o;
import com.revolut.core.ui_kit.delegates.DoublePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import n47.k;
import n47.l;
import n47.m;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ln47/k;", "Ltki/c;", "Ln47/o;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubTransactionExportPeriodPickerScreen extends ViewController<k> implements tki.c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TaxHubTransactionExportPeriodPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final DoublePickerDelegate M = new DoublePickerDelegate();
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final InputTextDelegate O = new InputTextDelegate(null);
    public final PickerDelegate P = new PickerDelegate();
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public TaxHubTransactionExportPeriodPickerScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: n47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportPeriodPickerScreen f212311b;

            {
                this.f212311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen = this.f212311b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportPeriodPickerScreen.T;
                        qji.b bVarU2 = taxHubTransactionExportPeriodPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.di.TaxHubTransactionExportPeriodPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        return new z(yVar.f18397b, yVar.f18398c);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportPeriodPickerScreen.T;
                        return (l) ((z) taxHubTransactionExportPeriodPickerScreen.Q.getValue()).f18400b.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportPeriodPickerScreen.T;
                        TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen2 = this.f212311b;
                        return tki.g.a(taxHubTransactionExportPeriodPickerScreen2, taxHubTransactionExportPeriodPickerScreen2.R2(), v.k(taxHubTransactionExportPeriodPickerScreen2.M, taxHubTransactionExportPeriodPickerScreen2.N, taxHubTransactionExportPeriodPickerScreen2.O, taxHubTransactionExportPeriodPickerScreen2.P, new PlainTextLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: n47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportPeriodPickerScreen f212311b;

            {
                this.f212311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen = this.f212311b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportPeriodPickerScreen.T;
                        qji.b bVarU2 = taxHubTransactionExportPeriodPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.di.TaxHubTransactionExportPeriodPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        return new z(yVar.f18397b, yVar.f18398c);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportPeriodPickerScreen.T;
                        return (l) ((z) taxHubTransactionExportPeriodPickerScreen.Q.getValue()).f18400b.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportPeriodPickerScreen.T;
                        TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen2 = this.f212311b;
                        return tki.g.a(taxHubTransactionExportPeriodPickerScreen2, taxHubTransactionExportPeriodPickerScreen2.R2(), v.k(taxHubTransactionExportPeriodPickerScreen2.M, taxHubTransactionExportPeriodPickerScreen2.N, taxHubTransactionExportPeriodPickerScreen2.O, taxHubTransactionExportPeriodPickerScreen2.P, new PlainTextLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: n47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportPeriodPickerScreen f212311b;

            {
                this.f212311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen = this.f212311b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportPeriodPickerScreen.T;
                        qji.b bVarU2 = taxHubTransactionExportPeriodPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.di.TaxHubTransactionExportPeriodPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        return new z(yVar.f18397b, yVar.f18398c);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportPeriodPickerScreen.T;
                        return (l) ((z) taxHubTransactionExportPeriodPickerScreen.Q.getValue()).f18400b.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportPeriodPickerScreen.T;
                        TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen2 = this.f212311b;
                        return tki.g.a(taxHubTransactionExportPeriodPickerScreen2, taxHubTransactionExportPeriodPickerScreen2.R2(), v.k(taxHubTransactionExportPeriodPickerScreen2.M, taxHubTransactionExportPeriodPickerScreen2.N, taxHubTransactionExportPeriodPickerScreen2.O, taxHubTransactionExportPeriodPickerScreen2.P, new PlainTextLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n47.o uiState = (n47.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f212324a.f212322a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174564b;
        m mVar = uiState.f212325b;
        largeActionButton.setText(mVar.f212320a);
        largeActionButton.setEnabled(mVar.f212321b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174565c.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new n47.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new n47.b(this, null, 1), 3);
        DoublePickerDelegate doublePickerDelegate = this.M;
        ViewController.P2(this, rd0.e.b(doublePickerDelegate.f52193c), new n47.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(doublePickerDelegate.d), new n47.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new n47.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52575g.f121375b), new n47.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52922c), new n47.c(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
