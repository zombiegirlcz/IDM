package com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetInputData;
import com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.PendingPaymentBottomSheetFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import y8a.g;
import yak.b;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final PendingPaymentBottomSheetInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xak.a f102429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f102430q;

    public a(PendingPaymentBottomSheetInputData flowInputData, xak.a dialogProvider) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = flowInputData;
        this.f102429p = dialogProvider;
        this.f102430q = d.a(this, new g(this, 5));
    }

    @Override // yki.j
    public final void M0() {
        h.z2(this.f102430q, PendingPaymentBottomSheetFlowContract$Step.Dialog.f102428a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102430q;
    }
}
