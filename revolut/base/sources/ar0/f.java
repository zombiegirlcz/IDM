package ar0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8490c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public f(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f8488a = z;
        this.f8489b = z3;
        this.f8490c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f8488a == fVar.f8488a && this.f8489b == fVar.f8489b && this.f8490c == fVar.f8490c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f8488a) * 31, 31, this.f8489b), 31, this.f8490c), 31, this.d), 31, this.e);
    }
}
