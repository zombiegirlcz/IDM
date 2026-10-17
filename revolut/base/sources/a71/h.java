package a71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1738c;
    public final boolean d;
    public final boolean e;

    public h(String sortCode, String accountNumber, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f1736a = sortCode;
        this.f1737b = accountNumber;
        this.f1738c = z;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f1736a, hVar.f1736a) && Intrinsics.f(this.f1737b, hVar.f1737b) && this.f1738c == hVar.f1738c && this.d == hVar.d && this.e == hVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(p.a.c(this.f1736a.hashCode() * 31, 31, this.f1737b), 31, this.f1738c), 31, this.d);
    }
}
