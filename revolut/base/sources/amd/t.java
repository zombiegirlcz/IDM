package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6347a;

    public t(String collateralPocketId) {
        Intrinsics.checkNotNullParameter(collateralPocketId, "collateralPocketId");
        this.f6347a = collateralPocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f6347a, ((t) obj2).f6347a);
    }

    public final int hashCode() {
        return this.f6347a.hashCode();
    }
}
