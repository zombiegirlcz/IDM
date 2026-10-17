package f95;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f132831b;

    public d(String facilityId, e state) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f132830a = facilityId;
        this.f132831b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f132830a, dVar.f132830a) && this.f132831b == dVar.f132831b;
    }

    public final int hashCode() {
        return this.f132831b.hashCode() + (this.f132830a.hashCode() * 31);
    }
}
