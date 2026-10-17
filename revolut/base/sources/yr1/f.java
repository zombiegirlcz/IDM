package yr1;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.fee_breakdown.TapiFeeBreakdownScreenContract$InputData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeFee;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeTax;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(TapiFeeBreakdownScreenContract$InputData inputData, n stateMapper) {
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d dVar3;
        ApmQuoteChargeTax apmQuoteChargeTax;
        ApmQuoteChargeFee apmQuoteChargeFee;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        ApmQuoteCharges apmQuoteCharges = inputData.f61550a;
        if (apmQuoteCharges == null || (apmQuoteChargeFee = apmQuoteCharges.f62223b) == null || (dVar = apmQuoteChargeFee.f62217a) == null) {
            xi0.b.Companion.getClass();
            dVar = new dj0.d(0L, xi0.b.z);
        }
        if (apmQuoteCharges == null || (apmQuoteChargeTax = apmQuoteCharges.f62224c) == null || (dVar2 = apmQuoteChargeTax.f62220a) == null) {
            xi0.b.Companion.getClass();
            dVar2 = new dj0.d(0L, xi0.b.z);
        }
        if (apmQuoteCharges == null || (dVar3 = apmQuoteCharges.f62222a) == null) {
            xi0.b.Companion.getClass();
            dVar3 = new dj0.d(0L, xi0.b.z);
        }
        this.o = mra.d.b(this, new c(dVar, dVar2, dVar3), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
