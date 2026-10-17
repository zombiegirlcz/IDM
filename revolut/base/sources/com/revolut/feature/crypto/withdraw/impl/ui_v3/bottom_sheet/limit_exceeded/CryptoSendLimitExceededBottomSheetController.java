package com.revolut.feature.crypto.withdraw.impl.ui_v3.bottom_sheet.limit_exceeded;

import android.view.View;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.bottom_sheet.limit_exceeded.CryptoSendLimitExceededBottomSheetController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.bottom_sheet.limit_exceeded.CryptoSendLimitExceededBottomSheetControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jq5.b;
import jq5.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wp5.y;
import xki.e;
import zo5.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/bottom_sheet/limit_exceeded/CryptoSendLimitExceededBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ljq5/c;", "Ljq5/b;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendLimitExceededBottomSheetController extends BaseBottomSheetRecyclerController<c, b> {
    public static final /* synthetic */ int U = 0;
    public final CryptoSendLimitExceededBottomSheetControllerContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public CryptoSendLimitExceededBottomSheetController(CryptoSendLimitExceededBottomSheetControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: jq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendLimitExceededBottomSheetController f177467b;

            {
                this.f177467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoSendLimitExceededBottomSheetController cryptoSendLimitExceededBottomSheetController = this.f177467b;
                switch (i2) {
                    case 0:
                        int i3 = CryptoSendLimitExceededBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendLimitExceededBottomSheetController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendLimitExceededBottomSheetControllerContract$InputData cryptoSendLimitExceededBottomSheetControllerContract$InputData = cryptoSendLimitExceededBottomSheetController.Q;
                        cryptoSendLimitExceededBottomSheetControllerContract$InputData.getClass();
                        return new zo5.g(dVar, cryptoSendLimitExceededBottomSheetControllerContract$InputData);
                    default:
                        int i5 = CryptoSendLimitExceededBottomSheetController.U;
                        return (e) ((zo5.g) cryptoSendLimitExceededBottomSheetController.R.getValue()).f323909b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: jq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendLimitExceededBottomSheetController f177467b;

            {
                this.f177467b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoSendLimitExceededBottomSheetController cryptoSendLimitExceededBottomSheetController = this.f177467b;
                switch (i22) {
                    case 0:
                        int i3 = CryptoSendLimitExceededBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendLimitExceededBottomSheetController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoSendLimitExceededBottomSheetControllerContract$InputData cryptoSendLimitExceededBottomSheetControllerContract$InputData = cryptoSendLimitExceededBottomSheetController.Q;
                        cryptoSendLimitExceededBottomSheetControllerContract$InputData.getClass();
                        return new zo5.g(dVar, cryptoSendLimitExceededBottomSheetControllerContract$InputData);
                    default:
                        int i5 = CryptoSendLimitExceededBottomSheetController.U;
                        return (e) ((zo5.g) cryptoSendLimitExceededBottomSheetController.R.getValue()).f323909b.get();
                }
            }
        });
        this.T = y.w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jq5.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new jkc.g(this, null, 9), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (jq5.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
