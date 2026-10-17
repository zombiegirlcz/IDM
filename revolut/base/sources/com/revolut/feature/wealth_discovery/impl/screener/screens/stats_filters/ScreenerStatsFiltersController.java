package com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import jii.u;
import joh.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rk9.d;
import rqh.b;
import rqh.f;
import rqh.g;
import rqh.i;
import rqh.j;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/stats_filters/ScreenerStatsFiltersController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrqh/i;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerStatsFiltersController extends ViewController<i> implements c {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(ScreenerStatsFiltersController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ScreenerStatsFiltersControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final int N;
    public final ActionsDelegate O;
    public final ActionsLoadingDelegate P;
    public final ListSubheaderDelegate Q;
    public final ListSubheaderLoadingDelegate R;
    public final RangeSliderTitleDelegate S;
    public final CellDetailsChevronDelegate T;
    public final RowDelegate U;
    public final FullScreenStateDelegate V;
    public final SelectableDelegate W;
    public final Object X;
    public final Object Y;

    public ScreenerStatsFiltersController(ScreenerStatsFiltersControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: rqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerStatsFiltersController f256538b;

            {
                this.f256538b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerStatsFiltersController screenerStatsFiltersController = this.f256538b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerStatsFiltersController.Z;
                        return (g) ((v) screenerStatsFiltersController.Y.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerStatsFiltersController.Z;
                        ScreenerStatsFiltersController screenerStatsFiltersController2 = this.f256538b;
                        return tki.g.a(screenerStatsFiltersController2, screenerStatsFiltersController2.d(), zhm.v.k(screenerStatsFiltersController2.O, screenerStatsFiltersController2.P, screenerStatsFiltersController2.Q, screenerStatsFiltersController2.R, screenerStatsFiltersController2.S, screenerStatsFiltersController2.T, screenerStatsFiltersController2.U, new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new LargeSliderLoadingDelegate(), new RowLoadingDelegate(), screenerStatsFiltersController2.V, screenerStatsFiltersController2.W), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerStatsFiltersController.Z;
                        phm.a aVar = (phm.a) ue0.e.j(screenerStatsFiltersController.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerStatsFiltersControllerContract$InputData screenerStatsFiltersControllerContract$InputData = screenerStatsFiltersController.K;
                        yph.g gVar = new yph.g(screenerStatsFiltersController.Q, screenerStatsFiltersController.O, screenerStatsFiltersController.S, screenerStatsFiltersController.W);
                        screenerStatsFiltersControllerContract$InputData.getClass();
                        return new v(wVar, screenerStatsFiltersControllerContract$InputData, gVar);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        this.O = new ActionsDelegate();
        this.P = new ActionsLoadingDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new ListSubheaderLoadingDelegate();
        this.S = new RangeSliderTitleDelegate();
        this.T = new CellDetailsChevronDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        this.V = new FullScreenStateDelegate();
        this.W = new SelectableDelegate(rowDelegate);
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: rqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerStatsFiltersController f256538b;

            {
                this.f256538b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerStatsFiltersController screenerStatsFiltersController = this.f256538b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerStatsFiltersController.Z;
                        return (g) ((v) screenerStatsFiltersController.Y.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerStatsFiltersController.Z;
                        ScreenerStatsFiltersController screenerStatsFiltersController2 = this.f256538b;
                        return tki.g.a(screenerStatsFiltersController2, screenerStatsFiltersController2.d(), zhm.v.k(screenerStatsFiltersController2.O, screenerStatsFiltersController2.P, screenerStatsFiltersController2.Q, screenerStatsFiltersController2.R, screenerStatsFiltersController2.S, screenerStatsFiltersController2.T, screenerStatsFiltersController2.U, new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new LargeSliderLoadingDelegate(), new RowLoadingDelegate(), screenerStatsFiltersController2.V, screenerStatsFiltersController2.W), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerStatsFiltersController.Z;
                        phm.a aVar = (phm.a) ue0.e.j(screenerStatsFiltersController.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerStatsFiltersControllerContract$InputData screenerStatsFiltersControllerContract$InputData = screenerStatsFiltersController.K;
                        yph.g gVar = new yph.g(screenerStatsFiltersController.Q, screenerStatsFiltersController.O, screenerStatsFiltersController.S, screenerStatsFiltersController.W);
                        screenerStatsFiltersControllerContract$InputData.getClass();
                        return new v(wVar, screenerStatsFiltersControllerContract$InputData, gVar);
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: rqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerStatsFiltersController f256538b;

            {
                this.f256538b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerStatsFiltersController screenerStatsFiltersController = this.f256538b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerStatsFiltersController.Z;
                        return (g) ((v) screenerStatsFiltersController.Y.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerStatsFiltersController.Z;
                        ScreenerStatsFiltersController screenerStatsFiltersController2 = this.f256538b;
                        return tki.g.a(screenerStatsFiltersController2, screenerStatsFiltersController2.d(), zhm.v.k(screenerStatsFiltersController2.O, screenerStatsFiltersController2.P, screenerStatsFiltersController2.Q, screenerStatsFiltersController2.R, screenerStatsFiltersController2.S, screenerStatsFiltersController2.T, screenerStatsFiltersController2.U, new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new LargeSliderLoadingDelegate(), new RowLoadingDelegate(), screenerStatsFiltersController2.V, screenerStatsFiltersController2.W), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerStatsFiltersController.Z;
                        phm.a aVar = (phm.a) ue0.e.j(screenerStatsFiltersController.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerStatsFiltersControllerContract$InputData screenerStatsFiltersControllerContract$InputData = screenerStatsFiltersController.K;
                        yph.g gVar = new yph.g(screenerStatsFiltersController.Q, screenerStatsFiltersController.O, screenerStatsFiltersController.S, screenerStatsFiltersController.W);
                        screenerStatsFiltersControllerContract$InputData.getClass();
                        return new v(wVar, screenerStatsFiltersControllerContract$InputData, gVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = uiState.f256545a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setTag("SCREENER_STATS_FILTERS_SCREEN");
        d3().f174564b.setTag("SCREENER_STATS_FILTERS_SCREEN");
        d3().f174565c.setTag("SCREENER_STATS_FILTERS_SCREEN");
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.screener_action_apply, null, null, 14));
        largeActionButton.setEnabled(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new rqh.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new rqh.e(this, null, 1), 3);
        ViewController.P2(this, new r7b.e(rd0.e.b(this.Q.d), 11), new d(this, null, 20), 3);
        ViewController.P2(this, new r7b.e(rd0.e.b(this.V.f52371h.f121375b), 10), new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.X.getValue();
    }
}
