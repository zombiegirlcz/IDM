package akf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5821a;

    public c0(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f5821a = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f5821a, ((c0) obj2).f5821a);
    }

    public final int hashCode() {
        return this.f5821a.hashCode();
    }
}
