package rnf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255683a;

    public n(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f255683a = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f255683a, ((n) obj2).f255683a);
    }

    public final int hashCode() {
        return this.f255683a.hashCode();
    }
}
