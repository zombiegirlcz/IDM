package dej;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes11.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113627c;

    public q1(String esimProfileId, long j2, long j3) {
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        this.f113625a = esimProfileId;
        this.f113626b = j2;
        this.f113627c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f113625a, q1Var.f113625a) && kotlin.time.b.d(this.f113626b, q1Var.f113626b) && kotlin.time.b.d(this.f113627c, q1Var.f113627c);
    }

    public final int hashCode() {
        int iHashCode = this.f113625a.hashCode() * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f113627c) + a0.d.c(iHashCode, 31, this.f113626b);
    }
}
