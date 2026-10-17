package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet;

import android.view.View;
import btd.d;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ppd.n;
import ppd.t0;
import ppd.u0;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/SmartEstimationBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/bottom_sheet/a;", "Lcli/k;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmartEstimationBottomSheetController extends BaseBottomSheetRecyclerController<a, k> {
    public static final /* synthetic */ int V = 0;
    public final btd.a Q;
    public final TextDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public SmartEstimationBottomSheetController(btd.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        TextDelegate textDelegate = new TextDelegate();
        this.R = textDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(new RowDelegate(null, null, 7), textDelegate);
        this.T = w.y0(new Function0(this) { // from class: btd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SmartEstimationBottomSheetController f18561b;

            {
                this.f18561b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SmartEstimationBottomSheetController smartEstimationBottomSheetController = this.f18561b;
                switch (i3) {
                    case 0:
                        int i5 = SmartEstimationBottomSheetController.V;
                        qji.b bVarU2 = smartEstimationBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.di.SmartEstimationBottomSheetInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        a aVar = smartEstimationBottomSheetController.Q;
                        aVar.getClass();
                        return new t0(nVar, u0Var2, aVar);
                    default:
                        int i6 = SmartEstimationBottomSheetController.V;
                        return (b) ((t0) smartEstimationBottomSheetController.T.getValue()).f238553c.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: btd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SmartEstimationBottomSheetController f18561b;

            {
                this.f18561b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SmartEstimationBottomSheetController smartEstimationBottomSheetController = this.f18561b;
                switch (i3) {
                    case 0:
                        int i5 = SmartEstimationBottomSheetController.V;
                        qji.b bVarU2 = smartEstimationBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.di.SmartEstimationBottomSheetInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        a aVar = smartEstimationBottomSheetController.Q;
                        aVar.getClass();
                        return new t0(nVar, u0Var2, aVar);
                    default:
                        int i6 = SmartEstimationBottomSheetController.V;
                        return (b) ((t0) smartEstimationBottomSheetController.T.getValue()).f238553c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t0) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (btd.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new d(this, null, 0), 3);
        ViewController.P2(this, f3(), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new btd.e(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (btd.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.S;
    }
}
