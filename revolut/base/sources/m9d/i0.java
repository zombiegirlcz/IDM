package m9d;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f203710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f203712c;
    public final boolean d;

    public i0() {
        this(true, true, true, true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.f203710a == i0Var.f203710a && this.f203711b == i0Var.f203711b && this.f203712c == i0Var.f203712c && this.d == i0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f203710a) * 31, 31, this.f203711b), 31, this.f203712c);
    }

    public i0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f203710a = z;
        this.f203711b = z3;
        this.f203712c = z4;
        this.d = z6;
    }
}
