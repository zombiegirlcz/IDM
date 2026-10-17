package hk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f152841b;

    public b(Long l2, long j2) {
        this.f152840a = j2;
        this.f152841b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f152840a == bVar.f152840a && Intrinsics.f(this.f152841b, bVar.f152841b);
    }

    public final int hashCode() {
        long j2 = this.f152840a;
        int i = ((int) (j2 ^ (j2 >>> 32))) * 31;
        Long l2 = this.f152841b;
        return i + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "KronosTime(posixTimeMs=" + this.f152840a + ", timeSinceLastNtpSyncMs=" + this.f152841b + ")";
    }
}
