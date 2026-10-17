package no;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f217748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f217749b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f217750c = null;
    public Long d = null;

    public c2(long j2) {
        this.f217748a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return this.f217748a == c2Var.f217748a && Intrinsics.f(this.f217749b, c2Var.f217749b) && Intrinsics.f(this.f217750c, c2Var.f217750c) && Intrinsics.f(this.d, c2Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f217748a) * 31;
        Long l2 = this.f217749b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f217750c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        return iHashCode3 + (l4 != null ? l4.hashCode() : 0);
    }
}
