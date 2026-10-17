package n7h;

import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f213093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f213094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f213095c;

    public b(d4m.a wealthMarginBorrowingService, j memoryCache, d4m.a storage) {
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingService, "wealthMarginBorrowingService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f213093a = wealthMarginBorrowingService;
        this.f213094b = memoryCache;
        this.f213095c = storage;
    }
}
