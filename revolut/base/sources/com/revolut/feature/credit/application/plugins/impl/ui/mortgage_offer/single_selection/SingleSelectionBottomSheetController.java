package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginBottomSheetRecyclerController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.SingleSelectionBottomSheetContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.SingleSelectionBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.f4;
import dw3.o6;
import eq8.g;
import fe4.a;
import fe4.f;
import fe4.i;
import fe4.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/single_selection/SingleSelectionBottomSheetController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginBottomSheetRecyclerController;", "Lfe4/f;", "Lfe4/a;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SingleSelectionBottomSheetController extends PluginBottomSheetRecyclerController<f, a> {
    public static final /* synthetic */ int W = 0;
    public final SingleSelectionBottomSheetContract$InputData R;
    public final Object S;
    public final Object T;
    public final RowDelegate U;
    public final List V;

    public SingleSelectionBottomSheetController(SingleSelectionBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = inputData;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: fe4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleSelectionBottomSheetController f134440b;

            {
                this.f134440b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SingleSelectionBottomSheetController singleSelectionBottomSheetController = this.f134440b;
                switch (i2) {
                    case 0:
                        int i3 = SingleSelectionBottomSheetController.W;
                        return (j) ((o6) singleSelectionBottomSheetController.T.getValue()).f119462h.get();
                    default:
                        int i5 = SingleSelectionBottomSheetController.W;
                        qji.b bVarU2 = singleSelectionBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.di.SingleSelectionBottomSheetInjector");
                        f4 f4Var = (f4) bVarU2;
                        c1 c1Var = f4Var.f118717c;
                        f4 f4Var2 = f4Var.d;
                        SingleSelectionBottomSheetContract$InputData singleSelectionBottomSheetContract$InputData = singleSelectionBottomSheetController.R;
                        singleSelectionBottomSheetContract$InputData.getClass();
                        return new o6(c1Var, f4Var2, singleSelectionBottomSheetController, singleSelectionBottomSheetContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: fe4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleSelectionBottomSheetController f134440b;

            {
                this.f134440b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SingleSelectionBottomSheetController singleSelectionBottomSheetController = this.f134440b;
                switch (i22) {
                    case 0:
                        int i3 = SingleSelectionBottomSheetController.W;
                        return (j) ((o6) singleSelectionBottomSheetController.T.getValue()).f119462h.get();
                    default:
                        int i5 = SingleSelectionBottomSheetController.W;
                        qji.b bVarU2 = singleSelectionBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.di.SingleSelectionBottomSheetInjector");
                        f4 f4Var = (f4) bVarU2;
                        c1 c1Var = f4Var.f118717c;
                        f4 f4Var2 = f4Var.d;
                        SingleSelectionBottomSheetContract$InputData singleSelectionBottomSheetContract$InputData = singleSelectionBottomSheetController.R;
                        singleSelectionBottomSheetContract$InputData.getClass();
                        return new o6(c1Var, f4Var2, singleSelectionBottomSheetController, singleSelectionBottomSheetContract$InputData);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        this.V = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o6) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new ev7.b(this, null, 25), 3);
        ViewController.P2(this, h3(), new i(this, null, 0), 3);
        ViewController.P2(this, new g(rd0.e.b(this.U.f53218h), 18), new i(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.V;
    }
}
