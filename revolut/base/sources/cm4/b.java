package cm4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25119b;

    public b(String facilityId, String planId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f25118a = facilityId;
        this.f25119b = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f25118a, bVar.f25118a) && Intrinsics.f(this.f25119b, bVar.f25119b);
    }

    public final int hashCode() {
        return this.f25119b.hashCode() + (this.f25118a.hashCode() * 31);
    }
}
