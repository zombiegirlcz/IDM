package xx4;

import kotlin.jvm.internal.Intrinsics;
import ne0.j;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f309396a;

    public d(j memoryCache) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f309396a = memoryCache;
    }

    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f309396a.get(key.getKey());
    }

    public final void b(b key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f309396a.f(key.getKey(), value);
    }
}
