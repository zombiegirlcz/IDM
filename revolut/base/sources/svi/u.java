package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265999b;

    public u(dj0.d refundAmount, String str) {
        Intrinsics.checkNotNullParameter(refundAmount, "refundAmount");
        this.f265998a = refundAmount;
        this.f265999b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f265998a, uVar.f265998a) && Intrinsics.f(this.f265999b, uVar.f265999b);
    }

    public final int hashCode() {
        int iHashCode = this.f265998a.hashCode() * 31;
        String str = this.f265999b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
