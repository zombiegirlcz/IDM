package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273051b;

    public t() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f273050a, tVar.f273050a) && Intrinsics.f(this.f273051b, tVar.f273051b);
    }

    @Override // tof.q6
    public final String getPocketId() {
        return this.f273051b;
    }

    public final int hashCode() {
        int iHashCode = this.f273050a.hashCode() * 31;
        String str = this.f273051b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // tof.q6
    public final String o1() {
        return this.f273050a;
    }

    public t(String str, int i) {
        str = (i & 2) != 0 ? null : str;
        Intrinsics.checkNotNullParameter("", "walletId");
        this.f273050a = "";
        this.f273051b = str;
    }
}
