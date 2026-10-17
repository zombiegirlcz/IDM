package n7h;

import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f213098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f213099b;

    public e(d4m.a wealthMarginBorrowingService, j memoryCache) {
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingService, "wealthMarginBorrowingService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f213098a = wealthMarginBorrowingService;
        this.f213099b = memoryCache;
    }
}
