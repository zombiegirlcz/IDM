package com.revolut.feature.tax_residency.impl.v2.ui.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ine.y;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tki.c;
import tx0.j0;
import upe.b;
import upe.d;
import upe.f;
import upe.l;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/list/TaxResidencyListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lupe/l;", "Ltki/c;", "Lupe/o;", "Lno/m;", "Companion", "a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxResidencyListScreen extends ViewController<l> implements c, m {
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
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TaxResidencyListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TaxResidencyListScreen(TaxResidencyListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.f90265c;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: upe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencyListScreen f281990b;

            {
                this.f281990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxResidencyListScreen taxResidencyListScreen = this.f281990b;
                switch (i2) {
                    case 0:
                        TaxResidencyListScreen.Companion companion = TaxResidencyListScreen.INSTANCE;
                        qji.b bVarU2 = taxResidencyListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.list.di.TaxResidencyListScreenInjector");
                        ine.g gVar = (ine.g) bVarU2;
                        ine.o oVar = gVar.f162853b;
                        ine.g gVar2 = gVar.f162854c;
                        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = taxResidencyListScreen.K;
                        taxResidencyListScreenContract$InputData.getClass();
                        return new y(oVar, gVar2, taxResidencyListScreen, taxResidencyListScreenContract$InputData);
                    case 1:
                        TaxResidencyListScreen.Companion companion2 = TaxResidencyListScreen.INSTANCE;
                        return (m) ((y) taxResidencyListScreen.O.getValue()).d.get();
                    case 2:
                        TaxResidencyListScreen.Companion companion3 = TaxResidencyListScreen.INSTANCE;
                        return v.k((FullScreenStateDelegate) taxResidencyListScreen.R.getValue(), (ListSubheaderDelegate) taxResidencyListScreen.S.getValue(), (RowDelegate) taxResidencyListScreen.Q.getValue(), new PlaceholderRowDelegate(), new RowLoadingDelegate(), new TextDelegate());
                    default:
                        TaxResidencyListScreen.Companion companion4 = TaxResidencyListScreen.INSTANCE;
                        TaxResidencyListScreen taxResidencyListScreen2 = this.f281990b;
                        return tki.g.a(taxResidencyListScreen2, taxResidencyListScreen2.R2(), (List) taxResidencyListScreen2.T.getValue(), taxResidencyListScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: upe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencyListScreen f281990b;

            {
                this.f281990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxResidencyListScreen taxResidencyListScreen = this.f281990b;
                switch (i22) {
                    case 0:
                        TaxResidencyListScreen.Companion companion = TaxResidencyListScreen.INSTANCE;
                        qji.b bVarU2 = taxResidencyListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.list.di.TaxResidencyListScreenInjector");
                        ine.g gVar = (ine.g) bVarU2;
                        ine.o oVar = gVar.f162853b;
                        ine.g gVar2 = gVar.f162854c;
                        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = taxResidencyListScreen.K;
                        taxResidencyListScreenContract$InputData.getClass();
                        return new y(oVar, gVar2, taxResidencyListScreen, taxResidencyListScreenContract$InputData);
                    case 1:
                        TaxResidencyListScreen.Companion companion2 = TaxResidencyListScreen.INSTANCE;
                        return (m) ((y) taxResidencyListScreen.O.getValue()).d.get();
                    case 2:
                        TaxResidencyListScreen.Companion companion3 = TaxResidencyListScreen.INSTANCE;
                        return v.k((FullScreenStateDelegate) taxResidencyListScreen.R.getValue(), (ListSubheaderDelegate) taxResidencyListScreen.S.getValue(), (RowDelegate) taxResidencyListScreen.Q.getValue(), new PlaceholderRowDelegate(), new RowLoadingDelegate(), new TextDelegate());
                    default:
                        TaxResidencyListScreen.Companion companion4 = TaxResidencyListScreen.INSTANCE;
                        TaxResidencyListScreen taxResidencyListScreen2 = this.f281990b;
                        return tki.g.a(taxResidencyListScreen2, taxResidencyListScreen2.R2(), (List) taxResidencyListScreen2.T.getValue(), taxResidencyListScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new ujb.v(21));
        this.R = w.y0(new ujb.v(22));
        this.S = w.y0(new ujb.v(23));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: upe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencyListScreen f281990b;

            {
                this.f281990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxResidencyListScreen taxResidencyListScreen = this.f281990b;
                switch (i22) {
                    case 0:
                        TaxResidencyListScreen.Companion companion = TaxResidencyListScreen.INSTANCE;
                        qji.b bVarU2 = taxResidencyListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.list.di.TaxResidencyListScreenInjector");
                        ine.g gVar = (ine.g) bVarU2;
                        ine.o oVar = gVar.f162853b;
                        ine.g gVar2 = gVar.f162854c;
                        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = taxResidencyListScreen.K;
                        taxResidencyListScreenContract$InputData.getClass();
                        return new y(oVar, gVar2, taxResidencyListScreen, taxResidencyListScreenContract$InputData);
                    case 1:
                        TaxResidencyListScreen.Companion companion2 = TaxResidencyListScreen.INSTANCE;
                        return (m) ((y) taxResidencyListScreen.O.getValue()).d.get();
                    case 2:
                        TaxResidencyListScreen.Companion companion3 = TaxResidencyListScreen.INSTANCE;
                        return v.k((FullScreenStateDelegate) taxResidencyListScreen.R.getValue(), (ListSubheaderDelegate) taxResidencyListScreen.S.getValue(), (RowDelegate) taxResidencyListScreen.Q.getValue(), new PlaceholderRowDelegate(), new RowLoadingDelegate(), new TextDelegate());
                    default:
                        TaxResidencyListScreen.Companion companion4 = TaxResidencyListScreen.INSTANCE;
                        TaxResidencyListScreen taxResidencyListScreen2 = this.f281990b;
                        return tki.g.a(taxResidencyListScreen2, taxResidencyListScreen2.R2(), (List) taxResidencyListScreen2.T.getValue(), taxResidencyListScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: upe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencyListScreen f281990b;

            {
                this.f281990b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TaxResidencyListScreen taxResidencyListScreen = this.f281990b;
                switch (i22) {
                    case 0:
                        TaxResidencyListScreen.Companion companion = TaxResidencyListScreen.INSTANCE;
                        qji.b bVarU2 = taxResidencyListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.list.di.TaxResidencyListScreenInjector");
                        ine.g gVar = (ine.g) bVarU2;
                        ine.o oVar = gVar.f162853b;
                        ine.g gVar2 = gVar.f162854c;
                        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = taxResidencyListScreen.K;
                        taxResidencyListScreenContract$InputData.getClass();
                        return new y(oVar, gVar2, taxResidencyListScreen, taxResidencyListScreenContract$InputData);
                    case 1:
                        TaxResidencyListScreen.Companion companion2 = TaxResidencyListScreen.INSTANCE;
                        return (m) ((y) taxResidencyListScreen.O.getValue()).d.get();
                    case 2:
                        TaxResidencyListScreen.Companion companion3 = TaxResidencyListScreen.INSTANCE;
                        return v.k((FullScreenStateDelegate) taxResidencyListScreen.R.getValue(), (ListSubheaderDelegate) taxResidencyListScreen.S.getValue(), (RowDelegate) taxResidencyListScreen.Q.getValue(), new PlaceholderRowDelegate(), new RowLoadingDelegate(), new TextDelegate());
                    default:
                        TaxResidencyListScreen.Companion companion4 = TaxResidencyListScreen.INSTANCE;
                        TaxResidencyListScreen taxResidencyListScreen2 = this.f281990b;
                        return tki.g.a(taxResidencyListScreen2, taxResidencyListScreen2.R2(), (List) taxResidencyListScreen2.T.getValue(), taxResidencyListScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        upe.o uiState = (upe.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f281999b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tin_flow_tax_list_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionText(yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.tin_flow_tax_list_description, null, null, 14), new TextLocalisedClause(R$string.tax_residency_list_what_is, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_CLICK_ID", false), 10))));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = this.K;
        if (czi.c.G(taxResidencyListScreenContract$InputData.d)) {
            navBarWithToolbar.setNavigationButtonIcon(czi.c.Q(taxResidencyListScreenContract$InputData.d));
        }
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.tax_residency_common_action_confirm, null, null, 14));
        largeActionButton.setLoadingButtonTag("PRIMARY_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (czi.c.G(this.K.d)) {
            ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new upe.c(this, null, 0), 3);
        }
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.x0()), new upe.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new upe.e(2, 4, upe.m.class, R2(), "onRowItemClick", "onRowItemClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.S.getValue()).f52707c), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new upe.c(this, null, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final upe.m R2() {
        return (upe.m) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
