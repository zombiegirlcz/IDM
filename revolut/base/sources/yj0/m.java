package yj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f314372b;

    public m(String url2, String[] dependOnUrlPaths) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(dependOnUrlPaths, "dependOnUrlPaths");
        this.f314371a = url2;
        this.f314372b = dependOnUrlPaths;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!m.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.network.okhttp.cache.UrlDependencyRule");
        return Intrinsics.f(this.f314371a, ((m) obj2).f314371a);
    }

    public final int hashCode() {
        return this.f314371a.hashCode();
    }
}
