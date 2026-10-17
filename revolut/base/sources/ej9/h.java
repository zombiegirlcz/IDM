package ej9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126812b;

    public h(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f126811a = facilityId;
        this.f126812b = j6.a.q("RIGHT_TO_CANCEL_INTRO:", facilityId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f126811a, ((h) obj2).f126811a);
    }

    public final int hashCode() {
        return this.f126811a.hashCode();
    }
}
