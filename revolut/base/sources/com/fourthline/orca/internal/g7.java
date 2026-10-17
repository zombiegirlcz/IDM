package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g7 {
    public final rp0 a(u6 bavStatusWorker, sg0 tracker) {
        Intrinsics.checkNotNullParameter(bavStatusWorker, "bavStatusWorker");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new m90(bavStatusWorker, 0L, null, new k81(tracker), 6, null);
    }

    public final v3 b(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        return new j90(networkService);
    }

    public final g6 c(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        return new p90(networkService);
    }

    public final b7 d(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        return new r90(networkService);
    }

    public final u6 a(kh1 workflowStatusWorker) {
        Intrinsics.checkNotNullParameter(workflowStatusWorker, "workflowStatusWorker");
        return new q90(workflowStatusWorker);
    }

    public final z5 a(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        return new k90(networkService);
    }

    public final a6 a(z5 bavPaymentTransferStatusWorker, sg0 tracker) {
        Intrinsics.checkNotNullParameter(bavPaymentTransferStatusWorker, "bavPaymentTransferStatusWorker");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new l90(bavPaymentTransferStatusWorker, 0L, null, new k81(tracker), 6, null);
    }
}
