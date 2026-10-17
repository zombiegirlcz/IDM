package com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.PixApmRecipientWarningContract$InputData;
import com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.PixApmRecipientWarningController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mca.a;
import mca.e;
import mca.g;
import mca.h;
import p8a.d0;
import p8a.l;
import p8a.u0;
import pki.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/apm/recipient_warning/PixApmRecipientWarningController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lmca/e;", "Lmca/a;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixApmRecipientWarningController extends BaseBottomSheetRecyclerController<e, a> {
    public static final /* synthetic */ int V = 0;
    public final PixApmRecipientWarningContract$InputData Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public PixApmRecipientWarningController(PixApmRecipientWarningContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = new RowDelegate(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: mca.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixApmRecipientWarningController f204335b;

            {
                this.f204335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixApmRecipientWarningController pixApmRecipientWarningController = this.f204335b;
                switch (i2) {
                    case 0:
                        return u.c(pixApmRecipientWarningController.R);
                    case 1:
                        int i3 = PixApmRecipientWarningController.V;
                        qji.b bVarU2 = pixApmRecipientWarningController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.di.PixApmRecipientWarningControllerInjector");
                        u0 u0Var = (u0) bVarU2;
                        d0 d0Var = u0Var.f234097b;
                        u0 u0Var2 = u0Var.f234098c;
                        PixApmRecipientWarningContract$InputData pixApmRecipientWarningContract$InputData = pixApmRecipientWarningController.Q;
                        pixApmRecipientWarningContract$InputData.getClass();
                        return new p8a.l(d0Var, u0Var2, pixApmRecipientWarningContract$InputData);
                    default:
                        int i5 = PixApmRecipientWarningController.V;
                        return (h) ((p8a.l) pixApmRecipientWarningController.T.getValue()).f234012c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: mca.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixApmRecipientWarningController f204335b;

            {
                this.f204335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixApmRecipientWarningController pixApmRecipientWarningController = this.f204335b;
                switch (i22) {
                    case 0:
                        return u.c(pixApmRecipientWarningController.R);
                    case 1:
                        int i3 = PixApmRecipientWarningController.V;
                        qji.b bVarU2 = pixApmRecipientWarningController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.di.PixApmRecipientWarningControllerInjector");
                        u0 u0Var = (u0) bVarU2;
                        d0 d0Var = u0Var.f234097b;
                        u0 u0Var2 = u0Var.f234098c;
                        PixApmRecipientWarningContract$InputData pixApmRecipientWarningContract$InputData = pixApmRecipientWarningController.Q;
                        pixApmRecipientWarningContract$InputData.getClass();
                        return new p8a.l(d0Var, u0Var2, pixApmRecipientWarningContract$InputData);
                    default:
                        int i5 = PixApmRecipientWarningController.V;
                        return (h) ((p8a.l) pixApmRecipientWarningController.T.getValue()).f234012c.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: mca.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixApmRecipientWarningController f204335b;

            {
                this.f204335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixApmRecipientWarningController pixApmRecipientWarningController = this.f204335b;
                switch (i22) {
                    case 0:
                        return u.c(pixApmRecipientWarningController.R);
                    case 1:
                        int i32 = PixApmRecipientWarningController.V;
                        qji.b bVarU2 = pixApmRecipientWarningController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.di.PixApmRecipientWarningControllerInjector");
                        u0 u0Var = (u0) bVarU2;
                        d0 d0Var = u0Var.f234097b;
                        u0 u0Var2 = u0Var.f234098c;
                        PixApmRecipientWarningContract$InputData pixApmRecipientWarningContract$InputData = pixApmRecipientWarningController.Q;
                        pixApmRecipientWarningContract$InputData.getClass();
                        return new p8a.l(d0Var, u0Var2, pixApmRecipientWarningContract$InputData);
                    default:
                        int i5 = PixApmRecipientWarningController.V;
                        return (h) ((p8a.l) pixApmRecipientWarningController.T.getValue()).f234012c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (h) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((h) this.U.getValue()).P1();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new g(this, null, 0), 3);
        ViewController.P2(this, f3(), new g(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getS() {
        return (List) this.S.getValue();
    }
}
