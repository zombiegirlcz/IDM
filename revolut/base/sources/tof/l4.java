package tof;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f272908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f272909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f272910c;

    public l4(Instant until, dj0.d maxAmount, boolean z) {
        Intrinsics.checkNotNullParameter(until, "until");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        this.f272908a = until;
        this.f272909b = maxAmount;
        this.f272910c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj2;
        return Intrinsics.f(this.f272908a, l4Var.f272908a) && Intrinsics.f(this.f272909b, l4Var.f272909b) && this.f272910c == l4Var.f272910c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272910c) + ip0.v7.c(this.f272908a.hashCode() * 31, 31, this.f272909b);
    }
}
