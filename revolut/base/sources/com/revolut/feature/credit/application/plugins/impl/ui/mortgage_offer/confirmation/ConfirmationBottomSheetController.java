package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation;

import android.view.View;
import cli.k;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginBottomSheetRecyclerController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import de4.d;
import de4.f;
import de4.g;
import dw3.c1;
import dw3.f4;
import dw3.k0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/confirmation/ConfirmationBottomSheetController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginBottomSheetRecyclerController;", "Lde4/d;", "Lcli/k;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmationBottomSheetController extends PluginBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ int V = 0;
    public final ConfirmationBottomSheetContract$InputData R;
    public final Object S;
    public final Object T;
    public final List U;

    public ConfirmationBottomSheetController(ConfirmationBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = inputData;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: de4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationBottomSheetController f113289b;

            {
                this.f113289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConfirmationBottomSheetController confirmationBottomSheetController = this.f113289b;
                switch (i2) {
                    case 0:
                        int i3 = ConfirmationBottomSheetController.V;
                        return (g) ((k0) confirmationBottomSheetController.T.getValue()).f119067g.get();
                    default:
                        int i5 = ConfirmationBottomSheetController.V;
                        qji.b bVarU2 = confirmationBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.di.ConfirmationBottomSheetInjector");
                        f4 f4Var = (f4) bVarU2;
                        c1 c1Var = f4Var.f118717c;
                        f4 f4Var2 = f4Var.d;
                        ConfirmationBottomSheetContract$InputData confirmationBottomSheetContract$InputData = confirmationBottomSheetController.R;
                        confirmationBottomSheetContract$InputData.getClass();
                        return new k0(c1Var, f4Var2, confirmationBottomSheetController, confirmationBottomSheetContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: de4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationBottomSheetController f113289b;

            {
                this.f113289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConfirmationBottomSheetController confirmationBottomSheetController = this.f113289b;
                switch (i22) {
                    case 0:
                        int i3 = ConfirmationBottomSheetController.V;
                        return (g) ((k0) confirmationBottomSheetController.T.getValue()).f119067g.get();
                    default:
                        int i5 = ConfirmationBottomSheetController.V;
                        qji.b bVarU2 = confirmationBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.di.ConfirmationBottomSheetInjector");
                        f4 f4Var = (f4) bVarU2;
                        c1 c1Var = f4Var.f118717c;
                        f4 f4Var2 = f4Var.d;
                        ConfirmationBottomSheetContract$InputData confirmationBottomSheetContract$InputData = confirmationBottomSheetController.R;
                        confirmationBottomSheetContract$InputData.getClass();
                        return new k0(c1Var, f4Var2, confirmationBottomSheetController, confirmationBottomSheetContract$InputData);
                }
            }
        });
        this.U = b.v(null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new f(this, null, 0), 3);
        ViewController.P2(this, f3(), new f(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
