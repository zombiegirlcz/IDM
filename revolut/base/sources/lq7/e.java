package lq7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199193a;

    public e(String driverId) {
        Intrinsics.checkNotNullParameter(driverId, "driverId");
        this.f199193a = driverId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f199193a, ((e) obj2).f199193a);
    }

    public final int hashCode() {
        return this.f199193a.hashCode();
    }
}
