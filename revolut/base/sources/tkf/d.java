package tkf;

import kotlin.jvm.internal.Intrinsics;
import tof.s0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f271955b;

    public d(String transactionId, s0 feesCharges) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(feesCharges, "feesCharges");
        this.f271954a = transactionId;
        this.f271955b = feesCharges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f271954a, dVar.f271954a) && Intrinsics.f(this.f271955b, dVar.f271955b);
    }

    public final int hashCode() {
        return this.f271955b.hashCode() + (this.f271954a.hashCode() * 31);
    }
}
