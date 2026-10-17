package com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker;

import aii.q;
import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.structured_note.details.impl.R$id;
import com.revolut.feature.structured_note.details.impl.R$layout;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o4e.i;
import pki.a;
import sy6.j;
import t5e.b;
import t5e.c;
import t5e.d;
import t5e.e;
import t5e.f;
import t5e.m;
import te0.w;
import tx0.t3;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/PerformanceTrackerFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lt5e/f;", "Lcom/revolut/feature/structured_note/details/impl/ui/screens/performance_tracker/PerformanceTrackerFlowContract$Page;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerformanceTrackerFlowController extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PerformanceTrackerFlowController.class, "binding", "getBinding()Lcom/revolut/feature/structured_note/details/impl/databinding/FlowPerformanceTrackerBinding;", 0))};
    public final PerformanceTrackerFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;

    public PerformanceTrackerFlowController(PerformanceTrackerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: t5e.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerFlowController f268067b;

            {
                this.f268067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PerformanceTrackerFlowController performanceTrackerFlowController = this.f268067b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PerformanceTrackerFlowController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(performanceTrackerFlowController.m2()).a().get(o4e.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o4e.l.class, " is not found"));
                        }
                        o4e.l lVar = ((o4e.l) aVar2.b()).o;
                        PerformanceTrackerFlowContract$InputData performanceTrackerFlowContract$InputData = performanceTrackerFlowController.K;
                        performanceTrackerFlowContract$InputData.getClass();
                        return new o4e.i(lVar, performanceTrackerFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PerformanceTrackerFlowController.Q;
                        return (o) ((o4e.i) performanceTrackerFlowController.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PerformanceTrackerFlowController.Q;
                        return mif.a.a(performanceTrackerFlowController, 0, R$id.flowPerformanceTracker_pager, (o) performanceTrackerFlowController.M.getValue(), 5);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: t5e.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerFlowController f268067b;

            {
                this.f268067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PerformanceTrackerFlowController performanceTrackerFlowController = this.f268067b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PerformanceTrackerFlowController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(performanceTrackerFlowController.m2()).a().get(o4e.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o4e.l.class, " is not found"));
                        }
                        o4e.l lVar = ((o4e.l) aVar2.b()).o;
                        PerformanceTrackerFlowContract$InputData performanceTrackerFlowContract$InputData = performanceTrackerFlowController.K;
                        performanceTrackerFlowContract$InputData.getClass();
                        return new o4e.i(lVar, performanceTrackerFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PerformanceTrackerFlowController.Q;
                        return (o) ((o4e.i) performanceTrackerFlowController.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PerformanceTrackerFlowController.Q;
                        return mif.a.a(performanceTrackerFlowController, 0, R$id.flowPerformanceTracker_pager, (o) performanceTrackerFlowController.M.getValue(), 5);
                }
            }
        });
        this.N = R$layout.flow_performance_tracker;
        this.O = s.t(this, t5e.h.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: t5e.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceTrackerFlowController f268067b;

            {
                this.f268067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PerformanceTrackerFlowController performanceTrackerFlowController = this.f268067b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PerformanceTrackerFlowController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(performanceTrackerFlowController.m2()).a().get(o4e.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o4e.l.class, " is not found"));
                        }
                        o4e.l lVar = ((o4e.l) aVar2.b()).o;
                        PerformanceTrackerFlowContract$InputData performanceTrackerFlowContract$InputData = performanceTrackerFlowController.K;
                        performanceTrackerFlowContract$InputData.getClass();
                        return new o4e.i(lVar, performanceTrackerFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PerformanceTrackerFlowController.Q;
                        return (o) ((o4e.i) performanceTrackerFlowController.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PerformanceTrackerFlowController.Q;
                        return mif.a.a(performanceTrackerFlowController, 0, R$id.flowPerformanceTracker_pager, (o) performanceTrackerFlowController.M.getValue(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f202727c;
        e eVar = uiState.f268063a;
        if (eVar instanceof b) {
            navBarWithToolbar.l0();
            b bVar = (b) eVar;
            TextClause textClause = bVar.f268060b;
            TextLocalisedClause textLocalisedClause = bVar.f268059a;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setTitleDescription(textClause, null);
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textLocalisedClause, textClause, null, 4, null);
        } else if (eVar instanceof c) {
            navBarWithToolbar.l0();
        } else if (eVar instanceof d) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else if (eVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        FixedTabs fixedTabs = d3().f202726b;
        FixedTabs.setItems$default(fixedTabs, uiState.f268064b, null, 2, null);
        fixedTabs.i0(uiState.f268065c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        PerformanceTrackerFlowContract$Page page = (PerformanceTrackerFlowContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        t5e.o oVar = (t5e.o) this.M.getValue();
        oVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        oVar.H2(oVar.f268075q, new m(page, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (t5e.o) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_asset_details, null, null, 14));
        d3().f202727c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f202727c.f59410q), new t05.m(this, null, 8), 3);
        ViewController.P2(this, new t05.c(rd0.e.b(d3().f202726b.f), 10), new j(this, null, 15), 3);
    }

    public final m4e.b d3() {
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m4e.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (ali.c) this.P.getValue();
    }
}
