package m25;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw4.l f201703b;

    public i(String facilityId, yw4.l accessLevel) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(accessLevel, "accessLevel");
        this.f201702a = facilityId;
        this.f201703b = accessLevel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f201702a, iVar.f201702a) && this.f201703b == iVar.f201703b;
    }

    public final int hashCode() {
        return this.f201703b.hashCode() + (this.f201702a.hashCode() * 31);
    }
}
