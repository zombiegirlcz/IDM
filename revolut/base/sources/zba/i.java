package zba;

import cli.y;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f320862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f320863q;

    public i(cli.n stateMapper, PixQrRequestAddAmountScreenContract$InputData inputData, w80.b amountFormatter, n walletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = amountFormatter;
        this.f320862p = walletInteractor;
        dj0.d dVar = inputData.f80723a;
        if (dVar == null) {
            dj0.d.Companion.getClass();
            dVar = dj0.d.e;
        }
        xi0.b.Companion.getClass();
        dj0.d dVar2 = new dj0.d(0L, xi0.b.D);
        String str = inputData.f80724b;
        this.f320863q = mra.d.b(this, new f(dVar, dVar2, str == null ? "" : str), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new yzb.c(this, null, 8), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f320863q;
    }
}
