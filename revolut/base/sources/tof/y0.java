package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273172b;

    public y0(String str, String str2) {
        this.f273171a = str;
        this.f273172b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f273171a, y0Var.f273171a) && Intrinsics.f(this.f273172b, y0Var.f273172b);
    }

    public final int hashCode() {
        String str = this.f273171a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273172b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
