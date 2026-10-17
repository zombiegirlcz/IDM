package c9f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f22374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f22375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f22376c;

    public f(d4m.a service, d4m.a memoryCache, d4m.a transferInstrumentsDao) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(transferInstrumentsDao, "transferInstrumentsDao");
        this.f22374a = service;
        this.f22375b = memoryCache;
        this.f22376c = transferInstrumentsDao;
    }
}
