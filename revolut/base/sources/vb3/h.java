package vb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287383a;

    public h(String locationId) {
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        this.f287383a = locationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f287383a, ((h) obj2).f287383a);
    }

    public final int hashCode() {
        return this.f287383a.hashCode();
    }
}
