package ma1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha1.c f203881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ca1.a f203882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa1.b f203883c;
    public final oa1.d d;

    public i(ha1.c cardReaderLogEventsRepository, ca1.a cardReaderRepository, oa1.b cardReaderSystemLogProvider, oa1.d youTransactorLogger) {
        Intrinsics.checkNotNullParameter(cardReaderLogEventsRepository, "cardReaderLogEventsRepository");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        Intrinsics.checkNotNullParameter(cardReaderSystemLogProvider, "cardReaderSystemLogProvider");
        Intrinsics.checkNotNullParameter(youTransactorLogger, "youTransactorLogger");
        this.f203881a = cardReaderLogEventsRepository;
        this.f203882b = cardReaderRepository;
        this.f203883c = cardReaderSystemLogProvider;
        this.d = youTransactorLogger;
    }
}
