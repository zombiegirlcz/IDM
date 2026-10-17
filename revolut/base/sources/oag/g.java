package oag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dgi.d f223623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f223625c;

    public g(dgi.d hotelsRecentPropertySearch, int i, long j2) {
        Intrinsics.checkNotNullParameter(hotelsRecentPropertySearch, "hotelsRecentPropertySearch");
        this.f223623a = hotelsRecentPropertySearch;
        this.f223624b = i;
        this.f223625c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f223623a, gVar.f223623a) && this.f223624b == gVar.f223624b && this.f223625c == gVar.f223625c;
    }

    @Override // oag.h
    public final long getTimestamp() {
        return this.f223625c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f223625c) + j6.a.b(this.f223624b, this.f223623a.hashCode() * 31, 31);
    }
}
