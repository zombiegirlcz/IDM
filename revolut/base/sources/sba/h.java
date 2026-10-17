package sba;

import cli.n;
import cli.y;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f261525p;

    public h(PixQrCodeChangeAmountScreenContract$InputData inputData, n stateMapper, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.o = amountFormatter;
        dj0.d dVar = inputData.f80705a;
        this.f261525p = mra.d.b(this, new d(dVar, dVar), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f261525p;
    }
}
