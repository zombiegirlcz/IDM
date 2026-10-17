package yj0;

import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mmm.g0;
import mmm.h0;
import okhttp3.Cache;
import ulm.p0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f314367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yk0.a f314368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile WeakReference f314369c;

    public j(File cacheDir, xj0.j factory, yk0.a keyProvider) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        this.f314367a = cacheDir;
        this.f314368b = keyProvider;
    }

    public final Cache a() {
        Cache cache;
        Cache cache2;
        WeakReference weakReference = this.f314369c;
        if (weakReference != null && (cache2 = (Cache) weakReference.get()) != null) {
            return cache2;
        }
        synchronized (this) {
            WeakReference weakReference2 = this.f314369c;
            if (weakReference2 != null && (cache = (Cache) weakReference2.get()) != null) {
                return cache;
            }
            Lazy keyLazy = yhm.j.b(new p0(this, 14));
            File dir = this.f314367a;
            k kVar = l.Companion;
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(keyLazy, "keyLazy");
            c cVar = new c(keyLazy);
            g0 g0Var = h0.Companion;
            String absolutePath = dir.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            Cache cache3 = new Cache(cVar, g0.c(g0Var, absolutePath), 5242880L);
            this.f314369c = new WeakReference(cache3);
            return cache3;
        }
    }
}
