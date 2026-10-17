package vw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f292601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f292602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f292603c;

    public k(long j2, long j3, Long l2) {
        this.f292601a = j2;
        this.f292602b = l2;
        this.f292603c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f292601a == kVar.f292601a && Intrinsics.f(this.f292602b, kVar.f292602b) && this.f292603c == kVar.f292603c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f292601a) * 31;
        Long l2 = this.f292602b;
        return Long.hashCode(this.f292603c) + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}
