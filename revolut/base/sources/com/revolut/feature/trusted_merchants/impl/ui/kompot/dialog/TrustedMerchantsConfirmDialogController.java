package com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog;

import android.view.View;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.TrustedMerchantsConfirmDialogContract$InputData;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.TrustedMerchantsConfirmDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import ejg.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljg.d;
import ljg.f;
import te0.w;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/dialog/TrustedMerchantsConfirmDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/dialog/a;", "Lljg/d;", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustedMerchantsConfirmDialogController extends BaseBottomSheetRecyclerController<a, d> {
    public static final /* synthetic */ int U = 0;
    public final TrustedMerchantsConfirmDialogContract$InputData Q;
    public final Object R;
    public final Object S;
    public final f0 T;

    public TrustedMerchantsConfirmDialogController(TrustedMerchantsConfirmDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ljg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedMerchantsConfirmDialogController f195667b;

            {
                this.f195667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TrustedMerchantsConfirmDialogController trustedMerchantsConfirmDialogController = this.f195667b;
                switch (i2) {
                    case 0:
                        int i3 = TrustedMerchantsConfirmDialogController.U;
                        qji.b bVarU2 = trustedMerchantsConfirmDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.di.TrustedMerchantsConfirmDialogControllerInjector");
                        ejg.d dVar = (ejg.d) bVarU2;
                        ejg.b bVar = dVar.f126896b;
                        ejg.d dVar2 = dVar.f126897c;
                        TrustedMerchantsConfirmDialogContract$InputData trustedMerchantsConfirmDialogContract$InputData = trustedMerchantsConfirmDialogController.Q;
                        trustedMerchantsConfirmDialogContract$InputData.getClass();
                        return new ejg.c(bVar, dVar2, trustedMerchantsConfirmDialogContract$InputData);
                    default:
                        int i5 = TrustedMerchantsConfirmDialogController.U;
                        return (a) ((ejg.c) trustedMerchantsConfirmDialogController.R.getValue()).f126894c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ljg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedMerchantsConfirmDialogController f195667b;

            {
                this.f195667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TrustedMerchantsConfirmDialogController trustedMerchantsConfirmDialogController = this.f195667b;
                switch (i22) {
                    case 0:
                        int i3 = TrustedMerchantsConfirmDialogController.U;
                        qji.b bVarU2 = trustedMerchantsConfirmDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.di.TrustedMerchantsConfirmDialogControllerInjector");
                        ejg.d dVar = (ejg.d) bVarU2;
                        ejg.b bVar = dVar.f126896b;
                        ejg.d dVar2 = dVar.f126897c;
                        TrustedMerchantsConfirmDialogContract$InputData trustedMerchantsConfirmDialogContract$InputData = trustedMerchantsConfirmDialogController.Q;
                        trustedMerchantsConfirmDialogContract$InputData.getClass();
                        return new ejg.c(bVar, dVar2, trustedMerchantsConfirmDialogContract$InputData);
                    default:
                        int i5 = TrustedMerchantsConfirmDialogController.U;
                        return (a) ((ejg.c) trustedMerchantsConfirmDialogController.R.getValue()).f126894c.get();
                }
            }
        });
        this.T = f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ljg.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new f(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (ljg.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return this.T;
    }
}
