package kaf;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.TransferReviewSubmitContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends oki.h implements dli.b {
    public final TransferReviewSubmitContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f182488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o9f.c f182489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f182490r;

    public g(TransferReviewSubmitContract$InputData inputData, b stateMapper, o9f.c transferInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        this.o = inputData;
        this.f182488p = stateMapper;
        this.f182489q = transferInteractor;
        this.f182490r = mra.d.b(this, new a(inputData.f91605a, inputData.f91606b, inputData.f91607c, !r4.isEmpty(), false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f182490r;
    }
}
