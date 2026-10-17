package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165669c;
    public final boolean d;
    public final boolean e;

    public oi(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f165667a = z;
        this.f165668b = z3;
        this.f165669c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj2;
        return this.f165667a == oiVar.f165667a && this.f165668b == oiVar.f165668b && this.f165669c == oiVar.f165669c && this.d == oiVar.d && this.e == oiVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165667a) * 31, 31, this.f165668b), 31, this.f165669c), 31, this.d);
    }
}
