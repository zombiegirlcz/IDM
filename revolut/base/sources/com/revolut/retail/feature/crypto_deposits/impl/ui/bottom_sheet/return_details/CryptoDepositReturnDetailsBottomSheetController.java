package com.revolut.retail.feature.crypto_deposits.impl.ui.bottom_sheet.return_details;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositReturnDetailsBottomSheetControllerInputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.bottom_sheet.return_details.CryptoDepositReturnDetailsBottomSheetController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qbj.p;
import te0.w;
import w50.g;
import w65.c;
import wbj.b;
import wbj.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/bottom_sheet/return_details/CryptoDepositReturnDetailsBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lwbj/d;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoDepositReturnDetailsBottomSheetController extends BaseBottomSheetRecyclerController<q, d> {
    public static final /* synthetic */ int V = 0;
    public final CryptoDepositReturnDetailsBottomSheetControllerInputData Q;
    public final CellDetailsActionDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public CryptoDepositReturnDetailsBottomSheetController(CryptoDepositReturnDetailsBottomSheetControllerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.R = cellDetailsActionDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: wbj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDepositReturnDetailsBottomSheetController f296231b;

            {
                this.f296231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoDepositReturnDetailsBottomSheetController cryptoDepositReturnDetailsBottomSheetController = this.f296231b;
                switch (i2) {
                    case 0:
                        int i3 = CryptoDepositReturnDetailsBottomSheetController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDepositReturnDetailsBottomSheetController.m2()).a().get(qbj.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qbj.q.class, " is not found"));
                        }
                        qbj.q qVar = ((qbj.q) aVar2.b()).v;
                        CryptoDepositReturnDetailsBottomSheetControllerInputData cryptoDepositReturnDetailsBottomSheetControllerInputData = cryptoDepositReturnDetailsBottomSheetController.Q;
                        cryptoDepositReturnDetailsBottomSheetControllerInputData.getClass();
                        return new p(qVar, cryptoDepositReturnDetailsBottomSheetControllerInputData);
                    default:
                        int i5 = CryptoDepositReturnDetailsBottomSheetController.V;
                        return (e) ((p) cryptoDepositReturnDetailsBottomSheetController.S.getValue()).f244328c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: wbj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDepositReturnDetailsBottomSheetController f296231b;

            {
                this.f296231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoDepositReturnDetailsBottomSheetController cryptoDepositReturnDetailsBottomSheetController = this.f296231b;
                switch (i22) {
                    case 0:
                        int i3 = CryptoDepositReturnDetailsBottomSheetController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDepositReturnDetailsBottomSheetController.m2()).a().get(qbj.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qbj.q.class, " is not found"));
                        }
                        qbj.q qVar = ((qbj.q) aVar2.b()).v;
                        CryptoDepositReturnDetailsBottomSheetControllerInputData cryptoDepositReturnDetailsBottomSheetControllerInputData = cryptoDepositReturnDetailsBottomSheetController.Q;
                        cryptoDepositReturnDetailsBottomSheetControllerInputData.getClass();
                        return new p(qVar, cryptoDepositReturnDetailsBottomSheetControllerInputData);
                    default:
                        int i5 = CryptoDepositReturnDetailsBottomSheetController.V;
                        return (e) ((p) cryptoDepositReturnDetailsBottomSheetController.S.getValue()).f244328c.get();
                }
            }
        });
        this.U = v.k(cellDetailsActionDelegate, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new c(this, continuation, 13), 3);
        ViewController.P2(this, h3(), new g(this, continuation, 14), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new b(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final wbj.e R2() {
        return (wbj.e) this.T.getValue();
    }
}
