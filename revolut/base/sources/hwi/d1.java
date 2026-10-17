package hwi;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes10.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f156206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f156207c;

    public d1(String pollId, long j2, long j3) {
        Intrinsics.checkNotNullParameter(pollId, "pollId");
        this.f156205a = pollId;
        this.f156206b = j2;
        this.f156207c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f156205a, d1Var.f156205a) && kotlin.time.b.d(this.f156206b, d1Var.f156206b) && kotlin.time.b.d(this.f156207c, d1Var.f156207c);
    }

    public final int hashCode() {
        int iHashCode = this.f156205a.hashCode() * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f156207c) + a0.d.c(iHashCode, 31, this.f156206b);
    }
}
