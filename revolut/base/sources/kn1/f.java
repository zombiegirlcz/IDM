package kn1;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.BoletoFeeBreakdownScreenContract$InputData;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillBoletoFees;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(BoletoFeeBreakdownScreenContract$InputData inputData, n stateMapper) {
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d dVar3;
        dj0.d dVar4;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        BillBoletoFees billBoletoFees = inputData.f61186a;
        if (billBoletoFees == null || (dVar = billBoletoFees.f61427c) == null) {
            xi0.b.Companion.getClass();
            dVar = new dj0.d(0L, xi0.b.D);
        }
        if (billBoletoFees == null || (dVar2 = billBoletoFees.f61425a) == null) {
            xi0.b.Companion.getClass();
            dVar2 = new dj0.d(0L, xi0.b.D);
        }
        if (billBoletoFees == null || (dVar3 = billBoletoFees.f61426b) == null) {
            xi0.b.Companion.getClass();
            dVar3 = new dj0.d(0L, xi0.b.D);
        }
        if (billBoletoFees == null || (dVar4 = billBoletoFees.d) == null) {
            xi0.b.Companion.getClass();
            dVar4 = new dj0.d(0L, xi0.b.D);
        }
        this.o = mra.d.b(this, new c(dVar, dVar2, dVar3, dVar4), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
