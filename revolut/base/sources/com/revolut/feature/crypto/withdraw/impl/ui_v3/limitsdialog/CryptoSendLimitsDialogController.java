package com.revolut.feature.crypto.withdraw.impl.ui_v3.limitsdialog;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.limitsdialog.CryptoSendLimitsDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import tzh.g;
import ujb.v;
import uq5.c;
import uq5.d;
import xki.e;
import zo5.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/limitsdialog/CryptoSendLimitsDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Luq5/d;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendLimitsDialogController extends BaseBottomSheetRecyclerController<q, d> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final List T;

    public CryptoSendLimitsDialogController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: uq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendLimitsDialogController f282105b;

            {
                this.f282105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoSendLimitsDialogController cryptoSendLimitsDialogController = this.f282105b;
                switch (i2) {
                    case 0:
                        int i3 = CryptoSendLimitsDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendLimitsDialogController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        h hVar = new h();
                        hVar.f323910a = e4m.b.b(new zdl.d(dVar, 10));
                        return hVar;
                    default:
                        int i5 = CryptoSendLimitsDialogController.U;
                        return (e) ((h) cryptoSendLimitsDialogController.Q.getValue()).f323910a.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: uq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSendLimitsDialogController f282105b;

            {
                this.f282105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoSendLimitsDialogController cryptoSendLimitsDialogController = this.f282105b;
                switch (i22) {
                    case 0:
                        int i3 = CryptoSendLimitsDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSendLimitsDialogController.m2()).a().get(zo5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zo5.d.class, " is not found"));
                        }
                        zo5.d dVar = ((zo5.d) aVar2.b()).E;
                        h hVar = new h();
                        hVar.f323910a = e4m.b.b(new zdl.d(dVar, 10));
                        return hVar;
                    default:
                        int i5 = CryptoSendLimitsDialogController.U;
                        return (e) ((h) cryptoSendLimitsDialogController.Q.getValue()).f323910a.get();
                }
            }
        });
        Lazy lazyY0 = w.y0(new v(24));
        this.S = lazyY0;
        this.T = zhm.v.k(new CellDetailsDelegate(), (FullScreenStateDelegate) lazyY0.getValue(), new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (uq5.e) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new g(h3(), 22), new uea.e(this, null, 19), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (uq5.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
