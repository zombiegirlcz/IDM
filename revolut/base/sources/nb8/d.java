package nb8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214014b;

    public d(String registeredIdentityId, String guardianId) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(guardianId, "guardianId");
        this.f214013a = registeredIdentityId;
        this.f214014b = guardianId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f214013a, dVar.f214013a) && Intrinsics.f(this.f214014b, dVar.f214014b);
    }

    public final int hashCode() {
        return this.f214014b.hashCode() + (this.f214013a.hashCode() * 31);
    }
}
