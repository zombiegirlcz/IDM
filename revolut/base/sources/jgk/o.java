package jgk;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f174083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f174084b;

    public o(int i, Instant startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f174083a = startDate;
        this.f174084b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f174083a, oVar.f174083a) && this.f174084b == oVar.f174084b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174084b) + (this.f174083a.hashCode() * 31);
    }
}
