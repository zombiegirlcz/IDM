package xmd;

import kotlin.time.b;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f307187a;

    public p(long j2) {
        this.f307187a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && kotlin.time.b.d(this.f307187a, ((p) obj2).f307187a);
    }

    public final int hashCode() {
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f307187a);
    }
}
