package bl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16465a;

    public b(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f16465a = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f16465a, ((b) obj2).f16465a);
    }

    public final int hashCode() {
        return this.f16465a.hashCode();
    }
}
