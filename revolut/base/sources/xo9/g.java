package xo9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307745a;

    public g(String uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f307745a = uri2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f307745a, ((g) obj2).f307745a);
    }

    public final int hashCode() {
        return this.f307745a.hashCode();
    }
}
