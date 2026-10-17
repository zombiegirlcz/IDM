package dv9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f118066c;

    public g(String reaction, String authorCode, long j2) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(authorCode, "authorCode");
        this.f118064a = reaction;
        this.f118065b = authorCode;
        this.f118066c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f118064a, gVar.f118064a) && Intrinsics.f(this.f118065b, gVar.f118065b) && this.f118066c == gVar.f118066c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f118066c) + p.a.c(this.f118064a.hashCode() * 31, 31, this.f118065b);
    }
}
