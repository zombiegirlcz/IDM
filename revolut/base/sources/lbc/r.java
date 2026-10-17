package lbc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193645a;

    public r(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f193645a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f193645a, ((r) obj2).f193645a);
    }

    public final int hashCode() {
        return this.f193645a.hashCode();
    }
}
