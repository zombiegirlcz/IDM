package qba;

import cli.y;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreenContract$InputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;
import pwb.p;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends oki.h implements j {
    public final wsg.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f244168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zof.f f244169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f244170r;

    public n(PixQrCodeTransactionAmountScreenContract$InputData inputData, wsg.n walletInteractor, w80.b amountFormatter, zof.f transferFeatureScreensProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = walletInteractor;
        this.f244168p = amountFormatter;
        this.f244169q = transferFeatureScreensProvider;
        dj0.d dVar = inputData.f80702a;
        String str = inputData.f80703b;
        String str2 = inputData.f80704c;
        io3.d.Companion.getClass();
        this.f244170r = mra.d.b(this, new h(dVar, str, str2, "", io3.d.f163144x, inputData.d, inputData.e, inputData.f, new TransferScheduleData(0L, (jli.c) null, 7)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new p(this, null, 26), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244170r;
    }
}
