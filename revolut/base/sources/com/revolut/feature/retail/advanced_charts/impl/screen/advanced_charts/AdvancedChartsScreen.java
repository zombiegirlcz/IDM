package com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts;

import aii.q;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.transition.TransitionManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.core_ui_advanced_chart.delegate.AdvancedChartViewDelegate;
import com.revolut.feature.retail.advanced_charts.impl.R$id;
import com.revolut.feature.retail.advanced_charts.impl.R$layout;
import com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.AdvancedChartsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import pd.b;
import r8.d;
import t0b.m;
import te0.w;
import tki.c;
import vc.s;
import vkm.j2;
import xki.e;
import y0b.f;
import y0b.g;
import y0b.i;
import y0b.j;
import yp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/screen/advanced_charts/AdvancedChartsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Ly0b/j;", "Companion", "a", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdvancedChartsScreen extends ViewController<q> implements c {
    public final g K;
    public final h L;
    public final int M;
    public final ActionsDelegate N;
    public final AdvancedChartViewDelegate O;
    public final koi.h P;
    public final koi.h Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public j U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(AdvancedChartsScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/advanced_charts/impl/databinding/ScreenAdvancedChartsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public AdvancedChartsScreen(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, y0b.c.f);
        this.M = R$layout.screen_advanced_charts;
        this.N = new ActionsDelegate();
        this.O = new AdvancedChartViewDelegate();
        this.P = new koi.h(null, false, false, 1);
        this.Q = new koi.h(null, false, false, 1);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: y0b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdvancedChartsScreen f310172b;

            {
                this.f310172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AdvancedChartsScreen.V;
                        AdvancedChartsScreen advancedChartsScreen = this.f310172b;
                        return tki.g.a(advancedChartsScreen, advancedChartsScreen.R2(), u.c(advancedChartsScreen.O), R$id.advanced_charts_screen_chart_recycler_view, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdvancedChartsScreen.V;
                        return (h) ((t0b.m) this.f310172b.T.getValue()).f266986m.get();
                    default:
                        KProperty[] kPropertyArr3 = AdvancedChartsScreen.V;
                        AdvancedChartsScreen advancedChartsScreen2 = this.f310172b;
                        phm.a aVar = (phm.a) ue0.e.j(advancedChartsScreen2.m2()).a().get(t0b.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t0b.k.class, " is not found"));
                        }
                        t0b.k kVar = ((t0b.k) aVar2.b()).f;
                        g gVar = advancedChartsScreen2.K;
                        gVar.getClass();
                        AsyncDiffRecyclerView advancedChartsScreenChartRecyclerView = advancedChartsScreen2.d3().f250770c;
                        Intrinsics.checkNotNullExpressionValue(advancedChartsScreenChartRecyclerView, "advancedChartsScreenChartRecyclerView");
                        AdvancedChartViewDelegate advancedChartViewDelegate = advancedChartsScreen2.O;
                        advancedChartViewDelegate.getClass();
                        return new t0b.m(kVar, advancedChartsScreen2, gVar, advancedChartsScreenChartRecyclerView, advancedChartViewDelegate);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: y0b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdvancedChartsScreen f310172b;

            {
                this.f310172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdvancedChartsScreen.V;
                        AdvancedChartsScreen advancedChartsScreen = this.f310172b;
                        return tki.g.a(advancedChartsScreen, advancedChartsScreen.R2(), u.c(advancedChartsScreen.O), R$id.advanced_charts_screen_chart_recycler_view, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdvancedChartsScreen.V;
                        return (h) ((t0b.m) this.f310172b.T.getValue()).f266986m.get();
                    default:
                        KProperty[] kPropertyArr3 = AdvancedChartsScreen.V;
                        AdvancedChartsScreen advancedChartsScreen2 = this.f310172b;
                        phm.a aVar = (phm.a) ue0.e.j(advancedChartsScreen2.m2()).a().get(t0b.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t0b.k.class, " is not found"));
                        }
                        t0b.k kVar = ((t0b.k) aVar2.b()).f;
                        g gVar = advancedChartsScreen2.K;
                        gVar.getClass();
                        AsyncDiffRecyclerView advancedChartsScreenChartRecyclerView = advancedChartsScreen2.d3().f250770c;
                        Intrinsics.checkNotNullExpressionValue(advancedChartsScreenChartRecyclerView, "advancedChartsScreenChartRecyclerView");
                        AdvancedChartViewDelegate advancedChartViewDelegate = advancedChartsScreen2.O;
                        advancedChartViewDelegate.getClass();
                        return new t0b.m(kVar, advancedChartsScreen2, gVar, advancedChartsScreenChartRecyclerView, advancedChartViewDelegate);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: y0b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdvancedChartsScreen f310172b;

            {
                this.f310172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = AdvancedChartsScreen.V;
                        AdvancedChartsScreen advancedChartsScreen = this.f310172b;
                        return tki.g.a(advancedChartsScreen, advancedChartsScreen.R2(), u.c(advancedChartsScreen.O), R$id.advanced_charts_screen_chart_recycler_view, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdvancedChartsScreen.V;
                        return (h) ((t0b.m) this.f310172b.T.getValue()).f266986m.get();
                    default:
                        KProperty[] kPropertyArr3 = AdvancedChartsScreen.V;
                        AdvancedChartsScreen advancedChartsScreen2 = this.f310172b;
                        phm.a aVar = (phm.a) ue0.e.j(advancedChartsScreen2.m2()).a().get(t0b.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t0b.k.class, " is not found"));
                        }
                        t0b.k kVar = ((t0b.k) aVar2.b()).f;
                        g gVar = advancedChartsScreen2.K;
                        gVar.getClass();
                        AsyncDiffRecyclerView advancedChartsScreenChartRecyclerView = advancedChartsScreen2.d3().f250770c;
                        Intrinsics.checkNotNullExpressionValue(advancedChartsScreenChartRecyclerView, "advancedChartsScreenChartRecyclerView");
                        AdvancedChartViewDelegate advancedChartViewDelegate = advancedChartsScreen2.O;
                        advancedChartViewDelegate.getClass();
                        return new t0b.m(kVar, advancedChartsScreen2, gVar, advancedChartsScreenChartRecyclerView, advancedChartViewDelegate);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j jVar = this.U;
        cli.q qVarA = jVar != null ? uiState.a(jVar) : null;
        i iVar = qVarA instanceof i ? (i) qVarA : null;
        this.U = uiState;
        if (b.k(iVar != null ? Boolean.valueOf(iVar.f310180a) : null)) {
            d3().e.setTitle(uiState.f310183a);
            d3().e.setTitleClickable(true);
        }
        if (b.k(iVar != null ? Boolean.valueOf(iVar.f310181b) : null)) {
            d3().e.setSubtitle(uiState.f310184b);
        }
        if (b.k(iVar != null ? Boolean.valueOf(iVar.f310182c) : null)) {
            int i = y0b.b.f310173a[uiState.f310185c.ordinal()];
            if (i == 1) {
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(d3().d);
                constraintSet.clear(d3().f.getId(), 3);
                constraintSet.connect(d3().f.getId(), 4, 0, 4);
                constraintSet.applyTo(d3().d);
                TransitionManager.beginDelayedTransition(d3().d);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ConstraintSet constraintSet2 = new ConstraintSet();
                constraintSet2.clone(d3().d);
                constraintSet2.clear(d3().f.getId(), 4);
                constraintSet2.connect(d3().f.getId(), 3, 0, 4);
                constraintSet2.applyTo(d3().d);
                TransitionManager.beginDelayedTransition(d3().d);
            }
        }
        if (b.k(iVar != null ? Boolean.valueOf(iVar.d) : null)) {
            this.P.c(uiState.d);
        }
        if (b.k(iVar != null ? Boolean.valueOf(iVar.e) : null)) {
            this.Q.c(uiState.e);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void J0(boolean z) {
        super.J0(z);
        if (z) {
            View viewD2 = D2();
            OneShotPreDrawListener.add(viewD2, new d(22, viewD2, false, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r122 = this.T;
        je0.d objectMapper = ((m) r122.getValue()).e.f266972c.b();
        s.j(objectMapper);
        t0b.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        t01.b commandMapper = new t01.b(objectMapper);
        AdvancedChartViewDelegate advancedChartViewDelegate = this.O;
        advancedChartViewDelegate.getClass();
        Intrinsics.checkNotNullParameter(commandMapper, "commandMapper");
        advancedChartViewDelegate.f60098c = commandMapper;
        BasicNavBar basicNavBar = d3().e;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        basicNavBar.setMenuItems(u.c(new ActionNavBarMenuItem("SEARCH_ACTION", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))));
        koi.h hVar = this.P;
        hVar.f.b(((j0b.b) ((m) r122.getValue()).f.get()).a());
        AsyncDiffRecyclerView advancedChartsScreenTradeRecyclerView = d3().f;
        Intrinsics.checkNotNullExpressionValue(advancedChartsScreenTradeRecyclerView, "advancedChartsScreenTradeRecyclerView");
        y.h(advancedChartsScreenTradeRecyclerView, hVar, new LinearLayoutManager(advancedChartsScreenTradeRecyclerView.getContext()));
        koi.h hVar2 = this.Q;
        hVar2.f.b(v.k(this.N, new SmallCardDelegate(null)));
        AsyncDiffRecyclerView advancedChartsScreenBottomRecyclerView = d3().f250769b;
        Intrinsics.checkNotNullExpressionValue(advancedChartsScreenBottomRecyclerView, "advancedChartsScreenBottomRecyclerView");
        y.h(advancedChartsScreenBottomRecyclerView, hVar2, new LinearLayoutManager(advancedChartsScreenBottomRecyclerView.getContext()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59211b), new y0b.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().e.f59210a.f57403b), new y0b.d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51611c.f121375b), new y0b.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().e.d), new y0b.d(this, continuation, 2), 3);
    }

    public final r0b.a d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r0b.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final y0b.h d() {
        return (y0b.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void i1(boolean z) {
        super.i1(z);
        if (z) {
            com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a aVar = (com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) R2();
            cli.y yVar = aVar.f82081s;
            if (((f) ((j2) yVar.f22677a).getValue()).e) {
                aVar.H2(yVar, new y07.m(4));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.TRUE;
    }
}
