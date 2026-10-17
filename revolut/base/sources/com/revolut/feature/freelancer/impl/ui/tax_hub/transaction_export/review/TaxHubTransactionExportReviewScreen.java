package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt6.a0;
import bt6.y;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s47.b;
import s47.d;
import s47.f;
import s47.g;
import s47.m;
import s47.n;
import s47.p;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/review/TaxHubTransactionExportReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls47/m;", "Ltki/c;", "Ls47/q;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubTransactionExportReviewScreen extends ViewController<m> implements c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TaxHubTransactionExportReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final TaxHubTransactionExportReviewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CounterTextDelegate N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final SelectableDelegate Q;
    public final SelectableDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public TaxHubTransactionExportReviewScreen(TaxHubTransactionExportReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new CounterTextDelegate();
        this.O = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SelectableDelegate(new ListSubheaderDelegate());
        this.R = new SelectableDelegate(rowDelegate);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: s47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportReviewScreen f259782b;

            {
                this.f259782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen = this.f259782b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportReviewScreen.V;
                        qji.b bVarU2 = taxHubTransactionExportReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.di.TaxHubTransactionExportReviewScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportReviewScreenContract$InputData taxHubTransactionExportReviewScreenContract$InputData = taxHubTransactionExportReviewScreen.K;
                        taxHubTransactionExportReviewScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportReviewScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(taxHubTransactionExportReviewScreen.m2()).a().get(djf.c.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.i iVar = (thf.i) ((djf.c) aVar4.b()).O.get();
                        iVar.getClass();
                        return new a0(bVar, yVar2, taxHubTransactionExportReviewScreenContract$InputData, cVarC, iVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportReviewScreen.V;
                        return (n) ((a0) taxHubTransactionExportReviewScreen.S.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportReviewScreen.V;
                        TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen2 = this.f259782b;
                        return tki.g.a(taxHubTransactionExportReviewScreen2, taxHubTransactionExportReviewScreen2.d(), v.k(taxHubTransactionExportReviewScreen2.N, taxHubTransactionExportReviewScreen2.O, new GridBoxDelegate(zhm.u.c(new CounterTextDelegate()), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), new RowLoadingDelegate(), taxHubTransactionExportReviewScreen2.Q, taxHubTransactionExportReviewScreen2.R), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: s47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportReviewScreen f259782b;

            {
                this.f259782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen = this.f259782b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportReviewScreen.V;
                        qji.b bVarU2 = taxHubTransactionExportReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.di.TaxHubTransactionExportReviewScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportReviewScreenContract$InputData taxHubTransactionExportReviewScreenContract$InputData = taxHubTransactionExportReviewScreen.K;
                        taxHubTransactionExportReviewScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportReviewScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(taxHubTransactionExportReviewScreen.m2()).a().get(djf.c.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.i iVar = (thf.i) ((djf.c) aVar4.b()).O.get();
                        iVar.getClass();
                        return new a0(bVar, yVar2, taxHubTransactionExportReviewScreenContract$InputData, cVarC, iVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportReviewScreen.V;
                        return (n) ((a0) taxHubTransactionExportReviewScreen.S.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportReviewScreen.V;
                        TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen2 = this.f259782b;
                        return tki.g.a(taxHubTransactionExportReviewScreen2, taxHubTransactionExportReviewScreen2.d(), v.k(taxHubTransactionExportReviewScreen2.N, taxHubTransactionExportReviewScreen2.O, new GridBoxDelegate(zhm.u.c(new CounterTextDelegate()), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), new RowLoadingDelegate(), taxHubTransactionExportReviewScreen2.Q, taxHubTransactionExportReviewScreen2.R), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: s47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubTransactionExportReviewScreen f259782b;

            {
                this.f259782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen = this.f259782b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubTransactionExportReviewScreen.V;
                        qji.b bVarU2 = taxHubTransactionExportReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.di.TaxHubTransactionExportReviewScreenInjector");
                        y yVar = (y) bVarU2;
                        bt6.b bVar = yVar.f18397b;
                        y yVar2 = yVar.f18398c;
                        TaxHubTransactionExportReviewScreenContract$InputData taxHubTransactionExportReviewScreenContract$InputData = taxHubTransactionExportReviewScreen.K;
                        taxHubTransactionExportReviewScreenContract$InputData.getClass();
                        phm.a aVar = (phm.a) ue0.e.j(taxHubTransactionExportReviewScreen.m2()).a().get(djf.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.c cVarC = ((djf.c) aVar2.b()).c();
                        cVarC.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(taxHubTransactionExportReviewScreen.m2()).a().get(djf.c.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                        }
                        thf.i iVar = (thf.i) ((djf.c) aVar4.b()).O.get();
                        iVar.getClass();
                        return new a0(bVar, yVar2, taxHubTransactionExportReviewScreenContract$InputData, cVarC, iVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubTransactionExportReviewScreen.V;
                        return (n) ((a0) taxHubTransactionExportReviewScreen.S.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubTransactionExportReviewScreen.V;
                        TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen2 = this.f259782b;
                        return tki.g.a(taxHubTransactionExportReviewScreen2, taxHubTransactionExportReviewScreen2.d(), v.k(taxHubTransactionExportReviewScreen2.N, taxHubTransactionExportReviewScreen2.O, new GridBoxDelegate(zhm.u.c(new CounterTextDelegate()), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), new RowLoadingDelegate(), taxHubTransactionExportReviewScreen2.Q, taxHubTransactionExportReviewScreen2.R), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        s47.q uiState = (s47.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        p pVar = uiState.f259795a;
        TextLocalisedClause textLocalisedClause = pVar.f259793a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(pVar.f259794b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174557b;
        s47.o oVar2 = uiState.f259796b;
        largeActionButton.setText(oVar2.f259790a);
        largeActionButton.setEnabled(oVar2.f259792c);
        d3().f174558c.setTextClause(oVar2.f259791b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().e.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new s47.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new s47.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new s47.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.r()), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.r()), new s47.h(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
