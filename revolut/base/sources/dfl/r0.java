package dfl;

import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f114450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f114452c;
    public final Instant d;

    public r0(List transactions, int i, Boolean bool, Instant instant) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f114450a = transactions;
        this.f114451b = i;
        this.f114452c = bool;
        this.d = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f114450a, r0Var.f114450a) && this.f114451b == r0Var.f114451b && Intrinsics.f(this.f114452c, r0Var.f114452c) && Intrinsics.f(this.d, r0Var.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f114451b, this.f114450a.hashCode() * 31, 31);
        Boolean bool = this.f114452c;
        int iHashCode = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        Instant instant = this.d;
        return iHashCode + (instant != null ? instant.hashCode() : 0);
    }
}
