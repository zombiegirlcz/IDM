package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.recipienttypedialog;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.recipienttypedialog.CryptoRecipientTypeDialogController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.recipienttypedialog.CryptoRecipientTypeDialogControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import dmj.b;
import dmj.k;
import dq5.c;
import dq5.d;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/recipienttypedialog/CryptoRecipientTypeDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ldq5/d;", "Ldq5/c;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoRecipientTypeDialogController extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final CryptoRecipientTypeDialogControllerContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public CryptoRecipientTypeDialogController(CryptoRecipientTypeDialogControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: dq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoRecipientTypeDialogController f116913b;

            {
                this.f116913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoRecipientTypeDialogController cryptoRecipientTypeDialogController = this.f116913b;
                switch (i2) {
                    case 0:
                        int i3 = CryptoRecipientTypeDialogController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoRecipientTypeDialogController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoRecipientTypeDialogControllerContract$InputData cryptoRecipientTypeDialogControllerContract$InputData = cryptoRecipientTypeDialogController.Q;
                        cryptoRecipientTypeDialogControllerContract$InputData.getClass();
                        return new zo5.b(dVar, cryptoRecipientTypeDialogControllerContract$InputData);
                    default:
                        int i5 = CryptoRecipientTypeDialogController.V;
                        return (e) ((zo5.b) cryptoRecipientTypeDialogController.R.getValue()).f323879c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: dq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoRecipientTypeDialogController f116913b;

            {
                this.f116913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoRecipientTypeDialogController cryptoRecipientTypeDialogController = this.f116913b;
                switch (i22) {
                    case 0:
                        int i3 = CryptoRecipientTypeDialogController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoRecipientTypeDialogController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        CryptoRecipientTypeDialogControllerContract$InputData cryptoRecipientTypeDialogControllerContract$InputData = cryptoRecipientTypeDialogController.Q;
                        cryptoRecipientTypeDialogControllerContract$InputData.getClass();
                        return new zo5.b(dVar, cryptoRecipientTypeDialogControllerContract$InputData);
                    default:
                        int i5 = CryptoRecipientTypeDialogController.V;
                        return (e) ((zo5.b) cryptoRecipientTypeDialogController.R.getValue()).f323879c.get();
                }
            }
        });
        Lazy lazyY0 = w.y0(new b(11));
        this.T = lazyY0;
        this.U = u.c((SingleChoiceDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zo5.b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (dq5.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new k(rd0.e.b(((SingleChoiceDelegate) this.T.getValue()).p()), 4), new dob.c(this, null, 8), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (dq5.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
