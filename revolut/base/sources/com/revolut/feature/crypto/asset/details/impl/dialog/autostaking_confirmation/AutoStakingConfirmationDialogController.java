package com.revolut.feature.crypto.asset.details.impl.dialog.autostaking_confirmation;

import android.view.View;
import com.revolut.feature.crypto.asset.details.impl.dialog.autostaking_confirmation.AutoStakingConfirmationDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nc5.c;
import sc5.a;
import sc5.b;
import sc5.d;
import sc5.f;
import te0.w;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/asset/details/impl/dialog/autostaking_confirmation/AutoStakingConfirmationDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lnc5/c;", "Lsc5/a;", "feature_crypto_asset_details_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoStakingConfirmationDialogController extends BaseBottomSheetRecyclerController<c, a> {
    public static final /* synthetic */ int U = 0;
    public final b Q;
    public final f0 R;
    public final Object S;
    public final Object T;

    public AutoStakingConfirmationDialogController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = f0.f322471a;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: sc5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoStakingConfirmationDialogController f261635b;

            {
                this.f261635b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AutoStakingConfirmationDialogController autoStakingConfirmationDialogController = this.f261635b;
                switch (i2) {
                    case 0:
                        int i3 = AutoStakingConfirmationDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(autoStakingConfirmationDialogController.m2()).a().get(rc5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rc5.b.class, " is not found"));
                        }
                        rc5.b bVar = ((rc5.b) aVar2.b()).f253200g;
                        b bVar2 = autoStakingConfirmationDialogController.Q;
                        bVar2.getClass();
                        return new rc5.a(bVar, bVar2);
                    default:
                        int i5 = AutoStakingConfirmationDialogController.U;
                        return (f) ((rc5.a) autoStakingConfirmationDialogController.S.getValue()).f253196b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: sc5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoStakingConfirmationDialogController f261635b;

            {
                this.f261635b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AutoStakingConfirmationDialogController autoStakingConfirmationDialogController = this.f261635b;
                switch (i22) {
                    case 0:
                        int i3 = AutoStakingConfirmationDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(autoStakingConfirmationDialogController.m2()).a().get(rc5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rc5.b.class, " is not found"));
                        }
                        rc5.b bVar = ((rc5.b) aVar2.b()).f253200g;
                        b bVar2 = autoStakingConfirmationDialogController.Q;
                        bVar2.getClass();
                        return new rc5.a(bVar, bVar2);
                    default:
                        int i5 = AutoStakingConfirmationDialogController.U;
                        return (f) ((rc5.a) autoStakingConfirmationDialogController.S.getValue()).f253196b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rc5.a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new d(this, null, 0), 3);
        ViewController.P2(this, f3(), new d(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getS() {
        return this.R;
    }
}
