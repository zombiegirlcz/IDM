package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f111033a;

    public i0(Long l2) {
        this.f111033a = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f111033a, ((i0) obj2).f111033a);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(30) * 31;
        Long l2 = this.f111033a;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
