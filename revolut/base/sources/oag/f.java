package oag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffi.c f223620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f223622c;

    public f(ffi.c hotelsRecentLocationSearch, int i, long j2) {
        Intrinsics.checkNotNullParameter(hotelsRecentLocationSearch, "hotelsRecentLocationSearch");
        this.f223620a = hotelsRecentLocationSearch;
        this.f223621b = i;
        this.f223622c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f223620a, fVar.f223620a) && this.f223621b == fVar.f223621b && this.f223622c == fVar.f223622c;
    }

    @Override // oag.h
    public final long getTimestamp() {
        return this.f223622c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f223622c) + j6.a.b(this.f223621b, this.f223620a.hashCode() * 31, 31);
    }
}
