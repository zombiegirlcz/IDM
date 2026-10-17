package com.revolut.feature.shared.invoices.impl.ui.language_selector;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceLanguageSelectorContract$InputData;
import com.revolut.feature.shared.invoices.impl.ui.language_selector.InvoiceLanguageSelectorScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import f9d.c;
import fad.b;
import fad.e;
import fad.f;
import fad.g;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import v9d.a;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/invoices/impl/ui/language_selector/InvoiceLanguageSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv9d/a;", "Ldli/a;", "Lfad/f;", "feature_shared_invoices_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvoiceLanguageSelectorScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InvoiceLanguageSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InvoiceLanguageSelectorContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public InvoiceLanguageSelectorScreen(InvoiceLanguageSelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: fad.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceLanguageSelectorScreen f133276b;

            {
                this.f133276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvoiceLanguageSelectorScreen invoiceLanguageSelectorScreen = this.f133276b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceLanguageSelectorScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceLanguageSelectorScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoiceLanguageSelectorContract$InputData invoiceLanguageSelectorContract$InputData = invoiceLanguageSelectorScreen.K;
                        invoiceLanguageSelectorContract$InputData.getClass();
                        return new cad.a(dVar, invoiceLanguageSelectorScreen, invoiceLanguageSelectorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceLanguageSelectorScreen.R;
                        return (g) ((cad.a) invoiceLanguageSelectorScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceLanguageSelectorScreen.R;
                        InvoiceLanguageSelectorScreen invoiceLanguageSelectorScreen2 = this.f133276b;
                        return dli.f.a(invoiceLanguageSelectorScreen2, (g) invoiceLanguageSelectorScreen2.P.getValue(), u.c(invoiceLanguageSelectorScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fad.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceLanguageSelectorScreen f133276b;

            {
                this.f133276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvoiceLanguageSelectorScreen invoiceLanguageSelectorScreen = this.f133276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceLanguageSelectorScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceLanguageSelectorScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoiceLanguageSelectorContract$InputData invoiceLanguageSelectorContract$InputData = invoiceLanguageSelectorScreen.K;
                        invoiceLanguageSelectorContract$InputData.getClass();
                        return new cad.a(dVar, invoiceLanguageSelectorScreen, invoiceLanguageSelectorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceLanguageSelectorScreen.R;
                        return (g) ((cad.a) invoiceLanguageSelectorScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceLanguageSelectorScreen.R;
                        InvoiceLanguageSelectorScreen invoiceLanguageSelectorScreen2 = this.f133276b;
                        return dli.f.a(invoiceLanguageSelectorScreen2, (g) invoiceLanguageSelectorScreen2.P.getValue(), u.c(invoiceLanguageSelectorScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fad.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceLanguageSelectorScreen f133276b;

            {
                this.f133276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvoiceLanguageSelectorScreen invoiceLanguageSelectorScreen = this.f133276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvoiceLanguageSelectorScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(invoiceLanguageSelectorScreen.m2()).a().get(cad.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", cad.d.class, " is not found"));
                        }
                        cad.d dVar = ((cad.d) aVar2.b()).e;
                        InvoiceLanguageSelectorContract$InputData invoiceLanguageSelectorContract$InputData = invoiceLanguageSelectorScreen.K;
                        invoiceLanguageSelectorContract$InputData.getClass();
                        return new cad.a(dVar, invoiceLanguageSelectorScreen, invoiceLanguageSelectorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InvoiceLanguageSelectorScreen.R;
                        return (g) ((cad.a) invoiceLanguageSelectorScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = InvoiceLanguageSelectorScreen.R;
                        InvoiceLanguageSelectorScreen invoiceLanguageSelectorScreen2 = this.f133276b;
                        return dli.f.a(invoiceLanguageSelectorScreen2, (g) invoiceLanguageSelectorScreen2.P.getValue(), u.c(invoiceLanguageSelectorScreen2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        e eVar = uiState.f133282a;
        TextLocalisedClause textLocalisedClause = eVar.f133279a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(eVar.f133280b);
        navBarWithToolbar.setHint(eVar.f133281c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (cad.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ev7.b(this, continuation, 22), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new fad.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
