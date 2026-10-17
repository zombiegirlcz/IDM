package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113191a;

    public o(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f113191a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f113191a, ((o) obj2).f113191a);
    }

    public final int hashCode() {
        return this.f113191a.hashCode();
    }
}
