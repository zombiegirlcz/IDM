package pgi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235964a;

    public m(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f235964a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f235964a, ((m) obj2).f235964a);
    }

    public final int hashCode() {
        return this.f235964a.hashCode();
    }
}
