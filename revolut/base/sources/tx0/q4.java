package tx0;

/* JADX INFO: loaded from: classes20.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f275231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f275233c;
    public final boolean d;

    public q4(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f275231a = z;
        this.f275232b = z3;
        this.f275233c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return this.f275231a == q4Var.f275231a && this.f275232b == q4Var.f275232b && this.f275233c == q4Var.f275233c && this.d == q4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f275231a) * 31, 31, this.f275232b), 31, this.f275233c);
    }
}
