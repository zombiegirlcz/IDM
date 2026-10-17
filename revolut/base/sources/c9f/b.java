package c9f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f22368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f22369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f22370c;

    public b(d4m.a service, d4m.a memoryCache, d4m.a storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f22368a = service;
        this.f22369b = memoryCache;
        this.f22370c = storage;
    }

    public static String a(g gVar) {
        return "TRANSFER_BROKERS_LIST_" + gVar.f22378b + "_" + gVar.f22377a;
    }
}
