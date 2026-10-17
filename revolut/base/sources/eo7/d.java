package eo7;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f127871a;

    public d(c driverType) {
        Intrinsics.checkNotNullParameter(driverType, "driverType");
        this.f127871a = driverType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f127871a == ((d) obj2).f127871a;
    }

    public final int hashCode() {
        return this.f127871a.hashCode();
    }
}
