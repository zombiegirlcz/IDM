package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f216014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f216015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f216016c;
    public final long d;

    public q2(Long l2, Long l3, Long l4, long j2) {
        this.f216014a = l2;
        this.f216015b = l3;
        this.f216016c = l4;
        this.d = j2;
    }

    public final Long a() {
        return this.f216014a;
    }

    public final Long b() {
        return this.f216016c;
    }

    public final Long c() {
        return this.f216015b;
    }

    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.f216014a, q2Var.f216014a) && Intrinsics.f(this.f216015b, q2Var.f216015b) && Intrinsics.f(this.f216016c, q2Var.f216016c) && this.d == q2Var.d;
    }

    public final int hashCode() {
        Long l2 = this.f216014a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f216015b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f216016c;
        return Long.hashCode(this.d) + ((iHashCode2 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }
}
