package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt6.y;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.IconLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker.TaxHubTransactionExportCategoryPickerScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker.TaxHubTransactionExportCategoryPickerScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d47.b;
import d47.c;
import d47.d;
import d47.g;
import d47.j;
import d47.l;
import dli.a;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/category_picker/TaxHubTransactionExportCategoryPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld47/g;", "Ldli/a;", "Ld47/j;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubTransactionExportCategoryPickerScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TaxHubTransactionExportCategoryPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TaxHubTransactionExportCategoryPickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final IconDelegate N;
    public final GridBoxDelegate O;
    public final SelectableDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TaxHubTransactionExportCategoryPickerScreen(TaxHubTransactionExportCategoryPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        IconDelegate iconDelegate = new IconDelegate();
        this.N = iconDelegate;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.O = new GridBoxDelegate(v.k(iconDelegate, new IconLoadingDelegate()), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
        this.P = new SelectableDelegate(new ListSubheaderDelegate());
        this.Q = w.y0(new Function0(this) { // from class: d47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportCategoryPickerScreen f111232b;

            {
                this.f111232b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                TaxHubTransactionExportCategoryPickerScreen taxHubTransactionExportCategoryPickerScreen = this.f111232b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportCategoryPickerScreen.T;
                        qji.b bVarU2 = taxHubTransactionExportCategoryPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker.di.TaxHubTransactionExportCategoryPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportCategoryPickerScreenContract$InputData taxHubTransactionExportCategoryPickerScreenContract$InputData = taxHubTransactionExportCategoryPickerScreen.K;
                        taxHubTransactionExportCategoryPickerScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportCategoryPickerScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new bt6.v(bVar, yVar2, taxHubTransactionExportCategoryPickerScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportCategoryPickerScreen.T;
                        return (l) ((bt6.v) taxHubTransactionExportCategoryPickerScreen.Q.getValue()).f18389c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportCategoryPickerScreen.T;
                        TaxHubTransactionExportCategoryPickerScreen taxHubTransactionExportCategoryPickerScreen2 = this.f111232b;
                        return dli.f.a(taxHubTransactionExportCategoryPickerScreen2, taxHubTransactionExportCategoryPickerScreen2.d(), v.k(taxHubTransactionExportCategoryPickerScreen2.O, taxHubTransactionExportCategoryPickerScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        this.R = w.y0(new Function0(this) { // from class: d47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportCategoryPickerScreen f111232b;

            {
                this.f111232b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                TaxHubTransactionExportCategoryPickerScreen taxHubTransactionExportCategoryPickerScreen = this.f111232b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportCategoryPickerScreen.T;
                        qji.b bVarU2 = taxHubTransactionExportCategoryPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker.di.TaxHubTransactionExportCategoryPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportCategoryPickerScreenContract$InputData taxHubTransactionExportCategoryPickerScreenContract$InputData = taxHubTransactionExportCategoryPickerScreen.K;
                        taxHubTransactionExportCategoryPickerScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportCategoryPickerScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new bt6.v(bVar, yVar2, taxHubTransactionExportCategoryPickerScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportCategoryPickerScreen.T;
                        return (l) ((bt6.v) taxHubTransactionExportCategoryPickerScreen.Q.getValue()).f18389c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportCategoryPickerScreen.T;
                        TaxHubTransactionExportCategoryPickerScreen taxHubTransactionExportCategoryPickerScreen2 = this.f111232b;
                        return dli.f.a(taxHubTransactionExportCategoryPickerScreen2, taxHubTransactionExportCategoryPickerScreen2.d(), v.k(taxHubTransactionExportCategoryPickerScreen2.O, taxHubTransactionExportCategoryPickerScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        this.S = w.y0(new Function0(this) { // from class: d47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportCategoryPickerScreen f111232b;

            {
                this.f111232b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                TaxHubTransactionExportCategoryPickerScreen taxHubTransactionExportCategoryPickerScreen = this.f111232b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportCategoryPickerScreen.T;
                        qji.b bVarU2 = taxHubTransactionExportCategoryPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.category_picker.di.TaxHubTransactionExportCategoryPickerScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportCategoryPickerScreenContract$InputData taxHubTransactionExportCategoryPickerScreenContract$InputData = taxHubTransactionExportCategoryPickerScreen.K;
                        taxHubTransactionExportCategoryPickerScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportCategoryPickerScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new bt6.v(bVar, yVar2, taxHubTransactionExportCategoryPickerScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportCategoryPickerScreen.T;
                        return (l) ((bt6.v) taxHubTransactionExportCategoryPickerScreen.Q.getValue()).f18389c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportCategoryPickerScreen.T;
                        TaxHubTransactionExportCategoryPickerScreen taxHubTransactionExportCategoryPickerScreen2 = this.f111232b;
                        return dli.f.a(taxHubTransactionExportCategoryPickerScreen2, taxHubTransactionExportCategoryPickerScreen2.d(), v.k(taxHubTransactionExportCategoryPickerScreen2.O, taxHubTransactionExportCategoryPickerScreen2.P), 0, null, null, null, 60);
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
        TextLocalisedClause textLocalisedClause = uiState.f111238a.f111237a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f174564b.setText(uiState.f111239b.f111236a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bt6.v) this.Q.getValue();
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
        ViewController.P2(this, rd0.e.b(this.N.p()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.r()), new d47.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
