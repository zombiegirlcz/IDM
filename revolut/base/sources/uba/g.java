package uba;

import cli.n;
import cli.y;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends h implements dli.b {
    public final y o;

    public g(PixQrCodeMoneyBreakdownScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        dj0.d dVar = inputData.f80706a;
        if (dVar == null) {
            xi0.b.Companion.getClass();
            dVar = new dj0.d(0L, xi0.b.D);
        }
        dj0.d dVar2 = inputData.f80707b;
        if (dVar2 == null) {
            xi0.b.Companion.getClass();
            dVar2 = new dj0.d(0L, xi0.b.D);
        }
        dj0.d dVar3 = inputData.f80708c;
        if (dVar3 == null) {
            xi0.b.Companion.getClass();
            dVar3 = new dj0.d(0L, xi0.b.D);
        }
        dj0.d dVar4 = inputData.d;
        if (dVar4 == null) {
            xi0.b.Companion.getClass();
            dVar4 = new dj0.d(0L, xi0.b.D);
        }
        this.o = mra.d.b(this, new c(dVar, dVar2, dVar3, dVar4), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
