package h4d;

import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f149338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f149339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f149340c;

    public h(a dao, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f149338a = dao;
        this.f149339b = storage;
        this.f149340c = memoryCache;
    }
}
