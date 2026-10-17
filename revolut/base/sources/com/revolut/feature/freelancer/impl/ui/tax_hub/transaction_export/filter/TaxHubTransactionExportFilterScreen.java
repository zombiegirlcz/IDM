package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt6.x;
import bt6.y;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.IconLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import i47.b;
import i47.d;
import i47.f;
import i47.g;
import i47.i;
import i47.j;
import i47.k;
import i47.l;
import i47.m;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/filter/TaxHubTransactionExportFilterScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li47/i;", "Ltki/c;", "Li47/m;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubTransactionExportFilterScreen extends ViewController<i> implements c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TaxHubTransactionExportFilterScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TaxHubTransactionExportFilterScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final IconDelegate O;
    public final GridBoxDelegate P;
    public final PlainTextDelegate Q;
    public final SelectableDelegate R;
    public final SelectableDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;

    public TaxHubTransactionExportFilterScreen(TaxHubTransactionExportFilterScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        IconDelegate iconDelegate = new IconDelegate();
        this.O = iconDelegate;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.P = new GridBoxDelegate(v.k(iconDelegate, new IconLoadingDelegate()), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
        this.Q = new PlainTextDelegate();
        this.R = new SelectableDelegate(new AccountCellItemDelegate());
        this.S = new SelectableDelegate(new ListSubheaderDelegate());
        this.T = w.y0(new Function0(this) { // from class: i47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportFilterScreen f158286b;

            {
                this.f158286b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen = this.f158286b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportFilterScreen.W;
                        qji.b bVarU2 = taxHubTransactionExportFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.di.TaxHubTransactionExportFilterScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportFilterScreenContract$InputData taxHubTransactionExportFilterScreenContract$InputData = taxHubTransactionExportFilterScreen.K;
                        taxHubTransactionExportFilterScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportFilterScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new x(bVar, yVar2, taxHubTransactionExportFilterScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportFilterScreen.W;
                        return (j) ((x) taxHubTransactionExportFilterScreen.T.getValue()).f18395c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportFilterScreen.W;
                        TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen2 = this.f158286b;
                        return tki.g.a(taxHubTransactionExportFilterScreen2, taxHubTransactionExportFilterScreen2.R2(), v.k(taxHubTransactionExportFilterScreen2.N, taxHubTransactionExportFilterScreen2.P, taxHubTransactionExportFilterScreen2.Q, new RowLoadingDelegate(), taxHubTransactionExportFilterScreen2.R, taxHubTransactionExportFilterScreen2.S), 0, null, null, null, 60);
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: i47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportFilterScreen f158286b;

            {
                this.f158286b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen = this.f158286b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportFilterScreen.W;
                        qji.b bVarU2 = taxHubTransactionExportFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.di.TaxHubTransactionExportFilterScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportFilterScreenContract$InputData taxHubTransactionExportFilterScreenContract$InputData = taxHubTransactionExportFilterScreen.K;
                        taxHubTransactionExportFilterScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportFilterScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new x(bVar, yVar2, taxHubTransactionExportFilterScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportFilterScreen.W;
                        return (j) ((x) taxHubTransactionExportFilterScreen.T.getValue()).f18395c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportFilterScreen.W;
                        TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen2 = this.f158286b;
                        return tki.g.a(taxHubTransactionExportFilterScreen2, taxHubTransactionExportFilterScreen2.R2(), v.k(taxHubTransactionExportFilterScreen2.N, taxHubTransactionExportFilterScreen2.P, taxHubTransactionExportFilterScreen2.Q, new RowLoadingDelegate(), taxHubTransactionExportFilterScreen2.R, taxHubTransactionExportFilterScreen2.S), 0, null, null, null, 60);
                }
            }
        });
        this.V = w.y0(new Function0(this) { // from class: i47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportFilterScreen f158286b;

            {
                this.f158286b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen = this.f158286b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportFilterScreen.W;
                        qji.b bVarU2 = taxHubTransactionExportFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.di.TaxHubTransactionExportFilterScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportFilterScreenContract$InputData taxHubTransactionExportFilterScreenContract$InputData = taxHubTransactionExportFilterScreen.K;
                        taxHubTransactionExportFilterScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportFilterScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        return new x(bVar, yVar2, taxHubTransactionExportFilterScreenContract$InputData, cVarC);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportFilterScreen.W;
                        return (j) ((x) taxHubTransactionExportFilterScreen.T.getValue()).f18395c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportFilterScreen.W;
                        TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen2 = this.f158286b;
                        return tki.g.a(taxHubTransactionExportFilterScreen2, taxHubTransactionExportFilterScreen2.R2(), v.k(taxHubTransactionExportFilterScreen2.N, taxHubTransactionExportFilterScreen2.P, taxHubTransactionExportFilterScreen2.Q, new RowLoadingDelegate(), taxHubTransactionExportFilterScreen2.R, taxHubTransactionExportFilterScreen2.S), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        l lVar = uiState.f158298a;
        TextLocalisedClause textLocalisedClause = lVar.f158296a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(lVar.f158297b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        k kVar = uiState.f158299b;
        largeActionButton.setText(kVar.f158293a);
        largeActionButton.setEnabled(kVar.f158294b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.T.getValue();
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
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new i47.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new i47.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.p()), new i47.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new i13.d(this, continuation, 10), 3);
        ViewController.P2(this, rd0.e.b(this.R.r()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.r()), new g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}
