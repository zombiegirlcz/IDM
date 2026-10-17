package k7c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f181950a;

    public d0(ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f181950a = memoryCache;
    }

    public final void a(String paymentToken) {
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        ne0.j jVar = this.f181950a;
        jVar.f("PENDING_PAYMENT_TOKEN_MEMORY_CACHE_ID", paymentToken);
        jVar.f("PENDING_PAYMENT_TOKEN_EXISTS_MEMORY_CACHE_ID", Boolean.TRUE);
    }
}
