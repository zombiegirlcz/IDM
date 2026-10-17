package hwi;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes10.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f156220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f156221c;

    public g1(String pollId, long j2, long j3) {
        Intrinsics.checkNotNullParameter(pollId, "pollId");
        this.f156219a = pollId;
        this.f156220b = j2;
        this.f156221c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f156219a, g1Var.f156219a) && kotlin.time.b.d(this.f156220b, g1Var.f156220b) && kotlin.time.b.d(this.f156221c, g1Var.f156221c);
    }

    public final int hashCode() {
        int iHashCode = this.f156219a.hashCode() * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f156221c) + a0.d.c(iHashCode, 31, this.f156220b);
    }
}
