package n8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213443a;

    public l(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f213443a = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f213443a, ((l) obj2).f213443a);
    }

    public final int hashCode() {
        return this.f213443a.hashCode();
    }
}
