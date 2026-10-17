package lha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f195226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.o f195227b;

    public q(long j2, hha.o charge) {
        Intrinsics.checkNotNullParameter(charge, "charge");
        this.f195226a = j2;
        this.f195227b = charge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f195226a == qVar.f195226a && Intrinsics.f(this.f195227b, qVar.f195227b);
    }

    public final int hashCode() {
        return this.f195227b.hashCode() + (Long.hashCode(this.f195226a) * 31);
    }
}
