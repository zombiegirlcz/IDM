package ma1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements da1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha1.v f203899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ca1.a f203900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na1.h f203901c;

    public q(ha1.v rpcCommandsDataSource, ca1.a cardReaderRepository, na1.h terminalParamsUpdater) {
        Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        Intrinsics.checkNotNullParameter(terminalParamsUpdater, "terminalParamsUpdater");
        this.f203899a = rpcCommandsDataSource;
        this.f203900b = cardReaderRepository;
        this.f203901c = terminalParamsUpdater;
    }
}
