package ju4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178580a;

    public d(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f178580a = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f178580a, ((d) obj2).f178580a);
    }

    public final int hashCode() {
        return this.f178580a.hashCode();
    }
}
