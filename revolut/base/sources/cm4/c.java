package cm4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25121b;

    public c(String facilityId, String planId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f25120a = facilityId;
        this.f25121b = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f25120a, cVar.f25120a) && Intrinsics.f(this.f25121b, cVar.f25121b);
    }

    public final int hashCode() {
        return this.f25121b.hashCode() + (this.f25120a.hashCode() * 31);
    }
}
