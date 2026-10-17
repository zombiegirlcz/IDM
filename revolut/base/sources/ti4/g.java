package ti4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271418a;

    public g(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f271418a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f271418a, ((g) obj2).f271418a);
    }

    public final int hashCode() {
        return this.f271418a.hashCode();
    }
}
