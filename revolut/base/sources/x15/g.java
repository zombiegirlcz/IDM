package x15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302273b;

    public g(String facilityId, String pocketId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f302272a = facilityId;
        this.f302273b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f302272a, gVar.f302272a) && Intrinsics.f(this.f302273b, gVar.f302273b);
    }

    public final int hashCode() {
        return this.f302273b.hashCode() + (this.f302272a.hashCode() * 31);
    }
}
