package whh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f297671b;

    public p(String str, String str2) {
        this.f297670a = str;
        this.f297671b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f297670a, pVar.f297670a) && Intrinsics.f(this.f297671b, pVar.f297671b);
    }

    @Override // whh.r
    public final String getAccountId() {
        return this.f297670a;
    }

    public final int hashCode() {
        String str = this.f297670a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f297671b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
