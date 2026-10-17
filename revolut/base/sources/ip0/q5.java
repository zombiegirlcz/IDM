package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165920c;

    public q5(boolean z, boolean z3, boolean z4) {
        this.f165918a = z;
        this.f165919b = z3;
        this.f165920c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj2;
        return this.f165918a == q5Var.f165918a && this.f165919b == q5Var.f165919b && this.f165920c == q5Var.f165920c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165920c) + j6.a.c(Boolean.hashCode(this.f165918a) * 31, 31, this.f165919b);
    }
}
