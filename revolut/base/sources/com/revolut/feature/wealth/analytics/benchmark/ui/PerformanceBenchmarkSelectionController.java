package com.revolut.feature.wealth.analytics.benchmark.ui;

import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.wealth.analytics.benchmark.ui.PerformanceBenchmarkSelectionContract$InputData;
import com.revolut.feature.wealth.analytics.benchmark.ui.PerformanceBenchmarkSelectionController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import gvg.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kvg.b;
import kvg.f;
import kvg.h;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/analytics/benchmark/ui/PerformanceBenchmarkSelectionController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lkvg/f;", "Lkvg/b;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerformanceBenchmarkSelectionController extends BaseBottomSheetRecyclerController<f, b> {
    public static final /* synthetic */ int V = 0;
    public final PerformanceBenchmarkSelectionContract$InputData Q;
    public final RowDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public PerformanceBenchmarkSelectionController(PerformanceBenchmarkSelectionContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.Q = input;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(rowDelegate, new RowLoadingDelegate(), new FullScreenStateDelegate());
        this.T = w.y0(new Function0(this) { // from class: kvg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceBenchmarkSelectionController f190119b;

            {
                this.f190119b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                PerformanceBenchmarkSelectionController performanceBenchmarkSelectionController = this.f190119b;
                switch (i3) {
                    case 0:
                        int i5 = PerformanceBenchmarkSelectionController.V;
                        return (a) ((gvg.a) performanceBenchmarkSelectionController.U.getValue()).f147157b.get();
                    default:
                        int i6 = PerformanceBenchmarkSelectionController.V;
                        phm.a aVar = (phm.a) ue0.e.j(performanceBenchmarkSelectionController.m2()).a().get(gvg.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gvg.d.class, " is not found"));
                        }
                        gvg.b bVar = ((gvg.b) ((gvg.d) aVar2.b())).e;
                        PerformanceBenchmarkSelectionContract$InputData performanceBenchmarkSelectionContract$InputData = performanceBenchmarkSelectionController.Q;
                        performanceBenchmarkSelectionContract$InputData.getClass();
                        return new gvg.a(bVar, performanceBenchmarkSelectionContract$InputData);
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: kvg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerformanceBenchmarkSelectionController f190119b;

            {
                this.f190119b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PerformanceBenchmarkSelectionController performanceBenchmarkSelectionController = this.f190119b;
                switch (i3) {
                    case 0:
                        int i5 = PerformanceBenchmarkSelectionController.V;
                        return (a) ((gvg.a) performanceBenchmarkSelectionController.U.getValue()).f147157b.get();
                    default:
                        int i6 = PerformanceBenchmarkSelectionController.V;
                        phm.a aVar = (phm.a) ue0.e.j(performanceBenchmarkSelectionController.m2()).a().get(gvg.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gvg.d.class, " is not found"));
                        }
                        gvg.b bVar = ((gvg.b) ((gvg.d) aVar2.b())).e;
                        PerformanceBenchmarkSelectionContract$InputData performanceBenchmarkSelectionContract$InputData = performanceBenchmarkSelectionController.Q;
                        performanceBenchmarkSelectionContract$InputData.getClass();
                        return new gvg.a(bVar, performanceBenchmarkSelectionContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (kvg.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (kvg.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
