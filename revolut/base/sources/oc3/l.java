package oc3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224071a;

    public l(String locationId) {
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        this.f224071a = locationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f224071a, ((l) obj2).f224071a);
    }

    public final int hashCode() {
        return this.f224071a.hashCode();
    }
}
