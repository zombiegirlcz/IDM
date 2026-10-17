package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnf.b f184768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.h1 f184769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elf.t0 f184770c;

    public j2(wnf.b commonTransactionContentMapper, klf.h1 juniorBlockInboundSenderDataSource, elf.t0 juniorBlockInboundTransferSenderClickHandler) {
        Intrinsics.checkNotNullParameter(commonTransactionContentMapper, "commonTransactionContentMapper");
        Intrinsics.checkNotNullParameter(juniorBlockInboundSenderDataSource, "juniorBlockInboundSenderDataSource");
        Intrinsics.checkNotNullParameter(juniorBlockInboundTransferSenderClickHandler, "juniorBlockInboundTransferSenderClickHandler");
        this.f184768a = commonTransactionContentMapper;
        this.f184769b = juniorBlockInboundSenderDataSource;
        this.f184770c = juniorBlockInboundTransferSenderClickHandler;
    }
}
