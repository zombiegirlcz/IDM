package pq0;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f238669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f238670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f238671c;

    public p(boolean z, boolean z3, boolean z4) {
        this.f238669a = z;
        this.f238670b = z3;
        this.f238671c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f238669a == pVar.f238669a && this.f238670b == pVar.f238670b && this.f238671c == pVar.f238671c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238671c) + j6.a.c(Boolean.hashCode(this.f238669a) * 31, 31, this.f238670b);
    }
}
