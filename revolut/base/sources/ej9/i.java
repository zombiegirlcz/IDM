package ej9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126814b;

    public i(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f126813a = facilityId;
        this.f126814b = j6.a.q("RIGHT_TO_CANCEL_SUMMARY:", facilityId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f126813a, ((i) obj2).f126813a);
    }

    public final int hashCode() {
        return this.f126813a.hashCode();
    }
}
