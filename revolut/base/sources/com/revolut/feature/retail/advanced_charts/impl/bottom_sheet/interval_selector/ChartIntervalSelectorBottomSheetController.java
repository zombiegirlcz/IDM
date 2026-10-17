package com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.interval_selector;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartIntervalSelectorBottomSheetControllerProvider$InputData;
import com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.interval_selector.ChartIntervalSelectorBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import h0b.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0b.a;
import m0b.c;
import pki.b;
import t0b.n;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/bottom_sheet/interval_selector/ChartIntervalSelectorBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lh0b/g;", "Lcli/k;", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartIntervalSelectorBottomSheetController extends BaseBottomSheetRecyclerController<g, k> {
    public static final /* synthetic */ int V = 0;
    public final ChartIntervalSelectorBottomSheetControllerProvider$InputData Q;
    public final Object R;
    public final Object S;
    public final SingleChoiceDelegate T;
    public final List U;

    public ChartIntervalSelectorBottomSheetController(ChartIntervalSelectorBottomSheetControllerProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: m0b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartIntervalSelectorBottomSheetController f201133b;

            {
                this.f201133b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChartIntervalSelectorBottomSheetController chartIntervalSelectorBottomSheetController = this.f201133b;
                switch (i2) {
                    case 0:
                        int i3 = ChartIntervalSelectorBottomSheetController.V;
                        phm.a aVar = (phm.a) ue0.e.j(chartIntervalSelectorBottomSheetController.m2()).a().get(t0b.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t0b.k.class, " is not found"));
                        }
                        t0b.k kVar = ((t0b.k) aVar2.b()).f;
                        ChartIntervalSelectorBottomSheetControllerProvider$InputData chartIntervalSelectorBottomSheetControllerProvider$InputData = chartIntervalSelectorBottomSheetController.Q;
                        chartIntervalSelectorBottomSheetControllerProvider$InputData.getClass();
                        return new n(kVar, chartIntervalSelectorBottomSheetControllerProvider$InputData);
                    default:
                        int i5 = ChartIntervalSelectorBottomSheetController.V;
                        return (a) ((n) chartIntervalSelectorBottomSheetController.R.getValue()).f266988b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: m0b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartIntervalSelectorBottomSheetController f201133b;

            {
                this.f201133b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChartIntervalSelectorBottomSheetController chartIntervalSelectorBottomSheetController = this.f201133b;
                switch (i22) {
                    case 0:
                        int i3 = ChartIntervalSelectorBottomSheetController.V;
                        phm.a aVar = (phm.a) ue0.e.j(chartIntervalSelectorBottomSheetController.m2()).a().get(t0b.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t0b.k.class, " is not found"));
                        }
                        t0b.k kVar = ((t0b.k) aVar2.b()).f;
                        ChartIntervalSelectorBottomSheetControllerProvider$InputData chartIntervalSelectorBottomSheetControllerProvider$InputData = chartIntervalSelectorBottomSheetController.Q;
                        chartIntervalSelectorBottomSheetControllerProvider$InputData.getClass();
                        return new n(kVar, chartIntervalSelectorBottomSheetControllerProvider$InputData);
                    default:
                        int i5 = ChartIntervalSelectorBottomSheetController.V;
                        return (a) ((n) chartIntervalSelectorBottomSheetController.R.getValue()).f266988b.get();
                }
            }
        });
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.T = singleChoiceDelegate;
        this.U = u.c(singleChoiceDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.p()), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (a) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
