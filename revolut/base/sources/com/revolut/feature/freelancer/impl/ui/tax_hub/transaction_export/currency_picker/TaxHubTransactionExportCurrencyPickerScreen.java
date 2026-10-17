package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.currency_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt6.y;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.currency_picker.TaxHubTransactionExportCurrencyPickerScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.currency_picker.TaxHubTransactionExportCurrencyPickerScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import f47.b;
import f47.c;
import f47.d;
import f47.g;
import f47.j;
import f47.l;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/currency_picker/TaxHubTransactionExportCurrencyPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf47/g;", "Ldli/a;", "Lf47/j;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubTransactionExportCurrencyPickerScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TaxHubTransactionExportCurrencyPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TaxHubTransactionExportCurrencyPickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final SelectableDelegate N;
    public final SelectableDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TaxHubTransactionExportCurrencyPickerScreen(TaxHubTransactionExportCurrencyPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new SelectableDelegate(new AccountCellItemDelegate());
        this.O = new SelectableDelegate(new ListSubheaderDelegate());
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: f47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportCurrencyPickerScreen f132012b;

            {
                this.f132012b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubTransactionExportCurrencyPickerScreen taxHubTransactionExportCurrencyPickerScreen = this.f132012b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportCurrencyPickerScreen.S;
                        qji.b bVarU2 = taxHubTransactionExportCurrencyPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.currency_picker.di.TaxHubTransactionExportCurrencyPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportCurrencyPickerScreenContract$InputData taxHubTransactionExportCurrencyPickerScreenContract$InputData = taxHubTransactionExportCurrencyPickerScreen.K;
                        taxHubTransactionExportCurrencyPickerScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportCurrencyPickerScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new bt6.w(bVar, yVar2, taxHubTransactionExportCurrencyPickerScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportCurrencyPickerScreen.S;
                        return (l) ((bt6.w) taxHubTransactionExportCurrencyPickerScreen.P.getValue()).f18392c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportCurrencyPickerScreen.S;
                        TaxHubTransactionExportCurrencyPickerScreen taxHubTransactionExportCurrencyPickerScreen2 = this.f132012b;
                        return dli.f.a(taxHubTransactionExportCurrencyPickerScreen2, taxHubTransactionExportCurrencyPickerScreen2.d(), v.k(taxHubTransactionExportCurrencyPickerScreen2.N, taxHubTransactionExportCurrencyPickerScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: f47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportCurrencyPickerScreen f132012b;

            {
                this.f132012b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubTransactionExportCurrencyPickerScreen taxHubTransactionExportCurrencyPickerScreen = this.f132012b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportCurrencyPickerScreen.S;
                        qji.b bVarU2 = taxHubTransactionExportCurrencyPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.currency_picker.di.TaxHubTransactionExportCurrencyPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportCurrencyPickerScreenContract$InputData taxHubTransactionExportCurrencyPickerScreenContract$InputData = taxHubTransactionExportCurrencyPickerScreen.K;
                        taxHubTransactionExportCurrencyPickerScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportCurrencyPickerScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new bt6.w(bVar, yVar2, taxHubTransactionExportCurrencyPickerScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportCurrencyPickerScreen.S;
                        return (l) ((bt6.w) taxHubTransactionExportCurrencyPickerScreen.P.getValue()).f18392c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportCurrencyPickerScreen.S;
                        TaxHubTransactionExportCurrencyPickerScreen taxHubTransactionExportCurrencyPickerScreen2 = this.f132012b;
                        return dli.f.a(taxHubTransactionExportCurrencyPickerScreen2, taxHubTransactionExportCurrencyPickerScreen2.d(), v.k(taxHubTransactionExportCurrencyPickerScreen2.N, taxHubTransactionExportCurrencyPickerScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: f47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportCurrencyPickerScreen f132012b;

            {
                this.f132012b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxHubTransactionExportCurrencyPickerScreen taxHubTransactionExportCurrencyPickerScreen = this.f132012b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportCurrencyPickerScreen.S;
                        qji.b bVarU2 = taxHubTransactionExportCurrencyPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.currency_picker.di.TaxHubTransactionExportCurrencyPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportCurrencyPickerScreenContract$InputData taxHubTransactionExportCurrencyPickerScreenContract$InputData = taxHubTransactionExportCurrencyPickerScreen.K;
                        taxHubTransactionExportCurrencyPickerScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportCurrencyPickerScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new bt6.w(bVar, yVar2, taxHubTransactionExportCurrencyPickerScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportCurrencyPickerScreen.S;
                        return (l) ((bt6.w) taxHubTransactionExportCurrencyPickerScreen.P.getValue()).f18392c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportCurrencyPickerScreen.S;
                        TaxHubTransactionExportCurrencyPickerScreen taxHubTransactionExportCurrencyPickerScreen2 = this.f132012b;
                        return dli.f.a(taxHubTransactionExportCurrencyPickerScreen2, taxHubTransactionExportCurrencyPickerScreen2.d(), v.k(taxHubTransactionExportCurrencyPickerScreen2.N, taxHubTransactionExportCurrencyPickerScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f132019a.f132018a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f174564b.setText(uiState.f132020b.f132017a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bt6.w) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.r()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.r()), new f47.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
