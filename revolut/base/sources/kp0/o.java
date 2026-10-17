package kp0;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f188048c;
    public final boolean d;

    public o(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f188046a = z;
        this.f188047b = z3;
        this.f188048c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f188046a == oVar.f188046a && this.f188047b == oVar.f188047b && this.f188048c == oVar.f188048c && this.d == oVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f188046a) * 31, 31, this.f188047b), 31, this.f188048c);
    }
}
