package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f272758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f272759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f272760c;
    public final long d;

    public g1(Long l2, Long l3, Long l4, long j2) {
        this.f272758a = l2;
        this.f272759b = l3;
        this.f272760c = l4;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f272758a, g1Var.f272758a) && Intrinsics.f(this.f272759b, g1Var.f272759b) && Intrinsics.f(this.f272760c, g1Var.f272760c) && this.d == g1Var.d;
    }

    public final int hashCode() {
        Long l2 = this.f272758a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f272759b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f272760c;
        return Long.hashCode(this.d) + ((iHashCode2 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }
}
