package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6357b;

    public z(int i, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f6356a = i;
        this.f6357b = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f6356a == zVar.f6356a && Intrinsics.f(this.f6357b, zVar.f6357b);
    }

    public final int hashCode() {
        return this.f6357b.hashCode() + (Integer.hashCode(this.f6356a) * 31);
    }
}
