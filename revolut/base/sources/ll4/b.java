package ll4;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f196505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f196506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f196507c;
    public final long d;

    public b(double d, dj0.d earnedBalance, dj0.d collectionDueAmount, long j2) {
        Intrinsics.checkNotNullParameter(earnedBalance, "earnedBalance");
        Intrinsics.checkNotNullParameter(collectionDueAmount, "collectionDueAmount");
        this.f196505a = d;
        this.f196506b = earnedBalance;
        this.f196507c = collectionDueAmount;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Double.compare(this.f196505a, bVar.f196505a) == 0 && Intrinsics.f(this.f196506b, bVar.f196506b) && Intrinsics.f(this.f196507c, bVar.f196507c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + v7.c(v7.c(Double.hashCode(this.f196505a) * 31, 31, this.f196506b), 31, this.f196507c);
    }
}
