package com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.CryptoFeeBreakdownDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m9d.y0;
import mq4.b;
import mq5.c;
import mq5.h;
import te0.w;
import xki.e;
import zhm.v;
import zo5.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lmq5/c;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoFeeBreakdownDialogController extends BaseBottomSheetRecyclerController<q, c> {
    public static final /* synthetic */ int V = 0;
    public final CryptoFeeBreakdownDialogInput Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CryptoFeeBreakdownDialogController(CryptoFeeBreakdownDialogInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.Q = input;
        this.R = w.y0(new b(1));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: mq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoFeeBreakdownDialogController f207884b;

            {
                this.f207884b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoFeeBreakdownDialogController cryptoFeeBreakdownDialogController = this.f207884b;
                switch (i2) {
                    case 0:
                        int i3 = CryptoFeeBreakdownDialogController.V;
                        return v.k((CellDetailsDelegate) cryptoFeeBreakdownDialogController.R.getValue(), new CellDetailsLoadingDelegate());
                    case 1:
                        int i5 = CryptoFeeBreakdownDialogController.V;
                        qji.b bVarR1 = cryptoFeeBreakdownDialogController.z2().R1();
                        nq5.b bVar = bVarR1 instanceof nq5.b ? (nq5.b) bVarR1 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(cryptoFeeBreakdownDialogController.m2()).a().get(zo5.d.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                            }
                            bVar = (nq5.b) aVar2.b();
                        }
                        return (r) ((nq5.a) bVar.c().mo3808a(cryptoFeeBreakdownDialogController)).v(cryptoFeeBreakdownDialogController.Q).mo3783build();
                    default:
                        int i6 = CryptoFeeBreakdownDialogController.V;
                        r rVar = (r) cryptoFeeBreakdownDialogController.T.getValue();
                        switch (rVar.f323944a) {
                            case 0:
                                return (h) rVar.f323946c.get();
                            default:
                                return (h) rVar.f323946c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: mq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoFeeBreakdownDialogController f207884b;

            {
                this.f207884b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoFeeBreakdownDialogController cryptoFeeBreakdownDialogController = this.f207884b;
                switch (i22) {
                    case 0:
                        int i3 = CryptoFeeBreakdownDialogController.V;
                        return v.k((CellDetailsDelegate) cryptoFeeBreakdownDialogController.R.getValue(), new CellDetailsLoadingDelegate());
                    case 1:
                        int i5 = CryptoFeeBreakdownDialogController.V;
                        qji.b bVarR1 = cryptoFeeBreakdownDialogController.z2().R1();
                        nq5.b bVar = bVarR1 instanceof nq5.b ? (nq5.b) bVarR1 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(cryptoFeeBreakdownDialogController.m2()).a().get(zo5.d.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                            }
                            bVar = (nq5.b) aVar2.b();
                        }
                        return (r) ((nq5.a) bVar.c().mo3808a(cryptoFeeBreakdownDialogController)).v(cryptoFeeBreakdownDialogController.Q).mo3783build();
                    default:
                        int i6 = CryptoFeeBreakdownDialogController.V;
                        r rVar = (r) cryptoFeeBreakdownDialogController.T.getValue();
                        switch (rVar.f323944a) {
                            case 0:
                                return (h) rVar.f323946c.get();
                            default:
                                return (h) rVar.f323946c.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: mq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoFeeBreakdownDialogController f207884b;

            {
                this.f207884b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoFeeBreakdownDialogController cryptoFeeBreakdownDialogController = this.f207884b;
                switch (i22) {
                    case 0:
                        int i32 = CryptoFeeBreakdownDialogController.V;
                        return v.k((CellDetailsDelegate) cryptoFeeBreakdownDialogController.R.getValue(), new CellDetailsLoadingDelegate());
                    case 1:
                        int i5 = CryptoFeeBreakdownDialogController.V;
                        qji.b bVarR1 = cryptoFeeBreakdownDialogController.z2().R1();
                        nq5.b bVar = bVarR1 instanceof nq5.b ? (nq5.b) bVarR1 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(cryptoFeeBreakdownDialogController.m2()).a().get(zo5.d.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                            }
                            bVar = (nq5.b) aVar2.b();
                        }
                        return (r) ((nq5.a) bVar.c().mo3808a(cryptoFeeBreakdownDialogController)).v(cryptoFeeBreakdownDialogController.Q).mo3783build();
                    default:
                        int i6 = CryptoFeeBreakdownDialogController.V;
                        r rVar = (r) cryptoFeeBreakdownDialogController.T.getValue();
                        switch (rVar.f323944a) {
                            case 0:
                                return (h) rVar.f323946c.get();
                            default:
                                return (h) rVar.f323946c.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new mmh.e(rd0.e.b(((CellDetailsDelegate) this.R.getValue()).d), 3), new mkk.q(this, null, 10), 3);
        ViewController.P2(this, e3(), new y0(this, null, 26), 3);
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
    public final List getU() {
        return (List) this.S.getValue();
    }
}
