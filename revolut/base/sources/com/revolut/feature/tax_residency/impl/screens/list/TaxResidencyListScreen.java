package com.revolut.feature.tax_residency.impl.screens.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c0;
import aw0.db;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreen;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.youTransactor.uCube.rpc.Constants;
import ine.t;
import java.util.List;
import jii.u;
import kl7.w0;
import koe.b;
import koe.d;
import koe.f;
import koe.g;
import koe.m;
import koe.n;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkoe/m;", "Ltki/c;", "Lkoe/q;", "Lno/m;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxResidencyListScreen extends ViewController<m> implements c, no.m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TaxResidencyListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TaxResidencyListScreenContract$InputData K;
    public final AnalyticsProduct L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public TaxResidencyListScreen(TaxResidencyListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.k;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: koe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencyListScreen f186306b;

            {
                this.f186306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxResidencyListScreen taxResidencyListScreen = this.f186306b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxResidencyListScreen.V;
                        qji.b bVarU2 = taxResidencyListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.list.di.TaxResidencyListScreenInjector");
                        ine.n nVar = (ine.n) bVarU2;
                        ine.o oVar = nVar.f162876b;
                        ine.n nVar2 = nVar.f162877c;
                        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = taxResidencyListScreen.K;
                        taxResidencyListScreenContract$InputData.getClass();
                        return new ine.t(oVar, nVar2, taxResidencyListScreen, taxResidencyListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxResidencyListScreen.V;
                        return (n) ((ine.t) taxResidencyListScreen.O.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TaxResidencyListScreen.V;
                        return zhm.v.k((ListSubheaderDelegate) taxResidencyListScreen.R.getValue(), (RowDelegate) taxResidencyListScreen.Q.getValue(), new PlaceholderRowDelegate(), (FullScreenStateDelegate) taxResidencyListScreen.S.getValue(), new RowLoadingDelegate(), new TextDelegate());
                    default:
                        KProperty[] kPropertyArr4 = TaxResidencyListScreen.V;
                        TaxResidencyListScreen taxResidencyListScreen2 = this.f186306b;
                        return tki.g.a(taxResidencyListScreen2, taxResidencyListScreen2.R2(), (List) taxResidencyListScreen2.T.getValue(), taxResidencyListScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: koe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencyListScreen f186306b;

            {
                this.f186306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxResidencyListScreen taxResidencyListScreen = this.f186306b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxResidencyListScreen.V;
                        qji.b bVarU2 = taxResidencyListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.list.di.TaxResidencyListScreenInjector");
                        ine.n nVar = (ine.n) bVarU2;
                        ine.o oVar = nVar.f162876b;
                        ine.n nVar2 = nVar.f162877c;
                        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = taxResidencyListScreen.K;
                        taxResidencyListScreenContract$InputData.getClass();
                        return new ine.t(oVar, nVar2, taxResidencyListScreen, taxResidencyListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxResidencyListScreen.V;
                        return (n) ((ine.t) taxResidencyListScreen.O.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TaxResidencyListScreen.V;
                        return zhm.v.k((ListSubheaderDelegate) taxResidencyListScreen.R.getValue(), (RowDelegate) taxResidencyListScreen.Q.getValue(), new PlaceholderRowDelegate(), (FullScreenStateDelegate) taxResidencyListScreen.S.getValue(), new RowLoadingDelegate(), new TextDelegate());
                    default:
                        KProperty[] kPropertyArr4 = TaxResidencyListScreen.V;
                        TaxResidencyListScreen taxResidencyListScreen2 = this.f186306b;
                        return tki.g.a(taxResidencyListScreen2, taxResidencyListScreen2.R2(), (List) taxResidencyListScreen2.T.getValue(), taxResidencyListScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new w0(9));
        this.R = w.y0(new w0(10));
        this.S = w.y0(new w0(11));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: koe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencyListScreen f186306b;

            {
                this.f186306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxResidencyListScreen taxResidencyListScreen = this.f186306b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxResidencyListScreen.V;
                        qji.b bVarU2 = taxResidencyListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.list.di.TaxResidencyListScreenInjector");
                        ine.n nVar = (ine.n) bVarU2;
                        ine.o oVar = nVar.f162876b;
                        ine.n nVar2 = nVar.f162877c;
                        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = taxResidencyListScreen.K;
                        taxResidencyListScreenContract$InputData.getClass();
                        return new ine.t(oVar, nVar2, taxResidencyListScreen, taxResidencyListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxResidencyListScreen.V;
                        return (n) ((ine.t) taxResidencyListScreen.O.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TaxResidencyListScreen.V;
                        return zhm.v.k((ListSubheaderDelegate) taxResidencyListScreen.R.getValue(), (RowDelegate) taxResidencyListScreen.Q.getValue(), new PlaceholderRowDelegate(), (FullScreenStateDelegate) taxResidencyListScreen.S.getValue(), new RowLoadingDelegate(), new TextDelegate());
                    default:
                        KProperty[] kPropertyArr4 = TaxResidencyListScreen.V;
                        TaxResidencyListScreen taxResidencyListScreen2 = this.f186306b;
                        return tki.g.a(taxResidencyListScreen2, taxResidencyListScreen2.R2(), (List) taxResidencyListScreen2.T.getValue(), taxResidencyListScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: koe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencyListScreen f186306b;

            {
                this.f186306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TaxResidencyListScreen taxResidencyListScreen = this.f186306b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxResidencyListScreen.V;
                        qji.b bVarU2 = taxResidencyListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.list.di.TaxResidencyListScreenInjector");
                        ine.n nVar = (ine.n) bVarU2;
                        ine.o oVar = nVar.f162876b;
                        ine.n nVar2 = nVar.f162877c;
                        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = taxResidencyListScreen.K;
                        taxResidencyListScreenContract$InputData.getClass();
                        return new ine.t(oVar, nVar2, taxResidencyListScreen, taxResidencyListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxResidencyListScreen.V;
                        return (n) ((ine.t) taxResidencyListScreen.O.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TaxResidencyListScreen.V;
                        return zhm.v.k((ListSubheaderDelegate) taxResidencyListScreen.R.getValue(), (RowDelegate) taxResidencyListScreen.Q.getValue(), new PlaceholderRowDelegate(), (FullScreenStateDelegate) taxResidencyListScreen.S.getValue(), new RowLoadingDelegate(), new TextDelegate());
                    default:
                        KProperty[] kPropertyArr4 = TaxResidencyListScreen.V;
                        TaxResidencyListScreen taxResidencyListScreen2 = this.f186306b;
                        return tki.g.a(taxResidencyListScreen2, taxResidencyListScreen2.R2(), (List) taxResidencyListScreen2.T.getValue(), taxResidencyListScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        koe.q uiState = (koe.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(uiState.f186328c ? 0 : 8);
        largeActionButton.setEnabled(uiState.f186327b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF82762b0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(taxResidencyListScreenContract$InputData.f90081a);
        navBarWithToolbar.setTitle(taxResidencyListScreenContract$InputData.f90081a, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.tax_residency_list_what_is, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, db.EMPHASIS1, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), 10));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionClickable(c0.TEXT_AND_ICON);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(taxResidencyListScreenContract$InputData.f90082b);
        largeActionButton.setLoadingButtonTag("PRIMARY_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new koe.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.q0()), new koe.c(this, continuation, 1), 3);
        ?? r112 = this.Q;
        ViewController.P2(this, rd0.e.b(((RowDelegate) r112.getValue()).f53218h), new d(2, 4, n.class, R2(), "onRowItemClick", "onRowItemClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r112.getValue()).f53220l), new koe.e(2, 4, n.class, R2(), "onRowItemClick", "onRowItemClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.R.getValue()).f52707c), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), new g(2, 4, n.class, R2(), "onMainActionClick", "onMainActionClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new koe.c(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
