package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f150171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150173c;
    public final String d;

    public y0(u materiality, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(materiality, "materiality");
        Intrinsics.checkNotNullParameter("RETAIL", "productType");
        this.f150171a = materiality;
        this.f150172b = str;
        this.f150173c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return this.f150171a == y0Var.f150171a && Intrinsics.f(this.f150172b, y0Var.f150172b) && Intrinsics.f(this.f150173c, y0Var.f150173c) && Intrinsics.f(this.d, y0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f150171a.hashCode() * 31;
        String str = this.f150172b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        int iHashCode3 = (((iHashCode2 + (this.f150173c == null ? 0 : r2.hashCode())) * 31) - 1881086717) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
