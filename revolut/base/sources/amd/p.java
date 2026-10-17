package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6341a;

    public p(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f6341a = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f6341a, ((p) obj2).f6341a);
    }

    public final int hashCode() {
        return this.f6341a.hashCode();
    }
}
