package cs1;

import cli.n;
import cli.y;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreenContract$InputData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends oki.h implements dli.b {
    public final TapiTransferBreakdownScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f108439p;

    public j(TapiTransferBreakdownScreenContract$InputData inputData, n stateMapper) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        dj0.d dVar2 = inputData.f61551a;
        if (dVar2 == null) {
            dj0.d.Companion.getClass();
            dVar2 = dj0.d.d;
        }
        dj0.d dVar3 = dVar2;
        n9l.a aVar = inputData.f61552b;
        dj0.d dVar4 = inputData.f61553c;
        if (dVar4 == null) {
            dj0.d.Companion.getClass();
            dVar4 = dj0.d.d;
        }
        dj0.d dVar5 = dVar4;
        ApmQuoteCharges apmQuoteCharges = inputData.d;
        if (apmQuoteCharges == null || (dVar = apmQuoteCharges.f62222a) == null) {
            dj0.d.Companion.getClass();
            dVar = dj0.d.d;
        }
        this.f108439p = mra.d.b(this, new d(dVar3, aVar, dVar5, dVar, inputData.d), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f108439p;
    }
}
