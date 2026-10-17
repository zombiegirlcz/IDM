package jel;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes12.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f173617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f173618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f173619c;
    public final y2 d;
    public final Instant e;
    public final int f;

    public z2(int i, int i2, int i3, y2 consensus, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(consensus, "consensus");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f173617a = i;
        this.f173618b = i2;
        this.f173619c = i3;
        this.d = consensus;
        this.e = updatedAt;
        this.f = i + i2 + i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return this.f173617a == z2Var.f173617a && this.f173618b == z2Var.f173618b && this.f173619c == z2Var.f173619c && this.d == z2Var.d && Intrinsics.f(this.e, z2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.b(this.f173619c, j6.a.b(this.f173618b, Integer.hashCode(this.f173617a) * 31, 31), 31)) * 31);
    }
}
