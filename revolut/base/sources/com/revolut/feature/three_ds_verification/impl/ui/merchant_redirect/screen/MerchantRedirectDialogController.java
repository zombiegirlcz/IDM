package com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen;

import android.view.View;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.MerchantRedirectDialogController;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.MerchantRedirectDialogControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import ff4.z;
import fse.c;
import fse.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/merchant_redirect/screen/MerchantRedirectDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lfse/d;", "Lfse/c;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MerchantRedirectDialogController extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int U = 0;
    public final MerchantRedirectDialogControllerContract$InputData Q;
    public final Object R;
    public final f0 S;
    public final Object T;

    public MerchantRedirectDialogController(MerchantRedirectDialogControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: fse.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantRedirectDialogController f137665b;

            {
                this.f137665b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MerchantRedirectDialogController merchantRedirectDialogController = this.f137665b;
                switch (i2) {
                    case 0:
                        int i3 = MerchantRedirectDialogController.U;
                        return (b) ((yre.c) merchantRedirectDialogController.T.getValue()).f316290c.get();
                    default:
                        int i5 = MerchantRedirectDialogController.U;
                        qji.b bVarU2 = merchantRedirectDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.di.MerchantRedirectDialogControllerInjector");
                        yre.d dVar = (yre.d) bVarU2;
                        yre.e eVar = dVar.f316292b;
                        yre.d dVar2 = dVar.f316293c;
                        MerchantRedirectDialogControllerContract$InputData merchantRedirectDialogControllerContract$InputData = merchantRedirectDialogController.Q;
                        merchantRedirectDialogControllerContract$InputData.getClass();
                        return new yre.c(eVar, dVar2, merchantRedirectDialogControllerContract$InputData);
                }
            }
        });
        this.S = f0.f322471a;
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: fse.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantRedirectDialogController f137665b;

            {
                this.f137665b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MerchantRedirectDialogController merchantRedirectDialogController = this.f137665b;
                switch (i22) {
                    case 0:
                        int i3 = MerchantRedirectDialogController.U;
                        return (b) ((yre.c) merchantRedirectDialogController.T.getValue()).f316290c.get();
                    default:
                        int i5 = MerchantRedirectDialogController.U;
                        qji.b bVarU2 = merchantRedirectDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.di.MerchantRedirectDialogControllerInjector");
                        yre.d dVar = (yre.d) bVarU2;
                        yre.e eVar = dVar.f316292b;
                        yre.d dVar2 = dVar.f316293c;
                        MerchantRedirectDialogControllerContract$InputData merchantRedirectDialogControllerContract$InputData = merchantRedirectDialogController.Q;
                        merchantRedirectDialogControllerContract$InputData.getClass();
                        return new yre.c(eVar, dVar2, merchantRedirectDialogControllerContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yre.c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (fse.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new z(this, null, 29), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (fse.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getT() {
        return this.S;
    }
}
