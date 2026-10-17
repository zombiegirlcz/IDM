package k7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f181967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181968c;
    public final String d;

    public i0(String billCurrency, long j2, String str, String str2) {
        Intrinsics.checkNotNullParameter(billCurrency, "billCurrency");
        this.f181966a = billCurrency;
        this.f181967b = j2;
        this.f181968c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f181966a, i0Var.f181966a) && this.f181967b == i0Var.f181967b && Intrinsics.f(this.f181968c, i0Var.f181968c) && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f181966a.hashCode() * 31, 31, this.f181967b);
        String str = this.f181968c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
