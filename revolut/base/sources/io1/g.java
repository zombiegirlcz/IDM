package io1;

import cli.y;
import com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.BPayTransferBreakdownScreenContract$InputData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import cs1.i;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends h implements dli.b {
    public final BPayTransferBreakdownScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f163141p;

    public g(BPayTransferBreakdownScreenContract$InputData inputData, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        dj0.d dVarM = pyd.c.M(inputData.f61221a);
        n9l.a aVar = inputData.f61222b;
        dj0.d dVarM2 = pyd.c.M(inputData.f61223c);
        ApmQuoteCharges apmQuoteCharges = inputData.d;
        this.f163141p = mra.d.b(this, new d(dVarM, aVar, dVarM2, pyd.c.M(apmQuoteCharges != null ? apmQuoteCharges.f62222a : null), inputData.d), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f163141p;
    }
}
