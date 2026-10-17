package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class hc implements q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272791b;

    public hc(String walletId, String str) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f272790a = walletId;
        this.f272791b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj2;
        return Intrinsics.f(this.f272790a, hcVar.f272790a) && Intrinsics.f(this.f272791b, hcVar.f272791b);
    }

    @Override // tof.q6
    public final String getPocketId() {
        return this.f272791b;
    }

    public final int hashCode() {
        int iHashCode = this.f272790a.hashCode() * 31;
        String str = this.f272791b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // tof.q6
    public final String o1() {
        return this.f272790a;
    }
}
