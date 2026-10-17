package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f306677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k61.a f306678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7k.a f306679c;

    public b(klf.h0 commonDataSource, k61.a transferInteractor, g7k.a paymentLinkListItemMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkListItemMapper, "paymentLinkListItemMapper");
        this.f306677a = commonDataSource;
        this.f306678b = transferInteractor;
        this.f306679c = paymentLinkListItemMapper;
    }
}
