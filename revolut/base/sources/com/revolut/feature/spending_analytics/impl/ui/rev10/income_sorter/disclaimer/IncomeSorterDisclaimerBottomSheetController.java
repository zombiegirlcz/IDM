package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.disclaimer;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.disclaimer.IncomeSorterDisclaimerBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import eqd.b;
import eqd.c;
import eqd.e;
import eqd.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ppd.g0;
import ppd.j0;
import ppd.n;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/disclaimer/IncomeSorterDisclaimerBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Leqd/b;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSorterDisclaimerBottomSheetController extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int Y = 0;
    public final c Q;
    public final FooterTextDelegate R;
    public final TextDelegate S;
    public final FullScreenStateDelegate T;
    public final e U;
    public final List V;
    public final Object W;
    public final Object X;

    public IncomeSorterDisclaimerBottomSheetController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.R = footerTextDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.S = textDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.T = fullScreenStateDelegate;
        final int i = 0;
        this.U = new e(this, 0);
        final int i2 = 1;
        this.V = v.k(new PlainTextLoadingDelegate(), textDelegate, fullScreenStateDelegate, footerTextDelegate);
        this.W = w.y0(new Function0(this) { // from class: eqd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterDisclaimerBottomSheetController f128439b;

            {
                this.f128439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                IncomeSorterDisclaimerBottomSheetController incomeSorterDisclaimerBottomSheetController = this.f128439b;
                switch (i3) {
                    case 0:
                        int i5 = IncomeSorterDisclaimerBottomSheetController.Y;
                        qji.b bVarU2 = incomeSorterDisclaimerBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.disclaimer.di.IncomeSorterDisclaimerBottomSheetControllerInjector");
                        j0 j0Var = (j0) bVarU2;
                        n nVar = j0Var.f238443b;
                        j0 j0Var2 = j0Var.f238444c;
                        c cVar = incomeSorterDisclaimerBottomSheetController.Q;
                        e eVar = incomeSorterDisclaimerBottomSheetController.U;
                        cVar.getClass();
                        eVar.getClass();
                        return new g0(nVar, j0Var2, cVar, eVar);
                    default:
                        int i6 = IncomeSorterDisclaimerBottomSheetController.Y;
                        return (g) ((g0) incomeSorterDisclaimerBottomSheetController.W.getValue()).f.get();
                }
            }
        });
        this.X = w.y0(new Function0(this) { // from class: eqd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterDisclaimerBottomSheetController f128439b;

            {
                this.f128439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                IncomeSorterDisclaimerBottomSheetController incomeSorterDisclaimerBottomSheetController = this.f128439b;
                switch (i3) {
                    case 0:
                        int i5 = IncomeSorterDisclaimerBottomSheetController.Y;
                        qji.b bVarU2 = incomeSorterDisclaimerBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.disclaimer.di.IncomeSorterDisclaimerBottomSheetControllerInjector");
                        j0 j0Var = (j0) bVarU2;
                        n nVar = j0Var.f238443b;
                        j0 j0Var2 = j0Var.f238444c;
                        c cVar = incomeSorterDisclaimerBottomSheetController.Q;
                        e eVar = incomeSorterDisclaimerBottomSheetController.U;
                        cVar.getClass();
                        eVar.getClass();
                        return new g0(nVar, j0Var2, cVar, eVar);
                    default:
                        int i6 = IncomeSorterDisclaimerBottomSheetController.Y;
                        return (g) ((g0) incomeSorterDisclaimerBottomSheetController.W.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g0) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new ec8.c(this, null, 27), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.X.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getZ() {
        return this.V;
    }
}
