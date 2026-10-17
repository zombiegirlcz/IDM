package c54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21416a;

    public f(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f21416a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f21416a, ((f) obj2).f21416a);
    }

    public final int hashCode() {
        return this.f21416a.hashCode();
    }
}
