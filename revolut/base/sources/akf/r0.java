package akf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnf.b f5889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.h1 f5890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elf.t0 f5891c;

    public r0(wnf.b commonTransactionContentMapper, klf.h1 juniorBlockInboundSenderDataSource, elf.t0 juniorBlockInboundTransferSenderClickHandler) {
        Intrinsics.checkNotNullParameter(commonTransactionContentMapper, "commonTransactionContentMapper");
        Intrinsics.checkNotNullParameter(juniorBlockInboundSenderDataSource, "juniorBlockInboundSenderDataSource");
        Intrinsics.checkNotNullParameter(juniorBlockInboundTransferSenderClickHandler, "juniorBlockInboundTransferSenderClickHandler");
        this.f5889a = commonTransactionContentMapper;
        this.f5890b = juniorBlockInboundSenderDataSource;
        this.f5891c = juniorBlockInboundTransferSenderClickHandler;
    }
}
