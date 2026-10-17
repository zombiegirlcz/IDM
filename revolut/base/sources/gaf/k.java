package gaf;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.isa_transfer_review_submit.IsaTransferReviewSubmitScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends oki.h implements g {
    public final IsaTransferReviewSubmitScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o9f.c f142166p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f142167q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f142168r;

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    public k(cli.n stateMapper, IsaTransferReviewSubmitScreenContract$InputData inputData, o9f.c transferInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.o = inputData;
        this.f142166p = transferInteractor;
        this.f142167q = tradingConfigInteractor;
        this.f142168r = mra.d.b(this, new d(inputData.f91599a, inputData.f91600b, null, inputData.f91601c, inputData.d, inputData.e, inputData.f), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(com.revolut.data.database.models.openbanking.d.y("IsaTransferReviewSubmitScreenModel", "fetchIsaDocumentLink", rd0.e.b(ybl.l.c(this.f142167q, false, 3))), new g4k.e(this, 19)), null, null, new i(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f142168r;
    }
}
