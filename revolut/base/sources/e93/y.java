package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f123899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f123901c;
    public final Long d;

    public y(a0 type, boolean z, int i, Long l2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f123899a = type;
        this.f123900b = z;
        this.f123901c = i;
        this.d = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f123899a == yVar.f123899a && this.f123900b == yVar.f123900b && this.f123901c == yVar.f123901c && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f123901c, j6.a.c(this.f123899a.hashCode() * 31, 31, this.f123900b), 31);
        Long l2 = this.d;
        return iB + (l2 == null ? 0 : l2.hashCode());
    }
}
