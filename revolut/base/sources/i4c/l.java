package i4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f158405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f158406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f158407c;
    public final f d;
    public final n e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f158408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f158409h;

    public l(d cancelledOrderMapper, r processingOrderMapper, h dispatchedOrderMapper, f deliveredOrderMapper, n paymentFailedOrderMapper, p pendingKYMOrderMapper, b availableKYMOrderMapper, t refundedOrderMapper) {
        Intrinsics.checkNotNullParameter(cancelledOrderMapper, "cancelledOrderMapper");
        Intrinsics.checkNotNullParameter(processingOrderMapper, "processingOrderMapper");
        Intrinsics.checkNotNullParameter(dispatchedOrderMapper, "dispatchedOrderMapper");
        Intrinsics.checkNotNullParameter(deliveredOrderMapper, "deliveredOrderMapper");
        Intrinsics.checkNotNullParameter(paymentFailedOrderMapper, "paymentFailedOrderMapper");
        Intrinsics.checkNotNullParameter(pendingKYMOrderMapper, "pendingKYMOrderMapper");
        Intrinsics.checkNotNullParameter(availableKYMOrderMapper, "availableKYMOrderMapper");
        Intrinsics.checkNotNullParameter(refundedOrderMapper, "refundedOrderMapper");
        this.f158405a = cancelledOrderMapper;
        this.f158406b = processingOrderMapper;
        this.f158407c = dispatchedOrderMapper;
        this.d = deliveredOrderMapper;
        this.e = paymentFailedOrderMapper;
        this.f = pendingKYMOrderMapper;
        this.f158408g = availableKYMOrderMapper;
        this.f158409h = refundedOrderMapper;
    }
}
