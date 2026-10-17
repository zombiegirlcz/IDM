package com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetInputData;
import com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.PendingPaymentBottomSheetFlow;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wak.b;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/impl/ui/bottom_sheet/PendingPaymentBottomSheetFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_pending_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPaymentBottomSheetFlow extends ViewController<q> implements f {
    public final Object K;
    public final int L;
    public final Object M;
    public final Object N;

    public PendingPaymentBottomSheetFlow(PendingPaymentBottomSheetInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new y1a.a(this, inputData, 12));
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yak.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentBottomSheetFlow f312067b;

            {
                this.f312067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((wak.b) this.f312067b.K.getValue()).f295952b.get();
                    default:
                        PendingPaymentBottomSheetFlow pendingPaymentBottomSheetFlow = this.f312067b;
                        return c.d(R$id.screen_transparent_container, 4, null, pendingPaymentBottomSheetFlow, (b) pendingPaymentBottomSheetFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yak.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentBottomSheetFlow f312067b;

            {
                this.f312067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((wak.b) this.f312067b.K.getValue()).f295952b.get();
                    default:
                        PendingPaymentBottomSheetFlow pendingPaymentBottomSheetFlow = this.f312067b;
                        return c.d(R$id.screen_transparent_container, 4, null, pendingPaymentBottomSheetFlow, (b) pendingPaymentBottomSheetFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yak.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
