package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.EsimRefundInfoBottomSheetScreenContract$InputData;
import fnj.d;
import fnj.e;
import fnj.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements f {
    public final y o;

    public b(n stateMapper, EsimRefundInfoBottomSheetScreenContract$InputData inputData) {
        d dVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (Intrinsics.f(inputData, EsimRefundInfoBottomSheetScreenContract$InputData.HowRefundsCalculated.f101436a)) {
            dVar = d.HOW_REFUNDS_CALCULATED;
        } else {
            if (!Intrinsics.f(inputData, EsimRefundInfoBottomSheetScreenContract$InputData.RefundPending.f101437a)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = d.REFUND_PENDING;
        }
        this.o = mra.d.b(this, new e(dVar), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
