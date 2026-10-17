package xu4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308957a;

    public d(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f308957a = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f308957a, ((d) obj2).f308957a);
    }

    public final int hashCode() {
        return this.f308957a.hashCode();
    }
}
