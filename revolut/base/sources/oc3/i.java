package oc3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224068a;

    public i(String locationId) {
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        this.f224068a = locationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f224068a, ((i) obj2).f224068a);
    }

    public final int hashCode() {
        return this.f224068a.hashCode();
    }
}
