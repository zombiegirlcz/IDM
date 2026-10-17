package vb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287386a;

    public k(String locationId) {
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        this.f287386a = locationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f287386a, ((k) obj2).f287386a);
    }

    public final int hashCode() {
        return this.f287386a.hashCode();
    }
}
