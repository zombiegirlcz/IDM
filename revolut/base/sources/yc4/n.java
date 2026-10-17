package yc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312525a;

    public n(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f312525a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f312525a, ((n) obj2).f312525a);
    }

    public final int hashCode() {
        return this.f312525a.hashCode();
    }
}
