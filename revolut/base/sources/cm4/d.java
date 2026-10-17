package cm4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25123b;

    public d(String facilityId, String planId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f25122a = facilityId;
        this.f25123b = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f25122a, dVar.f25122a) && Intrinsics.f(this.f25123b, dVar.f25123b);
    }

    public final int hashCode() {
        return this.f25123b.hashCode() + (this.f25122a.hashCode() * 31);
    }
}
