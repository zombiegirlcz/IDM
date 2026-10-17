package rr4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f256684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f256685b;

    public g(boolean z, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f256684a = z;
        this.f256685b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f256684a == gVar.f256684a && Intrinsics.f(this.f256685b, gVar.f256685b);
    }

    public final int hashCode() {
        return this.f256685b.hashCode() + (Boolean.hashCode(this.f256684a) * 31);
    }
}
